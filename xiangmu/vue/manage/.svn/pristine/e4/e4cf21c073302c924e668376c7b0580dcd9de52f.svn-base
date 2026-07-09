<template>
    <div style="padding:16px">

        <!-- 头部部分 -->
        <div ref="search_d">
            <el-row type="flex" class="row-bg" justify="space-around">
                <el-col :span="18">
                    <div class="dialog-title">
                        <span class="line">▎</span>
                        <span>老人生日提醒</span>
                    </div>
                </el-col>
                <el-col :span="6">
                    <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select"
                        clearable>
                        <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
                    </el-input>
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
                <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

                <!-- 核心基础信息 -->
                <el-table-column label="老人姓名" align="center" min-width="80">
                    <template slot-scope="scope">{{ scope.row.elderName }}</template>
                </el-table-column>
                <el-table-column label="生日" align="center" min-width="180">
                    <template slot-scope="scope">
                        {{ scope.row.birthday ? scope.row.birthday.slice(0, 10) : '' }}
                    </template>
                </el-table-column>
                <el-table-column label="社保卡号" align="center" min-width="180">
                    <template slot-scope="scope">{{ scope.row.socialCardNo }}</template>
                </el-table-column>
                <el-table-column label="身份证号" align="center" min-width="180">
                    <template slot-scope="scope">{{ scope.row.idCard }}</template>
                </el-table-column>
                <el-table-column label="联系电话" align="center" min-width="120">
                    <template slot-scope="scope">{{ scope.row.linkTel }}</template>
                </el-table-column>
                <el-table-column label="性别" align="center" min-width="60">
                    <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
                </el-table-column>
                <el-table-column label="年龄" align="center" min-width="60">
                    <template slot-scope="scope">{{ scope.row.age }}</template>
                </el-table-column>
                <el-table-column label="服务状态(0停止服务1正常服务)" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.elderState == 0 ? '停止服务' : '正常服务' }}</template>
                </el-table-column>
                <el-table-column label="监护人姓名" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.guardianContact }}</template>
                </el-table-column>
                <el-table-column label="监护人电话" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.guardianContactTel }}</template>
                </el-table-column>
                <el-table-column label="与老人关系代码" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.guardianContactRelationship }}</template>
                </el-table-column>
                <el-table-column label="监护人地址" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.guardianContactAddress }}</template>
                </el-table-column>
                <el-table-column label="备注" align="center" min-width="90">
                    <template slot-scope="scope">{{ scope.row.remark }}</template>
                </el-table-column>

                <!-- 操作列 -->
                <el-table-column label="操作" width="110" align="center" fixed="right">
                    <template slot-scope="scope">
                        <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">详情</el-button>
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

        <el-dialog title="编辑社保卡" :visible.sync="showDialog" width="800px">
            <el-form ref="form" :model="form" :rules="rules" label-width="120px">
                <el-row :gutter="10">
                    <el-col :span="12">
                        <el-form-item label="老人姓名：" prop="siteName">
                            <span>{{ form.elderName }}</span>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="联系电话：" prop="siteName">
                            <span>{{ form.linkTel }}</span>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="身份证号：" prop="siteName">
                            <span>{{ form.idCard }}</span>
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
                condition: {
                    checkStep: 3
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
        // 监听表格高度
        getHeight() {
            this.height = window.innerHeight - this.headerHeight - 256;
        },

        //获取数据
        getList() {
            var that = this;
            that.loading = true
            that.$http.post("/elderBaseInfo/list", that.queryInfo).then(function (response) {
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
            that.$http.post("/elderBaseInfo/save", that.form).then(function (response) {
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

        // 删除用户
        async handleDelte(id) {
            const confirmResult = await this.$confirm("确定删除吗?", "提示", {
                confirmButtonText: "确定",
                cancelButtonText: "取消",
                type: "warning",
            }).catch((err) => err);
            if (confirmResult === "confirm") {
                var that = this;
                that.$http.post("/elderBaseInfo/delete", { "id": id }).then(function (response) {
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

.row-bg {
    display: flex;
    align-items: center;
}
</style>

