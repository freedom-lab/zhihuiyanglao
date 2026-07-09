<template>
  <div class="allbed-page" style="">
    <!-- 顶部头部：位置切换 + 新增 + 搜索 -->
    <div ref="search_d" style="margin-bottom:6px;">
      <el-row type="flex" align="middle" justify="space-between">
        <el-col :span="18">
          <!-- 当前位置 + 切换弹窗 -->
          <div style="display:flex;align-items:center;gap:12px;">
            <span style="color:#fff;font-size:16px;">当前位置:{{ currentBuilding }}-{{ currentFloor }}</span>
            <el-button size="mini" @click="openSwitchDialog">切换</el-button>
          </div>
        </el-col>
        <el-col :span="6" style="display:flex;gap:12px;align-items:center;justify-content:flex-end;">
          <!-- <el-button type="primary" @click="newBtn">新建床位</el-button>
          <el-input placeholder="搜索床位/老人姓名" v-model="queryInfo.condition.queryKey" clearable style="width:260px;">
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input> -->
        </el-col>
      </el-row>
    </div>

    <!-- 床位卡片网格区域 -->
    <div v-loading="loading" style="flex:1;overflow-y:auto;padding-bottom:16px;">
      <div class="bed-grid">
        <!-- 循环渲染床位卡片 tableData-->
        <div class="bed-card" v-for="item in displayBedList" :key="item.id" @click="openBedDetail(item)">
          <!-- 床位标题栏：房号，区分边框色 -->
          <div 
            class="card-header" 
            :class="item.bedState == 1 ? 'free-header' : 'occupy-header'"
          >
            <i class="el-icon-s-home"></i>
            <span>{{ item.roomName }}-{{ item.bedName }}</span>
          </div>

          <!-- 空闲床位内容 -->
          <div v-if="item.bedState == 1" class="card-body free-body">
            <span class="free-text">空闲</span>
          </div>

          <!-- 已入住床位内容 -->
          <div v-else class="card-body occupy-body">
            <div class="user-top">
              <div class="avatar">👴</div>
              <div class="user-info">
                <div class="name-row">
                  <span class="elder-name">{{ item.elderName }}</span>
                  <span class="tag-occupy">入住</span>
                </div>
                <div class="age-sex">{{ item.sex | sexFormat }} {{ item.age }}岁</div>
              </div>
            </div>
            <div class="tag-row">
              <el-tag size="mini">{{ item.bedType || bedTypeFormat }}</el-tag>
              <el-tag size="mini" type="warning">{{ item.nursingLevelName }}</el-tag>
            </div>
            <!-- <div class="tip-row">
              <i class="el-icon-warning-outline"></i>
              <span>禁忌事项: {{ item.taboo || '无' }}</span>
            </div> -->
            <div class="time-row">
              <i class="el-icon-date"></i>
              <span>入住时间: {{ item.checkDate }}</span>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- 分页 -->
    <div class="block" style="margin-top:5px;">
      <el-pagination 
        @size-change="handleSizeChange" 
        @current-change="handleCurrentChange"
        :current-page="queryInfo.currPage" 
        :page-sizes="[100, 200, 300, 400]" 
        :page-size="queryInfo.pageSize"
        layout="total, sizes, prev, pager, next, jumper" 
        :total="total"
      ></el-pagination>
    </div>

    <!-- 新增/编辑床位弹窗（保留原有表单，修复表单prop绑定错误） -->
    <el-dialog :title="(labelType=='add'?'新增床位':'编辑床位')" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="10">
          <el-col :span="12">
            <el-form-item label="机构名称" prop="institutionName">
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位名称" prop="bedName">
              <el-input v-model="form.bedName" placeholder="如101-1"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位码" prop="bedCode">
              <el-input v-model="form.bedCode" placeholder="请输入床位编码"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位日价格" prop="bedDayPrice">
              <el-input v-model="form.bedDayPrice" placeholder="请输入日价格"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位月价格" prop="bedMonthPrice">
              <el-input v-model="form.bedMonthPrice" placeholder="请输入月价格"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="楼栋名称" prop="buildingName">
              <el-input v-model="form.buildingName" placeholder="如1号楼"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="楼层名称" prop="floorName">
              <el-input v-model="form.floorName" placeholder="如1F"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="房间名称" prop="roomName">
              <el-input v-model="form.roomName" placeholder="如101"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位类型" prop="bedType">
              <el-select v-model="form.bedType" placeholder="请选择床位类型">
                <el-option label="单人间" value="单人间"></el-option>
                <el-option label="双人间" value="双人间"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="床位状态" prop="bedState">
              <el-select v-model="form.bedState" placeholder="请选择状态">
                <el-option label="空闲" value="空闲"></el-option>
                <el-option label="入住" value="入住"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="排序号" prop="sortNum">
              <el-input v-model="form.sortNum" placeholder="数字"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="备注" prop="remark">
              <el-input v-model="form.remark" placeholder="备注信息"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="老人姓名" prop="elderName">
              <el-input v-model="form.elderName" placeholder="空闲床位留空"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="老人性别" prop="gender">
              <el-select v-model="form.gender" placeholder="空闲床位留空">
                <el-option label="男" value="男"></el-option>
                <el-option label="女" value="女"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="年龄" prop="age">
              <el-input v-model="form.age" placeholder="空闲床位留空"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="护理等级" prop="nursingLevelName">
              <el-select v-model="form.nursingLevelName" placeholder="空闲床位留空">
                <el-option label="自理" value="自理"></el-option>
                <el-option label="轻度" value="轻度"></el-option>
                <el-option label="中度" value="中度"></el-option>
                <el-option label="重度" value="重度"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="护理组" prop="nursingGroupName">
              <el-input v-model="form.nursingGroupName" placeholder="如护理一组"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="禁忌事项" prop="taboo">
              <el-input v-model="form.taboo" placeholder="无/过敏/基础病"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="入住日期" prop="checkDate">
              <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期"></el-date-picker>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定保存</el-button>
        <el-button v-if="labelType === 'edit'" size="small" type="danger" @click="handleDelte(form.id)">删除床位</el-button>
      </span>
    </el-dialog>

    <!-- 楼栋楼层切换弹窗 -->
    <el-dialog title="切换楼栋/楼层" :visible.sync="switchDialog" width="400px">
      <el-form label-width="100px">
        <el-form-item label="选择楼栋">
          <el-select v-model="tempBuilding" placeholder="请选择楼栋">
            <el-option v-for="item,index in buildingList" :key="index" :label="item.buildingName" :value="item.id"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="选择楼层">
          <el-select v-model="tempFloor" placeholder="请选择楼层">
            <el-option v-for="item,index in floorList" :key="index" :label="item.floorName" :value="item.id"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <span slot="footer">
        <el-button @click="switchDialog = false">取消</el-button>
        <el-button type="primary" @click="confirmSwitch">确定切换</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data () {
    return {
      labelType: 'add',
      rules: {
        bedName: [{ required: true, message: '请填写床位名称', trigger: 'blur' }],
        buildingName: [{ required: true, message: '请填写楼栋', trigger: 'blur' }],
        floorName: [{ required: true, message: '请填写楼层', trigger: 'blur' }],
        roomName: [{ required: true, message: '请填写房间号', trigger: 'blur' }],
        bedState: [{ required: true, message: '请选择床位状态', trigger: 'change' }]
      },
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {
          queryKey: '',
          buildingName: '1号楼',
          floorName: '1F'
        }
      },
      // 当前展示楼栋楼层
      currentBuilding: '',
      currentFloor: '',
      // 切换弹窗临时数据
      switchDialog: false,
      tempBuilding: '',
      tempFloor: '',
      form: {},
      showDialog: false,
      tableData: [],
      allTableData: [],
      userInfo: {},
      headerHeight: 0,
      loading:false,
      buildingList: [],
      // 左侧楼层数据
      floorList: [],
      curBuilding: {},// 当前楼栋信息
      curBuildingInfo: {}, // 当前楼栋详情
      curFloor: {},// 当前楼层信息
      floorIndex: -1,
      allBedList: [],//楼栋所有床位信息
    };
  },
  computed: {
    displayBedList(){
      return this.floorIndex < 0 ? this.allBedList : this.floorList[this.floorIndex]?.floorBedList
    },
  },
  filters: {
    sexFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '男';
        case 2:
        case '2':
          return '女';
      
        default:
          return val || '-';
      }
    },
    bedTypeFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '普通床位';
        case 2:
        case '2':
          return '护理床位';
        case 3:
        case '3':
          return '医疗床位';
      
        default:
          return val || '-';
      }
    },
  },
  created() {
    try{
      this.userInfo = JSON.parse(localStorage.getItem("userInfo"))?.userInfo
    }catch(e){}
    this.getInsBaseBuildingList()
    // this.getList()
  },

  mounted () {
    this.$nextTick(() => {
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight)
    })
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.getHeight)
  },
  methods: {
    // 窗口resize适配（卡片自适应）
    getHeight () {
      this.$nextTick(() => {})
    },
    // 获取当前楼层
    tipclass(status) {
      switch (status) {
        case 1:
        case '1':
          return 'bg-warning';
        case 2:
        case '2':
          return 'bg-blue';
        case 3:
        case '3':
          return 'bg-sussess';
        case 4:
        case '4':
          return 'bg-yellowgreen';
        case 5:
        case '5':
          return 'bg-purple';
      
        default:
          return 'bg-info';
      }
    },
    async getInsBaseBuildingList() {
      const params = {
        // id: this.productInfo.id
      }
      const res = await this.$http.post('/insBaseBuildingInfo/queryList', params)
      if (res.data.code == 200) {
        this.buildingList = res.data.data
        this.curBuilding = this.buildingList[0]
        this.currentBuilding = this.curBuilding.buildingName
        this.getInsBaseBuildingDetail()
      } else {
        this.$message(res.data.message || '有错误')
      }
    },
    changeBuilding(row){
      this.curBuilding = row
      this.getInsBaseBuildingDetail()
    },
    async getInsBaseBuildingDetail() {
      this.loading = true
      this.floorIndex = -1
      const params = {
        id: this.curBuilding.id,
        isShowFree: this.switchVal?'0':'1',
      }
      const res = await this.$http.post('/insBaseBuildingInfo/queryBuildingDetails', params)
      this.loading = false
      if (res.data.code == 200) {
        this.tableData = []
        this.allTableData = []
        this.allBedList = []
        this.curBuildingInfo = res.data.data
        this.floorList = res.data.data.floorInfoList.map(item=>{
          let floorBedList = []
          item.roomInfoList = item.roomInfoList.map(roomitem=>{
            roomitem.bedCount = roomitem.insBaseBedInfo?.length || 0
            floorBedList.push(...roomitem.insBaseBedInfo)
            this.allBedList.push(...roomitem.insBaseBedInfo)
            return roomitem
          })
          this.allTableData.push(...item.roomInfoList)
          item.floorBedList = floorBedList
          item.floorDesc = `${item.floorName}（空闲：${item.freeBedCount}）`
          return item
        }) || []
        // this.curFloorBedList = this.floorList[0]?.floorBedList || []
        console.log('lou楼层床位：', this.displayBedList, this.allBedList, this.floorList, this.allTableData)
      } else {
        this.$message(res.data.message || '有错误')
      }
    },

    //打开切换弹窗
    openSwitchDialog() {
      this.tempBuilding = JSON.parse(JSON.stringify(this.curBuilding.id))
      this.tempFloor = this.curFloor.id ? JSON.parse(JSON.stringify(this.curFloor.id)) : null
      this.switchDialog = true
    },
    //确认切换楼层楼栋
    confirmSwitch() {
      this.curBuilding = this.buildingList.find(item => item.id == this.tempBuilding)
      this.floorIndex = this.floorList.findIndex(item => item.id == this.tempFloor)
      this.curFloor = this.floorIndex<0?{}:this.floorList[this.floorIndex]
      this.currentFloor = this.curFloor.name || ''
      this.switchDialog = false
      // this.currentBuilding = this.tempBuilding
      // this.currentFloor = this.tempFloor
      // this.queryInfo.condition.buildingName = this.currentBuilding
      // this.queryInfo.condition.floorName = this.currentFloor
      // this.switchDialog = false
      // this.getList()
    },

    // 点击床位卡片打开编辑弹窗
    openBedDetail(row) {
      return
      this.edit(row)
    },
    handlefloorClick(row, findex) {
      // console.log(tab, event);
      // this.search()
      this.curFloor = row
      this.tableData = row.roomInfoList
      this.floorIndex = this.floorIndex == findex ? -1 : findex
    },

    //获取床位列表
    getList () {
      const that = this;
      that.loading = true
      that.$http.post("/insBaseBedInfo/list", that.queryInfo).then(function (response) {
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      }).catch(() => {
        that.loading = false
      });
    },

    // 保存床位
    handleSave () {
      const that = this;
      this.$refs.form.validate((valid) => {
        if (!valid) return
        that.$http.post("/insBaseBedInfo/save", that.form).then(function (response) {
          if (response.data.code == 200) {
            that.$notify.success({ title: "提示", message: "保存成功", showClose: true });
            that.showDialog = false
            that.getList()
          }else{
            that.$notify.info({ title: "提示", message: response.data.message, showClose: true });
          }
        }).catch(() => {})
      })
    },

    //编辑床位赋值
    edit (row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
    },

    // 删除床位
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除该床位吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        const that = this;
        that.$http.post("/insBaseBedInfo/delete" ,{"id":id}).then(function (response) {
          if(response.data.code == 200){
            that.$notify.success({ title: "提示", message: "删除成功", showClose: true });
            that.showDialog = false
            that.getList();
          }else{
            that.$notify.info({ title: "提示", message: response.data.message, showClose: true });
          }
        });
      }
    },

    //新增床位
    newBtn () {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {
        // buildingName: this.currentBuilding,
        // floorName: this.currentFloor,
        // bedState: '空闲',
        // taboo: '无'
      }
    },

    //分页大小切换
    handleSizeChange (val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    //分页页码切换
    handleCurrentChange (val) {
      this.queryInfo.currPage = val;
      this.getList()
    },
  },
};
</script>

