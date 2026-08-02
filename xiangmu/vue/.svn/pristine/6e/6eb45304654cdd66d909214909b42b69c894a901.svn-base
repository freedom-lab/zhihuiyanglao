<template>
  <div class="ability-nurse-page">
    <!-- C4 能力等级变更依据 -->
    <div class="block-item">
      <p class="block-title">能力等级变更的项目:</p>
      <el-checkbox-group v-model="form.changeList">
        <div class="checkbox-row">
          <el-checkbox label="处于昏迷状态者，直接评定为能力完全丧失(完全失能)" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="确诊为痴呆(F00～F03)、精神科专科医生诊断的其他精神和行为障碍疾病(F04～F99)，在原有能力级别上应提高一个级别" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="近30天内发生过2次及以上照护风险事件(如跌倒、噎食、自杀、自伤、走失等)，在原有能力级别上提高一个等级" />
        </div>
      </el-checkbox-group>
    </div>

    <!-- C5 老年人能力最终等级 -->
    <div class="block-item">
      <p class="block-title">C5 老年人能力最终等级:
        <span class="desc">综合C3 "老年人能力初步等级"和C4"能力等级变更依据"的结果,判定老年人能力最终等级:</span>
      </p>
      <el-checkbox-group v-model="form.finalLevel">
        <div class="checkbox-row">
          <el-checkbox label="能力完好" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="能力轻度受损(轻度失能)" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="能力中度受损(中度失能)" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="能力重度受损(重度失能)" />
        </div>
        <div class="checkbox-row">
          <el-checkbox label="能力完全丧失(完全失能)" />
        </div>
      </el-checkbox-group>
    </div>

    <!-- 护理信息模块 -->
    <div class="nurse-block">
      <p class="sub-title">护理信息</p>
      <div class="table-top-bar">
        <div class="btn-left">
          <el-button color="#f7e7b9" text>导出</el-button>
          <el-button color="#c6e0ff" text>执行</el-button>
          <el-button color="#ffd6d6" text>删除</el-button>
        </div>
        <div class="icon-right">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="nurseTable" border>
        <el-table-column type="selection" width="50" />
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="护理日期" prop="nurseDate" />
        <el-table-column label="执行频率" prop="freq" />
        <el-table-column label="客户姓名" prop="name" />
        <el-table-column label="床位号" prop="bedNo" />
        <el-table-column label="性别" prop="gender" />
        <el-table-column label="护理项目" prop="item" />
        <el-table-column label="任务类型" prop="taskType" />
        <el-table-column label="计划执行时间" prop="planTime" />
        <el-table-column label="完成情况" prop="finishStatus" />
        <el-table-column label="执行时间" prop="execTime" />
        <template slot="empty">
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
  name: "AbilityNurse",
  data() {
    return {
      form: {
        changeList: [],
        finalLevel: []
      },
      nurseTable: []
    }
  }
}
</script>

<style scoped lang="less">
.ability-nurse-page {
  .block-item {
    margin-bottom: 24px;
    .block-title {
      font-size: 15px;
      margin-bottom: 10px;
      .desc {
        color: #666;
        font-size: 14px;
      }
    }
    .checkbox-row {
      margin-bottom: 8px;
    }
  }
  .sub-title {
    font-size: 16px;
    font-weight: 500;
    margin: 32px 0 14px;
  }
  .nurse-block {
    background: #fff;
    padding: 16px;
    border-radius: 6px;
    box-shadow: 0 0 8px rgba(0,0,0,0.05);
  }
  .table-top-bar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 14px;
    .btn-left {
      display: flex;
      gap: 10px;
    }
    .icon-right {
      display: flex;
      gap: 18px;
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