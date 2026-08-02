<template>
  <div class="stationNew" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <!-- <el-breadcrumb-item class="pointer" :to="{ path: '/employeeManagement' }"
        >人员管理</el-breadcrumb-item
      > -->
      <el-breadcrumb-item>岗位管理 /</el-breadcrumb-item>
    </el-breadcrumb>

    <!-- 内容主体 -->
    <div class="bgwhite bort">
      <el-row>
        <!-- 左侧树结构 -->
        <el-col :xs="6" :sm="6" :md="5" :lg="5" class="tree-left">
          <aside class="left-box">
            <div class="left-list-box">
              <div>
                <!-- 搜索 -->
                <el-form>
                  <el-form-item class="left-search">
                    <el-row type="flex" class="row-bg" justify="space-between">
                      <el-input placeholder="岗位名称/岗位类型">
                        <el-button
                          slot="append"
                          icon="el-icon-search"
                        ></el-button>
                      </el-input>
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="新增岗位"
                        placement="bottom"
                      >
                        <el-button
                          type="primary"
                          size="small"
                          plain
                          class="is-circle"
                          @click="addJobsDialog = true"
                          ><i class="el-icon-plus fw900 f16"></i
                        ></el-button>
                      </el-tooltip>
                    </el-row>
                  </el-form-item>
                </el-form>
                <!-- 展开面板 -->
                <div class="syste-list mt10">
                  <!-- <el-collapse v-model="activeName" accordion>
                    <el-collapse-item
                      name="1"
                    > -->
                  <div class="tabList">
                    <div
                      :class="
                        isActive == i
                          ? 'flex align-center justify-between pointer tabItem active'
                          : 'flex align-center justify-between pointer tabItem'
                      "
                      v-for="(item, i) in postListData"
                      :key="item.id"
                      @click="handlePostInfo(i, item)"
                    >
                      <span>{{ item.postName }}</span>
                      <i
                        class="el-icon-close iconblue f18 fw900"
                        @click="delPost(i, item.id)"
                      ></i>
                    </div>
                  </div>
                  <!-- </el-collapse-item>
                  </el-collapse> -->
                </div>
              </div>
            </div>
          </aside>
        </el-col>
        <!-- 右侧对应内容 -->
        <el-col :xs="18" :sm="18" :md="19" :lg="19" class="tree-right">
          <div class="right-box">
            <!-- 基本信息 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      基本信息
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="保存基本信息"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            @click="submitForm('ruleForm')"
                            >保存</el-button
                          >
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="ruleForm"
                  :rules="rules"
                  ref="ruleForm"
                  label-width="150px"
                  class="ruleForm"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="显示名称" prop="displayName">
                        <el-input v-model="ruleForm.displayName"></el-input>
                      </el-form-item>
                    </el-col>
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="岗位类型" prop="stationType">
                        <el-select
                          v-model="ruleForm.stationType"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="处" value="处"></el-option>
                          <el-option label="全芯智造" value="off"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col> -->
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="岗位描述">
                        <el-input v-model="ruleForm.description"></el-input>
                      </el-form-item>
                    </el-col>
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="岗位code" prop="code">
                        <el-input v-model="ruleForm.code"></el-input>
                      </el-form-item>
                    </el-col> -->
                  </el-row>
                </el-form>
              </div>
            </div>
            <!-- 扩展属性 -->
            <!-- <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      扩展属性
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="扩展属性"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            plain
                            class="is-circle"
                            ><i class="el-icon-plus fw900 f16"></i
                          ></el-button>
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="ruleForm"
                  :rules="rules"
                  ref="ruleForm"
                  label-width="150px"
                  class="ruleForm"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="是否标识部门">
                        <el-input disabled></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="部门名称(可不填)">
                        <el-input disabled></el-input>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div> -->
            <!-- 下属人员 -->
            <div class="mb20">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      下属人员
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="下属人员"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            plain
                            class="is-circle"
                            @click="selectPersonDialog = true"
                            ><i class="el-icon-plus fw900 f16"></i
                          ></el-button>
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  :data="tableData"
                  border
                  fit
                  height="437px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column label="姓名" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.familyName }}{{ row.name }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="员工编号" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.loginName }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column label="邮箱" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column>
                  <!-- <el-table-column label="主岗位" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column> -->
                  <!-- <el-table-column label="主部门" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="岗位对应部门" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="职责类型" align="center">
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column> -->
                  <el-table-column
                    label="操作"
                    align="center"
                    class-name="small-padding"
                    fixed="right"
                    width="100"
                  >
                    <template slot-scope="{ row }">
                      <!-- <el-tooltip
                      class="item"
                      effect="dark"
                      content="保存"
                      placement="bottom"
                    >
                      <i class="el-icon-s-claim textblue f16"></i>
                    </el-tooltip> -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="删除"
                        placement="bottom"
                      >
                        <i
                          class="el-icon-close textblue f16 fw700"
                          @click="delUser(row.id)"
                        ></i>
                      </el-tooltip>
                    </template>
                  </el-table-column>
                </el-table>
                <!-- 新增按钮 -->
                <div class="handle-btn wp100">
                  <el-button
                    plain
                    class="add-column-btn"
                    @click="selectPersonDialog = true"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div>
                <!-- 分页区域 -->
                <!-- <el-pagination
                  @size-change="handleSizeChange"
                  @current-change="handleCurrentChange"
                  :current-page="queryInfo.pagenum"
                  :page-sizes="[2, 5, 10, 15]"
                  :page-size="queryInfo.pagesize"
                  layout="total, sizes, prev, pager, next, jumper"
                  :total="total"
                ></el-pagination> -->
              </div>
            </div>
          </div>
        </el-col>
      </el-row>

      <!-- 新增岗位弹出框 -->
      <el-dialog title="新增岗位" :visible.sync="addJobsDialog">
        <el-form
          :model="addJobsForm"
          :rules="addJobsRules"
          ref="addJobsForm"
          label-width="100px"
          class="dia-gap"
          size="mini"
        >
          <el-form-item label="显示名称" prop="displayName">
            <el-input
              v-model="addJobsForm.displayName"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <el-form-item label="岗位描述">
            <el-input
              v-model="addJobsForm.description"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <!-- <el-form-item label="岗位类型" prop="stationType">
            <el-select
              v-model="addJobsForm.stationType"
              placeholder="请选择"
              class="wp100"
            >
              <el-option label="现实类型" value="on"></el-option>
              <el-option label="虚拟类型" value="off"></el-option>
            </el-select>
          </el-form-item> -->
          <!-- <el-form-item label="岗位code" prop="code">
            <el-input v-model="addJobsForm.code" autocomplete="off"></el-input>
          </el-form-item> -->
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="submitForm('addJobsForm')"
            >确 定</el-button
          >
          <el-button @click="addJobsDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 人员选择 -->
      <el-dialog
        title="人员选择"
        :visible.sync="selectPersonDialog"
        class="selectorDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="" class="mr10">
                <el-button slot="append" icon="el-icon-search"></el-button>
              </el-input>
            </el-col>
          </el-row>
        </div>

        <div class="org-selected">
          <el-row>
            <el-col :xs="24" :sm="16" :md="16" :lg="16">
              <el-table
                ref="multipleTable"
                :data="selectTableData"
                tooltip-effect="dark"
                style="width: 100%; margin-top: 0"
                @selection-change="handleSelectionChange"
                fit
                border
                height="354px"
                highlight-current-row
              >
                <el-table-column type="selection" align="center" width="50">
                </el-table-column>
                <el-table-column prop="name" label="姓名" align="center">
                  <template slot-scope="scope"
                    ><span
                      >{{ scope.row.familyName }}{{ scope.row.name }}</span
                    ></template
                  >
                </el-table-column>
                <el-table-column prop="ad" label="AD" align="center">
                </el-table-column>
                <el-table-column prop="email" label="邮箱" align="center">
                </el-table-column>
              </el-table>
              <!-- 分页 -->
              <el-pagination
                @size-change="handleSizeChange2"
                @current-change="handleCurrentChange2"
                :current-page="queryInfo2.page"
                :page-size="queryInfo2.size"
                layout="total, prev, pager, next"
                :total="totle2"
                class="ml10"
                style="margin-bottom: 15px"
              ></el-pagination>
            </el-col>
            <el-col
              :xs="24"
              :sm="8"
              :md="8"
              :lg="8"
              class="selectedUl pr10 bbox"
            >
              <p class="wp100 bbox flex justify-between textblue">
                <span>已选择</span>
                <span class="pointer" @click="empty"
                  ><i class="el-icon-delete"></i> 清空</span
                >
              </p>
              <div class="selectedUl-box">
                <ul>
                  <li
                    class="clearfix"
                    v-for="(item, i) in multipleSelection"
                    :key="item.id"
                  >
                    <span class="floatLeft rightOrderBox">
                      {{ item.familyName }}{{ item.name }}</span
                    >
                    <i
                      class="el-icon-close floatRight iconOrganization iconblue fw700 f15"
                      @click="del(item.id, i)"
                    ></i>
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirm">确 认</el-button>
          <el-button @click="selectPersonDialog = false">取 消</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      userName: "",
      loading: true,
      ruleForm: {
        displayName: "",
        stationType: "",
        description: "",
        code: "",
        id: ""
      }, //基本信息
      rules: {
        displayName: [
          { required: true, message: "【显示名称】不能为空", trigger: "blur" }
        ],
        stationType: [
          {
            required: true,
            message: "【岗位类型】不能为空",
            trigger: "change"
          }
        ],
        code: [
          { required: true, message: "【岗位code】不能为空", trigger: "blur" }
        ]
      }, // 基本信息校验规则
      tableData: [],
      // 获取用户列表查询参数对象
      queryInfo: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 10
      },
      total: 40,
      activeName: "1",
      postListData: [], // 职位列表
      isActive: 0, //控制选中样式
      addJobsDialog: false, // 新增岗位弹出框
      addJobsForm: {
        displayName: "",
        description: "",
        stationType: "",
        code: ""
      }, //新增岗位表单
      addJobsRules: {
        displayName: [
          {
            required: true,
            message: "【显示名称】不能为空",
            trigger: "blur"
          }
        ],
        stationType: [
          {
            required: true,
            message: "【岗位类型】不能为空",
            trigger: "change"
          }
        ],
        code: [
          {
            required: true,
            message: "【岗位code】不能为空",
            trigger: "blur"
          }
        ]
      }, // 新增岗位校验规则
      selectTableData: [], // 下属人员列表
      multipleSelection: [],
      selectPersonDialog: false, //人员选择弹窗
      queryInfo2: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 10
      },
      totle2: "",
      postCode: ""
    };
  },
  created() {
    this.getPostData();
    this.userName = localStorage.getItem("userName");
    this.getAllUserData();
  },
  mounted() {
    this.loading = false;
  },
  methods: {
    // 保存
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          var that = this;
          if (formName == "addJobsForm") {
            that.addJobsDialog = false;
            var addData = {
              postName: that.addJobsForm.displayName,
              description: that.addJobsForm.description,
              postCode: that.randomString(5),
              creator: that.userName
            };
            that.$http
              .post("/post", addData)
              .then(function(response) {
                that.$notify.success({
                  title: "提示",
                  message: "新增岗位成功",
                  showClose: true
                });
                that.addJobsForm = {
                  displayName: "",
                  description: "",
                  stationType: "",
                  code: ""
                };
                that.postListData = [];
                that.getPostData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "新增岗位失败",
                  showClose: true
                });
              });
          }
          if (formName == "ruleForm") {
            var addData = {
              postName: that.ruleForm.displayName,
              description: that.ruleForm.description,
              postCode: that.ruleForm.code,
              id: that.ruleForm.id,
              updator: that.userName
            };
            that.$http
              .put("/post", addData)
              .then(function(response) {
                that.$notify.success({
                  title: "提示",
                  message: "岗位更改成功",
                  showClose: true
                });
                that.postListData = [];
                that.getPostData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "岗位更改失败",
                  showClose: true
                });
              });
          }
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },

    // 监听 pagesize改变的事件
    handleSizeChange(newSize) {
      // console.log(newSize)
      this.queryInfo.pagesize = newSize;
    },
    // 监听 页码值 改变事件
    handleCurrentChange(newSize) {
      // console.log(newSize)
      this.queryInfo.pagenum = newSize;
      // this.getUserList();
    },

    // 监听职位点击
    handlePostInfo(i, data) {
      this.isActive = i;
      this.ruleForm = {
        displayName: data.postName,
        stationType: data.postType,
        description: data.description,
        code: data.postCode,
        id: data.id
      };
      this.postCode = data.postCode;
      this.getUserData(data.postCode);
    },
    //删除职位
    async delPost(index, id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).catch(err => err);
      // 点击确定 返回值为：confirm
      // 点击取消 返回值为： cancel
      if (confirmResult !== "confirm") {
        return this.$notify.info({
          title: "提示",
          message: "已取消删除",
          showClose: true
        });
      } else {
        var that = this;
        // that.postListData.splice(index, 1);
        that.$http.delete("/post/" + id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "删除成功",
            showClose: true
          });
          that.postListData = [];
          that.getPostData();
        });
      }
    },

    // 下属人员删除事件
    async delUser(id) {
      var that = this;
      const confirmResult = await that
        .$confirm("确定删除吗?", "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        })
        .catch(err => err);
      // 点击确定 返回值为：confirm
      // 点击取消 返回值为： cancel
      if (confirmResult !== "confirm") {
        return that.$notify.info({
          title: "提示",
          message: "已取消删除",
          showClose: true
        });
      } else {
        that.$http.delete("/userPost/" + id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "成功删除1条数据",
            showClose: true
          });
          that.getUserData(that.postCode);
        });
      }
    },

    // 人员选择器选择事件
    handleSelectionChange(val) {
      this.multipleSelection = val;
      // console.log(this.multipleSelection);
    },
    // 清空
    empty() {
      this.multipleSelection = [];
      this.$refs.multipleTable.clearSelection();
    },
    //删除
    del(id, i) {
      this.selectTableData.forEach(row => {
        if (row.id == id) {
          this.$refs.multipleTable.toggleRowSelection(row, false);
        }
      });
      this.multipleSelection.slice(i, 1);
    },

    // 添加人员确认
    confirm() {
      // console.log(this.multipleSelection);
      var userCodeList = [];
      for (var i in this.multipleSelection) {
        userCodeList.push(this.multipleSelection[i].userCode);
      }
      this.selectPersonDialog = false;
      var that = this;
      console.log(that.postCode);
      that.$http
        .post("/userPost/addUser", {
          userCode: userCodeList.toString(),
          postCode: that.postCode
        })
        .then(function(response) {
          console.log(response);
          console.log(response.data.code);
          if (response.data.code == 200) {
            if (response.data.data != null) {
              that.$notify.error({
                title: "提示",
                message: response.data.data,
                showClose: true
              });
            } else {
              that.$notify.success({
                title: "提示",
                message: "添加成功",
                showClose: true
              });
            }
          }
          that.getUserData(that.postCode);
          that.$refs.multipleTable.clearSelection();
        })
        .catch(function(error) {});
    },

    // 监听 pagesize改变的事件
    handleSizeChange2(newSize) {
      // console.log(newSize)
      this.queryInfo2.size = newSize;
    },
    // 监听 页码值 改变事件
    handleCurrentChange2(newSize) {
      // console.log(newSize)
      this.queryInfo2.page = newSize;
      this.getAllUserData();
    },

    // 获取岗位数据
    getPostData() {
      var that = this;
      that.$http
        .get("/post", {
          page: 1,
          size: 100
        })
        .then(function(response) {
          // console.log(response.data.data.data);
          if (response.data.code == 200) {
            that.postListData = response.data.data.data;
            that.getUserData(response.data.data.data[0].postCode);
            that.ruleForm = {
              displayName: response.data.data.data[0].postName,
              stationType: response.data.data.data[0].postType,
              description: response.data.data.data[0].description,
              code: response.data.data.data[0].postCode,
              id: response.data.data.data[0].id
            };
            that.postCode = response.data.data.data[0].postCode;
          }
        });
    },

    // 根据postCode获取人员数据
    getUserData(code) {
      // console.log(code);
      var that = this;
      that.$http
        .post("/userPost/queryListByPostCode", { postCode: code })
        .then(function(response) {
          // console.log(response);
          console.log(response.data.data);
          if (response.data.code == 200) {
            that.tableData = response.data.data;
            //  console.log(that.userData);
          }
        });
    },

    // 获取全部人员数据
    getAllUserData() {
      var that = this;
      that.$http.get("/userInfo", that.queryInfo2).then(function(response) {
        // console.log(response.data.data);
        // console.log(response.data.data.data);
        if (response.data.code == 200) {
          that.totle2 = response.data.data.count;
          that.selectTableData = response.data.data.data;
        }
      });
    },

    // 获取随机字符串
    randomString(e) {
      e = e || 32;
      var t = "ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678",
        a = t.length,
        n = "";
      for (var i = 0; i < e; i++) n += t.charAt(Math.floor(Math.random() * a));
      return n;
    }
  }
};
</script>

