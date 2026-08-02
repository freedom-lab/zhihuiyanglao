<template>
  <div class="health-file-page">
    <h3 class="title">病史</h3>

    <div class="form-row">
      <label class="row-label">现病史：</label>
      <el-checkbox-group v-model="form.currentIll">
        <el-checkbox label="高血糖" />
        <el-checkbox label="高血压" />
        <el-checkbox label="心脏病" />
        <el-checkbox label="脑血栓" />
        <el-checkbox label="冠心病" />
        <el-checkbox label="高血氧" />
        <el-checkbox label="其他" />
        <el-checkbox label="高血脂" />
      </el-checkbox-group>
    </div>

    <div class="form-row">
      <label class="row-label">暴露史：</label>
      <el-checkbox-group v-model="form.expose">
        <el-checkbox label="疫区疫水接触史" />
        <el-checkbox label="工业毒物，粉尘，放射性物质接触史" />
        <el-checkbox label="烟尘" />
      </el-checkbox-group>
    </div>

    <div class="form-row">
      <label class="row-label">传染病史：</label>
      <el-checkbox-group v-model="form.infect">
        <el-checkbox label="乙肝" />
        <el-checkbox label="丙肝" />
        <el-checkbox label="梅毒" />
        <el-checkbox label="艾滋病" />
        <el-checkbox label="手足口" />
      </el-checkbox-group>
    </div>

    <div class="block-wrap">
      <h4 class="block-title">既往史</h4>
      <div class="search-bar">
        <el-input v-model="searchPast.name" placeholder="请输入疾病名称" />
        <el-input v-model="searchPast.hospital" placeholder="诊断医院或社区:" />
        <span>确诊时间:</span>
        <el-date-picker v-model="searchPast.time" type="daterange" range-separator="-" start-placeholder="开始" end-placeholder="结束" />
        <el-button type="primary">搜索</el-button>
        <el-button>清空</el-button>
      </div>
      <div class="table-operate">
        <el-button type="primary">+ 新增</el-button>
        <div class="table-icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="pastTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="疾病名称" prop="name" />
        <el-table-column label="确诊时间" prop="time" />
        <el-table-column label="诊断医院或社区" prop="hospital" />
        <el-table-column label="现在状态" prop="status" />
        <el-table-column label="备注" prop="remark" />
        <el-table-column label="操作" width="100" />
        <template slot="empty">
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <div class="block-wrap">
      <h4 class="block-title">家族史</h4>
      <div class="search-bar">
        <el-input v-model="searchFamily.name" placeholder="疾病名称:" />
        <el-select v-model="searchFamily.relation" placeholder="请选择关系">
        </el-select>
        <el-button type="primary">搜索</el-button>
        <el-button>清空</el-button>
      </div>
      <div class="table-operate">
        <el-button type="primary">+ 新增</el-button>
        <div class="table-icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
          <i class="el-icon-search"></i>
        </div>
      </div>
      <el-table :data="familyTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="疾病名称" prop="name" />
        <el-table-column label="关系" prop="relation" />
        <el-table-column label="备注" prop="remark" />
        <el-table-column label="操作" width="100" />
        <template slot="empty">
          <div class="empty-box">
            <i class="el-icon-document"></i>
            <p>暂无数据</p>
          </div>
        </template>
      </el-table>
    </div>

    <div class="block-wrap">
      <h4 class="block-title">用药史</h4>
      <div class="table-operate">
        <el-button type="primary">+ 新增</el-button>
        <div class="table-icon-group">
          <i class="el-icon-refresh"></i>
          <i class="el-icon-menu"></i>
        </div>
      </div>
      <el-table :data="drugTable" border>
        <el-table-column label="序号" type="index" width="60" />
        <el-table-column label="药名" prop="drugName" />
        <el-table-column label="服药日期" prop="takeDate" />
        <el-table-column label="用药剂量" prop="dose" />
        <el-table-column label="服用疗程" prop="course" />
        <el-table-column label="服用方法" prop="method" />
        <el-table-column label="作用" prop="effect" />
        <el-table-column label="操作" width="100" />
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
  name: "HealthFile",
  data() {
    return {
      form: {
        currentIll: [],
        expose: [],
        infect: [],
      },
      searchPast: {
        name: "",
        hospital: "",
        time: [],
      },
      searchFamily: {
        name: "",
        relation: "",
      },
      pastTable: [],
      familyTable: [],
      drugTable: [],
    };
  },
};
</script>

<style scoped lang="less">
.health-file-page {
  .title {
    font-size: 18px;
    margin-bottom: 16px;
    font-weight: 500;
  }
  .form-row {
    display: flex;
    align-items: center;
    margin-bottom: 14px;
    .row-label {
      width: 80px;
      font-size: 14px;
    }
  }
  .block-wrap {
    margin-top: 32px;
    background: #fff;
    padding: 16px;
    border-radius: 4px;
  }
  .block-title {
    font-size: 16px;
    margin-bottom: 14px;
    font-weight: 500;
  }
  .search-bar {
    display: flex;
    gap: 12px;
    align-items: center;
    margin-bottom: 14px;
  }
  .table-operate {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 14px;
    .table-icon-group {
      display: flex;
      gap: 16px;
      font-size: 18px;
      color: #666;
    }
  }
  .empty-box {
    padding: 60px 0;
    text-align: center;
    color: #999;
    i {
      font-size: 46px;
      margin-bottom: 10px;
    }
  }
}
</style>