<template>
    <div class="page-content">
        <div style="margin-left: 10px;display: flex;justify-content: space-between;">
            <el-button type="primary" @click="newAddCost" size="small">新增</el-button>
            <el-button type="primary" @click="newAddCostItem" size="small" style="margin-right: 10px;">新增</el-button>
        </div>

        <div class="content-container">
            <div class="panel left-panel">
                <el-table border ref="table" :data="tableData1" tooltip-effect="dark" style="width: 100%"
                    :header-cell-style="{
                        backgroundColor: '#fafafa',
                        color: '#333',
                        fontWeight: 'bold',
                        fontSize: '14px',
                    }" highlight-current-row @current-change="handleChange">
                    <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>
                    <el-table-column label="费用名称" align="center" min-width="60">
                        <template slot-scope="scope">{{ scope.row.costName }}</template>
                    </el-table-column>
                    <el-table-column label="操作" width="150" align="center" fixed="right">
                        <template slot-scope="scope">
                            <!-- <el-button class="btn-no-border" icon="el-icon-plus" size="mini" circle
                                @click.native.stop="newAddCostItem(scope.row)"></el-button> -->
                            <el-button class="btn-no-border" icon="el-icon-edit" size="mini" circle
                                @click.native.stop="editCost(scope.row)"></el-button>
                            <el-button class="btn-no-border" icon="el-icon-delete" size="mini" circle
                                @click.native.stop="deleteCost(scope.row)"></el-button>
                        </template>
                    </el-table-column>
                </el-table>

                <!-- 分页 -->
                <div class="block" style="margin-top: 10px;">
                    <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
                        :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]"
                        :page-size="queryInfo.pageSize" layout="total, sizes, prev, pager, next, jumper" :total="total">
                    </el-pagination>
                </div>
            </div>

            <div class="panel right-panel">
                <el-table border ref="table" :data="tableData2" tooltip-effect="dark" style="width: 100%"
                    :header-cell-style="{
                        backgroundColor: '#fafafa',
                        color: '#333',
                        fontWeight: 'bold',
                        fontSize: '14px',
                    }">
                    <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

                    <el-table-column label="项目名称" width="130" align="center" show-overflow-tooltip>
                        <template slot-scope="scope">{{ scope.row.itemName || '-' }}</template>
                    </el-table-column>
                    <el-table-column label="日价格" width="140" align="center" show-overflow-tooltip>
                        <template slot-scope="scope">{{ scope.row.itemDayPrice || '-' }}</template>
                    </el-table-column>
                    <el-table-column label="月价格" width="140" align="center" show-overflow-tooltip>
                        <template slot-scope="scope">{{ scope.row.itemMonthPrice || '-' }}</template>
                    </el-table-column>
                    <el-table-column label="对应能力评估等级" width="160" align="center" show-overflow-tooltip>
                        <template slot-scope="scope">{{ scope.row.abilityLevel || '-' }}</template>
                    </el-table-column>
                    <!-- 操作列 -->
                    <el-table-column label="操作" width="110" align="center" fixed="right">
                        <template slot-scope="scope">
                            <el-button class="btn-no-border" icon="el-icon-edit" size="mini" circle
                                @click.native.stop="editCostItem(scope.row)"></el-button>
                            <el-button class="btn-no-border" icon="el-icon-delete" size="mini" circle
                                @click.native.stop="deleteCostItem(scope.row)"></el-button>
                        </template>
                    </el-table-column>
                </el-table>

                <!-- 分页 -->
                <div class="block" style="margin-top: 10px;">
                    <el-pagination @size-change="handleSizeChange2" @current-change="handleCurrentChange2"
                        :current-page="queryInfo2.currPage" :page-sizes="[100, 200, 300, 400]"
                        :page-size="queryInfo2.pageSize" layout="total, sizes, prev, pager, next, jumper"
                        :total="total2">
                    </el-pagination>
                </div>
            </div>
        </div>


        <!-- 新增、编辑  费用弹窗 -->
        <el-dialog :title="labelCostType === 'add' ? '新增费用' : '编辑费用'" :visible.sync="costDialogVisible" width="40%"
            :model="costData" :close-on-click-modal="false" append-to-body>
            <el-form label-width="140px">
                <el-row :gutter="24" align="flex-start">
                    <el-col :span="15">
                        <el-form-item label="费用名称:" required>
                            <el-input v-model="costData.costName" placeholder="请输入 费用名称" style="width:100%" />
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-form-item label="备注">
                    <el-input v-model="costData.remark" type="textarea" rows="3" placeholder="请输入 备注" maxlength="100"
                        show-word-limit />
                </el-form-item>
            </el-form>

            <div class="dialog-footer" style="text-align: right;">
                <el-button type="primary" @click="submitSaveCost"><i class="el-icon-check"></i> 保存</el-button>
                <el-button @click="costDialogVisible = false" clear>
                    <i class="el-icon-circle-close"></i> 取消
                </el-button>
            </div>
        </el-dialog>


        <!-- 新增、编辑  费用明细弹窗 -->
        <el-dialog :title="labelCostItemType === 'add' ? '新增费用明细' : '编辑费用明细'" :visible.sync="costItemDialogVisible"
            width="60%" :model="costItemFormData" :close-on-click-modal="false" append-to-body>
            <el-form label-width="140px">
                <el-row :gutter="24" align="flex-start">
                    <el-col :span="12">
                        <el-form-item label="项目名称:" required>
                            <el-input v-model="costItemFormData.itemName" placeholder="请输入 费用名称" style="width:100%" />
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="日价格:" required>
                            <el-input v-model="costItemFormData.itemDayPrice" placeholder="请输入 日价格" style="width:100%">
                                <template #append>
                                    <span style="background:#f5f7fa; padding:0; height:100%; display:flex; 
                                        align-items:center; color:#606266;">元/日</span>
                                </template>
                            </el-input>
                        </el-form-item>
                    </el-col>
                </el-row>

                <el-row :gutter="24" align="flex-start">
                    <el-col :span="12">
                        <el-form-item label="月价格:" required>
                            <el-input v-model="costItemFormData.itemMonthPrice" placeholder="请输入 月价格"
                                style="width:100%">
                                <template #append>
                                    <span style="background:#f5f7fa; padding:0; height:100%; display:flex; 
                                        align-items:center; color:#606266;">元/月</span>
                                </template>
                            </el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="对应能力评估等级:">
                            <el-input v-model="costItemFormData.abilityLevel" placeholder="请输入 对应能力评估等级"
                                style="width:100%">
                            </el-input>
                        </el-form-item>
                    </el-col>
                </el-row>

                <el-form-item label="备注">
                    <el-input v-model="costItemFormData.remark" type="textarea" rows="3" placeholder="请输入 备注"
                        maxlength="100" show-word-limit />
                </el-form-item>
            </el-form>
            <div class="dialog-footer" style="text-align: right;">
                <el-button type="primary" @click="submitSaveCostItem"><i class="el-icon-check"></i> 保存</el-button>
                <el-button @click="costItemDialogVisible = false" clear>
                    <i class="el-icon-circle-close"></i> 取消
                </el-button>
            </div>
        </el-dialog>


    </div>
