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

    
          <el-table-column label="老人姓名" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderName }}</template>
          </el-table-column>
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="年龄" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.age }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
          <el-table-column label="出生日期" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.birthday }}</template>
          </el-table-column>
          <el-table-column label="近期症状" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.recentSymptom }}</template>
          </el-table-column>
          <el-table-column label="睡眠时间(小时)" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sleepTime }}</template>
          </el-table-column>
          <el-table-column label="体温" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.temperature }}</template>
          </el-table-column>
          <el-table-column label="脉率" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pulse }}</template>
          </el-table-column>
          <el-table-column label="呼吸频率" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.breathe }}</template>
          </el-table-column>
          <el-table-column label="高压" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.highPressure }}</template>
          </el-table-column>
          <el-table-column label="低压" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lowPressure }}</template>
          </el-table-column>
          <el-table-column label="身高(厘米)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.height }}</template>
          </el-table-column>
          <el-table-column label="体重(千克)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.weight }}</template>
          </el-table-column>
          <el-table-column label="腰围(厘米)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.waistline }}</template>
          </el-table-column>
          <el-table-column label="自我评估" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.selfAssessment }}</template>
          </el-table-column>
          <el-table-column label="自我描述" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.selfDesp }}</template>
          </el-table-column>
          <el-table-column label="皮肤情况" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.skinStatus }}</template>
          </el-table-column>
          <el-table-column label="皮肤描述" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.skinDesp }}</template>
          </el-table-column>
          <el-table-column label="淋巴结状况" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lymphStatus }}</template>
          </el-table-column>
          <el-table-column label="淋巴结描述" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lymphDesp }}</template>
          </el-table-column>
          <el-table-column label="口唇" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.lipsStatus }}</template>
          </el-table-column>
          <el-table-column label="齿列" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.toothStatus }}</template>
          </el-table-column>
          <el-table-column label="咽部" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.throatStatus }}</template>
          </el-table-column>
          <el-table-column label="视力(左)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.leftEyesight }}</template>
          </el-table-column>
          <el-table-column label="视力(右)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.rightEyesight }}</template>
          </el-table-column>
          <el-table-column label="听力" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.listeningStatus }}</template>
          </el-table-column>
          <el-table-column label="耳鼻部" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.earNoseStatus }}</template>
          </el-table-column>
          <el-table-column label="眼底" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.eyeStatus }}</template>
          </el-table-column>
          <el-table-column label="胸部形状" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.chestShape }}</template>
          </el-table-column>
          <el-table-column label="胸部叩诊" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.chestPercussion }}</template>
          </el-table-column>
          <el-table-column label="胸部呼吸音" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.chestSounds }}</template>
          </el-table-column>
          <el-table-column label="心脏状态" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heartStatus }}</template>
          </el-table-column>
          <el-table-column label="心率" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heartRate }}</template>
          </el-table-column>
          <el-table-column label="心律" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heartRhythm }}</template>
          </el-table-column>
          <el-table-column label="心音" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.heartSounds }}</template>
          </el-table-column>
          <el-table-column label="腹部状况" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.abdomenStatus }}</template>
          </el-table-column>
          <el-table-column label="腹部描述" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.abdomenDesp }}</template>
          </el-table-column>
          <el-table-column label="四肢皮肤水肿" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.armsSkin }}</template>
          </el-table-column>
          <el-table-column label="四肢皮肤描述" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.armsSkinDesp }}</template>
          </el-table-column>
          <el-table-column label="可扪及" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.canTouch }}</template>
          </el-table-column>
          <el-table-column label="未扪及" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.noTouch }}</template>
          </el-table-column>
          <el-table-column label="肛门生殖器" align="center" width="100" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.anusStatus }}</template>
          </el-table-column>
          <el-table-column label="乳房生殖器" align="center" class-name="" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.womanCheck }}</template>
          </el-table-column>
          <el-table-column label="辅助附件" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkFile }}</template>
          </el-table-column>
          <el-table-column label="体检总评价" align="center" width="100" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.checkResult }}</template>
          </el-table-column>
          <el-table-column label="是否为入院体检" align="center" width="120" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.physicalState }}</template>
          </el-table-column>
          <el-table-column label="医院名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.hospitalName }}</template>
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
              <el-form-item label="性别" prop="siteName">
                <el-input v-model="form.sex" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="出生日期：" prop="siteName">
                <el-input v-model="form.birthday" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="近期症状：" prop="siteName">
                <el-input v-model="form.recentSymptom" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="睡眠时间(小时)：" prop="siteName">
                <el-input v-model="form.sleepTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体温：" prop="siteName">
                <el-input v-model="form.temperature" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="脉率：" prop="siteName">
                <el-input v-model="form.pulse" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="呼吸频率：" prop="siteName">
                <el-input v-model="form.breathe" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="高压：" prop="siteName">
                <el-input v-model="form.highPressure" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="低压：" prop="siteName">
                <el-input v-model="form.lowPressure" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身高(厘米)：" prop="siteName">
                <el-input v-model="form.height" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体重(千克)：" prop="siteName">
                <el-input v-model="form.weight" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="腰围(厘米)：" prop="siteName">
                <el-input v-model="form.waistline" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="自我评估：" prop="siteName">
                <el-input v-model="form.selfAssessment" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="自我描述：" prop="siteName">
                <el-input v-model="form.selfDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="皮肤情况：" prop="siteName">
                <el-input v-model="form.skinStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="皮肤描述：" prop="siteName">
                <el-input v-model="form.skinDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="淋巴结状况：" prop="siteName">
                <el-input v-model="form.lymphStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="淋巴结描述：" prop="siteName">
                <el-input v-model="form.lymphDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="口唇：" prop="siteName">
                <el-input v-model="form.lipsStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="齿列：" prop="siteName">
                <el-input v-model="form.toothStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="咽部：" prop="siteName">
                <el-input v-model="form.throatStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="视力(左)：" prop="siteName">
                <el-input v-model="form.leftEyesight" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="视力(右)：" prop="siteName">
                <el-input v-model="form.rightEyesight" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="听力：" prop="siteName">
                <el-input v-model="form.listeningStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="耳鼻部：" prop="siteName">
                <el-input v-model="form.earNoseStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="眼底：" prop="siteName">
                <el-input v-model="form.eyeStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="胸部形状：" prop="siteName">
                <el-input v-model="form.chestShape" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="胸部叩诊：" prop="siteName">
                <el-input v-model="form.chestPercussion" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="胸部呼吸音：" prop="siteName">
                <el-input v-model="form.chestSounds" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="心脏状态：" prop="siteName">
                <el-input v-model="form.heartStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="心率：" prop="siteName">
                <el-input v-model="form.heartRate" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="心律：" prop="siteName">
                <el-input v-model="form.heartRhythm" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="心音：" prop="siteName">
                <el-input v-model="form.heartSounds" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="腹部状况：" prop="siteName">
                <el-input v-model="form.abdomenStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="腹部描述：" prop="siteName">
                <el-input v-model="form.abdomenDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="四肢皮肤水肿：" prop="siteName">
                <el-input v-model="form.armsSkin" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="四肢皮肤描述：" prop="siteName">
                <el-input v-model="form.armsSkinDesp" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="可扪及：" prop="siteName">
                <el-input v-model="form.canTouch" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="未扪及：" prop="siteName">
                <el-input v-model="form.noTouch" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="肛门生殖器：" prop="siteName">
                <el-input v-model="form.anusStatus" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="乳房生殖器：" prop="siteName">
                <el-input v-model="form.womanCheck" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="辅助附件：" prop="siteName">
                <el-input v-model="form.checkFile" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体检总评价：" prop="siteName">
                <el-input v-model="form.checkResult" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="是否为入院体检：" prop="siteName">
                <el-input v-model="form.physicalState" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="医院名称：" prop="siteName">
                <el-input v-model="form.hospitalName" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/healthPhysicalCheck/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/healthPhysicalCheck/save", that.form).then(function (response) {
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
        that.$http.post("/healthPhysicalCheck/delete" ,{"id":id}).then(function (response) {
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

