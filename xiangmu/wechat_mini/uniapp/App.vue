<script>
	import updateSystem from './utils/updateSystem'
	export default {
		globalData: {
			deviceInfo: {},
			navHeight: 0,
			navTop: 0,
			navObj: 0,
			navObjWid: 0,
			headerHeight: 0,
			tabvalue: 0,
			messageNum: 0,
			isFirstLaunch: false
		},
		onLaunch: function(options) {
			console.log('App Launch', options)
			// updateSystem() // 微信小程序检查更新
			this.getDeviceInfo()

			if (options.path == 'pages/merchant/merchant' && options.query && options.query.inviterCode) {
				this.globalData.tabvalue = 1
			} else {
				this.globalData.tabvalue = 0
			}
			// this.onShareAppMessage()
		},
		onShow: function() {
			console.log('App Show')

		},
		onHide: function() {
			console.log('App Hide')
		},
		methods: {
			isShareFromMerchant() {
				this.globalData.isFirstLaunch = false;
				const pages = getCurrentPages();
				console.log(pages, 'pages--------------------');
				if (pages.length === 1) {
					const currentRoute = pages[0].route;
					console.log(currentRoute, 'currentRoute');
					const targetRoute = 'pages/merchant/merchant';
					if (currentRoute === targetRoute) {
						console.log('检测到初始路由为商家页面，开始处理逻辑');
						this.globalData.tabvalue = 1
					}
				}
			},
			getDeviceInfo() {
				const deviceInfo = uni.getWindowInfo()
				console.log('设备信息', deviceInfo);
				// 导航高度
				let statusBarHeight = deviceInfo.statusBarHeight
				// #ifdef MP
				let menuButtonInfo = uni.getMenuButtonBoundingClientRect()
				console.log("胶囊", menuButtonInfo);
				// 胶囊距离顶部高度
				let navTop = menuButtonInfo.top
				// 胶囊按钮与右侧的距离 = windowWidth - right + 胶囊宽度(包括右边距离)
				let navObjWid = deviceInfo.windowWidth - menuButtonInfo.right + menuButtonInfo.width
				// 导航栏整体高度
				let navHeight = statusBarHeight + menuButtonInfo.height + (navTop - statusBarHeight) * 2;
				this.globalData.navHeight = navHeight;
				this.globalData.navTop = navTop;
				this.globalData.navObj = menuButtonInfo.height; // 胶囊高度
				this.globalData.navObjWid = navObjWid;
				// 设置title的距离（这个只是文字顶部到了位置，还要将title向上移动自己50%高度）
				this.globalData.headerHeight = navTop + menuButtonInfo.height / 2;
				// #endif

				this.globalData.deviceInfo = deviceInfo
			},
			onShareAppMessage() {
				// 获取当前页面对象与路由
				const pages = getCurrentPages();
				const view = pages[pages.length - 1];
				const route = view?.route || "";

				// 根据不同页面路由配置对应的标题和图片
				const shareConfigMap = {
					"pages/index/index": {
						title: "首页-发现精彩内容",
						imageUrl: "https://admin.xnzx888.com/resources/upload/home/share-index.png"
					},
					"pages/goods/list/list": {
						title: "商品列表-精选好物",
						imageUrl: "https://admin.xnzx888.com/resources/upload/home/share-list.png"
					},
					"pages/user/center/center": {
						title: "个人中心-管理你的账号",
						imageUrl: "https://admin.xnzx888.com/resources/upload/home/share-user.png"
					}
					// 这里可以继续扩展更多页面
				}

				// 默认分享内容
				const defaultShare = {
					title: this.globalData?.shareTitle || '默认分享标题',
					// imageUrl: 'https://admin.xnzx888.com/resources/upload/home/share.png',
					path: "/" + route
				}

				const shareData = Object.assign({}, defaultShare, shareConfigMap[route] || {});

				return shareData;
			}
		}
	}
</script>

<style lang="scss">
	/*每个页面公共css */
	@import '@/uni_modules/uni-scss/index.scss';
	/* #ifndef APP-NVUE */
	@import '@/static/customicons.css';

	// 设置整个项目的背景色
	page {
		background-color: #f5f5f5;
	}

	/* #endif */
	.example-info {
		font-size: 14px;
		color: #333;
		padding: 10px;
	}
</style>