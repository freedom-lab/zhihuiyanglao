<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">合同到期预警</span>
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


        <el-table-column label="机构名称" width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName || '-' }}</template>
        </el-table-column>
        <el-table-column label="入住日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.checkDate ? scope.row.checkDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="老人姓名" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
        </el-table-column>
        <el-table-column label="身份证号" width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
        </el-table-column>
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}</template>
        </el-table-column>
        <el-table-column label="合同编号" width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.contractCode || '-' }}</template>
        </el-table-column>
        <el-table-column label="合同名称" width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.contractName || '-' }}</template>
        </el-table-column>
        <el-table-column label="签订时间" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.signTime ? scope.row.signTime.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="合同起始" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.startDate ? scope.row.startDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="合同到期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.endDate ? scope.row.endDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="到期天数" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.dayNum ?? '-' }}</template>
        </el-table-column>
        <el-table-column label="预警状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span v-if="scope.row.warningState === 1" style="color:red">预警中</span>
            <span v-else-if="scope.row.warningState === 2" style="color:#67C23A">正常</span>
            <span v-else>-</span>
          </template>
        </el-table-column>
        <el-table-column label="备注" width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
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
            <el-col :span="12">
              <el-form-item label="机构名称" prop="institutionName">
                <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="入住日期" prop="checkDate">
                <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期" style="width:100%"
                  clearable></el-date-picker>
              </el-form-item>
            </el-col>
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
              <el-form-item label="性别" prop="sex">
                <el-select v-model="form.sex" placeholder="请选择性别" style="width:100%" clearable>
                  <el-option label="男" :value="1"></el-option>
                  <el-option label="女" :value="2"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同编号" prop="contractCode">
                <el-input v-model="form.contractCode" placeholder="请输入合同编号"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同名称" prop="contractName">
                <el-input v-model="form.contractName" placeholder="请输入合同名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同签订时间" prop="signTime">
                <el-date-picker v-model="form.signTime" type="date" placeholder="选择签订日期" style="width:100%"
                  clearable></el-date-picker>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同开始日期" prop="startDate">
                <el-date-picker v-model="form.startDate" type="date" placeholder="选择起始日期" style="width:100%"
                  clearable></el-date-picker>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同结束日期" prop="endDate">
                <el-date-picker v-model="form.endDate" type="date" placeholder="选择到期日期" style="width:100%"
                  clearable></el-date-picker>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="预警状态" prop="warningState">
                <el-select v-model="form.warningState" placeholder="请选择预警状态" style="width:100%" clearable>
                  <el-option label="预警中" :value="1"></el-option>
                  <el-option label="正常" :value="2"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="24">
              <el-form-item label="备注" prop="remark">
                <el-input v-model="form.remark" type="textarea" rows="3" placeholder="填写备注信息"></el-input>
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
      that.$http.post("/insElderContractWarning/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insElderContractWarning/save", that.form).then(function (response) {
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
        that.$http.post("/insElderContractWarning/delete", { "id": id }).then(function (response) {
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

