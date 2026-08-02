<template>
  <el-container>
    <!-- 头部 -->
    <el-header>
      <div class="logo" :style="isCollapse ? 'width:64px;' : 'width:250px'">
        <div class="header_logo">
          <img src="../assets/images/login_app_logo.png" alt="">
          <span v-if="!isCollapse">城投康养家管理平台</span>
        </div>
      </div>

      <!-- 顶部导航 -->
      <div class="top-bar">
        <!-- 顶部菜单 -->
        <div class="bar-left">
          <div class="toggle-button" @click="togleCollapse">
            <i class="el-icon-s-fold f20" ref="icon"></i>
          </div>

          <div class="top-menu-scroll-wrap">
            <div v-for="(item, index) in menuList" class="top-menu-box" @click="topBarMenuChange(item, index)">
              <el-image class="top-menu-icon" fit="contain"
                :src="currTopMenuIndex != index ? item.iconUrl : item.activeIconUrl"></el-image>
              <div class="top-menu-item" :class="currTopMenuIndex == index ? 'active' : 'normal'">
                {{ item.name }}
              </div>
            </div>
          </div>
        </div>

        <!-- 账户信息 -->
        <div class="userInfo-box">
          <div class="account">
            <img class="account-logo" src="../assets/images/user_accont_logo.png" alt="">
          </div>

          <el-dropdown trigger="click" @command="handleCommand">
            <span class="el-dropdown-link">
              <span class="vm">{{ loginUserName }}</span>
              <i class="el-icon-arrow-down"></i>
            </span>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item command="setting">账户设置</el-dropdown-item>
              <el-dropdown-item command="logout">登出</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
      </div>
    </el-header>

    <!-- 主体 -->
    <el-container>
      <!-- 侧边栏 -->
      <el-aside :width="isCollapse ? '64px' : '250px'">
        <el-menu class="left-menu" unique-opened :collapse="isCollapse" :collapse-transition="false" router
          :default-active="activeNav" background-color="#28292b" text-color="#ffffffb2" active-text-color="#ffffffb2"
          v-for="firstMenu in currTopMenuData.childrens" :key="firstMenu.menuCode"  :index="firstMenu.link"
          >
          
          <!-- 一级菜单  -->
          <el-menu-item :index="firstMenu.link == '/visualization/insScreen'?'':firstMenu.link" @click="stairSaveNavState('/' + firstMenu.link, firstMenu)"
            v-if="!firstMenu.childrens || firstMenu.childrens.length == 0">
            <el-image :src="firstMenu.iconUrl" style="width:15px;height:15px;margin-right:10px;"></el-image>
            <span slot="title">{{ firstMenu.name }}</span>
          </el-menu-item>

          <!-- 有二级的菜单 -->
          <el-submenu v-if="firstMenu.childrens && firstMenu.childrens.length" :index="firstMenu.link" >
            <template slot="title">
              <el-image :src="firstMenu.iconUrl" style="width:15px;height:15px;margin-right:10px"></el-image>
              <span>{{ firstMenu.name }}</span>
            </template>

            <!-- 二级菜单循环：template 只写v-for，key放在内部真实组件 -->
            <template v-for="secondMenu in firstMenu.childrens">
              <!-- 二级无子菜单（直接三级页面） -->
              <el-menu-item v-if="!secondMenu.childrens || secondMenu.childrens.length === 0" :key="secondMenu.menuCode"
                :index="secondMenu.link" @click="stairSaveNavState(secondMenu.link, secondMenu)">
                <template slot="title">
                  <el-image v-if="secondMenu.iconUrl" :src="secondMenu.iconUrl" style="width:15px;height:15px;margin-right:10px" fit="contain" />
                  <span>{{ secondMenu.name }}</span>
                </template>
              </el-menu-item>

              <!-- 二级包含三级子菜单 -->
              <el-submenu v-else :index="secondMenu.menuCode">
                <template slot="title">
                  <el-image v-if="secondMenu.iconUrl" :src="secondMenu.iconUrl" style="width:15px;height:15px;margin-right:10px" fit="contain" />
                  <span>{{ secondMenu.name }}</span>
                </template>

                <!-- 三级菜单 -->
                <el-menu-item v-for="thirdMenu in secondMenu.childrens" :key="thirdMenu.menuCode" :index="thirdMenu.link"
                  @click="stairSaveNavState(thirdMenu.link, thirdMenu)">
                  <template slot="title">
                    <el-image v-if="thirdMenu.iconUrl" :src="thirdMenu.iconUrl" style="width:15px;height:15px;margin-right:10px" fit="contain" />
                    <span>{{ thirdMenu.name }}</span>
                  </template>
                </el-menu-item>
              </el-submenu>
            </template>
          </el-submenu>
        </el-menu>

      </el-aside>


      <!-- 内容主体 -->
      <el-main class="main-center">
        <div class="template-tabs">
          <el-tabs v-model="activeTab" type="card" closable @tab-click="tabClick" @tab-remove="removeTab">
            <el-tab-pane :key="item.name" v-for="item in tabsItem" :label="item.title" :name="item.name">
            </el-tab-pane>
          </el-tabs>
          <router-view class="decoration-page"></router-view>
        </div>
      </el-main>
    </el-container>

    <div id="loader-wrapper" v-show="showLoading">
      <div id="loader"></div>
      <div class="loader-section section-left"></div>
      <div class="loader-section section-right"></div>
      <div class="load_title">
        正在载入,请耐心等待..
        <br />
        <!-- <span>V1.0</span> -->
      </div>
    </div>
  </el-container>
