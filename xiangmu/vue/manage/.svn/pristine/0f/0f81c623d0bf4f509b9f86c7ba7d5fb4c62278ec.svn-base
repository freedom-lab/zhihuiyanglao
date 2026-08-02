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

        
          <el-table-column label="所属运营公司名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.corpName }}</template>
          </el-table-column>
          
          <el-table-column label="活动类别名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.typeName }}</template>
          </el-table-column>
          <el-table-column label="活动名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityName }}</template>
          </el-table-column>
          <el-table-column label="活动简图" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityPic }}</template>
          </el-table-column>
          <el-table-column label="活动内容" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityContent }}</template>
          </el-table-column>
          <el-table-column label="活动状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityState }}</template>
          </el-table-column>
          <el-table-column label="活动负责人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.manager }}</template>
          </el-table-column>
          <el-table-column label="负责人电话" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkTel }}</template>
          </el-table-column>
          <el-table-column label="参加人数" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderNum }}</template>
          </el-table-column>
          <el-table-column label="活动日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityDate }}</template>
          </el-table-column>
          <el-table-column label="活动开始时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.startActivityTime }}</template>
          </el-table-column>
          <el-table-column label="活动结束时间(hh:mm)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.endActivityTime }}</template>
          </el-table-column>
          <el-table-column label="签到方式" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.signType }}</template>
          </el-table-column>
          <el-table-column label="活动地点" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityAddress }}</template>
          </el-table-column>
       
          <el-table-column label="针对人群" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pointPeople }}</template>
          </el-table-column>
          <el-table-column label="活动目的" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.point }}</template>
          </el-table-column>
          <el-table-column label="奖励积分" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bonusIntegral }}</template>
          </el-table-column>
          <el-table-column label="活动简介" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.resolveName }}</template>
          </el-table-column>
          <el-table-column label="审核状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditState }}</template>
          </el-table-column>
       
          <el-table-column label="审核人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditName }}</template>
          </el-table-column>
          <el-table-column label="审核意见" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditMemo }}</template>
          </el-table-column>
          <el-table-column label="审核时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auditTime }}</template>
          </el-table-column>
          <el-table-column label="取消原因" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.cancelReason }}</template>
          </el-table-column>
          <el-table-column label="活动风采图" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activityPics }}</template>
          </el-table-column>
          <el-table-column label="活动总结" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.activitySummary }}</template>
          </el-table-column>
          <el-table-column label="报名人数" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.entryNum }}</template>
          </el-table-column>
          <el-table-column label="签到人数" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.signNum }}</template>
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
              <el-form-item label="活动编号：" prop="siteName">
                <el-input v-model="form.activityCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="活动类别名称：" prop="siteName">
                <el-input v-model="form.typeName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动名称：" prop="siteName">
                <el-input v-model="form.activityName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动简图：" prop="siteName">
                <el-input v-model="form.activityPic" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动内容：" prop="siteName">
                <el-input v-model="form.activityContent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动状态：" prop="siteName">
                <el-input v-model="form.activityState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动负责人：" prop="siteName">
                <el-input v-model="form.manager" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="负责人电话：" prop="siteName">
                <el-input v-model="form.linkTel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="参加人数：" prop="siteName">
                <el-input v-model="form.elderNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动日期：" prop="siteName">
                <el-input v-model="form.activityDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动开始时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.startActivityTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动结束时间(hh:mm)：" prop="siteName">
                <el-input v-model="form.endActivityTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="签到方式：" prop="siteName">
                <el-input v-model="form.signType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动地点：" prop="siteName">
                <el-input v-model="form.activityAddress" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="针对人群：" prop="siteName">
                <el-input v-model="form.pointPeople" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动目的：" prop="siteName">
                <el-input v-model="form.point" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="奖励积分：" prop="siteName">
                <el-input v-model="form.bonusIntegral" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动简介：" prop="siteName">
                <el-input v-model="form.resolveName" placeholder="请输入名称"></el-input>
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
              <el-form-item label="审核意见：" prop="siteName">
                <el-input v-model="form.auditMemo" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="审核时间：" prop="siteName">
                <el-input v-model="form.auditTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="取消原因：" prop="siteName">
                <el-input v-model="form.cancelReason" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动风采图：" prop="siteName">
                <el-input v-model="form.activityPics" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="活动总结：" prop="siteName">
                <el-input v-model="form.activitySummary" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="报名人数：" prop="siteName">
                <el-input v-model="form.entryNum" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="签到人数：" prop="siteName">
                <el-input v-model="form.signNum" placeholder="请输入名称"></el-input>
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
           
            <el-col :span="12">
              <el-form-item label="状态：" prop="siteName">
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
	  that.$http.post("/insActivityInfo/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insActivityInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insActivityInfo/delete" ,{"id":id}).then(function (response) {
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

