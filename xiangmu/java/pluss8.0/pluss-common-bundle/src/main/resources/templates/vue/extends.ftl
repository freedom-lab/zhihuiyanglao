<template>
    <div class="p1" id="a3">
        <div class="header-search">
            <div class="title">
                <el-row>
                    <el-col :span="12">
                        <span class="line"></span>
                        扩展属性
                    </el-col>
                    <el-col :span="12">
                        <div class="flex align-center justify-end h50">
                        </div>
                    </el-col>
                </el-row>
            </div>
        </div>
        <div class="header-input">
            <div class="model-mask">
                <div
                        class="header-search-box flex align-center justify-end mt20"
                >
                    <el-form :inline="true">
                        <el-form-item>
                            <el-input
                                    placeholder="下级员工|AD|汇报范围|上级员工|AD|汇报范围 "
                                    prefix-icon="el-icon-search"
                            >
                                <el-button
                                        slot="append"
                                        icon="el-icon-search"
                                ></el-button>
                            </el-input>
                        </el-form-item>
                        <el-button
                                type="primary"
                                size="small"
                                plain
                                class="is-circle"
                        ><i class="el-icon-plus fw900 f16"></i
                            ></el-button>
                    </el-form>
                </div>


                <!-- 表格 -->
                <!-- 用户列表区域 -->
                <el-table
                        :data="tableData"
                        border
                        fit
                        height="240px"
                        highlight-current-row
                        style="width: 100%"
                >
                    <el-table-column label="姓名" align="center">
                        <template slot-scope="scope">
                            <span>{{ scope.row.familyName }}{{ scope.row.name }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="AD" prop="ad" sortable="custom" align="center">
                        <template slot-scope="scope">
                            <span>{{ scope.row.ad }}</span>
                        </template>
                    </el-table-column>
                    <el-table-column
                            label="员工账号"
                            prop="loginName"
                            sortable="custom"
                            align="center"
                    >
                        <template slot-scope="scope">
                            <span>{{ scope.row.loginName }}</span>
                        </template>
                    </el-table-column>

                    <el-table-column
                            label="邮箱"
                            prop="email"
                            sortable="custom"
                            align="center"
                    >
                        <template slot-scope="scope">
                            <span>{{ scope.row.email }}</span>
                        </template>
                    </el-table-column>

                    <el-table-column
                            label="状态"
                            prop="status"
                            sortable="custom"
                            align="center"
                    >
                        <template slot-scope="scope">
            <span>{{
              scope.row.status == "1"
                ? "在职"
                : scope.row.status == "2"
                ? "离职"
                : scope.row.status == "3"
                ? "产期休假"
                : scope.row.status == "4"
                ? "代理"
                : scope.row.status == "5"
                ? "供应商"
                : "外部"
            }}</span>
                        </template>
                    </el-table-column>

                    <el-table-column
                            label="操作"
                            align="center"
                            class-name="small-padding fixed-width"
                    >
                        <template slot-scope="scope">
                            <el-tooltip
                                    class="item"
                                    effect="dark"
                                    content="删除"
                                    placement="bottom"
                            >
                                <i
                                        class="el-icon-delete textblue f16 ml20"
                                        @click="del(scope.row.id)"
                                ></i>
                            </el-tooltip>
                            <el-tooltip
                                    class="item"
                                    effect="dark"
                                    content="重置密码"
                                    placement="bottom"
                            >
                                <i class="el-icon-lock textblue f16 ml20" @click="reset(1)"></i>
                            </el-tooltip>
                        </template>
                    </el-table-column>
                </el-table>

            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
              tableData: [],
        }
    },

}
</script>