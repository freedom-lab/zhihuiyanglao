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
                <div class="th">姓名</div>
                <div class="td">{{tabForm.staffName}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">性别</div>
                <div class="td">{{ tabForm.sex | sexFormat }}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">年龄</div>
                <div class="td">{{tabForm.age}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">联系电话</div>
                <div class="td">{{tabForm.linkTel}}</div>
              </div>
            </el-col>

            <el-col :span="24">
              <div class="box-col">
                <div class="th">身份证号</div>
                <div class="td">{{tabForm.idCard}}</div>
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
            会员信息
          </div>
        </template>
        <div>
          <el-row class="all-table">
            <el-col :span="12">
              <div class="box-col">
                <div class="th">会员卡号</div>
                <div class="td">{{tabForm.memberCard}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">会员等级</div>
                <div class="td">{{tabForm.memberLevel}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">会员状态</div>
                <div class="td">{{tabForm.memberState | memberStateFormat}}</div>
              </div>
            </el-col>
            
            <el-col :span="6">
              <div class="box-col">
                <div class="th">押金</div>
                <div class="td">{{tabForm.cardDeposit}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">账户余额</div>
                <div class="td">{{tabForm.memberAmount}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">账户积分</div>
                <div class="td">{{tabForm.memberIntegral || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">消费上限阀值</div>
                <div class="td">{{tabForm.maxConsumption || '-'}}</div>
              </div>
            </el-col>
            
            <el-col :span="6">
              <div class="box-col">
                <div class="th">开卡人</div>
                <div class="td">{{tabForm.createName || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">推荐人</div>
                <div class="td">{{tabForm.refereeName || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">生效日期</div>
                <div class="td">{{tabForm.effectiveDate || '-'}}</div>
              </div>
            </el-col>
            <el-col :span="6">
              <div class="box-col">
                <div class="th">失效日期</div>
                <div class="td">{{tabForm.expirationDate || '-'}}</div>
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
    // 会员状态
    memberStateFormat(val) {
      switch (val) {
        case 1:
        case '1':
          return '正常';
        case 2:
        case '2':
          return '挂失';
        case 3:
        case '3':
          return '注销';
        case 4:
        case '4':
          return '失效';
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
      activeCollapses: ['1','2','3','4','5','6','7','8','9'],
      tabForm: {},
    };
  },
  mounted() {
    this.tabForm = this.elderForm || {}
    // 切换到当前组件就执行获取信息逻辑
    // this.initDefaultData()
  },
  methods: {
    // 初始化默认数据
    initDefaultData() {
      // this.getFormInfo()
    },
    handleChange(e){},
    async getFormInfo() {
      if(this.btnloading){
        return
      }
      this.tabForm = {}
      if(!this.elderForm.staffId){
        // this.$message.error('入住信息不存在')
        return
      }
      this.btnloading = true
      const params = {
        staffId: this.elderForm.staffId
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