<template>
  <div class="menuPermission" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <!-- <el-breadcrumb-item class="pointer" :to="{ path: '/employeeManagement' }"
        >人员管理</el-breadcrumb-item
      > -->
      <el-breadcrumb-item>组织类型管理 /</el-breadcrumb-item>
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
                       placeholder="组织类型"
                       clearable
                       v-model="searchText"
                       >
                        <el-button
                          slot="append"
                          icon="el-icon-search"
                          @click="filterType"
                        ></el-button>
                      </el-input>
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
                      @click="handlePostInfo(i, item)"
                    >
                      {{ item.organTypeName }}
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
            <!-- 基本信息 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      基本信息
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="ruleForm"
                  ref="ruleForm"
                  label-width="150px"
                  class="ruleForm"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="名称">
                        <el-input
                          v-model="ruleForm.displayName"
                          disabled
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="描述">
                        <el-input
                          v-model="ruleForm.description"
                          disabled
                        ></el-input>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div>
            <!-- 岗位信息 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      岗位信息
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-input
                          placeholder="岗位类型"
                          prefix-icon="el-icon-search"
                          class="mr10"
                        >
                          <el-button
                            slot="append"
                            icon="el-icon-search"
                          ></el-button>
                        </el-input>
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
                  height="505px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column
                    label="岗位名称"
                    prop="AD"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="{ row }">
                      <span>{{ row.AD }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column
                    label="岗位类型"
                    prop="AD"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="{ row }">
                      <span>{{ row.Account }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="岗位描述"
                    prop="email"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="{ row }">
                      <span>{{ row.email }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="操作"
                    align="center"
                    fixed="right"
                    class-name="small-padding fixed-width"
                  >
                  </el-table-column>
                </el-table>
                <!-- 新增按钮 -->
                <div class="handle-btn wp100">
                  <el-button plain class="add-column-btn"   @click="addPost"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div>

                <!-- 分页区域 -->
                <el-pagination
                  @size-change="handleSizeChange"
                  @current-change="handleCurrentChange"
                  :current-page="queryInfo.pagenum"
                  :page-sizes="[2, 5, 10, 15]"
                  :page-size="queryInfo.pagesize"
                  layout="total, sizes, prev, pager, next, jumper"
                  :total="totle"
                ></el-pagination>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
     
         <!-- 岗位信息弹窗 -->
      <el-dialog
        title="岗位信息"
        :visible.sync="selectPostDialog"
        class="selectorDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="岗位名称" class="mr10">
                <el-button slot="append" icon="el-icon-search"></el-button>
              </el-input>
            </el-col>
          </el-row>
        </div>

        <div class="org-selected">
          <el-row>
            <el-col :xs="24" :sm="14" :md="14" :lg="14">
              <div class="pl10 pr10 bbox">
                <div class="checkbox">
                  <el-checkbox
                    :indeterminate="isIndeterminate"
                    v-model="checkAll"
                    @change="handleCheckAllChange"
                    >全选</el-checkbox
                  >
                </div>
                <div class="checkbox-group borb">
                  <el-checkbox-group
                    v-model="checkedItems"
                    @change="handleCheckedItemsChange"
                  >
                    <div
                      class="checkboxItem"
                      v-for="item in selectPostData"
                      :key="item.id"
                    >
                      <el-checkbox :label="item.postName">{{
                        item.postName
                      }}</el-checkbox>
                    </div>
                  </el-checkbox-group>
                </div>
              </div>

              <!-- 分页 -->
              <el-pagination
                @size-change="handleSizeChangePost"
                @current-change="handleCurrentChangePOst"
                :current-page="queryInfoPost.page"
                :page-size="queryInfoPost.size"
                layout="total, prev, pager, next"
                :total="totlePost"
                style="margin: 10px"
              ></el-pagination>
            </el-col>
            <el-col
              :xs="24"
              :sm="10"
              :md="10"
              :lg="10"
              class="selectedUl pr10 bbox"
            >
              <p class="wp100 bbox flex justify-between textblue">
                <span>已选择</span>
                <span class="pointer" @click="emptyPostInfo"
                  ><i class="el-icon-delete"></i> 清空</span
                >
              </p>
              <div class="selectedUl-box" style="height: 240px !important">
                <ul>
                  <li
                    class="clearfix"
                    v-for="(item, i) in multipleSelection"
                    :key="item.id"
                  >
                    <span class="floatLeft rightOrderBox">{{
                      item.postName
                    }}</span>
                    <i
                      class="el-icon-close floatRight iconOrganization iconblue fw700 f15"
                      @click="delPostInfo(item.postName, i)"
                    ></i>
                    <!-- <i
                      class="el-icon-sort-up floatRight iconOrganization iconblue fw700"
                      @click="changeup(item.id, i)"
                    ></i>
                    <i
                      class="el-icon-sort-down floatRight iconOrganization iconblue fw700"
                      @click="changedown(item.id, i)"
                    ></i> -->
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirmPost">确 认</el-button>
          <el-button @click="selectPostDialog = false">取 消</el-button>
        </div>
      </el-dialog>

  </div>
</template>

<script>
export default {
  data() {
    return {
      loading: true,
      searchText:"", // 搜索类型
      postListData: [], // 职位列表
      isActive: -1, //控制选中样式
      ruleForm: {
        displayName: "",
        description: "",
        id: "",
      }, //基本信息
      tableData: [],
      queryInfo: {
        query: "",
        // 当前页数
        pagenum: 1,
        // 每页显示多少数据
        pagesize: 5,
      },
      totle: 40,
      selectPostDialog: false, // 选择岗位弹窗
      selectPostData: [], // 岗位信息表格数据
      multipleSelection: [], // 岗位选中列表
      checkAll: false, //全选状态
      checkedItems: [], // 默认选中
      isIndeterminate: true, //表示 checkbox 的不确定状态，一般用于实现全选的效果
      queryInfoPost: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 20,
      },
      totlePost: '',

    };
  },
  created() {
    this.getPostTypeData();
    this.getPostInfoData()
  },
  mounted() {
    this.loading = false;
  },
  methods: {
    // 监听职位点击
    handlePostInfo(i, data) {
      this.isActive = i;
      this.ruleForm = {
        displayName: data.organTypeName,
        description: data.description,
        id: data.id
      };
    },

    // 搜索
    filterType(){
      var that = this;
      that.$http.post('postType/queryList',{postTypeName:that.searchText})
      .then(function(response){
        console.log(response)
        if(response.data.code == 200){
            that.postListData =response.data.data 
        }
      })
    },

    // 新增岗位
    addPost(){
      if(this.isActive == -1){
        return this.$notify.error({
          title:'',
          dangerouslyUseHTMLString: true,
          message: '<div style="color:#f56c6c;margin-top:-5px">请先选择组织类别</div>',
          showClose: true
        });
      }else{
        this.selectPostDialog = true

      }
    },
 
    // 向上交换
    changeup(id, i) {
      if (i != 0) {
        this.multipleSelection.splice(
          i,
          1,
          ...this.multipleSelection.splice(i - 1, 1, this.multipleSelection[i])
        );
      } else {
        return;
      }
    },
    // 向下交换
    changedown(id, i) {
      // arr.splice(0,1,...arr.splice(1,1,arr[0])) 将第一个值换成第二个值
      this.multipleSelection.splice(
        i,
        1,
        ...this.multipleSelection.splice(i + 1, 1, this.multipleSelection[i])
      );
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

        // 全选
    handleCheckAllChange(val) {
      console.log(val);
      var selectPostData = [];
      for (var i in this.selectPostData) {
        selectPostData.push(this.selectPostData[i].postName);
      }
      this.checkedItems = val ? selectPostData : [];
      this.multipleSelection = val ? this.selectPostData : [];
      this.isIndeterminate = false;
    },
    // 选择
    handleCheckedItemsChange(value) {
      // console.log(value)
      var arr = this.selectPostData;
      this.multipleSelection = arr.filter((item, i) => {
        for (var j in value) {
          if (value[j] == item.postName) {
            return item;
          }
        }
      });
      let checkedCount = value.length;
      this.checkAll = checkedCount === this.selectPostData.length;
      this.isIndeterminate =
        checkedCount > 0 && checkedCount < this.selectPostData.length;
    },
    // 清空选择的岗位信息
    emptyPostInfo() {
      this.multipleSelection = [];
      this.checkAll = false;
      this.checkedItems = [];
    },
    // 删除选择的岗位信息
    delPostInfo(postName, i) {
      this.checkedItems = this.checkedItems.filter((item, i) => {
        if (item != postName) {
          return true;
        } else {
          return false;
        }
      });
      this.multipleSelection.splice(i, 1);
      this.getPostInfoData();
    },
    // 岗位信息确认
    confirmPost() {
      var postCodeList = [];
      for (var i in this.multipleSelection) {
        postCodeList.push(this.multipleSelection[i].postCode);
      }
      this.selectPostDialog = false;
      var that = this;
      // console.log(that.userCode);
      // console.log(postCodeList.toString());
      // that.$http
      //   .post("/userPost/add", {
      //     postCode: postCodeList.toString(),
      //     userCode: that.userCode,
      //   })
      //   .then(function (response) {
      //     that.postTableData = [];
      //     that.getPostData(that.userCode);
      //   })
      //   .catch(function (error) {});
    },

    // 监听 pagesize改变的事件
    handleSizeChangePost(newSize) {
      // console.log(newSize)
      this.queryInfoPost.size = newSize;
     // this.getPostInfoData();
    },
    // 监听 页码值 改变事件
    handleCurrentChangePOst(newSize) {
      // console.log(newSize)
      this.queryInfoPost.page = newSize;
      // this.getPostInfoData();
    },

    // 获取组织类型数据
    getPostTypeData() {
      var that = this;
      that.$http.post("organType/queryList", {}).then(function (response) {
        console.log(response.data);
        if (response.data.code == 200) {
          that.postListData = response.data.data;
        }
      });
    },

    
    // 获取岗位信息数据
    getPostInfoData() {
      var that = this;
      that.$http.get("/post", that.queryInfoPost).then(function (response) {
        //console.log(response.data);
        if (response.data.code == 200) {
          that.selectPostData = response.data.data.data;
          that.totlePost = response.data.data.count;
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
          .el-input {
            width: 325px;
          }
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
  .search-condition {
    padding: 8px 15px;
    border-bottom: 1px solid #e4e7ed;
  }
  .selectorDialog .selectedUl {
    display: inline-block;
    margin: 0;
    height: 280px;
    max-height: 280px;
    border-left: 1px solid #f3f6f8;
    padding: 0 10px;
  }
  .selectorDialog .el-table th {
    padding: 7px 0;
  }
  .org-selected .selectedUl-box {
    height: 320px !important;
    overflow: auto;
  }
  .selectedUl ul li {
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%;
    height: 40px;
    margin-bottom: 10px;
    background: rgba(47, 145, 223, 0.1);
    padding: 14px 0 12px 27px;
  }
  .selectedUl .floatLeft {
    float: left;
    display: block;
    color: #51637f;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    color: #2f91df;
  }
  .selectedUl .floatLeft.rightOrderBox {
    display: block;
    width: 130px;
  }
  .selectedUl ul {
    margin: 0;
    padding: 0;
  }
  .selectedUl ul li .iconOrganization {
    display: inline-block;
    width: 28px;
    color: #2f91df;
    font-size: 13px;
    cursor: pointer;
  }
  .selectedUl .floatRight {
    float: right;
  }
}
</style>