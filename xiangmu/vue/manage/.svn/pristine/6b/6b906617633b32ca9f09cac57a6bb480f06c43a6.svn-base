<template>
  <div class="tab-box">
    <el-collapse v-model="activeCollapses" @change="handleChange">
      <el-collapse-item name="1">
        <template slot="title">
          <div class="table-title">
            床位变更记录
          </div>
        </template>
        <itemTable1 ref="itemTable1" :elderForm="elderForm"/>
      </el-collapse-item>
      <el-collapse-item name="2">
        <template slot="title">
          <div class="table-title">
            护理等级变更
          </div>
        </template>
        <itemTable2 ref="itemTable2" :elderForm="elderForm"/>
      </el-collapse-item>
      <el-collapse-item name="3">
        <template slot="title">
          <div class="table-title">
            餐费变更记录
          </div>
        </template>
        <itemTable3 ref="itemTable3" :elderForm="elderForm"/>
      </el-collapse-item>
    </el-collapse>
  </div>
</template>

<script>
import itemTable1 from './children/drawerTabInfo12_table1.vue';
import itemTable2 from './children/drawerTabInfo12_table2.vue';
import itemTable3 from './children/drawerTabInfo12_table3.vue';
export default {
  props: {
    elderForm: {
      type: Object,
      default: () => {
        return {}
      }
    },
  },
  components: {
      itemTable1,
      itemTable2,
      itemTable3,
  },
  filters: {
  },
  watch: {
  },
  computed: {
  },
  data() {
    return {
      btnloading: false,
      activeCollapses: ['1','2','3','4','5','6','7','8',],
      tabForm: {},
      labelType: 'add',
      rules: {
        name: [
          { required: true, message: '请输入姓名', trigger: 'blur' },
          { min: 2, max: 20, message: '姓名长度2-20个字符', trigger: 'blur' }
        ],
        gender: [
          { required: true, message: '请选择性别', trigger: 'change' }
        ],
        phone: [
          { required: true, message: '请输入联系电话', trigger: 'blur' },
          { pattern: /^1[3-9]\d{9}$/, message: '手机号格式错误', trigger: 'blur' }
        ],
        relationship: [
          { required: true, message: '请输入', trigger: 'blur' }
        ],
      },
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
      loading: false,
    };
  },
  mounted() {
    this.tabForm = this.elderForm || {}
    // 切换到当前组件就执行获取信息逻辑
    this.initDefaultData()
  },
  methods: {
    // 初始化默认数据（和截图中的内容一致）
    initDefaultData() {
      this.$refs.itemTable1.getList();
      this.$refs.itemTable2.getList();
      this.$refs.itemTable3.getList();
    },
    handleChange(e){},
    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/healthBaseInfo/list", that.queryInfo).then(function (response) {
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
      that.$refs.form.validate((valid) => {
        if (!valid) return false; // 校验不通过阻止提交

        that.$http.post("/healthBaseInfo/save", that.form).then( (response)=> {
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
          console.log('保存失败', error)
        })
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
        that.$http.post("/healthBaseInfo/delete", { "id": id }).then(function (response) {
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
  }
};
</script>

<style lang="scss" scoped>
.imgAudit{
    width: 115px;
    height: 117px;
    position: relative;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    img{
      width: 100%;
      height: 100%;
    }
}
</style>