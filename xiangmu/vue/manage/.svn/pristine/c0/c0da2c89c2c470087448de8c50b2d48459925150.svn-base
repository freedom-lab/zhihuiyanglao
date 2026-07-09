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

               
          <el-table-column label="食材名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.materialName }}</template>
          </el-table-column>
          <el-table-column label="拼音首字母码，用于快速检索" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pinyinCode }}</template>
          </el-table-column>
         
          <el-table-column label="计量单位（g或ml）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.unit }}</template>
          </el-table-column>
          <el-table-column label="参考份量（克或其他单位），营养成分基于此份量" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.referenceAmount }}</template>
          </el-table-column>
          <el-table-column label="热量（千卡）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.calorie }}</template>
          </el-table-column>
          <el-table-column label="蛋白质（克）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.protein }}</template>
          </el-table-column>
          <el-table-column label="脂肪（克）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fat }}</template>
          </el-table-column>
          <el-table-column label="碳水化合物（克）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.carbohydrate }}</template>
          </el-table-column>
          <el-table-column label="膳食纤维（克）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.dietaryFiber }}</template>
          </el-table-column>
          <el-table-column label="钠（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sodium }}</template>
          </el-table-column>
          <el-table-column label="钾（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.potassium }}</template>
          </el-table-column>
          <el-table-column label="钙（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.calcium }}</template>
          </el-table-column>
          <el-table-column label="磷（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.phosphorus }}</template>
          </el-table-column>
          <el-table-column label="镁（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.magnesium }}</template>
          </el-table-column>
          <el-table-column label="铁（mg）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.iron }}</template>
          </el-table-column>
          <el-table-column label="嘌呤含量（mg/100g）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.purine }}</template>
          </el-table-column>
          <el-table-column label="升糖指数GI值" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.giValue }}</template>
          </el-table-column>
          <el-table-column label="是否高嘌呤食材：" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isHighPurine }}</template>
          </el-table-column>
          <el-table-column label="是否高糖食材：" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isHighSugar }}</template>
          </el-table-column>
          <el-table-column label="可食部比例（%），默认100" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.ediblePartRate }}</template>
          </el-table-column>
          <el-table-column label="食材描述/注意事项" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.description }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.remark }}</template>
          </el-table-column>
         
          <el-table-column label="创建人名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.createName }}</template>
          </el-table-column>
         
          <el-table-column label="是否启用：" align="center" show-overflow-tooltip>
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
              <el-form-item label="食材名称：" prop="siteName">
                <el-input v-model="form.materialName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="拼音首字母码，用于快速检索：" prop="siteName">
                <el-input v-model="form.pinyinCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="计量单位（g或ml）：" prop="siteName">
                <el-input v-model="form.unit" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="参考份量（克或其他单位），营养成分基于此份量：" prop="siteName">
                <el-input v-model="form.referenceAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="热量（千卡）：" prop="siteName">
                <el-input v-model="form.calorie" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="蛋白质（克）：" prop="siteName">
                <el-input v-model="form.protein" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="脂肪（克）：" prop="siteName">
                <el-input v-model="form.fat" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="碳水化合物（克）：" prop="siteName">
                <el-input v-model="form.carbohydrate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="膳食纤维（克）：" prop="siteName">
                <el-input v-model="form.dietaryFiber" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="钠（mg）：" prop="siteName">
                <el-input v-model="form.sodium" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="钾（mg）：" prop="siteName">
                <el-input v-model="form.potassium" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="钙（mg）：" prop="siteName">
                <el-input v-model="form.calcium" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="磷（mg）：" prop="siteName">
                <el-input v-model="form.phosphorus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="镁（mg）：" prop="siteName">
                <el-input v-model="form.magnesium" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="铁（mg）：" prop="siteName">
                <el-input v-model="form.iron" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="嘌呤含量（mg/100g）：" prop="siteName">
                <el-input v-model="form.purine" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="升糖指数GI值：" prop="siteName">
                <el-input v-model="form.giValue" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否高嘌呤食材：" prop="siteName">
                <el-input v-model="form.isHighPurine" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否高糖食材：" prop="siteName">
                <el-input v-model="form.isHighSugar" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="可食部比例（%），默认100：" prop="siteName">
                <el-input v-model="form.ediblePartRate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="食材描述/注意事项：" prop="siteName">
                <el-input v-model="form.description" placeholder="请输入名称"></el-input>
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
              <el-form-item label="是否启用：" prop="siteName">
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
	  that.$http.post("/insCanteenFoodMaterial/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insCanteenFoodMaterial/save", that.form).then(function (response) {
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
        that.$http.post("/insCanteenFoodMaterial/delete" ,{"id":id}).then(function (response) {
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