</template>

<script>
export default {
  data() {
    return {
      firstIndex: 0,
      currFirstItem: {},
      // 左侧菜单数据
      menuList: [],
      currTopMenuIndex: 0,
      currTopMenuData: [],

      tabsItem: [],
      // 默认不折叠
      isCollapse: false,
      // 被激活导航地址
      activePath: "/index",
      loginUserName: "",
      showLoading: true,
      imageUrl: "",
      activeTab: "1", //默认显示的tab
      tabIndex: 1, //tab目前显示数
    };
  },
  created() {
    // this.getMenuList()
    this.tabsItem = JSON.parse(sessionStorage.getItem("tabsItem")) || []
    this.activeTab = sessionStorage.getItem("activeTab") || ''
    // this.name=JSON.parse(localStorage.getItem('userInfo')).name
    this.activePath = window.sessionStorage.getItem("activePath");
    let userInfo = JSON.parse(localStorage.getItem("userInfo"));
    console.log(userInfo)
    this.loginUserName = userInfo.userInfo.name;
    this.getUserInfo();
  },
  computed: {
    setHeight() {
      return document.documentElement.clientHeight - 65;
    },
    activeNav() {
      //当前激活的导航
      return this.$route.path;
    },
  },
  mounted() {
    this.getMenuList();
  },
  methods: {
    // 顶部菜单切换
    topBarMenuChange(item, index) {
      this.currTopMenuIndex = index;
      this.currTopMenuData = item;
    },

    choiceFirstMu(item, i) {
      this.firstIndex = i
      this.currFirstItem = item
      this.isCollapse = false
    },
    addTab(menu) { // object 
      console.log(' //判断是否已经存在了', this.tabsItem, 'ss')
      //判断是否已经存在了
      let menuExsit = false
      for (var item of this.tabsItem) {
        if (menu.menuCode == item.menuCode) {
          menuExsit = true;
          this.activeTab = item.name;
          this.$router.push({ path: menu.link });
        }
      }
      if (!menuExsit) {
        //不存在
        let newTabName = menu.name;
        this.tabsItem.push({
          title: menu.name,
          name: menu.name,
          link: menu.link,
          menuCode: menu.menuCode,
        });
        this.activeTab = newTabName;
        this.$router.push({ path: menu.link });
      }
      sessionStorage.setItem("tabsItem", JSON.stringify(this.tabsItem))
      sessionStorage.setItem("activeTab", this.activeTab)
    },
    removeTab(targetName) {
      let tabs = this.tabsItem;
      let activeName = this.activeTab;
      if (activeName === targetName) {
        tabs.forEach((tab, index) => {
          if (tab.name === targetName) {
            let nextTab = tabs[index + 1] || tabs[index - 1];
            if (nextTab) {
              activeName = nextTab.name;
            }
          }
        });
      }

      this.activeTab = activeName;
      this.tabsItem = tabs.filter((tab) => tab.name !== targetName);
    },
    tabClick(tab) {
      let path = '';
      let menuName = tab.$options.propsData.name;
      for (var item of this.tabsItem) {
        if (menuName == item.name) {
          path = item.link;
        }
      }
      this.$router.push({ path: path });
    },
    // 获取请求菜单
    async getMenuList() {
      var that = this;
      var loginName = localStorage.getItem("loginName");
      // console.log('index loginName',loginName)
      //存储超时，跳转到登陆页
      if (loginName == null || loginName == "") {
        //用户名不存在跳转登陆
        that.$router.push({ path: "/login" });
        return;
      }
      this.$http
        .post("/menuInfo/getUserMenu", {
          loginName: loginName,
        })
        .then(function (res) {
          // console.log('index menu', JSON.stringify(res.data.data[1]))
          that.menuList = res.data.data;
          that.currTopMenuIndex = 0;
          that.currTopMenuData = that.menuList.length ? that.menuList[0] : {}
          that.showLoading = false;
        });
    },
    getLocalStorage(key) {
      // 取出对象
      let item = localStorage.getItem(key);
      // 先将拿到的试着进行json转为对象的形式
      try {
        item = JSON.parse(item);
      } catch (error) {
        // eslint-disable-next-line no-self-assign
        item = item;
      }
      // 如果有startTime的值，说明设置了失效时间
      if (item && item.startTime) {
        let date = new Date().getTime();
        // 如果大于就是过期了，如果小于或等于就还没过期
        if (date - item.startTime > item.expires) {
          localStorage.removeItem(name);
          return "";
        } else {
          return item.value;
        }
      } else {
        return "";
      }
    },
    // 菜单的折叠与展开
    togleCollapse() {
      // console.log(this.$refs)
      if (this.$refs.icon.className == "el-icon-s-fold f20") {
        this.$refs.icon.className = "el-icon-s-unfold f20";
      } else {
        this.$refs.icon.className = "el-icon-s-fold f20";
      }
      this.isCollapse = !this.isCollapse;
    },
    // 保存连接的激活地址
    stairSaveNavState(activePath, menu) {
      console.log(activePath, menu, 'menuuuuuuuuuu')
      if(menu.link == '/visualization/insScreen'){
        window.open(`/#${menu.link}`)
        return
      }
      //主窗口添加显示
      this.activePath = activePath
      this.addTab(menu);
    },
    // 监听下拉菜单子选项点击事件
    handleCommand(command) {
      //this.$message("click on item " + command);
      if (command == "logout") {
        window.localStorage.removeItem("token");
        window.localStorage.removeItem("loginName");
        this.$router.push("/login");
      } else {
        this.$router.push("/myAccountView");
      }
    },

    //获取个人信息
    async getUserInfo() {
      let res = await this.$http.post("/userInfo/queryOne", { loginName: this.loginName })
      if (res.data.code == 200) {
        this.imageUrl = res.data.data.logo;
      }
    },

  },
};
</script>

