<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="15">
          <span style="font-size:18px;font-weight:bold">老人合同跟踪</span>
        </el-col>
        <el-col :span="10">
          <div class="top-right-sort">
            <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
              <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
            </el-input>
          </div>
        </el-col>
      </el-row>
    </div>

    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center" fixed="left"></el-table-column>

        <el-table-column label="老人姓名" width="90" align="center" show-overflow-tooltip fixed="left">
          <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
        </el-table-column>
        <el-table-column label="能力等级" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ }}</template>
        </el-table-column>

        <!-- 签署状态 -->
        <el-table-column label="签署状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <!-- 电子签名状态枚举：0无需电子签名 1未签署 2签署中 3已签署 4已归档 -->
            <span :style="{
              color: getSignColor(scope.row)
            }">
              {{ getSignText(scope.row) }}
            </span>
          </template>
        </el-table-column>

        <!-- 二维码 -->
        <el-table-column label="二维码" width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span :style="{ color: scope.row.code_path ? '#409EFF' : '#999' }">
              生成签名二维码
            </span>
          </template>
        </el-table-column>

        <!-- 审核状态 -->
        <el-table-column label="审核状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <!-- 审核状态枚举：1未审核 2审核通过 3审核不通过 -->
            <span :style="{
              color: getAuditColor(scope.row)
            }">
              {{ getAuditText(scope.row) }}
            </span>
          </template>
        </el-table-column>

        <!-- 签订状态 -->
        <el-table-column label="签订状态" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <!-- 合同状态枚举：1待签订 2已签订(生效中) 3已到期 -1已作废 -->
            <span :style="{ color: getContractStateColor(scope.row) }">
              {{ getContractStateText(scope.row) }}
            </span>
          </template>
        </el-table-column>

        <el-table-column label="合同编号" width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.contractCode || '-' }}</template>
        </el-table-column>
        <el-table-column label="合同名称" width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.contractName || '-' }}</template>
        </el-table-column>
        <el-table-column label="合同模板" width="140" align="center" show-overflow-tooltip>
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
        <el-table-column label="入住押金" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.depositAmount || 0 }}</template>
        </el-table-column>
        <el-table-column label="费用类型" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.costType === 1 ? '年付' : '-' }}</template>
        </el-table-column>
        <el-table-column label="床位类型" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedType || '-' }}</template>
        </el-table-column>
        <el-table-column label="床位费" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedAmount || 0 }}</template>
        </el-table-column>
        <el-table-column label="床位押金" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedDepositAmount || 0 }}</template>
        </el-table-column>
        <el-table-column label="护理等级" width="100" align="center" show-overflow-tooltip>
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
        <el-table-column label="备注" width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>

        <!-- 操作列 -->
        <el-table-column label="操作" width="250" align="center" fixed="right">
          <template slot-scope="scope">
            <div class="operBox">
              <el-button class="operBtn" :style="scope.row.contractInfo ? '':'color:#999'" type="text" @click="handleDetail(scope.row)" size="small"
                icon="el-icon-view">详情</el-button>
              <el-button class="operBtn" type="text" @click="handleEContract(scope.row)" size="small"
                icon="el-icon-document" v-if="scope.row.contractInfo">电子合同</el-button>
              <el-button class="operBtn" type="text" @click="handleHistory(scope.row)" size="small"
                icon="el-icon-time">合同历史</el-button>
              <el-button class="operBtn" type="text" @click="handleSignContract(scope.row)" size="small"
                icon="el-icon-edit">签订合同</el-button>
              <el-button class="operBtn" type="text" @click="handleAudit(scope.row)" size="small"
                icon="el-icon-check">审核</el-button>
            </div>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div class="block" style="margin-top: 10px;">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <el-drawer :visible.sync="showDialog" direction="rtl" size="80%" :with-header="false" :destroy-on-close="true"
      :disabled="labelType != 'detail'">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>{{ labelType == 'add' ? '发起签约' : '详情' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <el-collapse v-model="activeCollapse">
              <!-- 第一组：基本信息（老人信息+照片上传） -->
              <el-collapse-item title="基本信息" name="base">
                <el-row :gutter="20">
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
                    <el-form-item label="年龄" prop="age">
                      <el-input v-model.number="form.age" placeholder="请输入年龄"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="性别" prop="sex">
                      <el-select v-model="form.sex" placeholder="请选择性别" style="width:100%" clearable>
                        <el-option label="男" :value="'1'"></el-option>
                        <el-option label="女" :value="'2'"></el-option>
                      </el-select>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="出生日期" prop="birthDate">
                      <el-date-picker v-model="form.birthDate" type="date" placeholder="选择出生日期" style="width:100%"
                        clearable></el-date-picker>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="手机号码" prop="linkTelB">
                      <el-input v-model="form.linkTelB" placeholder="请输入手机号码"></el-input>
                    </el-form-item>
                  </el-col>
                </el-row>
              </el-collapse-item>

              <!-- 第二组：合同主体（甲乙丙签约信息+合同基础时间） -->
              <el-collapse-item title="合同主体" name="contract">
                <el-row :gutter="20">
                  <!-- 合同基础信息 -->
                  <el-col :span="12">
                    <el-form-item label="合同模板" prop="templateName">
                      <div style="display:flex;gap:8px;align-items:center;">
                        <el-input v-model="form.templateName" placeholder="请选择模板" disabled></el-input>
                        <el-button type="primary" icon="el-icon-document" @click="openTemplateDialog">选择模板</el-button>
                      </div>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="合同编号" prop="contractCode">
                      <el-input v-model="form.contractCode" placeholder="自动生成" disabled></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="合同名称" prop="contractName">
                      <el-input v-model="form.contractName" placeholder="请输入合同名称"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="签订时间" prop="signTime">
                      <el-date-picker v-model="form.signTime" type="date" placeholder="请选择签订时间" style="width:100%"
                        clearable></el-date-picker>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="合同开始时间" prop="startDate">
                      <el-date-picker v-model="form.startDate" type="date" placeholder="请选择合同开始时间" style="width:100%"
                        clearable></el-date-picker>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="合同结束时间" prop="endDate">
                      <el-date-picker v-model="form.endDate" type="date" placeholder="请选择合同结束时间" style="width:100%"
                        clearable></el-date-picker>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12"></el-col>

                  <!-- 甲方信息 固定蚌埠城投只读 -->
                  <el-col :span="12">
                    <el-form-item label="甲方" prop="partyNameA">
                      <el-input v-model="form.partyNameA" value="蚌埠城投" disabled></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="甲方联系电话" prop="linkTelA">
                      <el-input v-model="form.linkTelA" placeholder="18200000808"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="甲方地址" prop="addressA">
                      <el-input v-model="form.addressA" placeholder="蚌埠市"></el-input>
                    </el-form-item>
                  </el-col>

                  <!-- 乙方（老人） -->
                  <el-col :span="12">
                    <el-form-item label="乙方" prop="partyNameB">
                      <el-input v-model="form.partyNameB"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="乙方联系电话" prop="linkTelB">
                      <el-input v-model="form.linkTelB"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="乙方地址" prop="addressB">
                      <el-input v-model="form.addressB" placeholder="手动阀阿三"></el-input>
                    </el-form-item>
                  </el-col>

                  <!-- 代理人丙方 -->
                  <el-col :span="12">
                    <el-form-item label="代理人" prop="partyNameC">
                      <el-input v-model="form.partyNameC" placeholder="请输入代理人"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="代理人联系电话" prop="linkTelC">
                      <el-input v-model="form.linkTelC" placeholder="请输入代理人联系电话"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="代理人地址" prop="addressC">
                      <el-input v-model="form.addressC" placeholder="请输入代理人地址"></el-input>
                    </el-form-item>
                  </el-col>
                </el-row>
              </el-collapse-item>

              <!-- 合同状态 & 文本说明（保留你原有业务字段） -->
              <el-collapse-item title="合同附加信息" name="extra">
                <el-row :gutter="20">
                  <el-col :span="12">
                    <el-form-item label="合同状态" prop="contractState">
                      <el-select v-model="form.contractState" placeholder="请选择合同状态" style="width:100%" clearable>
                        <el-option label="待签订" :value="1"></el-option>
                        <el-option label="已签订" :value="2"></el-option>
                        <el-option label="已作废" :value="3"></el-option>
                      </el-select>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="提交状态" prop="submitState">
                      <el-select v-model="form.submitState" placeholder="请选择提交状态" style="width:100%" clearable>
                        <el-option label="未提交" :value="1"></el-option>
                        <el-option label="已提交" :value="2"></el-option>
                      </el-select>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="电子签名状态" prop="signingState">
                      <el-select v-model="form.signingState" placeholder="请选择" style="width:100%" clearable>
                        <el-option label="无需电子签名" :value="0"></el-option>
                        <el-option label="需要电子签名" :value="1"></el-option>
                      </el-select>
                    </el-form-item>
                  </el-col>
                  <el-col :span="12">
                    <el-form-item label="发送状态" prop="sendState">
                      <el-select v-model="form.sendState" placeholder="请选择发送状态" style="width:100%" clearable>
                        <el-option label="未发送" :value="0"></el-option>
                        <el-option label="已发送" :value="1"></el-option>
                      </el-select>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="合同说明" prop="contractDesp">
                      <el-input v-model="form.contractDesp" type="textarea" rows="2" placeholder="填写合同补充说明"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="合同正文内容" prop="templateContent">
                      <el-input v-model="form.templateContent" type="textarea" rows="3" placeholder="合同模板填充内容"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="审核说明" prop="auditMemo">
                      <el-input v-model="form.auditMemo" type="textarea" rows="2" placeholder="审核意见"></el-input>
                    </el-form-item>
                  </el-col>
                  <el-col :span="24">
                    <el-form-item label="备注" prop="remark">
                      <el-input v-model="form.remark" type="textarea" rows="2" placeholder="其他备注信息"></el-input>
                    </el-form-item>
                  </el-col>
                </el-row>
              </el-collapse-item>
            </el-collapse>
          </el-form>
        </el-main>

      </el-container>
    </el-drawer>

    <!-- 选择合同模板弹窗 -->
    <el-dialog title="选择合同模板" :visible.sync="templateDialogVisible" width="70%" @close="resetTemplateDialog">
      <!-- 搜索栏 -->
      <div class="search-wrap" style="margin-bottom:15px;display:flex;gap:12px;align-items:center;">
        <el-input v-model="templatePage.condition.templateName" placeholder="请输入模板名称" clearable
          style="width:240px;"></el-input>
        <el-button type="primary" icon="el-icon-search" @click="getTemplateList">查询</el-button>
        <el-button icon="el-icon-refresh" @click="resetTemplateSearch">重置</el-button>
      </div>

      <!-- 模板表格 -->
      <el-table :data="templateTableData" border height="400" @row-click="handleSelectTemplate" highlight-current-row>
        <el-table-column label="模板名称" prop="templateName" align="left" min-width="160"></el-table-column>
        <el-table-column label="所属机构" prop="institutionName" align="left" min-width="140"></el-table-column>
        <el-table-column label="创建人" prop="createName" align="center" width="100"></el-table-column>
        <el-table-column label="创建时间" prop="createTime" align="center" width="170"></el-table-column>
        <el-table-column label="备注" prop="remark" align="left" min-width="180" show-overflow-tooltip></el-table-column>
        <el-table-column label="操作" align="center" width="100">
          <template slot-scope="scope">
            <el-button type="text" size="small" @click.stop="confirmSelectTemplate(scope.row)">选择</el-button>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <el-pagination @size-change="handleTemplateSizeChange" @current-change="handleTemplatePageChange"
        :current-page="templatePage.currPage" :page-sizes="[10, 20, 50]" :page-size="templatePage.pageSize"
        layout="total, sizes, prev, pager, next, jumper" :total="templatePage.total"
        style="margin-top:15px;text-align:right;"></el-pagination>

      <div slot="footer" class="dialog-footer">
        <el-button @click="templateDialogVisible = false">取消</el-button>
      </div>
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
      activeCollapse: ['base', 'contract', 'extra'],
      rules: {},
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,

      // 弹窗显示控制
      templateDialogVisible: false,
      // 分页参数
      templatePage: {
        total: 0,
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {
          templateName: '',
          status: 1
        }
      },
      data() {
        return {
          // 折叠面板默认展开全部
          activeCollapse: ['base', 'contract', 'extra'],
          form: {
            // 基础信息
            elderName: '',
            idCard: '',
            age: '',
            sex: '',
            birthDate: '',
            linkTelB: '',
            // 合同基础
            contractCode: '',
            contractName: '',
            signTime: '',
            startDate: '',
            endDate: '',
            // 甲方固定
            partyNameA: '蚌埠城投',
            linkTelA: '',
            addressA: '',
            // 乙方老人
            partyNameB: '',
            addressB: '',
            // 代理人丙方
            partyNameC: '',
            linkTelC: '',
            addressC: '',
            // 状态
            contractState: '',
            submitState: '',
            signingState: '',
            sendState: '',
            // 文本域
            contractDesp: '',
            templateContent: '',
            auditMemo: '',
            remark: ''
          },
          rules: {}
        }
      },
      // 表格数据源
      templateTableData: [],
      // 选中模板缓存
      selectedTemplate: null
    };
  },

  created() {
    this.getList()
    this.contractTemplateList();
  },

  mounted() {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 打开弹窗
    openTemplateDialog() {
      this.templateDialogVisible = true
      this.getTemplateList()
    },
    // 分页切换
    handleTemplatePageChange(page) {
      this.templatePage.pageNum = page
      this.getTemplateList()
    },
    handleTemplateSizeChange(size) {
      this.templatePage.pageSize = size
      this.templatePage.pageNum = 1
      this.getTemplateList()
    },
    // 重置搜索条件
    resetTemplateSearch() {
      this.templateSearch = { templateName: '', status: '' }
      this.templatePage.pageNum = 1
      this.getTemplateList()
    },
    // 点击行选中
    handleSelectTemplate(row) {
      this.selectedTemplate = row;
      this.form.remark = row.remark;
      this.templateId = row.id;
      this.form.templateContent = row.templateContent;
    },
    // 点击【选择】按钮确认填充
    confirmSelectTemplate(row) {
      // 回填到合同表单
      this.form.templateName = row.templateName
      this.form.templateContent = row.templateContent
      // 关闭弹窗
      this.templateDialogVisible = false
      this.$message.success('已选择模板：' + row.templateName)
    },
    // 弹窗关闭重置数据
    resetTemplateDialog() {
      this.selectedTemplate = null
      this.templateSearch = { templateName: '', status: '' }
      this.templatePage = { pageNum: 1, pageSize: 10, total: 0 }
      this.templateTableData = []
    },
    //获取合同模版
    getTemplateList() {
      var that = this;
      that.$http.post("/insBaseContractTemplate/list", that.templatePage).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.templatePage.total = response.data.data.count;
          that.templatePage.currPage = response.data.data.currPage
          that.templateTableData = response.data.data.data;
        }
      });
    },

    // 合同状态 - 展示文字
    getContractStateText(row) {
      // 无合同信息
      if (!row.contractInfo) return '待签订';
      const state = row.contractInfo.contractState;
      switch (state) {
        case 1: return '待签订';
        case 2: return '已签订';
        case 3: return '已到期';
        case -1: return '已作废';
        default: return '未知状态';
      }
    },
    // 合同状态 - 文字颜色
    getContractStateColor(row) {
      if (!row.contractInfo) return '#909399';
      const state = row.contractInfo.contractState;
      switch (state) {
        case 1: return 'blue';    // 待签订：灰色
        case 2: return '#67c23a';    // 已签订生效：绿色
        case 3: return '#e6a23c';    // 已到期：橙色预警
        case -1: return '#f56c6c';   // 已作废：红色
        default: return '#909399';
      }
    },
    // ========== 签署状态文字+颜色 ==========
    getSignText(row) {
      if (!row.contractInfo) return '无需签署';
      const state = row.contractInfo.signingState;
      switch (state) {
        case 0: return '无需电子签';
        case 1: return '未签署';
        case 2: return '签署中';
        case 3: return '已签署';
        case 4: return '已归档';
        default: return '未知状态';
      }
    },
    getSignColor(row) {
      if (!row.contractInfo) return '#909399';
      const state = row.contractInfo.signingState;
      switch (state) {
        case 0: return '#909399'; // 无需 灰色
        case 1: return '#e6a23c'; // 未签署 灰色
        case 2: return 'blue'; // 签署中、已签署 绿色
        case 3: return '#67c23a'; // 签署中、已签署 绿色
        case 4: return '#67c23a'; // 已归档 橙色
        default: return '#909399';
      }
    },

    // ========== 审核状态文字+颜色 ==========
    getAuditText(row) {
      if (!row.contractInfo) return '无合同';
      const state = row.contractInfo.auditState;
      switch (state) {
        case 1: return '未审核';
        case 2: return '审核通过';
        case 3: return '审核驳回';
        default: return '未知状态';
      }
    },
    getAuditColor(row) {
      if (!row.contractInfo) return '#909399';
      const state = row.contractInfo.auditState;
      switch (state) {
        case 1: return '#909399'; // 未审核 灰色
        case 2: return '#67c23a'; // 通过 绿色
        case 3: return '#f56c6c'; // 驳回 红色
        default: return '#909399';
      }
    },

    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/memberBaseInfo/listWithContract", that.queryInfo).then(function (response) {
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
      that.$http.post("/insElderContractInfo/save", that.form).then(function (response) {
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

    // 查看详情
    handleDetail(row) {
      console.log('查看详情', row);
      if (!row.contractInfo) {
        return;
      }
      this.showDialog = true;
      this.labelType = 'detail'
      this.form = JSON.parse(JSON.stringify(row.contractInfo))
    },
    // 打开电子合同
    handleEContract(row) {
      console.log('电子合同', row)
    },
    // 合同历史记录
    handleHistory(row) {
      console.log('合同历史', row)
    },
    // 发起签订合同
    handleSignContract(row) {
      console.log('签订合同', row)

      if (!row.contractInfo) {
        this.form = {
            // 基础信息
            elderId: row.id,
            elderName: row.elderName,
            idCard: row.idCard,
            age: row.age,
            sex: row.sex,
            birthday: row.birthDate,
            linkTelB: row.linkTelB,
            // 合同基础
            contractCode: '',
            contractName: '',
            signTime: '',
            startDate: '',
            endDate: '',
            // 甲方固定
            partyNameA: '',
            linkTelA: '',
            addressA: '',
            // 乙方老人
            partyNameB: row.elderName,
            addressB: '',
            // 代理人丙方
            partyNameC: '',
            linkTelC: '',
            addressC: '',
            // 状态
            contractState: '',
            submitState: '',
            signingState: '',
            sendState: '',
            // 文本域
            contractDesp: '',
            templateContent: '',
            auditMemo: '',
            remark: ''
          };
      }else {
        this.form = JSON.parse(JSON.stringify(row.contractInfo))
      }

      
      this.showDialog = true;
      this.labelType = 'add'
    },
    // 审核合同
    handleAudit(row) {
      console.log('审核合同', row)
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

.operBox {
  display: flex;
  width: 100%;
  flex-wrap: wrap;
  gap: 4px;
}

.operBtn {
  padding: 0;
}
</style>



