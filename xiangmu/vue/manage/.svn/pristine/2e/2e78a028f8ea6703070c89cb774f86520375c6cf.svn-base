<template>
  <div class="insScreen-main">
    <div class="page">
      <!-- 左侧区域 -->
      <div class="page-left">
        <div class="oldBox">
          <div class="tit">
            <img :src="titico">
            <h4>
              <span>用户明细统计</span>
            </h4>
          </div>
          <div class="oneCon">
            <div class="data-card-container">
              <div class="top-row">
                <div class="left-info">
                  <div class="title-area">
                    <div class="main-title">老人总数</div>
                  </div>
                </div>
                <div class="right-number">
                  <span class="num-text">0</span>
                  <div class="underline"></div>
                </div>
              </div>
              <div class="bottom-row">
                <div class="stat-item">
                  <div class="stat-label">本月新增入住数</div>
                  <div class="stat-value">0 <span class="unit">人</span></div>
                </div>
                <div class="stat-item">
                  <div class="stat-label">本月退住人数</div>
                  <div class="stat-value">0 <span class="unit">人</span></div>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="oldBox">
          <div class="tit">
            <img :src="titico">
            <h4>
              <span>用户分析</span>
            </h4>
          </div>
          <div class="twoCon">
            <div class="chart-wrapper1">
              <div class="gender-container">
                <div class="gender-item male">
                  <span class="gender-label">男性</span>
                  <div class="progress-bar-bg">
                    <div class="progress-bar-fill male-fill" style="width: 0%;"></div>
                  </div>
                  <span class="gender-value">0</span>
                </div>
                <div class="gender-item female">
                  <span class="gender-label">女性</span>
                  <div class="progress-bar-bg">
                    <div class="progress-bar-fill female-fill" style="width: 0%;"></div>
                  </div>
                  <span class="gender-value">0</span>
                </div>
              </div>
              <div class="content">
                <div id="gradeElderly" style="width: 100%; height: 200px;"></div>
              </div>
            </div>

            <div class="ability-chart-container">
              <div class="chart-header">
                <div style="display: flex; align-items: center;">
                  <span class="blue-bar"></span>
                  <div class="title-tab">
                    <span class="title-text">能力评估等级统计</span>
                  </div>
                </div>
              </div>
              <div class="chart-list">
                <div class="chart-item">
                  <div class="item-label">能力完好</div>
                  <div class="item-track">
                    <div class="item-bar" style="width: 0%;"></div>
                  </div>
                  <div class="item-value">0</div>
                </div>
                <div class="chart-item">
                  <div class="item-label">轻度失能</div>
                  <div class="item-track">
                    <div class="item-bar" style="width: 0%;"></div>
                  </div>
                  <div class="item-value">0</div>
                </div>
                <div class="chart-item">
                  <div class="item-label">中度失能</div>
                  <div class="item-track">
                    <div class="item-bar" style="width: 0%;"></div>
                  </div>
                  <div class="item-value">0</div>
                </div>
                <div class="chart-item">
                  <div class="item-label">重度失能</div>
                  <div class="item-track">
                    <div class="item-bar" style="width: 0%;"></div>
                  </div>
                  <div class="item-value">0</div>
                </div>
                <div class="chart-item">
                  <div class="item-label">完全失能</div>
                  <div class="item-track">
                    <div class="item-bar" style="width: 0%;"></div>
                  </div>
                  <div class="item-value">0</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- 中间区域 -->
      <div class="page-center">
        <div class="topNum">
          <div class="li">
            <img :src="topico1">
            <div class="con">
              <h4>
                <span class="count m-t-10">2017</span>
              </h4>
              <p>总床位数</p>
            </div>
          </div>
          <div class="li">
            <img :src="topico2">
            <div class="con">
              <h4>
                <span class="count m-t-10">2017</span>
              </h4>
              <p>入住人数</p>
            </div>
          </div>
          <div class="li">
            <img :src="topico3">
            <div class="con">
              <h4>
                <span class="count m-t-10">2017</span>
              </h4>
              <p>试住人数</p>
            </div>
          </div>
          <div class="li">
            <img :src="topico4">
            <div class="con">
              <h4>
                <span class="count m-t-10">2017</span>
              </h4>
              <p>预订床位</p>
            </div>
          </div>
          <div class="li">
            <img :src="topico5">
            <div class="con">
              <h4>
                <span class="count m-t-10">2017</span>
              </h4>
              <p>空闲床位</p>
            </div>
          </div>
        </div>

        <div class="map">
          <div class="nomap">
            <!-- <img :src="ch"> -->
          </div>
        </div>

        <div style="display: flex;">
          <!-- 护理等级统计 占40%宽度 -->
          <div class="oldBox" style="width: 40%;">
            <div class="tit">
              <img :src="titico">
              <h4>
                <span>护理等级统计</span>
              </h4>
            </div>
            <div class="fourCon">
              <div class="chart-wrapper2">
                <div class="content">
                  <div id="care-level-statistical" style="width: 100%; height: 200px;"></div>
                </div>
              </div>
            </div>
          </div>

          <!-- 用户增长趋势 占60%宽度 -->
          <div class="oldBox" style="width: 60%;">
            <div class="tit">
              <img :src="titico">
              <h4>
                <span>用户增长趋势</span>
              </h4>
            </div>
            <div class="fourCon">
              <div class="chart-wrapper3">
                <div class="content">
                  <div id="occupancy-trend" style="width: 100%; height: 210px;"></div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- 右侧区域 -->
      <div class="page-right">
        <div class="oldBox">
          <div class="tit">
            <img :src="titico">
            <h4>
              <span>职工明细统计</span>
            </h4>
          </div>

          <div class="serveCon">
            <div class="content-wrapper">
              <div class="row-top">
                <span class="label">员工总数</span>
                <span class="number-display">0</span>
              </div>
              <div class="row-bottom">
                <div class="data-item">
                  <span class="label">护理员总数</span>
                  <span class="value">0</span>
                </div>
                <div class="data-item">
                  <span class="label">持证率</span>
                  <span class="value">0%</span>
                </div>
              </div>
            </div>

            <!-- 员工年龄段统计 -->
            <div class="chart-wrapper4">
              <div class="chart-header">
                <div style="display: flex; align-items: center;">
                  <span class="blue-bar"></span>
                  <div class="title-tab">
                    <span class="title-text">员工年龄段统计</span>
                  </div>
                </div>
              </div>
              <div class="content">
                <div id="ageStatistics" style="width: 100%; height: 180px;"></div>
              </div>
            </div>

            <!-- 员工岗位统计 -->
            <div class="chart-wrapper5">
              <div class="chart-header">
                <div style="display: flex; align-items: center;">
                  <span class="blue-bar"></span>
                  <div class="title-tab">
                    <span class="title-text">员工岗位统计</span>
                  </div>
                </div>
              </div>
              <div class="content">
                <div id="post-statistical" style="width: 100%; height: 200px;"></div>
              </div>
            </div>

            <!-- 护理员证书等级统计 -->
            <div class="chart-wrapper6">
              <div class="chart-header">
                <div style="display: flex; align-items: center;">
                  <span class="blue-bar"></span>
                  <div class="title-tab">
                    <span class="title-text">护理员证书等级统计</span>
                  </div>
                </div>
              </div>
              <div class="content">
                <div id="certificate-level" style="width: 100%; height: 200px;"></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// 引入echarts
