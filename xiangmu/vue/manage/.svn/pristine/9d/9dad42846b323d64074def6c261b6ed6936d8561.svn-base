<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">入住档案</span>
        </el-col>
        <el-col :span="10">
          <div class="top-right-sort">
            <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
              <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
            </el-input>
            <!-- <el-button type="primary" @click="newBtn">新建</el-button> -->
          </div>
        </el-col>
      </el-row>
    </div>

    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <!-- 核心基础信息 -->
        <el-table-column label="老人姓名" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="身份证号" align="center" min-width="180">
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="联系电话" align="center" min-width="120">
          <template slot-scope="scope">{{ scope.row.linkTel }}</template>
        </el-table-column>
        <el-table-column label="性别" align="center" min-width="60">
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="年龄" align="center" min-width="60">
          <template slot-scope="scope">{{ scope.row.age }}</template>
        </el-table-column>
        <!-- 申请日期 -->
        <el-table-column label="申请日期" align="center" min-width="110">
          <template slot-scope="scope">
            {{ scope.row.applyDate ? scope.row.applyDate.slice(0, 10) : '' }}
          </template>
        </el-table-column>
        
        <!-- 计划入住日期 -->
        <el-table-column label="计划入住日期" align="center" min-width="120">
          <template slot-scope="scope">
            {{ scope.row.planDate ? scope.row.planDate.slice(0, 10) : '' }}
          </template>
        </el-table-column>
        <!-- 实际入住日期 -->
        <el-table-column label="实际入住日期" align="center" min-width="120">
          <template slot-scope="scope">
            {{ scope.row.checkDate ? scope.row.checkDate.slice(0, 10) : '' }}
          </template>
        </el-table-column>
        <!-- 试住结束日期 -->
        <el-table-column label="试住结束日期" align="center" min-width="120">
          <template slot-scope="scope">
            {{ scope.row.tryingEndDate ? scope.row.tryingEndDate.slice(0, 10) : '' }}
          </template>
        </el-table-column>
        <el-table-column label="入住状态" align="center" min-width="90" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.checkState === 1 ? '未住' : scope.row.checkState === 2 ? '试住' : scope.row.checkState === 3 ? '入住' :
              scope.row.checkState === 4 ? '退住' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="入住档案号" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.checkCode }}</template>
        </el-table-column>
        <!-- 退住时间 -->
        <el-table-column label="退住时间" align="center" min-width="110">
          <template slot-scope="scope">
            {{ scope.row.retreatTime ? scope.row.retreatTime.slice(0, 10) : '' }}
          </template>
        </el-table-column>

        <!-- 楼栋房间床位 -->
        <el-table-column label="楼栋名称" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.buildingName }}</template>
        </el-table-column>
        <el-table-column label="楼层名称" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.floorName }}</template>
        </el-table-column>
        <el-table-column label="房间名称" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.roomName }}</template>
        </el-table-column>
        <el-table-column label="床位名称" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.bedName }}</template>
        </el-table-column>
        <el-table-column label="床位码" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.bedCode }}</template>
        </el-table-column>
        <el-table-column label="床位信息" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.bedInfo }}</template>
        </el-table-column>
        <el-table-column label="是否包房" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.isRoom === 1 ? '否' : '是' }}</template>
        </el-table-column>

        <!-- 护理相关 -->
        <el-table-column label="护理等级" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.nursingLevelName }}</template>
        </el-table-column>
        <el-table-column label="护理组" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.nursingGroupName }}</template>
        </el-table-column>
        <el-table-column label="护理人员" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.nursingStaffName }}</template>
        </el-table-column>

        <!-- 人员关系 & 身份 -->
        <el-table-column label="入住类型" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.checkType }}</template>
        </el-table-column>
        <el-table-column label="是否户主" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.isHousehold === 1 ? '是' : '否' }}</template>
        </el-table-column>
        <el-table-column label="户主是否在住" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.householdCheckState === 1 ? '是' : '否' }}</template>
        </el-table-column>
        <el-table-column label="户主关系" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.householdRelationship }}</template>
        </el-table-column>
        <el-table-column label="是否翻身护理" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.turnOverState === 1 ? '否' : '是' }}</template>
        </el-table-column>
        <el-table-column label="身份类别" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.elderCategory }}</template>
        </el-table-column>

        <!-- 渠道 & 打卡 -->
        <el-table-column label="媒介渠道" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.mediaChannels }}</template>
        </el-table-column>
        <el-table-column label="入院方式" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.admissionMethod }}</template>
        </el-table-column>
        <el-table-column label="打卡方式" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.signWay }}</template>
        </el-table-column>
        <el-table-column label="视频打卡" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.signIsVideo === 1 ? '是' : '否' }}</template>
        </el-table-column>

        <!-- 亲属 & 权益 & 其他 -->
        <el-table-column label="亲属名称" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.relativesName }}</template>
        </el-table-column>
        <el-table-column label="会员权益" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.benefitsName }}</template>
        </el-table-column>
        <el-table-column label="审核状态" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.totalAuditState }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" min-width="90">
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>
        <el-table-column label="状态" align="center" min-width="70">
          <template slot-scope="scope">{{ scope.row.status === 1 ? '启用' : '禁用' }}</template>
        </el-table-column>

        <!-- 操作列 -->
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">详情</el-button>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div class="block" style="margin-top: 10px;">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>详情</div>
          <div>
            <el-button size="small" @click="showDialog = false">返回</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px" disabled>
            <el-row :gutter="10">
              <!-- 老人基础信息 -->
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入身份证号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系电话" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="请输入联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别" prop="sex">
                  <el-input v-model="form.sex" placeholder="1-男，2-女"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="年龄" prop="age">
                  <el-input v-model="form.age" placeholder="请输入年龄"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="申请日期" prop="applyDate">
                  <el-input v-model="form.applyDate" placeholder="请选择申请日期"></el-input>
                </el-form-item>
              </el-col>

              <!-- 入住流程 -->
              <el-col :span="12">
                <el-form-item label="计划入住日期" prop="planDate">
                  <el-input v-model="form.planDate" placeholder="请选择计划入住日期"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="实际入住日期" prop="checkDate">
                  <el-input v-model="form.checkDate" placeholder="请选择实际入住日期"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="试住结束日期" prop="tryingEndDate">
                  <el-input v-model="form.tryingEndDate" placeholder="请选择试住结束日期"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住状态" prop="checkState">
                  <el-select v-model="form.checkState" placeholder="请选择入住状态" style="width:100%">
                    <el-option label="未住" :value="1"></el-option>
                    <el-option label="试住" :value="2"></el-option>
                    <el-option label="入住" :value="3"></el-option>
                    <el-option label="退住" :value="4"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住档案号" prop="checkCode">
                  <el-input v-model="form.checkCode" placeholder="请输入档案号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="退住时间" prop="retreatTime">
                  <el-input v-model="form.retreatTime" placeholder="请选择退住时间"></el-input>
                </el-form-item>
              </el-col>

              <!-- 楼栋床位 -->
              <el-col :span="12">
                <el-form-item label="楼栋名称" prop="buildingName">
                  <el-input v-model="form.buildingName" placeholder="请输入楼栋名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="楼层名称" prop="floorName">
                  <el-input v-model="form.floorName" placeholder="请输入楼层名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="房间名称" prop="roomName">
                  <el-input v-model="form.roomName" placeholder="请输入房间名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位名称" prop="bedName">
                  <el-input v-model="form.bedName" placeholder="请输入床位名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位码" prop="bedCode">
                  <el-input v-model="form.bedCode" placeholder="请输入床位码"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位信息" prop="bedInfo">
                  <el-input v-model="form.bedInfo" placeholder="请输入床位信息"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否包房" prop="isRoom">
                  <el-input v-model="form.isRoom" placeholder="1-否，2-是"></el-input>
                </el-form-item>
              </el-col>

              <!-- 护理信息 -->
              <el-col :span="12">
                <el-form-item label="护理等级名称" prop="nursingLevelName">
                  <el-input v-model="form.nursingLevelName" placeholder="请输入护理等级"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="护理组名称" prop="nursingGroupName">
                  <el-input v-model="form.nursingGroupName" placeholder="请输入护理组"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="护理人员名称" prop="nursingStaffName">
                  <el-input v-model="form.nursingStaffName" placeholder="请输入护理人员"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住类型" prop="checkType">
                  <el-input v-model="form.checkType" placeholder="请输入入住类型"></el-input>
                </el-form-item>
              </el-col>

              <!-- 户主 & 关系 -->
              <el-col :span="12">
                <el-form-item label="是否户主" prop="isHousehold">
                  <el-input v-model="form.isHousehold" placeholder="1-是，2-否"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="户主是否在住" prop="householdCheckState">
                  <el-input v-model="form.householdCheckState" placeholder="1-是，2-否"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="户主关系" prop="householdRelationship">
                  <el-input v-model="form.householdRelationship" placeholder="请输入与户主关系"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否翻身护理" prop="turnOverState">
                  <el-input v-model="form.turnOverState" placeholder="1-否，2-是"></el-input>
                </el-form-item>
              </el-col>

              <!-- 身份 & 渠道 -->
              <el-col :span="12">
                <el-form-item label="身份类别" prop="elderCategory">
                  <el-input v-model="form.elderCategory" placeholder="请选择身份类别"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="媒介渠道" prop="mediaChannels">
                  <el-input v-model="form.mediaChannels" placeholder="请输入媒介渠道"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入院方式" prop="admissionMethod">
                  <el-input v-model="form.admissionMethod" placeholder="请输入入院方式"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="打卡方式" prop="signWay">
                  <el-input v-model="form.signWay" placeholder="请输入打卡方式"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="视频打卡" prop="signIsVideo">
                  <el-input v-model="form.signIsVideo" placeholder="0-否，1-是"></el-input>
                </el-form-item>
              </el-col>

              <!-- 亲属 & 权益 & 状态 -->
              <el-col :span="12">
                <el-form-item label="亲属名称" prop="relativesName">
                  <el-input v-model="form.relativesName" placeholder="请输入亲属名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="会员权益名称" prop="benefitsName">
                  <el-input v-model="form.benefitsName" placeholder="请输入会员权益"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="审核状态" prop="totalAuditState">
                  <el-input v-model="form.totalAuditState" placeholder="请输入审核状态"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="状态" prop="status">
                  <el-input v-model="form.status" placeholder="1-启用，2-禁用"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" placeholder="请输入备注"></el-input>
                </el-form-item>
              </el-col>
            </el-row>
          </el-form>
        </el-main>

      </el-container>
    </el-drawer>

  </div>