<style lang="less" scope>
.h50 {
  height: 50px;
}
.handle-btn .el-button.add-column-btn {
  width: 100%;
  font-size: 13px;
  background-color: transparent;
  color: #008eff;
  margin-top: -1px;
  position: relative;
  z-index: 100;
}
.stationNew {
  .tree-left {
    // width: 280px;
    .left-list-box {
      padding: 20px 10px;
      height: calc(100vh - 110px);
      .el-form-item {
        margin-bottom: 0;
        .el-form-item__content {
          line-height: 30px;
        }
      }
      .selma {
        width: 72%;
      }
      .el-button.is-circle {
        margin-left: 7px;
      }
      .syste-list {
        height: calc(100vh - 240px);
        margin-bottom: 20px;
        position: relative;
        overflow: auto;
        .el-collapse-item__header {
          padding: 0 10px;
          box-sizing: border-box;
          color: #2f405b;
          font-size: 13px;
        }
        .tabList {
          .tabItem {
            padding: 0 15px;
            font-size: 13px;
            height: 40px;
            line-height: 40px;
            span {
              display: inline-block;
              color: #51637f;
              overflow: hidden;
              text-overflow: ellipsis;
              white-space: nowrap;
              width: 100%;
            }
          }
          .tabItem:hover {
            background-color: #e0effa;
          }
          .active {
            background-color: #f6f7f8;
          }
        }
      }
    }
  }
  .tree-right {
    // width: calc(100% - 280px);
    .right-box {
      padding-left: 16px;
      padding-right: 16px;
      height: calc(100vh - 110px);
      overflow: auto;
      border-left: 2px solid #eff4f8;
      .header-search {
        .title {
          height: 50px;
          line-height: 49px;
          font-size: 15px;
          color: #2f405b;
          padding-left: 10px;
          border-bottom: 1px solid #e3eaf0;
          margin-bottom: 18px;
          .line {
            display: inline-block;
            width: 3px;
            height: 15px;
            background-color: #2f91df;
            margin-right: 5px;
            border-radius: 2px;
            margin-bottom: -2px;
          }
        }
      }
      .header-input {
        font-size: 13px;
      }
    }
  }
  @media screen and (max-width: 1600px) {
    .tree-left {
      width: 280px;
    }
    .tree-right {
      width: calc(100% - 280px);
    }
  }
  .el-dialog {
    margin-top: 15vh;
    width: 600px;
  }
  .el-input-number--mini {
    width: 100%;
  }
  .el-input-number .el-input__inner {
    text-align: left;
  }
}
</style>
