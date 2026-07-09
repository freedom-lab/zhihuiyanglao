// #ifndef VUE3
import Vue from 'vue'
import App from './App'

Vue.config.productionTip = false

App.mpType = 'app'

Vue.prototype.$baseUrl = 'https://api.ccnet.cc/api/'

import request from 'utils/request.js'
Vue.prototype.$request = request

import upLoadFile from "@/utils/upload.js"
Vue.prototype.$upLoadFile = upLoadFile

import payAttention from 'utils/publish.js'
Vue.prototype.$payAttention = payAttention

import isLogin from 'utils/isLogin.js'
Vue.prototype.$isLogin = isLogin

import isHavePhone from 'utils/isHavePhone.js'
Vue.prototype.$isHavePhone = isHavePhone

import formatNumberToWan from 'utils/numExchange.js'
Vue.prototype.$formatNumberToWan = formatNumberToWan

const app = new Vue({
	...App
})
app.$mount()
// #endif
import uView from 'uview-ui'
Vue.use(uView)
// 如此配置即可
uni.$u.config.unit = 'rpx'
// #ifdef VUE3
import {
	createSSRApp
} from 'vue'
import App from './App.vue'
export function createApp() {
	const app = createSSRApp(App)
	return {
		app
	}
}
// #endif