<style lang="less" scoped>
.s-content {
  img {
    width: 15px;
    height: 15px;
    margin-right: 8px;
  }
}

:deep .el-menu-item.is-active {
  width: 100%;
  color: #ffffff;
  background-color: #37588a !important;
}

:deep .el-submenu .el-menu-item {
  min-width: 150px;
  background-color: #28292b;
}

:deep .el-submenu.is-active .el-submenu__title {
  // color: #0086d9;
  color: #37588a;
}

:deep .el-submenu.is-active .el-submenu__title i {
  // color: #0086d9;
  // color: #37588a;
  color: #ffffff;
}

.el-container {
  height: 100%;
  overflow-y: hidden;
}

.el-header {
  background-color: #28292b;
  display: flex;
  justify-content: space-between;
  padding: 0;
  align-items: center;
  color: #fff;
  height: 120px;
  overflow: hidden;

  .logo {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100%;

    .header_logo {
      display: flex;
      align-items: center;
      height: 100%;
      justify-content: center;
      color: rgba(255, 255, 255, 0.8);
      font-size: 17px;
      cursor: pointer;
      gap: 7px;

      img {
        height: 30px;
      }
    }
  }

  .menu-icon {
    width: 16px;
    height: 16px;
  }

  .top-bar {
    flex: 1;
    height: 100%;
    padding: 0 20px;
    display: flex;
    flex-direction: row;
    gap: 10px;
    justify-content: space-between;
    background-color: white;
    border: 1px solid #eee;
    width: calc(100% - 250px);
    box-sizing: border-box;

    .bar-left {
      display: flex;
      align-items: center;
      flex: 1;
      /* 关键：抢占剩余空间 */
      min-width: 0;
      /* 修复 flex 子项不收缩问题 */
      overflow: hidden;

      .toggle-button {
        line-height: 24px;
        color: #333;
        text-align: center;
        letter-spacing: 0.2em;
        // 鼠标放上去变成小手
        cursor: pointer;
        align-items: center;
        margin-top: 3px;
        flex-shrink: 0;
        /* 禁止压缩 */
      }

      .top-menu-scroll-wrap {
        display: flex;
        /* 子元素横排 */
        overflow-x: auto;
        /* 水平溢出滚动 */
        overflow-y: hidden;
        /* 禁止纵向滚动 */
        white-space: nowrap;
        /* 禁止文字换行 */
        gap: 10px;
        /* 菜单项之间间距，按需修改 */
        padding: 0 20px;

        .top-menu-box {
          flex-shrink: 0;
          /* 关键：不让元素被压缩 */
          display: flex;
          align-items: center;
          cursor: pointer;
          gap: 9px;
          // 鼠标放上去变成小手
          cursor: pointer;
          padding: 0 8px;

          .top-menu-icon {
            width: 16px;
            height: 16px;
          }

          .top-menu-item {
            display: flex;
            font-size: 15px;
            font-weight: 600;
            padding: 8px 0;
          }

          .active {
            color: rgba(64, 158, 255, .8);
            border-bottom: 2px solid rgba(64,158,255,.8);
          }

          .normal {
            color: #333;
          }
        }

        /* hover 背景色 */
        .top-menu-box:hover {
          background-color: #dbecff;
          /* 悬浮背景色，可自定义 */
          border-radius: 5px;
        }
      }
    }

    .userInfo-box {
      display: flex;
      gap: 10px;
      align-items: center;
      justify-content: end;
      flex-shrink: 0;
      /* 核心：右侧宽度固定为内容宽度，不压缩 */

      .account {
        border: 1px solid #ddd;
        border-radius: 20px;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 30px;
        width: 30px;

        .account-logo {
          width: 30px;
          height: 30px;
          border-radius: 15px;
          overflow: hidden;
        }
      }

      .el-dropdown-link {
        color: rgba(64, 158, 255, .8);
        font-size: 14px;
        font-weight: 600;
        display: flex;
        gap: 6px;
        align-items: center;
        // 鼠标放上去变成小手
        cursor: pointer;
      }

      >.el-dropdown-menu {
        top: 57px !important;
      }
    }
  }
}

