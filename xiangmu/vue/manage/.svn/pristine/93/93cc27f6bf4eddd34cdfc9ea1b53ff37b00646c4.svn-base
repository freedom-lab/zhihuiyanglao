<template>
  <div class="detail positionr" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-row>
      <el-col
        ><el-breadcrumb
          ><el-breadcrumb-item class="pointer" :to="{ path: '/systemConfig' }"
            >导航</el-breadcrumb-item
          >
          <el-breadcrumb-item>详情</el-breadcrumb-item>
        </el-breadcrumb></el-col
      >
    </el-row>
    <!-- 内容主体 -->
    <div class="bgwhite bort">
      <el-row>
        <!-- tabbar -->
        <el-col :span="3">
          <div id="navigation">
            <ul>
              <li
                class="menu-item text-cut"
                v-for="(item, i) in tabs"
                :key="item"
                :class="seeThis == i ? 'active' : ''"
              >
                <a href="javascript:void(0)" @click="goAnchor(i)">{{ item }}</a>
              </li>
            </ul>
          </div>
        </el-col>
        <!-- tabbar对应内容 -->
        <el-col :span="21">
          <div class="menu-content">
            <!-- 基本信息 -->
            <div class="p1" id="a1">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      基本信息
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="保存基本信息和扩展属性"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            @click="submitForm('systemConfig')"
                            >保存</el-button
                          >
                        </el-tooltip>
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="返回列表"
                          placement="bottom"
                        >
                          <el-button @click="goIndex()" size="small"
                            >返回</el-button
                          >
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="systemConfig"
                  ref="systemConfig"
                  label-width="150px"
                  class="systemConfig"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12" style="display:none">
                      <el-form-item label="id" prop="id">
                        <el-input v-model="systemConfig.id"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="propertyKey" prop="propertyKey">
                        <el-input v-model="systemConfig.propertyKey"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="propertyValue" prop="propertyValue">
                        <el-input
                          v-model="systemConfig.propertyValue"
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="propertyDesc" prop="propertyDesc">
                        <el-input
                          v-model="systemConfig.propertyDesc"
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="propertyIndex" prop="propertyIndex">
                        <el-input
                          v-model="systemConfig.propertyIndex"
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="systemId" prop="systemId">
                        <el-input v-model="systemConfig.systemId"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="adress" prop="adress">
                        <el-input v-model="systemConfig.adress"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="createDt" prop="createDt">
                        <el-input v-model="systemConfig.createDt"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="wechat" prop="wechat">
                        <el-input v-model="systemConfig.wechat"></el-input>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div>
            <!--  多功能 -->
            <!-- <SystemConfigFunction></SystemConfigFunction> -->

            <!-- 扩展-->
            <!-- <SystemConfigExtends></SystemConfigExtends> -->
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import SystemConfigFunction from "@/views/systemConfig/SystemConfigFunction.vue";
import SystemConfigExtends from "@/views/systemConfig/SystemConfigExtends.vue";
export default {
  components: {
    SystemConfigFunction,
    SystemConfigExtends
  },
  data() {
    return {
      // 当前页数
      currPage: 1,
      pageSize: 10,
      seeThis: 0,
      loading: true,
      id: "",
      tabs: [
        "基本信息"
        // "多功能",
        // "扩展属性",
      ],
      systemConfig: {
        id: "",
        propertyKey: "",
        propertyValue: "",
        propertyDesc: "",
        propertyIndex: "",
        systemId: "",
        createDt: ""
      }
    };
  },
  methods: {
    goIndex() {
      this.$router.push({
        path: "/systemConfig",
        query: { currPage: this.currPage, pageSize: this.pageSize }
      });
    },
    submitForm(formName) {
      var that = this;
      that.$http
        .post("/systemConfig/save", that.systemConfig)
        .then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "保存成功",
            showClose: true
          });
        })
        .catch(function(error) {
          that.$notify.info({
            title: "提示",
            message: "保存失败",
            showClose: true
          });
        });
    },
    loadBaseInfo() {
      let that = this;
      if (this.id != undefined && this.id != "") {
        that.$http
          .post("/systemConfig/queryOne", { id: this.id })
          .then(function(response) {
            if (response.data.code == 200) {
              that.total = response.data.data.count;
              that.systemConfig = response.data.data;
            }
          });
      }
    },
    goAnchor(index) {
      // 也可以用scrollIntoView方法， 但由于这里头部设置了固定定位，所以用了这种方法
      // document.querySelector('#anchor'+index).scrollIntoView()
      this.seeThis = index;
      var i = index + 1;
      var anchor = this.$el.querySelector("#a" + i);
      this.$nextTick(() => {
        this.$el.querySelector(".menu-content").scrollTop = anchor.offsetTop;
      });
    },
    handleScroll() {
      //console.log("滚动了");
      var scrollTop = this.$el.querySelector(".menu-content").scrollTop;
      var scrollHeight = this.$el.querySelector(".menu-content").scrollHeight;
      var height = this.$el.querySelector(".menu-content").offsetHeight;
      var anchorOffset1 = this.$el.querySelector("#a1").offsetTop;
      var anchorOffset2 = this.$el.querySelector("#a2").offsetTop;
      var anchorOffset3 = this.$el.querySelector("#a3").offsetTop;

      if (scrollTop > anchorOffset1 && scrollTop < anchorOffset2) {
        this.seeThis = 0;
      }
      if (scrollTop > anchorOffset2 && scrollTop < anchorOffset3) {
        this.seeThis = 1;
      }
      if (scrollTop > anchorOffset3 && scrollTop + height > scrollHeight) {
        this.seeThis = 3;
      }

      if (scrollTop + height > scrollHeight) {
        this.seeThis = 3;
      }
    }
  },
  created() {
    if (this.$route.query.id != undefined && this.$route.query.id != "") {
      this.id = this.$route.query.id;
    }
    this.currPage = this.$route.query.currPage;
    this.pageSize = this.$route.query.pageSize;
    this.loadBaseInfo();
  },
  mounted() {
    var that = this;
    this.$el.querySelector(".menu-content").onscroll = () => {
      that.handleScroll();
    }; // 监听滚动事件，然后用handleScroll这个方法进行相应的处理
    that.loading = false;
  }
};
</script>

