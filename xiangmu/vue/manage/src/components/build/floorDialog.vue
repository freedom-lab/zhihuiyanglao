<template>
    <el-dialog :title="Object.keys(floorForm).length === 0 ? '新增楼层' : '编辑楼层'" :visible.sync="visible" width="60%"
        :close-on-click-modal="false" append-to-body>
        <el-form :ref="floorFormRef" :model="floorForm" label-width="140px">
            <!-- 第一行：左右分栏（左3个输入框竖排 + 右图片） -->
            <el-row :gutter="24" align="flex-start">
                <el-col :span="12">
                    <el-form-item label="楼层名称:" required>
                        <el-input v-model="floorForm.floorName" placeholder="请输入 楼栋" />
                    </el-form-item>
                    <el-form-item label="房间数:" required>
                        <el-input v-model="floorForm.roomNum" placeholder="请输入 楼层总数" />
                    </el-form-item>
                </el-col>
            </el-row>

            <el-row :gutter="24">
                <el-col :span="12">
                    <el-form-item label="排序:">
                        <el-input v-model="floorForm.sortNum" placeholder="请输入 排序" />
                    </el-form-item>
                </el-col>
            </el-row>

            <el-form-item label="备注:">
                <el-input v-model="floorForm.remark" type="textarea" rows="3" placeholder="请输入 备注" maxlength="100"
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
        buildId: { type: String, default: '' },
        editData: { type: Object, default: () => ({}) }
    },
    data() {
        return {
            floorFormRef: null,
            floorForm: {},
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
            this.floorForm = this.editData
        },
        //取消
        cancelClose() {
            this.$emit('update:visible', false)
        },
        // 提交保存
        submitAdd() {
            if (!this.floorForm.floorName) {
                this.$message.warning("请输入楼层名称")
                return
            }
            if (!this.floorForm.roomNum) {
                this.$message.warning("请输入房间数")
                return
            }
            if (this.buildId) {
                this.floorForm.buildingId = this.buildId
            }

            this.$http.post("insBaseFloorInfo/save", this.floorForm).then((res) => {
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