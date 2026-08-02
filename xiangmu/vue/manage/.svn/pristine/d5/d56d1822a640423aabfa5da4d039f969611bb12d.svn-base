<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">评估预警管理</span>
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

        <el-table-column label="老人姓名" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
        </el-table-column>
        <el-table-column label="身份证号" min-width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
        </el-table-column>
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="入住日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.checkDate ? scope.row.checkDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="评估日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assessTime ? scope.row.assessTime.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="评估原因" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assessMemo || '-' }}</template>
        </el-table-column>
        <el-table-column label="初步评估结果" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.initialLevel === 0 ? '能力完好' : scope.row.initialLevel === 1 ? '轻度失能' : scope.row.initialLevel ===
              2 ? '中度失能' : scope.row.initialLevel === 3 ? '重度失能' : '完全失能' }}
          </template>
        </el-table-column>
        <el-table-column label="最终评估结果" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.assessResult === 0 ? '能力完好' : scope.row.assessResult === 1 ? '轻度失能' : scope.row.assessResult ===
              2 ? '中度失能' : scope.row.assessResult === 3 ? '重度失能' : '完全失能' }}
          </template>
        </el-table-column>
        <el-table-column label="评估人员" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assignStaffName || '-' }}</template>
        </el-table-column>
        <el-table-column label="评估人员电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assignStaffTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="预警状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.warningState === 1 ? '预警中' : '正常' }}</template>
        </el-table-column>
        <el-table-column label="备注" min-width="150" align="center" show-overflow-tooltip>
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
            <el-row :gutter="12">
              <el-col :span="12">
                <el-form-item label="老人姓名：" prop="elderName">
                 <el-select v-model="form.elderId" placeholder="请选择老人" style="width:100%"
                    @change="handleElderChange">
                    <el-option v-for="item in elderList" :key="item.id" :label="`${item.elderName} | ${item.idCard}`"
                      :value="item.id"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号：" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="填写老人身份证号码"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别：" prop="sex">
                  <el-select v-model="form.sex" placeholder="选择性别" style="width:100%">
                    <el-option label="男" :value="1"></el-option>
                    <el-option label="女" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住日期：" prop="checkDate">
                  <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估日期：" prop="assessTime">
                  <el-date-picker v-model="form.assessTime" type="date" placeholder="选择评估日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估原因：" prop="assessMemo">
                  <el-input v-model="form.assessMemo" placeholder="填写本次评估原因"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="初步评估结果：" prop="initialLevel">
                  <el-select v-model="form.initialLevel" placeholder="选择初步评估结果" style="width:100%">
                    <el-option label="能力完好" :value="0"></el-option>
                    <el-option label="轻度失能" :value="1"></el-option>
                    <el-option label="中度失能" :value="2"></el-option>
                    <el-option label="重度失能" :value="3"></el-option>
                    <el-option label="完全失能" :value="4"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="最终评估结果：" prop="assessResult">
                  <el-select v-model="form.assessResult" placeholder="选择最终评估结果" style="width:100%">
                    <el-option label="能力完好" :value="0"></el-option>
                    <el-option label="轻度失能" :value="1"></el-option>
                    <el-option label="中度失能" :value="2"></el-option>
                    <el-option label="重度失能" :value="3"></el-option>
                    <el-option label="完全失能" :value="4"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估人员姓名：" prop="assignStaffName">
                  <el-input v-model="form.assignStaffName" placeholder="填写评估人员姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估人员电话：" prop="assignStaffTel">
                  <el-input v-model="form.assignStaffTel" placeholder="填写评估人员联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预警状态：" prop="warningState">
                  <el-select v-model="form.warningState" placeholder="选择预警状态" style="width:100%">
                    <el-option label="正常" :value="0"></el-option>
                    <el-option label="预警中" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注说明：" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="3" placeholder="填写其他备注信息"></el-input>
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
      loading: false,
      elderList: [],
    };
  },

  created() {
    this.getList()
    this.getElderList();
  },

  mounted() {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 切换老人下拉触发回填
    handleElderChange(elderId) {
      if (!elderId) {
        // 清空选择时重置所有字段
        this.form.elderName = ''
        this.form.idCard = ''
        this.form.sex = null
        this.form.elderId = ''
        return
      }
      // 根据id找到当前选中老人完整数据
      const elderInfo = this.elderList.find(item => item.id === elderId)
      if (elderInfo) {
        this.form.elderName = elderInfo.elderName
        this.form.elderId = elderInfo.id
        this.form.idCard = elderInfo.idCard
        this.form.sex = this.form.sex = Number(elderInfo.sex)
      }
    },

    //老人下拉列表
    getElderList() {
      const that = this
      that.$http.post("/elderBaseInfo/queryList", {}).then(res => {
        if (res.data.code === 200) {
          that.elderList = res.data.data
        }
      })
    },

    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/insElderAssessmentWarning/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insElderAssessmentWarning/save", that.form).then(function (response) {
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
        that.$http.post("/insElderAssessmentWarning/delete", { "id": id }).then(function (response) {
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
.top-right-sort {
  display: flex;
  align-items: center;
  gap: 10px;
}

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

