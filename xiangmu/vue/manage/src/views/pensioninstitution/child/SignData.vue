<template>
  <div class="health-check-page">
    <div class="layout-wrap">
      <!-- 左侧侧边栏 -->
      <div class="left-sidebar">
        <el-input placeholder="输入关键字进" />
        <el-menu mode="vertical">
          <el-submenu index="1">
            <template #title>基础指标</template>
          </el-submenu>
          <el-submenu index="2">
            <template #title>基础数据</template>
          </el-submenu>
          <el-menu-item index="3">人流量监测</el-menu-item>
        </el-menu>
      </div>
      <!-- 右侧主区域 -->
      <div class="main-content">
        <!-- 搜索栏 -->
        <div class="search-card">
          <div class="search-row">
            <div class="search-item">
              <label>体检日期:</label>
              <el-date-picker type="daterange" range-separator="-" start-placeholder="开始" end-placeholder="结束" />
            </div>
            <div class="search-item">
              <label>数据来源:</label>
              <el-select placeholder="请选择 数据">
              </el-select>
            </div>
            <div class="btn-group">
              <el-button type="primary">搜索</el-button>
              <el-button>清空</el-button>
            </div>
          </div>
        </div>

        <!-- 表格卡片 -->
        <div class="table-card">
          <div class="table-top">
            <el-button text color="#f56c6c">删除</el-button>
            <div class="icon-group">
              <i class="el-icon-refresh"></i>
              <i class="el-icon-menu"></i>
              <i class="el-icon-search"></i>
            </div>
          </div>
          <el-table :data="tableData" border>
            <el-table-column type="selection" width="50" />
            <el-table-column label="序号" type="index" width="60" />
            <el-table-column label="老人" prop="oldName" />
            <el-table-column label="体检日期" prop="checkDate" />
            <el-table-column label="数据来源" prop="source" />
            <el-table-column label="状态" prop="status" />
            <el-table-column label="设备型号" prop="model" />
            <el-table-column label="设备厂商" prop="factory" />
            <el-table-column label="操作" width="100" />
            <template #empty>
              <div class="empty-box">
                <i class="el-icon-document"></i>
                <p>暂无数据</p>
              </div>
            </template>
          </el-table>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "HealthCheck",
  data() {
    return {
      tableData: []
    }
  }
}
</script>

<style scoped lang="less">
.health-check-page {
  .layout-wrap {
    display: flex;
    gap: 16px;
  }
  .left-sidebar {
    width: 180px;
    .el-input {
      margin-bottom: 16px;
    }
  }
  .main-content {
    flex: 1;
    display: flex;
    flex-direction: column;
    gap: 16px;
  }
  .search-card {
    background: #fff;
    padding: 16px;
    border-radius: 6px;
    box-shadow: 0 0 6px rgba(0,0,0,0.04);
    .search-row {
      display: flex;
      align-items: center;
      gap: 24px;
      .search-item {
        display: flex;
        align-items: center;
        gap: 8px;
        label {
          white-space: nowrap;
        }
      }
      .btn-group {
        display: flex;
        gap: 12px;
      }
    }
  }
  .table-card {
    background: #fff;
    padding: 16px;
    border-radius: 6px;
    box-shadow: 0 0 6px rgba(0,0,0,0.04);
  }
  .table-top {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 14px;
    .icon-group {
      display: flex;
      gap: 24px;
      font-size: 18px;
      color: #666;
    }
  }
  .empty-box {
    padding: 70px 0;
    text-align: center;
    color: #999;
    i {
      font-size: 50px;
      margin-bottom: 10px;
    }
  }
}
</style>