<style lang="less" scope>
.h50 {
  height: 50px;
}
.detail {
  .el-breadcrumb__inner {
    color: #2f91df;
  }
  .el-row {
    #navigation {
      background-color: #f6f7fb;
      font-size: 14px;
      height: calc(100vh - 110px);
      margin-top: -14px;
      li {
        height: 50px;
        line-height: 50px;
        a {
          display: block;
          color: #324059;
          padding-left: 20px;
          background-color: transparent;
        }
      }
      li.active,
      li:hover {
        background-color: #fff;
      }
    }
    .menu-content {
      height: calc(100vh - 110px);
      overflow-y: auto;
      padding-left: 10px;
      padding-right: 5px;
      .p1 {
        margin-bottom: 20px;
      }
      .header-search {
        .title {
          height: 50px;
          line-height: 49px;
          font-size: 15px;
          color: #2f405b;
          padding-left: 10px;
          border-bottom: 1px solid #e3eaf0;
          margin-bottom: 10px;
          .line {
            display: inline-block;
            width: 3px;
            height: 15px;
            background-color: #2f91df;
            margin-right: 5px;
            border-radius: 2px;
            margin-bottom: -2px;
          }
          .el-input {
            width: 247px;
          }
          .el-input .el-input__inner {
            width: 217px;
          }
        }
      }
      .header-input {
        font-size: 13px;
      }
      .model-mask {
        .el-form {
          .el-form-item {
            margin-bottom: 0;
          }
        }
        .el-table {
          margin-top: 10px;
        }
      }
    }
  }
  #selectorOrgDialog .el-dialog {
    width: 600px !important;
  }
  #selectorOrgDialog .selectedUl {
    height: 350px;
    max-height: 350px;
  }
  #selectorOrgDialog .org-selected .selectedUl-box {
    height: 320px !important;
  }
}
</style>
