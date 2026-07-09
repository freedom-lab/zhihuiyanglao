<template>
  <div class="managingPeople hp100 bbox" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <!-- <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item> -->
      <el-breadcrumb-item>人员管理 /</el-breadcrumb-item>
    </el-breadcrumb>
    <!-- 卡片视图 -->
    <el-card>
      <!-- 搜索-->
      <el-row :gutter="20" type="flex" justify="space-between">
        <el-col>
          <!-- <el-button type="primary" size="small">导入</el-button>
          <el-button type="primary" size="small">导出</el-button> -->
        </el-col>
        <el-col>
          <div class="flex align-center justify-end header-search-box">
            <el-select
              v-model="value"
              filterable
              clearable
              placeholder="请选择"
            >
              <el-option
                v-for="item in options"
                :key="item.value"
                :label="item.label"
                :value="item.value"
              >
              </el-option>
            </el-select>
            <el-input
              placeholder="姓名/工号/员工账号/邮箱"
              clearable
              v-model="searchInput"
              class="header-search-input ml10"
            >
              <el-button
                slot="append"
                icon="el-icon-search"
                class="textblue searchBtn"
              ></el-button>
            </el-input>
          </div>
        </el-col>
      </el-row>

      <!-- 用户列表区域 -->
      <el-table
        :data="tableData"
        border
        fit
        :height="height"
        highlight-current-row
        style="width: 100%"
        @sort-change="sortChange"
      >
        <el-table-column label="姓名" align="center" min-width="140">
          <template slot-scope="scope">
            <span>{{ scope.row.familyName }}{{ scope.row.name }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="工号"
          prop="ad"
          sortable="custom"
          align="center"
          min-width="140"
        >
        </el-table-column>
        <el-table-column
          label="员工账号"
          prop="loginName"
          sortable="custom"
          align="center"
          min-width="140"
        >
        </el-table-column>

        <el-table-column
          label="邮箱"
          prop="email"
          sortable="custom"
          align="center"
          min-width="240"
        >
        </el-table-column>

        <el-table-column
          label="状态"
          prop="status"
          sortable="custom"
          align="center"
          min-width="140"
        >
          <template slot-scope="scope">
            <span>{{
              scope.row.status == "1"
                ? "在职"
                : scope.row.status == "2"
                ? "离职"
                : scope.row.status == "3"
                ? "产期休假"
                : scope.row.status == "4"
                ? "代理"
                : scope.row.status == "5"
                ? "供应商"
                : "外部"
            }}</span>
          </template>
        </el-table-column>

        <el-table-column
          label="操作"
          align="center"
          class-name="small-padding fixed-width"
          fixed="right"
          width="180"
        >
          <template slot-scope="scope">
            <el-tooltip
              class="item"
              effect="dark"
              content="编辑"
              placement="bottom"
            >
              <i
                class="el-icon-edit textblue f16"
                @click="gotoDetail(scope.row.id, scope.row.userCode)"
              ></i>
            </el-tooltip>
            <el-tooltip
              class="item"
              effect="dark"
              content="删除"
              placement="bottom"
            >
              <i
                class="el-icon-delete textblue f16 ml20"
                @click="del(scope.row.id)"
              ></i>
            </el-tooltip>
            <el-tooltip
              class="item"
              effect="dark"
              content="重置密码"
              placement="bottom"
            >
              <i class="el-icon-lock textblue f16 ml20" @click="reset(1)"></i>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
      <div class="footerBox">
        <!-- 新增按钮 -->
        <div class="handle-btn wp100" @click="gotoDetail('')">
          <el-button plain class="add-column-btn bbox"
            ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
          >
        </div>
        <!-- 分页区域 -->
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="queryInfo.page"
          :page-sizes="[10, 20, 30, 50]"
          :page-size="queryInfo.size"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
        ></el-pagination>
      </div>
    </el-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      addForm: {
        trueName: "",
        loginName: "",
        phone: "",
        password: "",
      },
      labelPosition: top,
      height: window.innerHeight - 256, //表格高度
      options: [
        {
          value: "在职",
          label: "在职",
        },
        {
          value: "离职",
          label: "离职",
        },
        {
          value: "产期休假",
          label: "产期休假",
        },
        {
          value: "代理",
          label: "代理",
        },
        {
          value: "供应商",
          label: "供应商",
        },
        {
          value: "外部",
          label: "外部",
        },
      ],
      value: "",
      searchInput: "",
      tableData: [],
      loading: true,
      // 获取用户列表查询参数对象
      queryInfo: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 20,
      },
      userlist: [],
      total: 0,
      // 添加用户对话框
      addDialogVisible: false,
      dialogFormVisible: false,
      // 用户添加
      addUserForm: {
        username: "",
        password: "",
        email: "",
        mobile: "",
      },
      // 修改用户
      editDialogVisible: false,
      editUserForm: {},
      // 分配角色对话框
      setRoleDialogVisible: false,
      formLabelWidth: "100",
    };
  },
  created() {
    this.getUserData();
    window.addEventListener("resize", this.getHeight);
  },
  mounted() {
    this.loading = false;
  },
  destroyed() {
    window.removeEventListener("resize", this.getHeight);
  },
  methods: {
    // 监听 pagesize改变的事件
    handleSizeChange(newSize) {
      // console.log(newSize)
      this.queryInfo.size = newSize;
      this.getUserData();
    },
    // 监听 页码值 改变事件
    handleCurrentChange(newSize) {
      // console.log(newSize)
      this.queryInfo.page = newSize;
      this.getUserData();
    },

    // 监听排序
    sortChange() {},

    //跳转到详情
    gotoDetail(id, userCode) {
      this.$router.push({
        path: "/employee/details",
        query: { id: id, userCode: userCode },
      });
    },

    // 删除用户
    async del(id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      // 点击确定 返回值为：confirm
      // 点击取消 返回值为： cancel
      if (confirmResult !== "confirm") {
        // return this.$message.info("已取消删除");
        return this.$notify.info({
          title: "提示",
          message: "已取消删除",
          showClose: false,
        });
      } else {
        var that = this;
        that.$http.delete("/userInfo/" + id).then(function (response) {
          that.$notify.success({
            title: "提示",
            message: "删除成功",
            showClose: true,
          });
          that.getUserData();
        });
      }
    },
    // 重置密码
    async reset(id) {
      const confirmResult = await this.$confirm("请确认重置密码?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      // 点击确定 返回值为：confirm
      // 点击取消 返回值为： cancel
      if (confirmResult !== "confirm") {
        // return this.$message.info("已取消删除");
        return this.$notify.info({
          title: "提示",
          message: "已取消删除",
          showClose: false,
        });
      }
    },

    // 获取人员列表
    getUserData() {
      var that = this;
      var data = {
        pageSize: that.queryInfo.size,
        currPage: that.queryInfo.page,
      };
      that.$http.post("/userInfo/list", data).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.total = response.data.data.count;
          that.tableData = response.data.data.data;
        }
      });
    },
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - 256;
    },
  },
};
</script>

<style lang="less" scoped>
.textblue {
  color: #008eff;
}
.managingPeople {
  .el-card {
    height: calc(100vh - 114px);
    position: relative;
    .el-select > .el-input {
      width: 200px;
    }
    .header-search-box .header-search-input {
      width: 325px;
    }
    input::placeholder {
      font-size: 12px;
    }
    .handle-btn .el-button.add-column-btn {
      width: 100%;
      font-size: 13px;
      background-color: transparent;
      color: #008eff;
      z-index: 102;
    }
    .footerBox {
      position: absolute;
      width: 100%;
      height: 78px;
      left: 20px;
      right: 20px;
      bottom: 0;
    }
  }
}
</style>
