<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="18">
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col :span="6">
          <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 表格部分 -->
    <div>
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>
        <el-table-column label="机构名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.institutionName }}</template>
        </el-table-column>
        <el-table-column label="费用名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.feeName }}</template>
        </el-table-column>
        <el-table-column label="费用类型" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.feeType === 1 ? '押金' :
              scope.row.feeType === 2 ? '床位费' :
                scope.row.feeType === 3 ? '护理费' :
                  scope.row.feeType === 4 ? '伙食费' :
                    scope.row.feeType === 5 ? '其他月费用' : ''
          }}</template>
        </el-table-column>
        <el-table-column label="收费方式" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.costType === '1' ? '一次性费用' : scope.row.costType === '1' ? '每月费用' : ''
          }}</template>
        </el-table-column>
        <el-table-column label="收费金额" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.amount }}</template>
        </el-table-column>
        <el-table-column label="费用描述" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.memo }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>
        <el-table-column label="创建人" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.createUser }}</template>
        </el-table-column>
        <el-table-column label="操作" width="165" align="center">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="color: red;">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>
      <!-- 分页 -->
      <div class="block">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <el-dialog :title="(labelType == 'add' ? '新增' : '编辑')" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="10">
          <el-col :span="12">
            <el-form-item label="机构名称：" required>
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="费用名称：" required>
              <el-input v-model="form.feeName" placeholder="请输入费用名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="费用类型" prop="siteName">
              <el-select v-model="form.feeType" placeholder="选择费用类型" style="width:100%">
                <el-option label="押金" :value="1"></el-option>
                <el-option label="床位费" :value="2"></el-option>
                <el-option label="护理费" :value="3"></el-option>
                <el-option label="伙食费" :value="4"></el-option>
                <el-option label="其他月费用" :value="5"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="收费方式：" prop="siteName" req>
              <el-select v-model="form.costType" placeholder="选择收费方式" style="width:100%">
                <el-option label="一次性费用" value="1"></el-option>
                <el-option label="每月费用" value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="收费金额：" prop="siteName">
              <el-input v-model="form.amount" placeholder="请输入收费金额"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="费用描述：" prop="siteName">
              <el-input v-model="form.memo" placeholder="请输入费用描述"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="备注：" prop="siteName">
              <el-input v-model="form.remark" placeholder="请输入备注"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>
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
    this.getList()
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

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/careFeeSet/list", that.queryInfo).then(function (response) {
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
      if (!this.form.institutionName) {
        this.$message.warning("请填写机构名称")
        return
      }
      if (!this.form.feeName) {
        this.$message.warning("请填写费用名称")
        return
      }

      var that = this;
      that.$http.post("/careFeeSet/save", that.form).then(function (response) {
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
        that.$http.post("/careFeeSet/delete", { "id": id }).then(function (response) {
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

  },
};
</script>

<style scoped></style>
