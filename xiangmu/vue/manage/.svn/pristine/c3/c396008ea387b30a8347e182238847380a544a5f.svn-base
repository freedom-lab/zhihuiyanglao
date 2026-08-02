<template>
    <div class="screenbg">
        <div id="index" class="insScreen-container" :style="indexTransformStyle">
            <div class="body" :class="`${currentComponent}`">
            <div class="login" @click="handleLogout">退出</div>
            <div class="date">
                <div class="time">{{ currentDay }}</div>
                <div class="day">{{ currentTime }}</div>
                <div class="week">{{ currentWeek }}</div>
                <div class="qp" style="z-index: 999;" @click="toggleFullscreen">
                <img :src="qpimg" alt="">
                <div>
                    <div class="button"> 全屏 </div>
                </div>
                </div>
            </div>
            <div class="top">
                <div class="title">城投养老服务监控可视化平台</div>
                <div class="menu">
                <div class="menu1 menu-left">
                    <div v-for="item,index in menuLeftList" :key="index" :class="currentComponent == item.component ? 'active':''" @click="currentComponent = item.component">
                        {{item.name}}
                    </div>
                </div>
                <div class="menu1 menu-right">
                    <div v-for="item,index in menuRightList" :key="index" :class="currentComponent == item.component ? 'active':''" @click="currentComponent = item.component">
                        {{item.name}}
                    </div>
                </div>
                </div>
            </div>

            <div class="main">
                <component :is="currentComponent"></component>
            </div>
            </div>
        </div>
    </div>
</template>

