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

            
          <el-table-column label="单位名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionName }}</template>
          </el-table-column>
          <el-table-column label="单位地址" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionAddress }}</template>
          </el-table-column>
          <el-table-column label="风险隐患大类" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.dangersType }}</template>
          </el-table-column>
          <el-table-column label="自查时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkDate }}</template>
          </el-table-column>
          <el-table-column label="安全责任人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.picName }}</template>
          </el-table-column>
          <el-table-column label="安全管理人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.managerName }}</template>
          </el-table-column>
          <el-table-column label="单位建筑总数量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.buildingNum }}</template>
          </el-table-column>
          <el-table-column label="单位人员数量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.staffNum }}</template>
          </el-table-column>
          <el-table-column label="单位总建筑面积" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.areaNum }}</template>
          </el-table-column>
          <el-table-column label="集中住宿人员数量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.stayNum }}</template>
          </el-table-column>
          <el-table-column label="安全责任人签字" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.picNameSign }}</template>
          </el-table-column>
          <el-table-column label="行政区划编码" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.areaCode }}</template>
          </el-table-column>
          <el-table-column label="行政区划名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.areaName }}</template>
          </el-table-column>
          <el-table-column label="提交状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.submitState }}</template>
          </el-table-column>
          <el-table-column label="存在其他问题情况" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
          </el-table-column>
          <el-table-column label="任务名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.taskTitle }}</template>
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
              <el-form-item label="单位名称：" prop="siteName">
                <el-input v-model="form.institutionName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="单位地址：" prop="siteName">
                <el-input v-model="form.institutionAddress" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="风险隐患大类：" prop="siteName">
                <el-input v-model="form.dangersType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="自查时间：" prop="siteName">
                <el-input v-model="form.checkDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="安全责任人：" prop="siteName">
                <el-input v-model="form.picName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="安全管理人：" prop="siteName">
                <el-input v-model="form.managerName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="单位建筑总数量：" prop="siteName">
                <el-input v-model="form.buildingNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="单位人员数量：" prop="siteName">
                <el-input v-model="form.staffNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="单位总建筑面积：" prop="siteName">
                <el-input v-model="form.areaNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="集中住宿人员数量：" prop="siteName">
                <el-input v-model="form.stayNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="安全责任人签字：" prop="siteName">
                <el-input v-model="form.picNameSign" placeholder="请输入名称"></el-input>
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
              <el-form-item label="提交状态：" prop="siteName">
                <el-input v-model="form.submitState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="存在其他问题情况：" prop="siteName">
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
            <el-col :span="12">
              <el-form-item label="是否已删除：" prop="siteName">
                <el-input v-model="form.isDeleted" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否启用：" prop="siteName">
                <el-input v-model="form.status" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="任务名称：" prop="siteName">
                <el-input v-model="form.taskTitle" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/insSecurityDangersCheck/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insSecurityDangersCheck/save", that.form).then(function (response) {
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
        that.$http.post("/insSecurityDangersCheck/delete" ,{"id":id}).then(function (response) {
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