import * as echarts from 'echarts'
export default {
  name: 'menuRight2',
  data() {
    return {
        titico: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/tit-ico.png',
        JRHL: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/JRHL.png',
        fwlrs: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/fwlrs.png',
        hlrys: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/hlrys.png',
        fwpb: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/fwpb.png',
        ch: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/ch.png',
        topico1: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-ico1.png',
        topico2: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-ico2.png',
        topico3: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-ico3.png',
        topico4: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-ico4.png',
        topico5: 'https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/top-ico5.png',

        // 1.护理人员排行榜表格数据（暂无数据为空数组）
        staffRankTableData: [],
        // 2.自选服务实时工单模拟数据（和截图一致）
        serviceOrderTableData: [
          { num: 1, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-10' },
          { num: 2, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-08' },
          { num: 3, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-08' },
          { num: 4, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-09' },
          { num: 5, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-08' },
          { num: 6, name: '李测试', bed: '1号楼-1F-101-2', project: '助餐', state: '已完成', worker: '', duration: '-分钟', serviceTime: '2026-06-10' },
        ],
        // 3.自选服务项目排行榜数据
        projectRankTableData: [
          { projectName: '助餐', orderCount: 6, duration: '-分钟', totalPrice: '48.00' }
        ],

        // echarts实例缓存
        orderChart: null,
        typeChart: null,
    }
  },
  mounted() {
    // 等待dom渲染完成初始化图表
    this.$nextTick(() => {
      this.initOrderChart()
      this.initTypeChart()
    })
    // 窗口缩放自适应图表
    window.addEventListener('resize', this.resizeAllChart)
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.resizeAllChart)
    // 销毁echarts实例释放内存
    if(this.orderChart) this.orderChart.dispose()
    if(this.typeChart) this.typeChart.dispose()
  },
  methods: {
    // 工单统计 双轴柱状折线图
    initOrderChart() {
      const dom = this.$refs.orderChartRef
      this.orderChart = echarts.init(dom)
      const option = {
        tooltip: {
          trigger: 'axis',
          axisPointer: { type: 'cross', crossStyle: { color: '#0ff' } }
        },
        legend: {
          data: ['服务工单', '服务金额'],
          textStyle: { color: '#a0dfff' },
          right: 10
        },
        xAxis: [
          {
            type: 'category',
            data: ['01月','02月','03月','04月','05月','06月','07月','08月','09月','10月','11月','12月'],
            axisLine: { lineStyle: { color: 'rgba(75,159,255,0.3)' } },
            axisLabel: { color: '#a0dfff' }
          }
        ],
        yAxis: [
          {
            name: '单位：单',
            type: 'value',
            max: 500,
            axisLine: { lineStyle: { color: 'rgba(75,159,255,0.3)' } },
            axisLabel: { color: '#a0dfff' },
            splitLine: { lineStyle: { color: 'rgba(75,159,255,0.1)' } }
          },
          {
            name: '单位：元',
            type: 'value',
            max: 50,
            axisLine: { lineStyle: { color: 'rgba(75,159,255,0.3)' } },
            axisLabel: { color: '#a0dfff' },
            splitLine: { show: false }
          }
        ],
        series: [
          {
            name: '服务工单',
            type: 'line',
            yAxisIndex: 0,
            data: [0,0,0,0,0,6,0,0,0,0,0,0],
            itemStyle: { color: '#ff9900' }
          },
          {
            name: '服务金额',
            type: 'bar',
            yAxisIndex: 1,
            data: [0,0,0,0,0,48,0,0,0,0,0,0],
            itemStyle: { color: '#00ccff' }
          }
        ]
      }
      this.orderChart.setOption(option)
    },
    // 服务类别统计 环形饼图
    initTypeChart() {
      const dom = this.$refs.typeChartRef
      this.typeChart = echarts.init(dom)
      const option = {
        tooltip: { trigger: 'item' },
        series: [
          {
            name: '服务类别',
            type: 'pie',
            radius: ['60%', '85%'], // 环形
            legend: {
              orient: 'vertical',
              left: '0',
              top: 'center',
              textStyle: { color: '#a0dfff' }
            },
            avoidLabelOverlap: false,
            label: {
              show: false,
              position: 'outside',
              color: '#a0dfff',
              formatter: '{b} {c}项 {d}%'
            },
            data: [
              { value: 6, name: '生活护理' }
            ],
            itemStyle: {
              color: '#00ccff',
              borderColor: '#06214a',
              borderWidth: 3
            }
          }
        ]
      }
      this.typeChart.setOption(option)
    },
    // 窗口缩放所有图表自适应
    resizeAllChart() {
      if(this.orderChart) this.orderChart.resize()
      if(this.typeChart) this.typeChart.resize()
    },
  },
}
</script>

<style lang="scss" scoped>
@font-face {
    font-family: dy;
    src: url('../../../../assets/fonts/dy.TTF') format("truetype");
}
/* -------------------------- gender-container[data-v-62eaeb84] -------------------------- */
.gender-container {
    width: 440px;
    display: flex;
    flex-direction: column;
    gap: 12px;
    margin-bottom: 20px
}

/* gender-item[data-v-62eaeb84] */
.gender-item {
    width: 100%;
    height: 48px;
    box-sizing: border-box;
    padding: 0 20px;
    display: flex;
    align-items: center;
    position: relative
}

/* female[data-v-62eaeb84] */
.female {
    background: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/female-bg.png') no-repeat;
    background-size: 100% 100%
}

/* male[data-v-62eaeb84] */
.male {
    background: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/male-bg.png') no-repeat;
    background-size: 100% 100%
}

/* gender-label[data-v-62eaeb84] */
.gender-label {
    font-size: 16px;
    color: #fff;
    width: 50px;
    font-weight: 700;
    letter-spacing: 2px
}

/* progress-bar-bg[data-v-62eaeb84] */
.progress-bar-bg {
    flex: 1;
    height: 8px;
    background-color: hsla(0,0%,100%,.1);
    margin: 0 25px;
    position: relative;
    border-radius: 1px
}

/* progress-bar-fill[data-v-62eaeb84] */
.progress-bar-fill {
    height: 100%;
    transition: width .6s ease-in-out;
    border-radius: 1px
}

/* male-fill[data-v-62eaeb84] */
.male-fill {
    background: linear-gradient(90deg,rgba(0,240,255,.3),#00f0ff);
    box-shadow: 0 0 8px rgba(0,240,255,.5)
}

/* female-fill[data-v-62eaeb84] */
.female-fill {
    background: linear-gradient(90deg,rgba(255,183,0,.3),#ffb700);
    box-shadow: 0 0 8px rgba(255,183,0,.5)
}

/* gender-value[data-v-62eaeb84] */
.gender-value {
    font-size: 24px;
    font-weight: 700;
    letter-spacing: 1px;
    width: 80px;
    text-align: right
}

/* male .gender-value[data-v-62eaeb84] */
.male .gender-value {
    color: #00f0ff
}

/* female .gender-value[data-v-62eaeb84] */
.female .gender-value {
    color: #ffb700
}

/* content[data-v-62eaeb84] */
.content {
    width: 100%;
    position: relative
}

/* -------------------------- ability-chart-container[data-v-668dd42a] -------------------------- */
/* ability-chart-container .chart-header[data-v-668dd42a] */
.ability-chart-container .chart-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 20px
}

/* ability-chart-container .chart-header .blue-bar[data-v-668dd42a] */
.ability-chart-container .chart-header .blue-bar {
    width: 4px;
    height: 22px;
    background-color: #00a8ff;
    border-radius: 2px;
    margin-right: 2px
}

/* ability-chart-container .chart-header .title-tab[data-v-668dd42a] */
.ability-chart-container .chart-header .title-tab {
    display: flex;
    align-items: center;
    background: linear-gradient(90deg,#003680,rgba(0,85,255,0));
    border-radius: 4px 16px 16px 4px;
    padding: 6px 24px 6px 0;
    position: relative;
    padding-left: 8px
}

/* ability-chart-container .chart-header .title-tab .title-text[data-v-668dd42a] */
.ability-chart-container .chart-header .title-tab .title-text {
    color: #fff;
    font-size: 15px;
    font-weight: 500;
    letter-spacing: .5px
}

/* ability-chart-container .chart-header .unit-text[data-v-668dd42a] */
.ability-chart-container .chart-header .unit-text {
    color: #90caf9;
    font-size: 13px
}

/* ability-chart-container .chart-list[data-v-668dd42a] */
.ability-chart-container .chart-list {
    display: flex;
    flex-direction: column;
    gap: 18px
}

/* ability-chart-container .chart-item[data-v-668dd42a] */
.ability-chart-container .chart-item {
    display: flex;
    align-items: center;
    height: 30px
}

/* ability-chart-container .chart-item .item-label[data-v-668dd42a] */
.ability-chart-container .chart-item .item-label {
    width: 80px;
    font-size: 14px;
    color: #e5f1ff;
    text-align: justify;
    text-align-last: justify;
    padding-right: 15px
}

/* ability-chart-container .chart-item .item-track[data-v-668dd42a] */
.ability-chart-container .chart-item .item-track {
    flex: 1;
    height: 12px;
    background-color: rgba(0,40,100,.4);
    border: 1px solid #004bb3;
    border-radius: 6px;
    padding: 1px;
    box-sizing: border-box;
    position: relative;
    display: flex;
    align-items: center
}

/* ability-chart-container .chart-item .item-bar[data-v-668dd42a] */
.ability-chart-container .chart-item .item-bar {
    height: 100%;
    border-radius: 4px;
    background: linear-gradient(90deg,#00e5ff 0,#0084ff 60%,#1a5ccc);
    box-shadow: 0 0 6px rgba(0,229,255,.4);
    transition: width .6s ease-in-out
}

/* ability-chart-container .chart-item .item-value[data-v-668dd42a] */
.ability-chart-container .chart-item .item-value {
    width: 50px;
    font-size: 15px;
    font-weight: 600;
    color: #fff;
    text-align: left;
    padding-left: 15px;
    font-family: Arial,sans-serif
}

/* -------------------------- chart-wrapper[data-v-2a431a16] -------------------------- */
.chart-wrapper2 {
    width: 100%;
    padding: 16px;
    box-sizing: border-box;
    
    /* content[data-v-2a431a16] */
    .content {
        position: relative;
        width: 100%
    }

    /* chart-header[data-v-2a431a16] */
    .chart-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 20px
    }

    /* chart-header .blue-bar[data-v-2a431a16] */
    .chart-header .blue-bar {
        width: 4px;
        height: 22px;
        background-color: #00a8ff;
        border-radius: 2px;
        margin-right: 6px
    }

    /* chart-header .title-tab[data-v-2a431a16] */
    .chart-header .title-tab {
        display: flex;
        align-items: center;
        background: linear-gradient(90deg,#003680,rgba(0,85,255,0));
        border-radius: 4px 16px 16px 4px;
        padding: 6px 24px 6px 0;
        position: relative;
        padding-left: 8px
    }

    /* chart-header .title-tab .title-text[data-v-2a431a16] */
    .chart-header .title-tab .title-text {
        color: #fff;
        font-size: 15px;
        font-weight: 500;
        letter-spacing: .5px
    }
}


/* -------------------------- chart-wrapper[data-v-3126e2ce] -------------------------- */
.chart-wrapper3 {
    width: 100%;
    padding: 16px;
    box-sizing: border-box;
    
    /* content[data-v-3126e2ce] */
    .content {
        position: relative;
        width: 100%
    }

    /* chart-header[data-v-3126e2ce] */
    .chart-header {
        justify-content: space-between;
        margin-bottom: 10px;
        display: flex;
        align-items: center;
    }

    /* chart-header .title-tab[data-v-3126e2ce] */
    .chart-header .title-tab {
        display: flex;
        align-items: center;
        background: hsla(0,0%,100%,.07);
        border: 1px solid hsla(0,0%,100%,.1);
        border-radius: 8px;
        padding: 6px 20px;
        position: relative
    }

    /* chart-header .title-tab .title-text[data-v-3126e2ce] */
    .chart-header .title-tab .title-text {
        color: #fff;
        font-size: 15px;
        font-weight: 700;
        letter-spacing: .5px
    }
}


/* -------------------------- chart-wrapper[data-v-21aeff44] -------------------------- */
.chart-wrapper4 {
    width: 100%;
    padding: 16px;
    box-sizing: border-box;
    
    /* content[data-v-21aeff44] */
    .content {
        position: relative;
        width: 100%
    }

    /* chart-header[data-v-21aeff44] */
    .chart-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 20px
    }

    /* chart-header .blue-bar[data-v-21aeff44] */
    .chart-header .blue-bar {
        width: 4px;
        height: 22px;
        background-color: #00a8ff;
        border-radius: 2px;
        margin-right: 2px
    }

    /* chart-header .title-tab[data-v-21aeff44] */
    .chart-header .title-tab {
        display: flex;
        align-items: center;
        background: linear-gradient(90deg,#003680,rgba(0,85,255,0));
        border-radius: 4px 16px 16px 4px;
        padding: 6px 24px 6px 0;
        position: relative;
        padding-left: 8px
    }

    /* chart-header .title-tab .title-text[data-v-21aeff44] */
    .chart-header .title-tab .title-text {
        color: #fff;
        font-size: 15px;
        font-weight: 500;
        letter-spacing: .5px
    }

    /* chart-header .unit-text[data-v-21aeff44] */
    .chart-header .unit-text {
        color: #90caf9;
        font-size: 13px
    }
}


/* -------------------------- chart-wrapper[data-v-448f4a93] -------------------------- */
.chart-wrapper5 {
    width: 100%;
    
    /* content[data-v-448f4a93] */
    .content {
        position: relative;
        width: 100%
    }

    /* chart-header[data-v-448f4a93] */
    .chart-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 20px
    }

    /* chart-header .blue-bar[data-v-448f4a93] */
    .chart-header .blue-bar {
        width: 4px;
        height: 22px;
        background-color: #00a8ff;
        border-radius: 2px;
        margin-right: 2px
    }

    /* chart-header .title-tab[data-v-448f4a93] */
    .chart-header .title-tab {
        display: flex;
        align-items: center;
        background: linear-gradient(90deg,#003680,rgba(0,85,255,0));
        border-radius: 4px 16px 16px 4px;
        padding: 6px 24px 6px 0;
        position: relative;
        padding-left: 8px
    }

    /* chart-header .title-tab .title-text[data-v-448f4a93] */
    .chart-header .title-tab .title-text {
        color: #fff;
        font-size: 15px;
        font-weight: 500;
        letter-spacing: .5px
    }
}


/* -------------------------- chart-wrapper[data-v-5fc8f673] -------------------------- */
.chart-wrapper6 {
    width: 100%;
    padding: 16px;
    box-sizing: border-box;
    

    /* content[data-v-5fc8f673] */
    .content {
        position: relative;
        width: 100%
    }

    /* chart-header[data-v-5fc8f673] */
    .chart-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 12px
    }

    /* chart-header .blue-bar[data-v-5fc8f673] */
    .chart-header .blue-bar {
        width: 4px;
        height: 22px;
        background-color: #00a8ff;
        border-radius: 2px;
        margin-right: 6px
    }

    /* chart-header .title-tab[data-v-5fc8f673] */
    .chart-header .title-tab {
        display: flex;
        align-items: center;
        background: linear-gradient(90deg,#003680,rgba(0,85,255,0));
        border-radius: 4px 16px 16px 4px;
        padding: 6px 24px 6px 0;
        position: relative;
        padding-left: 8px
    }

    /* chart-header .title-tab .title-text[data-v-5fc8f673] */
    .chart-header .title-tab .title-text {
        color: #fff;
        font-size: 15px;
        font-weight: 500;
        letter-spacing: .5px
    }
}

/* -------------------------- [data-v-7cb68f0d] 弹窗1 -------------------------- */
.el-dialog {
    width: 1050px;
    height: 680px;
    margin-top: 100px!important;
    background-color: transparent;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/dialog-bg.png');
    background-repeat: no-repeat;
    background-size: 100% 100%;
    background-position: 50%
}

/* [data-v-7cb68f0d] .el-dialog__header */
.el-dialog__header {
    padding: 10px 88px 0 38px
}

/* [data-v-7cb68f0d] .el-dialog__title */
.el-dialog__title {
    font-size: 18px;
    font-weight: 700;
    color: #fff!important
}

/* [data-v-7cb68f0d] .el-dialog__body */
.el-dialog__body {
    padding: 10px 30px
}

/* search-bar[data-v-7cb68f0d] */
.search-bar {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    gap: 10px
}

/* search-bar .dark-input[data-v-7cb68f0d] */
.search-bar .dark-input {
    width: 220px
}

/* search-bar .dark-input .el-input__inner[data-v-7cb68f0d] */
.search-bar .dark-input .el-input__inner {
    background-color: rgba(0,36,78,.6);
    border: 1px solid #005bb7;
    color: #fff
}

/* placeholder[data-v-7cb68f0d] */
.search-bar .dark-input .el-input__inner::placeholder {
    color: #7299c4
}

/* search-bar .btn-search[data-v-7cb68f0d] */
.search-bar .btn-search {
    background-color: #0084ff;
    border-color: #0084ff;
    color: #fff
}
.search-bar .btn-search:hover {
    background-color: #2294ff
}

/* search-bar .btn-reset[data-v-7cb68f0d] */
.search-bar .btn-reset {
    background-color: hsla(0,0%,100%,.1);
    border: 1px solid #54759e;
    color: #bccde0
}
.search-bar .btn-reset:hover {
    background-color: hsla(0,0%,100%,.2);
    color: #fff
}

/* content[data-v-7cb68f0d] */
.content {
    padding: 5px 0 0;
    display: flex;
    flex-direction: column;
    // height: 560px
}

/* content .table-wrapper[data-v-7cb68f0d] */
.content .table-wrapper {
    flex: 1;
    overflow-y: auto
}

/* content .table-wrapper .dark-table[data-v-7cb68f0d] */
.content .table-wrapper .dark-table {
    background: transparent
}
.content .table-wrapper .dark-table:before {
    display: none
}

/* tr[data-v-7cb68f0d] */
.content .table-wrapper .dark-table tr {
    background-color: rgba(0,32,68,.3)!important;
    color: #d1e3f7
}
.content .table-wrapper .dark-table tr:nth-child(2n) {
    background-color: rgba(0,46,98,.4)!important
}
.content .table-wrapper .dark-table tr:hover>td {
    background-color: rgba(0,84,163,.5)!important
}

/* td th.is-leaf[data-v-7cb68f0d] */
.content .table-wrapper .dark-table td,.content .table-wrapper .dark-table th.is-leaf {
    border-bottom: 1px solid hsla(0,0%,100%,.05)
}

/* content .pagination-wrapper[data-v-7cb68f0d] */
.content .pagination-wrapper {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    margin-top: 15px;
    color: #a5c3e6;
    font-size: 13px
}

/* total-text[data-v-7cb68f0d] */
.content .pagination-wrapper .total-text {
    margin-right: 10px
}

/* dark-pagination 文字颜色[data-v-7cb68f0d] */
.content .pagination-wrapper .dark-pagination .el-pagination__jump,.content .pagination-wrapper .dark-pagination .el-pagination__total {
    color: #a5c3e6
}

/* 分页输入框[data-v-7cb68f0d] */
.content .pagination-wrapper .dark-pagination .el-input__inner {
    background-color: rgba(0,32,68,.8)!important;
    border: 1px solid #1a518c!important;
    color: #fff
}

/* 分页按钮[data-v-7cb68f0d] */
.content .pagination-wrapper .dark-pagination .btn-next,.content .pagination-wrapper .dark-pagination .btn-prev,.content .pagination-wrapper .dark-pagination .el-pager li {
    background-color: rgba(0,32,68,.6)!important;
    border: 1px solid #1a518c;
    color: #a5c3e6!important;
    min-width: 28px;
    height: 28px;
    line-height: 26px;
    margin: 0 3px;
    padding: 0
}
.content .pagination-wrapper .dark-pagination .el-pager li.active {
    background-color: #0076e4!important;
    border-color: #0076e4;
    color: #fff!important
}
.content .pagination-wrapper .dark-pagination .el-pager li:not(.active):hover {
    color: #0084ff!important;
    border-color: #0084ff
}

/* close[data-v-7cb68f0d] */
.close {
    width: 52px;
    height: 30px;
    background-color: transparent;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/close.png');
    position: absolute;
    top: -7px;
    right: -4px;
    cursor: pointer
}

/* -------------------------- [data-v-0ea98204] 弹窗2 -------------------------- */
.el-dialog {
    width: 1050px;
    height: 680px;
    margin-top: 100px!important;
    background-color: transparent;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/dialog-bg.png');
    background-repeat: no-repeat;
    background-size: 100% 100%;
    background-position: 50%
}

/* [data-v-0ea98204] .el-dialog__header */
.el-dialog__header {
    padding: 10px 88px 0 38px
}

/* [data-v-0ea98204] .el-dialog__title */
.el-dialog__title {
    font-size: 18px;
    font-weight: 700;
    color: #fff!important
}

/* [data-v-0ea98204] .el-dialog__body */
.el-dialog__body {
    padding: 10px 30px
}

/* search-bar[data-v-0ea98204] */
.search-bar {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    gap: 10px
}

/* search-bar .dark-input[data-v-0ea98204] */
.search-bar .dark-input {
    width: 220px
}

/* input inner[data-v-0ea98204] */
.search-bar .dark-input .el-input__inner {
    background-color: rgba(0,36,78,.6);
    border: 1px solid #005bb7;
    color: #fff
}
.search-bar .dark-input .el-input__inner::placeholder {
    color: #7299c4
}

/* btn-search[data-v-0ea98204] */
.search-bar .btn-search {
    background-color: #0084ff;
    border-color: #0084ff;
    color: #fff
}
.search-bar .btn-search:hover {
    background-color: #2294ff
}

/* btn-reset[data-v-0ea98204] */
.search-bar .btn-reset {
    background-color: hsla(0,0%,100%,.1);
    border: 1px solid #54759e;
    color: #bccde0
}
.search-bar .btn-reset:hover {
    background-color: hsla(0,0%,100%,.2);
    color: #fff
}

/* content[data-v-0ea98204] */
.content {
    padding: 5px 0 0;
    display: flex;
    flex-direction: column;
    // height: 560px
}

/* table-wrapper[data-v-0ea98204] */
.content .table-wrapper {
    flex: 1;
    overflow-y: auto
}

/* dark-table[data-v-0ea98204] */
.content .table-wrapper .dark-table {
    background: transparent
}
.content .table-wrapper .dark-table:before {
    display: none
}

/* table tr[data-v-0ea98204] */
.content .table-wrapper .dark-table tr {
    background-color: rgba(0,32,68,.3)!important;
    color: #d1e3f7
}
.content .table-wrapper .dark-table tr:nth-child(2n) {
    background-color: rgba(0,46,98,.4)!important
}
.content .table-wrapper .dark-table tr:hover>td {
    background-color: rgba(0,84,163,.5)!important
}

/* td th[data-v-0ea98204] */
.content .table-wrapper .dark-table td,.content .table-wrapper .dark-table th.is-leaf {
    border-bottom: 1px solid hsla(0,0%,100%,.05)
}

/* pagination-wrapper[data-v-0ea98204] */
.content .pagination-wrapper {
    display: flex;
    justify-content: flex-end;
    align-items: center;
    margin-top: 15px;
    color: #a5c3e6;
    font-size: 13px
}

/* total-text[data-v-0ea98204] */
.content .pagination-wrapper .total-text {
    margin-right: 10px
}

/* 分页文字[data-v-0ea98204] */
.content .pagination-wrapper .dark-pagination .el-pagination__jump,.content .pagination-wrapper .dark-pagination .el-pagination__total {
    color: #a5c3e6
}

/* 分页输入框[data-v-0ea98204] */
.content .pagination-wrapper .dark-pagination .el-input__inner {
    background-color: rgba(0,32,68,.8)!important;
    border: 1px solid #1a518c!important;
    color: #fff
}

/* 分页按钮[data-v-0ea98204] */
.content .pagination-wrapper .dark-pagination .btn-next,.content .pagination-wrapper .dark-pagination .btn-prev,.content .pagination-wrapper .dark-pagination .el-pager li {
    background-color: rgba(0,32,68,.6)!important;
    border: 1px solid #1a518c;
    color: #a5c3e6!important;
    min-width: 28px;
    height: 28px;
    line-height: 26px;
    margin: 0 3px;
    padding: 0
}
.content .pagination-wrapper .dark-pagination .el-pager li.active {
    background-color: #0076e4!important;
    border-color: #0076e4;
    color: #fff!important
}
.content .pagination-wrapper .dark-pagination .el-pager li:not(.active):hover {
    color: #0084ff!important;
    border-color: #0084ff
}

/* close[data-v-0ea98204] */
.close {
    width: 52px;
    height: 30px;
    background-color: transparent;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/close.png');
    position: absolute;
    top: -7px;
    right: -4px;
    cursor: pointer
}

/* -------------------------- 页面布局 [data-v-26ea368a] -------------------------- */
/* nomap[data-v-26ea368a] */
.nomap {
    align-items: center;
    justify-content: center;
    padding-top: 100px;
    height: 650px;
    display: flex;
}

/* page[data-v-26ea368a] */
.page {
    position: relative;
    padding: 0 20px;
    display: flex;
}

/* page-left[data-v-26ea368a] */
.page .page-left {
    width: 470px
}

/* page-center[data-v-26ea368a] */
.page .page-center {
    position: relative;
    flex: 1;
    margin: 0 20px
}

/* page-right[data-v-26ea368a] */
.page .page-right {
    width: 470px
}

/* oldBox[data-v-26ea368a] */
.oldBox {
    margin-top: 20px
}

/* oldBox .tit[data-v-26ea368a] */
.oldBox .tit {
    position: relative;
    display: flex;
    align-items: center;
}

/* oldBox .tit img[data-v-26ea368a] */
.oldBox .tit img {
    width: 30px;
    height: 30px
}

/* oldBox .tit h4[data-v-26ea368a] */
.oldBox .tit h4 {
    flex: 1;
    height: 46px;
    line-height: 46px;
    padding-left: 15px;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/line1.png');
    background-size: 100% 100%;
    background-position: 50%;
    font-size: 20px;
    font-family: dy;
    font-weight: 400;
    color: #fff
}

/* h4 span 文字渐变[data-v-26ea368a] */
.oldBox .tit h4 span {
    background: linear-gradient(90deg,#8bc7ff,#fff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

/* radioA[data-v-26ea368a] */
.oldBox .tit .radioA {
    position: absolute;
    top: 8px;
    right: 0
}

/* twoCon .ul[data-v-26ea368a] */
.twoCon .ul {
    display: flex;
    align-items: center;
    margin-top: 10px
}

/* li[data-v-26ea368a] */
.twoCon .ul .li {
    position: relative;
    width: 33.3%;
    height: 46px;
    padding-left: 14px;
    padding-top: 5px
}

/* li h3[data-v-26ea368a] */
.twoCon .ul .li .h3 {
    font-size: 20px;
    font-family: dy
}

/* li p[data-v-26ea368a] */
.twoCon .ul .li .p {
    font-size: 16px;
    font-family: dy
}

/* li.li1:before[data-v-26ea368a] */
.twoCon .ul .li.li1:before {
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    width: 4px;
    height: 46px;
    background: #fc0;
    opacity: .6;
    border-right: 2px solid #001869
}
.twoCon .ul .li.li1 {
    background: linear-gradient(90deg,rgba(255,204,0,.36) 64%,transparent)
}
.twoCon .ul .li.li1 .h3 {
    color: #ffcc30
}

/* li.li2:before[data-v-26ea368a] */
.twoCon .ul .li.li2:before {
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    width: 4px;
    height: 46px;
    background: #00cbff;
    opacity: .6;
    border-right: 2px solid #001869
}
.twoCon .ul .li.li2 {
    background: linear-gradient(90deg,rgba(0,203,255,.36) 64%,transparent)
}
.twoCon .ul .li.li2 .h3 {
    color: #00ccfd
}

/* li.li3:before[data-v-26ea368a] */
.twoCon .ul .li.li3:before {
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    width: 4px;
    height: 46px;
    background: #00cbff;
    opacity: .6;
    border-right: 2px solid #001869
}
.twoCon .ul .li.li3 {
    background: linear-gradient(90deg,rgba(0,203,255,.36) 64%,transparent)
}
.twoCon .ul .li.li3 .h3 {
    color: #00ccfd
}

/* twoCon .title[data-v-26ea368a] */
.twoCon .title {
    display: flex;
    align-items: center;
    margin-top: 10px;
    height: 30px;
    background: linear-gradient(-90deg,rgba(0,19,38,0),rgba(0,86,163,.55) 43%,rgba(0,86,163,.59) 87%,rgba(129,189,255,0));
    font-size: 16px;
    color: #d9eaf5
}
.twoCon .title:before {
    content: "";
    display: block;
    width: 4px;
    height: 20px;
    background: linear-gradient(0deg,#015eea,#00c0fa);
    border-radius: 2px;
    margin-right: 10px
}

/* topNum[data-v-26ea368a] */
.topNum {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    display: flex;
    justify-content: space-evenly;
}

/* topNum .li[data-v-26ea368a] */
.topNum .li {
    width: 20%;
    display: flex;
}

/* li img[data-v-26ea368a] */
.topNum .li img {
    width: 60px;
    height: 60px;
    margin-right: 10px
}

/* li .con[data-v-26ea368a] */
.topNum .li .con {
    flex: 1;
}

/* con h4 渐变文字[data-v-26ea368a] */
.topNum .li .con h4 {
    margin-top: 5px;
    font-size: 28px;
    font-family: dy;
    background: linear-gradient(0deg,#61dffe,#44a5ff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

/* con p[data-v-26ea368a] */
.topNum .li .con p {
    // margin-top: 8px;
    line-height: 1.5;
    font-size: 16px;
    color: #fff
}

.topNum {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex
}

.topNum .li {
    width: 20%;
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex
}

.topNum .li img {
    width: 72px;
    height: 63px
}

.topNum .li .con {
    -webkit-box-flex: 1;
    -ms-flex: 1;
    flex: 1
}

.topNum .li .con h4 {
    margin-top: 5px;
    font-size: 28px;
    font-family: dy;
    background: -webkit-gradient(linear,left bottom,left top,from(#61dffe),to(#44a5ff));
    background: linear-gradient(0deg,#61dffe,#44a5ff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

.topNum .li .con p {
    line-height: 1.5;
    font-size: 16px;
    color: #fff
}


/* serveCon .li[data-v-26ea368a] */
.serveCon .li {
    width: 365px;
    height: 54px;
    padding-left: 70px;
    padding-top: 6px;
    margin: 14px auto 0
}

/* li.li1 背景[data-v-26ea368a] */
.serveCon .li.li1 {
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/yh-bg1.png');
    background-size: 100% 100%
}
.serveCon .li.li1 .h3 {
    font-size: 16px;
    color: #3f8afc;
    background: linear-gradient(0deg,#5bb8ed,#fff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}
.serveCon .li.li1 .p {
    font-family: dy;
    font-size: 24px;
    color: #fff;
    background: linear-gradient(0deg,#d5f6ff,#6ac5ff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

/* li.li2 背景[data-v-26ea368a] */
.serveCon .li.li2 {
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/yh-bg2.png');
    background-size: 100% 100%
}
.serveCon .li.li2 .h3 {
    font-size: 16px;
    color: #3f8afc;
    background: linear-gradient(0deg,#46e87b,#fff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}
.serveCon .li.li2 .p {
    font-family: dy;
    font-size: 24px;
    color: #fff;
    background: linear-gradient(0deg,#8bffb1,#33e26c);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

/* li.li3 背景[data-v-26ea368a] */
.serveCon .li.li3 {
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/yh-bg3.png');
    background-size: 100% 100%
}
.serveCon .li.li3 .h3 {
    font-size: 16px;
    color: #3f8afc;
    background: linear-gradient(0deg,#ffd791,#fff);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}
.serveCon .li.li3 .p {
    font-family: dy;
    font-size: 24px;
    color: #fff;
    background: linear-gradient(0deg,#fff3d5,#ffb640);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent
}

/* sexCon[data-v-26ea368a] */
.sexCon {
    position: relative;
}
.sexCon img {
    position: absolute;
    top: 26px;
    left: 61px
}

/* el-radio-button 单选按钮[data-v-26ea368a] */
.el-radio-button__inner {
    background: transparent;
    border: 1px solid #00519d;
    color: #b2dbff
}
.el-radio-button__orig-radio:checked + .el-radio-button__inner {
    background: #00519d;
}
.el-radio-button:first-child .el-radio-button__inner {
    border-left: 1px solid #00519d;
}

/* data-card-container[data-v-26ea368a] */
.data-card-container {
    width: 100%;
    height: 210px;
    padding: 24px;
    box-sizing: border-box;
    background: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/userBJ.png');
    background-size: cover;
    background-position: 50%;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    font-family: Helvetica Neue,Helvetica,PingFang SC,Hiragino Sans GB,Microsoft YaHei,Arial,sans-serif;
}

/* top-row[data-v-26ea368a] */
.data-card-container .top-row {
    position: relative;
    display: flex;
}

/* left-info[data-v-26ea368a] */
.data-card-container .top-row .left-info {
    display: flex;
    align-items: center;
}

/* title-area[data-v-26ea368a] */
.data-card-container .top-row .left-info .title-area {
    display: flex;
    flex-direction: column;
    padding: 30px 0 0 95px;
}

/* main-title[data-v-26ea368a] */
.data-card-container .top-row .left-info .title-area .main-title {
    color: #a0dfff;
    font-size: 20px;
    font-weight: 700;
    letter-spacing: 1px;
}

/* right-number[data-v-26ea368a] */
.data-card-container .top-row .right-number {
    cursor: pointer;
    position: absolute;
    top: 30px;
    right: 90px;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
}

/* num-text[data-v-26ea368a] */
.data-card-container .top-row .right-number .num-text {
    font-size: 36px;
    font-weight: 700;
    color: #fff3cf;
    text-shadow: 0 0 10px rgba(254,231,153,.6);
    letter-spacing: 2px;
    line-height: 1;
}

/* underline[data-v-26ea368a] */
.data-card-container .top-row .right-number .underline {
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg,#fde492 0);
    margin-top: 4px;
}

/* bottom-row[data-v-26ea368a] */
.data-card-container .bottom-row {
    display: flex;
    justify-content: space-around;
    margin-top: 10px;
}

/* stat-item[data-v-26ea368a] */
.data-card-container .bottom-row .stat-item {
    text-align: center;
    flex: 1;
}

/* stat-label[data-v-26ea368a] */
.data-card-container .bottom-row .stat-item .stat-label {
    color: #a0dfff;
    font-size: 15px;
    margin-bottom: 8px;
}

/* stat-value[data-v-26ea368a] */
.data-card-container .bottom-row .stat-item .stat-value {
    color: #fff;
    font-size: 24px;
    font-weight: 700;
}
.data-card-container .bottom-row .stat-item .stat-value .unit {
    font-size: 14px;
    color: #a0dfff;
    font-weight: 400;
    margin-left: 4px;
}

/* content-wrapper[data-v-26ea368a] */
.content-wrapper {
    height: 100px;
    background-image: url('https://zhky.ahjykjxx.com/resources/visualization/insScreen/img/user.png');
    background-size: cover;
    background-position: 50%;
    position: relative;
    margin-top: 10px;
}

/* label[data-v-26ea368a] */
.content-wrapper .label {
    font-size: 18px;
    color: #a3ccf5;
    letter-spacing: 1px;
}

/* row-top[data-v-26ea368a] */
.content-wrapper .row-top {
    cursor: pointer;
    position: absolute;
    top: 20px;
    left: 150px;
    display: flex;
    align-items: flex-end;
    gap: 25px;
}

/* row-top label[data-v-26ea368a] */
.content-wrapper .row-top .label {
    font-size: 20px;
    color: #cde2ff;
    font-weight: 700;
    text-shadow: 0 0 4px rgba(0,162,255,.5);
}

/* number-display[data-v-26ea368a] */
.content-wrapper .row-top .number-display {
    font-size: 26px;
    color: #fff;
    font-family: Arial,sans-serif;
    font-weight: 700;
    letter-spacing: 2px;
    position: relative;
    padding-bottom: 2px;
    text-shadow: 0 0 8px hsla(0,0%,100%,.6);
}
.content-wrapper .row-top .number-display:after {
    content: "";
    position: absolute;
    bottom: 0;
    left: -4px;
    right: -4px;
    height: 2px;
    background-color: #79c9ff;
    box-shadow: 0 1px 6px #00a2ff;
}

/* row-bottom[data-v-26ea368a] */
.content-wrapper .row-bottom {
    position: absolute;
    bottom: 20px;
    left: 150px;
    display: flex;
    align-items: center;
    gap: 30px;
}

/* data-item[data-v-26ea368a] */
.content-wrapper .row-bottom .data-item {
    display: flex;
    align-items: center;
    gap: 12px;
}

/* value[data-v-26ea368a] */
.content-wrapper .row-bottom .data-item .value {
    font-size: 18px;
    color: #fff;
    font-weight: 700;
    font-family: Arial,sans-serif;
    letter-spacing: 1px;
}
</style>