<script>
import menuLeft2 from './components/menuLeft2.vue';
import menuRight2 from './components/menuRight2.vue';
import menuRight3 from './components/menuRight3.vue';
import menuRight4 from './components/menuRight4.vue';
export default {
    name: 'insScreen',
    components: {
        menuLeft2,
        menuRight2,
        menuRight3,
        menuRight4,
    },
    data() {
        return {
            currentComponent: null,
            qpimg: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/icon/qp.png',

            // 大屏基准画布尺寸
            baseWidth: 1920,
            baseHeight: 1080,
            scale: 1,
            resizeTimer: null,
            menuLeftList: [
                // { name: '机构总览', component: 'menuLeft1' },
                { name: '运营分析', component: 'menuLeft2' },
                { name: '服务监管', component: 'menuRight2' },
                // { name: '健康监测', component: 'menuLeft3' },
                // { name: '睡眠监测', component: 'menuLeft4' },
                // { name: '跌倒监测', component: 'menuLeft5' },
            ],
            menuRightList: [
                // { name: '视频监控', component: 'menuRight1' },
                { name: '评估监管', component: 'menuRight3' },
                { name: '人员管理', component: 'menuRight4' },
            ],
            // 日期时间相关数据
            currentDay: '',
            currentTime: '',
            currentWeek: '',
            timer: null, // 定时器ID
        }
    },
    computed: {
        // 动态生成transform样式，保留原有translate(-50%,-50%)逻辑
        indexTransformStyle() {
            return {
                transform: `scale(${this.scale}) translate(-50%, -50%)`,
                WebkitTransform: `scale(${this.scale}) translate(-50%, -50%)`
            }
        },
    },
    mounted() {
        // 页面加载完成首次计算缩放
        this.calcScreenScale()
        // 监听窗口大小变化
        window.addEventListener('resize', this.handleWindowResize)
        this.currentComponent = 'menuRight2'

        // 启动日期时间更新
        this.updateDateTime()
        this.timer = setInterval(this.updateDateTime, 1000)
        
        // 监听全屏变化事件
        document.addEventListener('fullscreenchange', this.handleFullscreenChange)
        document.addEventListener('webkitfullscreenchange', this.handleFullscreenChange)
        document.addEventListener('mozfullscreenchange', this.handleFullscreenChange)
        document.addEventListener('MSFullscreenChange', this.handleFullscreenChange)
        
        // 监听键盘事件（回车键）
        window.addEventListener('keydown', this.handleKeydown)
    },
    beforeDestroy() {
        // 销毁移除监听，防止内存泄漏
        window.removeEventListener('resize', this.handleWindowResize)
        clearTimeout(this.resizeTimer)

        // 清除定时器
        if (this.timer) {
            clearInterval(this.timer)
            this.timer = null
        }
        
        // 移除全屏监听
        document.removeEventListener('fullscreenchange', this.handleFullscreenChange)
        document.removeEventListener('webkitfullscreenchange', this.handleFullscreenChange)
        document.removeEventListener('mozfullscreenchange', this.handleFullscreenChange)
        document.removeEventListener('MSFullscreenChange', this.handleFullscreenChange)
        
        // 移除键盘监听
        window.removeEventListener('keydown', this.handleKeydown)
    },
    methods: {
        // 计算适配缩放比例
        calcScreenScale() {
            const windowW = window.innerWidth
            const windowH = window.innerHeight
            // 分别计算宽、高缩放值
            const scaleW = windowW / this.baseWidth
            const scaleH = windowH / this.baseHeight
            // 取最小值，等比例完整显示不裁切
            this.scale = Math.min(scaleW, scaleH)
        },
        // 窗口防抖处理，避免频繁计算卡顿
        handleWindowResize() {
            clearTimeout(this.resizeTimer)
            this.resizeTimer = setTimeout(() => {
                this.calcScreenScale()
            }, 100)
        },

        // 1. 退出功能：关闭当前页面（尝试关闭窗口，若无法关闭则提示）
        handleLogout() {
            // 尝试关闭当前窗口（通常只有通过脚本打开的窗口才能关闭）
            if (window.close) {
                window.close()
            }
            // 如果无法关闭（例如主窗口），可改为退出登录跳转或提示
            // 可根据实际需求修改为：this.$router.push('/login') 等
        },
        
        // 2. 日期时间更新方法
        updateDateTime() {
            const now = new Date()
            
            // 格式化日期：YYYY-MM-DD
            const year = now.getFullYear()
            const month = String(now.getMonth() + 1).padStart(2, '0')
            const day = String(now.getDate()).padStart(2, '0')
            this.currentDay = `${year}-${month}-${day}`
            
            // 格式化时间：HH: MM: SS（注意原模板中有空格格式）
            const hours = String(now.getHours()).padStart(2, '0')
            const minutes = String(now.getMinutes()).padStart(2, '0')
            const seconds = String(now.getSeconds()).padStart(2, '0')
            this.currentTime = `${hours}: ${minutes}: ${seconds}`
            
            // 获取星期几
            const weekdays = ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六']
            this.currentWeek = weekdays[now.getDay()]
        },
        
        // 3. 全屏切换功能
        toggleFullscreen() {
            const element = document.documentElement // 全屏整个页面
            if (!this.isFullscreen()) {
                // 进入全屏
                const requestMethod = element.requestFullscreen ||
                    element.webkitRequestFullscreen ||
                    element.mozRequestFullScreen ||
                    element.msRequestFullscreen
                if (requestMethod) {
                    requestMethod.call(element)
                }
            } else {
                // 退出全屏
                const exitMethod = document.exitFullscreen ||
                    document.webkitExitFullscreen ||
                    document.mozCancelFullScreen ||
                    document.msExitFullscreen
                if (exitMethod) {
                    exitMethod.call(document)
                }
            }
        },
        
        // 判断当前是否全屏
        isFullscreen() {
            return !!(
                document.fullscreenElement ||
                document.webkitFullscreenElement ||
                document.mozFullScreenElement ||
                document.msFullscreenElement
            )
        },
        
        // 全屏变化时的回调（用于更新按钮文案等，可选）
        handleFullscreenChange() {
            // 可以在这里根据全屏状态修改按钮文字，比如“全屏”/“退出全屏”
            // 本需求只需实现功能，此处留空或打印日志
            // console.log('全屏状态变化:', this.isFullscreen())
        },
        
        // 键盘事件处理：回车键切换全屏
        handleKeydown(event) {
            // 检测回车键 (keyCode 13 或 key 'Enter')
            if (event.key === 'Enter' || event.keyCode === 13) {
                event.preventDefault() // 防止可能的默认行为
                this.toggleFullscreen()
            }
        },
    },
}
</script>

