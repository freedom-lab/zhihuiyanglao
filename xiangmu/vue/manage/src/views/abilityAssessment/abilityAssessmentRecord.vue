<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">能力评估记录</span>
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
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="年龄" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.age || '-' }}</template>
        </el-table-column>
        <el-table-column label="身份证号码" min-width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
        </el-table-column>
        <el-table-column label="老人联系电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="初步评估结果" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.initialLevel === 0 ? '能力完好' : scope.row.initialLevel === 1 ? '轻度失能' : scope.row.initialLevel
              ===
              2 ? '中度失能' : scope.row.initialLevel === 3 ? '重度失能' : '完全失能' }}
          </template>
        </el-table-column>
        <el-table-column label="最终评估结果" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.assessResult === 0 ? '能力完好' : scope.row.assessResult === 1 ? '轻度失能' : scope.row.assessResult
              ===
              2 ? '中度失能' : scope.row.assessResult === 3 ? '重度失能' : '完全失能' }}
          </template>
        </el-table-column>
        <el-table-column label="总得分" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalPoints || 0 }}</template>
        </el-table-column>
        <el-table-column label="居住地址" min-width="200" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.address || '-' }}</template>
        </el-table-column>
        <el-table-column label="评估类型" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.assessType === 1 ? '能力评估' : scope.row.assessType === 2 ? '专项评估' : '自定义评估' }}
          </template>
        </el-table-column>
        <el-table-column label="评估方式" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assessWay === 1 ? '集中评估' : '上门评估' }}</template>
        </el-table-column>
        <el-table-column label="评估状态" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.assessState === 1 ? '待派单' : scope.row.assessState === 2 ? '已派单' : scope.row.assessState === 3 ?
              '已接单' : scope.row.assessState === 4 ? '评估开始' : '评估完成' }}
          </template>
        </el-table-column>
        <el-table-column label="评估日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assessTime ? scope.row.assessTime.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="下次评估日期" width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.nextAssessTime ? scope.row.nextAssessTime.slice(0, 10) : '-'
          }}</template>
        </el-table-column>
        <el-table-column label="指派评估人" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assignStaffName || '-' }}</template>
        </el-table-column>
        <el-table-column label="评估人电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assignStaffTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="评估原因" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.assessMemo || '-' }}</template>
        </el-table-column>
        <el-table-column label="备注" min-width="150" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>

        <!-- 操作列 -->
        <el-table-column label="操作" width="150" align="center" fixed="right">
          <template slot-scope="scope">
            <!-- <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button> -->
            <el-button type="text" @click="lookEvaluate(scope.row)" size="small" style="padding: 0;">查看评估结果</el-button>
            <!-- <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
            </el-popconfirm> -->
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
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <el-row :gutter="12">
              <!-- 基础信息 -->
              <el-col :span="12">
                <el-form-item label="老人姓名：" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="填写老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号码：" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="填写老人身份证号"></el-input>
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
                <el-form-item label="年龄：" prop="age">
                  <el-input v-model.number="form.age" placeholder="填写老人年龄"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人联系电话：" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="填写老人联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="居住地址：" prop="address">
                  <el-input v-model="form.address" placeholder="填写老人居住地址"></el-input>
                </el-form-item>
              </el-col>

              <!-- 评估核心信息 -->
              <el-col :span="12">
                <el-form-item label="评估类型：" prop="assessType">
                  <el-select v-model="form.assessType" placeholder="选择评估类型" style="width:100%">
                    <el-option label="能力评估" :value="1"></el-option>
                    <el-option label="专项评估" :value="2"></el-option>
                    <el-option label="自定义评估" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估方式：" prop="assessWay">
                  <el-select v-model="form.assessWay" placeholder="选择评估方式" style="width:100%">
                    <el-option label="集中评估" :value="1"></el-option>
                    <el-option label="上门评估" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估状态：" prop="assessState">
                  <el-select v-model="form.assessState" placeholder="选择评估状态" style="width:100%">
                    <el-option label="待派单" :value="1"></el-option>
                    <el-option label="已派单" :value="2"></el-option>
                    <el-option label="已接单" :value="3"></el-option>
                    <el-option label="评估开始" :value="4"></el-option>
                    <el-option label="评估完成" :value="5"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="计划评估日期：" prop="planDate">
                  <el-date-picker v-model="form.planDate" type="date" placeholder="选择计划评估日期"
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
                <el-form-item label="下次评估日期：" prop="nextAssessTime">
                  <el-date-picker v-model="form.nextAssessTime" type="date" placeholder="选择下次评估日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>

              <!-- 评估结果 -->
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
                <el-form-item label="总得分：" prop="totalPoints">
                  <el-input v-model.number="form.totalPoints" placeholder="填写评估总得分"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="专项评估结果：" prop="specialResult">
                  <el-input v-model="form.specialResult" placeholder="填写专项评估结果"></el-input>
                </el-form-item>
              </el-col>

              <!-- 评估人员信息 -->
              <el-col :span="12">
                <el-form-item label="指派评估人姓名：" prop="assignStaffName">
                  <el-input v-model="form.assignStaffName" placeholder="填写评估人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="评估人员电话：" prop="assignStaffTel">
                  <el-input v-model="form.assignStaffTel" placeholder="填写评估人联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="派单时间：" prop="assignTime">
                  <el-date-picker v-model="form.assignTime" type="date" placeholder="选择派单时间"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="接单时间：" prop="acceptOrderTime">
                  <el-date-picker v-model="form.acceptOrderTime" type="date" placeholder="选择接单时间"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>

              <!-- 其他信息 -->
              <el-col :span="24">
                <el-form-item label="评估原因：" prop="assessMemo">
                  <el-input v-model="form.assessMemo" type="textarea" rows="2" placeholder="填写本次评估原因"></el-input>
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


    <AssessmentResultDialog :visible.sync="assessmentResultVisible" :resultData="resultData" />


  </div>
