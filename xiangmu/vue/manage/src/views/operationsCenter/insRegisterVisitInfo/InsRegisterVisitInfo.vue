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

        <el-table-column label="探访时间" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitTime ? scope.row.visitTime.slice(0, 10) : '' }}</template>
        </el-table-column>
        <el-table-column label="探访人" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitName }}</template>
        </el-table-column>
        <el-table-column label="联系电话" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitLinkTel }}</template>
        </el-table-column>
        <el-table-column label="证件类型" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.documentType }}</template>
        </el-table-column>
        <el-table-column label="证件号码" min-width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.documentCode }}</template>
        </el-table-column>
        <el-table-column label="探访人数" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitNum }}</template>
        </el-table-column>
        <el-table-column label="计划离开时间" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.planLeaveTime ? scope.row.planLeaveTime.slice(0, 10) : ''
          }}</template>
        </el-table-column>
        <el-table-column label="与老人关系" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.relationType }}</template>
        </el-table-column>
        <el-table-column label="老人姓名" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="老人身份证" min-width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="老人电话" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel }}</template>
        </el-table-column>
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="房间床位" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedInfo }}</template>
        </el-table-column>
        <el-table-column label="携带物品" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.belongings }}</template>
        </el-table-column>
        <el-table-column label="体温" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.temperature }}</template>
        </el-table-column>
        <el-table-column label="审核状态" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.isAgree === 0 ? '待确认' : scope.row.isAgree === 1 ? '同意' : '拒绝' }}
          </template>
        </el-table-column>
        <el-table-column label="拒绝原因" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.agreeExplain }}</template>
        </el-table-column>
        <el-table-column label="审核人" min-width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.agreeName }}</template>
        </el-table-column>
        <el-table-column label="审核时间" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.agreeTime ? scope.row.agreeTime.slice(0, 10) : '' }}</template>
        </el-table-column>
        <el-table-column label="地区" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>
        <el-table-column label="备注" min-width="130" align="center" show-overflow-tooltip>
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
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>探访人信息</span>
            </div>
            <el-row :gutter="12">
              <el-col :span="12">
                <el-form-item label="探访人姓名：" prop="visitName">
                  <el-input v-model="form.visitName" placeholder="请输入探访人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="探访人联系电话：" prop="visitLinkTel">
                  <el-input v-model="form.visitLinkTel" placeholder="请输入手机号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="证件类型：" prop="documentType">
                  <el-input v-model="form.documentType" placeholder="如身份证、户口本"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="证件号码：" prop="documentCode">
                  <el-input v-model="form.documentCode" placeholder="请输入证件号码"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="探访时间：" prop="visitTime">
                  <el-date-picker v-model="form.visitTime" type="date" placeholder="选择探访日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="探访人数：" prop="visitNum">
                  <el-input v-model="form.visitNum" placeholder="请填写人数"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="计划离开时间：" prop="planLeaveTime">
                  <el-date-picker v-model="form.planLeaveTime" type="date" placeholder="选择离开日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="与老人关系：" prop="relationType">
                  <el-input v-model="form.relationType" placeholder="如子女、配偶、亲属"></el-input>
                </el-form-item>
              </el-col>
            </el-row>

            <div class="dialog-title">
              <span class="line">▎</span>
              <span>老人信息</span>
            </div>
            <el-row :gutter="12">
              <el-col :span="12">
                <el-form-item label="老人姓名：" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人身份证号：" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入老人身份证"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人联系电话：" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="老人联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人性别：" prop="sex">
                  <el-select v-model="form.sex" placeholder="请选择性别" style="width:100%">
                    <el-option label="男" :value="1"></el-option>
                    <el-option label="女" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人房间床位：" prop="bedInfo">
                  <el-input v-model="form.bedInfo" placeholder="楼栋-房间-床位"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="体温：" prop="temperature">
                  <el-input v-model="form.temperature" placeholder="正常36.0~37.2"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="审核状态：" prop="isAgree">
                  <el-select v-model="form.isAgree" placeholder="请选择状态" style="width:100%">
                    <el-option label="待确认" :value="0"></el-option>
                    <el-option label="同意" :value="1"></el-option>
                    <el-option label="拒绝" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="行政区划名称：" prop="areaName">
                  <el-input v-model="form.areaName" placeholder="省/市/区县"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="携带物品：" prop="belongings">
                  <el-input v-model="form.belongings" type="textarea" rows="2" placeholder="填写携带物品清单"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="拒绝原因：" prop="agreeExplain">
                  <el-input v-model="form.agreeExplain" type="textarea" rows="2" placeholder="审核拒绝时填写原因"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注：" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="2" placeholder="其他补充说明"></el-input>
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
        condition: {}
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
      that.$http.post("/insRegisterVisitInfo/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insRegisterVisitInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insRegisterVisitInfo/delete", { "id": id }).then(function (response) {
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
}</style>

