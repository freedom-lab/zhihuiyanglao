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
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" class="dft-table" style="width: 100%" :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>

            
          <el-table-column label="员工姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.staffName }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
          <el-table-column label="年龄" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.age }}</template>
          </el-table-column>
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="联系电话" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkTel }}</template>
          </el-table-column>
          <el-table-column label="会员卡号" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memberCard }}</template>
          </el-table-column>
          <el-table-column label="会员卡密码" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.cardPass }}</template>
          </el-table-column>
          <el-table-column label="会员等级" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memberLevel }}</template>
          </el-table-column>
          <el-table-column label="会员状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memberState }}</template>
          </el-table-column>
          <el-table-column label="卡押金" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.cardDeposit }}</template>
          </el-table-column>
          <el-table-column label="账户余额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memberAmount }}</template>
          </el-table-column>
          <el-table-column label="账户积分" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memberIntegral }}</template>
          </el-table-column>
          <el-table-column label="开卡人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createName }}</template>
          </el-table-column>
          <el-table-column label="推荐人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.refereeName }}</template>
          </el-table-column>
          <el-table-column label="生效日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.effectiveDate }}</template>
          </el-table-column>
          <el-table-column label="失效日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.expirationDate }}</template>
          </el-table-column>
          <el-table-column label="消费上限阀值" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.maxConsumption }}</template>
          </el-table-column>
         
        <el-table-column label="操作" width="165" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="check(scope.row)" size="small">查看</el-button>
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text">删除</el-button>
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

    <el-dialog :title="(labelType=='add'?'新增':'编辑')" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="10">

            <!-- <el-col :span="12">
              <el-form-item label="：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
            <!-- <el-col :span="12">
              <el-form-item label="租户ID：" prop="siteName">
                <el-input v-model="form.tenantId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="运营公司ID：" prop="siteName">
                <el-input v-model="form.corpId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="机构ID：" prop="siteName">
                <el-input v-model="form.institutionId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
          
            <!-- <el-col :span="12">
              <el-form-item label="员工ID：" prop="siteName">
                <el-input v-model="form.staffId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
            <el-col :span="12">
              <el-form-item label="员工姓名：" prop="siteName">
                <el-input v-model="form.staffName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="性别：" prop="sex">
                <el-select v-model="form.sex" placeholder="请选择" clearable style="width:100%">
                  <el-option label="男" value="1"></el-option>
                  <el-option label="女" value="2"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="年龄：" prop="siteName">
                <el-input v-model="form.age" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号：" prop="siteName">
                <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系电话：" prop="siteName">
                <el-input v-model="form.linkTel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="会员卡号：" prop="siteName">
                <el-input v-model="form.memberCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="会员卡密码：" prop="siteName">
                <el-input v-model="form.cardPass" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="会员等级：" prop="siteName">
                <el-input v-model="form.memberLevel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="会员状态：" prop="siteName">
                <!-- <el-input v-model="form.memberState" placeholder="请输入名称"></el-input> -->
                <el-select v-model="form.memberState" placeholder="请选择" style="width:100%">
                  <el-option label="正常" value="1"></el-option>
                  <el-option label="挂失" value="2"></el-option>
                  <el-option label="注销" value="3"></el-option>
                  <el-option label="失效" value="4"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="卡押金：" prop="siteName">
                <el-input v-model="form.cardDeposit" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="账户余额：" prop="siteName">
                <el-input v-model="form.memberAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="账户积分：" prop="siteName">
                <el-input v-model="form.memberIntegral" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="开卡人：" prop="siteName">
                <el-input v-model="form.createName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="推荐人：" prop="siteName">
                <el-input v-model="form.refereeName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="生效日期：" prop="siteName">
                <el-input v-model="form.effectiveDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="失效日期：" prop="siteName">
                <el-input v-model="form.expirationDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="消费上限阀值：" prop="siteName">
                <el-input v-model="form.maxConsumption" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="行政区划编码：" prop="siteName">
                <el-input v-model="form.areaCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="行政区划名称：" prop="siteName">
                <el-input v-model="form.areaName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="备注：" prop="siteName">
                <el-input v-model="form.remark" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <!-- <el-col :span="12">
              <el-form-item label="创建人：" prop="siteName">
                <el-input v-model="form.createUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建部门：" prop="siteName">
                <el-input v-model="form.createDept" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建时间：" prop="siteName">
                <el-input v-model="form.createTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改人：" prop="siteName">
                <el-input v-model="form.updateUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改时间：" prop="siteName">
                <el-input v-model="form.updateTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否启用(1:启用，0:未启用)：" prop="siteName">
                <el-input v-model="form.status" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否已删除：" prop="siteName">
                <el-input v-model="form.isDeleted" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>
    <!-- 用户详情抽屉 -->
    <el-drawer
      ref="drawer"
      title="员工档案"
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
        <div class="top-header flex align-items-center" style="justify-content: space-between;">
          <div class="user-avatar" style="width:40px;height:40px;background:#409eff;border-radius:6px;display:flex;align-items:center;justify-content:center;margin-right:10px;">
            <i class="el-icon-user-solid" style="color:#fff;font-size:24px;"></i>
          </div>
          <div class="title-text-class" style="flex: 1;">
            <span class="subtitle" style="font-size:13px;font-weight:400;color: #666;">员工档案</span>
            <span class="username" style="font-size:20px;font-weight:bold;margin-right:10px;">{{form.staffName}}</span>
          </div>
          <!-- <div class="arrow-group flex">
            <el-button icon="el-icon-arrow-left" size="mini" circle></el-button>
            <el-button icon="el-icon-arrow-right" size="mini" circle></el-button>
          </div> -->
          <!-- <el-tag size="small" style="margin-left:20px;background:#e6f7ff;color:#1890ff;border:none;">{{form.nursingLevelName}}</el-tag> -->
          <!-- <div class="btn-line">
            <el-button type="primary" icon="el-icon-edit" @click="manualEntry">手工录入</el-button>
          </div> -->
        </div>

        <!-- 第一行老人基础统计栏 -->
        <div class="info-bar flex">
          <div class="info-item">
            <span style="color:#666;font-size:13px;">年龄</span>
            <div style="font-size:14px;">{{form.age}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">性别</span>
            <div style="font-size:14px;">{{form.sex | sexFormat}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">身份证号</span>
            <div style="font-size:14px;">{{form.idCard}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">联系电话</span>
            <div style="font-size:14px;">{{form.linkTel}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">会员卡号</span>
            <div style="font-size:14px;">{{form.memberCard}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">会员等级</span>
            <div style="font-size:14px;">{{form.memberLevel}}</div>
          </div>
        </div>

        <!-- 标签页导航 -->
        <el-tabs v-model="activeTab" type="card" tab-position="top" style="" @tab-click="tabClick">
          <el-tab-pane label="员工档案" name="drawerTabInfo1"></el-tab-pane>
          <el-tab-pane label="合同信息" name="drawerTabInfo2"></el-tab-pane>
          <el-tab-pane label="满意度评价" name="drawerTabInfo3"></el-tab-pane>
          <!-- <el-tab-pane label="参与培训" name="drawerTabInfo4"></el-tab-pane> -->
          <el-tab-pane label="考评记录" name="drawerTabInfo5"></el-tab-pane>
          <el-tab-pane label="请假记录" name="drawerTabInfo6"></el-tab-pane>
          <el-tab-pane label="薪资发放记录" name="drawerTabInfo7"></el-tab-pane>
          <el-tab-pane label="离职记录" name="drawerTabInfo8"></el-tab-pane>
        </el-tabs>
        

        <!-- tab面板内容 -->
        <div class="base-panel">
          <component ref="drawerTabInfo" :is="currentComponent" :elderForm="form"></component>
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
// 员工档案
import drawerTabInfo1 from './components/drawerTabInfo1.vue';
// 合同信息
import drawerTabInfo2 from './components/drawerTabInfo2.vue';
// 满意度评价
import drawerTabInfo3 from './components/drawerTabInfo3.vue';
// 考评任务
import drawerTabInfo4 from './components/drawerTabInfo4.vue';
// 考评记录
import drawerTabInfo5 from './components/drawerTabInfo5.vue';
// 请假记录
import drawerTabInfo6 from './components/drawerTabInfo6.vue';
// 薪资发放记录
import drawerTabInfo7 from './components/drawerTabInfo7.vue';
// 离职记录
import drawerTabInfo8 from './components/drawerTabInfo8.vue';
// // 胆固醇
// import drawerTabInfo9 from './components/drawerTabInfo9.vue';
// // 尿酸
// import drawerTabInfo10 from './components/drawerTabInfo10.vue';
// // 尿常规
// import drawerTabInfo11 from './components/drawerTabInfo11.vue';
// // 评估记录
// import drawerTabInfo12 from './components/drawerTabInfo12.vue';
export default {
  components: {
      drawerTabInfo1,
      drawerTabInfo2,
      drawerTabInfo3,
      drawerTabInfo4,
      drawerTabInfo5,
      drawerTabInfo6,
      drawerTabInfo7,
      drawerTabInfo8,
      // drawerTabInfo9,
      // drawerTabInfo10,
      // drawerTabInfo11,
      // drawerTabInfo12,
  },
  data () {
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
      loading:false,
      
      currentComponent: null,
      activeTab: 'drawerTabInfo1',
      drawer: false,
    };
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
  },

  created () {
    this.getList()
  },

  mounted () {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 监听表格高度
    getHeight () {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList () {
	  var that = this;
    that.loading = true
	  that.$http.post("/insStaffMemberCardInfo/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage=response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },

    // 保存
    handleSave () {
	    var that = this;
	  that.$http.post("/insStaffMemberCardInfo/save", that.form).then(function (response) {
		  if (response.data.code == 200) {
			  that.$notify.success({
				title: "提示",
				message: "保存成功",
				showClose: true,
			  });
			 that.showDialog = false
			  that.getList()
		  }else{
			  that.$notify.info({
				title: "提示",
				message: response.data.message,
				showClose: true,
			  });
		  }
      }).catch(function(error){


      })
	  
	  
    },

    //修改
    edit (row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
    },
    async check(row) {
      this.drawer = true;
      this.labelType = 'edit'
      this.activeTab = 'drawerTabInfo1'
      this.form = JSON.parse(JSON.stringify(row))
      this.currentComponent = 'drawerTabInfo1'
      // await this.getElderCheckInfo()
      // await this.getElderBaseInfo()
      // this.$nextTick(()=>{
      //   this.$refs.drawerTabInfo.initDefaultData()
      // })
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
        that.$http.post("/insStaffMemberCardInfo/delete" ,{"id":id}).then(function (response) {
			if(response.data.code == 200){
			 that.$notify.success({
				title: "提示",
				message: "删除成功",
				showClose: true,
			  });
			  that.getList();
			}else{
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
    newBtn () {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange (val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange (val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>

<style scoped>
</style>

