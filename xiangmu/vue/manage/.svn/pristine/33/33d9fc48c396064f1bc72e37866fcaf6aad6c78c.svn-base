<template>
  <div class="page-outer">
    <div class="page-container">
      <div ref="search_d">
        <span style="font-size:18px;font-weight:bold">媒介渠道统计</span>
      </div>
      <div class="statchart-box">
        <div class="box-left">
          <el-table border ref="table" v-loading="loading" :data="statsData" tooltip-effect="dark" style="width: 100%"
            :header-cell-style="{
              backgroundColor: '#fafafa',
              color: '#333',
              fontWeight: 'bold',
              fontSize: '14px',
            }" :height="height"
          >
            <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

            <el-table-column label="预约人数" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.visitState }}</template>
            </el-table-column>
            <el-table-column label="参观人数" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.count }}</template>
            </el-table-column>
            <el-table-column label="总人数" align="center" show-overflow-tooltip>
              <template slot-scope="scope">{{ scope.row.totalPersonNum }}</template>
            </el-table-column>
          </el-table>
          <!-- 分页 -->
          <!-- <div class="block">
            <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
              :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
              layout="total, sizes, prev, pager, next, jumper" :total="total">
            </el-pagination>
          </div> -->
        </div>
        <div class="box-right">
          <div ref="pieChart" class="chart-box"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
export default {
  data() {
    return {
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {}
      },
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,
      statsData: [],// 统计数据
      option: {},
      charts: {},
    };
  },

  created() {
  },

  mounted() {
    this.initDefaultData()
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize',()=>{
        this.getHeight()
        Object.values(this.charts).forEach(chart => chart && chart.resize())
      })
    })
  },
  beforeDestroy() {
    window.removeEventListener('resize', () => {});
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 236;
    },
    // 初始化默认数据（和截图中的内容一致）
    initDefaultData() {
      this.getStats()
    },
    initChart(sdata) {
      const dom = this.$refs.pieChart;
      const chart = echarts.init(dom);
      this.option = {
        tooltip: { trigger: 'item' },
        color: ['#409eff', '#0ff', '#ffc152', '#28c7cc', '#ff7a6e', '#9c6bde' ],
        legend: {
          // orient: 'vertical',
          right: '5%',
          top: '10%',
          itemWidth: 14,
          itemHeight: 14,
          textStyle: {
            fontSize: 16,
            color: '#333'
          },
          data: ['预约人数', '参观人数', '总人数',]//sdata.aliasNameList,//
        },
        series: [{
          type: 'pie',
          radius: '70%', // 实心饼图
          center: ['50%', '50%'],
          data: [
            { value: 6, name: '预约人数',},
            { value: 1, name: '参观人数', },
            { value: 5, name: '总人数', },
          ],
          // label: { show: false }, // 隐藏饼图上的标签
          // labelLine: { show: false } // 去掉引导线
        }]
      };
      chart.setOption(this.option);
      this.charts.pieChart = chart;
    },

    //获取数据
    getList() {
      // var that = this;
      // that.loading = true
      // that.$http.post("/insStaffContractInfo/list", that.queryInfo).then(function (response) {
      //   console.log(response.data.data);
      //   if (response.data.code == 200) {
      //     that.loading = false
      //     that.total = response.data.data.count;
      //     that.queryInfo.currPage = response.data.data.currPage
      //     that.tableData = response.data.data.data;
      //   }
      // });
    },
    //获取统计数据
    getStats() {
      var that = this;
      that.loading = true
      const params = {
      }
      // this.queryInfo.condition.id = 'text'
      that.$http.post("/deandashboard/mediaChannelStats", params).then( (response)=> {
        if (response.data.code == 200) {
          that.loading = false
          that.statsData = response.data.data;
          this.initChart(that.statsData);
        }
      });
    },

    //新增按钮
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>
<style lang="scss" scoped>
.table-box {
    background-color: white;
    padding: 0 0 10px 0;
}

.table-box ::v-deep .el-table .cell {
    white-space: nowrap;
    /* 强制不换行 */
    overflow: hidden;
    /* 超出隐藏 */
    text-overflow: ellipsis;
    /* 超出显示省略号 */
}
.statchart-box{
  width: 100%;
  height: 90%;
  box-sizing: border-box;
  flex: 1;
  display: flex;
  gap: 10px;
  .box-left{
    width: 60%;
    flex: 1;
  }
  .box-right{
    width: 30%;
    height: 100%;
    box-sizing: border-box;
    display: flex;
    align-items: center;
    justify-content: center;
  }
}
.chart-box { width: 100%; height: 100%; }
</style>