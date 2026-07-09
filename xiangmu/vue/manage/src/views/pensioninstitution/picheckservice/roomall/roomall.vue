<template>
  <div class="page-outer">
    <div class="page-container">
      <el-card class="pure-card page-card">
        <div class="card-content">
          <!-- 顶部楼栋栏 -->
          <div class="content-top flex">
            <img :src="buildimg" alt="" class="m-l-10" />
            <div class="m-l-10 m-r-10">楼栋名称</div>
            <div class="topcon">
              <div class="list m-l-20" :class="item.id==curBuilding.id?'light':''" v-for="item,index in BuildingList" :key="index" @click="changeBuilding(item)">
                <span>{{item.buildingName}}</span>
              </div>
            </div>
            <div>
              <el-switch
                v-model="switchVal"
                active-text="展示全部"
                inactive-text="空闲床位查询"
                active-color="#fEcE0E"
                inactive-color="#13ce66"
                @change="handleSwitchChange"
              ></el-switch>
            </div>
          </div>

          <div class="container-content flex" v-loading="loading">
            <!-- 左侧楼层栏 -->
            <el-card class="pure-card cc-left">
              <div class="header-floor flex flex-direction-column align-items-center">
                <img :src="headerfloorimg" alt="" style="height: 25px; object-fit: cover;" />
                <span>所在楼层</span>
              </div>
              <div class="floor-ul">
                <div class="floor-li" :class="floorIndex == index ? 'active-f' : ''" v-for="item,index in floorList" :key="index" @click="handlefloorClick(item,index)">
                  {{item.floorDesc}}
                </div>
              </div>
            </el-card>

            <!-- 右侧床位主区域 -->
            <div class="cc-right">
              <!-- 顶部统计行 -->
              <div class="flex stats-top">
                <div class="stats-item stats-first">
                  <img :src="topstaticimg" alt="" style="height: 25px; object-fit: cover;" />
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #409eff;">
                    {{statsInfo.totalRoomCount || 0}}
                  </div>
                  <div class="si-label">房间总数</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #21aa06;">
                    {{statsInfo.totalBedCount || 0}}
                  </div>
                  <div class="si-label">床位总数</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #ef8d19;">
                    {{statsInfo.freeBedCount || 0}}
                  </div>
                  <div class="si-label">当前空闲</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #21aa06;">
                    {{statsInfo.checkInBedCount || 0}}
                  </div>
                  <div class="si-label">入住数</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #21aa06;">
                    {{statsInfo.testBedCount || 0}}
                  </div>
                  <div class="si-label">试住数</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #5476c3;">
                    {{statsInfo.reserveBedCount || 0}}
                  </div>
                  <div class="si-label">预订数</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #ef8d19;">
                    {{statsInfo.changeBedCount || 0}}
                  </div>
                  <div class="si-label">变更占用</div>
                </div>
                <div class="stats-item">
                  <div class="si-num" style="font-family: SimHei; color: #4f84e7;">
                    {{statsInfo.occupancyRate || 0}}
                  </div>
                  <div class="si-label">入住率</div>
                </div>
              </div>

              <!-- 房间卡片容器 -->
              <div class="room">
                <div class="room-ul" style="">
                  <!-- 101房间 -->
                  <div class="el-col el-col-12 room-li" v-for="item,index in displayRoomList" :key="index" style="">
                    <el-card class="boxs is-always-shadow" style="border-radius: 5px;">
                      <div class="el-card__body" style="padding: 0;">
                        <div class="flex room-top">
                          <span>房间朝向({{item.roomOrientation || '-'}})</span>
                          <span class="font-weight-600" style="font-size: 15px;">{{item.roomName}}({{item.bedCount}})</span>
                          <span>采光情况({{item.roomLighted || '-'}})</span>
                        </div>
                        <div class="bed over-flow">
                          <!-- 101-1 入住 -->
                          <el-card class="bed-list" v-for="beditem,bindex in item.insBaseBedInfo" :key="bindex">
                            <div class="" @click="edit(beditem)">
                              <div class="bed-top w100">
                                <span class="tip font-14" :class="tipclass(beditem.bedState)">{{beditem.bedName}}</span>
                                <div>
                                  <el-dropdown trigger="hover" @command="e=>handleBed(e,beditem)">
                                    <span class="el-dropdown-link pointer">
                                      <i class="el-icon-menu el-icon--right"></i>
                                      {{beditem.bedState | bedstatusFormat}}
                                    </span>
                                    <el-dropdown-menu slot="dropdown">
                                      <el-dropdown-item command="1"><i class="el-icon-view"></i>入住详情</el-dropdown-item>
                                      <el-dropdown-item command="2" disabled><i class="el-icon-user-solid"></i>预订床位</el-dropdown-item>
                                      <el-dropdown-item command="3" disabled><i class="el-icon-s-custom"></i>快捷入住</el-dropdown-item>
                                    </el-dropdown-menu>
                                  </el-dropdown>
                                </div>
                              </div>
                              <div class="bed-middle flex align-items-center justify-content-between">
                                <div class="flex align-items-center">
                                  <el-image style="width: 36px; height: 36px; border-radius: 50%; flex-shrink: 0; margin-right: 10px;" :src="beditem.bedState==3?bedenterimg:beditem.bedState==1?bedemptyimg:bedreserveimg"></el-image>
                                  <div class="flex flex-direction-column">
                                    <div>{{beditem.elderName || '-'}} {{beditem.sex || '-'}}/{{beditem.age || '-'}}</div>
                                    <div>护理等级：{{beditem.nursingLevelName || '-'}}</div>
                                  </div>
                                </div>
                                <el-image style="width: 27px; height: 27px; margin: 2px 2px 0 0; border-radius: 5px; border: 1px solid #eeeded; flex-shrink: 0;" :src="q2qbackimg" :preview-src-list="[q2qbackimg]" @click.stop></el-image>
                              </div>
                              <div class="flex align-items-center justify-content-between p-l-10 p-r-10">
                                <span class="m-t-10">入住时间：{{beditem.checkDate || '/-/-/'}}</span>
                                <span class="m-b-3 text-red">{{beditem.bedDayPrice || 0}}元/日<br>{{beditem.bedMonthPrice || 0}}元/月</span>
                              </div>
                            </div>
                          </el-card>
                        </div>
                      </div>
                    </el-card>
                  </div>
                </div>
                <!-- 分页 -->
                <!-- <div class="block">
                  <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
                    :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
                    layout="total, sizes, prev, pager, next, jumper" :total="total">
                  </el-pagination>
                </div> -->
              </div>
            </div>
          </div>
        </div>
      </el-card>
    </div>
    <!-- 用户详情抽屉 -->
    <el-drawer
      ref="drawer"
      title="用户详情"
      class="ljd-drawer"
      direction="ttb"
      :visible.sync="drawer"
      size="96%"
      :with-header="false"
      :show-close="true"
    >
      <div class="ljd-drawer-content" style="">
        <div class="drawer-close-btn" @click="closeDrawer">
          <i class="el-icon-close"></i>
        </div>

        <!-- 顶部头部：头像+姓名+切换箭头+标签 -->
        <div class="top-header flex align-items-center" style="">
          <div class="user-avatar" style="width:40px;height:40px;background:#409eff;border-radius:6px;display:flex;align-items:center;justify-content:center;margin-right:10px;">
            <i class="el-icon-user-solid" style="color:#fff;font-size:24px;"></i>
          </div>
          <span class="username" style="font-size:20px;font-weight:bold;margin-right:10px;">{{form.elderName}}</span>
          <!-- <div class="arrow-group flex">
            <el-button icon="el-icon-arrow-left" size="mini" circle></el-button>
            <el-button icon="el-icon-arrow-right" size="mini" circle></el-button>
          </div> -->
          <el-tag size="small" style="margin-left:20px;background:#e6f7ff;color:#1890ff;border:none;">{{elderForm.nursingLevelName}}</el-tag>
        </div>

        <!-- 第一行老人基础统计栏 -->
        <div class="info-bar flex">
          <div class="info-item">
            <span style="color:#666;font-size:13px;">年龄</span>
            <div style="font-size:14px;">{{elderCheckInfo.age}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">性别</span>
            <div style="font-size:14px;">{{elderCheckInfo.sex | sexFormat}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">手机号码</span>
            <div style="font-size:14px;">{{elderCheckInfo.linkTel}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">入住日期</span>
            <div style="font-size:14px;">{{elderCheckInfo.checkDate}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">已住天数</span>
            <div style="font-size:14px;">{{elderCheckInfo.stayDays}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">护理等级</span>
            <div style="font-size:14px;">{{elderCheckInfo.nursingLevelName}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">入住床位</span>
            <div style="font-size:14px;">{{elderCheckInfo.bedName}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">责任护工组</span>
            <div style="font-size:14px;">{{elderCheckInfo.nursingGroupName}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">入院方式</span>
            <div style="font-size:14px;">{{elderCheckInfo.checkType | checkTypeFormat}}</div>
          </div>
        </div>

        <!-- 标签页导航 -->
        <el-tabs v-model="activeTab" type="card" tab-position="top" style="" @tab-click="tabClick">
          <el-tab-pane label="基本资料" name="drawerTabInfo1"></el-tab-pane>
          <el-tab-pane label="健康档案" name="drawerTabInfo2"></el-tab-pane>
          <el-tab-pane label="亲属信息" name="drawerTabInfo3"></el-tab-pane>
          <el-tab-pane label="体检信息" name="drawerTabInfo4"></el-tab-pane>
          <el-tab-pane label="签约信息" name="drawerTabInfo5"></el-tab-pane>
          <el-tab-pane label="资金信息" name="drawerTabInfo6"></el-tab-pane>
          <el-tab-pane label="护理计划" name="drawerTabInfo7"></el-tab-pane>
          <el-tab-pane label="护理记录" name="drawerTabInfo8"></el-tab-pane>
          <el-tab-pane label="照护记录" name="drawerTabInfo9"></el-tab-pane>
          <!-- <el-tab-pane label="智能监控" name="drawerTabInfo10"></el-tab-pane> -->
          <el-tab-pane label="评估记录" name="drawerTabInfo11"></el-tab-pane>
          <el-tab-pane label="变更记录" name="drawerTabInfo12"></el-tab-pane>
          <el-tab-pane label="医疗记录" name="drawerTabInfo13"></el-tab-pane>
          <el-tab-pane label="充值记录" name="drawerTabInfo14"></el-tab-pane>
          <el-tab-pane label="收费标准" name="drawerTabInfo15"></el-tab-pane>
          <el-tab-pane label="请假记录" name="drawerTabInfo16"></el-tab-pane>
          <el-tab-pane label="增值服务" name="drawerTabInfo17"></el-tab-pane>
        </el-tabs>
        

        <!-- 基本资料面板 -->
        <div class="base-panel">
          <component ref="drawerTabInfo" :is="currentComponent" :elderForm="elderForm"></component>
        </div>
        <!-- 底部操作按钮 -->
        <!-- <div class="btn-bottom flex" style="position:sticky;bottom:-20px;background:#fff;padding:16px 0;margin-top:30px;border-top:1px solid #eee;">
          <el-button @click="drawer = false">返回</el-button>
          <el-button size="small" type="primary" @click="handleSave2">保存</el-button>
        </div> -->
      </div>
    </el-drawer>
  </div>
</template>

<script>
// 基本资料
import drawerTabInfo1 from './components/drawerTabInfo1.vue';
// 健康档案
import drawerTabInfo2 from './components/drawerTabInfo2.vue';
// 亲属信息
import drawerTabInfo3 from './components/drawerTabInfo3.vue';
// 体检信息
import drawerTabInfo4 from './components/drawerTabInfo4.vue';
// 签约信息
import drawerTabInfo5 from './components/drawerTabInfo5.vue';
// 资金信息
import drawerTabInfo6 from './components/drawerTabInfo6.vue';
// 护理计划
import drawerTabInfo7 from './components/drawerTabInfo7.vue';
// 护理记录
import drawerTabInfo8 from './components/drawerTabInfo8.vue';
// 照护记录
import drawerTabInfo9 from './components/drawerTabInfo9.vue';
// 评估记录
import drawerTabInfo11 from './components/drawerTabInfo11.vue';
// 变更记录
import drawerTabInfo12 from './components/drawerTabInfo12.vue';
// 医疗记录
import drawerTabInfo13 from './components/drawerTabInfo13.vue';
// 充值记录
import drawerTabInfo14 from './components/drawerTabInfo14.vue';
// 收费标准
import drawerTabInfo15 from './components/drawerTabInfo15.vue';
// 请假记录
import drawerTabInfo16 from './components/drawerTabInfo16.vue';
// 增值服务
import drawerTabInfo17 from './components/drawerTabInfo17.vue';
export default {
  name: "BedManage",
  components: {
      drawerTabInfo1,
      drawerTabInfo2,
      drawerTabInfo3,
      drawerTabInfo4,
      drawerTabInfo5,
      drawerTabInfo6,
      drawerTabInfo7,
      drawerTabInfo8,
      drawerTabInfo9,
      drawerTabInfo11,
      drawerTabInfo12,
      drawerTabInfo13,
      drawerTabInfo14,
      drawerTabInfo15,
      drawerTabInfo16,
      drawerTabInfo17,
  },
  data() {
    return {
      currentComponent: null,
      // 顶部开关
      switchVal: true,
      BuildingList: [],
      // 左侧楼层数据
      floorList: [],
      buildimg: require("@/assets/images/instituionSystem/bed/build.png"),
      headerfloorimg: require("@/assets/images/instituionSystem/bed/header-floor.png"),
      topstaticimg: require("@/assets/images/instituionSystem/bed/static.png"),
      bedemptyimg: require("@/assets/images/instituionSystem/bed/bed-empty-1.png"),
      bedenterimg: require("@/assets/images/instituionSystem/bed/bed-enter-1.png"),
      bedreserveimg: require("@/assets/images/instituionSystem/bed/bed-reserve-1.png"),
      q2qbackimg: require("@/assets/images/instituionSystem/q2qback.png"),
      drawer: false,
      loading: false,
      form: {},
      elderForm: {},//入驻老人基础信息
      elderCheckInfo: {}, //入驻信息
      rules: {
        name: [
          { required: true, message: '请输入用户名称', trigger: 'blur' },
        ],
        loginName: [
          { required: true, message: '请输入用户账号', trigger: 'blur' },
        ],
        passwordText: [
          { required: true, message: '请输入用户密码', trigger: 'blur' },
        ],
        lifeTime: [
          { required: true, message: '请选择用户有效期', trigger: 'change' },
        ],
        longProductsCode: [
          { required: true, message: '请选择授权产品', trigger: 'change' },
        ],
      },
      total: 0,
      queryInfo: {
        pageSize: 4,
        pageCount: 1,
        currPage: 1,
        condition: {
        }
      },
      tableData: [],
      allTableData: [],
      userInfo: {},
      activeTab: 'drawerTabInfo1',
      curBuilding: {},// 当前楼栋信息
      curBuildingInfo: {}, // 当前楼栋详情
      curFloor: {},// 当前楼层信息
      floorIndex: -1,
      // isShowFree: false,
    };
  },
  
  filters: {
    bedstatusFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '空闲';
        case 2:
        case '2':
          return '预定';
        case 3:
        case '3':
          return '入住';
        case 4:
        case '4':
          return '试住';
        case 5:
        case '5':
          return '变更占用';
      
        default:
          return '';
      }
    },
    sexFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '男';
        case 2:
        case '2':
          return '女';
      
        default:
          return '-';
      }
    },
    checkTypeFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '入住养老院';
        case 2:
        case '2':
          return '入住公寓';
      
        default:
          return '-';
      }
    },
  },
  computed: {
    statsInfo(){
      return this.floorIndex<0?this.curBuildingInfo:this.curFloor
    },
    displayRoomList(){
      return this.floorIndex<0?this.allTableData:this.tableData
    },
  },
  created() {
    try{
      this.userInfo = JSON.parse(localStorage.getItem("userInfo"))?.userInfo
    }catch(e){}
    this.getInsBaseBuildingList()
    // this.getList()
  },
  methods: {
    // 获取当前楼层
    tipclass(status) {
      switch (status) {
        case 1:
        case '1':
          return 'bg-warning';
        case 2:
        case '2':
          return 'bg-blue';
        case 3:
        case '3':
          return 'bg-sussess';
        case 4:
        case '4':
          return 'bg-yellowgreen';
        case 5:
        case '5':
          return 'bg-purple';
      
        default:
          return 'bg-info';
      }
    },
    async getInsBaseBuildingList() {
      const params = {
        // id: this.productInfo.id
      }
      const res = await this.$http.post('/insBaseBuildingInfo/queryList', params)
      if (res.data.code == 200) {
        this.BuildingList = res.data.data
        this.curBuilding = this.BuildingList[0]
        this.getInsBaseBuildingDetail()
      } else {
        this.$message(res.data.message || '有错误')
      }
    },
    handleSwitchChange(e){
      console.log(e, this.switchVal)
      this.getInsBaseBuildingDetail()
    },
    changeBuilding(row){
      this.curBuilding = row
      this.getInsBaseBuildingDetail()
    },
    async getInsBaseBuildingDetail() {
      this.loading = true
      this.floorIndex = -1
      const params = {
        id: this.curBuilding.id,
        isShowFree: this.switchVal?'0':'1',
      }
      const res = await this.$http.post('/insBaseBuildingInfo/queryBuildingDetails', params)
      this.loading = false
      if (res.data.code == 200) {
        this.tableData = []
        this.allTableData = []
        this.curBuildingInfo = res.data.data
        this.floorList = res.data.data.floorInfoList.map(item=>{
          item.roomInfoList = item.roomInfoList.map(roomitem=>{
            roomitem.bedCount = roomitem.insBaseBedInfo?.length || 0
            return roomitem
          })
          this.allTableData.push(...item.roomInfoList)
          item.floorDesc = `${item.floorName}（空闲：${item.freeBedCount}）`
          return item
        }) || []
      } else {
        this.$message(res.data.message || '有错误')
      }
    },
    //获取数据
    getList() {
      var that = this;
      that.loading = true
      // that.queryInfo.condition.isSigning = that.activeName == '1' ? 1 : 0
      that.$http.post("/userInfo/list", that.queryInfo).then( (response)=> {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage
          that.tableData = response.data.data.data.map(item => {
            return {
              ...item,
              roomName: "1层-01房", // 房间名称
              roomType: "四人间",    // 房型：四人间/两人间
              direction: "朝北",     // 朝向
              bedCount: 4,           // 床位数量2/4
              isWholeRoom: false,    // 是否包房（右上角"包"标记）
              // 价格字段
              shareMonthPrice: 150,
              wholeMonthPrice: 300,
              shareDayPrice: 5,
              wholeDayPrice: 10,
              // 床位列表 status: 0-空闲 1-使用中 2-预定
              bedList: [
              { label: '1层-01-01', status: '1', userName: '', gender: '' },
              { label: '1层-01-02', status: '1', userName: '王琪', gender: '男' },
              { label: '1层-01-03', status: '2', userName: '蓝天', gender: '男' },
              { label: '1层-01-04', status: '0', userName: '', gender: '' },
              ],
            }
          });
        }
      });
    },
    handlefloorClick(row, findex) {
      // console.log(tab, event);
      // this.search()
      this.curFloor = row
      this.tableData = row.roomInfoList
      this.floorIndex = this.floorIndex == findex ? -1 : findex
    },
    tabClick(e){
      console.log('tab页：',e,this.activeTab)
      this.currentComponent = this.activeTab
      this.$nextTick(()=>{
        this.$refs.drawerTabInfo.initDefaultData()
      })
    },
    closeDrawer(){
      this.$refs.drawer.closeDrawer();
    },
    // 保存
    handleSave() {
      var that = this;
      that.$refs.addform.validate(valid => {
        if (!valid) return;
        const _form = JSON.parse(JSON.stringify(that.form))
        _form.password = that.$md5(that.form.passwordText)
        that.$http.post("/userInfo/add", _form).then( (response)=> {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "保存成功",
              showClose: true,
            });
            that.showDialog = false
            this.drawer = false
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
      });

    },
    // 编辑
    handleSave2() {
      var that = this;
      that.$refs.editform.validate(valid => {
        if (!valid) return;
        const _form = JSON.parse(JSON.stringify(that.form))
        _form.password = that.$md5(that.form.passwordText)
        that.$http.post("/userInfo/update", _form).then( (response)=> {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "保存成功",
              showClose: true,
            });
            that.showDialog = false
            this.drawer = false
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
      });

    },
    //修改
    async edit(row) {
      this.drawer = true;
      this.labelType = 'edit'
      this.activeTab = 'drawerTabInfo1'
      this.form = JSON.parse(JSON.stringify(row))
      this.currentComponent = 'drawerTabInfo1'
      await this.getElderCheckInfo()
      await this.getElderBaseInfo()
      this.$nextTick(()=>{
        this.$refs.drawerTabInfo.initDefaultData()
      })
    },
    handleBed(e,row) {
      switch (e) {
        case 1:
        case '1':
          // 入住详情
          if(row.bedState != 1){
            this.edit(row)
          }
          return;
        case 2:
        case '2':
          // 预订床位
          return;
        case 3:
        case '3':
          // 快捷入住
          return;
      
        default:
          return '';
      }
    },
    
    async getElderCheckInfo() {
      return new Promise(async (resolve, reject) => {
        this.elderCheckInfo = {}
        if(!this.form.elderId){
          this.$message.error('入住信息不存在')
          return
        }
        const params = {
          elderId: this.form.elderId
        }
        const res = await this.$http.post('/insElderCheckInfo/queryOne', params)
        if (res.data && res.data.code == 200) {
          const info = res.data.data
          let stayDays = 0
          if(info.checkDate){
            const checkDate = this.$moment(info.checkDate)
            // 判断是否有出院时间，没有则取当前日期计算在住天数
            if (info.retreatTime) {
              const retreatTime = this.$moment(info.retreatTime)
              stayDays = retreatTime.diff(checkDate, 'days')
            } else {
              // 还在院：今天 - 入住日
              stayDays = this.$moment().diff(checkDate, 'days')
            }
          }
          // 防止负数（出院早于入住的脏数据兜底）
          stayDays = stayDays < 0 ? 0 : stayDays

          this.elderCheckInfo = {
            ...info,
            stayDays,
          }
          resolve()
        } else {
          this.$message(res.data?.message || '查询老人信息失败')
          reject()
        }
      })
    },
    
    async getElderBaseInfo() {
      return new Promise(async (resolve, reject) => {
        this.elderForm = {}
        if(!this.form.elderId){
          this.$message.error('入住信息不存在')
          reject()
          return
        }
        const params = {
          id: this.form.elderId
        }
        const res = await this.$http.post('/elderBaseInfo/queryOne', params)
        if (res.data && res.data.code == 200) {
          this.elderForm = {
            ...this.elderCheckInfo,
            ...res.data.data,
            elderId: res.data.data.id,
          }
          resolve()
        } else {
          this.$message(res.data?.message || '查询老人信息失败')
          reject()
        }
      })
    },
    search() {
      this.queryInfo.currPage = 1
      this.getList()
    },
    reset() {
      this.queryInfo.condition = {}
      this.search()
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.search()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },
  },
};
</script>

<style lang="scss" scoped>
.card-content{
  height: 100%;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  flex: 1;
}
.page-card{
  flex: 1;
  height: 100%;
  box-sizing: border-box;
}
.container-content{
  height: 80%;
  box-sizing: border-box;
  flex: 1;
  display: flex;
  .cc-left{
    width: 140px;
    flex-shrink: 0;
    height: 100%;
    padding: 10px 0;
    box-sizing: border-box;
    position: relative;
    .header-floor{
      border-top: 1px solid #ebeef5;
      border-left: 1px solid #ebeef5;
      border-right: 1px solid #ebeef5;
      position: sticky;
      top: 0;
    }
    .floor-ul{
      font-size: 12px;
      border-top: 1px solid #ebeef5;
      flex: 1;
      overflow-y: auto;
      .floor-li{
        padding: 10px;
        border-bottom: 1px solid #ebeef5;
        cursor: pointer;
        display: flex;
        justify-content: center;
        align-items: center;
      }
      .active-f{
        background-color: #B0D9FF;
      }
    }
  }
  .cc-right{
    height: 100%;
    flex: 1;
    padding: 10px 0 10px 10px;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    .room{
      height: 80%;
      flex: 1;
      overflow-y: auto;
      display: flex;
      flex-direction: column;
      .room-ul{
        height: 70%;
        flex: 1;
        display: flex;
        flex-wrap: wrap;
        gap: 10px 20px;
        padding: 20px 10px;
        box-sizing: border-box;
        overflow-y: auto;
      }
      .room-li{
        width: calc((100% - 20px) / 2)
      }
      .room-top {
        padding: 10px;
        justify-content: space-between;
        align-items: center;
        border-bottom: 1px solid #eee;
        background: #f5f5f5;
      }
      .bed{
        height: 270px;
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        white-space: nowrap;
        padding: 20px 12px 15px;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        gap: 10px;
      }
      .bed-list {
        padding-right: 10px;
        border-bottom: 1px solid #eee;
        box-sizing: border-box;

        min-height: 120px;
        -ms-flex-item-align: start;
        align-self: flex-start;
        width: calc((100% - 10px) / 2);
        border-radius: 5px;
        -webkit-box-shadow: 0 0 5px 0 rgba(0, 0, 0, .2);
        box-shadow: 0 0 5px 0 rgba(0, 0, 0, .2);
        white-space: wrap;
        overflow: hidden;
        font-size: .7vw;
        cursor: pointer;
      }
      .bed-list:last-child {
        border-bottom: none;
      }
      .bed-top {
        display: flex;
        align-items: center;
        justify-content: space-between;
        margin-bottom: 10px;
        .el-icon-menu{
          color: #2E59FB;
        }
      }
      .tip {
        color: #fff;
        padding: 2px 8px;
        border-radius: 4px;
        display: inline-block;
        min-width: 40px;
        text-align: center;
      }
      .block {
        // margin-top: 10px;
        display: flex;
        justify-content: center;
        align-items: center;
        border-top: 1px solid #eee;
      }
    }
  }
}
.content-top{
  height: 50px;
  background: #409eff;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  color: #fff;
  white-space: nowrap;
  border-radius: 3px;
  font-size: 16px;
  padding-right: 10px;
  ::v-deep .el-switch__label{
    color: #fff;
  }
  ::v-deep .el-switch__label.is-active{
    color: #fffc00;
  }
}
.stats-top{
  background: #f5f5f5;
  padding: 8px 20px;
  font-size: 15px;
  -webkit-box-shadow: 0 0 0 1px #e6e6e6;
  box-shadow: 0 0 0 1px #e6e6e6;

  gap: 20px;
  .stats-item{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    gap: 5px;
    flex: 1;
    font-size: 16px;
    .si-num{
      font-size: 18px;
      font-weight: 600;
    }
  }
  .stats-first{
    width: 80px;
    flex-shrink: 0;
    flex-grow: 0;
  }
}
.topcon {
  display: flex;
  flex: 1;
  .list{
    border-radius: 30px;
    padding: 5px 10px;
    cursor: pointer;
  }
  .light{
    background: #fff;
    color: #000;
  }
}
// .list {
//   // background: #fff;
//   padding: 4px 12px;
//   border-radius: 4px;
//   border: 1px solid #dcdfe6;
// }
.countflex {
  gap: 15px;
  flex-wrap: wrap;
}
.header-floor {
  padding: 10px 0;
}
.boxs {
  border-radius: 5px;
}

.el-col-12 {
  width: 50%;
}

</style>