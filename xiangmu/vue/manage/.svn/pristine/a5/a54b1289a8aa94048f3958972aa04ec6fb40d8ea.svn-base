<template>
  <div class="page-outer">
    <div class="page-container">
      <el-row>
        <el-col :span="6">
          <el-select v-model="stationform.stationCode" placeholder="请选择" @change="handleLSTChange" style="width: 100%">
            <el-option v-for="item,index in stationList" :key="index" :label="item.name" :value="item.code">
            </el-option>
          </el-select>
        </el-col>
      </el-row>
      <div class="stats-line">
        <div class="stats-item" v-for="item,index in statsList" :key="index">
          <div class="stats-item-label">{{item.label}}</div>
          （
          <div class="si-valueitem" v-for="ii,iindex in item.valueList" :key="iindex">
            <div class="si-value">{{ii.value}}</div>
            <div class="si-unit">{{ii.unit}}</div>
            <div v-if="iindex != (item.valueList.length-1)">,</div>
          </div>
          ）
        </div>
      </div>
      <div class="divide-line"></div>
      <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
        <el-tab-pane v-for="item,index in tabsList" :key="index" :label="item.label" :name="item.code">
        </el-tab-pane>
      </el-tabs>
      <!-- 头部部分 -->
      <div ref="search_d" class="page-header">
        <el-form :form="queryInfo.condition" label-width="90px" label-height="60px" class="responsive-form">
          <el-row :gutter="20">
            <el-col :span="4">
              <el-form-item label="姓名:" prop="trueName" style="width: 100%">
                <el-input v-model="queryInfo.condition.trueName" placeholder="请输入" clearable></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="4">
              <el-form-item label="是否可拼床:" prop="dd1" style="width: 100%">
                <el-select v-model="queryInfo.condition.dd1" placeholder="请选择" style="width: 100%">
                  <el-option v-for="item,index in ddList1" :key="index" :label="item.label" :value="item.value">
                  </el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="4">
              <el-form-item label="所属区域:" prop="dd2">
                <el-select v-model="queryInfo.condition.dd2" placeholder="请选择" style="width: 100%">
                  <el-option v-for="item,index in ddList2" :key="index" :label="item.label" :value="item.value">
                  </el-option>
                </el-select>
              </el-form-item>
            </el-col>
            
            <el-col :span="4">
              <el-form-item label="护理等级:" prop="dd3">
                <el-select v-model="queryInfo.condition.dd3" placeholder="请选择" style="width: 100%">
                  <el-option v-for="item,index in ddList3" :key="index" :label="item.label" :value="item.value">
                  </el-option>
                </el-select>
              </el-form-item>
            </el-col>

            <el-col :span="4">
              <el-form-item label-width="20px" class="flex justify-end btn-group">
                <el-button type="primary" @click="search" icon="el-icon-search">搜索</el-button>
                <el-button @click="reset" icon="el-icon-refresh-left">清空</el-button>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
      </div>

      <!-- 表格部分 -->
      <div class="container-cnt" v-loading="loading">
        <!-- <div class="btn-line">
          <el-button type="primary" @click="newBtn">新增</el-button>
        </div> -->
        <el-tabs v-model="activeName2" tab-position="left" @tab-click="handleClick2">
          <el-tab-pane v-for="item,index in tabsList" :key="index" :label="item.label" :name="item.code">
            <span slot="label"><i class="el-icon-office-building"></i> {{item.label}}</span>
            <el-row :gutter="20" class="building-class" :style="{'height': `${height}px`}">
              <el-col class="room-class" :span="12" v-for="fitem,iindex in tableData" :key="iindex">
                <fieldset>
                  <!-- 分组标题 -->
                  <legend>{{fitem.ip}}</legend>
                  <!-- 内部放 input/select/textarea/label 等表单元素 -->
                   <div class="room">
                    <div class="room-status" :class="fitem.status == '1'?'status-sussess':'status-warning'">空</div>
                    <div v-for="bed,bedindex in fitem.bedList" :key="bedindex" class="bed-box" @contextmenu.prevent="e=>rightClick(e,bed,bedindex)">
                      <div class="bed-name">{{bed.label}}</div>
                      <div class="bed-info" @dragstart.prevent>
                        <div class="bed-img">
                          <el-image :src="bedimg" :style="{ 'width': '100%', 'height': '100%' }" fit="scale-down"/>
                        </div>
                        <div class="bed-status" :class="bed.status === '1'?'status-warning':'status-sussess'">{{bed.status | bedstatus}}</div>
                      </div>
                    </div>
                  </div>
                </fieldset>
              </el-col>
            </el-row>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
    <!-- 自定义右键弹窗 fixed 跟随鼠标 -->
    <div 
      v-if="showMenu"
      class="context-menu"
      :style="{left: menuX + 'px', top: menuY + 'px'}"
      @click.stop
    >
      <div class="menu-item" @click="openBook">
        <div class="bed-img">
          <el-image :src="bedimg" :style="{ 'width': '100%', 'height': '100%' }" fit="scale-down"/>
        </div>
        <span>预定管理</span>
      </div>
    </div>
    
    <el-dialog :title="labelType=='add' ? '新增' : '编辑'" class="reservation-dialog" :visible.sync="showDialog" width="75%" top="15vh">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="20">
          <!-- 第一行 左 -->
          <el-col :span="12">
            <el-form-item label="老人姓名" prop="oldName">
              <el-input v-model="form.oldName" placeholder="请输入老人姓名" clearable></el-input>
            </el-form-item>
          </el-col>
          <!-- 第一行 右 -->
          <el-col :span="12">
            <el-form-item label="身份证号码" prop="idCard">
              <el-input v-model="form.idCard" placeholder="请输入身份证号码" clearable></el-input>
            </el-form-item>
          </el-col>

        </el-row>
        <el-row :gutter="20">
          <!-- 第二行 -->
          <el-col :span="12">
            <el-form-item label="性别" prop="gender">
              <el-select v-model="form.gender" placeholder="请选择性别" clearable style="width:100%">
                <el-option label="男" value="1"></el-option>
                <el-option label="女" value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="年龄" prop="age">
              <el-input-number v-model="form.age" placeholder="请输入年龄" :min="0" :max="150" style="width:100%"></el-input-number>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <!-- 第三行 -->
          <el-col :span="12">
            <el-form-item label="交款人">
              <el-input v-model="form.payUser" placeholder="请输入交款人" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="联系电话" prop="phone">
              <el-input v-model="form.phone" placeholder="请输入联系电话" clearable></el-input>
            </el-form-item>
          </el-col>

          <!-- 第四行 -->
          <el-col :span="12">
            <el-form-item label="固话">
              <el-input v-model="form.tel" placeholder="请输入固话" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家庭地址" prop="address">
              <el-input v-model="form.address" placeholder="请输入家庭地址" clearable></el-input>
            </el-form-item>
          </el-col>

          <!-- 第五行 -->
          <el-col :span="12">
            <el-form-item label="营销人员" prop="saleUser">
              <el-select v-model="form.saleUser" placeholder="请选择营销人员" clearable style="width:100%">
                <el-option label="营销A" value="A"></el-option>
                <el-option label="营销B" value="B"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="是否拼房" prop="isShare">
              <el-radio-group v-model="form.isShare">
                <el-radio label="是"></el-radio>
                <el-radio label="否"></el-radio>
              </el-radio-group>
            </el-form-item>
          </el-col>

        </el-row>
        <el-row :gutter="20">
          <!-- 第六行 -->
          <el-col :span="12">
            <el-form-item label="预订房号">
              <el-input v-model="form.roomNo" placeholder="请输入预订房号" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="预留到期时间" prop="endTime">
              <el-date-picker v-model="form.endTime" type="date" value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择预留到期时间" style="width:100%"></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 第七行 -->
          <el-col :span="12">
            <el-form-item label="定金金额(元)" prop="deposit">
              <el-input-number v-model="form.deposit" placeholder="请输入定金金额" :min="0" precision="2" style="width:100%"></el-input-number>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="收款时间" prop="payTime">
              <el-date-picker v-model="form.payTime" type="date" value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择收款时间" style="width:100%"></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 备注 通栏 -->
          <el-col :span="24">
            <el-form-item label="备注">
              <el-input v-model="form.remark" type="textarea" :rows="4" maxlength="200" show-word-limit placeholder="请输入备注"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" type="primary" icon="el-icon-circle-plus-outline" @click="handleSave">保存</el-button>
        <el-button size="small" icon="el-icon-circle-close" @click="showDialog = false">取消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      labelType: 'add',
      // 表单校验规则
      rules: {
        oldName: [
          { required: true, message: '请输入老人姓名', trigger: 'blur' },
          { min: 2, max: 20, message: '姓名长度2-20个字符', trigger: 'blur' }
        ],
        idCard: [
          { required: true, message: '请输入身份证号码', trigger: 'blur' },
          { pattern: /(^\d{18}$)|(^\d{17}(\d|X|x)$)/, message: '身份证格式不正确', trigger: 'blur' }
        ],
        gender: [
          { required: true, message: '请选择性别', trigger: 'change' }
        ],
        age: [
          { required: true, message: '请输入年龄', trigger: 'blur' }
        ],
        phone: [
          { required: true, message: '请输入联系电话', trigger: 'blur' },
          { pattern: /^1[3-9]\d{9}$/, message: '手机号格式错误', trigger: 'blur' }
        ],
        address: [
          { required: true, message: '请输入家庭地址', trigger: 'blur' }
        ],
        saleUser: [
          { required: true, message: '请选择营销人员', trigger: 'change' }
        ],
        isShare: [
          { required: true, message: '请选择是否拼房', trigger: 'change' }
        ],
        endTime: [
          { required: true, message: '请选择预留到期时间', trigger: 'change' }
        ],
        deposit: [
          { required: true, message: '请输入定金金额', trigger: 'blur' }
        ],
        payTime: [
          { required: true, message: '请选择收款时间', trigger: 'change' }
        ]
      },
      // 表单数据对象（完全匹配截图字段）
      form: {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: '',        // 绑定当前右键床位编码
        bedLabel: ''        // 绑定当前右键床位名称
      },
      total: 0,
      queryInfo: {
        pageSize: 20,
        pageCount: 1,
        currPage: 1,
        condition: {}
      },
      activeName: '1',
      activeName2: '1',
      stationList: [
        { code: '1', name: '杏林' },
        { code: '2', name: '云舒康养' },
        { code: '3', name: '杏林' },
        { code: '4', name: '杏林' },
      ],
      stationform: {
        stationCode: '',
      },
      statsList: [
        { label: '已满员房间', valueList: [{ value: '0', unit: '间' }] },
        { label: '空房', valueList: [{ value: '0', unit: '间' }, { value: '0', unit: '张床' }] },
        { label: '未满员房间', valueList: [{ value: '0', unit: '间' }, { value: '0', unit: '张床' }] },
        { label: '已入住、已预定、已签约未入住', valueList: [{ value: '0', unit: '张床' }] },
        { label: '空闲床位', valueList: [{ value: '0', unit: '张床' }] },
        { label: '今日入住', valueList: [{ value: '0', unit: '人' }] },
        { label: '今日退住', valueList: [{ value: '0', unit: '人' }] },
      ],
      tabsList: [
        { label: '1栋', code: '1' },
        { label: '2栋', code: '2' },
        { label: '3栋', code: '3' },
        { label: '4栋', code: '4' },
      ],
      ddList1: [
        { label: '是', value: '1' },
        { label: '否', value: '0' },
      ],
      ddList2: [
        { label: '北方', value: '1' },
        { label: '南方', value: '2' },
      ],
      ddList3: [
        { label: '二级护理', value: '1' },
        { label: '介护', value: '2' },
        { label: '送餐等服务', value: '3' },
        { label: '保洁', value: '4' },
        { label: '个人卫生', value: '5' },
        { label: '剪头发', value: '6' },
        { label: '一级护理', value: '7' },
      ],
      showDialog: false,
      tableData: [],
      multipleSelection: [],
      height: window.innerHeight - 276, //表格高度
      headerHeight: 0,
      loading: false,
      asideWidth: '230px',
      wariningDay: null,
      wariningDayData: {},
      bedimg: require('@/assets/images/bed.png'),
      showMenu: false,
      menuX: 0,
      menuY: 0,
      bed: {},
      bedindex: 0,
    };
  },
  filters: {
    bedstatus(val){
      switch (val) {
        case 0:
        case '0':
          return '已使用';
        case 1:
        case '1':
          return '空闲';
        case 2:
        case '2':
          return '已使用';
      
        default:
          return '';
      }
    },
  },

  created() {
    this.getList()
  },

  mounted() {
    // 全局点击空白关闭菜单
    document.addEventListener('click', this.closeMenu)
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },
  beforeDestroy() {
    document.removeEventListener('click', this.closeMenu)
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 289;
    },
    // 站点切换
    handleLSTChange(e){},
    handleClick(tab, event) {
      this.search()
    },
    handleClick2(tab, event) {
      this.search()
    },
    
    handleTimeChange(val){
      // console.log(val,'|',this.queryInfo.condition.contractTime)
      if(val.length>0){
        this.queryInfo.condition.startTime = val[0]
        this.queryInfo.condition.endTime = val[1]
      }else{
        this.queryInfo.condition.startTime = ''
        this.queryInfo.condition.endTime = ''
      }
    },
    // 右键事件
    rightClick(e,bed,bedindex) {
      this.showMenu = true
      // 鼠标坐标
      this.menuX = e.clientX
      this.menuY = e.clientY
      this.bed = bed
      this.bedindex = bedindex
      console.log('右键事件：',e,bed,bedindex)
    },
    // 空白处关闭
    closeMenu() {
      this.showMenu = false
    },
    // 点击预定管理
    openBook() {
      console.log('预定管理')
      this.showMenu = false
      this.labelType = 'add'
      // 重置表单+清除校验提示
      this.$nextTick(() => {
        this.$refs.form && this.$refs.form.resetFields()
      })
      this.form = {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: this.bed.code,    // 当前右键床位编码
        bedLabel: this.bed.label   // 当前右键床位名称（1床/2床）
      }
      this.showDialog = true;
    },
    // 预定管理
    handleBook(bed){
      console.log('预定管理',bed)
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      // this.queryInfo.condition.orderStatus = this.activeName == 0 ? '' : this.activeName
      try {
        that.$http.post("/loginLog/list", that.queryInfo).then( (response)=> {
          console.log(response.data.data);
          if (response.data.code == 200) {
            that.loading = false
            that.total = response.data.data.count;
            that.queryInfo.currPage = response.data.data.currPage
            that.tableData = response.data.data.data.map(item => {
              return {
                ...item,
                bedList: [
                  { label: '1床', code: '1', status: '1' },
                  { label: '2床', code: '2', status: '0' },
                  { label: '3床', code: '3', status: '0' },
                  { label: '4床', code: '4', status: '0' },
                ],
              }
            });
          }
        });
      } catch (error) {
        console.log(error)
        that.loading = false
      }
    },
    
    

    // 保存
    handleSave() {
      var that = this;
      that.$refs.form.validate((valid) => {
        if (!valid) return false; // 校验不通过阻止提交

        that.$http.post("/loginLog/save", that.form).then( (response)=> {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "保存成功",
              showClose: true,
            });
            that.showDialog = false
            that.getList()
          } else {
            that.$notify.info({
              title: "提示",
              message: response.data.message,
              showClose: true,
            });
          }
        }).catch(function (error) {
          console.log('保存失败', error)
        })
      })

    },

    //修改
    edit(row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
      // this.$router.push({
      //   path: '/serviceStationProduct/detail',
      //   query: {
      //     detailId: row.id,
      //     type: 'edit',
      //   },
      // })
    },

    // 删除用户
    async handleDelte(row) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        var that = this;
        that.$http.post("/loginLog/delete", { "id": row.id }).then(function (response) {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "删除成功",
              showClose: true,
            });
            that.getList();
          } else {
            that.$notify.info({
              title: "提示",
              message: response.data.message,
              showClose: true,
            });
          }

        });
      }
    },
    // 终止订单
    handleBanit(row){
      var that = this;
      // const _operationStatus = row.orderStatus == 1 ? 2 : 1
      // const operationStatusText = row.status == 1 ? '终止订单成功' : '终止订单取消'
      that.$http.post("/loginLog/update", {
        "id": row.id,
        orderStatus: '4',
        }).then( (response) => {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: '终止订单成功',
            showClose: true,
          });
          that.getList();
        } else {
          that.$notify.info({
            title: "提示",
            message: response.data.message,
            showClose: true,
          });
        }

      });
    },

    //新增按钮
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: '',        // 绑定当前右键床位编码
        bedLabel: ''        // 绑定当前右键床位名称
      }
    },
    handlerSelectionChange(val) {
      this.multipleSelection = val;
    },
    search() {
      this.queryInfo.currPage = 1
      this.getList()
    },
    reset() {
      this.queryInfo.condition = {}
      this.search()
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.search()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>

<style lang="scss" scoped>
.btn-line{
  margin-top: 10px;
  display: flex;
  align-items: center;
  gap: 10px;
  .line-label{
    width: 120px;
    flex-shrink: 0;
  }
}
.ljd_drawer{
}
.stats-line{
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 20px;
  padding: 10px 12px 12px;
  .stats-item{
    display: flex;
    align-items: center;
  }
  .si-valueitem{
    flex-shrink: 0;
    display: flex;
    align-items: center;
  }
}
.responsive-form{
  ::v-deep .el-form-item__label{
    font-weight: 600;
  }
}
.container-cnt{
  ::v-deep .el-tabs--left .el-tabs__header.is-left {
    width: 100px;
  }
  .building-class{
    overflow-y: auto;
    display: flex;
    flex-wrap: wrap;
    padding: 10px 20px;
    .room-class{
      padding: 10px;
      box-sizing: border-box;
    }
  }
  .room{
    position: relative;
    display: flex;
    flex-wrap: wrap;
    gap: 10px 20px;
    padding: 10px;
  }
  .room-status{
    font-size: 16px;
    color: #fff;
    width: 40px;
    height: 40px;
    line-height: 40px;
    border-radius: 50%;
    text-align: center;
    display: inline-block;
    position: absolute;
    top: -30px;
    right: -30px;
  }
  .bed-box{
    display: flex;
    flex-direction: column;
    width: calc((100% - 20px) / 2);
    padding: 5px;

    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    border-radius: 3px;
    height: 125px;
    min-width: 240px;

    background-color: #f0f9eb;
    border: 1px solid #c2e7b0;

    .bed-name{
      color: #FE5D55;
    }
    .bed-info{
      display: flex;
      align-items: center;
      gap: 10px;
    }
    .bed-img{
      width: 80px;
      height: 90px;
    }
    .bed-status{
      width: 150px;
      height: 22px;
      font-size: 13px;
      color: #fff;
      border-radius: 4px;
      display: flex;
      align-items: center;
      justify-content: center;
      background-color: #67C23A;
    }
  }
}

.status-sussess{
  background-color: #67c23a;
}
.status-warning{
  background-color: #e6a23c;
}
.status-danger{
  background-color: #f56c6c;
}
.status-info{
  background-color: #909399;
}

/* 右键菜单样式，和截图白色弹窗+阴影一致 */
.context-menu {
  position: fixed;
  z-index: 9999;
  background: #fff;
  padding: 12px 16px;
  border-radius: 8px;
  box-shadow: 0 3px 14px rgba(0,0,0,0.16);
}
.menu-item {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 15px;
  font-weight: 500;
  cursor: pointer;
  .bed-img{
    width: 20px;
    height: 30px;
  }
}
.reservation-dialog{
  ::v-deep .el-dialog__body{
    padding: 20px 30px;
    border-top: 1px solid #eee;
    border-bottom: 1px solid #eee;
  }
  ::v-deep .el-form-item__label{
    font-weight: 600;
  }
}
</style>