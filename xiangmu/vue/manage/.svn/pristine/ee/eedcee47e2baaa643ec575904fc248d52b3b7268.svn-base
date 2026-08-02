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
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="年龄" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.age }}</template>
          </el-table-column>
          <el-table-column label="基本信息-就诊日期" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkDate }}</template>
          </el-table-column>
          <el-table-column label="基本信息-就诊医院" align="center" width="150"  show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.hospital }}</template>
          </el-table-column>
          <el-table-column label="基本信息-就诊科室" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.office }}</template>
          </el-table-column>
          <el-table-column label="基本信息-接诊医生" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.doctor }}</template>
          </el-table-column>
          <el-table-column label="基本信息-主诉内容" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mainContent }}</template>
          </el-table-column>
          <el-table-column label="基本信息-现病史" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.presentIllness }}</template>
          </el-table-column>
          <el-table-column label="基本信息-既往史" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pastHistory }}</template>
          </el-table-column>
          <el-table-column label="基本信息-家族史" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.familyHistory }}</template>
          </el-table-column>
          <el-table-column label="基本信息-体检检查" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bodyCheck }}</template>
          </el-table-column>
          <el-table-column label="基本信息-辅助检查" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.auxiliaryCheck }}</template>
          </el-table-column>
        
          <el-table-column label="诊断结果-初步诊断结果" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkResult }}</template>
          </el-table-column>

        <el-table-column label="操作" width="260"  align="center" fixed="right" >
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
              <el-form-item label="：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
      
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
              <el-form-item label="年龄：" prop="siteName">
                <el-input v-model="form.age" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-就诊日期：" prop="siteName">
                <el-input v-model="form.checkDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-就诊医院：" prop="siteName">
                <el-input v-model="form.hospital" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-就诊科室：" prop="siteName">
                <el-input v-model="form.office" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-接诊医生：" prop="siteName">
                <el-input v-model="form.doctor" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-主诉内容：" prop="siteName">
                <el-input v-model="form.mainContent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-现病史：" prop="siteName">
                <el-input v-model="form.presentIllness" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-既往史：" prop="siteName">
                <el-input v-model="form.pastHistory" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-家族史：" prop="siteName">
                <el-input v-model="form.familyHistory" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-体检检查：" prop="siteName">
                <el-input v-model="form.bodyCheck" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="基本信息-辅助检查：" prop="siteName">
                <el-input v-model="form.auxiliaryCheck" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-神态：" prop="siteName">
                <el-input v-model="form.mien" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-发育：" prop="siteName">
                <el-input v-model="form.auxe" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-营养：" prop="siteName">
                <el-input v-model="form.nutrition" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-皮肤黏膜：" prop="siteName">
                <el-input v-model="form.skinMucosa" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-浅表淋巴结：" prop="siteName">
                <el-input v-model="form.lymphNode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-头部及器官：" prop="siteName">
                <el-input v-model="form.headOrgan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-胸部：" prop="siteName">
                <el-input v-model="form.chest" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="一般情况-腹部：" prop="siteName">
                <el-input v-model="form.abdomen" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="诊断结果-初步诊断结果：" prop="siteName">
                <el-input v-model="form.checkResult" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/healthVisitRecords/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/healthVisitRecords/save", that.form).then(function (response) {
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
        that.$http.post("/healthVisitRecords/delete" ,{"id":id}).then(function (response) {
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