.el-aside {
  background-color: #28292b;

  .el-menu {
    border: none;
  }
}

::-webkit-scrollbar {
  width: 0;
  height: 0;
}

::-webkit-scrollbar-corner {
  background: none;
}

::-webkit-scrollbar-thumb {
  background: #28292b;
  border: none;
  border-radius: 20px;
}

::-webkit-scrollbar-track-piece {
  background-color: #28292b;
  -webkit-border-radius: 0;
}

::-webkit-scrollbar-track-piece {
  background: #28292b;
  ;
}

:deep .el-main {
  padding: 0;
  height: 100%;
}

.iconfont {
  margin-right: 10px;
}

html,
body,
#app {
  height: 100%;
  margin: 0px;
  padding: 0px;
}

.chromeframe {
  margin: 0.2em 0;
  background: #ccc;
  color: #000;
  padding: 0.2em 0;
}

#loader-wrapper {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 999999;
}

#loader {
  display: block;
  position: relative;
  left: 50%;
  top: 50%;
  width: 120px;
  height: 120px;
  margin: -60px 0 0 -60px;
  border-radius: 50%;
  border: 3px solid transparent;
  /* COLOR 1 */
  border-top-color: #fff;
  -webkit-animation: spin 2s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -ms-animation: spin 2s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -moz-animation: spin 2s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -o-animation: spin 2s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  animation: spin 2s linear infinite;
  /* Chrome, Firefox 16+, IE 10+, Opera */
  z-index: 1001;
}

#loader:before {
  content: '';
  position: absolute;
  top: 5px;
  left: 5px;
  right: 5px;
  bottom: 5px;
  border-radius: 50%;
  border: 3px solid transparent;
  /* COLOR 2 */
  border-top-color: #fff;
  -webkit-animation: spin 3s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -moz-animation: spin 3s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -o-animation: spin 3s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -ms-animation: spin 3s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  animation: spin 3s linear infinite;
  /* Chrome, Firefox 16+, IE 10+, Opera */
}

