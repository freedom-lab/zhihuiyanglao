<template>
  <div class="menuPermission">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <!-- <el-breadcrumb-item class="pointer" :to="{ path: '/employeeManagement' }"
        >人员管理</el-breadcrumb-item
      > -->
      <el-breadcrumb-item>菜单权限维护 /</el-breadcrumb-item>
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
                      <el-input placeholder="权限名称">
                        <el-button
                          slot="append"
                          icon="el-icon-search"
                        ></el-button>
                      </el-input>
                      <el-button
                        type="primary"
                        icon="el-icon-circle-plus"
                        circle
                        @click="dialogFormVisible = true"
                      ></el-button>
                      <el-dialog
                        title="新增角色"
                        v-if="dialogFormVisible"
                        :visible.sync="dialogFormVisible"
                        @close="addDialogClosed"
                        top="25vh"
                        destroy-on-close="true"
                        center="true"
                      >
                        <el-form
                          :label-position="top"
                          ref="addFormRef"
                          :model="addForm"
                          :rules="addFormRules"
                        >
                          <el-form-item
                            label="角色名称"
                            :label-width="formLabelWidth"
                          >
                            <el-input
                              v-model="addForm.name"
                              autocomplete="off"
                              placeholder="请输入名称"
                            ></el-input>
                          </el-form-item>
                          <!-- <el-form-item label="角色邮箱" :label-width="formLabelWidth" prop="email">
                            <el-input v-model="addForm.email" autocomplete="off" placeholder="请输入邮箱"></el-input>
                          </el-form-item> -->
                        </el-form>
                        <div slot="footer" class="dialog-footer">
                          <el-button @click="dialogFormVisible = false"
                            >退 出</el-button
                          >
                          <el-button type="primary" @click="addRole()"
                            >保 存</el-button
                          >
                        </div>
                      </el-dialog>
                    </el-row>
                  </el-form-item>
                </el-form>
                <!-- 展开面板 -->
                <div class="syste-list mt20">
                  <div class="tabList">
                    <div
                      :class="
                        isActive == i
                          ? 'flex align-center justify-between pointer tabItem active'
                          : 'flex align-center justify-between pointer tabItem'
                      "
                      v-for="(item, i) in postListData"
                      :key="item.id"
                      @click="handlePostInfo(i, item.roleCode, item.id)"
                    >
                      {{ item.name }}
                      <el-button
                        type="primary"
                        icon="el-icon-delete-solid"
                        @click="delectRole(item.id)"
                      >
                      </el-button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </aside>
        </el-col>
        <!-- 右侧对应内容 -->
        <el-col :xs="18" :sm="18" :md="19" :lg="19" class="tree-right">
          <div class="right-box">
            <!-- 菜单列表 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      菜单列表
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="保存菜单列表"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            @click="editSubmit"
                            >保存</el-button
                          >
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-tree
                  :data="setTree"
                  show-checkbox
                  node-key="menuCode"
                  :default-expanded-keys="[0]"
                  :default-checked-keys="defaultKyes"
                  highlight-current
                  :props="defaultProps"
                  ref="tree1"
                >
                </el-tree>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    //  // 验证邮箱的校验规则
    // var checkEmail = (rule, value, callback) => {
    //   // 验证邮箱的正则表达式
    //   const regEmail = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/
    //   if (regEmail.test(value)) {
    //     // 验证通过，合法的邮箱

    //     return callback()
    //   } else {
    //     // 验证不通过，不合法
    //     callback(new Error('请输入合法的邮箱'))
    //   }

    // }
    return {
      postListData: [], // 职位列表
      setTree: [], //菜单树形结构数据
      isActive: 0, //控制选中样式
      defaultProps: {
        children: "childrens",
        label: "name",
      },

      dialogFormVisible: false,
      labelPosition: top,
      // 默认选中
      defaultKyes: [], //这里当点击编辑按钮时带id去请求然后赋值
      roleMenuData: [], // 职位菜单关联表数据
      roleCode: "", // 选中的职位code
      id: "", //选中的职位id
      addForm: {
        name: "",
        creator: window.localStorage.getItem("loginName"),
        // delivery: false,
        // type: [],
        // email:''
      },
      addFormRules: {
        name: [
          { required: true, message: "请输入用户名", trigger: "blur" },
          {
            min: 3,
            max: 10,
            message: "长度在 3 到 10 个字符",
            trigger: "blur",
          },
        ],
      },
      formLabelWidth: "120px",
    };
  },
  created() {
    this.getPostData();
    this.getMenuData();
  },
  methods: {
    // 监听职位点击
    handlePostInfo(i, code, id) {
      console.log("职位code", code);
      this.isActive = i;
      this.roleCode = code;
      this.$nextTick(() => {
        this.getRoleData(code);
      });
    },
    //编辑提交
    editSubmit() {
      // // 目前被选中的菜单节点
      // let checkedKeys = this.$refs.tree1.getHalfCheckedKeys();
      // // 半选中的菜单节点
      let halfCheckedKeys = this.$refs.tree1.getHalfCheckedKeys();
      // checkedKeys.unshift.apply(checkedKeys, halfCheckedKeys);
      // console.log(checkedKeys);
      console.log("halfCheckedKeys", halfCheckedKeys);
      // 全选中的菜单节点
      let checkedKeys = this.$refs.tree1.getCheckedKeys();
      checkedKeys.push.apply(checkedKeys, halfCheckedKeys);
      console.log("checkedKeys", checkedKeys);
      if (checkedKeys.length == 0) {
        this.$message("请选择权限");
        return;
      } else {
        var selectedCodeArr = checkedKeys.filter((item) => {
          return item != "0";
        });
        var editRoleMenu = {
          menuCode: selectedCodeArr.join(","),
          roleCode: this.roleCode,
        };
        var that = this;
        that.$http
          .post("/roleMenuInfo/add", editRoleMenu)
          .then(function (response) {
            //console.log(response);
            that.$notify.success({
              title: "提示",
              message: "保存成功",
              showClose: true,
            });
          })
          .catch(function (error) {
            this.$notify.info({
              title: "提示",
              message: "保存失败",
              showClose: true,
            });
            // console.log(error);
          });
      }
    },
    // 获取职位数据
    getPostData() {
      var that = this;
      that.$http
        .get("/roleInfo", { page: 1, size: 100 })
        .then(function (response) {
          //console.log(response.data.data);
          if (response.data.code == 200) {
            that.postListData = response.data.data.data;
            var code = that.postListData[0].roleCode;
            that.getRoleData(code);
          }
        });
    },
    // 获取数据
    getMenuData() {
      var that = this;
      that.$http.post("/menuInfo/queryTreeList", {}).then(function (response) {
        // console.log(response.data.data.data);
        if (response.data.code == 200) {
          var arr = response.data.data;
          var newArr = {};
          newArr.id = 0;
          newArr.name = "菜单列表";
          newArr.menuCode = 0;
          newArr.childrens = arr;
          that.setTree = [];
          that.setTree.push(newArr);
          console.log(that.setTree);
        }
      });
    },
    //获取菜单与职位关联数据
    getRoleData(code) {
      //清理选中状态
          var that = this;
       that.defaultKyes=[];
       that.$refs.tree1.setCheckedKeys(this.defaultKyes);
       //请求选中数据
      that.$http
        .post("/roleMenuInfo/queryList", {
          roleCode: code,
        })
        .then(function (response) {
          // console.log(response.data);
          console.log(response.data.data);
          if (response.data.code == 200) {
             
            that.defaultKyes = [];
            for (var i in response.data.data) {
              console.log(response.data.data[i].menuCode);
              //查询是否有根节点,无根节点渲染到树中
               let menuCode=response.data.data[i].menuCode
               let hasChildren=that.hasChildren(menuCode,that.setTree)
                  console.log("hasChildren", menuCode+":"+hasChildren);
              if(!hasChildren){
                that.defaultKyes.push(menuCode);
              }
            }
          }
        });
    },
    hasChildren(menuCode,nodes) {
      //判断树中当前节点是不是父亲节点
      for (var i = 0; i < nodes.length; i++) {  
        if (menuCode == nodes[i].menuCode) {
           console.log('current node name :',nodes[i].name);
          if(nodes[i].childrens.length>0){
            return true;
          }
        }
        else{
         let res= this.hasChildren(menuCode, nodes[i].childrens);
         if(res){
            return true;
         }
        }
      }
    },
    // 监听添加用户对话框的关闭事件
    addDialogClosed() {
      this.$refs.addFormRef.resetFields();
    },
    // 点击按钮，添加新用户
    async addRole() {
      this.$refs.addFormRef.validate(async (valid) => {
        // 校验失败
        if (!valid) return;
        // 校验成功，可以发起添加用户的网络请求
        var that = this;
        console.log("addform:", that.addForm);
        that.$http
          .post("/roleInfo/add", that.addForm)
          .then(function (response) {
            console.log(response);
            that.dialogFormVisible = false;
            that.getPostData();
            // console.log(response.data.data);
            if (response.data.code == 200) {
              that.$message({
                message: "保存成功！！！",
                duration: 1500,
                type: "success",
              });
            } else {
              that.$message({
                message: res.data.message,
                duration: 1500,
                type: "error",
              });
            }
          });
      });
    },
    delectRole(id) {
      var that = this;
      // alert(id)
      var data = {
        id: parseInt(id),
      };
      that.$http.post("/roleInfo/delete", data).then(function (response) {
        console.log(response);
        that.getPostData();
        if (response.data.code == 200) {
          that.$message({
            message: "删除成功！！！",
            duration: 1500,
            type: "success",
          });
        } else {
          that.$message({
            message: "删除失败...",
            duration: 1500,
            type: "error",
          });
        }
      });
    },
  },
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
.menuPermission {
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