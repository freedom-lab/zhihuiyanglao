<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">用药关怀提醒</span>
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

        <!-- 1. 老人核心信息 置顶展示 -->
        <el-table-column label="老人姓名" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="手机号码" align="center" width="130" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel }}</template>
        </el-table-column>
        <el-table-column label="机构名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName }}</template>
        </el-table-column>

        <!-- 2. 药物核心信息 -->
        <el-table-column label="药物名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.drugName }}</template>
        </el-table-column>
        <el-table-column label="用药开始日期" align="center" width="120" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.startDate ? scope.row.startDate.split(' ')[0] : '' }}</template>
        </el-table-column>
        <el-table-column label="用药结束日期" align="center" width="120" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.endDate ? scope.row.endDate.split(' ')[0] : '' }}</template>
        </el-table-column>
        <el-table-column label="用药周期" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.drugDays }}天</template>
        </el-table-column>
        <el-table-column label="每次用量" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.drugDosage }}</template>
        </el-table-column>

        <!-- 3. 用药时间与提醒信息 -->
        <el-table-column label="用药时间" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.medicationType === 1 ? '饭前' : '饭后' }}</template>
        </el-table-column>
        <el-table-column label="用药时段" align="center" min-width="120" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.selectTime ?
              scope.row.selectTime.split(',').map(v => v === '1' ? '早上' : v === '2' ? '中午' : v === '3' ? '晚上' : v).join('、') : '' }}
          </template>
        </el-table-column>
        <el-table-column label="用药状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.drugState === 0 ? '未完结' : '已完结' }}</template>
        </el-table-column>
        <el-table-column label="提醒方式" align="center" width="100" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.reminderMethod === 1 ? '每餐提醒' : scope.row.reminderMethod }}</template>
        </el-table-column>
        <el-table-column label="发送内容" align="center" min-width="150" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sendContext }}</template>
        </el-table-column>

        <!-- 4. 扩展信息 -->
        <el-table-column label="所属区域" align="center" min-width="130" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>
        <el-table-column label="启用状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.status === 1 ? '启用' : '未启用' }}</template>
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
            <el-row :gutter="16">
              <!-- 1. 老人信息 优先展示 -->
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="手机号码" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="请输入联系手机号" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="机构名称" prop="institutionName">
                  <el-input v-model="form.institutionName" placeholder="请输入所属机构名称" />
                </el-form-item>
              </el-col>

              <!-- 2. 药物核心信息 -->
              <el-col :span="12">
                <el-form-item label="药物名称" prop="drugName">
                  <el-input v-model="form.drugName" placeholder="请输入药物名称" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用药开始日期" prop="startDate">
                  <el-date-picker v-model="form.startDate" type="date" value-format="yyyy-MM-dd" placeholder="选择用药开始日期"
                    style="width:100%" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用药结束日期" prop="endDate">
                  <el-date-picker v-model="form.endDate" type="date" value-format="yyyy-MM-dd" placeholder="选择用药结束日期"
                    style="width:100%" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用药周期" prop="drugDays">
                  <el-input v-model="form.drugDays" placeholder="请输入用药天数" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="每次用量" prop="drugDosage">
                  <el-input v-model="form.drugDosage" placeholder="请输入每次用量" />
                </el-form-item>
              </el-col>

              <!-- 3. 用药时间与提醒信息 -->
              <el-col :span="12">
                <el-form-item label="用药时间" prop="medicationType">
                  <el-input v-model="form.medicationType" placeholder="1=饭前，2=饭后" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用药时段" prop="selectTime">
                  <el-input v-model="form.selectTime" placeholder="1=早上，2=中午，3=晚上，多选逗号分隔" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="用药状态" prop="drugState">
                  <el-input v-model="form.drugState" placeholder="0=未完结，1=已完结" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="提醒方式" prop="reminderMethod">
                  <el-input v-model="form.reminderMethod" placeholder="1=每餐提醒" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="发送内容" prop="sendContext">
                  <el-input v-model="form.sendContext" placeholder="请输入提醒发送内容" />
                </el-form-item>
              </el-col>

              <!-- 4. 扩展信息 -->
              <el-col :span="12">
                <el-form-item label="所属区域" prop="areaName">
                  <el-input v-model="form.areaName" placeholder="请输入所属区域" />
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="启用状态" prop="status">
                  <el-input v-model="form.status" placeholder="1=启用，0=未启用" />
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" placeholder="请输入补充备注信息" />
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
      that.$http.post("/communityMedicationRemind/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/communityMedicationRemind/save", that.form).then(function (response) {
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
        that.$http.post("/communityMedicationRemind/delete", { "id": id }).then(function (response) {
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

