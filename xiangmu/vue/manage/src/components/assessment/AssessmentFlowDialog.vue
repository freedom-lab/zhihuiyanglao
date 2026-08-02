<template>
  <div>
    <el-dialog title="老人模板" :visible.sync="showTemplateDialog" width="37%" height="400px" :close-on-click-modal="false"
      @close="handleTemplateDialogClose">
      <div class="dialog-scroll-wrap">
        <div class="form-item">
          <div class="item-label">
            <span class="star">*</span>选择老人:
          </div>
          <div class="search-input-wrap">
            <el-input placeholder="请输入 选择老人" v-model="selectElder.elderName">
              <template #append>
                <el-button icon="el-icon-search" @click="searchElder"></el-button>
              </template>
            </el-input>
          </div>
        </div>
        <div class="form-item">
          <div class="item-label">自定义评估:</div>
          <el-radio-group v-model="selectAssessList" class="assess-checkbox-group">
            <el-radio v-for="item in assessTemplateList" :key="item.id" :label="item.id">
              {{ item.templateName }}
            </el-radio>
          </el-radio-group>
        </div>
      </div>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitAdd">确定</el-button>
        <el-button @click="handleClose">取消</el-button>
      </span>
    </el-dialog>

    <el-dialog title="选择老人" width="70%" height="400px" :visible.sync="elderDialogVisible" :close-on-click-modal="false">
      <div class="search-card">
        <el-table border ref="elderTable" :data="elderList" tooltip-effect="dark" style="width: 100%"
          :header-cell-style="headerCellStyle" @current-change="handleCurrentElder">
          <el-table-column label="序号" type="index" width="60" align="center"></el-table-column>
          <el-table-column label="姓名" prop="elderName" align="center" show-overflow-tooltip></el-table-column>
          <el-table-column label="性别" width="100" align="center" show-overflow-tooltip>
            <template #default="{ row }">{{ row.sex == '1' || row.sex === 1 ? '男' : '女' }}</template>
          </el-table-column>
          <el-table-column label="年龄" prop="age" min-width="110" align="center" show-overflow-tooltip></el-table-column>
          <el-table-column label="手机号码" prop="linkTel" min-width="180" align="center"
            show-overflow-tooltip></el-table-column>
        </el-table>
        <div class="block">
          <el-pagination @size-change="handleSizeDialogChange" @current-change="handleCurrentDialogChange"
            :current-page="queryElderInfo.currPage" :page-sizes="[10, 20, 30, 40]" :page-size="queryElderInfo.pageSize"
            layout="total, sizes, prev, pager, next, jumper" :total="elderTotal" />
        </div>
      </div>
    </el-dialog>

    <el-dialog title="评估" :visible.sync="evaluateQuestionDialogVisible" width="70%" height="400px"
      :close-on-click-modal="false" @close="resetEvaluateDialog">
      <div class="dialog-scroll-wrap">
        <div class="section-title">被评估人信息</div>
        <div class="item-contant">
          <div class="item-info">
            <div>老人姓名：{{ selectElder.elderName || '' }}</div>
            <div>性别：{{ selectElder.sex == '1' || selectElder.sex === 1 ? '男' : '女' }}</div>
          </div>
          <div class="item-info">
            <div>出生日期：</div>
            <div>年龄：{{ selectElder.age || '' }}</div>
          </div>
          <div class="item-info">
            <div>手机号：{{ selectElder.linkTel || '' }}</div>
          </div>
        </div>
        <div class="bt-item">评估标准</div>
        <div class="bt-item-result">
          <div v-for="(item1, index1) in evaluateQuestionStandardsList" :key="index1" class="standard-item">
            {{ item1.scoreResult }}:{{ item1.scoreStart }}-{{ item1.scoreEnd }};
          </div>
        </div>
        <div class="itme-list" v-for="(item2, index2) in evaluateQuestionList" :key="index2">
          <div class="item-list-info">
            <div><span class="required-star">* </span>{{ index2 + 1 }}.{{ item2.questionName }}</div>
            <el-radio-group v-model="answerObj[item2.id]" class="radio-group-wrap">
              <el-radio class="radio-item" v-for="opt in item2.assessmentOptions" :key="opt.id" :label="opt.id">
                {{ opt.optionContent }}({{ opt.optionMark }}分)
              </el-radio>
            </el-radio-group>
          </div>
        </div>
      </div>
      <span slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitComplete">完成</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'AssessmentFlowDialog',
  props: {
    visible: { type: Boolean, default: false },
    initialElder: { type: Object, default: () => ({}) },
    templateType: { type: String, default: '1' }
  },
  data() {
    return {
      showTemplateDialog: false,
      elderDialogVisible: false,
      evaluateQuestionDialogVisible: false,
      selectElder: {},
      assessTemplateList: [],
      selectAssessList: null,
      elderList: [],
      queryElderInfo: {
        currPage: 1,
        pageSize: 10
      },
      elderTotal: 0,
      evaluateQuestionList: [],
      evaluateQuestionStandardsList: [],
      answerObj: {},
      headerCellStyle: {
        backgroundColor: '#fafafa',
        color: '#333',
        fontWeight: 'bold',
        fontSize: '14px'
      },
      preventCloseAll: false
    }
  },
  watch: {
    visible(val) {
      if (val) {
        this.openFlow()
      } else {
        this.closeAll()
      }
    }
  },
  created() {
    this.getTemplateList()
    this.getElderList()
  },
  methods: {
    openFlow() {
      this.resetFlow()
      this.showTemplateDialog = true
      if (this.initialElder && Object.keys(this.initialElder).length) {
        this.selectElder = JSON.parse(JSON.stringify(this.initialElder))
      }
    },
    handleClose() {
      this.closeAll()
      this.$emit('update:visible', false)
    },
    handleTemplateDialogClose() {
      if (this.preventCloseAll) {
        this.preventCloseAll = false
        return
      }
      if (this.evaluateQuestionDialogVisible) {
        // 当评估弹窗已打开时，仅关闭当前模板对话框
        this.showTemplateDialog = false
        return
      }
      this.handleClose()
    },
    closeAll() {
      this.showTemplateDialog = false
      this.elderDialogVisible = false
      this.evaluateQuestionDialogVisible = false
      this.resetFlow()
    },
    resetFlow() {
      this.selectElder = this.initialElder && Object.keys(this.initialElder).length ? JSON.parse(JSON.stringify(this.initialElder)) : {}
      this.selectAssessList = null
      this.evaluateQuestionList = []
      this.evaluateQuestionStandardsList = []
      this.answerObj = {}
    },
    searchElder() {
      this.elderDialogVisible = true
    },
    handleCurrentElder(row) {
      this.selectElder = row || {}
      this.elderDialogVisible = false
    },
    submitAdd() {
      if (!this.selectElder.elderName || !this.selectElder.elderName.toString().trim()) {
        this.$message.warning('请选择老人')
        return
      }
      if (!this.selectAssessList) {
        this.$message.warning('请至少选择一项自定义评估')
        return
      }
      this.preventCloseAll = true
      this.getTemplateQuestion()
      this.showTemplateDialog = false
    },
    getTemplateList() {
      this.$http.post('assessmentTemplate/queryList', {
        templateType: this.templateType
      }).then(response => {
        if (response.data.code === 200) {
          this.assessTemplateList = response.data.data || []
        }
      })
    },
    getElderList() {
      this.$http.post('insElderCheckInfo/list', this.queryElderInfo).then(response => {
        if (response.data.code === 200) {
          const data = response.data.data || {}
          this.elderTotal = data.count || 0
          this.queryElderInfo.currPage = data.currPage || 1
          this.elderList = data.data || []
        }
      })
    },
    getTemplateQuestion() {
      const ids = this.selectAssessList ? [this.selectAssessList].join(',') : ''
      this.$http.post('assessmentTemplate/queryAssessmentTemplateList', { templateIds: ids }).then(res => {
        if (res.data.code === 200) {
          const list = res.data.data || []
          this.evaluateQuestionList = []
          this.evaluateQuestionStandardsList = []
          list.forEach(templateItem => {
            this.evaluateQuestionList.push(...(templateItem.assessmentQuestions || []))
            this.evaluateQuestionStandardsList.push(...(templateItem.assessmentStandards || []))
          })
          this.evaluateQuestionDialogVisible = true
        }
      })
    },
    submitComplete() {
      const answerEntries = Object.entries(this.answerObj)
      if (this.evaluateQuestionList.length !== answerEntries.length) {
        this.$message.warning('请填写完整答案')
        return
      }
      const questionMap = {}
      const optionMarkMap = {}
      this.evaluateQuestionList.forEach(question => {
        questionMap[question.id] = question
          ; (question.assessmentOptions || []).forEach(opt => {
            optionMarkMap[opt.id] = opt.optionMark
          })
      })
      const questionIdStr = answerEntries.map(item => item[0]).join(',')
      const optionIdStr = answerEntries.map(item => item[1]).join(',')
      const totalScore = answerEntries.reduce((sum, item) => sum + ((optionMarkMap[item[1]] || 0)), 0)
      const questionTypeStr = answerEntries.map(item => questionMap[item[0]]?.questionType || '').join(',')
      const params = {
        appointId: this.selectElder.id,
        optionIds: optionIdStr,
        questionIds: questionIdStr,
        resultMark: totalScore,
        questionTypes: questionTypeStr
      }
      this.$http.post('assessmentResult/saveResult', params).then(res => {
        if (res.data.code === 200) {
          this.$message.success('评估完成')
          this.evaluateQuestionDialogVisible = false
          this.$emit('completed')
          this.$emit('update:visible', false)
        } else {
          this.$message.error(res.data.message)
        }
      })
    },
    resetEvaluateDialog() {
      this.evaluateQuestionDialogVisible = false
      this.evaluateQuestionList = []
      this.evaluateQuestionStandardsList = []
      this.answerObj = {}
    },
    handleSizeDialogChange(val) {
      this.queryElderInfo.pageSize = val
      this.getElderList()
    },
    handleCurrentDialogChange(val) {
      this.queryElderInfo.currPage = val
      this.getElderList()
    }
  }
}
</script>

