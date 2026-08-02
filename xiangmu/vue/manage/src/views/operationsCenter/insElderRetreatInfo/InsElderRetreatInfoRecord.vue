<template>
  <div style="padding:16px">
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">老人退住记录</span>
        </el-col>
        <el-col :span="10">
          <div class="top-right-sort">
            <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
              <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
            </el-input>
            <el-button type="primary" @click="newBtn">新建</el-button>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <!-- 第一层：机构/运营信息 -->
        <el-table-column label="运营公司" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.corpName }}</template>
        </el-table-column>
        <el-table-column label="养老机构" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName }}</template>
        </el-table-column>

        <!-- 第二层：老人基础信息 -->
        <el-table-column label="老人姓名" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="身份证号" align="center" min-width="180" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="性别" align="center" width="70" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="年龄" align="center" width="70" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.age }}</template>
        </el-table-column>
        <el-table-column label="床位" align="center" min-width="120" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedInfo }}</template>
        </el-table-column>

        <!-- 第三层：入住、退住核心业务 -->
        <el-table-column label="入住日期" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.checkDate ? scope.row.checkDate.split(' ')[0] : '' }}
          </template>
        </el-table-column>
        <el-table-column label="入住状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.checkState }}</template>
        </el-table-column>
        <el-table-column label="退住日期" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.retreatTime ? scope.row.retreatTime.split(' ')[0] : '' }}
          </template>
        </el-table-column>
        <el-table-column label="退住类型" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.retreatType }}</template>
        </el-table-column>
        <el-table-column label="退住原因" align="center" min-width="160" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.retreatMemo }}</template>
        </el-table-column>
        <el-table-column label="经办人" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.handledName }}</template>
        </el-table-column>

        <!-- 第四层：审核、结算信息 -->
        <el-table-column label="审核状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditState }}</template>
        </el-table-column>
        <el-table-column label="审核人" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditName }}</template>
        </el-table-column>
        <el-table-column label="审核时间" align="center" width="110" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.auditTime ? scope.row.auditTime.split(' ')[0] : '' }}
          </template>
        </el-table-column>
        <el-table-column label="审核意见" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.auditMemo }}</template>
        </el-table-column>
        <el-table-column label="账单核算" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isCalculate === 1 ? '未核算' : '已核算' }}</template>
        </el-table-column>

        <!-- 第五层：扩展字段 -->
        <el-table-column label="所属区域" align="center" min-width="130" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" min-width="150" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>

        <!-- 操作列 -->
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
      <div class="block" style="margin-top: 10px;">
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
            <el-row :gutter="12">
              <!-- 机构运营 -->
              <el-col :span="12">
                <el-form-item label="运营公司" prop="corpName">
                  <el-input v-model="form.corpName" placeholder="请输入运营公司名称" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="养老机构" prop="institutionName">
                  <el-input v-model="form.institutionName" placeholder="请输入机构名称" />
                </el-form-item>
              </el-col>

              <!-- 老人基础 -->
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入身份证号码" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别" prop="sex">
                  <el-input v-model="form.sex" placeholder="1=男 2=女" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="年龄" prop="age">
                  <el-input v-model="form.age" placeholder="请输入年龄" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="床位信息" prop="bedInfo">
                  <el-input v-model="form.bedInfo" placeholder="例：1号楼-201床位" />
                </el-form-item>
              </el-col>

              <!-- 入住退住业务 -->
              <el-col :span="12">
                <el-form-item label="入住日期" prop="checkDate">
                  <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期" value-format="yyyy-MM-dd"
                    style="width:100%" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住状态" prop="checkState">
                  <el-input v-model="form.checkState" placeholder="2=试住，其他按字典值填写" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="退住日期" prop="retreatTime">
                  <el-date-picker v-model="form.retreatTime" type="date" placeholder="选择退住日期" value-format="yyyy-MM-dd"
                    style="width:100%" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="退住类型" prop="retreatType">
                  <el-input v-model="form.retreatType" placeholder="填写对应字典编码/名称" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="退住原因" prop="retreatMemo">
                  <el-input v-model="form.retreatMemo" placeholder="填写详细退住原因" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="经办人" prop="handledName">
                  <el-input v-model="form.handledName" placeholder="操作经办人姓名" />
                </el-form-item>
              </el-col>

              <!-- 审核结算 -->
              <el-col :span="12">
                <el-form-item label="审核状态" prop="auditState">
                  <el-input v-model="form.auditState" placeholder="1=未审核，2=通过，3=驳回" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="审核人" prop="auditName">
                  <el-input v-model="form.auditName" placeholder="审核人员姓名" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="审核时间" prop="auditTime">
                  <el-date-picker v-model="form.auditTime" type="date" placeholder="选择审核日期" value-format="yyyy-MM-dd"
                    style="width:100%" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="审核意见" prop="auditMemo">
                  <el-input v-model="form.auditMemo" placeholder="填写审核意见、驳回理由" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="账单核算状态" prop="isCalculate">
                  <el-input v-model="form.isCalculate" placeholder="1=未核算，2=已核算" />
                </el-form-item>
              </el-col>

              <!-- 扩展信息 -->
              <el-col :span="12">
                <el-form-item label="所属区域" prop="areaName">
                  <el-input v-model="form.areaName" placeholder="省/市/区县名称" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" placeholder="其他补充备注信息" />
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
      that.$http.post("/insElderRetreatInfo/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insElderRetreatInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insElderRetreatInfo/delete", { "id": id }).then(function (response) {
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

.table-box ::v-deep .el-table .cell {
    white-space: nowrap;
    /* 强制不换行 */
    overflow: hidden;
    /* 超出隐藏 */
    text-overflow: ellipsis;
    /* 超出显示省略号 */
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

.top-right-sort {
    display: flex;
    align-items: center;
    gap: 10px;
}
</style>