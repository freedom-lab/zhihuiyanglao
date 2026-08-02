import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import $ from 'jquery'
// import './plugins/element.js'
// 导入全局样式
import './assets/css/global.css'
import "./assets/css/unifiedstyle.scss";
// 导入字体图标
import './assets/fonts/iconfont.css'
// 导入表格树
import TreeTable from 'vue-table-with-tree-grid'
import Element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import moment from 'moment'
Vue.prototype.$moment = moment
// 导入富文本编辑器

// 导入NProgress, 包对应的JS和CSS
import NProgress from 'nprogress'
// import 'nprogress/nprogress.css'


//designer
import './assets/iconfont/iconfont.js'
import plugins from './components/index';


import axios from 'axios'
// 配置请求根路径
axios.defaults.baseURL = "https://zhky.ahjykjxx.com/api/";
  // axios.defaults.baseURL = 'http://sso.yangli.com/'
// 在request 拦截器中, 展示进度条 NProgress.start()
// 请求在到达服务器之前，先会调用use中的这个回调函数来添加请求头信息
axios.interceptors.request.use(config => {
  NProgress.start()
  // console.log(config)
  // 为请求头对象，添加token验证的Authorization字段
  config.headers.Authorization = localStorage.getItem("authToken");
  // 在最后必须 return config
  return config
})
// response 拦截器中,  隐藏进度条NProgress.done()
axios.interceptors.response.use(config => {
  NProgress.done()
  return config
})
// 挂在到Vue实例，后面可通过this调用
Vue.prototype.$http = axios

import md5 from 'js-md5';
Vue.prototype.$md5 = md5;
Vue.prototype.$uploadURL = "https://zhky.ahjykjxx.com/api/upload/uploadFile";
Vue.prototype.$filePathPre = "https://zhky.ahjykjxx.com/resources";

Vue.config.productionTip = false
// 组件全局注册 表格树
Vue.component('tree-table', TreeTable)
// 全局注册富文本编辑器
Vue.use(Element, {
  size: 'small',
})
Vue.use(plugins);
// 全局时间过滤器
Vue.filter('dataFormat', function (originVal) {
  const dt = new Date(originVal)

  const y = dt.getFullYear()
  const m = (dt.getMonth() + 1 + '').padStart(2, '0')
  const d = (dt.getDate() + '').padStart(2, '0')

  const hh = (dt.getHours() + '').padStart(2, '0')
  const mm = (dt.getMinutes() + '').padStart(2, '0')
  const ss = (dt.getSeconds() + '').padStart(2, '0')
  // yyyy-mm-dd hh:mm:ss
  return `${y}-${m}-${d} ${hh}:${mm}:${ss}`
})
// 是否过滤器 0否1是
Vue.filter('yonFormat', function (originVal) {
  switch (originVal) {
    case 0:
    case '0':
      return '否';
    case 1:
    case '1':
      return '是';
    case 2:
    case '2':
      return '否';
    default:
      return originVal || '-';
  }
})

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
