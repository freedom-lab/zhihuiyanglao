<template>
  <div class="menuPermission" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <!-- <el-breadcrumb-item class="pointer" :to="{ path: '/employeeManagement' }"
        >人员管理</el-breadcrumb-item
      > -->
      <el-breadcrumb-item>菜单管理 /</el-breadcrumb-item>
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
                      <el-input
                        placeholder="菜单名称"
                        clearable
                        v-model="filterText"
                      >
                        <el-button
                          slot="append"
                          icon="el-icon-search"
                          @click="filterMenu(filterText)"
                        ></el-button>
                      </el-input>
                    </el-row>
                  </el-form-item>
                </el-form>
                <!-- 树形结构 -->
                <div class="syste-list mt10">
                  <el-tree
                    :data="setTree"
                    node-key="id"
                    :default-expanded-keys="[0]"
                    :default-checked-keys="defaultKyes"
                    :current-node-key="529"
                    :props="defaultProps"
                    :filter-node-method="filterNode"
                    ref="tree"
                    :highlight-current="treeFlag"
                    :expand-on-click-node="false"
                    @node-click="handleNodeClick"
                  >
                    <span class="custom-tree-node" slot-scope="{ node, data }">
                      <span>{{ node.label }}</span>
                      <span class="treeTool">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="添加"
                          placement="bottom"
                        >
                          <el-button
                            type="text"
                            size="mini"
                            icon="el-icon-document-add"
                            @click="() => append(data)"
                          >
                          </el-button>
                        </el-tooltip>
                        <span v-if="node.label != '菜单列表'">
                          <el-tooltip
                            class="item"
                            effect="dark"
                            content="删除"
                            placement="bottom"
                          >
                            <el-button
                              type="text"
                              size="mini"
                              icon="el-icon-delete"
                              @click="() => remove(node, data)"
                            >
                            </el-button>
                          </el-tooltip>
                        </span>
                      </span>
                    </span>
                  </el-tree>
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
                        <el-button
                          type="primary"
                          size="small"
                          @click="submitForm('menuForm')"
                          >保存</el-button
                        >
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="menuForm"
                  :rules="rules"
                  ref="menuForm"
                  label-width="150px"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="菜单名称" prop="menuName">
                        <el-input v-model="menuForm.menuName"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="菜单路由" prop="menuPath">
                        <el-input v-model="menuForm.menuPath"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="24">
                      <el-form-item label="菜单排序">
                        <el-input-number
                          v-model="menuForm.sort"
                          controls-position="right"
                          @change="handleSortChange"
                          :min="1"
                          :max="100"
                        ></el-input-number>
                      </el-form-item>
                    </el-col>

                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="默认菜单图标">
                        <el-upload
                          class="avatar-uploader"
                          :action="$uploadURL"
                          :show-file-list="false"
                          :on-success="function (response, file) { return handleUploadSuccess(response, file, '1') }"
                          :before-upload="beforeUpload"
                        >
                          <img
                            v-if="menuForm.iconUrl"
                            :src="menuForm.iconUrl"
                            class="avatar"
                            style="width:100px;height:100px"
                          />
                          <i
                            v-else
                            class="el-icon-plus avatar-uploader-icon"
                          ></i>
                        </el-upload>
                      </el-form-item>
                    </el-col>

                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="选中菜单图标">
                        <el-upload
                          class="avatar-uploader"
                          :action="$uploadURL"
                          :show-file-list="false"
                          :on-success="function (response, file) { return handleUploadSuccess(response, file, '2') }"
                          :before-upload="beforeUpload"
                        >
                          <img
                            v-if="menuForm.activeIconUrl"
                            :src="menuForm.activeIconUrl"
                            class="avatar"
                            style="width:100px;height:100px"
                          />
                          <i
                            v-else
                            class="el-icon-plus avatar-uploader-icon"
                          ></i>
                        </el-upload>
                      </el-form-item>
                    </el-col>

                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="打开方式" prop="openStyle">
                        <el-select
                          v-model="menuForm.openStyle"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option
                            label="内嵌iframe打开"
                            value="on"
                          ></el-option>
                          <el-option
                            label="自动加载打开"
                            value="off"
                          ></el-option>
                          <el-option label="新窗口打开" value="off"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col> -->
                  </el-row>
                </el-form>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>

      <!-- 添加菜单节点弹出框 -->
      <el-dialog title="菜单列表" :visible.sync="menuDialog">
        <el-form
          :model="menuDialogForm"
          :rules="rules"
          ref="menuDialogForm"
          label-width="100px"
          class="dia-gap"
          size="mini"
        >
          <el-form-item label="菜单名称" prop="menuName">
            <el-input v-model="menuDialogForm.menuName"></el-input>
          </el-form-item>
          <el-form-item label="菜单路由" prop="menuPath">
            <el-input v-model="menuDialogForm.menuPath"></el-input>
          </el-form-item>
          <el-form-item label="菜单排序">
            <el-input-number
              v-model="menuDialogForm.sort"
              controls-position="right"
              @change="handleSortChange"
              :min="1"
              :max="100"
            ></el-input-number>
          </el-form-item>
          <el-form-item label="菜单图标">
            <el-upload
              class="avatar-uploader"
              :action="$uploadURL"
              :show-file-list="false"
              :on-success="handleAddUploadSuccess"
              :before-upload="beforeUpload"
            >
              <img
                v-if="menuDialogForm.iconUrl"
                :src="menuDialogForm.iconUrl"
                class="avatar"
                style="width:100px;height:100px"
              />
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <!-- <el-form-item label="菜单地址">
            <el-input v-model="menuDialogForm.menuAssd"></el-input>
          </el-form-item> -->
          <!-- <el-form-item label="打开方式" prop="openStyle">
            <el-select
              v-model="menuDialogForm.openStyle"
              placeholder="请选择"
              class="wp100"
            >
              <el-option label="内嵌iframe打开" value="on"></el-option>
              <el-option label="自动加载打开" value="off"></el-option>
              <el-option label="新窗口打开" value="off"></el-option>
            </el-select>
          </el-form-item> -->
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="submitForm('menuDialogForm')"
            >确 认</el-button
          >
          <el-button @click="menuDialog = false">取 消</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
