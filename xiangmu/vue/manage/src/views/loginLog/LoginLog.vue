<template>
    <div class="managingPeople hp100 bbox " v-loading="loading">

        <!-- 卡片视图 -->
        <el-card>
            <!-- 搜索-->
            <el-row :gutter="20" type="flex" justify="space-between">
                
                <el-col>
                    <div class="flex align-center justify-end header-search-box">
                        <el-input
                                placeholder="查询条件"
                                clearable
                                v-model="searchInput"
                                class="header-search-input ml10"
                        >
                            <el-button
                                    slot="append"
                                    icon="el-icon-search"
                                    class="textblue searchBtn"
                                    @click="search()"
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
                                    <el-table-column label="访问编号" align="center"  prop="id" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.id }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="登录名" align="center"  prop="登录名" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.loginName }}</span>
                        </template>
                    </el-table-column>
                 
                  
                
                    <el-table-column label="ip地址" align="center"  prop="ip地址" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.ip }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="归属地" align="center"  prop="归属地" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.city }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="浏览器" align="center"  prop="浏览器" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.browser }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作系统" align="center"  prop="操作系统" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.os }}</span>
                        </template>
                    </el-table-column>
                      <el-table-column label="登陆日期" align="center" prop="createDt" :formatter="dateFormat">
                    </el-table-column>
                    <el-table-column label="操作信息" align="center"  prop="" >
                        <template slot-scope="scope">
                            <span>{{ scope.row.remark }}</span>
                        </template>
                    </el-table-column>
                
            </el-table>
            <div class="footerBox">
                <!-- 分页区域 -->
                <el-pagination
                        @size-change="handleSizeChange"
                        @current-change="handleCurrentChange"
                        :current-page.sync="queryInfo.currPage"
                        :page-sizes="[10, 20, 30, 50]"
                        :page-size="queryInfo.pageSize"
                        layout="total, sizes, prev, pager, next, jumper"
                        :total="total"
                ></el-pagination>
            </div>
        </el-card>
    </div>
</template>

<script>
import moment from 'moment'
export default {
  data() {
    return {
      height: window.innerHeight - 256, //表格高度
      value: "",
      searchInput: "",
      tableData: [],
      loading: true,
      // 获取用户列表查询参数对象
      queryInfo: {
        // 当前页数
        currPage: 1,
        // 每页显示多少数据
        pageSize: 20,
        //查询条件
        condition:{
          id:""
        }
      },
      userlist: [],
      total: 0,
      // 添加用户对话框
      addDialogVisible: false,
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
    };
  },
  created() {
    this.queryInfo.currPage=this.$route.query.currPage;
     this.queryInfo.pageSize=this.$route.query.pageSize;
    this.getListData();
    window.addEventListener('resize', this.getHeight)
  },
  mounted() {
    this.loading = false;

  },
  destroyed () {
    window.removeEventListener('resize', this.getHeight)
  },
  methods: {
    //条件查询
    search(){
    this.queryInfo.condition.id = this.searchInput;
    this.getListData();
    },
    // 监听 pagesize改变的事件
    handleSizeChange(newSize) {
      this.queryInfo.pageSize = newSize;
      this.getListData();
    },
    // 监听 页码值 改变事件
    handleCurrentChange(newSize) {
      this.queryInfo.currPage = newSize;
      this.getListData();
    },

    // 监听排序
    sortChange() {

    },
    //跳转到详情
    gotoDetail(id) {
      var  that=this;
      this.$router.push({
        path: "/loginLog/details",
        query: { id: id,currPage:that.queryInfo.currPage,pageSize:that.queryInfo.pageSize},
      });
    },

    // 删除用户
    async del(id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
           var that = this;
        that.$http.post("/loginLog/delete" ,{"id":id}).then(function (response) {
          that.$notify.success({
            title: "提示",
            message: "删除成功",
            showClose: true,
          });
          that.getListData();
        });
      }
    },
     getListData() {
        // 获取列表
      var that = this;
      that.$http.post("/loginLog/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.total = response.data.data.count;
          that.queryInfo.currPage=response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - 256;
    },
     dateFormat(row,column){
        //日期格式化
        var date = row[column.property];
        if(date == undefined){return ''};
        return moment(date).format("YYYY-MM-DD HH:mm:ss")
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

