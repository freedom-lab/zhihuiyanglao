/*二次封装uni.request*/


// const baseUrl = 'http://192.168.31.48:9005/api/'
const baseUrl = 'https://api.ccnet.cc/api/'
// this.$baseUrl = baseUrl

const request = (url, data, method) => {

	// uni.showLoading({
	// 	title: '加载中...',
	// 	mask: true
	// })

	return new Promise((resolve, reject) => {
		uni.request({
			url: baseUrl + url, //baseUrl
			method: method || 'POST', //请求方法（默认post）
			data: data || {}, //携带数据

			success(res) {
				resolve(res)
			},
			fail(err) {
				reject(err)
			},
			complete() {
				//无论成功失败，关闭loading
				// wx.hideLoading()
			}
		})
	})
}




export default request