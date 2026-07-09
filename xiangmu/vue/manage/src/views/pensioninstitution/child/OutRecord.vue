<template>
  <div class="out-manage-page">
    <!-- 顶部搜索筛选卡片 -->
    <div class="search-card el-card">
      <div class="search-row">
        <div class="search-item">
          <label>老人姓名:</label>
          <el-input v-model="searchForm.elderName" placeholder="请输入老人姓" clearable></el-input>
        </div>
        <div class="search-item">
          <label>陪同人员类型:</label>
          <el-select v-model="searchForm.escortType" placeholder="请选择陪同人" clearable>
            <el-option label="家属" value="family"></el-option>
            <el-option label="护工" value="nurse"></el-option>
            <el-option label="其他" value="other"></el-option>
          </el-select>
        </div>
        <div class="search-item">
          <label>计划外出时间:</label>
          <el-date-picker v-model="searchForm.outTime" type="datetimerange" range-separator="-" start-placeholder="开始"
            end-placeholder="结束"></el-date-picker>
        </div>
        <div class="search-btn-group">
          <el-button type="primary" icon="el-icon-search" @click="handleSearch">搜索</el-button>
          <el-button @click="handleReset">清空</el-button>
        </div>
      </div>
    </div>

    <!-- 表格模块卡片 -->
    <div class="table-card el-card">
      <!-- 表格右上角工具图标 -->
      <div class="table-top-tool">
        <i class="el-icon-refresh" @click="refreshTable" title="刷新"></i>
        <i class="el-icon-menu" title="列设置"></i>
        <i class="el-icon-search" title="表格内检索"></i>
      </div>
      <!-- 外出数据表格 -->
      <el-table :data="tableData" border width="100%" empty-text="暂无数据">
        <el-table-column label="序号" type="index" width="70"></el-table-column>
        <el-table-column prop="elderName" label="老人姓名" min-width="110"></el-table-column>
        <el-table-column prop="escortName" label="陪同人名称" min-width="120"></el-table-column>
        <el-table-column prop="escortPhone" label="陪同人员电话" min-width="140"></el-table-column>
        <el-table-column prop="isBack" label="是否返回" min-width="90"></el-table-column>
        <el-table-column prop="outDay" label="外出天数" min-width="90"></el-table-column>
        <el-table-column prop="refundMoney" label="退费金额" min-width="100"></el-table-column>
        <el-table-column prop="planOutDate" label="计划外出" min-width="160"></el-table-column>
        <el-table-column label="操作" min-width="120" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" size="mini">查看</el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ElderOutManage',
  data() {
    return {
      // 搜索条件
      searchForm: {
        elderName: '',
        escortType: '',
        outTime: []
      },
      // 表格数据
      tableData: []
    }
  },
  mounted() {
    this.getTableList()
  },
  methods: {
    // 搜索
    handleSearch() {
      console.log('搜索参数', this.searchForm)
      this.getTableList()
    },
    // 重置清空
    handleReset() {
      this.searchForm = {
        elderName: '',
        escortType: '',
        outTime: []
      }
      this.getTableList()
    },
    // 刷新表格
    refreshTable() {
      this.getTableList()
    },
    // 请求列表接口
    getTableList() {
      // 模拟接口，无数据展示空状态
      this.tableData = []
    }
  }
}
</script>

<style scoped lang="scss">
/* 整体页面纯白背景 */
.out-manage-page {
  padding: 16px;
  background: #ffffff;
  min-height: 100vh;
}

.el-card {
  margin-bottom: 16px;
}

// 顶部搜索区域
.search-card {
  .search-row {
    display: flex;
    align-items: center;
    flex-wrap: wrap;
    gap: 24px;

    .search-item {
      display: flex;
      align-items: center;

      label {
        margin-right: 8px;
        white-space: nowrap;
        font-size: 14px;
      }

      .el-input,
      .el-select,
      .el-date-editor {
        width: 200px;
      }
    }

    .search-btn-group {
      display: flex;
      gap: 12px;
    }
  }
}

// 表格卡片顶部工具栏
.table-card {
  position: relative;
  padding-top: 10px;

  .table-top-tool {
    position: absolute;
    top: 16px;
    right: 16px;
    display: flex;
    gap: 16px;

    i {
      font-size: 20px;
      cursor: pointer;
      color: #606266;

      &:hover {
        color: #409eff;
      }
    }
  }

  .el-table {
    margin-top: 40px;
    overflow-x: auto;
  }
}
</style>