<style lang="scss" scoped>
// 全局深色背景适配原图深蓝色风格
:deep  .el-container, :deep  body, .decoration-page {
  background: #0f1733;
  color: #fff;
}
// :deep  .el-input__inner, :deep  .el-select-dropdown__item, :deep  .el-date-editor.el-input__inner {
//   background: #1e274d;
//   color: #fff;
//   border-color: #404e96;
// }
:deep  .el-pagination {
  color: #fff;
}
.allbed-page{
  padding:12px;
  height:90%;
  flex:1;
  box-sizing:border-box;
  display:flex;
  flex-direction:column;
}
// 床位网格布局
.bed-grid {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 16px;
}

/* 平板：小于1200px每行2个 */
@media (max-width: 1200px) {
  .bed-grid {
    grid-template-columns: repeat(3, 1fr);
  }
}

/* 手机：小于768px每行1个 */
@media (max-width: 768px) {
  .bed-grid {
    grid-template-columns: repeat(2, 1fr);
  }
}

// 床位卡片通用样式
.bed-card {
  border-radius: 8px;
  overflow: hidden;
  cursor: pointer;
  background: #101838;
  border: 1px solid #1b6bd4;
  transition: all 0.2s;
  &:hover {
    transform: translateY(-4px);
    box-shadow: 0 4px 12px rgba(60,150,255,0.3);
  }
}
.card-header {
  padding: 8px 14px;
  display: flex;
  align-items: center;
  gap: 8px;
  font-size: 16px;
  font-weight: bold;
  box-sizing: border-box;
}
// 空闲床位头部绿色
.free-header {
  background: #0e7d70;
  border-bottom: 2px solid #26c9b7;
}
// 入住床位头部蓝色
.occupy-header {
  background: #2056b8;
  border-bottom: 2px solid #4096ff;
}
.card-body {
  padding: 14px;
  min-height: 150px;
  box-sizing: border-box;
}
// 空闲卡片内容
.free-body {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 150px;
  .free-text {
    font-size: 24px;
    color: #26c9b7;
    font-weight: bold;
  }
}

// 入住卡片内容
.occupy-body {
  color: #fff;
  .user-top {
    display: flex;
    gap: 10px;
    align-items: flex-start;
    margin-bottom:10px;
    .avatar {
      width: 48px;
      height: 48px;
      border-radius: 50%;
      background: #fff;
      color: #333;
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: 24px;
    }
    .user-info {
      flex:1;
      .name-row {
        display: flex;
        align-items: center;
        gap: 8px;
        .elder-name {
          font-size:18px;
          font-weight:bold;
        }
        .tag-occupy {
          color: #4096ff;
        }
      }
      .age-sex {
        color: #c0c8e8;
        margin-top:4px;
      }
    }
  }
  .tag-row {
    display: flex;
    gap: 8px;
    margin: 10px 0;
  }
  .tip-row, .time-row {
    display: flex;
    align-items: center;
    gap: 6px;
    color: #c0c8e8;
    margin:6px 0;
    font-size:13px;
  }
}
/* 平板：小于1200px */
@media (max-width: 1200px) {
  .card-body {
    padding: 14px;
    min-height: 180px;
  }
  // 空闲卡片内容
  .free-body {
    min-height: 180px;
  }
}
</style>