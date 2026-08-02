<template>
  <div style="padding:16px">
    <!-- 头部搜索 -->
    <div ref="search_d" style="margin-bottom:12px">
      <el-row type="flex" justify="space-between" align="middle">
        <el-col>
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col span="6">
          <el-input
            placeholder="请输入搜索关键词"
            v-model="queryInfo.condition.queryKey"
            clearable
          >
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 会员表格 -->
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
        <el-table-column label="账户号" prop="accountNo" min-width="140" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="卡押金(元)" prop="cardDeposit" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="账户余额(元)" prop="memberAmount" width="100" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="账户积分" prop="memberIntegral" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="老人手机号" prop="elderPhone" width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="老人身份证" prop="elderIdCardNumber" min-width="170" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="会员卡号" prop="memberCard" min-width="140" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="卡类型" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.cardType === 1 ? 'IC卡' : scope.row.cardType === 2 ? '虚拟卡' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="会员等级" prop="memberLevel" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="会员状态" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: getMemberStateColor(scope.row.memberState)}">
              {{ getMemberStateText(scope.row.memberState) }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="开卡人" prop="createName" width="90" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="生效日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.effectiveDate ? formatDate(scope.row.effectiveDate) : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="失效日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.expirationDate ? formatDate(scope.row.expirationDate) : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="消费上限" prop="maxConsumption" width="100" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="启用状态" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: scope.row.status === 1 ? '#67c23a' : '#f56c6c'}">
              {{ scope.row.status === 1 ? '启用' : '未启用' }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="备注" prop="remark" min-width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="操作" width="130" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div style="margin-top:12px;text-align:right">
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
    <el-dialog :title="labelType === 'add' ? '新增会员' : '编辑会员'" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="130px">
        <el-row :gutter="16">
          <el-col span="12">
            <el-form-item label="机构名称">
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="老人ID">
              <el-input v-model.number="form.elderId" placeholder="请输入老人ID"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="老人姓名">
              <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="老人手机号">
              <el-input v-model="form.elderPhone" placeholder="请输入老人手机号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="老人身份证号">
              <el-input v-model="form.elderIdCardNumber" placeholder="请输入身份证号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="会员卡号">
              <el-input v-model="form.memberCard" placeholder="请输入会员卡号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="会员卡密码">
              <el-input v-model="form.cardPass" show-password placeholder="请输入密码"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="卡类型">
              <el-select v-model.number="form.cardType" placeholder="请选择卡类型" style="width:100%">
                <el-option label="IC卡" :value="1"></el-option>
                <el-option label="虚拟卡" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="会员等级">
              <el-input v-model="form.memberLevel" placeholder="请输入会员等级"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="会员状态">
              <el-select v-model.number="form.memberState" placeholder="请选择会员状态" style="width:100%">
                <el-option label="正常" :value="1"></el-option>
                <el-option label="挂失" :value="2"></el-option>
                <el-option label="注销" :value="3"></el-option>
                <el-option label="失效" :value="4"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="卡押金(元)">
              <el-input v-model.number="form.cardDeposit" placeholder="请输入押金"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账户余额(元)">
              <el-input v-model.number="form.memberAmount" placeholder="请输入余额"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账户积分">
              <el-input v-model.number="form.memberIntegral" placeholder="请输入积分"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="推荐人">
              <el-input v-model="form.refereeName" placeholder="请输入推荐人"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="生效日期">
              <el-date-picker v-model="form.effectiveDate" type="date" placeholder="选择生效日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="失效日期">
              <el-date-picker v-model="form.expirationDate" type="date" placeholder="选择失效日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="消费上限阈值">
              <el-input v-model.number="form.maxConsumption" placeholder="请输入金额"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="是否启用">
              <el-select v-model.number="form.status" placeholder="请选择状态" style="width:100%">
                <el-option label="启用" :value="1"></el-option>
                <el-option label="未启用" :value="0"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="账户号(西安大兴医院)">
              <el-input v-model="form.accountNo" placeholder="请输入账户号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="24">
            <el-form-item label="备注">
              <el-input v-model="form.remark" type="textarea" rows="2" placeholder="填写备注信息"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer">
        <el-button @click="showDialog = false">取消</el-button>
        <el-button type="primary" @click="handleSave">确定保存</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'MemberBaseInfo',
  data() {
    return {
      labelType: 'add',
      rules: {},
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
    // 计算表格高度
    calcTableHeight() {
      this.tableHeight = window.innerHeight - this.headerHeight - 280;
    },
    // 日期格式化 只返回年月日
    formatDate(dateStr) {
      if (!dateStr) return '-';
      return new Date(dateStr).toLocaleDateString().replace(/\//g, '-');
    },
    // 会员状态文字
    getMemberStateText(val) {
      const map = {1: '正常', 2: '挂失', 3: '注销', 4: '失效'};
      return map[val] || '未知';
    },
    // 会员状态颜色
    getMemberStateColor(val) {
      const map = {
        1: '#67c23a',
        2: '#e6a23c',
        3: '#f56c6c',
        4: '#909399'
      };
      return map[val] || '#909399';
    },
    // 查询列表
    getList() {
      const that = this;
      that.loading = true;
      that.$http.post("/memberBaseInfo/list", that.queryInfo).then(res => {
        that.loading = false;
        if (res.data.code === 200) {
          that.total = res.data.data.count;
          that.queryInfo.currPage = res.data.data.currPage;
          that.tableData = res.data.data.data;
        }
      });
    },
    // 保存
    handleSave() {
      const that = this;
      that.$refs.form.validate(valid => {
        if (!valid) return;
        that.$http.post("/memberBaseInfo/save", that.form).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({title: '提示', message: '保存成功'});
            that.showDialog = false;
            that.getList();
          } else {
            that.$notify.error({title: '提示', message: res.data.message});
          }
        }).catch(() => {});
      });
    },
    // 编辑
    edit(row) {
      this.labelType = 'edit';
      this.showDialog = true;
      this.form = JSON.parse(JSON.stringify(row));
    },
    // 删除
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除该会员吗？", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch(err => err);
      if (confirmResult === "confirm") {
        const that = this;
        that.$http.post("/memberBaseInfo/delete", { id }).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({title: '提示', message: '删除成功'});
            that.getList();
          } else {
            that.$notify.error({title: '提示', message: res.data.message});
          }
        });
      }
    },
    // 新增
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