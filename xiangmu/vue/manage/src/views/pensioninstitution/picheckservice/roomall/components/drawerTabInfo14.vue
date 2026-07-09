<template>
  <div class="tab-box">
    <!-- 表格部分 -->
    <div class="table-box">
      <!-- <div class="btn-line">
        <el-button type="primary" icon="el-icon-plus" @click="newBtn">新增</el-button>
      </div> -->
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height"
      >
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="流水号" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.serialNumber }}</template>
        </el-table-column>
        <el-table-column label="充值时间" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.chargeTime }}</template>
        </el-table-column>
        <el-table-column label="充值方式" align="center" min-width="80">
          <template slot-scope="scope">{{ scope.row.payType | payTypeFormat }}</template>
        </el-table-column>
        <el-table-column label="本次充值金额（元）" align="center" min-width="130">
          <template slot-scope="scope">{{ scope.row.chargeAmount }}</template>
        </el-table-column>
        <el-table-column label="赠送金额（元）" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.giveAmount }}</template>
        </el-table-column>
        <el-table-column label="充值后余额（元）" align="center" min-width="120">
          <template slot-scope="scope">{{ scope.row.newestAmount }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" min-width="100">
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>

        <!-- <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column> -->
      </el-table>
      <!-- 分页 -->
      <div class="block">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>
    <el-dialog :title="labelType=='add' ? '新增' : '编辑'" class="reservation-dialog" append-to-body :visible.sync="showDialog" width="75%" top="15vh">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="20">
          <!-- 第一行 左 -->
          <el-col :span="12">
            <el-form-item label="亲属姓名" prop="name">
              <el-input v-model="form.name" placeholder="请输入" clearable></el-input>
            </el-form-item>
          </el-col>
          <!-- 第一行 右 -->
          <el-col :span="12">
            <el-form-item label="性别" prop="gender">
              <el-select v-model="form.gender" placeholder="请选择" clearable style="width:100%">
                <el-option label="男" value="1"></el-option>
                <el-option label="女" value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <!-- 第二行 -->
          <el-col :span="12">
            <el-form-item label="亲属电话" prop="phone">
              <el-input v-model="form.phone" placeholder="请输入" clearable></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="与老人关系" prop="relationship">
              <el-input v-model="form.relationship" placeholder="请输入" clearable></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button size="small" type="primary" icon="el-icon-circle-plus-outline" @click="handleSave">保存</el-button>
        <el-button size="small" icon="el-icon-circle-close" @click="showDialog = false">取消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'drawerTabInfo',
  props: {
    elderForm: {
      type: Object,
      default: () => {
        return {}
      }
    },
  },
  filters: {
    // 充值方式 1现金、2微信、3支付宝、4银联卡、5系统退款
    payTypeFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '现金';
        case 2:
        case '2':
          return '微信';
        case 3:
        case '3':
          return '支付宝';
        case 4:
        case '4':
          return '银联卡';
        case 5:
        case '5':
          return '系统退款';
      
        default:
          return val || '-';
      }
    },
  },
  watch: {
    // showDialog: {
    //   handler(val) {
    //     if (this.labelType == 'add' && val) {
    //       this.curShowDialog = val;
    //       this.initDefaultData();
    //       console.log(this.detailform,999,val);
    //     }
    //   },
    //   deep: true
    // }
  },
  computed: {
    // visible: {
    //   get() {
    //     return this.curShowDialog;
    //   },
    //   set(val) {
    //     this.curShowDialog = val;
    //     this.$parent.showDialog = val
    //   }
    // }
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
    // this.initDefaultData()
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      // this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },
  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 336;
    },
    // 初始化默认数据（和截图中的内容一致）
    initDefaultData() {
      this.getList()
    },
    handleChange(e){},
    //获取数据
    getList() {
      var that = this;
      that.loading = true
      this.queryInfo.condition.elderId = this.elderForm.elderId
      that.$http.post("/memberChargeLog/list", that.queryInfo).then(function (response) {
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
        this.form.elderId = this.elderForm.elderId
        that.$http.post("/memberChargeLog/save", that.form).then( (response)=> {
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
        that.$http.post("/memberChargeLog/delete", { "id": id }).then(function (response) {
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