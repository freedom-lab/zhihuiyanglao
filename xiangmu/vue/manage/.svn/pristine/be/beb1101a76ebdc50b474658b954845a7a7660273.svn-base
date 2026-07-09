<template>
  <div class="dashboard-page">
    <div class="dashboard-container">
      <!-- 第一行 -->
      <div class="card">
        <div class="card-header">
          <div class="card-title">当月收入（单位：元）</div>
        </div>
        <div class="card-body income-card">
          <div class="income-info">
            <div class="info-item">
              <img class="money-img" src="@/assets/images/dataCenter/InsAdminWel/Dashboard/money-blue.png" alt="">
              <div class="text-wrap">
                <span class="info-label">应收费用</span>
                <span class="info-value">3000.00</span>
              </div>
            </div>
            <div class="info-item">
              <img class="money-img" src="@/assets/images/dataCenter/InsAdminWel/Dashboard/money-yellow.png" alt="">
              <div class="text-wrap">
                <span class="info-label">实收金额</span>
                <span class="info-value">3000.00</span>
              </div>
            </div>
            <div class="info-item">
              <img class="money-img" src="@/assets/images/dataCenter/InsAdminWel/Dashboard/money-red.png" alt="">
              <div class="text-wrap">
                <span class="info-label">欠费金额</span>
                <span class="info-value">5300.00</span>
              </div>
            </div>
          </div>
          <div class="chart-placeholder">
            <div ref="incomeChart" class="chart-box"></div>
            <div class="legend">
              <div class="legend-item"><span class="color-block care"></span> 护理费(¥600)</div>
              <div class="legend-item"><span class="color-block bed"></span> 床位费(¥600)</div>
              <div class="legend-item"><span class="color-block deposit"></span> 入住押金(¥500)</div>
              <div class="legend-item"><span class="color-block meal"></span> 餐费(¥300)</div>
              <div class="legend-item"><span class="color-block medical"></span> 医疗备用金(¥1000)</div>
            </div>
          </div>
        </div>
      </div>

      <div class="card">
        <div class="card-header">
          <div class="card-title">今日实时数据</div>
        </div>
        <div class="card-body realtime-card">
          <div class="realtime-row">
            <div class="realtime-item">
              <span class="item-label">今日在院老人数</span>
              <span class="item-value">3</span>
            </div>
            <div class="realtime-item">
              <span class="item-label">核定床位数</span>
              <span class="item-value">12</span>
            </div>
            <div class="occupancy-rate">
              <div ref="occupancyChart" class="rate-chart"></div>
            </div>
          </div>
          <div class="realtime-grid">
            <div class="grid-item"><span class="grid-label">今日入住</span><span class="grid-value">0</span></div>
            <div class="grid-item"><span class="grid-label">今日预约</span><span class="grid-value">0</span></div>
            <div class="grid-item"><span class="grid-label">今日来访</span><span class="grid-value">0</span></div>
            <div class="grid-item"><span class="grid-label">今日离院</span><span class="grid-value">1</span></div>
            <div class="grid-item"><span class="grid-label">本月入住</span><span class="grid-value">3</span></div>
            <div class="grid-item"><span class="grid-label">本月预约</span><span class="grid-value">0</span></div>
            <div class="grid-item"><span class="grid-label">本月来访</span><span class="grid-value">0</span></div>
            <div class="grid-item"><span class="grid-label">本月离院</span><span class="grid-value">2</span></div>
          </div>
        </div>
      </div>

      <div class="card card-span-2-rows">
        <div class="card-header">
          <div class="card-title">老人画像</div>
        </div>
        <div class="card-body profile-card">
          <div class="profile-item">
            <div class="profile-chart"><div ref="ageChart" class="small-chart"></div></div>
            <div class="profile-legend">
              <div class="legend-item"><span class="color-block red"></span> 60岁以下 0人</div>
              <div class="legend-item"><span class="color-block blue"></span> 60-69岁 1人</div>
              <div class="legend-item"><span class="color-block yellow"></span> 70-79岁 2人</div>
              <div class="legend-item"><span class="color-block purple"></span> 80-89岁 0人</div>
              <div class="legend-item"><span class="color-block teal"></span> 90-99岁 0人</div>
              <div class="legend-item"><span class="color-block pink"></span> 100岁及以上 0人</div>
            </div>
          </div>
          <div class="profile-item">
            <div class="profile-chart"><div ref="genderChart" class="small-chart"></div></div>
            <div class="profile-legend">
              <div class="legend-item"><span class="color-block red"></span> 女 1人</div>
              <div class="legend-item"><span class="color-block blue"></span> 男 2人</div>
            </div>
          </div>
          <div class="profile-item">
            <div class="profile-chart"><div ref="careLevelChart" class="small-chart"></div></div>
            <div class="profile-legend">
              <div class="legend-item"><span class="color-block red"></span> 自理 2人</div>
              <div class="legend-item"><span class="color-block blue"></span> 轻度 1人</div>
              <div class="legend-item"><span class="color-block yellow"></span> 中度 0人</div>
              <div class="legend-item"><span class="color-block purple"></span> 重度 0人</div>
            </div>
          </div>
          <div class="profile-item">
            <div class="profile-chart"><div ref="abilityChart" class="small-chart"></div></div>
            <div class="profile-legend">
              <div class="legend-item"><span class="color-block red"></span> 完全失能 0人</div>
              <div class="legend-item"><span class="color-block blue"></span> 重度失能 0人</div>
              <div class="legend-item"><span class="color-block yellow"></span> 中度失能 0人</div>
              <div class="legend-item"><span class="color-block purple"></span> 轻度失能 1人</div>
              <div class="legend-item"><span class="color-block teal"></span> 能力完好 2人</div>
              <div class="legend-item"><span class="color-block pink"></span> 未评定 0人</div>
            </div>
          </div>
        </div>
      </div>

      <!-- 第二行 -->
      <div class="card">
        <div class="card-header">
          <div class="card-title">护理员持证统计</div>
        </div>
        <div class="card-body">
          <div ref="barChart" class="chart-bar"></div>
        </div>
      </div>

      <div class="card">
        <div class="card-header">
          <div class="card-title">员工岗位统计</div>
        </div>
        <div class="card-body staff-card">
          <div ref="staffChart" class="chart-box"></div>
          <div class="staff-legend">
            <div class="legend-col">
              <div class="legend-item"><span class="color-block nurse-red"></span> 养老护理员 81人</div>
              <div class="legend-item"><span class="color-block doctor-blue"></span> 医师 0人</div>
              <div class="legend-item"><span class="color-block rehab-yellow"></span> 康复师 1人</div>
              <div class="legend-item"><span class="color-block tech-purple"></span> 技师 0人</div>
              <div class="legend-item"><span class="color-block diet-teal"></span> 营养师 0人</div>
              <div class="legend-item"><span class="color-block nurse-red2"></span> 护士 3人</div>
              <div class="legend-item"><span class="color-block psycho-blue"></span> 心理咨询师 0人</div>
              <div class="legend-item"><span class="color-block social-yellow"></span> 社会工作者 0人</div>
            </div>
            <div class="legend-col">
              <div class="legend-item"><span class="color-block nurse-pink"></span> 护师 0人</div>
              <div class="legend-item"><span class="color-block doctor-green"></span> 医生 2人</div>
              <div class="legend-item"><span class="color-block manager-red"></span> 院长或其他管理人员 0人</div>
              <div class="legend-item"><span class="color-block manager-blue"></span> 护理主管 2人</div>
              <div class="legend-item"><span class="color-block finance-yellow"></span> 财务 0人</div>
              <div class="legend-item"><span class="color-block assess-purple"></span> 老年人能力评估师 0人</div>
              <div class="legend-item"><span class="color-block marketing-teal"></span> 营销人员 4人</div>
              <div class="legend-item"><span class="color-block property-red"></span> 物业人员 1人</div>
            </div>
          </div>
        </div>
      </div>

      <!-- 第三行 -->
      <div class="card card-span-2-col">
        <div class="card-header">
          <div class="card-title">出入院趋势分析</div>
          <div class="card-tab">
            <span class="tab-item active">本周</span>
            <span class="tab-item">本月</span>
            <span class="tab-item">本年</span>
          </div>
        </div>
        <div class="card-body">
          <div ref="inOutChart" class="chart-full"></div>
        </div>
      </div>

      <div class="card">
        <div class="card-header">
          <div class="card-title">床位使用统计</div>
        </div>
        <div class="card-body bed-card">
          <div ref="bedChart" class="chart-box"></div>
          
        </div>
      </div>

      <!-- 第四行 -->
      <div class="card">
        <div class="card-header">
          <div class="card-title">智能设备概况</div>
        </div>
        <div class="card-body device-card">
          <div class="device-info">
            <div class="info-col">
              <div class="info-item"><span class="color-blue"></span> 登记设备 <b>3</b></div>
              <div class="info-item"><span class="color-green"></span> 在线数量 <b>0</b></div>
            </div>
            <div class="info-col">
              <div class="info-item"><span class="color-orange"></span> 离线数量 <b>3</b></div>
              <div class="info-item"><span class="color-red"></span> 告警数量 <b>0</b></div>
            </div>
          </div>
          <div class="online-rate">
            <div ref="deviceRateChart" class="rate-circle"></div>
            <div class="rate-text">0%<br>在线率</div>
          </div>
        </div>
      </div>

      <div class="card">
        <div class="card-header">
          <div class="card-title">告警数量</div>
          <div class="card-date">
            <input type="text" value="2026年06月" readonly>
          </div>
        </div>
        <div class="card-body">
          <div ref="alarmChart" class="chart-full"></div>
        </div>
      </div>

      <div class="card">
        <div class="card-header">
          <div class="card-title">告警处理统计</div>
        </div>
        <div class="card-body handle-card">
          <div class="handle-item">
            <div ref="handledChart" class="handle-circle"></div>
            <div class="handle-text">0 %<br>已处理</div>
          </div>
          <div class="handle-item">
            <div ref="unhandledChart" class="handle-circle"></div>
            <div class="handle-text">0 %<br>未处理</div>
          </div>
        </div>
      </div>

      <!-- 第五行 -->
      <div class="card">
        <div class="card-header">
          <div class="card-title">增值服务统计</div>
        </div>
        <div class="card-body service-card">
          <div class="service-item"><span>本月物品订单</span><b>1</b></div>
          <div class="service-item"><span>本月餐饮订单</span><b>6</b></div>
          <div class="service-item"><span>本月自选服务订单</span><b>6</b></div>
          <div class="service-item"><span>累计物品订单</span><b>1</b></div>
          <div class="service-item"><span>累计餐饮订单</span><b>6</b></div>
          <div class="service-item"><span>自选服务订单</span><b>6</b></div>
        </div>
      </div>

      <div class="card card-span-2-col">
        <div class="card-header">
          <div class="card-title">订单数量趋势图</div>
        </div>
        <div class="card-body">
          <div ref="orderTrendChart" class="chart-full"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
