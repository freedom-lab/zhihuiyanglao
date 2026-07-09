<template>
  <div style="padding:16px">
    <!-- 顶部搜索区域 -->
    <div ref="search_d" style="margin-bottom:14px">
      <el-row type="flex" justify="space-between" align="middle">
        <el-col>
          <el-button type="primary" @click="newBtn">新建账单</el-button>
        </el-col>
        <el-col span="6">
          <el-input
            placeholder="老人姓名/账单编号搜索"
            v-model="queryInfo.condition.queryKey"
            clearable
          >
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 账单列表表格 -->
    <div>
      <el-table
        border
        ref="table"
        v-loading="loading"
        :data="tableData"
        tooltip-effect="dark"
        style="width:100%"
        :height="tableHeight"
      >
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>
        <el-table-column label="老人姓名" prop="elderName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="机构名称" prop="institutionName" min-width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="入住日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ formatDate(scope.row.checkDate) }}</template>
        </el-table-column>
        <el-table-column label="应缴金额(元)" prop="receivableAmount" width="110" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="实缴金额(元)" prop="actualAmount" width="110" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="欠费金额(元)" width="110" align="center" show-overflow-tooltip>
        <template slot-scope="scope">
            {{ Number(scope.row.receivableAmount || 0) - Number(scope.row.actualAmount || 0) }}
        </template>
        </el-table-column>
        <el-table-column label="身份证号" prop="idCard" min-width="170" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="账单编号" prop="billCode" width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="账单类型" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.billType === 0 ? '入住缴费' : '其他缴费' }}
          </template>
        </el-table-column>
        <el-table-column label="账单名称" prop="billName" min-width="120" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="是否核算" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.isCalculate === 1 ? '未核算' : '已核算' }}
          </template>
        </el-table-column>
        <el-table-column label="支付状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: scope.row.payState === 1 ? '#f56c6c' : '#67c23a'}">
              {{ scope.row.payState === 1 ? '未支付' : '已支付' }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="支付方式" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ getPayMethodText(scope.row.payMethod) }}
          </template>
        </el-table-column>
        <el-table-column label="交款人" prop="paymentName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="交款时间" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ formatDate(scope.row.paymentTime) }}</template>
        </el-table-column>
        <el-table-column label="收款人" prop="payeeName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="账单状态" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: scope.row.billState === 1 ? '#67c23a' : '#909399'}">
              {{ scope.row.billState === 1 ? '有效单据' : '作废单据' }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="备注" prop="remark" min-width="140" align="center" show-overflow-tooltip></el-table-column>
        <!-- 操作列固定右侧 -->
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div style="margin-top:14px;text-align:right">
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage"
          :page-sizes="[50,100,200]"
          :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
        ></el-pagination>
      </div>
    </div>

    <!-- 新增/编辑弹窗 -->
    <el-dialog :title="labelType === 'add' ? '新增缴费账单' : '编辑缴费账单'" :visible.sync="showDialog" width="900px">
      <el-form ref="form" :model="form" :rules="rules" label-width="130px">
        <el-row :gutter="16">
          <el-col span="12">
            <el-form-item label="机构名称">
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="入住日期">
              <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>

          <!-- 2. 老人核心信息（前置） -->
          <el-col span="12">
            <el-form-item label="老人姓名" prop="elderName">
              <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="身份证号" prop="idCard">
              <el-input v-model="form.idCard" placeholder="请输入身份证号码"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="性别">
              <el-select v-model.number="form.sex" placeholder="选择性别" style="width:100%">
                <el-option label="男" :value="1"></el-option>
                <el-option label="女" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>

          <!-- 3. 账单基础信息 -->
          <el-col span="12">
            <el-form-item label="账单编号">
              <el-input v-model="form.billCode" placeholder="自动生成可留空"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账单类型">
              <el-select v-model.number="form.billType" placeholder="选择账单类型" style="width:100%">
                <el-option label="入住缴费" :value="0"></el-option>
                <el-option label="其他缴费" :value="1"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账单名称" prop="billName">
              <el-input v-model="form.billName" placeholder="填写账单名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="应缴金额(元)" prop="receivableAmount">
              <el-input v-model.number="form.receivableAmount" placeholder="输入应缴金额"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="是否核算">
              <el-select v-model.number="form.isCalculate" placeholder="选择核算状态" style="width:100%">
                <el-option label="未核算" :value="1"></el-option>
                <el-option label="已核算" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="支付状态">
              <el-select v-model.number="form.payState" placeholder="选择支付状态" style="width:100%">
                <el-option label="未支付" :value="1"></el-option>
                <el-option label="已支付" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="支付方式">
              <el-select v-model.number="form.payMethod" placeholder="选择支付方式" style="width:100%">
                <el-option label="现金" :value="1"></el-option>
                <el-option label="微信" :value="2"></el-option>
                <el-option label="支付宝" :value="3"></el-option>
                <el-option label="银行卡" :value="4"></el-option>
                <el-option label="余额" :value="5"></el-option>
                <el-option label="代金券" :value="6"></el-option>
                <el-option label="转账" :value="7"></el-option>
                <el-option label="其他" :value="8"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="实缴金额(元)">
              <el-input v-model.number="form.actualAmount" placeholder="实际收款金额"></el-input>
            </el-form-item>
          </el-col>

          <!-- 4. 缴款人信息 -->
          <el-col span="12">
            <el-form-item label="交款人">
              <el-input v-model="form.paymentName" placeholder="填写交款人姓名"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="交款时间">
              <el-date-picker v-model="form.paymentTime" type="date" placeholder="选择交款日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="收款人">
              <el-input v-model="form.payeeName" placeholder="填写收款人"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账单状态">
              <el-select v-model.number="form.billState" placeholder="选择单据状态" style="width:100%">
                <el-option label="有效单据" :value="1"></el-option>
                <el-option label="作废单据" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>

          <!-- 5. 备注 -->
          <el-col span="24">
            <el-form-item label="备注">
              <el-input v-model="form.remark" type="textarea" rows="3" placeholder="补充账单备注"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer">
        <el-button @click="showDialog = false">取消</el-button>
        <el-button type="primary" @click="handleSave">保存账单</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'InsExpensesBillRecord',
  data() {
    return {
      labelType: 'add',
      rules: {
        elderName: [{ required: true, message: '请填写老人姓名', trigger: 'blur' }],
        idCard: [{ required: true, message: '请填写身份证号', trigger: 'blur' }],
        billName: [{ required: true, message: '请填写账单名称', trigger: 'blur' }],
        receivableAmount: [{ required: true, message: '请填写应缴金额', trigger: 'blur' }]
      },
      total: 0,
      queryInfo: {
        pageSize: 100,
        currPage: 1,
        condition: {
          queryKey: ''
        }
      },
      form: {},
      showDialog: false,
      tableData: [],
      tableHeight: 300,
      headerHeight: 0,
      loading: false
    };
  },
  created() {
    this.getList();
  },
  mounted() {
    this.$nextTick(() => {
      this.headerHeight = this.$refs.search_d.offsetHeight;
      this.calcTableHeight();
      window.addEventListener('resize', this.calcTableHeight);
    });
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.calcTableHeight);
  },
  methods: {
    // 自适应表格高度
    calcTableHeight() {
      this.tableHeight = window.innerHeight - this.headerHeight - 270;
    },
    // 日期格式化 仅保留年月日
    formatDate(dateStr) {
      if (!dateStr) return '-';
      const d = new Date(dateStr);
      const year = d.getFullYear();
      const month = String(d.getMonth() + 1).padStart(2, '0');
      const day = String(d.getDate()).padStart(2, '0');
      return `${year}-${month}-${day}`;
    },
    // 支付方式文字转换
    getPayMethodText(val) {
      const map = {1:'现金',2:'微信',3:'支付宝',4:'银联卡',5:'账户余额',6:'代金券',7:'转账',8:'其他'};
      return map[val] || '未知';
    },
    // 查询账单列表
    getList() {
      const that = this;
      that.loading = true;
      that.$http.post("/insExpensesBillRecord/list", that.queryInfo).then(res => {
        that.loading = false;
        if (res.data.code === 200) {
          that.total = res.data.data.count;
          that.queryInfo.currPage = res.data.data.currPage;
          that.tableData = res.data.data.data;
        }
      });
    },
    // 保存账单
    handleSave() {
      const that = this;
      that.$refs.form.validate(valid => {
        if (!valid) return;
        that.$http.post("/insExpensesBillRecord/save", that.form).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({ title: '提示', message: '账单保存成功' });
            that.showDialog = false;
            that.getList();
          } else {
            that.$notify.error({ title: '提示', message: res.data.message });
          }
        }).catch(() => {});
      });
    },
    // 编辑回显数据
    edit(row) {
      this.labelType = 'edit';
      this.showDialog = true;
      this.form = JSON.parse(JSON.stringify(row));
    },
    // 删除账单
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除该缴费账单记录？", "操作提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch(err => err);
      if (confirmResult === "confirm") {
        const that = this;
        that.$http.post("/insExpensesBillRecord/delete", { id }).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({ title: '提示', message: '删除成功' });
            that.getList();
          } else {
            that.$notify.error({ title: '提示', message: res.data.message });
          }
        });
      }
    },
    // 新建账单清空表单
    newBtn() {
      this.labelType = 'add';
      this.showDialog = true;
      this.form = {};
    },
    // 每页条数切换
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.getList();
    },
    // 页码切换
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList();
    }
  }
};
</script>

<style scoped></style>