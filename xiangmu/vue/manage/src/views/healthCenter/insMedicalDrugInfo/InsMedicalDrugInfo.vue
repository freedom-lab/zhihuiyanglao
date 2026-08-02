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
          
          
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
          <el-table-column label="药品名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugName }}</template>
          </el-table-column>
          <el-table-column label="给药途径" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugRoute }}</template>
          </el-table-column>
          <el-table-column label="开始日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.startDate }}</template>
          </el-table-column>
          <el-table-column label="结束日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.endDate }}</template>
          </el-table-column>
          <el-table-column label="药品总量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.totalNum }}</template>
          </el-table-column>
          <el-table-column label="用药频次" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugMethods }}</template>
          </el-table-column>
          <el-table-column label="每次用药剂量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugDosage }}</template>
          </el-table-column>
          <el-table-column label="每次用药单位" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugUnit }}</template>
          </el-table-column>
          <el-table-column label="用药时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.timeType }}</template>
          </el-table-column>
          <el-table-column label="周几" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.weekNum }}</template>
          </el-table-column>
          <el-table-column label="早晨用药时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.zaoTime }}</template>
          </el-table-column>
          <el-table-column label="早晨用药剂量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.zaoDosage }}</template>
          </el-table-column>
          <el-table-column label="中午用药时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.zhongTime }}</template>
          </el-table-column>
          <el-table-column label="中午药剂量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.zhongDosage }}</template>
          </el-table-column>
          <el-table-column label="晚上用药时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.wanTime }}</template>
          </el-table-column>
          <el-table-column label="晚上用药剂量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.wanDosage }}</template>
          </el-table-column>
          <el-table-column label="睡前用药时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sqTime }}</template>
          </el-table-column>
          <el-table-column label="睡前用药剂量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sqDosage }}</template>
          </el-table-column>
          <el-table-column label="药品来源" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drugSource }}</template>
          </el-table-column>
          <el-table-column label="不良反应" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isAdverse }}</template>
          </el-table-column>
          <el-table-column label="审核状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditState }}</template>
          </el-table-column>
          
          <el-table-column label="审核人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditName }}</template>
          </el-table-column>
          <el-table-column label="审核时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditTime }}</template>
          </el-table-column>
          <el-table-column label="审核意见" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditMemo }}</template>
          </el-table-column>
          <el-table-column label="服药状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.status }}</template>
          </el-table-column>
          <el-table-column label="停用日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopDate }}</template>
          </el-table-column>
          <el-table-column label="停用原因" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopMemo }}</template>
          </el-table-column>
          <el-table-column label="停用审核状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopAuditState }}</template>
          </el-table-column>
        
          <el-table-column label="停用审核人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopAuditName }}</template>
          </el-table-column>
          <el-table-column label="停用审核时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopAuditTime }}</template>
          </el-table-column>
          <el-table-column label="停用审核意见" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stopAuditMemo }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
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

            <!-- <el-col :span="12">
              <el-form-item label="主键id：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
           
            <el-col :span="12">
              <el-form-item label="所属运营公司名称：" prop="siteName">
                <el-input v-model="form.corpName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="机构名称：" prop="siteName">
                <el-input v-model="form.institutionName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="入住日期：" prop="siteName">
                <el-input v-model="form.checkDate" placeholder="请输入名称"></el-input>
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
              <el-form-item label="性别：" prop="siteName">
                <el-input v-model="form.sex" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="药品名称：" prop="siteName">
                <el-input v-model="form.drugName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="给药途径：" prop="siteName">
                <el-input v-model="form.drugRoute" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="开始日期：" prop="siteName">
                <el-input v-model="form.startDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="结束日期：" prop="siteName">
                <el-input v-model="form.endDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="药品总量：" prop="siteName">
                <el-input v-model="form.totalNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用药频次：" prop="siteName">
                <el-input v-model="form.drugMethods" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="每次用药剂量：" prop="siteName">
                <el-input v-model="form.drugDosage" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="每次用药单位：" prop="siteName">
                <el-input v-model="form.drugUnit" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用药时间：" prop="siteName">
                <el-input v-model="form.timeType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="周几：" prop="siteName">
                <el-input v-model="form.weekNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="早晨用药时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.zaoTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="早晨用药剂量：" prop="siteName">
                <el-input v-model="form.zaoDosage" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="中午用药时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.zhongTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="中午药剂量：" prop="siteName">
                <el-input v-model="form.zhongDosage" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="晚上用药时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.wanTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="晚上用药剂量：" prop="siteName">
                <el-input v-model="form.wanDosage" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="睡前用药时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.sqTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="睡前用药剂量：" prop="siteName">
                <el-input v-model="form.sqDosage" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="药品来源：" prop="siteName">
                <el-input v-model="form.drugSource" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="不良反应：" prop="siteName">
                <el-input v-model="form.isAdverse" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核状态：" prop="siteName">
                <el-input v-model="form.auditState" placeholder="请输入名称"></el-input>
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
              <el-form-item label="审核意见：" prop="siteName">
                <el-input v-model="form.auditMemo" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="服药状态：" prop="siteName">
                <el-input v-model="form.status" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="停用日期：" prop="siteName">
                <el-input v-model="form.stopDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="停用原因：" prop="siteName">
                <el-input v-model="form.stopMemo" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="停用审核状态：" prop="siteName">
                <el-input v-model="form.stopAuditState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="停用审核人姓名：" prop="siteName">
                <el-input v-model="form.stopAuditName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="停用审核时间：" prop="siteName">
                <el-input v-model="form.stopAuditTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="停用审核意见：" prop="siteName">
                <el-input v-model="form.stopAuditMemo" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="备注：" prop="siteName">
                <el-input v-model="form.remark" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="创建人名称：" prop="siteName">
                <el-input v-model="form.createName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="创建时间：" prop="siteName">
                <el-input v-model="form.createTime" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/insMedicalDrugInfo/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insMedicalDrugInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insMedicalDrugInfo/delete" ,{"id":id}).then(function (response) {
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

