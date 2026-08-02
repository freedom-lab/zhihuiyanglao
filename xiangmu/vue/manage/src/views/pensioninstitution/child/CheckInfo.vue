<template>
  <div class="physical-exam-list-page">
    <!-- 搜索区域卡片 -->
    <div class="search-card">
      <div class="search-row">
        <div class="search-item">
          <label>老人姓名:</label>
          <el-input placeholder="请输入老人姓名" />
        </div>
        <div class="search-item">
          <label>体检时间:</label>
          <el-date-picker placeholder="请选择体检时" />
        </div>
        <el-button type="primary">搜索</el-button>
        <el-button>清空</el-button>
      </div>
    </div>

    <!-- 表格区域卡片 -->
    <div class="table-card">
      <div class="table-top-bar">
        <el-button text style="background:#f7e7b9;">导出</el-button>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="tableData" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="老人姓名" prop="oldName" />
        <el-table-column label="床位号" prop="bedNo" />
        <el-table-column label="体检医院" prop="hospital" />
        <el-table-column label="体检时间" prop="examTime" />
        <el-table-column label="体检结果" prop="result" />
        <el-table-column label="登记人" prop="creator" />
        <el-table-column label="登记时间" prop="createTime" />
        <el-table-column label="操作" width="100" />
        <template #empty>
          <div class="empty-wrap">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>
  </div>
</template>

<script>
export default {
  name: "PhysicalExamList",
  data() {
    return {
      tableData: []
    }
  }
}
</script>

<style scoped lang="less">
.physical-exam-list-page {
  display: flex;
  flex-direction: column;
  gap: 16px;
  .search-card,
  .table-card {
    background: #fff;
    padding: 16px;
    border-radius: 6px;
    box-shadow: 0 0 6px rgba(0,0,0,0.04);
  }
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
        font-size: 15px;
      }
    }
  }
  .table-top-bar {
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
  .empty-wrap {
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