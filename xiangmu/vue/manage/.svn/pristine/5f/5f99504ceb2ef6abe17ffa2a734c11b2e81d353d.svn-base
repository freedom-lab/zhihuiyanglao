<template>
    <div style="padding:16px">

        <!-- 头部部分 -->
        <div ref="search_d">
            <el-row type="flex" class="row-bg" justify="space-around">
                <el-col :span="18">
                    <span style="font-size:18px;font-weight:bold">送餐跟踪管理</span>
                </el-col>
                <el-col :span="6">
                    <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select"
                        clearable>
                        <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
                    </el-input>
                </el-col>
            </el-row>
        </div>

        <!-- 表格部分 -->
        <div class="table-box">
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
                <el-table-column label="联系电话" min-width="130" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.staffLinkTel || '-' }}</template>
                </el-table-column>
                <el-table-column label="预约送餐日期" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.planTime ? scope.row.planTime.slice(0, 10) : '-'
                    }}</template>
                </el-table-column>
                <el-table-column label="送餐开始时间" width="120" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.serviceStartTime ? scope.row.serviceStartTime.slice(0, 10) : '-'
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
                <el-table-column label="性别" width="70" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
                </el-table-column>
                <el-table-column label="联系电话" min-width="130" align="center" show-overflow-tooltip>
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

                <!-- 操作列 -->
                <el-table-column label="操作" width="200" align="center" fixed="right">
                    <template slot-scope="scope">
                        <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">详情</el-button>
                        <el-button type="text" @click="linkStaff(scope.row)" size="small" style="padding: 0 10px;">联系送餐员</el-button>
                        <el-popconfirm title="确定完成送餐吗？" @confirm="handleComplete(scope.row.id)">
                            <el-button slot="reference" type="text" style="padding: 0;">完成送餐</el-button>
                        </el-popconfirm>
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

        <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
            <el-container class="dialogBox">
                <el-header class="dialogHeader">
                    <div>详情</div>
                    <div>
                        <el-button size="small" @click="showDialog = false">返回</el-button>
                    </div>
                </el-header>

                <el-main class="dialogMain">
                    <el-form ref="form" :model="form" label-width="130px" disabled>
                        <el-row :gutter="12">
                            <el-col :span="12">
                                <el-form-item label="订单编号：">
                                    <el-input v-model="form.orderCode"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="订单类型：">
                                    <el-input :value="form.orderType === 1 ? '堂食' : '送餐'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="服务状态：">
                                    <el-input
                                        :value="form.orderState === -1 ? '已退单' : form.orderState === 1 ? '待派单' : form.orderState === 2 ? '已派单' : form.orderState === 3 ? '送餐中' : '送餐完成'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐人员：">
                                    <el-input v-model="form.staffName"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐人员电话：">
                                    <el-input v-model="form.staffLinkTel"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="预约送餐日期：">
                                    <el-input :value="form.planTime ? form.planTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐开始时间：">
                                    <el-input
                                        :value="form.serviceStartTime ? form.serviceStartTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="送餐完成日期：">
                                    <el-input
                                        :value="form.serviceEndTime ? form.serviceEndTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="用户类别：">
                                    <el-input
                                        :value="form.personType === 1 ? '入住老人' : form.personType === 2 ? '社会人员' : '散客来宾'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="老人姓名：">
                                    <el-input v-model="form.elderName"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="身份证号：">
                                    <el-input v-model="form.idCard"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="性别：">
                                    <el-input :value="form.sex === 1 ? '男' : '女'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="联系电话：">
                                    <el-input v-model="form.linkTel"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="送餐地址：">
                                    <el-input v-model="form.address"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="餐次时段：">
                                    <el-input
                                        :value="form.mealType === 1 ? '早餐' : form.mealType === 2 ? '中餐' : '晚餐'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="下单日期：">
                                    <el-input :value="form.orderTime ? form.orderTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="应付金额(元)：">
                                    <el-input v-model="form.totalAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="实付金额(元)：">
                                    <el-input v-model="form.payAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="优惠金额(元)：">
                                    <el-input v-model="form.offerAmount"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付状态：">
                                    <el-input :value="form.payState === 1 ? '未支付' : '已支付'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付方式：">
                                    <el-input
                                        :value="form.payMethod === 1 ? '现金' : form.payMethod === 2 ? '微信' : form.payMethod === 3 ? '支付宝' : '账户余额'"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item label="支付日期：">
                                    <el-input :value="form.payTime ? form.payTime.slice(0, 10) : ''"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="退单原因：">
                                    <el-input v-model="form.refundReason" type="textarea" rows="2"></el-input>
                                </el-form-item>
                            </el-col>
                            <el-col :span="24">
                                <el-form-item label="备注说明：">
                                    <el-input v-model="form.remark" type="textarea" rows="2"></el-input>
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
            labelType: 'add',
            rules: {},
            total: 0,
            queryInfo: {
                pageSize: 100,
                pageCount: 1,
                currPage: 1,
                condition: {
                    orderType: 2,
                    orderStateList: [2,3]
                }
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
        linkStaff(row) {
            // 弹窗展示送餐员姓名+电话
            this.$alert(`送餐员：${row.staffName || '暂无'}<br>联系电话：${row.staffLinkTel || '无'}`, '送餐员联系方式', {
                dangerouslyUseHTMLString: true
            })
        },

        // 监听表格高度
        getHeight() {
            this.height = window.innerHeight - this.headerHeight - 256;
        },

        //获取数据
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

        // 保存
        handleSave() {
            var that = this;
            that.$http.post("/insCanteenOrderInfo/save", that.form).then(function (response) {
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

        //完成送餐
        handleComplete(id) {
            var that = this;
            let pamars = {
                id: id,
                orderState: 4,
                serviceEndTime: new Date().toISOString()
            }

            that.$http.post("/insCanteenOrderInfo/save", pamars).then(function (response) {
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
}</style>

