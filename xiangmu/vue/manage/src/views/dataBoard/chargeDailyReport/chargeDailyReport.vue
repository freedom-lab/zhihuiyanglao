<template>
  <div style="padding:16px">
    <div ref="search_d">
      <span style="font-size:18px;font-weight:bold">收费日报表</span>
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
            <el-row :gutter="12">
              
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