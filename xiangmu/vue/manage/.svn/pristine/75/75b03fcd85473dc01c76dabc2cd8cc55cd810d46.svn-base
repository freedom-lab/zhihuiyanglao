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
          <el-table-column label="所属运营公司名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.corpName }}</template>
          </el-table-column>    
          <el-table-column label="机构名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionName }}</template>
          </el-table-column>       
          <el-table-column label="制定医生姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.doctorName }}</template>
          </el-table-column>
          <el-table-column label="制定时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.developTime }}</template>
          </el-table-column>
          <el-table-column label="干预周期-开始日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.startDate }}</template>
          </el-table-column>
          <el-table-column label="干预周期-结束日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.endDate }}</template>
          </el-table-column>
          <el-table-column label="干预目标" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.interventionTarget }}</template>
          </el-table-column>
          <el-table-column label="慢病id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.diseaseId }}</template>
          </el-table-column>
          <el-table-column label="慢病名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.diseaseName }}</template>
          </el-table-column>
          <el-table-column label="病情分级名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.diseaseLevelName }}</template>
          </el-table-column>
          <el-table-column label="用药干预" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.medicationPlan }}</template>
          </el-table-column>
          <el-table-column label="饮食运动干预" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.dietPlan }}</template>
          </el-table-column>
          <el-table-column label="监测随访" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.monitoringPlan }}</template>
          </el-table-column>
          <el-table-column label="方案状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.planState }}</template>
          </el-table-column>
          <el-table-column label="执行率(%)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.executionRate }}</template>
          </el-table-column>
          <el-table-column label="效果评估" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.effectEvaluation }}</template>
          </el-table-column>
          <el-table-column label="调整次数" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.adjustmentCount }}</template>
          </el-table-column>
          <el-table-column label="最后调整时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lastAdjustTime }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
          </el-table-column>
         
        <el-table-column label="操作" width="260" align="center" fixed="right">
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
              <el-form-item label="主键ID：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
             <el-col :span="12">
              <el-form-item label="老人姓名：" prop="siteName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
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
              <el-form-item label="制定医生姓名：" prop="siteName">
                <el-input v-model="form.doctorName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="制定时间：" prop="siteName">
                <el-input v-model="form.developTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="干预周期-开始日期：" prop="siteName">
                <el-input v-model="form.startDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="干预周期-结束日期：" prop="siteName">
                <el-input v-model="form.endDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="干预目标：" prop="siteName">
                <el-input v-model="form.interventionTarget" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="慢病名称：" prop="siteName">
                <el-input v-model="form.diseaseName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="病情分级名称：" prop="siteName">
                <el-input v-model="form.diseaseLevelName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用药干预：" prop="siteName">
                <el-input v-model="form.medicationPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="饮食运动干预：" prop="siteName">
                <el-input v-model="form.dietPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="监测随访：" prop="siteName">
                <el-input v-model="form.monitoringPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="方案状态：" prop="siteName">
                <el-input v-model="form.planState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="执行率(%)：" prop="siteName">
                <el-input v-model="form.executionRate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="效果评估：" prop="siteName">
                <el-input v-model="form.effectEvaluation" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="调整次数：" prop="siteName">
                <el-input v-model="form.adjustmentCount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="最后调整时间：" prop="siteName">
                <el-input v-model="form.lastAdjustTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="备注：" prop="siteName">
                <el-input v-model="form.remark" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/healthInterventionPlan/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/healthInterventionPlan/save", that.form).then(function (response) {
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
        that.$http.post("/healthInterventionPlan/delete" ,{"id":id}).then(function (response) {
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

