<template>
  <div style="padding:16px">
    <!-- 顶部搜索区 -->
    <div ref="search_d" style="margin-bottom:14px">
      <el-row type="flex" justify="space-between" align="middle">
        <el-col>
          <el-button type="primary" @click="newBtn">新增消费记录</el-button>
        </el-col>
        <el-col span="6">
          <el-input
            placeholder="老人姓名/费用名称搜索"
            v-model="queryInfo.condition.queryKey"
            clearable
          >
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 消费列表表格 -->
    <div>
      <el-table
        border
        ref="table"
        v-loading="loading"
        :data="tableData"
        tooltip-effect="dark"
        style="width:100%"
        :height="tableHeight"
      >
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>
        <el-table-column label="老人姓名" prop="elderName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="运营公司名称" prop="corpName" min-width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="机构名称" prop="institutionName" min-width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="入住日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ formatDate(scope.row.checkDate) }}</template>
        </el-table-column>
        <!-- 老人信息前置 -->
        <el-table-column label="身份证号" prop="idCard" min-width="170" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="消费日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ formatDate(scope.row.buyTime) }}</template>
        </el-table-column>
        <el-table-column label="费用名称" prop="articleName" width="120" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="费用类型" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ getArticleTypeText(scope.row.articleType) }}
          </template>
        </el-table-column>
        <el-table-column label="费用金额(元)" prop="articlePrice" width="110" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="员工姓名" prop="staffName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="结算状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: scope.row.settlementState === 1 ? '#f56c6c' : '#67c23a'}">
              {{ scope.row.settlementState === 1 ? '挂账' : '已结算' }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="费用说明" prop="remark" min-width="140" align="center" show-overflow-tooltip></el-table-column>
        <!-- 操作固定右侧 -->
        <el-table-column label="操作" width="135" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除该消费记录？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" danger size="small">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div style="margin-top:14px;text-align:right">
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage"
          :page-sizes="[50,100,200]"
          :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
        ></el-pagination>
      </div>
    </div>

    <!-- 新增/编辑弹窗 -->
    <el-dialog :title="labelType === 'add' ? '新增消费记录' : '编辑消费记录'" :visible.sync="showDialog" width="900px">
      <el-form ref="form" :model="form" :rules="rules" label-width="130px">
        <el-row :gutter="16">
          <!-- 机构信息 -->
          <el-col span="12">
            <el-form-item label="运营公司名称">
              <el-input v-model="form.corpName" placeholder="请输入运营公司名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="机构名称">
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="入住日期">
              <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 老人信息 前置核心 -->
          <el-col span="12">
            <el-form-item label="老人姓名" prop="elderName">
              <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="身份证号" prop="idCard">
              <el-input v-model="form.idCard" placeholder="请输入身份证号码"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="性别">
              <el-select v-model.number="form.sex" placeholder="选择性别" style="width:100%">
                <el-option label="男" :value="1"></el-option>
                <el-option label="女" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>

          <!-- 消费核心信息 -->
          <el-col span="12">
            <el-form-item label="消费日期">
              <el-date-picker v-model="form.buyTime" type="date" placeholder="选择消费日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="费用名称" prop="articleName">
              <el-input v-model="form.articleName" placeholder="请输入费用名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="费用类型">
              <el-select v-model.number="form.articleType" placeholder="选择费用类型" style="width:100%">
                <el-option label="护理耗材" :value="1"></el-option>
                <el-option label="生活用品" :value="2"></el-option>
                <el-option label="医疗用品" :value="3"></el-option>
                <el-option label="其他消费" :value="4"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="费用金额(元)" prop="articlePrice">
              <el-input v-model.number="form.articlePrice" placeholder="输入消费金额"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="员工姓名">
              <el-input v-model="form.staffName" placeholder="填写经办人"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="结算状态">
              <el-select v-model.number="form.settlementState" placeholder="选择结算状态" style="width:100%">
                <el-option label="挂账" :value="1"></el-option>
                <el-option label="已结算" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="是否启用">
              <el-select v-model.number="form.status" placeholder="选择状态" style="width:100%">
                <el-option label="启用" :value="1"></el-option>
                <el-option label="未启用" :value="0"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="24">
            <el-form-item label="费用说明">
              <el-input v-model="form.remark" type="textarea" rows="3" placeholder="填写消费备注说明"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer">
        <el-button @click="showDialog = false">取消</el-button>
        <el-button type="primary" @click="handleSave">保存记录</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
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
      loading:false
    };
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
	  that.$http.post("/insExpensesPurchaseRecord/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insExpensesPurchaseRecord/save", that.form).then(function (response) {
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
        that.$http.post("/insExpensesPurchaseRecord/delete" ,{"id":id}).then(function (response) {
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

