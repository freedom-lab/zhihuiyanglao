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
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="6">
              <div class="box-col">
                <div class="th">身高（厘米）</div>
                <div class="td">{{tabForm.height}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">体重（千克）</div>
                <div class="td">{{tabForm.weight}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">腰围（厘米）</div>
                <div class="td">{{tabForm.waist}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">血型</div>
                <div class="td">{{tabForm.sex | sexFormat}}</div>
              </div>
            </el-col>
            
            <el-col :span="24">
              <div class="box-col">
                <div class="th">残疾类型</div>
                <div class="td">{{tabForm.disabilityType}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">主要疾病</div>
                <div class="td">{{tabForm.majorDiseasesName}}：{{tabForm.majorDiseases}}</div>
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
            个人史
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="24">
              <div class="box-col">
                <div class="th">吸烟史</div>
                <div class="td">{{tabForm.smokingHabits | smokingHabitsFormat}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">饮酒史</div>
                <div class="td">{{tabForm.drinkingHabits | drinkingHabitsFormat}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">暴露史</div>
                <div class="td">{{tabForm.exposureHistory | exposureHistoryFormat}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">过敏史</div>
                <div class="td">{{tabForm.allergicHistory | allergicHistoryFormat}}</div>
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
            一般情况
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="24">
              <div class="box-col">
                <div class="th">饮食</div>
                <div class="td">{{tabForm.dietaryHabit | dietaryHabitFormat}}</div>
              </div>
            </el-col><el-col :span="24">
              <div class="box-col">
                <div class="th">二便</div>
                <div class="td">{{tabForm.relieveBowels | relieveBowelsFormat}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">睡眠</div>
                <div class="td">{{tabForm.sleepQuality | sleepQualityFormat}}</div>
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
            手术史
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="12">
              <div class="box-col">
                <div class="th">手术名称1</div>
                <div class="td">{{tabForm.operationNameOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">手术时间1</div>
                <div class="td">{{tabForm.operationTimeOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">手术名称2</div>
                <div class="td">{{tabForm.operationNameTwo || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">手术时间2</div>
                <div class="td">{{tabForm.operationTimeTwo || '-'}}</div>
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
            外伤史
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="12">
              <div class="box-col">
                <div class="th">外伤名称1</div>
                <div class="td">{{tabForm.traumaNameOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">外伤时间1</div>
                <div class="td">{{tabForm.traumaTimeOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">外伤名称2</div>
                <div class="td">{{tabForm.traumaNameTwo || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">外伤时间2</div>
                <div class="td">{{tabForm.traumaTimeTwo || '-'}}</div>
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
            输血史
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="12">
              <div class="box-col">
                <div class="th">输血名称1</div>
                <div class="td">{{tabForm.bloodNameOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">输血时间1</div>
                <div class="td">{{tabForm.bloodTimeOne || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">输血名称2</div>
                <div class="td">{{tabForm.bloodNameTwo || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="12">
              <div class="box-col">
                <div class="th">输血时间2</div>
                <div class="td">{{tabForm.bloodTimeTwo || '-'}}</div>
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
            家族史
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="24">
              <div class="box-col">
                <div class="th">父亲</div>
                <div class="td">{{tabForm.fatherDiseaseIds || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">母亲</div>
                <div class="td">{{tabForm.motherDiseaseIds || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">子女</div>
                <div class="td">{{tabForm.childrenDiseaseIds || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">兄弟姐妹</div>
                <div class="td">{{tabForm.brotherDiseaseIds || '-'}}</div>
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
            其他
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="24">
              <div class="box-col">
                <div class="th">遗传病史</div>
                <div class="td">{{tabForm.geneticDisease || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="24">
              <div class="box-col">
                <div class="th">健康指导</div>
                <div class="td">{{tabForm.healthGuidance || '-'}}</div>
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
  name: 'drawerTabInfo',
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
    // 吸烟史
    smokingHabitsFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '无';
        case 2:
        case '2':
          return '已戒';
        case 3:
        case '3':
          return '每日10支以内';
        case 4:
        case '4':
          return '每日1包';
        case 5:
        case '5':
          return '每日2包或以上';
        default:
          return val || '-';
      }
    },
    // 饮酒史
    drinkingHabitsFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '无';
        case 2:
        case '2':
          return '已戒';
        case 3:
        case '3':
          return '偶尔';
        case 4:
        case '4':
          return '经常';
        case 5:
        case '5':
          return '每天';
        default:
          return val || '-';
      }
    },
    // 暴露史
    exposureHistoryFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '无';
        case 2:
        case '2':
          return '化学品';
        case 3:
        case '3':
          return '毒物';
        case 4:
        case '4':
          return '射线';
        case 5:
        case '5':
          return '其它';
        default:
          return val || '-';
      }
    },
    // 过敏史
    allergicHistoryFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '无';
        case 2:
        case '2':
          return '青霉素';
        case 3:
        case '3':
          return '磺胺';
        case 4:
        case '4':
          return '链霉素';
        case 5:
        case '5':
          return '其它';
        default:
          return val || '-';
      }
    },
    // 饮食 饮食(1.普食 2.软食 3.吞咽困难 4.饮水呛咳 5.鼻饲 6.其他)
    dietaryHabitFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '普食';
        case 2:
        case '2':
          return '软食';
        case 3:
        case '3':
          return '吞咽困难';
        case 4:
        case '4':
          return '饮水呛咳';
        case 5:
        case '5':
          return '鼻饲';
        case 6:
        case '6':
          return '其他';
        default:
          return val || '-';
      }
    },
    // 二便 1.正常 2.便秘 3.排尿困难 4.留置尿管 5.其他
    relieveBowelsFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '正常';
        case 2:
        case '2':
          return '便秘';
        case 3:
        case '3':
          return '排尿困难';
        case 4:
        case '4':
          return '留置尿管';
        case 5:
        case '5':
          return '其他';
        default:
          return val || '-';
      }
    },
    // 睡眠 1.3-5小时2.5-7小时3.7-9小时4.9-12小时
    sleepQualityFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '3-5小时';
        case 2:
        case '2':
          return '5-7小时';
        case 3:
        case '3':
          return '7-9小时';
        case 4:
        case '4':
          return '9-12小时';
        case 5:
        case '5':
          return '其它';
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
    // 初始化默认数据（和截图中的内容一致）
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
        const res = await this.$http.post('/healthBaseInfo/queryOne', params)
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