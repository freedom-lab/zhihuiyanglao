<template>
    <el-dialog :title="Object.keys(bedAddForm).length === 0 ? '新增床位' : '编辑床位'" :visible.sync="visible" width="60%"
        :close-on-click-modal="false" append-to-body>
        <el-form :ref="bedAddFormRef" :model="bedAddForm" label-width="140px">
            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="床位名称:" required>
                        <el-input v-model="bedAddForm.bedName" placeholder="请输入 房间名称" style="width:100%" />
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item label="床位类型:" required>
                        <el-select v-model="bedAddForm.bedType" placeholder="请选择 床位类型" clearable collapse-tags
                            style="width:100%">
                            <el-option label="普通床位" value="1" />
                            <el-option label="护理床位" value="2" />
                            <el-option label="医疗床位" value="3" />
                        </el-select>
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="床位日价格:" required>
                        <el-input v-model="bedAddForm.bedDayPrice" placeholder="请输入 床位日价格" style="width:100%">
                            <template #append>
                                <span
                                    style="background:#f5f7fa; padding:0; height:100%; display:flex; align-items:center; color:#606266;">元/日</span>
                            </template>
                        </el-input>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item label="床位月价格:" required>
                        <el-input v-model="bedAddForm.bedMonthPrice" placeholder="请输入 床位月价格" style="width:100%">
                            <template #append>
                                <span
                                    style="background:#f5f7fa; padding:0; height:100%; display:flex; align-items:center; color:#606266;">元/月</span>
                            </template>
                        </el-input>
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24">
                <el-col :span="12">
                    <el-form-item label="排序" required>
                        <el-input v-model="bedAddForm.sortNum" placeholder="请输入 排序" style="width:100%" />
                    </el-form-item>
                </el-col>
            </el-row>

            <el-form-item label="备注">
                <el-input v-model="bedAddForm.remark" type="textarea" rows="3" placeholder="请输入 备注" maxlength="100"
                    show-word-limit />
            </el-form-item>
        </el-form>
        <div class="dialog-footer" style="text-align: right;">
            <el-button type="primary" @click="submitAdd"><i class="el-icon-check"></i> 保存</el-button>
            <el-button @click="cancelClose" clear>
                <i class="el-icon-circle-close"></i> 取消
            </el-button>
        </div>
    </el-dialog>
</template>

<script>
export default {
    props: {
        visible: { type: Boolean, default: false },
        selectBuildingId: { type: String, default: '' },
        selectFloorId: { type: String, default: '' },
        selectRoomId: { type: String, default: '' },
        editData: { type: Object, default: () => ({}) }
    },
    data() {
        return {
            bedAddFormRef: null,
            bedAddForm: {},
        }
    },
    watch: {
        editData: {
            handler() {
                if (this.editData) {
                    this.showData()
                }
            },
            deep: true
        },
    },
    methods: {
        showData() {
            console.log('房间id', this.selectRoomId)
            this.bedAddForm = this.editData
        },
        cancelClose() {
            this.$emit('update:visible', false)
        },
        //提交
        submitAdd() {
            if (!this.bedAddForm.bedName) {
                this.$message.warning("请输入床位名称")
                return
            }
            if (!this.bedAddForm.bedType) {
                this.$message.warning("请选择床位类型")
                return
            }
            if (!this.bedAddForm.bedDayPrice) {
                this.$message.warning("请输入床位日价格")
                return
            }
            if (!this.bedAddForm.bedMonthPrice) {
                this.$message.warning("请输入床位月价格")
                return
            }
            if (!this.bedAddForm.sortNum) {
                this.$message.warning("请输入排序")
                return
            }
            if (this.selectBuildingId) {
                this.bedAddForm.buildingId = this.selectBuildingId
            }
            if (this.selectFloorId) {
                this.bedAddForm.floorId = this.selectFloorId
            }
            if (this.selectRoomId) {
                this.bedAddForm.roomId = this.selectRoomId
            }

            this.$http.post("insBaseBedInfo/save", this.bedAddForm).then((res) => {
                if (200 == res.data.code) {
                    this.$message.success("保存成功")
                    this.$emit('submited')
                    this.cancelClose()
                } else {
                    this.$message.warning(res.data.message)
                }
            })
        },
    },
}
</script>

<style scoped></style>