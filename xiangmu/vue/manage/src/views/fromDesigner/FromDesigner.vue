<template>
    <iframe src="http://wurong19870715.gitee.io/formdesigner" width="100%" height="1200px"></iframe>
    <!-- <iframe src="www.baidu.com" width="100%" height="1200px"></iframe> -->
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

