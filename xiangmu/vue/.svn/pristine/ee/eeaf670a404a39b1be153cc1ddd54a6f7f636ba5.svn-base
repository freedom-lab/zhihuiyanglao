<template>
  <div class="detail" v-loading="loading">
    <!-- 基本信息 -->
    <div class="base">
      <el-form
        :model="ruleForm"
        :rules="rules"
        ref="ruleForm"
        label-width="100px"
        class="demo-ruleForm"
      >
        <el-row class="row">
          <el-col :span="8">
            <el-form-item label="表名" prop="name" required>
              <el-input v-model="ruleForm.name"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="8">
            <el-form-item label="表描述" prop="description" required>
              <el-input v-model="ruleForm.description"></el-input>
            </el-form-item>
          </el-col>

          <el-col :span="8">
            <el-form-item label="表类型" prop="type">
              <el-select
                v-model="ruleForm.type"
                placeholder="请选择表类型"
                style="width:100%"
              >
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
        </el-row>
        <el-row class="row">
          <el-col :span="8">
            <el-form-item label="表单分类" prop="classify">
              <el-select v-model="ruleForm.classify" style="width:100%">
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
          <el-col :span="8">
            <el-form-item label="主键策略" prop="strategy">
              <el-select v-model="ruleForm.strategy" style="width:100%">
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
          <el-col :span="8">
            <el-form-item label="显示复选框" prop="checkbox">
              <el-select v-model="ruleForm.checkbox" style="width:100%">
                <el-option label="是" value="shanghai"></el-option>
                <el-option label="否" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
        </el-row>
        <el-row class="row">
          <el-col :span="8">
            <el-form-item label="主题模板" prop="topic">
              <el-select v-model="ruleForm.topic" style="width:100%" disabled>
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
          <el-col :span="8">
            <el-form-item label="表单风格" prop="style">
              <el-select v-model="ruleForm.style" style="width:100%">
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
          <el-col :span="8">
            <el-form-item label="滚动条" prop="scroll">
              <el-select v-model="ruleForm.scroll" style="width:100%">
                <el-option label="是" value="shanghai"></el-option>
                <el-option label="否" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
        </el-row>
        <el-row class="row">
          <el-col :span="8">
            <el-form-item label="是否分页" prop="page">
              <el-select v-model="ruleForm.page" style="width:100%">
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
          <el-col :span="8">
            <el-form-item label="是否树" prop="tree">
              <el-select v-model="ruleForm.tree" style="width:100%">
                <el-option label="类型1" value="shanghai"></el-option>
                <el-option label="类型1" value="beijing"></el-option>
              </el-select> </el-form-item
          ></el-col>
        </el-row>
      </el-form>
    </div>
    <div>
      <el-form
        :model="ruleForm1"
        :rules="rules1"
        ref="ruleForm1"
        label-width="100px"
      >
        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm1')"
            >立即创建</el-button
          >
          <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      ruleForm: {
        name: "",
        description: "",
        type: "",
        classify: "",
        strategy: "",
        checkbox: "",
        topic: "",
        style: "",
        scroll: "",
        page: "",
        tree: ""
      },
      rules: {}
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
};
</script>

<style lang="less" scope>
.base {
  margin: 30px;
  .row {
    border-bottom: 1px solid #eee;
    margin-top: 20px;
  }
}
</style>
