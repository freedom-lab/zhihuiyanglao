<template>
    <div style="padding:16px">
        <!-- 头部搜索区域 -->
        <div ref="search_d">
            <el-row type="flex" class="row-bg" justify="space-between">
                <el-col :span="18">
                    <span style="font-size:18px;font-weight:bold">退单退款管理</span>
                </el-col>
                <el-col :span="6">
                    <el-input placeholder="订单编号/老人姓名" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
                        <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
                    </el-input>
                </el-col>
            </el-row>
        </div>

        <!-- 表格区域 -->
        <div class="table-box" style="margin-top:16px">
            <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
                :header-cell-style="{
                    backgroundColor: '#fafafa',
                    color: '#333',
                    fontWeight: 'bold',
                    fontSize: '14px',
                }" :height="height">
                <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

                <el-table-column label="订单编号" min-width="160" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.orderCode || '-' }}</template>
                </el-table-column>
                <el-table-column label="订单类型" width="90" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.orderType === 1 ? '堂食' : '送餐' }}</template>
                </el-table-column>
                <el-table-column label="服务状态" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">
                        {{ scope.row.orderState === -1 ? '已退单' : scope.row.orderState === 1 ? '待派单' : scope.row.orderState
                            === 2 ? '已派单' : scope.row.orderState === 3 ? '送餐中' : '送餐完成' }}
                    </template>
                </el-table-column>
                <el-table-column label="用户类别" width="110" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">
                        {{ scope.row.personType === 1 ? '入住老人' : scope.row.personType === 2 ? '社会人员' : '散客来宾' }}
                    </template>
                </el-table-column>
                <el-table-column label="老人姓名" width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
                </el-table-column>
                <el-table-column label="身份证号" min-width="180" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
                </el-table-column>
                <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
                </el-table-column>
                <el-table-column label="联系电话" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
                </el-table-column>
                <el-table-column label="送餐地址" min-width="200" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.address || '-' }}</template>
                </el-table-column>
                <el-table-column label="餐次" width="80" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.mealType === 1 ? '早餐' : scope.row.mealType === 2 ? '中餐' : '晚餐'
                    }}</template>
                </el-table-column>
                <el-table-column label="下单日期" width="110" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.orderTime ? scope.row.orderTime.slice(0, 10) : '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="应付金额" width="90" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.totalAmount || 0 }}</template>
                </el-table-column>
                <el-table-column label="实付金额" width="90" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.payAmount || 0 }}</template>
                </el-table-column>
                <el-table-column label="优惠金额" width="90" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.offerAmount || 0 }}</template>
                </el-table-column>
                <el-table-column label="支付状态" width="90" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.payState === 1 ? '未支付' : '已支付' }}</template>
                </el-table-column>
                <el-table-column label="支付方式" width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">
                        {{ scope.row.payMethod === 1 ? '现金' : scope.row.payMethod === 2 ? '微信' : scope.row.payMethod === 3 ?
                            '支付宝' : '账户余额' }}
                    </template>
                </el-table-column>
                <el-table-column label="支付日期" width="110" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.payTime ? scope.row.payTime.slice(0, 10) : '-' }}</template>
                </el-table-column>
                <el-table-column label="送餐人员" width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.staffName || '-' }}</template>
                </el-table-column>
                <el-table-column label="送餐完成日期" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.serviceEndTime ? scope.row.serviceEndTime.slice(0, 10) : '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="退单原因" min-width="160" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.refundReason || '-' }}</template>
                </el-table-column>
                <el-table-column label="备注" min-width="140" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
                </el-table-column>

                <!-- 操作列：新增退款按钮，已退单隐藏退款 -->
                <el-table-column label="操作" width="160" align="center" fixed="right">
                    <template slot-scope="scope">
                        <el-button type="text" @click="openDetail(scope.row)" size="small" style="padding: 0;">详情</el-button>
                        <el-button v-if="scope.row.orderState !== -1" type="text" color="#F56C6C" @click="openRefund(scope.row)" size="small" style="padding:0 0 0 8px;">退款</el-button>
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

        <!-- 订单详情抽屉（只读） -->
        <el-drawer :visible.sync="showDetailDrawer" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
            <el-container class="dialogBox">
                <el-header class="dialogHeader">
                    <div>订单详情</div>
                    <div>
                        <el-button size="small" @click="showDetailDrawer = false">返回</el-button>
                    </div>
                </el-header>
                <el-main class="dialogMain">
                    <el-form ref="detailForm" :model="detailForm" label-width="130px" disabled>
                        <el-row :gutter="12">
                            <el-col :span="12">
                                <el-form-item label="机构名称：">
                                    <el-input v-model="detailForm.institutionName"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="订单编号：">
                                    <el-input v-model="detailForm.orderCode"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="订单类型：">
                                    <el-input :value="detailForm.orderType === 1 ? '堂食' : '送餐'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="服务状态：">
                                    <el-input
                                        :value="detailForm.orderState === -1 ? '已退单' : detailForm.orderState === 1 ? '待派单' : detailForm.orderState === 2 ? '已派单' : detailForm.orderState === 3 ? '送餐中' : '送餐完成'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="用户类别：">
                                    <el-input
                                        :value="detailForm.personType === 1 ? '入住老人' : detailForm.personType === 2 ? '社会人员' : '散客来宾'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="老人姓名：">
                                    <el-input v-model="detailForm.elderName"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="身份证号：">
                                    <el-input v-model="detailForm.idCard"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="性别：">
                                    <el-input :value="detailForm.sex === 1 ? '男' : '女'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="联系电话：">
                                    <el-input v-model="detailForm.linkTel"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="送餐地址：">
                                    <el-input v-model="detailForm.address"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="餐次时段：">
                                    <el-input
                                        :value="detailForm.mealType === 1 ? '早餐' : detailForm.mealType === 2 ? '中餐' : '晚餐'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="下单日期：">
                                    <el-input :value="detailForm.orderTime ? detailForm.orderTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="应付金额(元)：">
                                    <el-input v-model="detailForm.totalAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="实付金额(元)：">
                                    <el-input v-model="detailForm.payAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="优惠金额(元)：">
                                    <el-input v-model="detailForm.offerAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付状态：">
                                    <el-input :value="detailForm.payState === 1 ? '未支付' : '已支付'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付方式：">
                                    <el-input
                                        :value="detailForm.payMethod === 1 ? '现金' : detailForm.payMethod === 2 ? '微信' : detailForm.payMethod === 3 ? '支付宝' : '账户余额'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付日期：">
                                    <el-input :value="detailForm.payTime ? detailForm.payTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐人员：">
                                    <el-input v-model="detailForm.staffName"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐人员电话：">
                                    <el-input v-model="detailForm.staffLinkTel"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="预约送餐日期：">
                                    <el-input :value="detailForm.planTime ? detailForm.planTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐完成日期：">
                                    <el-input
                                        :value="detailForm.serviceEndTime ? detailForm.serviceEndTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="退单原因：">
                                    <el-input v-model="detailForm.refundReason" type="textarea" rows="2"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="备注说明：">
                                    <el-input v-model="detailForm.remark" type="textarea" rows="2"></el-input>
                                </el-form-item>
                            </el-col>
                        </el-row>
                    </el-form>
                </el-main>
            </el-container>
        </el-drawer>

        <!-- 退款弹窗Drawer -->
        <el-drawer :visible.sync="showRefundDrawer" direction="rtl" size="50%" :with-header="false" :destroy-on-close="true">
            <el-container class="dialogBox">
                <el-header class="dialogHeader">
                    <div>订单退款</div>
                    <div>
                        <el-button size="small" @click="closeRefund">取消</el-button>
                        <el-button size="small" type="primary" @click="submitRefund" style="margin-left:8px">确认退款</el-button>
                    </div>
                </el-header>
                <el-main class="dialogMain">
                    <el-form ref="refundForm" :model="refundForm" :rules="refundRules" label-width="130px">
                        <el-row :gutter="12">
                            <el-col :span="24">
                                <el-form-item label="订单编号：">
                                    <el-input v-model="refundForm.orderCode" disabled></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="实付总金额：">
                                    <el-input v-model="refundForm.totalPayAmount" disabled suffix="元"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="退款金额" prop="refundAmount">
                                    <el-input v-model.number="refundForm.refundAmount" suffix="元" placeholder="填写退款金额"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="退款原因" prop="refundReason">
                                    <el-input v-model="refundForm.refundReason" type="textarea" rows="4" placeholder="详细填写退款理由"></el-input>
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
    data() {
        return {
            total: 0,
            queryInfo: {
                pageSize: 100,
                pageCount: 1,
                currPage: 1,
                condition: {}
            },
            height: window.innerHeight - 256,
            headerHeight: 0,
            loading: false,

            // 详情抽屉
            showDetailDrawer: false,
            detailForm: {},

            // 退款抽屉
            showRefundDrawer: false,
            refundForm: {
                id: null,
                orderCode: '',
                totalPayAmount: 0,
                refundAmount: 0,
                refundReason: ''
            },
            // 退款表单校验
            refundRules: {
                refundAmount: [
                    { required: true, message: '请填写退款金额', trigger: 'blur' },
                    { type: 'number', min: 0.01, message: '退款金额必须大于0', trigger: 'blur' }
                ],
                refundReason: [
                    { required: true, message: '请填写退款原因', trigger: 'blur' },
                    { min: 5, message: '退款原因至少5个字', trigger: 'blur' }
                ]
            }
        };
    },

    created() {
        this.getList()
    },

    mounted() {
        this.$nextTick(() => {
            this.headerHeight = this.$refs.search_d.offsetHeight;
            window.addEventListener('resize', this.getHeight())
        })
    },

    methods: {
        // 自适应表格高度
        getHeight() {
            this.height = window.innerHeight - this.headerHeight - 256;
        },

        // 列表查询
        getList() {
            const that = this;
            that.loading = true
            that.$http.post("/insCanteenOrderInfo/list", that.queryInfo).then(function (response) {
                console.log(response.data.data);
                if (response.data.code == 200) {
                    that.loading = false
                    that.total = response.data.data.count;
                    that.queryInfo.currPage = response.data.data.currPage
                    that.tableData = response.data.data.data;
                }
            });
        },

        // 打开详情
        openDetail(row) {
            this.detailForm = JSON.parse(JSON.stringify(row))
            this.showDetailDrawer = true
        },

        // 打开退款弹窗
        openRefund(row) {
            this.$refs.refundForm?.clearValidate()
            this.refundForm = {
                id: row.id,
                orderCode: row.orderCode,
                totalPayAmount: row.payAmount,
                refundAmount: row.payAmount, // 默认全额退款
                refundReason: ''
            }
            this.showRefundDrawer = true
        },

        // 关闭退款弹窗
        closeRefund() {
            this.showRefundDrawer = false
            this.refundForm = {}
        },

        // 提交退款
        submitRefund() {
            const that = this
            this.$refs.refundForm.validate((valid) => {
                if (!valid) return
                that.$confirm('确认提交退款申请？提交后订单状态变更为已退单', '退款提示', {
                    confirmButtonText: '确认',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    let pamars = {
                        ...that.refundForm,
                    }
                    pamars.orderState = -1;
                    that.$http.post("/insCanteenOrderInfo/save", pamars).then(res => {
                        if (res.data.code === 200) {
                            that.$notify.success({ title: '成功', message: '退款提交完成' })
                            that.closeRefund()
                            that.getList()
                        } else {
                            that.$notify.error({ title: '失败', message: res.data.message })
                        }
                    })
                }).catch(() => {})
            })
        },

        // 删除订单
        async handleDelte(id) {
            const confirmResult = await this.$confirm("确定删除该订单?", "提示", {
                confirmButtonText: "确定",
                cancelButtonText: "取消",
                type: "warning",
            }).catch((err) => err);
            if (confirmResult === "confirm") {
                const that = this;
                that.$http.post("/insCanteenOrderInfo/delete", { "id": id }).then(function (response) {
                    if (response.data.code == 200) {
                        that.$notify.success({ title: "提示", message: "删除成功" });
                        that.getList();
                    } else {
                        that.$notify.info({ title: "提示", message: response.data.message });
                    }
                });
            }
        },

        // 分页切换
        handleSizeChange(val) {
            this.queryInfo.pageSize = val;
            this.getList()
        },
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
    overflow: hidden;
    text-overflow: ellipsis;
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
        font-size:16px;
        font-weight:bold;
    }

    .dialogMain {
        padding: 15px;
        height: calc(100% - 70px);
        overflow-y: auto;
    }
}
</style>