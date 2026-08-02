<template>
  <div class="visit-statistics-page">
    <!-- 顶部筛选栏 -->
    <div class="filter-bar">
  <div class="filter-item">
    <label>养老机构:</label>
    <el-select v-model="formData.institution" placeholder="请选择养老机构">
      <el-option label="1909072363299835905" value="1909072363299835905"></el-option>
    </el-select>
  </div>
  <!-- 年份：改为年选择器 -->
  <div class="filter-item">
    <label>年份:</label>
    <el-date-picker
      v-model="formData.year"
      type="year"
      placeholder="请选择年份"
      format="yyyy"
      value-format="yyyy"
    ></el-date-picker>
  </div>
  <!-- 月份：改为月选择器 -->
  <div class="filter-item">
    <label>月份:</label>
    <el-date-picker
      v-model="formData.month"
      type="month"
      placeholder="请选择月份"
      format="yyyy-MM"
      value-format="yyyy-MM"
    ></el-date-picker>
  </div>
  <div class="filter-buttons">
    <el-button type="primary" icon="el-icon-search" @click="handleSearch">搜索</el-button>
    <el-button icon="el-icon-delete" @click="handleClear">清空</el-button>
  </div>
</div>

    <!-- 内容区域：表格 + 图表 -->
    <div class="content-container">
      <!-- 预约参观表格 -->
      <div class="card table-card">
        <div class="card-header">
          <div class="card-title">预约参观表格</div>
          <el-button type="primary" size="small" icon="el-icon-download" @click="handleExport">导出</el-button>
        </div>
        <div class="card-body">
          <!-- 移除自定义empty占位，使用el-table原生空数据提示 -->
          <el-table :data="tableData" border style="width: 100%;height: 100%;">
            <el-table-column prop="index" label="序号" align="center"></el-table-column>
            <el-table-column prop="month" label="月份" align="center"></el-table-column>
            <el-table-column prop="totalVisit" label="预约参观总数" align="center"></el-table-column>
            <el-table-column prop="totalPeople" label="预约参观总人数" align="center"></el-table-column>
            <el-table-column prop="actualVisit" label="实际到场数" align="center"></el-table-column>
            <el-table-column prop="attendanceRate" label="参观到场率(%)" align="center"></el-table-column>
          </el-table>
        </div>
      </div>

      <!-- 预约参观图表 -->
      <div class="card chart-card">
        <div class="card-header">
          <div class="card-title">预约参观图表</div>
        </div>
        <div class="card-body">
          <div ref="visitChart" class="chart-container"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
export default {
  name: 'VisitStatistics',
  data() {
  return {
    formData: {
      institution: '1909072363299835905',
      year: '', // 改为空字符串，让选择器显示占位符
      month: ''
    },
    tableData: [],
    charts: {}
  }
},
  mounted() {
    this.initChart();
    window.addEventListener('resize', () => {
      Object.values(this.charts).forEach(chart => chart && chart.resize())
    })
  },
  beforeDestroy() {
    window.removeEventListener('resize', () => {});
  },
  methods: {
    // 初始化图表（空数据状态）
    // 初始化图表（空数据状态）
initChart() {
  const dom = this.$refs.visitChart;
  const chart = echarts.init(dom);
  const option = {
    title: {
      text: '暂无数据',
      left: 'center',
      top: 'center',
      textStyle: {
        color: '#909399',
        fontSize: 14
      }
    },
    // 隐藏X轴
    xAxis: { 
      type: 'category', 
      data: [],
      show: false
    },
    // 隐藏Y轴
    yAxis: { 
      type: 'value',
      show: false
    },
    series: [{
      type: 'bar',
      data: []
    }]
  };
  chart.setOption(option);
  this.charts.visit = chart;
},
    // 搜索
    handleSearch() {
      // 这里写你的搜索逻辑，请求接口更新 tableData 和图表数据
      console.log('搜索条件:', this.formData);
    },
    // 清空
    handleClear() {
    this.formData = {
      institution: '',
      year: '',
      month: ''
    };
    this.tableData = [];
    this.initChart();
  },
    // 导出
    handleExport() {
      // 这里写你的导出逻辑
      console.log('导出表格');
    }
  }
}
</script>

<style scoped>
/* 根容器占满整个可视区域 */
.visit-statistics-page {
  background-color: #f5f7fa;
  padding: 16px;
  /* 关键：占满视口高度 */
  height: 100vh;
  box-sizing: border-box;
  /* 内容超出才滚动 */
  overflow: hidden;
  display: flex;
  flex-direction: column;
}

/* 顶部筛选栏 */
.filter-bar {
  display: flex;
  align-items: center;
  gap: 24px;
  padding: 16px;
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 12px rgba(0,0,0,0.05);
  margin-bottom: 16px;
  /* 固定高度，不压缩 */
  flex-shrink: 0;
}
.filter-item {
  display: flex;
  align-items: center;
  gap: 8px;
}
.filter-item label {
  font-size: 14px;
  color: #303133;
  white-space: nowrap;
}
.filter-item .el-input,
.filter-item .el-select {
  width: 240px;
}
.filter-buttons {
  margin-left: auto;
  display: flex;
  gap: 8px;
}

/* 内容容器：表格 + 图表 占满剩余高度 */
.content-container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: 16px;
  /* 关键：自适应剩余高度 */
  flex: 1;
  min-height: 0;
}
.card {
  background: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 12px rgba(0,0,0,0.05);
  overflow: hidden;
  display: flex;
  flex-direction: column;
  /* 卡片撑满父容器高度 */
  height: 100%;
}
.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 12px 16px;
  border-bottom: 1px solid #ebeef5;
  /* 头部固定高度 */
  flex-shrink: 0;
}
.card-title {
  margin: 0;
  font-size: 16px;
  font-weight: 500;
  color: #303133;
  display: flex;
  align-items: center;
}
.card-title::before {
  content: '';
  display: inline-block;
  width: 4px;
  height: 16px;
  background: #409eff;
  border-radius: 2px;
  margin-right: 8px;
}
.card-body {
  flex: 1;
  padding: 16px;
  /* 内容区域超出滚动 */
  overflow: auto;
  min-height: 0;
}

/* 表格模块 */
.table-card .el-table {
  height: 100%;
}

/* 图表模块 高度100%撑满 */
.chart-container {
  width: 100%;
  height: 100%;
}
</style>