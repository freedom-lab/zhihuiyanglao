<template>
  <el-dialog :title="Object.keys(buildAddForm).length === 0 ? '新增楼栋' : '编辑楼栋'" :visible.sync="visible" width="60%"
    :close-on-click-modal="false" append-to-body>
    <el-form :ref="buildAddFormRef" :model="buildAddForm" label-width="140px">
      <!-- 第一行：左右分栏（左3个输入框竖排 + 右图片） -->
      <el-row :gutter="24" align="flex-start">
        <el-col :span="12">
          <el-form-item label="楼栋:" required>
            <el-input v-model="buildAddForm.buildingName" placeholder="请输入 楼栋" />
          </el-form-item>
          <el-form-item label="楼层总数:" required>
            <el-input v-model="buildAddForm.floorNum" placeholder="请输入 楼层总数" />
          </el-form-item>
          <el-form-item label="定位数据楼栋id:">
            <el-input v-model="buildAddForm.indoorPositioningId" placeholder="请输入 定位数据楼栋id" />
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="楼栋照片:">
            <el-upload class="avatar-uploader" :action="$uploadURL" list-type="picture-card" :show-file-list="false"
              :on-success="function (response, file) { return handleUploadSuccess(response, file, '1') }"
              :before-upload="beforeUpload">
              <img v-if="imgPath" :src="imgPath" class="avatar" style="width: 100%; height: 100%; object-fit: cover;" />
              <i v-else class="el-icon-plus"></i>
            </el-upload>
          </el-form-item>
        </el-col>
      </el-row>

      <el-row :gutter="24">
        <el-col :span="12">
          <el-form-item label="定位地图楼栋id:">
            <el-input v-model="buildAddForm.indoorMapId" placeholder="请输入 定位地图楼栋id" />
          </el-form-item>
        </el-col>
      </el-row>

      <el-row :gutter="24">
        <el-col :span="12">
          <el-form-item label="室内吸顶信标数量:">
            <el-input v-model="buildAddForm.indoorCeilingNum" placeholder="请输入 室内吸顶信标数量" />
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="室外地面信标数量:">
            <el-input v-model="buildAddForm.indoorGroundNum" placeholder="请输入 室外地面信标数量" />
          </el-form-item>
        </el-col>
      </el-row>

      <el-row :gutter="24">
        <el-col :span="12">
          <el-form-item label="排序:">
            <el-input v-model="buildAddForm.sortNum" placeholder="请输入 排序" />
          </el-form-item>
        </el-col>
      </el-row>

      <el-form-item label="备注:">
        <el-input v-model="buildAddForm.remark" type="textarea" rows="3" placeholder="请输入 备注" maxlength="100"
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
    editData: { type: Object, default: () => ({}) }
  },
  data() {
    return {
      buildAddFormRef: null,
      buildAddForm: {},
      imgPath: '',
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
      this.imgPath = this.editData.imgPath
      this.buildAddForm = this.editData
    },
    //取消
    cancelClose() {
      this.$emit('update:visible', false)
    },
    //图片上传成功
    handleUploadSuccess(res, file, type) {
      console.log(file);
      if (type == 1) {
        this.imgPath = file.response.data.url;
        this.buildAddForm.imgPath = file.response.data.url;
      } else {
        this.buildAddForm.imgPath = file.response.data.url;
      }
    },
    //上传图片之前
    beforeUpload(file) {
      // 可按需校验图片类型或大小
      // return true
    },
    // 提交保存
    submitAdd() {
      if (!this.buildAddForm.buildingName) {
        this.$message.warning("请输入楼栋")
        return
      }
      if (!this.buildAddForm.floorNum) {
        this.$message.warning("请输入楼层总数")
        return
      }

      this.$http.post("insBaseBuildingInfo/save", this.buildAddForm).then((res) => {
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

<style scoped>
.avatar {
  width: 100px;
  height: 100px;
}

.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9;
  border-radius: 6px;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}

.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 100px;
  height: 100px;
  line-height: 100px;
  text-align: center;
}
</style>