</template>

<script>
export default {
    data() {
        return {
            tableData1: [],
            tableData2: [],
            queryInfo: {
                currPage: 1,
                pageSize: 100,
            },
            total: 0,
            queryInfo2: {
                currPage: 1,
                pageSize: 100,
                condition: {
                    costId: ''
                }
            },
            total2: 0,
            //费用
            costDialogVisible: false,
            labelCostType: 'add',
            costData: {},
            costId: '',
            //费用明细
            costItemDialogVisible: false,
            labelCostItemType: 'add',
            costItemFormData: {},
        };
    },

    created() {
        this.getInsBaseCost()
    },

    methods: {
        // 获取费用类别数据
        getInsBaseCost() {
            this.$http.post("insBaseCostInfo/list", this.queryInfo).then((response) => {
                console.log(response.data.data);
                if (response.data.code == 200) {
                    this.tableData1 = response.data.data.data || []
                    this.total = response.data.data.count || 0
                    this.queryInfo.currPage = response.data.data.currPage || 1
                }
            });
        },

        // 获取费用明细/合同数据
        getInsBaseCostItem() {
            this.$http.post("insBaseCostItemInfo/list", this.queryInfo2).then((response) => {
                console.log(response.data.data);
                if (response.data.code == 200) {
                    this.tableData2 = response.data.data.data || []
                    this.total2 = response.data.data.count || 0
                    this.queryInfo2.currPage = response.data.data.currPage || 1
                }
            });
        },

        // 修改页数大小
        handleSizeChange(val) {
            this.queryInfo.pageSize = val
            this.getInsBaseCost()
        },

        // 获取当前页面
        handleCurrentChange(val) {
            this.queryInfo.currPage = val
            this.getInsBaseCost()
        },

        handleChange(val) {
            this.queryInfo2.condition.costId = val.id
            this.costId = val.id
            this.getInsBaseCostItem()
        },

        // 修改页数大小
        handleSizeChange2(val) {
            this.queryInfo2.pageSize = val
            this.getInsBaseCostItem()
        },

        // 获取当前页面
        handleCurrentChange2(val) {
            this.queryInfo2.currPage = val
            this.getInsBaseCostItem()
        },

        //打开 费用弹窗
        newAddCost() {
            this.costData = {}
            this.labelCostType = 'add'
            this.costDialogVisible = true
        },

        //编辑 费用弹窗
        editCost(row) {
            this.costData = row
            this.labelCostType = 'edit'
            this.costDialogVisible = true
        },

        //删除 费用
        deleteCost(row) {
            this.$confirm('确定删除此费用?', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning',
                closeOnClickModal: false,
            }).then(async () => {
                this.$http.post("insBaseCostInfo/delete", { id: row.id }).then((res) => {
                    if (200 == res.data.code) {
                        this.$message.success('删除成功');
                        this.getInsBaseCost()
                    }
                })
            }).catch(() => {

            })
        },

        //保存费用
        submitSaveCost() {
            if (!this.costData.costName) {
                this.$message.warning("请输入费用名称")
                return
            }
            this.$http.post("insBaseCostInfo/save", this.costData).then((res) => {
                if (200 == res.data.code) {
                    this.$message.success('保存成功')
                    this.costDialogVisible = false
                    this.getInsBaseCost()
                } else {
                    this.$message.error(res.data.message)
                }
            })
        },

        //打开 费用类别 弹窗
        newAddCostItem() {
            if (!this.costId) {
                this.$message.warning('请选择费用')
                return
            }
            this.costItemFormData = {
                costId: this.costId
            }
            this.labelCostItemType = 'add'
            this.costItemDialogVisible = true
        },

        //编辑  费用类别弹窗
        editCostItem(row) {
            this.costItemFormData = row
            this.labelCostItemType = 'edit'
            this.costItemDialogVisible = true
        },

        //删除费用类别
        deleteCostItem(row) {
            this.$confirm('确定删除此费用明细?', '提示', {
                confirmButtonText: '确定',
                cancelButtonText: '取消',
                type: 'warning',
                closeOnClickModal: false,
            }).then(async () => {
                this.$http.post("insBaseCostItemInfo/delete", { id: row.id }).then((res) => {
                    if (200 == res.data.code) {
                        this.$message.success('删除成功');
                        this.getInsBaseCostItem()
                    }
                })
            }).catch(() => {

            })
        },

        //保存 费用类别
        submitSaveCostItem() {
            if (!this.costItemFormData.itemName) {
                this.$message.warning("请输入项目名称")
                return
            }
            if (!this.costItemFormData.itemDayPrice) {
                this.$message.warning("请输入日价格")
                return
            }
            if (!this.costItemFormData.itemMonthPrice) {
                this.$message.warning("请输入月价格")
                return
            }

            this.$http.post("insBaseCostItemInfo/save", this.costItemFormData).then((res) => {
                if (200 == res.data.code) {
                    this.$message.success('保存成功')
                    this.costItemDialogVisible = false
                    this.getInsBaseCostItem()
                } else {
                    this.$message.error(res.data.message)
                }
            })
        }
    },
};
</script>

<style lang="less" scoped>
.page-content {
    width: 100%;
    height: calc(100vh - 120px);
    padding: 8px;
    background: #fff;
}

.content-container {
    display: flex;
    flex-wrap: nowrap;
    gap: 8px;
    width: 100%;
    box-sizing: border-box;
    background-color: white;
    overflow-x: auto;
}

.panel {
    box-sizing: border-box;
    display: flex;
    padding: 7px;
    flex-direction: column;
    overflow: hidden;
    background: #fff;
}

.left-panel {
    flex: 1;
}

.right-panel {
    flex: 1.5;
}

:deep(.btn-no-border.el-button--mini.is-circle) {
    border: none;
    background: transparent;
}

:deep(.btn-no-border.el-button--mini.is-circle i) {
    color: #409EFF;
}
</style>
