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

               
          <el-table-column label="楼栋名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.buildingName }}</template>
          </el-table-column>
          
          <el-table-column label="楼层名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.floorName }}</template>
          </el-table-column>
          
          <el-table-column label="房间名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.roomName }}</template>
          </el-table-column>
          <el-table-column label="抄表日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.readingDate }}</template>
          </el-table-column>
          <el-table-column label="水费(每吨)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.waterPrice }}</template>
          </el-table-column>
          <el-table-column label="用水量(吨)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.waterNumber }}</template>
          </el-table-column>
          <el-table-column label="电费(每千瓦)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.electricPrice }}</template>
          </el-table-column>
          <el-table-column label="电费用量(千瓦)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.electricNumber }}</template>
          </el-table-column>
          <el-table-column label="热水费单价(m²)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.hotWaterPrice }}</template>
          </el-table-column>
          <el-table-column label="房屋平米数(m²)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.hotWaterNumber }}</template>
          </el-table-column>
          <el-table-column label="供热费单价(m²)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heatingPrice }}</template>
          </el-table-column>
          <el-table-column label="房屋平米数(m²)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heatingNumber }}</template>
          </el-table-column>
          <el-table-column label="开始日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.startDate }}</template>
          </el-table-column>
          <el-table-column label="结束日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.endDate }}</template>
          </el-table-column>
          <el-table-column label="水费总金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.waterTotalAmount }}</template>
          </el-table-column>
          <el-table-column label="电费总金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.electricTotalAmount }}</template>
          </el-table-column>
          <el-table-column label="热水费总金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.hotWaterTotalAmount }}</template>
          </el-table-column>
          <el-table-column label="供热费总金额" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heatingTotalAmount }}</template>
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
              <el-form-item label="楼栋名称：" prop="siteName">
                <el-input v-model="form.buildingName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="楼层名称：" prop="siteName">
                <el-input v-model="form.floorName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="房间名称：" prop="siteName">
                <el-input v-model="form.roomName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="抄表日期：" prop="siteName">
                <el-input v-model="form.readingDate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="水费(每吨)：" prop="siteName">
                <el-input v-model="form.waterPrice" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用水量(吨)：" prop="siteName">
                <el-input v-model="form.waterNumber" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="电费(每千瓦)：" prop="siteName">
                <el-input v-model="form.electricPrice" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="电费用量(千瓦)：" prop="siteName">
                <el-input v-model="form.electricNumber" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="热水费单价(m²)：" prop="siteName">
                <el-input v-model="form.hotWaterPrice" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="房屋平米数(m²)：" prop="siteName">
                <el-input v-model="form.hotWaterNumber" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="供热费单价(m²)：" prop="siteName">
                <el-input v-model="form.heatingPrice" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="房屋平米数(m²)：" prop="siteName">
                <el-input v-model="form.heatingNumber" placeholder="请输入名称"></el-input>
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
              <el-form-item label="水费总金额：" prop="siteName">
                <el-input v-model="form.waterTotalAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="电费总金额：" prop="siteName">
                <el-input v-model="form.electricTotalAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="热水费总金额：" prop="siteName">
                <el-input v-model="form.hotWaterTotalAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="供热费总金额：" prop="siteName">
                <el-input v-model="form.heatingTotalAmount" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="结算状态：" prop="siteName">
                <el-input v-model="form.settlementState" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/insSuWaterElectricRecord/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/insSuWaterElectricRecord/save", that.form).then(function (response) {
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
        that.$http.post("/insSuWaterElectricRecord/delete" ,{"id":id}).then(function (response) {
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