<style scoped>
.dialog-scroll-wrap {
  height: 400px;
  overflow-y: auto;
  padding: 8px 12px;
}

.form-item {
  display: flex;
  flex-direction: row;
  align-items: flex-start;
  margin-bottom: 24px;
}

.item-label {
  font-size: 16px;
  color: #616266;
  font-weight: bold;
  margin-bottom: 12px;
  display: flex;
  align-items: center;
  margin-right: 20px;
}

.star,
.required-star {
  color: #f56c6c;
  margin-right: 4px;
}

.search-input-wrap {
  display: flex;
  align-items: center;
  width: 60%;
}

.search-input-wrap :deep(.el-input) {
  flex: 1;
}

.assess-checkbox-group {
  display: flex;
  flex-direction: column;
  gap: 14px;
}

.assess-checkbox-group :deep(.el-radio) {
  font-size: 15px;
}

.dialog-footer {
  text-align: right;
}

.dialog-footer button {
  margin-left: 12px;
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
  min-height: 40px;
  background-color: #F5F6FA;
  margin-top: 10px;
  line-height: 40px;
  font-size: 14px;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  padding: 0 10px;
}

.standard-item {
  margin-right: 12px;
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
  word-break: break-word;
}

.section-title {
  font-size: 18px;
  color: black;
  font-weight: bold;
}
</style>
