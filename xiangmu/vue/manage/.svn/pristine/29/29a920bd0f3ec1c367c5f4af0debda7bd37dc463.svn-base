<template>
    <el-dialog :title="Object.keys(roomAddForm).length === 0 ? '新增房间' : '编辑房间'" :visible.sync="visible" width="60%"
        :close-on-click-modal="false" append-to-body>
        <el-form :ref="roomAddFormRef" :model="roomAddForm" label-width="140px">
            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="房间名称:" required>
                        <el-input v-model="roomAddForm.roomName" placeholder="请输入 房间名称" style="width:100%" />
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item label="房间面积(m²):" required>
                        <el-input v-model="roomAddForm.roomArea" placeholder="请输入 房间面积(m²)" style="width:100%">
                            <template #append>
                                <span
                                    style="background:#f5f7fa; padding:0; height:100%; display:flex; align-items:center; color:#606266;">m²</span>
                            </template>
                        </el-input>
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="房间类型:" required>
                        <el-select v-model="roomAddForm.roomType" placeholder="请选择 房间类型" clearable collapse-tags
                            style="width:100%">
                            <el-option label="单人间" value="1" />
                            <el-option label="两人间" value="2" />
                            <el-option label="三人间" value="3" />
                            <el-option label="四人间" value="4" />
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item label="房间朝向:">
                        <el-select v-model="roomAddForm.roomOrientation" placeholder="请选择 房间朝向" clearable collapse-tags
                            style="width:100%">
                            <el-option label="东" value="1" />
                            <el-option label="西" value="2" />
                            <el-option label="南" value="3" />
                            <el-option label="北" value="4" />
                        </el-select>
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="采光情况:">
                        <el-select v-model="roomAddForm.roomLighted" placeholder="请选择 采光情况" clearable collapse-tags
                            style="width:100%">
                            <el-option label="较好" value="1" />
                            <el-option label="一般" value="2" />
                            <el-option label="较差" value="3" />
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item label="通风情况:">
                        <el-select v-model="roomAddForm.roomAirness" placeholder="请选择 通风情况" clearable collapse-tags
                            style="width:100%">
                            <el-option label="较好" value="1" />
                            <el-option label="一般" value="2" />
                            <el-option label="较差" value="3" />
                        </el-select>
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24">
                <el-col :span="12">
                    <el-form-item label="排序" required>
                        <el-input v-model="roomAddForm.sortNum" placeholder="请输入 排序" style="width:100%" />
                    </el-form-item>
                </el-col>
            </el-row>

            <el-form-item label="备注">
                <el-input v-model="roomAddForm.remark" type="textarea" rows="3" placeholder="请输入 备注" maxlength="100"
                    show-word-limit />
            </el-form-item>
        </el-form>
        <div class="dialog-footer" style="text-align: right;">
            <el-button type="primary" @click="submitAdd">
                <i class="el-icon-circle-plus-outline"></i> 保存
            </el-button>
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
        editData: { type: Object, default: () => ({}) }
    },
    data() {
        return {
            roomAddFormRef: null,
            roomAddForm: {},
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
            this.roomAddForm = this.editData
        },
        //取消
        cancelClose() {
            this.$emit('update:visible', false)
        },
        //提交
        submitAdd() {
            if (!this.roomAddForm.roomName) {
                this.$message.warning("请输入房间名称")
                return
            }
            if (!this.roomAddForm.roomArea) {
                this.$message.warning("请输入房间面积")
                return
            }
            if (!this.roomAddForm.roomType) {
                this.$message.warning("请选择房间类型")
                return
            }
            if (!this.roomAddForm.sortNum) {
                this.$message.warning("请输入排序")
                return
            }
            if (this.selectBuildingId) {
                this.roomAddForm.buildingId = this.selectBuildingId
            }
            if (this.selectFloorId) {
                this.roomAddForm.floorId = this.selectFloorId
            }

            this.$http.post("insBaseRoomInfo/save", this.roomAddForm).then((res) => {
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