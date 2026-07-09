<template>
    <div style="padding:16px">

        <!-- 头部部分 -->
        <div ref="search_d">
            <el-row type="flex" class="row-bg" justify="space-around">
                <el-col :span="18">
                    <el-button type="primary" @click="newBtn">新建</el-button>
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

                <el-table-column label="楼栋" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">#{{ scope.row.buildingName }}</template>
                </el-table-column>

                <el-table-column label="楼层数" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">#{{ scope.row.floorNum }}</template>
                </el-table-column>

                <el-table-column label="房间数" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.roomNum }}</template>
                </el-table-column>

                <el-table-column label="床位数" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.bedNum }}</template>
                </el-table-column>

                <el-table-column label="入住数" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.occupancyNum }}</template>
                </el-table-column>

                <el-table-column label="床位空置率" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">
                        {{ scope.row.bedNum && scope.row.bedNum > 0 ? ((scope.row.bedNum - scope.row.occupancyNum) /
                            scope.row.bedNum * 100).toFixed(2) + '%' : '-' }}
                    </template>
                </el-table-column>

                <el-table-column label="备注" min-width="100" align="center" show-overflow-tooltip>
                    <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
                </el-table-column>

                <el-table-column label="操作" width="100" align="center" fixed="right">
                    <template slot-scope="scope">
                        <el-button type="text" @click="detail(scope.row)" size="small">详情</el-button>
                    </template>
                </el-table-column>
            </el-table>
            <!-- 分页 -->
            <div class="block">
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
                    <el-form ref="form" :model="form" :rules="rules" label-width="120px">
                    <el-col :span="12">
                        <el-form-item label="楼栋名称：" prop="buildingName">
                            <el-input v-model="form.buildingName" placeholder="请输入楼栋名称" readonly></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="楼层名称：" prop="floorName">
                            <el-input v-model="form.floorName" placeholder="请输入楼层名称" readonly></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="房间数：" prop="roomNum">
                            <el-input v-model="form.roomNum" placeholder="请输入房间数量" readonly></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="床位数：" prop="bedNum">
                            <el-input v-model="form.bedNum" placeholder="请输入床位总数" readonly></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="入住数：" prop="occupancyNum">
                            <el-input v-model="form.occupancyNum" placeholder="请输入当前入住数量" readonly></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="24">
                        <el-form-item label="备注：" prop="remark">
                            <el-input v-model="form.remark" type="textarea" rows="2" placeholder="填写补充说明"
                                readonly></el-input>
                        </el-form-item>
                    </el-col>
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
                condition: {}
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
            that.$http.post("/insBaseBuildingInfo/list", that.queryInfo).then(function (response) {
                console.log(response.data.data);
                if (response.data.code == 200) {
                    that.loading = false
                    that.total = response.data.data.count;
                    that.queryInfo.currPage = response.data.data.currPage
                    that.tableData = response.data.data.data;
                }
            });
        },

        detail(row) {
            this.showDialog = true;
            this.labelType = 'edit'
            this.form = JSON.parse(JSON.stringify(row))
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
</style>

