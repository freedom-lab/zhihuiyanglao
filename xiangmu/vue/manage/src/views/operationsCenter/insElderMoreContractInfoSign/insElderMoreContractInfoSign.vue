<template>
  <div style="padding:16px">
    <!-- 头部搜索 -->
    <div ref="search_d" style="margin-bottom:14px;display: flex;justify-content: flex-end;gap: 10px;">
      <el-input
            placeholder="老人姓名"
            v-model="elderQuery.condition.queryKey"
            clearable
            style="width:240px"
            @input="getElderList"
          >
            <el-button slot="append" icon="el-icon-search" @click="getElderList"></el-button>
          </el-input>
          <el-button type="primary" @click="newBtn">新建</el-button>
          <el-button v-if="selectOlderInfo.id" @click="clearSelect">清空选中</el-button>
    </div>

    <!-- 左右分栏 3:5 布局 24栅格 9:15 -->
    <el-row :gutter="16">
      <!-- 左侧 3份：老人汇总列表 span=9 -->
      <el-col :span="9">
        <div class="table-box">
          <el-table
            border
            ref="tableElder"
            v-loading="elderLoading"
            :data="elderTableData"
            tooltip-effect="dark"
            style="width: 100%"
            :header-cell-style="{
              backgroundColor: '#fafafa',
              color: '#333',
              fontWeight: 'bold',
              fontSize: '14px',
            }"
            :height="tableHeight"
            highlight-current-row
            @current-change="handleCurrentOutListChange"
          >
            <el-table-column label="#" type="index" width="50" align="center"></el-table-column>
            <el-table-column label="老人姓名" prop="elderName" align="center" min-width="80" show-overflow-tooltip></el-table-column>
            <el-table-column label="性别" align="center" min-width="60" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
            </el-table-column>
            <el-table-column label="年龄" prop="age" align="center" min-width="60" show-overflow-tooltip></el-table-column>
            <el-table-column label="合同签订次数" align="center" min-width="100" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.contractCount || 0 }}</template>
            </el-table-column>
          </el-table>
          <div class="block" style="margin-top: 10px;">
            <el-pagination
              @size-change="elderSizeChange"
              @current-change="elderCurrentChange"
              :current-page="elderQuery.currPage"
              :page-sizes="[100, 200, 300, 400]"
              :page-size="elderQuery.pageSize"
              layout="total, sizes, prev, pager, next, jumper"
              :total="elderTotal"
            ></el-pagination>
          </div>
        </div>
      </el-col>

      <!-- 右侧 5份：合同明细列表 span=15 -->
      <el-col :span="15">
        <div class="table-box">
          <el-table
            border
            ref="tableContract"
            v-loading="contractLoading"
            :data="contractTableData"
            tooltip-effect="dark"
            style="width: 100%"
            :header-cell-style="{
              backgroundColor: '#fafafa',
              color: '#333',
              fontWeight: 'bold',
              fontSize: '14px',
            }"
            :height="tableHeight"
          >
            <el-table-column label="#" type="index" width="50" align="center"></el-table-column>
            <el-table-column label="合同编号" prop="contractCode" width="130" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.contractCode || '-' }}</template>
            </el-table-column>
            <el-table-column label="合同名称" prop="contractName" width="160" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.contractName || '-' }}</template>
            </el-table-column>
            <el-table-column label="合同模板" prop="templateName" width="140" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.templateName || '-' }}</template>
            </el-table-column>
            <el-table-column label="签订时间" width="110" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.signTime ? scope.row.signTime.slice(0, 10) : '-' }}</template>
            </el-table-column>
            <el-table-column label="合同起始" width="110" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.startDate ? scope.row.startDate.slice(0, 10) : '-' }}</template>
            </el-table-column>
            <el-table-column label="合同到期" width="110" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.endDate ? scope.row.endDate.slice(0, 10) : '-' }}</template>
            </el-table-column>
            <el-table-column label="机构名称" prop="institutionName" width="120" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.institutionName || '-' }}</template>
            </el-table-column>
            <el-table-column label="入住日期" width="110" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.checkDate ? scope.row.checkDate.slice(0, 10) : '-' }}</template>
            </el-table-column>
            <el-table-column label="老人姓名" prop="elderName" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
            </el-table-column>
            <el-table-column label="身份证号" prop="idCard" width="180" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
            </el-table-column>
            <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}</template>
            </el-table-column>
            <el-table-column label="入住押金" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.depositAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="费用类型" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.costType === 1 ? '年付' : '-' }}</template>
            </el-table-column>
            <el-table-column label="床位类型" prop="bedType" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.bedType || '-' }}</template>
            </el-table-column>
            <el-table-column label="床位费" width="80" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.bedAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="床位押金" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.bedDepositAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="护理等级" prop="nursingLevelName" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.nursingLevelName || '-' }}</template>
            </el-table-column>
            <el-table-column label="护理费" width="80" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.nursingAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="护理押金" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.nursingDepositAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="餐饮费" width="80" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.foodAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="餐饮押金" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.foodDepositAmount || 0 }}</template>
            </el-table-column>
            <el-table-column label="政策补贴" width="90" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.isSubsidy === 1 ? '否' : '是' }}</template>
            </el-table-column>
            <el-table-column label="合同状态" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">
                <span :class="scope.row.contractState === 2 ? 'text-green' : scope.row.contractState === 3 ? 'text-gray' : 'text-orange'">
                  {{ scope.row.contractState === 1 ? '待签订' : scope.row.contractState === 2 ? '已签订' : scope.row.contractState === 3 ? '已作废' : '-' }}
                </span>
              </template>
            </el-table-column>
            <el-table-column label="提交状态" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.submitState === 1 ? '未提交' : '已提交' }}</template>
            </el-table-column>
            <el-table-column label="电子签名" width="110" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.signingState === 0 ? '无需签名' : '需要签名' }}</template>
            </el-table-column>
            <el-table-column label="审核状态" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">
                <span :class="scope.row.auditState === 2 ? 'text-green' : scope.row.auditState === 3 ? 'text-red' : ''">
                  {{ scope.row.auditState === 1 ? '未审核' : scope.row.auditState === 2 ? '审核通过' : scope.row.auditState === 3 ? '审核驳回' : '-' }}
                </span>
              </template>
            </el-table-column>
            <el-table-column label="发送状态" width="100" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.sendState === 0 ? '未发送' : '已发送' }}</template>
            </el-table-column>
            <el-table-column label="备注" prop="remark" width="120" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
            </el-table-column>
            <!-- 操作固定右侧 -->
            <el-table-column label="操作" width="110" align="center" fixed="right">
              <template slot-scope="scope">
                <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
                <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
                <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
                </el-popconfirm>
            </template>
            </el-table-column>
          </el-table>
          <div class="block" style="margin-top: 10px;">
            <el-pagination
              @size-change="contractSizeChange"
              @current-change="contractCurrentChange"
              :current-page="contractQuery.currPage"
              :page-sizes="[100, 200, 300, 400]"
              :page-size="contractQuery.pageSize"
              layout="total, sizes, prev, pager, next, jumper"
              :total="contractTotal"
            ></el-pagination>
          </div>
        </div>
      </el-col>
    </el-row>

    <!-- 新增/编辑抽屉 -->
    <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>{{ labelType == 'add' ? '新增合同' : '编辑合同' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>
        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <el-row :gutter="12">
              <!-- 老人&机构基础信息 -->
              <el-col :span="12">
                <el-form-item label="机构名称" prop="institutionName">
                  <el-input v-model="form.institutionName" placeholder="请输入机构名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住日期" prop="checkDate">
                  <el-date-picker v-model="form.checkDate" type="date" placeholder="选择入住日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入身份证号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别" prop="sex">
                  <el-select v-model.number="form.sex" placeholder="请选择性别" style="width:100%" clearable>
                    <el-option label="男" :value="1"></el-option>
                    <el-option label="女" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>

              <!-- 合同基础 -->
              <el-col :span="12">
                <el-form-item label="合同编号" prop="contractCode">
                  <el-input v-model="form.contractCode" placeholder="请输入合同编号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="合同名称" prop="contractName">
                  <el-input v-model="form.contractName" placeholder="请输入合同名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="合同模板名称" prop="templateName">
                  <el-input v-model="form.templateName" placeholder="请输入模板名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="签订时间" prop="signTime">
                  <el-date-picker v-model="form.signTime" type="date" placeholder="选择签订日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="合同起始日期" prop="startDate">
                  <el-date-picker v-model="form.startDate" type="date" placeholder="选择起始日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="合同到期日期" prop="endDate">
                  <el-date-picker v-model="form.endDate" type="date" placeholder="选择到期日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>

              <!-- 费用 -->
              <el-col :span="12">
                <el-form-item label="入住押金(元)" prop="depositAmount">
                  <el-input v-model.number="form.depositAmount" placeholder="请输入金额"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="费用类型" prop="costType">
                  <el-select v-model.number="form.costType" placeholder="请选择费用类型" style="width:100%" clearable>
                    <el-option label="年付" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位类型" prop="bedType">
                  <el-input v-model="form.bedType" placeholder="请输入床位类型"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位费(元)" prop="bedAmount">
                  <el-input v-model.number="form.bedAmount" placeholder="请输入床位费"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位押金(元)" prop="bedDepositAmount">
                  <el-input v-model.number="form.bedDepositAmount" placeholder="请输入押金"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="护理等级" prop="nursingLevelName">
                  <el-input v-model="form.nursingLevelName" placeholder="请输入护理等级"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="护理费(元)" prop="nursingAmount">
                  <el-input v-model.number="form.nursingAmount" placeholder="请输入护理费"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="护理押金(元)" prop="nursingDepositAmount">
                  <el-input v-model.number="form.nursingDepositAmount" placeholder="请输入押金"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐饮费(元)" prop="foodAmount">
                  <el-input v-model.number="form.foodAmount" placeholder="请输入餐饮费"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐饮押金(元)" prop="foodDepositAmount">
                  <el-input v-model.number="form.foodDepositAmount" placeholder="请输入押金"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否政策补贴" prop="isSubsidy">
                  <el-select v-model.number="form.isSubsidy" placeholder="请选择" style="width:100%" clearable>
                    <el-option label="否" :value="1"></el-option>
                    <el-option label="是" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>

              <!-- 甲乙丙签约方 -->
              <el-col :span="12">
                <el-form-item label="甲方名称" prop="partyNameA">
                  <el-input v-model="form.partyNameA" placeholder="甲方机构名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="甲方电话" prop="linkTelA">
                  <el-input v-model="form.linkTelA" placeholder="甲方联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="甲方地址" prop="addressA">
                  <el-input v-model="form.addressA" placeholder="甲方地址"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="乙方名称" prop="partyNameB">
                  <el-input v-model="form.partyNameB" placeholder="乙方老人/家属"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="乙方电话" prop="linkTelB">
                  <el-input v-model="form.linkTelB" placeholder="乙方联系电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="乙方地址" prop="addressB">
                  <el-input v-model="form.addressB" placeholder="乙方地址"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="丙方代理人" prop="partyNameC">
                  <el-input v-model="form.partyNameC" placeholder="代理人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="丙方电话" prop="linkTelC">
                  <el-input v-model="form.linkTelC" placeholder="代理人电话"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="丙方地址" prop="addressC">
                  <el-input v-model="form.addressC" placeholder="代理人地址"></el-input>
                </el-form-item>
              </el-col>

              <!-- 流程状态 -->
              <el-col :span="12">
                <el-form-item label="合同状态" prop="contractState">
                  <el-select v-model.number="form.contractState" placeholder="选择合同状态" style="width:100%" clearable>
                    <el-option label="待签订" :value="1"></el-option>
                    <el-option label="已签订" :value="2"></el-option>
                    <el-option label="已作废" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="提交状态" prop="submitState">
                  <el-select v-model.number="form.submitState" placeholder="选择提交状态" style="width:100%" clearable>
                    <el-option label="未提交" :value="1"></el-option>
                    <el-option label="已提交" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="电子签名" prop="signingState">
                  <el-select v-model.number="form.signingState" placeholder="选择" style="width:100%" clearable>
                    <el-option label="无需签名" :value="0"></el-option>
                    <el-option label="需要签名" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="发送状态" prop="sendState">
                  <el-select v-model.number="form.sendState" placeholder="选择发送状态" style="width:100%" clearable>
                    <el-option label="未发送" :value="0"></el-option>
                    <el-option label="已发送" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="合同说明" prop="contractDesp">
                  <el-input v-model="form.contractDesp" type="textarea" rows="2" placeholder="合同补充说明"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="合同正文" prop="templateContent">
                  <el-input v-model="form.templateContent" type="textarea" rows="3" placeholder="合同模板内容"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="审核意见" prop="auditMemo">
                  <el-input v-model="form.auditMemo" type="textarea" rows="2" placeholder="审核备注"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="2" placeholder="其他备注"></el-input>
                </el-form-item>
              </el-col>
            </el-row>
          </el-form>
        </el-main>
      </el-container>
    </el-drawer>
  </div>
</template>

<script>
export default {
  name: "ElderContractTrack",
  data() {
    return {
      labelType: "add",
      rules: {},
      // 左侧老人汇总分页
      elderQuery: {
        pageSize: 100,
        currPage: 1,
        condition: {}
      },
      elderTableData: [],
      elderTotal: 0,
      elderLoading: false,
      // 右侧合同明细分页
      contractQuery: {
        pageSize: 100,
        currPage: 1,
        condition: {}
      },
      contractTableData: [],
      contractTotal: 0,
      contractLoading: false,
      // 弹窗表单
      form: {},
      showDialog: false,
      tableHeight: window.innerHeight - 320,
      headerHeight: 0,

      selectOlderInfo: {},
    };
  },
  created() {
    this.getElderList();
    this.getContractList();
  },
  mounted() {
    this.$nextTick(() => {
      this.headerHeight = this.$refs.search_d.offsetHeight;
      this.resizeTable();
      window.addEventListener("resize", this.resizeTable);
    });
  },
  beforeDestroy() {
    window.removeEventListener("resize", this.resizeTable);
  },
  watch: {
    // 监听选中老人变化，自动刷新右侧合同
    selectOlderInfo: {
      handler() {
        this.getContractList();
      },
      deep: true
    }
  },
  methods: {
    //列表item点击
    handleCurrentOutListChange(row) {
      if (!row) {
        return
      }
      this.selectOlderInfo = row
      this.getContractList()
    },

    // 自适应表格高度
    resizeTable() {
      this.tableHeight = window.innerHeight - this.headerHeight - 320;
    },

    // 左侧老人点击单选
    handleElderSelect(row) {
      this.selectOlderInfo = row;
    },
    // 清空选中
    clearSelect() {
      this.selectOlderInfo = {};
    },

    // 左侧老人汇总列表
    async getElderList() {
      this.elderLoading = true;
      const res = await this.$http.post("/elderBaseInfo/list", this.elderQuery).catch(() => ({}));
      this.elderLoading = false;
      if (res.data?.code === 200) {
        this.elderTotal = res.data.data.count;
        this.elderQuery.currPage = res.data.data.currPage;
        this.elderTableData = res.data.data.data;
      }
    },
    elderSizeChange(val) {
      this.elderQuery.pageSize = val;
      this.getElderList();
    },
    elderCurrentChange(val) {
      this.elderQuery.currPage = val;
      this.getElderList();
    },

    // 右侧合同明细列表
    async getContractList() {
      this.contractLoading = true;
      // 有选中老人则携带id，无则不传
      if (this.selectOlderInfo && this.selectOlderInfo.id) {
        this.contractQuery.condition.elderId = this.selectOlderInfo.id;
      } else {
        delete this.contractQuery.condition.elderId;
      }
      const res = await this.$http.post("/insElderContractInfo/list", this.contractQuery).catch(() => ({}));
      this.contractLoading = false;
      if (res.data?.code === 200) {
        this.contractTotal = res.data.data.count;
        this.contractQuery.currPage = res.data.data.currPage;
        this.contractTableData = res.data.data.data;
      }
    },
    contractSizeChange(val) {
      this.contractQuery.pageSize = val;
      this.getContractList();
    },
    contractCurrentChange(val) {
      this.contractQuery.currPage = val;
      this.getContractList();
    },

    // 新增
    newBtn() {
      this.labelType = "add";
      this.showDialog = true;
      this.form = {};
    },
    // 编辑回显
    edit(row) {
      this.labelType = "edit";
      this.showDialog = true;
      this.form = JSON.parse(JSON.stringify(row));
    },
    // 保存
    async handleSave() {
      const valid = await this.$refs.form.validate().catch(() => false);
      if (!valid) return;
      const res = await this.$http.post("/insElderContractInfo/save", this.form).catch(() => ({}));
      if (res.data?.code === 200) {
        this.$notify.success({ title: "提示", message: "保存成功" });
        this.showDialog = false;
        this.getContractList();
        this.getElderList(); // 刷新左侧老人合同次数
      } else {
        this.$notify.error({ title: "提示", message: res.data?.message || "保存失败" });
      }
    },
    // 删除
    async handleDelte(id) {
      const confirm = await this.$confirm("确定删除该合同记录？", "操作提示", {
        type: "warning",
        confirmButtonText: "确定",
        cancelButtonText: "取消"
      }).catch(e => e);
      if (confirm !== "confirm") return;
      const res = await this.$http.post("/insElderContractInfo/delete", { id }).catch(() => ({}));
      if (res.data?.code === 200) {
        this.$notify.success({ title: "提示", message: "删除成功" });
        this.getContractList();
        this.getElderList(); // 刷新左侧老人合同次数
      } else {
        this.$notify.error({ title: "提示", message: res.data?.message || "删除失败" });
      }
    }
  }
};
</script>

<style lang="less" scoped>
.table-box {
  background-color: #fff;
  padding-bottom: 10px;
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
    height: calc(100% - 70px);
    overflow-y: auto;
  }
}
.top-right-sort {
  display: flex;
  align-items: center;
  gap: 10px;
}
.text-green {
  color: #67c23a;
}
.text-orange {
  color: #e6a23c;
}
.text-red {
  color: #f56c6c;
}
.text-gray {
  color: #909399;
}
</style>