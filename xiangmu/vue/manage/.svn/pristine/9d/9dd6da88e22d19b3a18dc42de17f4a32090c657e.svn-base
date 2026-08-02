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
    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="联系人" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultName }}</template>
        </el-table-column>

        <el-table-column label="预约日期" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.consultTime ? scope.row.consultTime.slice(0, 10) : '' }}
          </template>
        </el-table-column>

        <el-table-column label="预约状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span v-if="scope.row.consultState == 1" style="color: #2e59fb;">● 邀约中</span>
            <span v-else-if="scope.row.consultState == 2" style="color: #4ccc34;">● 预约成功</span>
            <span v-else="scope.row.consultState == -1" style="color: #e66;">● 预约取消</span>
          </template>
        </el-table-column>

        <el-table-column label="手机电话" width="150" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel }}</template>
        </el-table-column>

        <el-table-column label="老人姓名" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>

        <el-table-column label="身份证号" width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>

        <el-table-column label="性别" width="60" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex == 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="年龄" width="60" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.age }}</template>
        </el-table-column>
        <el-table-column label="家庭住址" width="150" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.homeAddress }}</template>
        </el-table-column>

        <el-table-column label="婚姻情况" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.marryState }}</template>
        </el-table-column>
        <el-table-column label="文化程度" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.degreeEducation }}</template>
        </el-table-column>
        <el-table-column label="经济来源" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.economicSources }}</template>
        </el-table-column>
        <el-table-column label="兴趣组" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.hobby }}</template>
        </el-table-column>
        <el-table-column label="基础病情况" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.majorDiseases }}</template>
        </el-table-column>

        <el-table-column label="推荐人姓名" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.refereeName }}</template>
        </el-table-column>

        <el-table-column label="咨询方式" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultMode }}</template>
        </el-table-column>
        <el-table-column label="咨询意向" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultIntention }}</template>
        </el-table-column>
        <el-table-column label="媒介渠道" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.mediaChannels }}</template>
        </el-table-column>
        <el-table-column label="最后回访内容" width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope"></template>
        </el-table-column>
        <el-table-column label="回访人" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope"></template>
        </el-table-column>
        <el-table-column label="回访时间" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope"></template>
        </el-table-column>
        <el-table-column label="回访次数" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope"></template>
        </el-table-column>
        <el-table-column label="备注" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>

        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
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

    <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>{{ labelType == 'add' ? '新增' : '编辑' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <!-- 联系人信息 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>联系人信息</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="联系人姓名" prop="consultName">
                  <el-input v-model="form.consultName" placeholder="请输入联系人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系日期" prop="consultTime">
                  <el-date-picker v-model="form.consultTime" type="date" placeholder="请选择联系日期" style="width:100%"
                    clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系电话" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="请输入联系电话"></el-input>
                </el-form-item>
              </el-col>
            </el-row>

            <!-- 老人信息 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>老人信息</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入身份证号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别" prop="sex">
                  <el-select v-model="form.sex" placeholder="请选择性别" style="width:100%" clearable>
                    <el-option label="男" :value="1"></el-option>
                    <el-option label="女" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="年龄" prop="age">
                  <el-input v-model.number="form.age" placeholder="请输入年龄"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="家庭住址" prop="homeAddress">
                  <el-input v-model="form.homeAddress" placeholder="请输入家庭住址"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="出生日期" prop="birthday">
                  <el-date-picker v-model="form.birthday" type="date" placeholder="请选择出生日期" style="width:100%"
                    clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="能力等级" prop="abilityLevel">
                  <el-select v-model="form.abilityLevel" placeholder="请选择能力等级" style="width:100%" clearable>
                    <el-option label="自理" value="自理"></el-option>
                    <el-option label="半失能" value="半失能"></el-option>
                    <el-option label="失能" value="失能"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="社保卡号" prop="socialCardNo">
                  <el-input v-model="form.socialCardNo" placeholder="请输入社保卡号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="婚姻情况" prop="marryState">
                  <el-select v-model="form.marryState" placeholder="请选择婚姻情况" style="width:100%" clearable>
                    <el-option label="未婚" value="未婚"></el-option>
                    <el-option label="已婚" value="已婚"></el-option>
                    <el-option label="离异" value="离异"></el-option>
                    <el-option label="丧偶" value="丧偶"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="文化程度" prop="degreeEducation">
                  <el-select v-model="form.degreeEducation" placeholder="请选择文化程度" style="width:100%" clearable>
                    <el-option label="文盲" value="文盲"></el-option>
                    <el-option label="小学" value="小学"></el-option>
                    <el-option label="初中" value="初中"></el-option>
                    <el-option label="高中" value="高中"></el-option>
                    <el-option label="大专及以上" value="大专及以上"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="经济来源" prop="economicSources">
                  <el-input v-model="form.economicSources" placeholder="请输入经济来源"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预约状态" prop="appointmentState">
                  <el-select v-model="form.appointmentState" placeholder="请选择预约状态" style="width:100%" clearable>
                    <el-option label="待预约" :value="1"></el-option>
                    <el-option label="已预约" :value="2"></el-option>
                    <el-option label="已取消" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="兴趣爱好" prop="hobby">
                  <el-input v-model="form.hobby" placeholder="请输入兴趣爱好"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="基础病情况" prop="majorDiseases">
                  <el-input v-model="form.majorDiseases" type="textarea" rows="2" placeholder="请描述基础病情况"></el-input>
                </el-form-item>
              </el-col>
            </el-row>

            <!-- 咨询情况 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>咨询情况</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="咨询方式" prop="consultMode">
                  <el-select v-model="form.consultMode" placeholder="请选择咨询方式" style="width:100%" clearable>
                    <el-option label="线上" value="线上"></el-option>
                    <el-option label="到店" value="到店"></el-option>
                    <el-option label="上门" value="上门"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="咨询意向" prop="consultIntention">
                  <el-select v-model="form.consultIntention" placeholder="请选择咨询意向" style="width:100%" clearable>
                    <el-option label="短期试住" value="短期试住"></el-option>
                    <el-option label="长期入住" value="长期入住"></el-option>
                    <el-option label="仅咨询了解" value="仅咨询了解"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="咨询次数" prop="consultNum">
                  <el-input v-model.number="form.consultNum" placeholder="请输入咨询次数"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="媒介渠道" prop="mediaChannels">
                  <el-select v-model="form.mediaChannels" placeholder="请选择媒介渠道" style="width:100%" clearable>
                    <el-option label="短视频" value="短视频"></el-option>
                    <el-option label="社区推广" value="社区推广"></el-option>
                    <el-option label="亲友推荐" value="亲友推荐"></el-option>
                    <el-option label="线下活动" value="线下活动"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住方式" prop="checkMethod">
                  <el-input v-model="form.checkMethod" placeholder="请输入入住方式"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="可承担费用" prop="assumeCost">
                  <el-input v-model="form.assumeCost" placeholder="请输入可承担费用"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="理想价格" prop="idealPrice">
                  <el-input v-model="form.idealPrice" placeholder="请输入理想价格"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="关注点" prop="concerns">
                  <el-input v-model="form.concerns" placeholder="请输入关注重点"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="客户满意部分" prop="satisfied">
                  <el-input v-model="form.satisfied" placeholder="请输入满意内容"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="客户不满意部分" prop="dissatisfied">
                  <el-input v-model="form.dissatisfied" placeholder="请输入不满意内容"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="推荐人姓名" prop="refereeName">
                  <el-input v-model="form.refereeName" placeholder="请输入推荐人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="营销人ID" prop="receptionId">
                  <el-input v-model="form.receptionId" placeholder="请输入营销人ID"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="营销人姓名" prop="receptionPerson">
                  <el-input v-model="form.receptionPerson" placeholder="请输入营销人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="3" placeholder="请输入备注信息"></el-input>
                </el-form-item>
              </el-col>
            </el-row>
          </el-form>
        </el-main>

      </el-container>
    </el-drawer>
  </div>
</template>

<script>
export default {
  data() {
    return {
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {
          consultType: 2
        }
      },
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false
    };
  },

  created() {
    this.getList()
  },

  mounted() {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/insRegisterConsultInfo/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },

    // 保存
    handleSave() {
      var that = this;
      that.form.type = consultType = 2;
      that.$http.post("/insRegisterConsultInfo/save", that.form).then(function (response) {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: "保存成功",
            showClose: true,
          });
          that.showDialog = false
          that.getList()
        } else {
          that.$notify.info({
            title: "提示",
            message: response.data.message,
            showClose: true,
          });
        }
      }).catch(function (error) {


      })


    },

    //修改
    edit(row) {
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
        that.$http.post("/insRegisterConsultInfo/delete", { "id": id }).then(function (response) {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "删除成功",
              showClose: true,
            });
            that.getList();
          } else {
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
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>

<style lang="less" scoped>
.table-box {
  background-color: white;
  padding: 0 0 10px 0;
}

.dialogBox {
  height: 100%;
  overflow-y: hidden;

  .dialogHeader {
    display: flex;
    padding: 0 15px;
    height: 70px;
    align-items: center;
    justify-content: space-between;
    border-bottom: 1px solid #ddd;
  }

  .dialogMain {
    padding: 15px;

    .dialog-title {
      font-size: 15px;
      display: flex;
      align-items: center;

      .line {
        color: rgb(0, 121, 254);
        font-size: 14px;
        font-weight: 600;
      }
    }
  }
}
</style>

