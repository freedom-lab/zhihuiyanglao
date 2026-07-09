<template>
  <div style="padding:16px">
    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">餐费变更申请</span>
        </el-col>
        <el-col :span="10">
          <div class="top-right-sort">
            <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
              <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
            </el-input>
            <el-button type="primary" @click="newBtn">新建</el-button>
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

        <!-- 1. 老人核心信息 置顶展示 -->
        <el-table-column label="老人姓名" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="身份证号" align="center" min-width="180" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="性别" align="center" width="70" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="入住日期" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.checkDate ? scope.row.checkDate.split(' ')[0] : '' }}</template>
        </el-table-column>

        <!-- 2. 变更申请核心信息 -->
        <el-table-column label="执行状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.changeState }}</template>
        </el-table-column>
        <el-table-column label="申请时间" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.applyTime ? scope.row.applyTime.split(' ')[0] : '' }}</template>
        </el-table-column>
        <el-table-column label="变更执行日期" align="center" width="120" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.executeDate ? scope.row.executeDate.split(' ')[0] : '' }}</template>
        </el-table-column>

        <!-- 3. 原餐费信息 -->
        <el-table-column label="原餐费名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.oldFoodName }}</template>
        </el-table-column>
        <el-table-column label="原餐费价格" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.oldFoodPrice }}</template>
        </el-table-column>

        <!-- 4. 新餐费信息 -->
        <el-table-column label="新餐费名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.newFoodName }}</template>
        </el-table-column>
        <el-table-column label="新餐费价格" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.newFoodPrice }}</template>
        </el-table-column>

        <!-- 5. 审批结算信息 -->
        <el-table-column label="审批状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditState }}</template>
        </el-table-column>
        <el-table-column label="审批人" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditName }}</template>
        </el-table-column>
        <el-table-column label="审批时间" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditTime ? scope.row.auditTime.split(' ')[0] : '' }}</template>
        </el-table-column>
        <el-table-column label="审批意见" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditMemo }}</template>
        </el-table-column>
        <el-table-column label="差额核算状态" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.calculateState }}</template>
        </el-table-column>
        <el-table-column label="结算状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.settlementState }}</template>
        </el-table-column>

        <!-- 6. 机构区域信息 -->
        <el-table-column label="运营公司" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.corpName }}</template>
        </el-table-column>
        <el-table-column label="机构名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName }}</template>
        </el-table-column>
        <el-table-column label="所属区域" align="center" min-width="130" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>

        <el-table-column label="备注" align="center" min-width="150" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>


        <!-- 操作列 -->
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
            </el-popconfirm>
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
          <div>{{ labelType == 'add' ? '新增' : '编辑' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <!-- 1. 老人信息 优先展示 -->
            <el-col :span="12">
              <el-form-item label="老人姓名" prop="elderName">
                <el-input v-model="form.elderName" placeholder="请输入老人姓名" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号" prop="idCard">
                <el-input v-model="form.idCard" placeholder="请输入身份证号码" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="性别" prop="sex">
                <el-input v-model="form.sex" placeholder="1=男，2=女" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="入住日期" prop="checkDate">
                <el-date-picker v-model="form.checkDate" type="date" value-format="yyyy-MM-dd" placeholder="选择入住日期"
                  style="width:100%" />
              </el-form-item>
            </el-col>

            <!-- 2. 变更申请信息 -->
            <el-col :span="12">
              <el-form-item label="执行状态" prop="changeState">
                <el-input v-model="form.changeState" placeholder="1=待变更，2=已变更，3=已取消" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="申请时间" prop="applyTime">
                <el-date-picker v-model="form.applyTime" type="date" value-format="yyyy-MM-dd" placeholder="选择申请日期"
                  style="width:100%" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="变更执行日期" prop="executeDate">
                <el-date-picker v-model="form.executeDate" type="date" value-format="yyyy-MM-dd" placeholder="选择执行日期"
                  style="width:100%" />
              </el-form-item>
            </el-col>

            <!-- 3. 原餐费信息 -->
            <el-col :span="12">
              <el-form-item label="原餐费名称" prop="oldFoodName">
                <el-input v-model="form.oldFoodName" placeholder="原餐费标准名称" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="原餐费价格" prop="oldFoodPrice">
                <el-input v-model="form.oldFoodPrice" placeholder="原餐费价格（元）" />
              </el-form-item>
            </el-col>

            <!-- 4. 新餐费信息 -->
            <el-col :span="12">
              <el-form-item label="新餐费名称" prop="newFoodName">
                <el-input v-model="form.newFoodName" placeholder="新餐费标准名称" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="新餐费价格" prop="newFoodPrice">
                <el-input v-model="form.newFoodPrice" placeholder="新餐费价格（元）" />
              </el-form-item>
            </el-col>

            <!-- 5. 审批结算信息 -->
            <el-col :span="12">
              <el-form-item label="审批状态" prop="auditState">
                <el-input v-model="form.auditState" placeholder="1=未审批，2=通过，3=驳回" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审批人" prop="auditName">
                <el-input v-model="form.auditName" placeholder="审批人员姓名" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审批时间" prop="auditTime">
                <el-date-picker v-model="form.auditTime" type="date" value-format="yyyy-MM-dd" placeholder="选择审批日期"
                  style="width:100%" />
              </el-form-item>
            </el-col>
            <el-col :span="24">
              <el-form-item label="审批意见" prop="auditMemo">
                <el-input v-model="form.auditMemo" placeholder="填写审批意见、驳回理由" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="差额核算状态" prop="calculateState">
                <el-input v-model="form.calculateState" placeholder="1=未核算，2=已核算" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="结算状态" prop="settlementState">
                <el-input v-model="form.settlementState" placeholder="1=未结算，2=已结算" />
              </el-form-item>
            </el-col>

            <!-- 6. 机构区域信息 -->
            <el-col :span="12">
              <el-form-item label="运营公司" prop="corpName">
                <el-input v-model="form.corpName" placeholder="运营公司名称" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="机构名称" prop="institutionName">
                <el-input v-model="form.institutionName" placeholder="机构名称" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="所属区域" prop="areaName">
                <el-input v-model="form.areaName" placeholder="省/市/区县" />
              </el-form-item>
            </el-col>

            <!-- 7. 扩展字段 -->
            <el-col :span="12">
              <el-form-item label="启用状态" prop="status">
                <el-input v-model="form.status" placeholder="1=启用，0=禁用" />
              </el-form-item>
            </el-col>
            <el-col :span="24">
              <el-form-item label="备注" prop="remark">
                <el-input v-model="form.remark" placeholder="补充说明信息" />
              </el-form-item>
            </el-col>
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
        condition: {}
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
      that.$http.post("/insExpensesChangeFoodRecord/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insExpensesChangeFoodRecord/save", that.form).then(function (response) {
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
        that.$http.post("/insExpensesChangeFoodRecord/delete", { "id": id }).then(function (response) {
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
}</style>