</template>

<script>
export default {
  data() {
    return {
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {
          checkStep: 7
        }
      },
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false
    };
  },

  created() {
    this.getList()
  },

  mounted() {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/insElderCheckInfo/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },

    // 保存
    handleSave() {
      var that = this;
      that.$http.post("/insElderCheckInfo/save", that.form).then(function (response) {
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


      })


    },

    //修改
    edit(row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
    },

    // 删除当前行
    //    handleDelte (id) {
    //      del({ id: id }).then(res => {
    //        if (res.code == 200) {
    //         this.$message.success('删除成功')
    //         this.getList()
    //       }
    //      })
    //    },

    // 删除用户
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        var that = this;
        that.$http.post("/insElderCheckInfo/delete", { "id": id }).then(function (response) {
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

    //新增按钮
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>


<style lang="less" scoped>
.table-box {
  background-color: white;
  padding: 0 0 10px 0;
}

.table-box ::v-deep .el-table .cell {
  white-space: nowrap;
  /* 强制不换行 */
  overflow: hidden;
  /* 超出隐藏 */
  text-overflow: ellipsis;
  /* 超出显示省略号 */
}

.dialogBox {
  height: 100%;
  overflow-y: hidden;

  .dialogHeader {
    display: flex;
    padding: 0 15px;
    height: 70px;
    align-items: center;
    justify-content: space-between;
    border-bottom: 1px solid #ddd;
  }

  .dialogMain {
    padding: 15px;

    .dialog-title {
      font-size: 15px;
      display: flex;
      align-items: center;

      .line {
        color: rgb(0, 121, 254);
        font-size: 14px;
        font-weight: 600;
      }
    }
  }
}
.top-right-sort {
  display: flex;
  align-items: center;
  gap: 10px;
}

</style>