</template>

<script>
import AssessmentResultDialog from '../../components/assessment/AssessmentResultDialog.vue'
export default {
  components: {
    AssessmentResultDialog
  },
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
          assessType: 1,
          assessState: 5
        }
      },
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,
      assessmentResultVisible: false,
      resultData: {},
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
      that.$http.post("/assessmentAppoint/queryResult", that.queryInfo).then(function (response) {
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
      that.form.assessType = 1;
      that.$http.post("/assessmentAppoint/save", that.form).then(function (response) {
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

    // 删除用户
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        var that = this;
        that.$http.post("/assessmentAppoint/delete", { "id": id }).then(function (response) {
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

    //查看评估
    lookEvaluate(row) {
      this.resultData = {}
      this.assessmentResultVisible = true
      this.fetchResultData(row.id, row)
    },

    fetchResultData(id, row) {
      this.$http.post('assessmentResult/queryOne', { appointId: id }).then((res) => {
        if (res.data.code === 200) {
          this.resultData = {
            ...row,
            ...res.data.data
          }
        } else {
          this.$message.error(res.data.message)
        }
      })
    },

  },
};
</script>

<style scoped>
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

.dialog-scroll-wrap {
  height: 400px;
  overflow-y: auto;
  padding: 8px 12px;
}

.item-contant {
  width: 500px;
  margin-top: 20px;
}

.item-info {
  margin-top: 10px;
  display: flex;
  justify-content: space-between;
}

.bt-item {
  height: 40px;
  background-color: #E3EFFD;
  margin-top: 10px;
  line-height: 40px;
  font-size: 16px;
  padding-left: 10px;
}

.bt-item-result {
  height: 40px;
  background-color: #F5F6FA;
  margin-top: 10px;
  line-height: 40px;
  font-size: 14px;
  display: flex;
}

.item-list-info {
  margin-top: 15px;
  background-color: #F5F6FA;
  padding: 20px 10px;
  color: #616266;
  font-weight: bold;
  font-size: 18px;
}

.radio-group-wrap {
  width: 100%;
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.radio-item {
  margin-top: 15px;
  text-wrap: wrap;
}
</style>
