<template>
  <div style="padding:16px">
    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">主动关怀</span>
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

        <!-- 1. 老人关联信息 置顶展示 -->
        <el-table-column label="老人姓名列表" align="center" min-width="180" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderNames }}</template>
        </el-table-column>
        <el-table-column label="联系号码" align="center" min-width="180" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.telNums }}</template>
        </el-table-column>
        <el-table-column label="号码总数" align="center" width="80" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.amount }}</template>
        </el-table-column>

        <!-- 2. 机构信息 -->
        <el-table-column label="机构名称" align="center" min-width="140" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName }}</template>
        </el-table-column>

        <!-- 3. 关怀核心配置 -->
        <el-table-column label="关怀类型" align="center" min-width="130" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ formatCareType(scope.row.careType) }}
          </template>
        </el-table-column>
        <el-table-column label="关怀形式" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.careMode === 0 ? '短信' : '电话' }}
          </template>
        </el-table-column>
        <el-table-column label="关怀内容" align="center" min-width="220" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sendContext }}</template>
        </el-table-column>

        <!-- 4. 发送执行信息 -->
        <el-table-column label="发送状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.sendState === 0 ? '未发送' : '已发送' }}
          </template>
        </el-table-column>
        <el-table-column label="发送时间" align="center" width="120" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sendTime ? scope.row.sendTime.split(' ')[0] : '' }}</template>
        </el-table-column>

        <!-- 5. 区域与扩展字段 -->
        <el-table-column label="所属区域" align="center" min-width="130" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>
        <el-table-column label="启用状态" align="center" width="90" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.status === 1 ? '启用' : '未启用' }}
          </template>
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
            <!-- 1. 老人关联信息（前置） -->
            <el-col :span="12">
              <el-form-item label="老人姓名列表" prop="elderNames">
                <el-input v-model="form.elderNames" placeholder="多个老人姓名用英文逗号分隔" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系号码" prop="telNums">
                <el-input v-model="form.telNums" placeholder="多个手机号用英文逗号分隔" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="号码总数" prop="amount">
                <el-input v-model="form.amount" placeholder="填写推送号码总数量" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="机构名称" prop="institutionName">
                <el-input v-model="form.institutionName" placeholder="所属养老机构名称" />
              </el-form-item>
            </el-col>

            <!-- 2. 关怀基础配置 -->
            <el-col :span="12">
              <el-form-item label="关怀类型" prop="careType">
                <el-input v-model="form.careType" placeholder="0主动关怀 1生日祝福 2节日问候 3天气提醒 4换季叮咛 5事项提醒" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="关怀形式" prop="careMode">
                <el-input v-model="form.careMode" placeholder="0短信 1电话" />
              </el-form-item>
            </el-col>
            <el-col :span="24">
              <el-form-item label="关怀内容" prop="sendContext">
                <el-input v-model="form.sendContext" placeholder="填写推送关怀文案" />
              </el-form-item>
            </el-col>

            <!-- 3. 发送执行信息 -->
            <el-col :span="12">
              <el-form-item label="发送状态" prop="sendState">
                <el-input v-model="form.sendState" placeholder="0未发送 1已发送" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="发送时间" prop="sendTime">
                <el-date-picker v-model="form.sendTime" type="date" value-format="yyyy-MM-dd" placeholder="选择推送日期"
                  style="width:100%" />
              </el-form-item>
            </el-col>

            <!-- 4. 区域与状态备注 -->
            <el-col :span="12">
              <el-form-item label="所属区域" prop="areaName">
                <el-input v-model="form.areaName" placeholder="省/市/区县" />
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="启用状态" prop="status">
                <el-input v-model="form.status" placeholder="1启用 0未启用" />
              </el-form-item>
            </el-col>
            <el-col :span="24">
              <el-form-item label="备注" prop="remark">
                <el-input v-model="form.remark" placeholder="补充说明信息" />
              </el-form-item>
            </el-col>
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
      that.$http.post("/communityActiveCareRecord/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/communityActiveCareRecord/save", that.form).then(function (response) {
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
        that.$http.post("/communityActiveCareRecord/delete", { "id": id }).then(function (response) {
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