export default {
  data() {
    return { charts: {} }
  },
  mounted() {
    this.initAllChart();
    window.addEventListener('resize', () => {
      Object.values(this.charts).forEach(chart => chart && chart.resize())
    })
  },
  beforeDestroy() {
    window.removeEventListener('resize', () => {});
  },
  methods: {
    initAllChart() {
      this.initIncomeChart();
      this.initOccupancyChart();
      this.initBarChart();
      this.initStaffChart();
      this.initAgeChart();
      this.initGenderChart();
      this.initCareLevelChart();
      this.initAbilityChart();
      this.initInOutChart();
      this.initBedChart();
      this.initDeviceRateChart();
      this.initAlarmChart();
      this.initHandleCharts();
      this.initOrderTrendChart();
    },

    // 1. 当月收入圆环图
    initIncomeChart() {
      const dom = this.$refs.incomeChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'item', textStyle: { color: '#AAAAA9' } },
        series: [{
          type: 'pie',
          radius: ['70%', '95%'],
          center: ['50%', '50%'],
          label: {
            show: true,
            position: 'center',
            fontSize: 14,
            fontWeight: 300,
            color: '#333',
            formatter: '实收分类'
          },
          data: [
            { value: 600, name: '护理费', itemStyle: { color: '#ff7a6e' } },
            { value: 600, name: '床位费', itemStyle: { color: '#409eff' } },
            { value: 500, name: '入住押金', itemStyle: { color: '#ffc152' } },
            { value: 300, name: '餐费', itemStyle: { color: '#9c6bde' } },
            { value: 1000, name: '医疗备用金', itemStyle: { color: '#28c7cc' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.income = chart;
    },

    // 2. 入住率环形图
    initOccupancyChart() {
      const dom = this.$refs.occupancyChart;
      const chart = echarts.init(dom);
      const option = {
        series: [{
          type: 'pie',
          radius: ['80%', '100%'],
          center: ['50%', '50%'],
          avoidLabelOverlap: false,
          hoverAnimation: false,
          data: [
            { value: 90, name: '背景', itemStyle: { color: '#e4e7ed' } },
            { value: 30, name: '入住率', itemStyle: { color: '#36cf96' } }
          ],
          label: {
            show: true,
            position: 'center',
            formatter: (params) => params.name === '入住率' ? `25.00%\n入住率` : '',
            fontSize: 16,
            fontWeight: 500,
            color: '#303133',
            lineHeight: 24
          },
          labelLine: { show: false }
        }]
      };
      chart.setOption(option);
      this.charts.occupancy = chart;
    },

    // 3. 护理员持证柱状图
    initBarChart() {
      const dom = this.$refs.barChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'axis', axisPointer: { type: 'shadow' } },
        grid: { left: '3%', right: '4%', bottom: '12%', containLabel: true },
        xAxis: {
          type: 'category',
          data: ['一级/高级技师', '二级/技师', '三级/高级工', '四级/中级工', '五级/初级工', '未评级'],
          axisLabel: { rotate: 30, fontSize: 10, interval: 0 }
        },
        yAxis: {
          type: 'value',
          max: 100,
          splitLine: { lineStyle: { type: 'dashed', color: '#e0e0e0' } }
        },
        series: [{ name: '人数', type: 'bar', barWidth: '40%', barMaxWidth: 40, data: [0, 0, 0, 0, 0, 80], itemStyle: { color: '#409eff' } }]
      };
      chart.setOption(option);
      this.charts.bar = chart;
    },

    // 4. 员工岗位统计饼图
    initStaffChart() {
      const dom = this.$refs.staffChart;
      const chart = echarts.init(dom);
      const totalStaff = 133;
      const option = {
        tooltip: { trigger: 'item' },
        series: [{
          type: 'pie',
          radius: ['60%', '80%'],
          center: ['50%', '50%'],
          minAngle: 5,
          sort: false,
          label: {
            show: true,
            position: 'center',
            fontSize: 12,
            fontWeight: 100,
            color: '#303133',
            formatter: `${totalStaff}\n员工岗位统计`
          },
          data: [
            { value: 81, name: '养老护理员', itemStyle: { color: '#ff745a' } },
            { value: 3, name: '护士', itemStyle: { color: '#ff7a6e' } },
            { value: 2, name: '医生', itemStyle: { color: '#67c23a' } },
            { value: 2, name: '护理主管', itemStyle: { color: '#409eff' } },
            { value: 4, name: '营销人员', itemStyle: { color: '#28c7cc' } },
            { value: 1, name: '康复师', itemStyle: { color: '#ffc152' } },
            { value: 1, name: '物业人员', itemStyle: { color: '#ff7a6e' } },
            { value: 0, name: '医师', itemStyle: { color: '#409eff' } },
            { value: 0, name: '技师', itemStyle: { color: '#9c6bde' } },
            { value: 0, name: '营养师', itemStyle: { color: '#28c7cc' } },
            { value: 0, name: '心理咨询师', itemStyle: { color: '#409eff' } },
            { value: 0, name: '社会工作者', itemStyle: { color: '#ffc152' } },
            { value: 0, name: '护师', itemStyle: { color: '#f48fb1' } },
            { value: 0, name: '管理人员', itemStyle: { color: '#ff7a6e' } },
            { value: 0, name: '财务', itemStyle: { color: '#ffc152' } },
            { value: 0, name: '评估师', itemStyle: { color: '#9c6bde' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.staff = chart;
    },

    // 5. 年龄分布饼图
    initAgeChart() {
      const dom = this.$refs.ageChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'item' },
        series: [{
          type: 'pie',
          radius: ['60%', '80%'],
          label: { show: true, position: 'center', fontSize: 14, fontWeight: 300, color: '#333', formatter: '年龄' },
          data: [
            { value: 0, name: '60岁以下', itemStyle: { color: '#ff7a6e' } },
            { value: 1, name: '60-69岁', itemStyle: { color: '#409eff' } },
            { value: 2, name: '70-79岁', itemStyle: { color: '#ffc152' } },
            { value: 0, name: '80-89岁', itemStyle: { color: '#9c6bde' } },
            { value: 0, name: '90-99岁', itemStyle: { color: '#28c7cc' } },
            { value: 0, name: '100岁及以上', itemStyle: { color: '#f48fb1' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.age = chart;
    },

    // 6. 性别饼图
    initGenderChart() {
      const dom = this.$refs.genderChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'item' },
        series: [{
          type: 'pie',
          radius: ['60%', '80%'],
          label: { show: true, position: 'center', fontSize: 14, fontWeight: 300, color: '#333', formatter: '性别' },
          data: [
            { value: 1, name: '女', itemStyle: { color: '#ff7a6e' } },
            { value: 2, name: '男', itemStyle: { color: '#409eff' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.gender = chart;
    },

    // 7. 护理等级饼图
    initCareLevelChart() {
      const dom = this.$refs.careLevelChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'item' },
        series: [{
          type: 'pie',
          radius: ['60%', '80%'],
          label: { show: true, position: 'center', fontSize: 14, fontWeight: 300, color: '#333', formatter: '护理等级' },
          data: [
            { value: 2, name: '自理', itemStyle: { color: '#ff7a6e' } },
            { value: 1, name: '轻度', itemStyle: { color: '#409eff' } },
            { value: 0, name: '中度', itemStyle: { color: '#ffc152' } },
            { value: 0, name: '重度', itemStyle: { color: '#9c6bde' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.care = chart;
    },

    // 8. 能力评估饼图
    initAbilityChart() {
      const dom = this.$refs.abilityChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'item' },
        series: [{
          type: 'pie',
          radius: ['70%', '90%'],
          label: { show: true, position: 'center', fontSize: 14, fontWeight: 300, color: '#333', formatter: '能力评估' },
          data: [
            { value: 0, name: '完全失能', itemStyle: { color: '#ff7a6e' } },
            { value: 0, name: '重度失能', itemStyle: { color: '#409eff' } },
            { value: 0, name: '中度失能', itemStyle: { color: '#ffc152' } },
            { value: 1, name: '轻度失能', itemStyle: { color: '#9c6bde' } },
            { value: 2, name: '能力完好', itemStyle: { color: '#28c7cc' } },
            { value: 0, name: '未评定', itemStyle: { color: '#f48fb1' } }
          ]
        }]
      };
      chart.setOption(option);
      this.charts.ability = chart;
    },

    // 9. 出入院趋势柱状图
    initInOutChart() {
  const dom = this.$refs.inOutChart;
  const chart = echarts.init(dom);
  const option = {
    tooltip: { trigger: 'axis' },
    legend: { data: ['退住人数', '入住人数'], top: 0 },
    grid: { 
      left: '3%', 
      right: '4%', 
      bottom: '3%', 
      containLabel: true 
    },
    xAxis: {
      type: 'category',
      data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日'],
      // 隐藏X轴线、刻度线
      axisLine: { show: false },
      axisTick: { show: false }
    },
    yAxis: { 
      type: 'value', 
      max: 2,
      // 隐藏Y轴线、刻度线
      axisLine: { show: false },
      axisTick: { show: false },
      // 只保留水平灰色网格虚线，去掉黑色边框
      splitLine: { 
        lineStyle: { 
          color: '#e5e7eb',
          type: 'solid'
        } 
      }
    },
    series: [
      { name: '退住人数', type: 'bar', data: [0, 0, 1, 1, 0, 0, 0], itemStyle: { color: '#409eff' } },
      { name: '入住人数', type: 'bar', data: [2, 1, 2, 0, 0, 0, 0], itemStyle: { color: '#ffb75e' } }
    ]
  };
  chart.setOption(option);
  this.charts.inOut = chart;
},

    // 10. 床位使用统计饼图
    // 10. 床位使用统计饼图（改为实心扇形）
     // 10. 床位使用统计饼图（实心扇形 + 右侧图例）
// 10. 床位使用统计饼图（完全匹配截图样式，无重叠）
initBedChart() {
  const dom = this.$refs.bedChart;
  const chart = echarts.init(dom);
  const option = {
    tooltip: { trigger: 'item' },
    // 图例：完全贴右侧，不占用饼图空间
    legend: {
      orient: 'vertical',
      right: '5%', // 离右侧留一点边距
      top: 'middle', // 垂直居中
      itemWidth: 14,
      itemHeight: 14,
      textStyle: {
        fontSize: 16,
        color: '#333'
      },
      // 只显示有数据的项（和截图一致）
      data: ['空闲', '预订', '入住']
    },
    series: [{
      type: 'pie',
      radius: '70%', // 实心饼图
      center: ['25%', '50%'], // 饼图强制靠左，给右侧图例留出大量空间
      // 数据按截图顺序排列，保证颜色对应
      data: [
        { value: 6, name: '空闲', itemStyle: { color: '#409eff' } },
        { value: 1, name: '预订', itemStyle: { color: '#ffc152' } },
        { value: 5, name: '入住', itemStyle: { color: '#28c7cc' } },
        { value: 0, name: '试住', itemStyle: { color: '#ff7a6e' } },
        { value: 0, name: '变更占用', itemStyle: { color: '#9c6bde' } }
      ],
      label: { show: false }, // 隐藏饼图上的标签
      labelLine: { show: false } // 去掉引导线
    }]
  };
  chart.setOption(option);
  this.charts.bed = chart;
},

    // 11. 设备在线率环形图
    initDeviceRateChart() {
      const dom = this.$refs.deviceRateChart;
      const chart = echarts.init(dom);
      const option = {
        series: [{
          type: 'pie',
          radius: ['80%', '100%'],
          center: ['50%', '50%'],
          avoidLabelOverlap: false,
          hoverAnimation: false,
          data: [
            { value: 100, name: '背景', itemStyle: { color: '#e4e7ed' } },
            { value: 0, name: '在线率', itemStyle: { color: '#409eff' } }
          ],
          label: { show: false },
          labelLine: { show: false }
        }]
      };
      chart.setOption(option);
      this.charts.deviceRate = chart;
    },

    // 12. 告警数量柱状图
    initAlarmChart() {
      const dom = this.$refs.alarmChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'axis' },
        grid: { left: '3%', right: '4%', bottom: '15%', containLabel: true },
        xAxis: {
          type: 'category',
          data: ['跌倒告警', '离线告警', '低电量告警', '红外告警', '门磁告警', '呼叫告警', '水浸告警', '烟雾告警', 'SOS告警', '电源故障', '健康告警', '围栏告警', '床垫告警', '燃气告警'],
          axisLabel: { rotate: 30, fontSize: 10, interval: 0 }
        },
        yAxis: { type: 'value', max: 1 },
        series: [{ type: 'bar', data: [0,0,0,0,0,0,0,0,0,0,0,0,0,0], itemStyle: { color: '#409eff' } }]
      };
      chart.setOption(option);
      this.charts.alarm = chart;
    },

    // 13. 告警处理统计环形图
    initHandleCharts() {
      const dom1 = this.$refs.handledChart;
      const dom2 = this.$refs.unhandledChart;
      const option = {
        series: [{
          type: 'pie',
          radius: ['80%', '100%'],
          center: ['50%', '50%'],
          avoidLabelOverlap: false,
          hoverAnimation: false,
          data: [
            { value: 100, name: '背景', itemStyle: { color: '#e4e7ed' } },
            { value: 0, name: '已处理', itemStyle: { color: '#67c23a' } }
          ],
          label: { show: false },
          labelLine: { show: false }
        }]
      };
      const option2 = {
        series: [{
          type: 'pie',
          radius: ['80%', '100%'],
          center: ['50%', '50%'],
          avoidLabelOverlap: false,
          hoverAnimation: false,
          data: [
            { value: 100, name: '背景', itemStyle: { color: '#e4e7ed' } },
            { value: 0, name: '未处理', itemStyle: { color: '#ffc152' } }
          ],
          label: { show: false },
          labelLine: { show: false }
        }]
      };
      const chart1 = echarts.init(dom1);
      chart1.setOption(option);
      this.charts.handled = chart1;
      const chart2 = echarts.init(dom2);
      chart2.setOption(option2);
      this.charts.unhandled = chart2;
    },

    // 14. 订单数量趋势折线图
    initOrderTrendChart() {
      const dom = this.$refs.orderTrendChart;
      const chart = echarts.init(dom);
      const option = {
        tooltip: { trigger: 'axis' },
        legend: { data: ['物品订单', '餐饮订单', '自选服务单'], top: 0 },
        grid: { left: '3%', right: '4%', bottom: '3%', containLabel: true },
        xAxis: {
          type: 'category',
          boundaryGap: false,
          data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
        },
        yAxis: { type: 'value', max: 6 },
        series: [
          { name: '物品订单', type: 'line', data: [0,0,0,0,0,1,0,0,0,0,0,0], itemStyle: { color: '#409eff' } },
          { name: '餐饮订单', type: 'line', data: [0,0,0,0,0,4,0,0,0,0,0,0], itemStyle: { color: '#ff9f43' } },
          { name: '自选服务单', type: 'line', data: [0,0,0,0,0,6,0,0,0,0,0,0], itemStyle: { color: '#28c7cc' } }
        ]
      };
      chart.setOption(option);
      this.charts.orderTrend = chart;
    }
  }
}
</script>

<style scoped>
/* 基础布局 - 严格按图一的网格 */
.dashboard-page {
  background-color: #f5f7fa;
  padding: 16px;
  min-height: 100vh;
}

.dashboard-container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-auto-rows: auto;
  gap: 16px;
  width: 100%;
}

.card {
  background-color: #ffffff;
  border-radius: 8px;
  box-shadow: 0 2px 12px rgba(0, 0, 0, 0.05);
  overflow: hidden;
}

/* 关键：老人画像跨 1 列 2 行 */
.card-span-2-rows {
  grid-row: span 2;
}

/* 关键：出入院趋势、订单趋势跨 2 列 */
.card-span-2-col {
  grid-column: span 2;
}

.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px 16px;
  border-bottom: 1px solid #eaeaea;
}

.card-title {
   margin: 0;
  font-size: .8vw;
  font-weight: 500;
  color: #000000;
}

.card-title:before {
  content: "";
  display: inline-block;
  width: 4px;
  height: 16px;
  background: #09f;
  border-radius: 2px;
  margin-right: 8px;
}

.card-body {
  padding: 16px;
  
}

/* 让 card 使用列方向弹性布局，card-body 可扩展并支持居中 */
.card {
  display: flex;
  flex-direction: column;
}
.card-body {
  padding: 16px;
  flex: 1 1 auto;
  display: flex;
  
}

/* 仅针对当月收入卡，使其在 card-body 区域垂直居中 */
.card-body.income-card {
  flex-direction: row;
  align-items: center;
  justify-content: flex-start;
}



/* 图表容器 */
.chart-box { width: 130px; height: 130px; }
.small-chart { width: 100px; height: 100px; }
.chart-full { width: 100%; height: 200px; }
.chart-bar { width: 100%; height: 280px; }

/* 当月收入 */
.income-card {
  display: flex;
  gap: 16px;
  align-items: center;
  
  
}
.income-info {
  display: flex;
  flex-direction: column;
  gap: 12px;
}
.info-item {
  display: flex;
  align-items: center;
  gap: 10px;
}
.text-wrap {
  display: flex;
  flex-direction: column;
  gap: 4px;
}
.money-img {
  width: 20px;
  height: 20px;
  object-fit: contain;
  flex-shrink: 0;
}
.info-label { font-size: .8vw;
  color: #000000; }
.info-value { font-size: .8vw;
  color: #000000; }
.chart-placeholder {
  flex: 1;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 16px;
}
.legend {
  display: flex;
  flex-direction: column;
  gap: 6px;
  font-size: 12px;
}
.legend-item {
  display: flex;
  align-items: center;
  gap: 6px;
}
.color-block {
  display: inline-block;
  width: 10px;
  height: 10px;
  border-radius: 2px;
}
.color-block.care { background: #ff7a6e; }
.color-block.bed { background: #409eff; }
.color-block.deposit { background: #ffc152; }
.color-block.meal { background: #9c6bde; }
.color-block.medical { background: #28c7cc; }

/* 今日实时数据 */
.realtime-card {
  display: flex;
  flex-direction: column;
  gap: 16px;
}
.realtime-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 24px;
}
.realtime-item {
  display: flex;
  flex-direction: column;
}
.item-label { font-size: 14px; color: #000; }
.item-value { font-size: 16px; font-weight: 500; color: #303133; }
.occupancy-rate {
  position: relative;
  width: 80px;
  height: 80px;
}
.rate-chart { width: 100%; height: 100%; }
.realtime-grid {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 12px;
}
.grid-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 8px;
  background-color: #f5f7fa;
  border-radius: 4px;
}
.grid-label { font-size: 12px; color: #606266; }
.grid-value { font-size: 16px; font-weight: 500; color: #303133; }

/* 员工岗位统计 */
.staff-card {
  display: flex;
  gap: 16px;
  align-items: center;
}
.staff-legend {
  display: flex;
  gap: 10px;
  font-size: 12px;
}
.legend-col {
  display: flex;
  flex-direction: column;
  gap: 6px;
}
.color-block.nurse-red { background: #ff7a6e; }
.color-block.doctor-blue { background: #409eff; }
.color-block.rehab-yellow { background: #ffc152; }
.color-block.tech-purple { background: #9c6bde; }
.color-block.diet-teal { background: #28c7cc; }
.color-block.nurse-red2 { background: #ff7a6e; }
.color-block.psycho-blue { background: #409eff; }
.color-block.social-yellow { background: #ffc152; }
.color-block.nurse-pink { background: #f48fb1; }
.color-block.doctor-green { background: #67c23a; }
.color-block.manager-red { background: #ff7a6e; }
.color-block.manager-blue { background: #409eff; }
.color-block.finance-yellow { background: #ffc152; }
.color-block.assess-purple { background: #9c6bde; }
.color-block.marketing-teal { background: #28c7cc; }
.color-block.property-red { background: #ff7a6e; }

/* 老人画像 */
.profile-card {
  display: flex;
  flex-direction: column;
  gap: 30px;
}
.profile-item {
  display: flex;
  align-items: center;
  gap: 16px;
  padding: 16px;
  flex: 1 1 auto;
}
.profile-card.profile-item {
  flex-direction: row;
  align-items: center;
  justify-content: flex-start;
}
.profile-chart {
  width: 80px;
  height: 80px;
}
.profile-legend {
  flex: 1;
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 6px;
  font-size: 12px;
}
.color-block.red { background: #ff7a6e; }
.color-block.blue { background: #409eff; }
.color-block.yellow { background: #ffc152; }
.color-block.purple { background: #9c6bde; }
.color-block.teal { background: #28c7cc; }
.color-block.pink { background: #f48fb1; }

/* 卡片标签 */
.card-tab {
  display: flex;
  gap: 8px;
}
.tab-item {
  padding: 4px 12px;
  border-radius: 4px;
  cursor: pointer;
  font-size: 14px;
}
.tab-item.active {
  background: #409eff;
  color: #fff;
}
.card-date {
  position: relative;
}
.card-date input {
  border: 1px solid #409eff;
  border-radius: 4px;
  padding: 4px 8px;
  padding-left: 24px;
}

/* 床位使用统计 */
.bed-card {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 100%;
  padding: 0 !important; /* 去掉额外内边距，让空间最大化 */
}

.chart-box {
  width: 100% !important;
  height: 100% !important;
}
.bed-legend {
  display: flex;
  flex-direction: column;
  gap: 6px;
  font-size: 12px;
}
.color-blue { background: #409eff; }
.color-yellow { background: #ffc152; }
.color-green { background: #28c7cc; }
.color-red { background: #ff7a6e; }
.color-purple { background: #9c6bde; }

/* 智能设备概况 */
.device-card {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.device-info {
  display: flex;
  gap: 20px;
}
.info-col {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
.info-item {
  display: flex;
  align-items: center;
  gap: 6px;
  font-size: 14px;
}
.color-blue { width: 12px; height: 12px; background: #409eff; border-radius: 2px; }
.color-green { width: 12px; height: 12px; background: #28c7cc; border-radius: 2px; }
.color-orange { width: 12px; height: 12px; background: #ffc152; border-radius: 2px; }
.color-red { width: 12px; height: 12px; background: #ff7a6e; border-radius: 2px; }
.online-rate {
  position: relative;
  width: 80px;
  height: 80px;
}
.rate-circle {
  width: 100%;
  height: 100%;
}
.rate-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
  font-size: 16px;
}

/* 告警处理统计 */
.handle-card {
  display: flex;
  justify-content: space-around;
    padding: 16px;
  flex: 1 1 auto;
  
  
}
.handle-item {
  position: relative;
  width: 80px;
  height: 80px;
}
.handle-circle {
  width: 100%;
  height: 100%;
}
.handle-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  text-align: center;
  font-size: 16px;
}

/* 增值服务统计 */
.service-card {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 16px;
}
.service-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  font-size: 14px;
}
.service-item b {
  font-size: 20px;
  color: #303133;
}

/* 响应式适配 */
@media (max-width: 1200px) {
  .dashboard-container {
    grid-template-columns: repeat(1, 1fr);
  }
  .card-span-2-rows, .card-span-2-col {
    grid-column: span 1;
    grid-row: span 1;
  }
  .income-card, .staff-card, .bed-card, .device-card {
    flex-direction: column;
    align-items: center;
  }
}
</style>