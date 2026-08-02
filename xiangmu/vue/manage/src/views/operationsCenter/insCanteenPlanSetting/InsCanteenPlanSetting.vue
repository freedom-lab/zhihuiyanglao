<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="18">
          <!-- <el-button type="primary" @click="newBtn">新建</el-button> -->
        </el-col>
        <el-col :span="6">
          <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 表格部分 -->
    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="老人姓名" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
        </el-table-column>
        <el-table-column label="身份证号" min-width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
        </el-table-column>
        <el-table-column label="联系电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="送餐地址" min-width="200" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.address || '-' }}</template>
        </el-table-column>
        <el-table-column label="计划开始日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.planStartDate ? scope.row.planStartDate.slice(0, 10) : '-'
          }}</template>
        </el-table-column>
        <el-table-column label="计划结束日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.planEndDate ? scope.row.planEndDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="用餐时段" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.mealType === 1 ? '早餐' : scope.row.mealType === 2 ? '中餐' : '晚餐' }}
          </template>
        </el-table-column>
        <el-table-column label="送餐人员" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.staffName || '-' }}</template>
        </el-table-column>
        <el-table-column label="送餐人员电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.staffLinkTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="备注" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>
        <el-table-column label="计划状态" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.status === 1 ? '启用' : '停止' }}</template>
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
            <el-row :gutter="12">
              <el-col :span="12">
                <el-form-item label="老人姓名：" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="填写用餐老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号：" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="填写老人身份证号码"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系电话：" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="填写老人联系手机号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="送餐地址：" prop="address">
                  <el-input v-model="form.address" placeholder="填写详细送餐地址"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="计划开始日期：" prop="planStartDate">
                  <el-date-picker v-model="form.planStartDate" type="date" placeholder="选择开始日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="计划结束日期：" prop="planEndDate">
                  <el-date-picker v-model="form.planEndDate" type="date" placeholder="选择结束日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用餐时段：" prop="mealType">
                  <el-select v-model="form.mealType" placeholder="选择用餐时段" style="width:100%">
                    <el-option label="早餐" :value="1"></el-option>
                    <el-option label="中餐" :value="2"></el-option>
                    <el-option label="晚餐" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="送餐人员：" prop="staffName">
                  <el-input v-model="form.staffName" placeholder="填写配送人员姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="送餐人员电话：" prop="staffLinkTel">
                  <el-input v-model="form.staffLinkTel" placeholder="填写配送人员手机号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="计划状态：" prop="status">
                  <el-select v-model="form.status" placeholder="选择计划状态" style="width:100%">
                    <el-option label="启用" :value="1"></el-option>
                    <el-option label="停止" :value="0"></el-option>
                  </el-select>
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
      that.$http.post("/insCanteenPlanSetting/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insCanteenPlanSetting/save", that.form).then(function (response) {
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
        that.$http.post("/insCanteenPlanSetting/delete", { "id": id }).then(function (response) {
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
</style>

