<template>
  <div class="page-outer">
    <div class="page-container">
      <el-row>
        <el-col :span="6">
          <el-select v-model="stationform.stationCode" placeholder="请选择" @change="handleLSTChange" style="width: 100%">
            <el-option v-for="item,index in stationList" :key="index" :label="item.name" :value="item.code">
            </el-option>
          </el-select>
        </el-col>
      </el-row>
      <div class="stats-line">
        <div class="stats-item" v-for="item,index in statsList" :key="index">
            <template v-if="item.label">
                <span class="ljd-kuai" :class="item.bg">{{item.circleText}}</span>
                <div class="stats-item-label">{{item.label}}</div>
                （
                <div class="si-valueitem" v-for="ii,iindex in item.valueList" :key="iindex">
                    <div class="si-value">{{ii.value}}</div>
                    <div class="si-unit">{{ii.unit}}</div>
                    <div v-if="iindex != (item.valueList.length-1)">,</div>
                </div>
                ）
            </template>
        </div>
      </div>
      <div class="divide-line"></div>
      <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
        <el-tab-pane v-for="item,index in tabsList" :key="index" :label="item.label" :name="item.code">
        </el-tab-pane>
      </el-tabs>
      <!-- 头部部分 -->
      <div ref="search_d" class="page-header">
        <el-form :form="queryInfo.condition" label-width="90px" label-height="60px" class="responsive-form">
          <el-row :gutter="20">
            <el-col :span="4">
              <el-form-item label="朝向:" prop="dd2">
                <el-select v-model="queryInfo.condition.dd2" placeholder="请选择朝向" style="width: 100%">
                  <el-option v-for="item,index in ddList2" :key="index" :label="item.label" :value="item.value">
                  </el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="4">
              <el-form-item label="是否可拼床:" prop="dd1" style="width: 100%">
                <el-select v-model="queryInfo.condition.dd1" placeholder="请选择是否可拼床" style="width: 100%">
                  <el-option v-for="item,index in ddList1" :key="index" :label="item.label" :value="item.value">
                  </el-option>
                </el-select>
              </el-form-item>
            </el-col>

            <el-col :span="4">
              <el-form-item label-width="20px" class="flex justify-end btn-group">
                <el-button type="primary" @click="search" icon="el-icon-search">搜索</el-button>
                <el-button @click="reset" icon="el-icon-refresh-left">清空</el-button>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
      </div>

      <!-- 内容部分 -->
      <div class="container-cnt" v-loading="loading">
        <el-tabs v-model="activeName2" tab-position="left" @tab-click="handleClick2">
          <el-tab-pane v-for="item,index in tabsList" :key="index" :label="item.label" :name="item.code">
            <span slot="label"><i class="el-icon-office-building"></i> {{item.label}}</span>
            <el-row :gutter="10" class="building-class" :style="{'height': `${height}px`}">
              <el-col :span="6" v-for="fitem,iindex in tableData" :key="iindex">
                <div class="room-class">
                    <h2 class="ljd-relative">
                        {{fitem.roomName}}
                        <span class="circle bg-info ljd-absolute2">包</span>
                    </h2>
                    <div class="king-box2 bg-primary">
                        <div class="king-flex">
                            <div class="king-width"> 四人间 </div>
                            <div class="king-width"> 朝北 </div>
                            <div class="king-width">4张床</div>
                        </div>
                        <div class="king-flex">
                            <div class="king-width2">
                                拼房：<span>150元/月/床</span>
                            </div>
                            <div class="king-width2">包房：300元/月</div>
                        </div>
                        <div class="king-flex">
                            <div class="king-width2">
                                拼房：<span> 5 元/天/床</span><!---->
                            </div>
                            <div class="king-width2"> 包房： 10 元/天 </div>
                        </div>
                    </div>
                    <div class="king-box2">
                        <div class="ljd-kuai" v-for="bed,bedindex in fitem.bedList" :key="bedindex">
                            <span> {{bed.label}} </span>
                            <span v-if="bed.status == '1'">（{{bed.userName}}，{{bed.gender}}） </span>
                        </div>
                    </div>
                </div>
              </el-col>
            </el-row>
          </el-tab-pane>
        </el-tabs>
      </div>
    </div>
    
    <el-dialog :title="labelType=='add' ? '新增' : '编辑'" class="reservation-dialog" :visible.sync="showDialog" width="75%" top="15vh">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="20">
          <!-- 第一行 左 -->
          <el-col :span="12">
            <el-form-item label="老人姓名" prop="oldName">
              <el-input v-model="form.oldName" placeholder="请输入老人姓名" clearable></el-input>
            </el-form-item>
          </el-col>
          <!-- 第一行 右 -->
          <el-col :span="12">
            <el-form-item label="身份证号码" prop="idCard">
              <el-input v-model="form.idCard" placeholder="请输入身份证号码" clearable></el-input>
            </el-form-item>
          </el-col>

        </el-row>
        <el-row :gutter="20">
          <!-- 第二行 -->
          <el-col :span="12">
            <el-form-item label="性别" prop="gender">
              <el-select v-model="form.gender" placeholder="请选择性别" clearable style="width:100%">
                <el-option label="男" value="1"></el-option>
                <el-option label="女" value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="年龄" prop="age">
              <el-input-number v-model="form.age" placeholder="请输入年龄" :min="0" :max="150" style="width:100%"></el-input-number>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <!-- 第三行 -->
          <el-col :span="12">
            <el-form-item label="交款人">
              <el-input v-model="form.payUser" placeholder="请输入交款人" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="联系电话" prop="phone">
              <el-input v-model="form.phone" placeholder="请输入联系电话" clearable></el-input>
            </el-form-item>
          </el-col>

          <!-- 第四行 -->
          <el-col :span="12">
            <el-form-item label="固话">
              <el-input v-model="form.tel" placeholder="请输入固话" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家庭地址" prop="address">
              <el-input v-model="form.address" placeholder="请输入家庭地址" clearable></el-input>
            </el-form-item>
          </el-col>

          <!-- 第五行 -->
          <el-col :span="12">
            <el-form-item label="营销人员" prop="saleUser">
              <el-select v-model="form.saleUser" placeholder="请选择营销人员" clearable style="width:100%">
                <el-option label="营销A" value="A"></el-option>
                <el-option label="营销B" value="B"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="是否拼房" prop="isShare">
              <el-radio-group v-model="form.isShare">
                <el-radio label="是"></el-radio>
                <el-radio label="否"></el-radio>
              </el-radio-group>
            </el-form-item>
          </el-col>

        </el-row>
        <el-row :gutter="20">
          <!-- 第六行 -->
          <el-col :span="12">
            <el-form-item label="预订房号">
              <el-input v-model="form.roomNo" placeholder="请输入预订房号" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="预留到期时间" prop="endTime">
              <el-date-picker v-model="form.endTime" type="date" value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择预留到期时间" style="width:100%"></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 第七行 -->
          <el-col :span="12">
            <el-form-item label="定金金额(元)" prop="deposit">
              <el-input-number v-model="form.deposit" placeholder="请输入定金金额" :min="0" precision="2" style="width:100%"></el-input-number>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="收款时间" prop="payTime">
              <el-date-picker v-model="form.payTime" type="date" value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择收款时间" style="width:100%"></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 备注 通栏 -->
          <el-col :span="24">
            <el-form-item label="备注">
              <el-input v-model="form.remark" type="textarea" :rows="4" maxlength="200" show-word-limit placeholder="请输入备注"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" type="primary" icon="el-icon-circle-plus-outline" @click="handleSave">保存</el-button>
        <el-button size="small" icon="el-icon-circle-close" @click="showDialog = false">取消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      labelType: 'add',
      // 表单校验规则
      rules: {
        oldName: [
          { required: true, message: '请输入老人姓名', trigger: 'blur' },
          { min: 2, max: 20, message: '姓名长度2-20个字符', trigger: 'blur' }
        ],
        idCard: [
          { required: true, message: '请输入身份证号码', trigger: 'blur' },
          { pattern: /(^\d{18}$)|(^\d{17}(\d|X|x)$)/, message: '身份证格式不正确', trigger: 'blur' }
        ],
        gender: [
          { required: true, message: '请选择性别', trigger: 'change' }
        ],
        age: [
          { required: true, message: '请输入年龄', trigger: 'blur' }
        ],
        phone: [
          { required: true, message: '请输入联系电话', trigger: 'blur' },
          { pattern: /^1[3-9]\d{9}$/, message: '手机号格式错误', trigger: 'blur' }
        ],
        address: [
          { required: true, message: '请输入家庭地址', trigger: 'blur' }
        ],
        saleUser: [
          { required: true, message: '请选择营销人员', trigger: 'change' }
        ],
        isShare: [
          { required: true, message: '请选择是否拼房', trigger: 'change' }
        ],
        endTime: [
          { required: true, message: '请选择预留到期时间', trigger: 'change' }
        ],
        deposit: [
          { required: true, message: '请输入定金金额', trigger: 'blur' }
        ],
        payTime: [
          { required: true, message: '请选择收款时间', trigger: 'change' }
        ]
      },
      // 表单数据对象（完全匹配截图字段）
      form: {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: '',        // 绑定当前右键床位编码
        bedLabel: ''        // 绑定当前右键床位名称
      },
      total: 0,
      queryInfo: {
        pageSize: 20,
        pageCount: 1,
        currPage: 1,
        condition: {}
      },
      activeName: '1',
      activeName2: '1',
      stationList: [
        { code: '1', name: '杏林' },
        { code: '2', name: '云舒康养' },
        { code: '3', name: '杏林' },
        { code: '4', name: '杏林' },
      ],
      stationform: {
        stationCode: '',
      },
      statsList: [
        { label: '已满员房间', bg: 'bg-info', valueList: [{ value: '0', unit: '间' }] },
        { label: '未满员房间', bg: 'bg-primary', valueList: [{ value: '0', unit: '间' }, { value: '0', unit: '张床' }] },
        { label: '空房', bg: 'bg-sussess', valueList: [{ value: '0', unit: '间' }, { value: '0', unit: '张床' }] },
        { label: '已入住', bg: 'bg-info', valueList: [{ value: '0', unit: '张床' }] },
        { label: '空闲床位', bg: 'bg-primary', valueList: [{ value: '0', unit: '张床' }] },
        {},
        { label: '已申请退住', bg: 'bg-primary circle', circleText: '退', valueList: [{ value: '0', unit: '张' }] },
        { label: '不支持拼房的房间', bg: 'bg-info circle', circleText: '包', valueList: [{ value: '0', unit: '间' }] },
      ],
      tabsList: [
        { label: '1栋', code: '1' },
        { label: '2栋', code: '2' },
        { label: '3栋', code: '3' },
        { label: '4栋', code: '4' },
      ],
      ddList1: [
        { label: '是', value: '1' },
        { label: '否', value: '0' },
      ],
      ddList2: [
        { label: '朝北', value: '1' },
        { label: '朝南', value: '2' },
        { label: '朝东', value: '3' },
        { label: '朝西', value: '4' },
      ],
      ddList3: [
        { label: '二级护理', value: '1' },
        { label: '介护', value: '2' },
        { label: '送餐等服务', value: '3' },
        { label: '保洁', value: '4' },
        { label: '个人卫生', value: '5' },
        { label: '剪头发', value: '6' },
        { label: '一级护理', value: '7' },
      ],
      showDialog: false,
      tableData: [],
      multipleSelection: [],
      height: window.innerHeight - 276, //表格高度
      headerHeight: 0,
      loading: false,
      asideWidth: '230px',
      wariningDay: null,
      wariningDayData: {},
      bedimg: require('@/assets/images/bed.png'),
      showMenu: false,
      menuX: 0,
      menuY: 0,
      bed: {},
      bedindex: 0,
    };
  },
  filters: {
    bedstatus(val){
      switch (val) {
        case 0:
        case '0':
          return '已使用';
        case 1:
        case '1':
          return '空闲';
        case 2:
        case '2':
          return '已使用';
      
        default:
          return '';
      }
    },
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
  beforeDestroy() {
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 366;
    },
    // 站点切换
    handleLSTChange(e){},
    handleClick(tab, event) {
      this.search()
    },
    handleClick2(tab, event) {
      this.search()
    },
    
    handleTimeChange(val){
      // console.log(val,'|',this.queryInfo.condition.contractTime)
      if(val.length>0){
        this.queryInfo.condition.startTime = val[0]
        this.queryInfo.condition.endTime = val[1]
      }else{
        this.queryInfo.condition.startTime = ''
        this.queryInfo.condition.endTime = ''
      }
    },
    // 右键事件
    rightClick(e,bed,bedindex) {
      this.showMenu = true
      // 鼠标坐标
      this.menuX = e.clientX
      this.menuY = e.clientY
      this.bed = bed
      this.bedindex = bedindex
      console.log('右键事件：',e,bed,bedindex)
    },
    // 空白处关闭
    closeMenu() {
      this.showMenu = false
    },
    // 点击预定管理
    openBook() {
      console.log('预定管理')
      this.showMenu = false
      this.labelType = 'add'
      // 重置表单+清除校验提示
      this.$nextTick(() => {
        this.$refs.form && this.$refs.form.resetFields()
      })
      this.form = {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: this.bed.code,    // 当前右键床位编码
        bedLabel: this.bed.label   // 当前右键床位名称（1床/2床）
      }
      this.showDialog = true;
    },
    // 预定管理
    handleBook(bed){
      console.log('预定管理',bed)
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      // this.queryInfo.condition.orderStatus = this.activeName == 0 ? '' : this.activeName
      try {
        that.$http.post("/loginLog/list", that.queryInfo).then( (response)=> {
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
                    // 床位列表
                    bedList: [
                    { label: '1层-01-01', status: '0', userName: '', gender: '' },
                    { label: '1层-01-02', status: '1', userName: '王琪', gender: '男' },
                    { label: '1层-01-03', status: '1', userName: '蓝天', gender: '男' },
                    { label: '1层-01-04', status: '0', userName: '', gender: '' },
                    ],
                }
            });
          }
        });
      } catch (error) {
        console.log(error)
        that.loading = false
      }
    },
    
    

    // 保存
    handleSave() {
      var that = this;
      that.$refs.form.validate((valid) => {
        if (!valid) return false; // 校验不通过阻止提交

        that.$http.post("/loginLog/save", that.form).then( (response)=> {
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
          console.log('保存失败', error)
        })
      })

    },

    //修改
    edit(row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
      // this.$router.push({
      //   path: '/serviceStationProduct/detail',
      //   query: {
      //     detailId: row.id,
      //     type: 'edit',
      //   },
      // })
    },

    // 删除用户
    async handleDelte(row) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        var that = this;
        that.$http.post("/loginLog/delete", { "id": row.id }).then(function (response) {
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
    // 终止订单
    handleBanit(row){
      var that = this;
      // const _operationStatus = row.orderStatus == 1 ? 2 : 1
      // const operationStatusText = row.status == 1 ? '终止订单成功' : '终止订单取消'
      that.$http.post("/loginLog/update", {
        "id": row.id,
        orderStatus: '4',
        }).then( (response) => {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: '终止订单成功',
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
    },

    //新增按钮
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {
        oldName: '',        // 老人姓名
        idCard: '',         // 身份证号
        gender: '',         // 性别
        age: null,          // 年龄
        payUser: '',        // 交款人
        phone: '',          // 联系电话
        tel: '',            // 固话
        address: '',        // 家庭地址
        saleUser: '',       // 营销人员
        isShare: '是',      // 是否拼房 默认是
        roomNo: '',         // 预订房号
        endTime: '',        // 预留到期时间
        deposit: null,      // 定金金额
        payTime: '2026-06-10', // 收款时间 默认今天
        remark: '',         // 备注
        bedCode: '',        // 绑定当前右键床位编码
        bedLabel: ''        // 绑定当前右键床位名称
      }
    },
    handlerSelectionChange(val) {
      this.multipleSelection = val;
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
.btn-line{
  margin-top: 10px;
  display: flex;
  align-items: center;
  gap: 10px;
  .line-label{
    width: 120px;
    flex-shrink: 0;
  }
}
.ljd_drawer{
}
.stats-line{
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 10px 20px;
  padding: 12px;
  box-sizing: border-box;
  .stats-item{
    display: flex;
    align-items: center;
    width: calc((100% - 40px) / 3);
  }
  .ljd-kuai{
    display: inline-block;
    height: 20px;
    min-width: 30px;
    margin-right: 10px;
    border-radius: 3px;
  }
  .circle{
    font-size: 16px;
    color: #fff;
    width: 30px;
    height: 30px;
    line-height: 30px;
    border-radius: 50%;
    text-align: center;
    display: inline-block;
    margin-right: 10px;
  }
  .si-valueitem{
    flex-shrink: 0;
    display: flex;
    align-items: center;
  }
}
.responsive-form{
  ::v-deep .el-form-item__label{
    font-weight: 600;
  }
}
.container-cnt{
  ::v-deep .el-tabs--left .el-tabs__header.is-left {
    width: 100px;
  }
  .building-class{
    overflow-y: auto;
    display: flex;
    flex-wrap: wrap;
    padding: 10px 20px;
    gap: 10px 0px;
    .room-class{
        width: 100%;
        height: 100%;
        padding: 10px;
        box-sizing: border-box;
        
        -webkit-box-shadow: 0 0 10px 0 rgba(0, 0, 0, .1);
        box-shadow: 0 0 10px 0 rgba(0, 0, 0, .1);
        border-radius: 3px;
        border: 1px solid #e6e6e6;
        h2{
            margin: 0;
            padding: 15px 0;
            font-size: 18px;
            text-align: center;
            height: 50px;
            box-sizing: border-box;
        }
        .ljd-relative{
            position: relative;
            .ljd-absolute2{
                position: absolute;
                top: 10px;
                right: 10px;
                margin: 0;
            }
        }
        .king-box2{
            padding: 15px;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            color: #fff;
        }
        .king-flex{
            display: flex;
        }
        .king-width{
            width: calc(100% / 3);
            margin-bottom: 5px;
        }
        .king-width2{
            width: calc(100% / 2);
        }
    }
  }
  .room{
    position: relative;
    display: flex;
    flex-wrap: wrap;
    gap: 10px 20px;
    padding: 10px;
  }
  .room-status{
    font-size: 16px;
    color: #fff;
    width: 40px;
    height: 40px;
    line-height: 40px;
    border-radius: 50%;
    text-align: center;
    display: inline-block;
    position: absolute;
    top: -30px;
    right: -30px;
  }
  .bed-box{
    display: flex;
    flex-direction: column;
    width: calc((100% - 20px) / 2);
    padding: 5px;

    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    border-radius: 3px;
    height: 125px;
    min-width: 240px;

    background-color: #f0f9eb;
    border: 1px solid #c2e7b0;

    .bed-name{
      color: #FE5D55;
    }
    .bed-info{
      display: flex;
      align-items: center;
      gap: 10px;
    }
    .bed-img{
      width: 80px;
      height: 90px;
    }
    .bed-status{
      width: 150px;
      height: 22px;
      font-size: 13px;
      color: #fff;
      border-radius: 4px;
      display: flex;
      align-items: center;
      justify-content: center;
      background-color: #67C23A;
    }
  }
}

.status-sussess{
  background-color: #67c23a;
}
.status-warning{
  background-color: #e6a23c;
}
.status-danger{
  background-color: #f56c6c;
}
.status-info{
  background-color: #909399;
}

/* 右键菜单样式，和截图白色弹窗+阴影一致 */
.context-menu {
  position: fixed;
  z-index: 9999;
  background: #fff;
  padding: 12px 16px;
  border-radius: 8px;
  box-shadow: 0 3px 14px rgba(0,0,0,0.16);
}
.menu-item {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 15px;
  font-weight: 500;
  cursor: pointer;
  .bed-img{
    width: 20px;
    height: 30px;
  }
}
.reservation-dialog{
  ::v-deep .el-dialog__body{
    padding: 20px 30px;
    border-top: 1px solid #eee;
    border-bottom: 1px solid #eee;
  }
  ::v-deep .el-form-item__label{
    font-weight: 600;
  }
}
</style>