#loader:after {
  content: '';
  position: absolute;
  top: 15px;
  left: 15px;
  right: 15px;
  bottom: 15px;
  border-radius: 50%;
  border: 3px solid transparent;
  border-top-color: #fff;
  /* COLOR 3 */
  -moz-animation: spin 1.5s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -o-animation: spin 1.5s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -ms-animation: spin 1.5s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  -webkit-animation: spin 1.5s linear infinite;
  /* Chrome, Opera 15+, Safari 5+ */
  animation: spin 1.5s linear infinite;
  /* Chrome, Firefox 16+, IE 10+, Opera */
}

@-webkit-keyframes spin {
  0% {
    -webkit-transform: rotate(0deg);
    /* Chrome, Opera 15+, Safari 3.1+ */
    -ms-transform: rotate(0deg);
    /* IE 9 */
    transform: rotate(0deg);
    /* Firefox 16+, IE 10+, Opera */
  }

  100% {
    -webkit-transform: rotate(360deg);
    /* Chrome, Opera 15+, Safari 3.1+ */
    -ms-transform: rotate(360deg);
    /* IE 9 */
    transform: rotate(360deg);
    /* Firefox 16+, IE 10+, Opera */
  }
}

@keyframes spin {
  0% {
    -webkit-transform: rotate(0deg);
    /* Chrome, Opera 15+, Safari 3.1+ */
    -ms-transform: rotate(0deg);
    /* IE 9 */
    transform: rotate(0deg);
    /* Firefox 16+, IE 10+, Opera */
  }

  100% {
    -webkit-transform: rotate(360deg);
    /* Chrome, Opera 15+, Safari 3.1+ */
    -ms-transform: rotate(360deg);
    /* IE 9 */
    transform: rotate(360deg);
    /* Firefox 16+, IE 10+, Opera */
  }
}

#loader-wrapper .loader-section {
  position: fixed;
  top: 0;
  width: 51%;
  height: 100%;
  background: #7171c6;
  /* Old browsers */
  z-index: 1000;
  -webkit-transform: translateX(0);
  /* Chrome, Opera 15+, Safari 3.1+ */
  -ms-transform: translateX(0);
  /* IE 9 */
  transform: translateX(0);
  /* Firefox 16+, IE 10+, Opera */
}

#loader-wrapper .loader-section.section-left {
  left: 0;
}

#loader-wrapper .loader-section.section-right {
  right: 0;
}

/* Loaded */
.loaded #loader-wrapper .loader-section.section-left {
  -webkit-transform: translateX(-100%);
  /* Chrome, Opera 15+, Safari 3.1+ */
  -ms-transform: translateX(-100%);
  /* IE 9 */
  transform: translateX(-100%);
  /* Firefox 16+, IE 10+, Opera */
  -webkit-transition: all 0.7s 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: all 0.7s 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.loaded #loader-wrapper .loader-section.section-right {
  -webkit-transform: translateX(100%);
  /* Chrome, Opera 15+, Safari 3.1+ */
  -ms-transform: translateX(100%);
  /* IE 9 */
  transform: translateX(100%);
  /* Firefox 16+, IE 10+, Opera */
  -webkit-transition: all 0.7s 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: all 0.7s 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}

.loaded #loader {
  opacity: 0;
  -webkit-transition: all 0.3s ease-out;
  transition: all 0.3s ease-out;
}

.loaded #loader-wrapper {
  visibility: hidden;
  -webkit-transform: translateY(-100%);
  /* Chrome, Opera 15+, Safari 3.1+ */
  -ms-transform: translateY(-100%);
  /* IE 9 */
  transform: translateY(-100%);
  /* Firefox 16+, IE 10+, Opera */
  -webkit-transition: all 0.3s 1s ease-out;
  transition: all 0.3s 1s ease-out;
}

/* JavaScript Turned Off */
.no-js #loader-wrapper {
  display: none;
}

.no-js h1 {
  color: #222222;
}

#loader-wrapper .load_title {
  font-family: 'Open Sans';
  color: #fff;
  font-size: 18px;
  width: 100%;
  text-align: center;
  z-index: 9999999999999;
  position: absolute;
  top: 60%;
  opacity: 1;
  line-height: 30px;
}

#loader-wrapper .load_title span {
  font-weight: normal;
  font-style: italic;
  font-size: 13px;
  color: #fff;
  opacity: 0.5;
}

:deep .el-submenu__icon-arrow {
  font-size: 14px;
  color: #ffffffb2;
}
</style>

