<template>
  <div class="descriptions-table" v-loading="btnloading">
    <el-collapse v-model="activeCollapses" @change="handleChange">
      <el-collapse-item name="1">
        <template slot="title">
          <!-- 账户余额标题栏 -->
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('1')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            基本信息
            <!-- <span style="color:#999;font-weight:normal;">(账户余额: 0.00 充值金额: 0.00 欠费金额: 800.00)</span> -->
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="9">
              <div class="box-col">
                <div class="th">老人姓名</div>
                <div class="td">{{tabForm.elderName}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">身份证号</div>
                <div class="td">{{tabForm.idCard}}</div>
              </div>
            </el-col>
            <el-col :span="6" class="relativebox">
              <div class="box-col">
                <div class="th">照片</div>
                <div class="td">
                  <div class="imgAudit">
                    <el-image fit="scale-down" :preview-src-list="[elderForm.elderImg]" :src="elderForm.elderImg">
                      <div slot="error" class="image-slot">
                        <!-- <i class="el-icon-picture-outline"></i> -->
                      </div>
                    </el-image>
                  </div>
                </div>
              </div>
            </el-col>

            <el-col :span="9">
              <div class="box-col">
                <div class="th">年龄</div>
                <div class="td">{{tabForm.age}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">性别</div>
                <div class="td">{{tabForm.sex | sexFormat}}</div>
              </div>
            </el-col>

            <el-col :span="9">
              <div class="box-col">
                <div class="th">出生日期</div>
                <div class="td">{{tabForm.birthday}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">民族</div>
                <div class="td">{{tabForm.nation}}</div>
              </div>
            </el-col>

            <el-col :span="9">
              <div class="box-col">
                <div class="th">老人类别</div>
                <div class="td">{{tabForm.elderType | CH052Format}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">手机号码</div>
                <div class="td">{{tabForm.linkTel}}</div>
              </div>
            </el-col>
            <el-col :span="6" class="relativebox">
              <div class="box-col">
                <div class="th">二维码</div>
                <div class="td">
                  <div class="imgAudit">
                    <el-image fit="scale-down" :preview-src-list="[elderForm.elderCodeImage]" :src="elderForm.elderCodeImage">
                      <div slot="error" class="image-slot">
                        <!-- <i class="el-icon-picture-outline"></i> -->
                      </div>
                    </el-image>
                  </div>
                </div>
              </div>
            </el-col>

            <el-col :span="9">
              <div class="box-col">
                <div class="th">固定电话</div>
                <div class="td">{{tabForm.homeTel}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">血型</div>
                <div class="td">{{tabForm.bloodType}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">老人状态</div>
                <div class="td">{{tabForm.identityStatus}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">婚姻状况</div>
                <div class="td">{{tabForm.marryState}}</div>
              </div>
            </el-col>
            
            <el-col :span="9">
              <div class="box-col">
                <div class="th">医保类别</div>
                <div class="td">{{tabForm.medicalCategory | medicalCategoryFormat}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">文化程度</div>
                <div class="td">{{tabForm.degreeEducation | degreeEducationFormat}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">政治面貌</div>
                <div class="td">{{tabForm.politicalStatus | politicalFormat}}</div>
              </div>
            </el-col>
            
            <el-col :span="9">
              <div class="box-col">
                <div class="th">宗教信仰</div>
                <div class="td">{{tabForm.religionType | religionTypeFormat}}</div>
              </div>
            </el-col>
            <el-col :span="9">
              <div class="box-col">
                <div class="th">媒介渠道</div>
                <div class="td">{{tabForm.isCome | isComeFormat}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">打卡方式</div>
                <div class="td">{{tabForm.dd}}</div>
              </div>
            </el-col>

            <el-col :span="9">
              <div class="box-col">
                <div class="th">户籍区划</div>
                <div class="td">{{tabForm.pesidenceAreaName}} {{tabForm.pesidenceAreaCode}}</div>
              </div>
            </el-col>
            <el-col :span="15">
              <div class="box-col">
                <div class="th">户籍地址</div>
                <div class="td">{{tabForm.pesidenceAddress}}</div>
              </div>
            </el-col>
            
            <el-col :span="24">
              <div class="box-col">
                <div class="th">家庭住址</div>
                <div class="td">{{tabForm.homeAddress}}</div>
              </div>
            </el-col>

          </el-row>
        </div>
      </el-collapse-item>
      <el-collapse-item name="2">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('2')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            紧急联系人信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="8">
              <div class="box-col">
                <div class="th">联系人姓名</div>
                <div class="td">{{tabForm.emergencyContact}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">联系电话</div>
                <div class="td">{{tabForm.emergencyContactTel}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">与老人关系</div>
                <div class="td">{{tabForm.emergencyContactRelationship}}</div>
              </div>
            </el-col>
            
            <el-col :span="24">
              <div class="box-col">
                <div class="th">联系人地址</div>
                <div class="td">{{tabForm.emergencyContactAddress}}</div>
              </div>
            </el-col>

          </el-row>
        </div>
      </el-collapse-item>
      <el-collapse-item name="3">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('3')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            监护人信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="8">
              <div class="box-col">
                <div class="th">监护人姓名</div>
                <div class="td">{{tabForm.guardianContact}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">联系电话</div>
                <div class="td">{{tabForm.guardianContactTel}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">与老人关系</div>
                <div class="td">{{tabForm.guardianContactRelationship}}</div>
              </div>
            </el-col>
            
            <el-col :span="24">
              <div class="box-col">
                <div class="th">监护人地址</div>
                <div class="td">{{tabForm.guardianContactAddress}}</div>
              </div>
            </el-col>

          </el-row>
        </div>
      </el-collapse-item>
      <el-collapse-item name="4">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('4')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            健康状况
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="8">
              <div class="box-col">
                <div class="th">健康状况</div>
                <div class="td">{{tabForm.healthCondition | healthConditionFormat}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">能力等级</div>
                <div class="td">{{tabForm.abilityLevel | abilityLevelFormat}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否残疾</div>
                <div class="td">{{tabForm.isDisability | yonFormat}}</div>
              </div>
            </el-col>

            <el-col :span="8">
              <div class="box-col">
                <div class="th">残疾类别</div>
                <div class="td">{{tabForm.disabilityType}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">残疾等级</div>
                <div class="td">{{tabForm.disabilityLevel}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">残疾证号</div>
                <div class="td">{{tabForm.disabilityCard}}</div>
              </div>
            </el-col>
            
            <el-col :span="24">
              <div class="box-col">
                <div class="th">主要疾病</div>
                <div class="td">{{tabForm.majorDiseasesName}}：{{tabForm.majorDiseases}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">其他疾病</div>
                <div class="td">{{tabForm.majorDiseasesOther}}</div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-collapse-item>

      <el-collapse-item name="5">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('5')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            老人近况
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="16">
              <div class="box-col">
                <div class="th">兴趣爱好</div>
                <div class="td">{{tabForm.hobby}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">性格</div>
                <div class="td">{{tabForm.characterType | characterTypeFormat}}</div>
              </div>
            </el-col>
            <el-col :span="16">
              <div class="box-col">
                <div class="th">饮食习惯</div>
                <div class="td">{{tabForm.eatingHabits}}</div>
              </div>
            </el-col>

            <el-col :span="24">
              <div class="box-col">
                <div class="th">禁忌事项</div>
                <div class="td">{{tabForm.taboo}}</div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-collapse-item>
      
      <el-collapse-item name="6">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('6')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            标签信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否独居</div>
                <div class="td">{{tabForm.isAlone | yonFormat}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否孤老</div>
                <div class="td">{{tabForm.isLonelyOld | yonFormat}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否空巢</div>
                <div class="td">{{tabForm.isEmptyNest | yonFormat}}</div>
              </div>
            </el-col>

            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否失智</div>
                <div class="td">{{tabForm.isDementia | yonFormat}}</div>
              </div>
            </el-col>
            <el-col :span="8">
              <div class="box-col">
                <div class="th">是否参加社保</div>
                <div class="td">{{tabForm.isSocialInsurance | yonFormat}}</div>
              </div>
            </el-col>
            <el-col :span="16">
              <div class="box-col">
                <div class="th">是否享受长护险</div>
                <div class="td">{{tabForm.isLtci | yonFormat}}</div>
              </div>
            </el-col>

            <el-col :span="24">
              <div class="box-col">
                <div class="th" style="width: 200px;">是否计划生育特殊困难家庭对象</div>
                <div class="td">{{tabForm.isExtremelyPoor | yonFormat}}</div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-collapse-item>
      
      <el-collapse-item name="7">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('7')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            证件信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="12" class="relativebox">
              <div class="box-col">
                <div class="th">身份证正面</div>
                <div class="td">
                  <div class="imgAudit">
                    <el-image fit="scale-down" :preview-src-list="[elderForm.elderImg]" :src="elderForm.elderImg">
                      <div slot="error" class="image-slot">
                        <!-- <i class="el-icon-picture-outline"></i> -->
                      </div>
                    </el-image>
                  </div>
                </div>
              </div>
            </el-col>
            <el-col :span="12" class="relativebox">
              <div class="box-col">
                <div class="th">身份证反面</div>
                <div class="td">
                  <div class="imgAudit">
                    <el-image fit="scale-down" :preview-src-list="[elderForm.elderImg]" :src="elderForm.elderImg">
                      <div slot="error" class="image-slot">
                        <!-- <i class="el-icon-picture-outline"></i> -->
                      </div>
                    </el-image>
                  </div>
                </div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-collapse-item>

      <el-collapse-item name="8">
        <template slot="title">
          <div class="collapse-title">
            <i v-if="activeCollapses.includes('8')" class="collapse-icon el-icon-arrow-down"></i>
            <i v-else class="collapse-icon el-icon-arrow-right"></i>
            备注信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="24">
              <div class="box-col">
                <div class="th">备注</div>
                <div class="td">{{tabForm.remark}}</div>
              </div>
            </el-col>
          </el-row>
        </div>
      </el-collapse-item>

    </el-collapse>
  </div>
</template>

<script>
export default {
  name: 'userBaseInfo',
  props: {
    elderForm: {
      type: Object,
      default: () => {
        return {}
      }
    },
  },
  filters: {
    sexFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '男';
        case 2:
        case '2':
          return '女';
      
        default:
          return val || '-';
      }
    },
    // 老人类别
    CH052Format(val) {
      switch (val) {
        case 1:
        case '1':
          return '自理老人';
        case 2:
        case '2':
          return '介助（半自理）老人';
        case 3:
        case '3':
          return '介护（失能）老人';
        case 4:
        case '4':
          return '特困供养老人';
        case 5:
        case '5':
          return '优抚老人';
        case 6:
        case '6':
          return '残疾老人';
        case 7:
        case '7':
          return '其他老人';
        default:
          return val || '-';
      }
    },
    // 医保类别
    medicalCategoryFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '城乡居民基本医疗保险';
        case 2:
        case '2':
          return '城镇职工基本医疗保险';
        case 3:
        case '3':
          return '离休医保';
        case 4:
        case '4':
          return '异地职工医保';
        case 5:
        case '5':
          return '异地居民医保';
        case 6:
        case '6':
          return '原新农合';
        case 7:
        case '7':
          return '大病保险';
        case 8:
        case '8':
          return '公务员补助医保';
        case 9:
        case '9':
          return '优抚医疗保障';
        case 10:
        case '10':
          return '特困人员医疗救助';
        case 11:
        case '11':
          return '低保医保救助';
        case 12:
        case '12':
          return '残疾人医保补助';
        case 13:
        case '13':
          return '商业医疗保险';
        case 14:
        case '14':
          return '单位补充医保';
        case 15:
        case '15':
          return '企业大病统筹';
        case 16:
        case '16':
          return '生育医疗保险';
        case 17:
        case '17':
          return '工伤医疗';
        case 18:
        case '18':
          return '无医保';
        case 19:
        case '19':
          return '离休统筹医疗';
        case 20:
        case '20':
          return '其他医保类型';
        default:
          return val || '-';
      }
    },
    // 文化程度
    degreeEducationFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '文盲/半文盲';
        case 2:
        case '2':
          return '小学';
        case 3:
        case '3':
          return '初中';
        case 4:
        case '4':
          return '高中/中专';
        case 5:
        case '5':
          return '大专';
        case 6:
        case '6':
          return '本科';
        case 7:
        case '7':
          return '硕士及以上';
        default:
          return val || '-';
      }
    },
    // 政治面貌
    politicalFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '中共党员';
        case 2:
        case '2':
          return '中共预备党员';
        case 3:
        case '3':
          return '共青团员';
        case 4:
        case '4':
          return '民主党派';
        case 5:
        case '5':
          return '群众';
        default:
          return val || '-';
      }
    },
    // 宗教信仰
    religionTypeFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '无宗教信仰';
        case 2:
        case '2':
          return '佛教';
        case 3:
        case '3':
          return '道教';
        case 4:
        case '4':
          return '伊斯兰教';
        case 5:
        case '5':
          return '天主教';
        case 6:
        case '6':
          return '基督教';
        case 7:
        case '7':
          return '其他宗教';
        default:
          return val || '-';
      }
    },
    // 媒介渠道
    isComeFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '批量导入';
        case 2:
        case '2':
          return '接口上报';
        case 3:
        case '3':
          return '后台新增';
        case 4:
        case '4':
          return '用户注册';
        case 5:
        case '5':
          return '管家新增';
        case 6:
        case '6':
          return '采集新增';
        default:
          return val || '-';
      }
    },
    // 健康状况
    healthConditionFormat(val) {
      switch (val) {
        // case 1:
        // case '1':
        //   return '';
        default:
          return val || '-';
      }
    },
    // 能力等级
    abilityLevelFormat(val) {
      switch (val) {
        // case 1:
        // case '1':
        //   return '';
        default:
          return val || '-';
      }
    },
    // 性格
    characterTypeFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '外向';
        case 2:
        case '2':
          return '内向';
        default:
          return val || '-';
      }
    },
  },
  watch: {
    // showDialog: {
    //   handler(val) {
    //     if (this.labelType == 'add' && val) {
    //       this.curShowDialog = val;
    //       this.initDefaultData();
    //       console.log(this.detailform,999,val);
    //     }
    //   },
    //   deep: true
    // }
  },
  computed: {
    // visible: {
    //   get() {
    //     return this.curShowDialog;
    //   },
    //   set(val) {
    //     this.curShowDialog = val;
    //     this.$parent.showDialog = val
    //   }
    // }
  },
  data() {
    return {
      btnloading: false,
      activeCollapses: ['1','2','3','4','5','6','7','8',],
      tabForm: {},
    };
  },
  mounted() {
    this.tabForm = this.elderForm || {}
    // 切换到当前组件就执行获取信息逻辑
    this.initDefaultData()
  },
  methods: {
    // 初始化默认数据
    initDefaultData() {
      this.getFormInfo()
    },
    handleChange(e){},
    async getFormInfo() {
      if(this.btnloading){
        return
      }
      this.tabForm = {}
      if(!this.elderForm.elderId){
        // this.$message.error('入住信息不存在')
        return
      }
      this.btnloading = true
      const params = {
        elderId: this.elderForm.elderId
      }
      try {
        const res = await this.$http.post('/elderBaseInfo/queryOne', params)
        if (res.data.code == 200) {
          this.tabForm = res.data.data
        } else {
          this.$message(res.data.message || '有错误')
        }
        this.btnloading = false
      } catch (error) {
        this.btnloading = false
      }
    },
  }
};
</script>

<style lang="scss" scoped>
.imgAudit{
    width: 115px;
    height: 117px;
    position: relative;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    img{
      width: 100%;
      height: 100%;
    }
}
</style>