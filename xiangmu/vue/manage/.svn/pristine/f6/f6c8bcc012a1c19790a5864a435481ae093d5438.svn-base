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
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%" :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>

          <el-table-column label="机构名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionName }}</template>
          </el-table-column>
          <el-table-column label="老人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderName }}</template>
          </el-table-column>
          <el-table-column label="缴费单号" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.paymentCode }}</template>
          </el-table-column>
          <el-table-column label="缴费类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.paymentType }}</template>
          </el-table-column>
          <el-table-column label="应收金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.receivableAmount }}</template>
          </el-table-column>
          <el-table-column label="实收金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.amount }}</template>
          </el-table-column>
          <el-table-column label="账单是否确认" width="120" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isBillConfirm }}</template>
          </el-table-column>
          <el-table-column label="经办人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handler }}</template>
          </el-table-column>
          <el-table-column label="经办时间" width="160" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handlerTime }}</template>
          </el-table-column>
          <el-table-column label="账单说明" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.billExplain }}</template>
          </el-table-column>
          <el-table-column label="支付方式" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.payType }}</template>
          </el-table-column>
          <el-table-column label="账户支付金额" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.accountPayAmount }}</template>
          </el-table-column>
          <el-table-column label="线下支付金额" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.offlinePayAmount }}</template>
          </el-table-column>
          <el-table-column label="支付状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.payState }}</template>
          </el-table-column>
          <el-table-column label="收款人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.payeeName }}</template>
          </el-table-column>
          <el-table-column label="收款时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.payeeTime }}</template>
          </el-table-column>
          <el-table-column label="收款说明" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.payeeExplain }}</template>
          </el-table-column>
          <el-table-column label="付款人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.paymentName }}</template>
          </el-table-column>
          <el-table-column label="行政区划名称" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.areaName }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
          </el-table-column>
          <el-table-column label="创建人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createUser }}</template>
          </el-table-column>
          <el-table-column label="创建部门" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createDept }}</template>
          </el-table-column>
          <el-table-column label="操作时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createTime }}</template>
          </el-table-column>
          <el-table-column label="修改人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.updateUser }}</template>
          </el-table-column>
          <el-table-column label="修改时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.updateTime }}</template>
          </el-table-column>
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
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

            <el-col :span="12">
              <el-form-item label="机构名称：" prop="siteName">
                <el-input v-model="form.institutionName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="老人姓名：" prop="siteName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="缴费单号：" prop="siteName">
                <el-input v-model="form.paymentCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="缴费类型" prop="siteName">
                <el-input v-model="form.paymentType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="应收金额：" prop="siteName">
                <el-input v-model="form.receivableAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="实收金额：" prop="siteName">
                <el-input v-model="form.amount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="账单是否确认：" prop="siteName">
                <el-input v-model="form.isBillConfirm" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="经办人：" prop="siteName">
                <el-input v-model="form.handler" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="经办时间：" prop="siteName">
                <el-input v-model="form.handlerTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="账单说明：" prop="siteName">
                <el-input v-model="form.billExplain" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="支付方式：" prop="siteName">
                <el-input v-model="form.payType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="账户支付金额：" prop="siteName">
                <el-input v-model="form.accountPayAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="线下支付金额：" prop="siteName">
                <el-input v-model="form.offlinePayAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="支付状态(0未支付1已支付)：" prop="siteName">
                <el-input v-model="form.payState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="收款人：" prop="siteName">
                <el-input v-model="form.payeeName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="收款时间：" prop="siteName">
                <el-input v-model="form.payeeTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="收款说明：" prop="siteName">
                <el-input v-model="form.payeeExplain" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="付款人：" prop="siteName">
                <el-input v-model="form.paymentName" placeholder="请输入名称"></el-input>
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
            <el-col :span="12">
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
              <el-form-item label="操作时间：" prop="siteName">
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
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
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
	  that.$http.post("/carePaymentInfo/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/carePaymentInfo/save", that.form).then(function (response) {
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
        that.$http.post("/carePaymentInfo/delete" ,{"id":id}).then(function (response) {
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

