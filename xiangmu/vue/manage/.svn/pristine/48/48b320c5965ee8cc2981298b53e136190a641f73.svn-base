<template>
  <div class="fee-record-page">
    <!-- 缴费记录 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">缴费记录</h3>
        <div class="icon-group">
          <el-button plain size="small">补打票据</el-button>
          <div class="icon-wrap">
            <i class="el-icon-refresh"></i>
            <i class="el-icon-menu"></i>
          </div>
        </div>
      </div>
      <el-table :data="payRecordTable" border>
        <el-table-column type="selection" width="50" />
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="减免费用" prop="reduceFee" />
        <el-table-column label="应收金额" prop="receivable" />
        <el-table-column label="实付金额" prop="actualPay" />
        <el-table-column label="应退金额" prop="refund" />
        <el-table-column label="预存账户" prop="preAccount" />
        <el-table-column label="开始时间" prop="startTime" />
        <el-table-column label="结束时间" prop="endTime" />
        <el-table-column label="备注" prop="remark" />
        <template #empty>
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <!-- 费用流水 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">费用流水</h3>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
        </div>
      </div>
      <el-table :data="feeFlowTable" border>
        <el-table-column type="selection" width="50" />
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="费用类型" prop="feeType" />
        <el-table-column label="是否为入住费用" prop="isCheckIn" />
        <el-table-column label="是否缴清" prop="isPaid" />
        <el-table-column label="记录年月日" prop="recordDate" />
        <el-table-column label="流水价格" prop="flowPrice" />
        <el-table-column label="月收费类型" prop="monthFeeType" />
        <el-table-column label="备注" prop="remark" />
        <template #empty>
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <!-- 一卡通流水 -->
    <div class="table-card">
      <div class="card-header">
        <h3 class="card-title">一卡通流水</h3>
        <div class="icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="cardFlowTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="卡号" prop="cardNo" />
        <el-table-column label="客户姓名" prop="customerName" />
        <el-table-column label="所属机构" prop="org" />
        <el-table-column label="充值前余额" prop="beforeBalance" />
        <el-table-column label="充值金额" prop="rechargeAmt" />
        <el-table-column label="充值后余额" prop="afterBalance" />
        <el-table-column label="充值单号" prop="rechargeNo" />
        <el-table-column label="充值时间" prop="rechargeTime" />
        <template #empty>
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
  name: "FeeRecordPage",
  data() {
    return {
      payRecordTable: [],
      feeFlowTable: [],
      cardFlowTable: []
    }
  }
}
</script>

<style scoped lang="less">
.fee-record-page {
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
      .icon-wrap {
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