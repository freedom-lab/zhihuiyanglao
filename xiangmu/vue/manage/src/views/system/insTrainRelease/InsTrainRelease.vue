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

                  <el-table-column label="主键id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.id }}</template>
          </el-table-column>
          <el-table-column label="租户id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.tenantId }}</template>
          </el-table-column>
          <el-table-column label="所属运营公司id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.corpId }}</template>
          </el-table-column>
          <el-table-column label="所属运营公司名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.corpName }}</template>
          </el-table-column>
          <el-table-column label="机构id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionId }}</template>
          </el-table-column>
          <el-table-column label="机构名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.institutionName }}</template>
          </el-table-column>
          <el-table-column label="培训名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.releaseName }}</template>
          </el-table-column>
          <el-table-column label="类别id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.typeId }}</template>
          </el-table-column>
          <el-table-column label="类别名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.typeName }}</template>
          </el-table-column>
          <el-table-column label="培训信息id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainId }}</template>
          </el-table-column>
          <el-table-column label="培训主题" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainName }}</template>
          </el-table-column>
          <el-table-column label="培训开始时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainStartTime }}</template>
          </el-table-column>
          <el-table-column label="培训结束时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainEndTime }}</template>
          </el-table-column>
          <el-table-column label="主讲人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.speakerName }}</template>
          </el-table-column>
          <el-table-column label="培训内容" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainContent }}</template>
          </el-table-column>
          <el-table-column label="培训地点" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainLocation }}</template>
          </el-table-column>
          <el-table-column label="联系人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkName }}</template>
          </el-table-column>
          <el-table-column label="联系电话" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkTel }}</template>
          </el-table-column>
          <el-table-column label="培训状态(1未开始" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainState }}</template>
          </el-table-column>
          <el-table-column label="记录人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.recordName }}</template>
          </el-table-column>
          <el-table-column label="培训总结" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainConclusion }}</template>
          </el-table-column>
          <el-table-column label="培训图片附件路径" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.trainPath }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
          </el-table-column>
          <el-table-column label="创建人id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createUser }}</template>
          </el-table-column>
          <el-table-column label="创建人名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createName }}</template>
          </el-table-column>
          <el-table-column label="创建部门id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createDept }}</template>
          </el-table-column>
          <el-table-column label="创建时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createTime }}</template>
          </el-table-column>
          <el-table-column label="修改人id" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.updateUser }}</template>
          </el-table-column>
          <el-table-column label="修改时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.updateTime }}</template>
          </el-table-column>
          <el-table-column label="是否已删除" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isDeleted }}</template>
          </el-table-column>
          <el-table-column label="是否启用(1启用" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.status }}</template>
          </el-table-column>
        <el-table-column label="操作" width="135" align="center" fixed="right">
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
              <el-form-item label="主键id：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="租户id：" prop="siteName">
                <el-input v-model="form.tenantId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="所属运营公司id：" prop="siteName">
                <el-input v-model="form.corpId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="所属运营公司名称：" prop="siteName">
                <el-input v-model="form.corpName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="机构id：" prop="siteName">
                <el-input v-model="form.institutionId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="机构名称：" prop="siteName">
                <el-input v-model="form.institutionName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训名称：" prop="siteName">
                <el-input v-model="form.releaseName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="类别id：" prop="siteName">
                <el-input v-model="form.typeId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="类别名称：" prop="siteName">
                <el-input v-model="form.typeName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训信息id：" prop="siteName">
                <el-input v-model="form.trainId" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训主题：" prop="siteName">
                <el-input v-model="form.trainName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训开始时间：" prop="siteName">
                <el-input v-model="form.trainStartTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训结束时间：" prop="siteName">
                <el-input v-model="form.trainEndTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="主讲人：" prop="siteName">
                <el-input v-model="form.speakerName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训内容：" prop="siteName">
                <el-input v-model="form.trainContent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训地点：" prop="siteName">
                <el-input v-model="form.trainLocation" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系人：" prop="siteName">
                <el-input v-model="form.linkName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系电话：" prop="siteName">
                <el-input v-model="form.linkTel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训状态(1未开始：" prop="siteName">
                <el-input v-model="form.trainState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="记录人：" prop="siteName">
                <el-input v-model="form.recordName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训总结：" prop="siteName">
                <el-input v-model="form.trainConclusion" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="培训图片附件路径：" prop="siteName">
                <el-input v-model="form.trainPath" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/insTrainRelease/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insTrainRelease/save", that.form).then(function (response) {
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
        that.$http.post("/insTrainRelease/delete" ,{"id":id}).then(function (response) {
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

