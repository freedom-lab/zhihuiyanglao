const app = getApp()

Component({
  data: {
    activeTab: 0,
    messageNum: 0,
    tabList: [
      {
        text: '首页',
        url: '/pages/home/home',
        'active-icon': '/static/image/catbglogo.png',
        'inactive-icon': '/static/image/home-2x.png',
      },
      {
        text: '附近',
        url: '/pages/merchant/merchant',
        'active-icon': '/static/image/location-t-2x.png',
        'inactive-icon': '/static/image/location-3x.png',
      },
      {
        text: '我的',
        url: '/pages/my/my',
        'active-icon': '/static/image/my-t-2x.png',
        'inactive-icon': '/static/image/my-3x.png',
      }
    ],
    pollTimer: null
  },

  lifetimes: {
    attached() {
      // 初始化激活的tab
      this.setData({
        activeTab: app.globalData.tabvalue || 0
      })
      // 获取消息数量
      this.getMessageNum()
      // 启动轮询
      this.startPolling()
    },
    detached() {
      // 清除轮询
      this.clearPollTimer()
    }
  },

  methods: {
    // 清除轮询定时器
    clearPollTimer() {
      if (this.data.pollTimer) {
        clearInterval(this.data.pollTimer)
        this.setData({ pollTimer: null })
      }
    },

    // 启动消息数量轮询
    startPolling() {
      this.clearPollTimer()
      const timer = setInterval(() => {
        this.getMessageNum()
      }, 5000)
      this.setData({ pollTimer: timer })
    },

    // 获取未读消息数量
    async getMessageNum() {
      try {
        const userInfo = wx.getStorageSync("userInfo")
        if (userInfo) {
          // 替换为你的请求方式（uniapp的$request在微信原生中需改为wx.request）
          const res = await new Promise((resolve, reject) => {
            wx.request({
              url: `${app.globalData.baseUrl}/memberMessage/queryList`, // 需配置全局baseUrl
              method: 'POST',
              data: {
                reciveceCode: userInfo.memberCode,
                isRead: 0
              },
              success: resolve,
              fail: reject
            })
          })
          let msgList = (res && res.data && res.data.data) || []
          let messageNum = Array.isArray(msgList) ? msgList.length : 0
          this.setData({
            messageNum: messageNum > 99 ? "99+" : messageNum
          })
        } else {
          this.setData({ messageNum: 0 })
        }
      } catch (e) {
        this.setData({ messageNum: 0 })
        console.error('获取消息数量失败:', e)
      }
    },

    // tab点击事件
    handleTabClick(e) {
      const { index, url } = e.currentTarget.dataset
      const currentIndex = parseInt(index)
      
      // 重复点击当前tab不处理
      if (this.data.activeTab === currentIndex) return
      
      // 更新激活状态
      this.setData({ activeTab: currentIndex })
      // 更新全局tab索引
      app.globalData.tabvalue = currentIndex
      // 切换tab页面
      wx.switchTab({ url })
      // 切换后重新获取消息数
      this.getMessageNum()
    }
  }
})