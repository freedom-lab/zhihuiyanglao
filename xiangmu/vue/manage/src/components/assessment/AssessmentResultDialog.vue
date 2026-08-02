<template>
  <el-dialog title="查看评估结果" :visible.sync="visible" width="70%" height="400px" :close-on-click-modal="false">
    <div class="dialog-scroll-wrap">
      <div class="section-title">被评估人信息</div>
      <div class="item-contant">
        <div class="item-info">
          <div>老人姓名：{{ resultData.elderName || '' }}</div>
          <div>性别：{{ resultData.sex === 1 || resultData.sex == '1' ? '男' : '女' }}</div>
        </div>
        <div class="item-info">
          <div>出生日期：</div>
          <div>年龄：{{ resultData.age || '' }}</div>
        </div>
        <div class="item-info">
          <div>手机号：{{ resultData.linkTel || '' }}</div>
          <div>评分：{{ resultData.resultMark }}分</div>
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
          <el-radio-group v-model="answerObj[item2.id]" class="radio-group-wrap" disabled>
            <el-radio class="radio-item" v-for="opt in item2.assessmentOptions" :key="opt.id" :label="opt.id">
              {{ opt.optionContent }}({{ opt.optionMark }}分)
            </el-radio>
          </el-radio-group>
        </div>
      </div>
    </div>
  </el-dialog>
</template>

<script>
export default {
  name: 'AssessmentResultDialog',
  props: {
    visible: { type: Boolean, default: false },
    resultData: { type: Object, default: () => ({}) }
  },
  data() {
    return {
      evaluateQuestionList: [],
      evaluateQuestionStandardsList: [],
      answerObj: {}
    }
  },
  watch: {
    resultData: {
      handler() {
        if (this.visible) {
          this.loadResultData()
        }
      },
      deep: true
    },
    visible(val) {
      if (val) {
        this.loadResultData()
      }
    }
  },
  methods: {
    async loadResultData() {
      const resultData = this.resultData || {}
      this.evaluateQuestionList = []
      this.evaluateQuestionStandardsList = []
      this.answerObj = {}
      if (!resultData.questionIds || !resultData.optionIds) {
        return
      }
      const questionArr = (resultData.questionIds || '').split(',')
      const optionArr = (resultData.optionIds || '').split(',')
      questionArr.forEach((qId, index) => {
        const selectedOptId = optionArr[index]
        this.getResultQuestion(qId, selectedOptId)
      })
      if (resultData.templateId) {
        this.getResultStandard(resultData.templateId)
      }
    },
    getResultQuestion(qId, optId) {
      this.$http.post('assessmentQuestion/queryOne', { id: qId }).then(res => {
        if (res.data.code === 200) {
          const questionItem = res.data.data || {}
          this.getResultQuestionOption(questionItem, qId, optId)
        }
      })
    },
    getResultStandard(templateId) {
      this.$http.post('assessmentStandard/queryList', { templateId }).then(res => {
        if (res.data.code === 200) {
          this.evaluateQuestionStandardsList = res.data.data || []
        }
      })
    },
    getResultQuestionOption(questionItem, qId, optId) {
      this.$http.post('assessmentOption/queryList', { questionId: qId }).then(res => {
        if (res.data.code === 200) {
          const list = res.data.data || []
          questionItem.assessmentOptions = list
          this.evaluateQuestionList.push(questionItem)
          this.$set(this.answerObj, qId, optId)
        }
      })
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

.section-title {
  font-size: 18px;
  font-weight: bold;
  color: #000;
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
</style>
