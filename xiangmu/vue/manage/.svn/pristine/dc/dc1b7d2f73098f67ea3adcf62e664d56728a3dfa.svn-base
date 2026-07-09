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

        <el-table-column label="老人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderName }}</template>
          </el-table-column>
          <el-table-column label="入住日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkDate }}</template>
          </el-table-column>
        
         
          <el-table-column label="身份证号" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
        
          <el-table-column label="合同名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.contractName }}</template>
          </el-table-column>
         
          <el-table-column label="合同模板" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.templateName }}</template>
          </el-table-column>
         
          <el-table-column label="入住押金" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.depositAmount }}</template>
          </el-table-column>
        
          <el-table-column label="床位类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bedType }}</template>
          </el-table-column>
          <el-table-column label="床位费(元)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bedAmount }}</template>
          </el-table-column>
          <el-table-column label="护理等级" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.nursingLevelName }}</template>
          </el-table-column>
          
        <el-table-column label="操作" width="165" align="center" fixed="right">
          <template slot-scope="scope">
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

          
            <el-col :span="12">
              <el-form-item label="入住信息主键id：" prop="siteName">
                <el-input v-model="form.checkId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="入住日期：" prop="siteName">
                <el-input v-model="form.checkDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="老人id：" prop="siteName">
                <el-input v-model="form.elderId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="老人姓名：" prop="siteName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号：" prop="siteName">
                <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="性别(1男，2女)：" prop="siteName">
                <el-input v-model="form.sex" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同编号：" prop="siteName">
                <el-input v-model="form.contractCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同名称：" prop="siteName">
                <el-input v-model="form.contractName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同模板主键id：" prop="siteName">
                <el-input v-model="form.templateId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同模板名称：" prop="siteName">
                <el-input v-model="form.templateName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同签订时间：" prop="siteName">
                <el-input v-model="form.signTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同开始日期：" prop="siteName">
                <el-input v-model="form.startDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同结束日期：" prop="siteName">
                <el-input v-model="form.endDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="入住押金金额(元)：" prop="siteName">
                <el-input v-model="form.depositAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="费用类型(1年付：" prop="siteName">
                <el-input v-model="form.costType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="床位类型(数据字典(ins_bed_type))：" prop="siteName">
                <el-input v-model="form.bedType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="床位费(元)：" prop="siteName">
                <el-input v-model="form.bedAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="床位费押金(元)：" prop="siteName">
                <el-input v-model="form.bedDepositAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="护理等级id：" prop="siteName">
                <el-input v-model="form.nursingLevelId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="护理等级名称：" prop="siteName">
                <el-input v-model="form.nursingLevelName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="护理费(元)：" prop="siteName">
                <el-input v-model="form.nursingAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="护理费押金(元)：" prop="siteName">
                <el-input v-model="form.nursingDepositAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="餐饮费(元)：" prop="siteName">
                <el-input v-model="form.foodAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="餐饮费押金(元)：" prop="siteName">
                <el-input v-model="form.foodDepositAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否享受政策补贴(1否：" prop="siteName">
                <el-input v-model="form.isSubsidy" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同说明：" prop="siteName">
                <el-input v-model="form.contractDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="甲方名称：" prop="siteName">
                <el-input v-model="form.partyNameA" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="甲方联系电话：" prop="siteName">
                <el-input v-model="form.linkTelA" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="甲方地址：" prop="siteName">
                <el-input v-model="form.addressA" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乙方名称：" prop="siteName">
                <el-input v-model="form.partyNameB" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乙方联系电话：" prop="siteName">
                <el-input v-model="form.linkTelB" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乙方地址：" prop="siteName">
                <el-input v-model="form.addressB" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="代理人名称：" prop="siteName">
                <el-input v-model="form.partyNameC" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="代理人联系电话：" prop="siteName">
                <el-input v-model="form.linkTelC" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="代理人地址：" prop="siteName">
                <el-input v-model="form.addressC" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同内容(默认填充合同模板内容)：" prop="siteName">
                <el-input v-model="form.templateContent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同附件(多个逗号分隔)：" prop="siteName">
                <el-input v-model="form.contractPath" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="发票附件(多个逗号分隔)：" prop="siteName">
                <el-input v-model="form.invoicePath" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同状态(1待签订：" prop="siteName">
                <el-input v-model="form.contractState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="提交状态(1未提交：" prop="siteName">
                <el-input v-model="form.submitState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="合同电子签名状态(0无需电子签名：" prop="siteName">
                <el-input v-model="form.signingState" placeholder="请输入名称"></el-input>
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
            <el-col :span="12">
              <el-form-item label="创建人id：" prop="siteName">
                <el-input v-model="form.createUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建人名称：" prop="siteName">
                <el-input v-model="form.createName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建部门id：" prop="siteName">
                <el-input v-model="form.createDept" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建时间：" prop="siteName">
                <el-input v-model="form.createTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改人id：" prop="siteName">
                <el-input v-model="form.updateUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改时间：" prop="siteName">
                <el-input v-model="form.updateTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否已删除：" prop="siteName">
                <el-input v-model="form.isDeleted" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否启用(1启用：" prop="siteName">
                <el-input v-model="form.status" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="二维码地址：" prop="siteName">
                <el-input v-model="form.codePath" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="法定代表人或授权代表签字(甲方)：" prop="siteName">
                <el-input v-model="form.stafferSign" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="法定代表人或授权代表签字日期(甲方)：" prop="siteName">
                <el-input v-model="form.stafferDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乙方/乙方监护人签名：" prop="siteName">
                <el-input v-model="form.guardianSign" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乙方/乙方监护人签名日期：" prop="siteName">
                <el-input v-model="form.guardianDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="丙方签名：" prop="siteName">
                <el-input v-model="form.otherSign" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="丙方签名日期：" prop="siteName">
                <el-input v-model="form.otherDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核状态(1未审核：" prop="siteName">
                <el-input v-model="form.auditState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核人主键id：" prop="siteName">
                <el-input v-model="form.auditId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核人姓名：" prop="siteName">
                <el-input v-model="form.auditName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核时间：" prop="siteName">
                <el-input v-model="form.auditTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核说明：" prop="siteName">
                <el-input v-model="form.auditMemo" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="发送状态(0未发送：" prop="siteName">
                <el-input v-model="form.sendState" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/insElderContractInfo/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insElderContractInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insElderContractInfo/delete" ,{"id":id}).then(function (response) {
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

