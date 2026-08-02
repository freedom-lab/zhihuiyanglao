<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="18">
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col :span="6">
          <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 表格部分 -->
    <div>
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>
        <el-table-column label="模板名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.templateName }}</template>
        </el-table-column>
        <el-table-column label="评估标准" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.assessmentCriteria === '01' ? '国家标准' :
              scope.row.assessmentCriteria === '02' ? '行业标准' : '地方标准'
          }}</template>
        </el-table-column>
        <el-table-column label="模板类型" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.templateType === 1 ? '能力评估' :
              scope.row.templateType === 2 ? '专项评估' : '自定义评估'
          }}</template>
        </el-table-column>
        <el-table-column label="模板状态" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.status === 0 ? '未启用' : '启用' }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>
        <el-table-column label="创建时间" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.createTime }}</template>
        </el-table-column>
        <el-table-column label="修改时间" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.updateTime }}</template>
        </el-table-column>
        <el-table-column label="操作" width="135" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="color: red;">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>
      <!-- 分页 -->
      <div class="block">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>



    <!-- 新增、编辑模版 -->
    <el-dialog :title="(labelType == 'add' ? '新增' : '编辑')" :visible.sync="showDialog" width="800px" height="400px">
      <div style="height: 400px; overflow-y: auto; padding-right: 8px;">
        <el-form ref="form" :model="form" :rules="rules" label-width="120px">
          <el-row :gutter="10">
            <el-col :span="12">
              <el-form-item label="模板名称：" prop="siteName">
                <el-input v-model="form.templateName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="评估标准：">
                <el-select v-model="form.assessmentCriteria" placeholder="选择评估标准" style="width:100%">
                  <el-option label="国家标准" value="01"></el-option>
                  <el-option label="行业标准" value="02"></el-option>
                  <el-option label="地方标准" value="03"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="模板类型：">
                <el-select v-model="form.templateType" placeholder="选择模板类型" style="width:100%">
                  <el-option label="能力评估" value="1"></el-option>
                  <el-option label="专项评估" value="2"></el-option>
                  <el-option label="自定义评估" value="3"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="模板状态：" prop="siteName">
                <el-select v-model="form.status" placeholder="选择模板状态" style="width:100%">
                  <el-option label="启用" value="1"></el-option>
                  <el-option label="未启用" value="0"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="备注：" prop="siteName">
                <el-input v-model="form.remark" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>

        <div class="add-question">
          <span style="font-size: 15px; color: #333;">评估项目[单选题]</span>
          <div class="add-question-btn" @click="addItem">
            <span style="font-size: 20px; color: #74a8eb; font-weight: 300;">+</span>
          </div>
        </div>

        <!-- 单选题集合 -->
        <div class="question-list-wrap">
          <div v-if="assessmentQuestions != null && assessmentQuestions.length > 0"
            v-for="(question, qIndex) in assessmentQuestions" :key="qIndex">
            <div class="question-header">
              <div>
                <span class="q-index">{{ qIndex + 1 }}.</span>
                <span class="q-text">{{ question.questionName }}</span>
              </div>
              <div>
                <span class="operate-btn edit-btn" @click="editQuestion(qIndex)">
                  <i class="el-icon-edit"></i> 编辑
                </span>
                <span class="operate-btn del-btn" @click="deleteQuestion(qIndex)">
                  <i class="el-icon-delete"></i> 删除
                </span>
              </div>
            </div>

            <!-- 当前单选题的选项列表 -->
            <div class="option-list">
              <div v-for="(opt, oIndex) in question.assessmentOptions" :key="oIndex" class="option-item">
                <i class="el-icon-radio-off radio-icon"></i>
                <span class="opt-text">{{ opt.optionContent }} --- ({{ opt.optionMark }}分)</span>
              </div>
            </div>
          </div>
        </div>


        <div class="box-three-container">
          <!-- 左侧标题 -->
          <div class="box-left">
            <span style="color:red;">*</span>评估标准:
          </div>
          <!-- 外层边框容器 -->
          <div class="box-box-container">
            <!-- 表头行 -->
            <div class="box-box-header">
              <!-- 蓝色圆形加号 -->
              <div class="box-circle-add-btn">
                <div class="box-circle-blue" @click="addStandardRow">
                  <span class="box-plus-icon">+</span>
                </div>
              </div>
              <!-- 表头文字列 -->
              <div class="box-head-left-text">开始分值</div>
              <div class="box-head-center-text">结束分值</div>
              <div class="box-head_right-text">评估标准</div>
            </div>
            <!-- 空数据区域 -->
            <div v-if="standardList.length === 0" class="empty-area">
              <!-- 空数据盒子图标 -->
              <div style="font-size:15px; color:#666; margin-top:16px;">暂无数据</div>
            </div>


            <div v-else>
              <div class="list-view" v-for="(item, index) in standardList" :key="index">
                <div class="table-col table-col-fixed del-cell" @click="delStandardRow(index)">
                  <span class="num-text">{{ item.serialNumber }}</span>
                  <div class="red-del-circle">
                    <i class="el-icon-delete del-icon"></i>
                  </div>
                </div>
                <!-- 开始分值输入框 -->
                <div class="table-col table-col-flex input-cell">
                  <span class="required-star">*</span>
                  <el-input v-model.number="item.scoreStart" placeholder="请输入开始分值" type="number"
                    class="cell-input"></el-input>
                </div>
                <!-- 结束分值输入框 -->
                <div class="table-col table-col-flex input-cell">
                  <span class="required-star">*</span>
                  <el-input v-model.number="item.scoreEnd" placeholder="请输入结束分值" type="number"
                    class="cell-input"></el-input>
                </div>
                <!-- 评估标准输入框 -->
                <div class="table-col table-col-flex input-cell">
                  <span class="required-star">*</span>
                  <el-input v-model="item.scoreResult" placeholder="请输入评估标准" class="cell-input"></el-input>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>



    <!-- 新增、编辑 评估项目 -->
    <el-dialog :title="editIndex !== null ? '编辑评估项目' : '新增评估项目'" :visible.sync="showQuestionDialog" width="800px"
      height="400px">
      <div class="dialog-scroll-wrap">
        <div class="form-row-wrap">
          <div class="form-label required-text">问题内容:</div>
          <el-input v-model="itemForm.questionName" placeholder="请输入 问题内容" clearable></el-input>
        </div>

        <div class="option-row-wrap">
          <div class="option-label required-text">选项:</div>
          <div class="box-box-container">
            <!-- 表头行 -->
            <div class="box-box-header">
              <div class="box-circle-add-btn">
                <div class="box-circle-blue" @click="addOptionRow">
                  <span class="box-plus-icon">+</span>
                </div>
              </div>
              <div class="box-head-two-text">选项</div>
              <div class="box-head-two-text">分值</div>
            </div>

            <!-- 空数据占位 -->
            <div v-if="itemForm.assessmentOptions.length === 0" class="empty-area">
              <div class="empty-text">暂无数据</div>
            </div>

            <!-- 存在数据循环渲染行 -->
            <div v-else>
              <div class="list-view" v-for="(item, index) in itemForm.assessmentOptions" :key="index">
                <!-- 序号+hover删除按钮 -->
                <div class="table-col table-col-fixed del-cell" @click="delOptionRow(index)">
                  <span class="num-text">{{ index + 1 }}</span>
                  <div class="red-del-circle">
                    <i class="el-icon-delete del-icon"></i>
                  </div>
                </div>
                <!-- 选项输入框 -->
                <div class="table-col table-col-flex input-cell">
                  <el-input v-model="item.optionContent" placeholder="请输入选项" clearable class="cell-input"></el-input>
                </div>
                <!-- 分值数字输入框 -->
                <div class="table-col table-col-flex input-cell">
                  <el-input v-model.number="item.optionMark" placeholder="请输入分值" clearable
                    class="cell-input"></el-input>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <span slot="footer">
        <el-button size="small" @click="showQuestionDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave2">确定</el-button>
      </span>
    </el-dialog>


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
        currPage: 1,
        condition: {}
      },
      //模板表单
      form: {},
      assessmentQuestions: [],
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,
      standardList: [],
      showQuestionDialog: false,
      // 问题表单
      editIndex: null,
      itemForm: {
        questionName: '',
        assessmentOptions: []
      },
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
      that.$http.post("/assessmentTemplate/list", that.queryInfo).then(function (response) {
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
      this.form.assessmentQuestions = this.assessmentQuestions
      this.form.assessmentStandards = this.standardList
      this.$http.post("assessmentTemplate/saveAssessmentTemplate", this.form).then(function (response) {
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
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
      this.$http.post("assessmentTemplate/queryAssessmentTemplate", { "id": row.id }).then((res) => {
        if (res.data.code == 200) {
          this.assessmentQuestions = res.data.data.assessmentQuestions
          this.standardList = res.data.data.assessmentStandards
          console.log("问题", res.data.data.assessmentQuestions)
          console.log("评估", res.data.data.assessmentStandards)
          this.showDialog = true;
        } else {
          this.showDialog = true;
        }
      });
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
        that.$http.post("/assessmentTemplate/delete", { "id": id }).then(function (response) {
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
      this.assessmentQuestions = []
      this.standardList = []
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
    // 新增评估单选题
    addItem() {
      this.editIndex = null
      this.itemForm = {
        questionName: '',
        assessmentOptions: []
      }
      this.showQuestionDialog = true;
    },
    // 新增评估标准行
    addStandardRow() {
      var len = this.standardList.length
      this.standardList.push({
        serialNumber: (len + 1),
        scoreStart: null,
        scoreEnd: null,
        scoreResult: ''
      })
    },
    //删除评估标准
    delStandardRow(index) {
      this.standardList.splice(index, 1)
      // 重新循环赋值序号，从1开始连续排序
      this.standardList.forEach((item, i) => {
        item.serialNumber = i + 1
      })
    },
    // 新增一行选项
    addOptionRow() {
      this.itemForm.assessmentOptions.push({
        optionContent: '',
        optionMark: ''
      })
    },
    // 删除单行选项
    delOptionRow(index) {
      this.itemForm.assessmentOptions.splice(index, 1)
    },
    // 保存评估问题
    handleSave2() {
      console.log("保存开始：", this.itemForm)

      if (this.editIndex !== null) {
        this.assessmentQuestions[this.editIndex] = { ...this.itemForm }
      } else {
        this.assessmentQuestions.push({ ...this.itemForm })
      }
      console.log("主模板：", this.form)
      this.itemForm = {
        questionName: '',
        assessmentOptions: []
      }
      this.editIndex = null
      this.showQuestionDialog = false;
      console.log("保存结束：", this.itemForm)
    },
    //编辑问题
    editQuestion(index) {
      console.log("编辑下标", index)
      this.editIndex = index
      var item = this.assessmentQuestions[index]
      this.itemForm = JSON.parse(JSON.stringify(item))
      this.showQuestionDialog = true;
    },
    //删除问题
    deleteQuestion(index) {
      console.log("删除下标", index)
      const list = this.assessmentQuestions
      if (!Array.isArray(list) || index < 0 || index >= list.length) {
        this.$message.error('删除失败，数据不存在')
        return
      }
      this.assessmentQuestions.splice(index, 1)
    }
  },
};
</script>

<style scoped lang="scss">
.add-question {
  background: #f0f7ff;
  padding: 10px;
  display: flex;
  align-items: center;
  gap: 12px;
}

.add-question-btn {
  width: 30px;
  height: 30px;
  border: 2px solid #b4d0f7;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.question-list-wrap {
  padding: 15px 0;
}

.question-header {
  display: flex;
  justify-content: space-between;
  background: #f0f7ff;
  padding: 15px 10px;
}

.q-index {
  font-size: 16px;
  font-weight: bold;
  color: black;
  margin-right: 6px;
}

.q-text {
  font-size: 16px;
  color: black;
}

.edit-btn {
  color: #409eff;
}

.del-btn {
  color: #409eff;
}

.operate-btn {
  font-size: 16px;
  cursor: pointer;
  margin-left: 16px;
}

.option-list {
  margin-top: 12px;
  padding-left: 25px;
  background-color: white;
}

.option-item {
  display: flex;
  align-items: center;
  margin: 8px 0;
  color: #666;
  font-size: 16px;
}

.radio-icon {
  font-size: 18px;
  margin-right: 8px;
  color: #c0c4cc;
}

.el-dialog__body>div::-webkit-scrollbar {
  width: 6px;
}

.el-dialog__body>div::-webkit-scrollbar-thumb {
  background: #dcdcdc;
  border-radius: 3px;
}

.box-three-container {
  margin-top: 20px;
}

.box-left {
  font-size: 15px;
  margin-bottom: 12px;
}

.box-box-container {
  border: 1px solid #e6e6e6;
  border-radius: 4px;
  width: 100%;
}

.box-box-header {
  display: flex;
  border-bottom: 1px solid #e6e6e6;
}

.box-circle-add-btn {
  width: 100px;
  height: 70px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-right: 1px solid #e6e6e6;
}

.box-circle-blue {
  width: 40px;
  height: 40px;
  background: #409eff;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.box-plus-icon {
  color: #fff;
  font-size: 30px;
  font-weight: 300;
}

.box-head-left-text {
  flex: 1;
  height: 70px;
  line-height: 70px;
  text-align: center;
  font-size: 14px;
  border-right: 1px solid #e6e6e6;
}

.box-head-center-text {
  flex: 1;
  height: 70px;
  line-height: 70px;
  text-align: center;
  font-size: 14px;
  border-right: 1px solid #e6e6e6;
}

.box-head_right-text {
  flex: 1;
  height: 70px;
  line-height: 70px;
  text-align: center;
  font-size: 14px;
}

.empty-area {
  min-height: 220px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 30px;
}

.list-view {
  display: flex;
  border-bottom: 1px solid #e4e7ed;
}

.list-item {
  width: 100px;
  height: 60px;
  line-height: 60px;
  text-align: center;
  font-size: 14px;
  border-right: 1px solid #e4e7ed;
}

.item-left {
  flex: 1;
  height: 60px;
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0 8px;
  border-right: 1px solid #e4e7ed;
}

.item-center {
  flex: 1;
  height: 60px;
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0 8px;
  border-right: 1px solid #e4e7ed;
}

.item-right {
  flex: 1;
  height: 60px;
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0 8px;
}

.table-col {
  height: 60px;
  line-height: 60px;
  text-align: center;
  font-size: 14px;
  color: #333;
  border-right: 1px solid #e4e7ed;
}

.table-col-fixed {
  width: 100px;
}

.red-del-circle {
  position: absolute;
  width: 40px;
  height: 40px;
  background: #f56c6c;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  opacity: 0;
  transition: opacity 0.2s ease;
}

.del-icon {
  color: #fff;
  font-size: 20px;
}

.del-cell {
  position: relative;
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
}

.input-cell {
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0 12px;
}

.cell-input {
  width: 90%;
}

.del-cell:hover .num-text {
  opacity: 0;
}

.del-cell:hover .red-del-circle {
  opacity: 1;
}

/* 美化滚动条 */
::v-deep .dialog-scroll-wrap::-webkit-scrollbar {
  width: 6px;
}

::v-deep .dialog-scroll-wrap::-webkit-scrollbar-thumb {
  background: #dcdcdc;
  border-radius: 3px;
}


.dialog-scroll-wrap {
  height: 400px;
  overflow-y: auto;
  padding: 8px 12px;
}

.form-row-wrap,
.option-row-wrap {
  display: flex;
  width: 100%;
  margin-bottom: 24px;
}

.form-label {
  width: 100px;
  font-size: 16px;
  margin-bottom: 10px;
}

.required-text::before {
  content: '*';
  color: red;
  margin-right: 4px;
}

.option-wrap {
  margin-top: 24px;
  display: flex;
  align-items: flex-start;
  gap: 16px;
}

.option-label {
  width: 100px;
  font-size: 16px;
  white-space: nowrap;
  padding-top: 12px;
}

.required-text::before {
  content: '*';
  color: red;
  margin-right: 4px;
}

/* 必填红色星号 */
.required-label::before {
  content: '*';
  color: red;
  margin-right: 4px;
}

.box-three-container {
  margin-top: 24px;
}

.box-left {
  font-size: 16px;
  margin-bottom: 12px;
}

.box-box-container {
  border: 1px solid #e6e6e6;
  border-radius: 4px;
}

/* 表头行布局 */
.box-box-header {
  display: flex;
  border-bottom: 1px solid #e6e6e6;
}

.box-circle-add-btn {
  width: 100px;
  height: 70px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-right: 1px solid #e6e6e6;
}

.box-circle-blue {
  width: 40px;
  height: 40px;
  background: #409eff;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.box-plus-icon {
  color: #fff;
  font-size: 30px;
  font-weight: 300;
}

.box-head-two-text {
  flex: 1;
  height: 70px;
  line-height: 70px;
  text-align: center;
  font-size: 16px;
  border-right: 1px solid #e6e6e6;

  &:last-child {
    border-right: none;
  }
}

/* 空数据区域 */
.empty-area {
  min-height: 240px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 30px 0;
}

.empty-text {
  font-size: 18px;
  color: #666;
  margin-top: 16px;
}

/* 数据行 */
.list-view {
  display: flex;
  border-bottom: 1px solid #e4e7ed;
}

.table-col {
  height: 60px;
  line-height: 60px;
  text-align: center;
  font-size: 14px;
  color: #333;
  border-right: 1px solid #e4e7ed;

  &:last-child {
    border-right: none;
  }
}

.table-col-fixed {
  width: 100px;
}

.table-col-flex {
  flex: 1;
}

/* 序号+删除hover核心样式 */
.del-cell {
  position: relative;
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
}

.num-text {
  font-size: 14px;
  transition: opacity 0.2s ease;
}

.red-del-circle {
  position: absolute;
  width: 40px;
  height: 40px;
  background: #f56c6c;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  opacity: 0;
  transition: opacity 0.2s ease;
}

.del-icon {
  color: #fff;
  font-size: 20px;
}

/* hover切换显示隐藏 */
.del-cell:hover .num-text {
  opacity: 0;
}

.del-cell:hover .red-del-circle {
  opacity: 1;
}

/* 输入单元格 */
.input-cell {
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0 12px;
}

.required-star {
  color: red;
  margin-right: 4px;
}

.cell-input {
  width: 90%;
}

/* 底部按钮 */
.dialog-footer {
  text-align: right;
}

/* 滚动条美化 */
::v-deep .dialog-scroll-wrap::-webkit-scrollbar {
  width: 6px;
}

::v-deep .dialog-scroll-wrap::-webkit-scrollbar-thumb {
  background: #dcdcdc;
  border-radius: 3px;
}
</style>
