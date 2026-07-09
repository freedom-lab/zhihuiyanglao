<template>
  <div class="change-record-page">
    <el-tabs v-model="activeTab">
      <el-tab-pane label="床位变更" name="bed"></el-tab-pane>
      <el-tab-pane label="餐饮变更" name="food"></el-tab-pane>
      <el-tab-pane label="护理级别变更" name="nurse"></el-tab-pane>
    </el-tabs>

    <div class="table-card">
      <div class="table-header">
        <div></div>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="tableData" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="房号" prop="roomNo" />
        <el-table-column label="操作时间" prop="operateTime" />
        <el-table-column label="计费开始时间" prop="chargeStart" />
        <el-table-column label="计费结束时间" prop="chargeEnd" />
        <el-table-column label="操作类型" prop="operateType" />
        <el-table-column label="是否拼房" prop="isShare" />
        <el-table-column label="床位类型" prop="bedType" />
        <el-table-column label="价格:元/天" prop="priceDay" />
        <el-table-column label="价格:元/月" prop="priceMonth" />
        <el-table-column label="操作人" prop="operator" />
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
  name: "ChangeRecord",
  data() {
    return {
      activeTab: "bed",
      tableData: []
    }
  }
}
</script>

<style scoped lang="less">
.change-record-page {
  .el-tabs {
    margin-bottom: 20px;
  }
  .table-card {
    background: #fff;
    border-radius: 6px;
    box-shadow: 0 0 6px rgba(0,0,0,0.04);
    padding: 16px;
  }
  .table-header {
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
      font-size: 52px;
      margin-bottom: 10px;
    }
  }
}
</style>