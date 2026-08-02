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
          <el-table-column label="设备大类" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bigDeviceType }}</template>
          </el-table-column>
          
          <el-table-column label="设备名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.deviceName }}</template>
          </el-table-column>
          <el-table-column label="设备SID" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.deviceSerial }}</template>
          </el-table-column>
          <el-table-column label="应用场景" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sceneType }}</template>
          </el-table-column>
         
         
          <el-table-column label="联系电话" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkTel }}</template>
          </el-table-column>
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="高德地图经度" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lon }}</template>
          </el-table-column>
          <el-table-column label="高德地图纬度" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lat }}</template>
          </el-table-column>
          <el-table-column label="地址" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.address }}</template>
          </el-table-column>
          <el-table-column label="告警单号" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.alarmCode }}</template>
          </el-table-column>
          <el-table-column label="告警等级" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.alarmLevel }}</template>
          </el-table-column>
          <el-table-column label="告警类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.alarmType }}</template>
          </el-table-column>
          <el-table-column label="床垫告警类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sleepAlarmType }}</template>
          </el-table-column>
          <el-table-column label="告警时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.alarmTime }}</template>
          </el-table-column>
          <el-table-column label="告警内容" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.alarmContent }}</template>
          </el-table-column>
          <el-table-column label="用户读取状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.readState }}</template>
          </el-table-column>
          <el-table-column label="处理方式" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleType }}</template>
          </el-table-column>
          <el-table-column label="处理状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleState }}</template>
          </el-table-column>
          <el-table-column label="处理结果" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleResult }}</template>
          </el-table-column>
          <el-table-column label="处理照片" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleImg }}</template>
          </el-table-column>
      
          <el-table-column label="处理人" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleUser }}</template>
          </el-table-column>
          <el-table-column label="处理时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.handleTime }}</template>
          </el-table-column>
          <el-table-column label="所属机构类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.belongInstitutionType }}</template>
          </el-table-column>
        
          <el-table-column label="电话录音地址" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.audioUrl }}</template>
          </el-table-column>
          <el-table-column label="呼叫电话号码" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.callPhones }}</template>
          </el-table-column>
        
          <el-table-column label="呼叫次数" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.callCount }}</template>
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
              <el-form-item label="：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
           
            <el-col :span="12">
              <el-form-item label="设备大类：" prop="siteName">
                <el-input v-model="form.bigDeviceType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="设备名称：" prop="siteName">
                <el-input v-model="form.deviceName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="设备SID：" prop="siteName">
                <el-input v-model="form.deviceSerial" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="应用场景：" prop="siteName">
                <el-input v-model="form.sceneType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            
            <el-col :span="12">
              <el-form-item label="老人姓名：" prop="siteName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系电话：" prop="siteName">
                <el-input v-model="form.linkTel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号：" prop="siteName">
                <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="高德地图经度：" prop="siteName">
                <el-input v-model="form.lon" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="高德地图纬度：" prop="siteName">
                <el-input v-model="form.lat" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="地址：" prop="siteName">
                <el-input v-model="form.address" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="告警单号：" prop="siteName">
                <el-input v-model="form.alarmCode" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="告警等级：" prop="siteName">
                <el-input v-model="form.alarmLevel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="告警类型：" prop="siteName">
                <el-input v-model="form.alarmType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="床垫告警类型：" prop="siteName">
                <el-input v-model="form.sleepAlarmType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="告警时间：" prop="siteName">
                <el-input v-model="form.alarmTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="告警内容：" prop="siteName">
                <el-input v-model="form.alarmContent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用户读取状态：" prop="siteName">
                <el-input v-model="form.readState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="处理方式：" prop="siteName">
                <el-input v-model="form.handleType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="处理状态：" prop="siteName">
                <el-input v-model="form.handleState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="处理结果：" prop="siteName">
                <el-input v-model="form.handleResult" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="处理照片：" prop="siteName">
                <el-input v-model="form.handleImg" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="处理人：" prop="siteName">
                <el-input v-model="form.handleUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="处理时间：" prop="siteName">
                <el-input v-model="form.handleTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="所属机构类型：" prop="siteName">
                <el-input v-model="form.belongInstitutionType" placeholder="请输入名称"></el-input>
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
              <el-form-item label="电话录音地址：" prop="siteName">
                <el-input v-model="form.audioUrl" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="呼叫电话号码：" prop="siteName">
                <el-input v-model="form.callPhones" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
            <el-col :span="12">
              <el-form-item label="呼叫次数：" prop="siteName">
                <el-input v-model="form.callCount" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/smartAlarmRecord/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/smartAlarmRecord/save", that.form).then(function (response) {
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
        that.$http.post("/smartAlarmRecord/delete" ,{"id":id}).then(function (response) {
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

