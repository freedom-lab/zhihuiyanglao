<template>
  <div class="medicine-page">
    <!-- 用药设置 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">用药设置</h3>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="medicineSetTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="老人姓名" prop="oldName" />
        <el-table-column label="床号" prop="bedNo" />
        <el-table-column label="疾病" prop="illness" />
        <el-table-column label="疾病种类数" prop="illCount" />
        <el-table-column label="所属机构" prop="org" />
        <template slot="empty">
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <!-- 用药登记 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">用药登记</h3>
        <div class="icon-group">
          <el-button text color="#f56c6c">删除</el-button>
          <div class="icon-inner">
            <i class="el-icon-refresh"></i>
            <i class="el-icon-menu"></i>
            <i class="el-icon-search"></i>
          </div>
        </div>
      </div>
      <el-table :data="medicineRecordTable" border>
        <el-table-column type="selection" width="50" />
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="老人姓名" prop="oldName" />
        <el-table-column label="床号" prop="bedNo" />
        <el-table-column label="药名" prop="drugName" />
        <el-table-column label="数量" prop="num" />
        <el-table-column label="用药日期" prop="useDate" />
        <el-table-column label="时间" prop="time" />
        <el-table-column label="用药类型" prop="drugType" />
        <el-table-column label="所属机构" prop="org" />
        <template slot="empty">
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <!-- 剩余用药 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">剩余用药</h3>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="remainMedicineTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="老人姓名" prop="oldName" />
        <el-table-column label="床位号" prop="bedNo" />
        <el-table-column label="药品名称" prop="drugName" />
        <el-table-column label="规格" prop="spec" />
        <el-table-column label="剩余药品" prop="remainNum" />
        <el-table-column label="药品结余状态" prop="remainStatus" />
        <el-table-column label="所属机构" prop="org" />
        <template slot="empty">
          <div class="empty-box">
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
  name: "MedicinePage",
  data() {
    return {
      medicineSetTable: [],
      medicineRecordTable: [],
      remainMedicineTable: []
    }
  }
}
</script>

<style scoped lang="less">
.medicine-page {
  .table-card {
    background: #fff;
    border-radius: 6px;
    box-shadow: 0 0 6px rgba(0,0,0,0.04);
    padding: 16px;
    margin-bottom: 24px;
  }
  .card-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 14px;
    .card-title {
      font-size: 16px;
      font-weight: 500;
      margin: 0;
    }
    .icon-group {
      display: flex;
      align-items: center;
      gap: 16px;
      font-size: 18px;
      color: #666;
      .icon-inner {
        display: flex;
        gap: 16px;
      }
    }
  }
  .empty-box {
    padding: 60px 0;
    text-align: center;
    color: #999;
    i {
      font-size: 48px;
      margin-bottom: 10px;
    }
  }
}
</style>