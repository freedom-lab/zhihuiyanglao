<template>
    <div style="padding:16px">
        <!-- 头部部分 -->
        <div ref="search_d">
            <el-row type="flex" class="row-bg" justify="space-between">
                <el-col :span="18">
                    <span style="font-size:18px;font-weight:bold">送餐跟踪管理</span>
                </el-col>
                <el-col :span="6">
                    <el-input placeholder="订单编号/老人姓名" v-model="queryInfo.condition.queryKey" class="input-with-select"
                        clearable>
                        <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
                    </el-input>
                </el-col>
            </el-row>
        </div>

        <!-- 表格部分 -->
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
                <el-table-column label="服务状态" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">
                        {{ scope.row.orderState === -1 ? '已退单' : scope.row.orderState === 1 ? '待派单' : scope.row.orderState
                            === 2 ? '已派单' : scope.row.orderState === 3 ? '送餐中' : '送餐完成' }}
                    </template>
                </el-table-column>
                <el-table-column label="送餐人员" width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.staffName || '-' }}</template>
                </el-table-column>
                <el-table-column label="送餐员电话" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.staffLinkTel || '-' }}</template>
                </el-table-column>
                <el-table-column label="预约送餐日期" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.planTime ? scope.row.planTime.slice(0, 10) : '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="送餐开始日期" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.serviceStartTime ? scope.row.serviceStartTime.slice(0, 10) :
                        '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="送餐完成日期" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.serviceEndTime ? scope.row.serviceEndTime.slice(0, 10) : '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="送餐地址" min-width="200" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.address || '-' }}</template>
                </el-table-column>
                <el-table-column label="餐次" width="80" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.mealType === 1 ? '早餐' : scope.row.mealType === 2 ? '中餐' : '晚餐'
                    }}</template>
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
                <el-table-column label="老人联系电话" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
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
                <el-table-column label="退单原因" min-width="160" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.refundReason || '-' }}</template>
                </el-table-column>
                <el-table-column label="备注" min-width="140" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
                </el-table-column>

                <!-- 操作列：送餐派单按钮，已退单/送餐完成隐藏 -->
                <el-table-column label="操作" width="180" align="center" fixed="right">
                    <template slot-scope="scope">
                        <el-button type="text" @click="openDetail(scope.row)" size="small"
                            style="padding: 0;">详情</el-button>
                        <el-button v-if="scope.row.orderState !== -1 && scope.row.orderState !== 4" type="text"
                            color="#409EFF" @click="openDispatch(scope.row)" size="small" style="padding:0 0 0 8px;">
                            送餐派单
                        </el-button>
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
        <el-drawer :visible.sync="showDetailDrawer" direction="rtl" size="70%" :with-header="false"
            :destroy-on-close="true">
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
                                    <el-input
                                        :value="detailForm.planTime ? detailForm.planTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐开始日期：">
                                    <el-input
                                        :value="detailForm.serviceStartTime ? detailForm.serviceStartTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐完成日期：">
                                    <el-input
                                        :value="detailForm.serviceEndTime ? detailForm.serviceEndTime.slice(0, 10) : ''"></el-input>
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
                                <el-form-item label="老人联系电话：">
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
                                    <el-input
                                        :value="detailForm.orderTime ? detailForm.orderTime.slice(0, 10) : ''"></el-input>
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

        <!-- 送餐派单弹窗 -->
        <el-drawer :visible.sync="showDispatchDrawer" direction="rtl" size="50%" :with-header="false"
            :destroy-on-close="true">
            <el-container class="dialogBox">
                <el-header class="dialogHeader">
                    <div>送餐派单</div>
                    <div>
                        <el-button size="small" @click="closeDispatch">取消</el-button>
                        <el-button size="small" type="primary" @click="submitDispatch"
                            style="margin-left:8px">确认派单</el-button>
                    </div>
                </el-header>
                <el-main class="dialogMain">
                    <el-form ref="dispatchForm" :model="dispatchForm" :rules="dispatchRules" label-width="130px">
                        <el-row :gutter="12">
                            <el-col :span="24">
                                <el-form-item label="订单编号：">
                                    <el-input v-model="dispatchForm.orderCode" disabled></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="选择送餐员" prop="staffId">
                                    <el-select v-model="dispatchForm.staffId" placeholder="请选择送餐人员" style="width:100%">
                                        <el-option v-for="item in staffList" :key="item.id"
                                            :label="`${item.name} | ${item.phone}`" :value="item.id"></el-option>
                                    </el-select>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="预约送餐时间">
                                    <el-date-picker v-model="dispatchForm.planTime" type="datetime" placeholder="选择预约送餐时间"
                                        style="width:100%"></el-date-picker>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐开始时间" prop="serviceStartTime">
                                    <el-date-picker v-model="dispatchForm.serviceStartTime" type="datetime"
                                        placeholder="选择送餐开始时间" style="width:100%"></el-date-picker>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="派单备注">
                                    <el-input v-model="dispatchForm.dispatchRemark" type="textarea" rows="4"
                                        placeholder="填写派单备注信息"></el-input>
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
                condition: {
                    orderType: 2,
                    // 送餐跟踪默认查询送餐中订单
                    orderState: 1
                }
            },
            height: window.innerHeight - 256,
            headerHeight: 0,
            loading: false,

            // 详情抽屉
            showDetailDrawer: false,
            detailForm: {},

            // 派单抽屉
            showDispatchDrawer: false,
            dispatchForm: {
                id: null,
                orderCode: '',
                staffId: null,
                dispatchRemark: '',
                planTime: '', // 预约送餐时间
                serviceStartTime: '', // 送餐开始时间
            },
            dispatchRules: {
                staffId: [
                    { required: true, message: '请选择送餐人员', trigger: 'change' }
                ]
            },
            // 送餐员下拉数据源（可在created请求接口获取）
            staffList: []
        };
    },

    created() {
        this.getList()
        // 页面加载获取送餐员下拉列表
        this.getStaffList()
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

        // 获取送餐员下拉列表
        getStaffList() {
            const that = this
            that.$http.post("/userInfo/queryList", {}).then(res => {
                if (res.data.code === 200) {
                    that.staffList = res.data.data
                }
            })
        },

        // 列表查询
        getList() {
            var that = this;
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

        // 打开派单弹窗
        openDispatch(row) {
            this.$refs.dispatchForm?.clearValidate()
            this.dispatchForm = {
                id: row.id,
                orderCode: row.orderCode,
                staffId: null,
                dispatchRemark: ''
            }
            this.showDispatchDrawer = true
        },

        // 关闭派单弹窗
        closeDispatch() {
            this.showDispatchDrawer = false
            this.dispatchForm = {}
        },

        // 提交派单
        submitDispatch() {
            const that = this
            this.$refs.dispatchForm.validate((valid) => {
                if (!valid) return
                that.$confirm('确认分配该送餐人员？', '派单提示', {
                    confirmButtonText: '确认',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    let pamars = {
                        ...that.dispatchForm
                    }
                    pamars.orderState = 2;
                    that.$http.post("/insCanteenOrderInfo/save", pamars).then(res => {
                        if (res.data.code === 200) {
                            that.$notify.success({ title: '成功', message: '派单完成' })
                            that.closeDispatch()
                            that.getList()
                        } else {
                            that.$notify.error({ title: '失败', message: res.data.message })
                        }
                    })
                }).catch(() => { })
            })
        },

        // 删除订单
        async handleDelte(id) {
            const confirmResult = await this.$confirm("确定删除吗?", "提示", {
                confirmButtonText: "确定",
                cancelButtonText: "取消",
                type: "warning",
            }).catch((err) => err);
            if (confirmResult === "confirm") {
                var that = this;
                that.$http.post("/insCanteenOrderInfo/delete", { "id": id }).then(function (response) {
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
        font-size: 16px;
        font-weight: bold;
    }

    .dialogMain {
        padding: 15px;
        height: calc(100% - 70px);
        overflow-y: auto;
    }
}
</style>