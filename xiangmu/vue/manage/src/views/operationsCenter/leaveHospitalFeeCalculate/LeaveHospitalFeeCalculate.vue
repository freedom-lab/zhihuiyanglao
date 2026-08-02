<template>
  <div style="padding:16px">
    <!-- 顶部搜索区 -->
    <div ref="search_d" style="margin-bottom:14px">
      <el-row type="flex" justify="space-between" align="middle">
        <el-col>
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col span="6">
          <el-input
            placeholder="姓名/身份证/编号搜索"
            v-model="queryInfo.condition.queryKey"
            clearable
          >
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 老人列表表格 -->
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
        <el-table-column label="性别" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="年龄" prop="age" width="70" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="出生日期" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ formatDate(scope.row.birthday) }}</template>
        </el-table-column>
        <el-table-column label="身份证号" prop="idCard" min-width="170" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="联系电话" prop="linkTel" width="130" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="长者码" prop="elderCode" width="120" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="护理等级" prop="elderNursingLevel" width="100" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="服务状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{color: scope.row.elderState === 1 ? '#67c23a' : '#f56c6c'}">
              {{ scope.row.elderState === 1 ? '正常服务' : '停止服务' }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="养老方式" width="95" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.pensionMode === 1 ? '居家' : scope.row.pensionMode === 2 ? '机构' : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="户籍地址" prop="pesidenceAddress" min-width="160" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="现居住地址" prop="homeAddress" min-width="160" align="center" show-overflow-tooltip></el-table-column>
        <el-table-column label="备注" prop="remark" min-width="130" align="center" show-overflow-tooltip></el-table-column>
        <!-- 操作列固定右侧 -->
        <el-table-column label="操作" width="130" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">核算账单</el-button>
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
    <el-dialog :title="labelType === 'add' ? '新增老人信息' : '编辑老人信息'" :visible.sync="showDialog" width="900px">
      <el-form ref="form" :model="form" :rules="rules" label-width="130px">
        <el-row :gutter="16">
          <!-- 1. 基础核心信息 -->
          <el-col span="12">
            <el-form-item label="机构名称">
              <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="老人姓名" prop="elderName">
              <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="性别">
              <el-select v-model.number="form.sex" placeholder="请选择性别" style="width:100%">
                <el-option label="男" :value="1"></el-option>
                <el-option label="女" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="年龄">
              <el-input v-model.number="form.age" placeholder="请输入年龄"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="出生日期">
              <el-date-picker v-model="form.birthday" type="date" placeholder="选择出生日期" style="width:100%" clearable></el-date-picker>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="身份证号" prop="idCard">
              <el-input v-model="form.idCard" placeholder="请输入身份证号码"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="联系电话">
              <el-input v-model="form.linkTel" placeholder="请输入手机号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="长者码">
              <el-input v-model="form.elderCode" placeholder="自动生成"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="护理等级">
              <el-input v-model="form.elderNursingLevel" placeholder="请输入护理等级"></el-input>
            </el-form-item>
          </el-col>

          <!-- 2. 服务与养老信息 -->
          <el-col span="12">
            <el-form-item label="服务状态">
              <el-select v-model.number="form.elderState" placeholder="选择服务状态" style="width:100%">
                <el-option label="正常服务" :value="1"></el-option>
                <el-option label="停止服务" :value="0"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="养老方式">
              <el-select v-model.number="form.pensionMode" placeholder="选择养老方式" style="width:100%">
                <el-option label="居家" :value="1"></el-option>
                <el-option label="机构" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="社保卡号">
              <el-input v-model="form.socialCardNo" placeholder="请输入社保卡号"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="12">
            <el-form-item label="服务类型">
              <el-select v-model.number="form.censusType" placeholder="选择服务类型" style="width:100%">
                <el-option label="社会老人" :value="1"></el-option>
                <el-option label="政府购买" :value="2"></el-option>
              </el-select>
            </el-form-item>
          </el-col>

          <!-- 3. 地址信息 -->
          <el-col span="24">
            <el-form-item label="户籍地址">
              <el-input v-model="form.pesidenceAddress" placeholder="填写完整户籍地址"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="24">
            <el-form-item label="现居住地址">
              <el-input v-model="form.homeAddress" placeholder="填写现居住详细地址"></el-input>
            </el-form-item>
          </el-col>

          <!-- 5. 备注 -->
          <el-col span="24">
            <el-form-item label="备注">
              <el-input v-model="form.remark" type="textarea" rows="3" placeholder="补充备注信息"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer">
        <el-button @click="showDialog = false">取消</el-button>
        <el-button type="primary" @click="handleSave">保存</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: 'ElderBaseInfo',
  data() {
    return {
      labelType: 'add',
      rules: {
        elderName: [{ required: true, message: '请输入老人姓名', trigger: 'blur' }],
        idCard: [{ required: true, message: '请输入身份证号', trigger: 'blur' }]
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
    // 日期格式化 只保留年月日
    formatDate(dateStr) {
      if (!dateStr) return '-';
      const d = new Date(dateStr);
      const year = d.getFullYear();
      const month = String(d.getMonth() + 1).padStart(2, '0');
      const day = String(d.getDate()).padStart(2, '0');
      return `${year}-${month}-${day}`;
    },
    // 审核状态文字
    getAuditText(val) {
      const map = {0: '未审批', 1: '审批通过', 2: '审批不通过'};
      return map[val] || '未知';
    },
    // 审核状态颜色
    getAuditColor(val) {
      const map = {0: '#909399', 1: '#67c23a', 2: '#f56c6c'};
      return map[val] || '#909399';
    },
    // 查询列表
    getList() {
      const that = this;
      that.loading = true;
      that.$http.post("/elderBaseInfo/list", that.queryInfo).then(res => {
        that.loading = false;
        if (res.data.code === 200) {
          that.total = res.data.data.count;
          that.queryInfo.currPage = res.data.data.currPage;
          that.tableData = res.data.data.data;
        }
      });
    },
    // 保存表单
    handleSave() {
      const that = this;
      that.$refs.form.validate(valid => {
        if (!valid) return;
        that.$http.post("/elderBaseInfo/save", that.form).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({ title: '提示', message: '保存成功' });
            that.showDialog = false;
            that.getList();
          } else {
            that.$notify.error({ title: '提示', message: res.data.message });
          }
        }).catch(() => {});
      });
    },
    // 编辑回显
    edit(row) {
      this.labelType = 'edit';
      this.showDialog = true;
      this.form = JSON.parse(JSON.stringify(row));
    },
    // 删除
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除该老人信息吗？", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch(err => err);
      if (confirmResult === "confirm") {
        const that = this;
        that.$http.post("/elderBaseInfo/delete", { id }).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({ title: '提示', message: '删除成功' });
            that.getList();
          } else {
            that.$notify.error({ title: '提示', message: res.data.message });
          }
        });
      }
    },
    // 新增清空表单
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