let id = 200;
export default {
  data() {
    return {
      loading: true,
      filterText: "", //搜索菜单
      treeFlag: true, //树形结构当前节点高亮
      setTree: [], //菜单树形结构数据
      defaultProps: {
        children: "childrens",
        label: "name"
      },
      menuForm: {
        menuName: "",
        menuPath: "",
        sort: "0",
        iconUrl: "",
        activeIconUrl: "",
        iconStyle: "",
        menuAssd: "",
        openStyle: "",
        id: ""
      }, //基本信息
      rules: {
        menuName: [
          { required: true, message: "【菜单名称】不能为空", trigger: "blur" }
        ],
        menuPath: [
          { required: true, message: "【菜单路由】不能为空", trigger: "blur" }
        ]
        // iconStyle: [
        //   { required: true, message: "【菜单名称】不能为空", trigger: "blur" },
        // ],
        // openStyle: [
        //   {
        //     required: true,
        //     message: "请选择打开方式",
        //     trigger: "change",
        //   },
        // ],
      }, // 基本信息校验规则
      menuDialogForm: {
        menuName: "",
        menuPath: "",
        sort: "0",
        iconUrl: "",
        activeIconUrl: "",
        menuAssd: "",
        openStyle: ""
      }, //添加菜单列表
      menuDialog: false, //控制弹窗显示隐藏
      indexId: "", //首页id
      addData: {}, //添加节点转存数据
      saveAddData: {}, //存入后台的添加节点数据
      userName: "admin",
      defaultKyes: []
    };
  },
  created() {
    this.getMenuData();
    this.userName = localStorage.getItem("userName");
  },
  mounted() {
    this.loading = false;
  },
  methods: {
    // 点击搜索按钮
    filterMenu(text) {
      this.$refs.tree.filter(text);
    },
    // 树形组件筛选功能
    filterNode(value, data) {
      if (!value) return true;
      return data.label.indexOf(value) !== -1;
    },

    // 树形组件节点点击事件
    handleNodeClick(data) {
      //console.log(data);
      this.menuForm.menuName = data.name;
      this.menuForm.menuPath = data.link;
      this.menuForm.sort = data.menuOrder;
      this.menuForm.iconUrl = data.iconUrl;
      this.menuForm.activeIconUrl = data.activeIconUrl;
      this.menuForm.id = data.id;
    },

    // 添加节点
    append(data) {
      console.log(data);
      this.addData = data;
      this.menuDialog = true;
    },

    // 删除用户
    async remove(node, data) {
      console.log(data);
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
        // const parent = node.parent;
        // const children = parent.data.childrens || parent.data;
        // const index = children.findIndex((d) => d.id === data.id);
        // children.splice(index, 1);
        that.$http.delete("/menuInfo/" + data.id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "删除成功",
            showClose: true
          });
          that.setTree = [];
          that.getMenuData();
        });
      }
    },
    //图片上传成功处理
    handleUploadSuccess(res, file, type) {
      console.log(type);
      if (type == 1) {
        this.menuForm.iconUrl = file.response.data.url;
      }else {
        this.menuForm.activeIconUrl = file.response.data.url;
      }
      
    },
    //图片上传成功处理
    handleAddUploadSuccess(res, file) {
      this.menuDialogForm.iconUrl = file.response.data.url;
    },
    //图片上传之前处理
    beforeUpload(file) {
      // const isLt2M = file.size / 1024 / 1024 < 2;
      // if (!isLt2M) {
      //   this.$message.error("上传图片大小不能超过 2MB!");
      // }
      // return  isLt2M;
    },
    // 组织排序
    handleSortChange(value) {
      console.log(value);
    },

    // 保存
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          if (formName == "menuDialogForm") {
            this.menuDialog = false;
            //console.log(this.addData);
            this.saveAddData.name = this.menuDialogForm.menuName;
            this.saveAddData.link = this.menuDialogForm.menuPath;
            this.saveAddData.menuOrder = this.menuDialogForm.sort;
            this.saveAddData.iconUrl = this.menuDialogForm.iconUrl;
            this.saveAddData.activeIconUrl = this.menuDialogForm.activeIconUrl;
            this.saveAddData.creator = this.userName;
            this.saveAddData.menuCode = this.randomString(20);
            if (this.addData.name == "菜单列表") {
              this.saveAddData.parentCode = "";
            } else {
              this.saveAddData.parentCode = this.addData.menuCode;
            }
            //console.log(this.saveAddData);
            var that = this;
            that.$http
              .post("/menuInfo", that.saveAddData)
              .then(function(response) {
                //console.log(response);
                that.$notify.success({
                  title: "提示",
                  message: "增加成功",
                  showClose: true
                });
                that.menuDialogForm = {
                  menuName: "",
                  menuPath: "",
                  sort: "",
                  iconStyle: "",
                  menuAssd: ""
                };
                that.setTree = [];
                that.getMenuData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "增加失败",
                  showClose: true
                });
                // console.log(error);
              });
          }
          if (formName == "menuForm") {
            var arr = {};
            arr.id = this.menuForm.id;
            arr.name = this.menuForm.menuName;
            arr.link = this.menuForm.menuPath;
            arr.menuOrder = this.menuForm.sort;
            arr.iconUrl = this.menuForm.iconUrl;
            arr.activeIconUrl = this.menuForm.activeIconUrl;
            //console.log(this.saveAddData);
            var that = this;
            that.$http
              .put("/menuInfo", arr)
              .then(function(response) {
                //console.log(response);
                that.$notify.success({
                  title: "提示",
                  message: "更改成功",
                  showClose: true
                });
                that.setTree = [];
                that.getMenuData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "更改失败",
                  showClose: true
                });
                // console.log(error);
              });
          }
        } else {
          console.log("error submit!!");
          return false;
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
    },

    // 获取数据
    getMenuData() {
      var that = this;
      that.$http.post("/menuInfo/queryTreeList", {}).then(function(response) {
        console.log(response.data);
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.defaultKyes.push(response.data.data[0].id);
          that.$refs.tree.setCheckedKeys(that.defaultKyes);
          that.menuForm.menuName = response.data.data[0].name;
          that.menuForm.menuPath = response.data.data[0].link;
          that.menuForm.sort = response.data.data[0].menuOrder;
          that.menuForm.iconUrl = response.data.data[0].iconUrl;
          that.menuForm.activeIconUrl = response.data.data[0].activeIconUrl;
          that.menuForm.id = response.data.data[0].id;
          var arr = response.data.data;
          var newArr = {};
          newArr.id = 0;
          newArr.name = "菜单列表";
          newArr.childrens = arr;
          that.setTree.push(newArr);
        }
        // if (response.data.code == 200) {
        //   // that.setTree = response.data.data;
        //   for (var i in response.data.data.data) {
        //     if (response.data.data.data[i].name == "首页") {
        //       that.indexId = response.data.data.data[i].id;
        //       //console.log(that.indexId);
        //       that.menuForm.menuName = response.data.data.data[i].name;
        //       that.menuForm.menuPath = response.data.data.data[i].link;
        //       that.menuForm.sort = response.data.data.data[i].menuOrder;
        //       that.menuForm.iconStyle = response.data.data.data[i].iconUrl;
        //     }
        //   }
        //   var arr = that.translateDataToTree(response.data.data.data);
        //  // console.log(arr);
        //   arr.sort((a, b) => {
        //     return a.id - b.id;
        //   });

        //   var newArr = {};
        //   newArr.id = 0;
        //   newArr.name = "菜单列表";
        //   newArr.childrens = arr;
        //   that.setTree.push(newArr);
        //   console.log(that.setTree);
        // }
      });
    },
    // 转换数据
    translateDataToTree(data) {
      //没有父节点的数据
      var parents = data.filter(value => value.parentCode == "");
      console.log(parents);

      //有父节点的数据
      var childrens = data.filter(value => value.parentCode !== "");
      console.log(childrens);

      //定义转换方法的具体实现
      var translator = (parents, childrens) => {
        //遍历父节点数据
        parents.forEach(parent => {
          //遍历子节点数据
          childrens.forEach((current, index) => {
            //此时找到父节点对应的一个子节点
            if (current.parentCode === parent.menuCode) {
              //对子节点数据进行深复制，这里只支持部分类型的数据深复制，对深复制不了解的童靴可以先去了解下深复制
              var temp = JSON.parse(JSON.stringify(childrens));
              //让当前子节点从temp中移除，temp作为新的子节点数据，这里是为了让递归时，子节点的遍历次数更少，如果父子关系的层级越多，越有利
              temp.splice(index, 1);
              //让当前子节点作为唯一的父节点，去递归查找其对应的子节点
              translator([current], temp);
              //把找到子节点放入父节点的childrens属性中
              typeof parent.childrens !== "undefined"
                ? parent.childrens.push(current)
                : (parent.childrens = [current]);
            }
          });
        });
      };

      //调用转换方法
      translator(parents, childrens);
      console.log(parents);

      //返回最终的结果
      return parents;
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
.avatar {
  width: 100px;
  height: 100px;
  display: block;
}
.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}
.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 100px;
  height: 100px;
  line-height: 100px;
  text-align: center;
}
.menuPermission {
  .tree-left {
    width: 280px;
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
      }
    }
  }
  .tree-right {
    width: calc(100% - 280px);
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
