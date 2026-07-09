<template>
  <div class="myAccountView">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <el-breadcrumb-item class="pointer" :to="{ path: '/index' }"
        >首页</el-breadcrumb-item
      >
      <el-breadcrumb-item>我的账号</el-breadcrumb-item>
    </el-breadcrumb>
    <!-- 内容主体 -->
    <div class="bgwhite bort myAccount">
      <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
        <el-tab-pane label="基本信息" name="first">
          <el-row class="mt20">
            <el-col :span="2">
              <div class="avatar-uploader">
                <el-upload
                  class="avatar-uploader"
                  :action="$uploadURL"
                  :show-file-list="false"
                  :limit="1"
                  :on-success="handleAvatarSuccess"
                  :before-upload="beforeAvatarUpload"
                  :on-preview="handlePictureCardPreview"
                >
                  <img
                    :src="imageUrl"
                    class="avatar"
                    width="100%"
                    onerror="this.src='https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2100401123,2895311668&fm=26&gp=0.jpg'"
                  />
                </el-upload>
              </div>
            </el-col>
            <el-col :span="20">
              <el-form
                :model="userForm"
                ref="ruleForm"
                :rules="rules"
                label-width="160px"
                class="ruleForm"
                size="mini"
              >
                <el-form-item label="姓名">
                  <el-input v-model="userForm.name" disabled></el-input>
                </el-form-item>
                <el-form-item label="邮箱">
                  <el-input v-model="userForm.email" disabled></el-input>
                </el-form-item>
                <el-form-item label="员工编号">
                  <el-input v-model="userForm.code" disabled></el-input>
                </el-form-item>
                <el-form-item label="账号">
                  <el-input v-model="userForm.account" disabled></el-input>
                </el-form-item>
              </el-form>
            </el-col>
          </el-row>
          <div class="positionf saveBtn">
            <el-tooltip
              class="item"
              effect="dark"
              content="保存"
              placement="bottom"
            >
              <el-button
                type="primary"
                size="small"
                @click="submitForm('ruleForm')"
                >保存</el-button
              >
            </el-tooltip>
          </div>
        </el-tab-pane>
        <el-tab-pane label="密码" name="second">
          <el-form
            :model="pwdForm"
            :rules="rules"
            ref="pwdForm"
            label-width="160px"
            class="ruleForm mt20"
            size="mini"
          >
            <el-form-item label="当前密码" prop="currentPwd">
              <el-input v-model="pwdForm.currentPwd" type="password"></el-input>
            </el-form-item>
            <el-form-item label="新密码" prop="newPwd">
              <el-input v-model="pwdForm.newPwd" type="password"></el-input>
            </el-form-item>
            <el-form-item label="确认新密码" prop="confirmPwd">
              <el-input v-model="pwdForm.confirmPwd" type="password"></el-input>
            </el-form-item>
          </el-form>
          <div class="positionf saveBtn">
            <el-tooltip
              class="item"
              effect="dark"
              content="保存"
              placement="bottom"
            >
              <el-button
                type="primary"
                size="small"
                @click="submitForm('pwdForm')"
                >保存</el-button
              >
            </el-tooltip>
          </div>
        </el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    var validatePass = (rule, value, callback) => {
      if (value === "") {
        callback(new Error("请再次输入密码"));
      } else if (value !== this.pwdForm.newPwd) {
        callback(new Error("两次输入密码不一致!"));
      } else {
        callback();
      }
    };
    return {
      activeName: "first",
      dialogVisible: false,
      imageUrl: "",
      userForm: {
        name: "",
        email: "",
        code: "",
        account: ""
      },
      pwdForm: {
        currentPwd: "",
        newPwd: "",
        confirmPwd: ""
      },
      rules: {
        currentPwd: [
          { required: true, message: "请输入当前密码", trigger: "blur" }
        ],
        newPwd: [{ required: true, message: "请输入新密码", trigger: "blur" }],
        confirmPwd: [{ validator: validatePass, trigger: "blur" }]
      },
      userName: "",
      userInfo: {}
    };
  },
  created() {
    this.userName = localStorage.getItem("loginName");
    //console.log(this.userName);
    this.getUserInfo();
  },
  methods: {
    handleClick(tab, event) {
      //console.log(tab, event);
    },
    // 点击图片放大
    handlePictureCardPreview(file) {
      console.log(file);
      this.imageUrl = file.url;
      this.dialogVisible = true;
    },
    errorHandler() {
      return true;
    },
    // 图片上传成功
    handleAvatarSuccess(res, file) {
      console.log(res);
      console.log(file);
      this.imageUrl = file.response.data.url;
    },
    beforeAvatarUpload(file) {
      const isLt2M = file.size / 1024 / 1024 < 2;

      if (!isLt2M) {
        this.$message.error("上传头像图片大小不能超过 2MB!");
      }
      return isLt2M;
    },
    // 表单提交
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          if (formName == "ruleForm") {
            var arr = {
              loginName: this.userName,
              logo: this.imageUrl
            };
            var that = this;
            that.$http
              .post("userInfo/updateUserLogo/", arr)
              .then(function(response) {
                console.log(response);
                if (response.data.code == 200) {
                  that.$notify.success({
                    title: "提示",
                    message: "头像更改成功",
                    showClose: true
                  });
                }
              });
          }
          if (formName == "pwdForm") {
            var arr = {
              loginName: this.userName,
              oldPwd: this.pwdForm.currentPwd,
              password: this.pwdForm.newPwd
            };
            var that = this;
            that.$http
              .post("/userInfo/updatePwd", arr)
              .then(function(response) {
                console.log(response);
                if (response.data.code == 400) {
                  that.$notify.error({
                    title: "提示",
                    message: response.data.message,
                    showClose: true
                  });
                }
                if (response.data.code == 200) {
                  that.$notify.success({
                    title: "提示",
                    message: response.data.data,
                    showClose: true
                  });
                  that.pwdForm = {
                    currentPwd: "",
                    newPwd: "",
                    confirmPwd: ""
                  };
                }
              });
          }
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },

    //获取个人信息
    getUserInfo() {
      var that = this;
      that.$http
        .post("/userInfo/queryOne", { loginName: that.userName })
        .then(function(response) {
          console.log(response.data.data);
          if (response.data.code == 200) {
            that.userInfo = response.data.data;
            that.userForm.name =
              response.data.data.familyName + response.data.data.name;
            that.userForm.email = response.data.data.email;
            that.userForm.code = response.data.data.ad;
            that.userForm.account = response.data.data.loginName;
            that.imageUrl = response.data.data.logo;
          }
        });
    }
  }
};
</script>

<style lang="less" scope>
.myAccountView {
  .el-breadcrumb__inner {
    color: #2f91df;
  }
  .myAccount {
    height: calc(100vh - 110px);
    padding: 0 20px;
    box-sizing: border-box;
    .el-tabs--card > .el-tabs__header {
      border-bottom: 0 solid #e4e7ed;
    }
    .el-tabs--card > .el-tabs__header .el-tabs__nav {
      border: 0 solid #e4e7ed;
      border-radius: 2px;
      -webkit-box-sizing: border-box;
      box-sizing: border-box;
    }
    .el-tabs--card > .el-tabs__header .el-tabs__item {
      border: 0 solid #e4e7ed;
      background-color: #f6f8fa;
      padding: 0 20px;
      height: 40px;
      margin: 10px 10px 0 0;
    }
    .el-tabs--card > .el-tabs__header .el-tabs__item.is-active {
      color: #008eff;
      border-bottom-color: #fff;
      background-color: #d5e9f9;
    }
    .avatar {
      width: 100px;
      height: 100px;
      border-radius: 50%;
      margin-left: 20px;
    }
    .el-input {
      width: 320px !important;
      height: 40px;
    }
    .saveBtn {
      bottom: 30px;
      right: 60px;
    }
  }
}
</style>