<style lang="scss" scoped>
@font-face {
    font-family: dy;
    src: url('../../../assets/fonts/dy.TTF') format("truetype");
}
.screenbg{
    width: 100%;
    height: 100%;
    background-color: #000;
}
#index {
    color: #d3d6dd;
    width: 1920px;
    height: 1080px;
    position: absolute;
    top: 50%;
    left: 50%;
    -webkit-transform: translate(-50%,-50%);
    transform: translate(-50%,-50%);
    -webkit-transform-origin: left top;
    transform-origin: left top;
    overflow: hidden
}

.body {
    position: relative;
    width: 1920px;
    height: 1080px;
    overflow: hidden
}

.body.bg,.body {
    position: relative;
    min-height: 100vh;
    /* 遮罩层挡住原图 */
    background: transparent;
    // background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/bg2.png');
    // background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg1.png');
    // background-size: 100% 100%;
    // background-position: 50%
}
/* 伪元素做模糊背景 */
.body.bg::before, .body::before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: -1;
  background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg1.png');
  background-size: 100% 100%;
  background-position: 50%;
}
.body.menuLeft2::before{
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg1.png?v=1.0.1');
    // /* 高斯模糊 */
    // filter: blur(1px);
    // /* 边缘模糊白边溢出，放大一点裁切 */
    // transform: scale(1.04);
}
.body.menuRight2::before{
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg2.png?v=1.0.1');
}
.body.menuRight3::before{
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg3.png?v=1.0.0');
}
.body.menuRight4::before{
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/sbg4.png?v=1.0.0');
}


.body .logo {
    position: absolute;
    top: 20px;
    left: 10px
}

.body .logo img {
    width: 109px;
    height: 36px
}

.body .login {
    position: absolute;
    top: 35px;
    right: 13px;
    z-index: 100;
    font-size: 20px;
    font-family: dy;
    cursor: pointer;
    padding: 1px 2px;
    border-radius: 5px;
    // color: #fff;
}

.body .login:hover {
    -webkit-box-shadow: 0 0 1.5px 1.5px #26a8ff;
    box-shadow: 0 0 1.5px 1.5px #26a8ff
}

.body .date {
    position: absolute;
    top: 15px;
    right: 20px;
    font-size: 16px;
    color: #fff
}

.body .date .qp,.body .date {
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex;
    -webkit-box-align: center;
    -ms-flex-align: center;
    align-items: center
}

.body .date .qp {
    cursor: pointer;
    color: #0ff
}

.body .date .qp img {
    width: 20px;
    height: 20px;
    margin-right: 5px
}

.body .date .time {
    margin-left: 30px;
    font-size: 18px;
    font-family: Source Han Sans CN;
    font-weight: 500;
    color: #fff
}

.body .date .week {
    color: #0ff;
    margin-right: 10px
}

.body .date .day,.body .date .week {
    margin-left: 10px;
    font-size: 18px;
    font-family: Source Han Sans CN;
    font-weight: 500
}

.body .date .day {
    color: #fff
}

.body .top {
    position: relative;
    width: 100%;
    height: 121px;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-bg.png');
    background-size: 100% 100%;
    background-position: 50%;
    z-index: 99
}

.body .top .title {
    line-height: 70px;
    font-size: 55px;
    color: #fff;
    letter-spacing: 2px;
    text-align: center;
    font-family: dy;
}

.body .top .menu {
    position: absolute;
    width: 100%;
    top: 50px
}

.body .top .menu .menu-left {
    position: absolute;
    left: 280px
}

.body .top .menu .menu-right {
    position: absolute;
    right: 280px
}

.body .top .menu .menu1 {
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex
}

.body .top .menu .menu1>div {
    position: relative;
    width: 100px;
    height: 41px;
    line-height: 41px;
    background-size: 100% 100%;
    background-position: 50%;
    font-size: 22px;
    font-weight: 700;
    color: #fff;
    text-align: center;
    cursor: pointer
}

.body .top .menu .menu1>div.active {
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/nav-bg-h.png');
    background-size: 100% 100%;
    background-position: 50%;
    color: #0ff
}

.body .top .menu .menu1>div:after {
    content: "";
    position: absolute;
    right: -8px;
    top: -2px;
    width: 15px;
    height: 45px;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/menu-gap.png');
    background-size: 100% 100%;
    background-position: 50%
}

.body .top .menu .menu2 {
    width: 840px
}

.main {
    height: calc(100% - 121px)
}
</style>