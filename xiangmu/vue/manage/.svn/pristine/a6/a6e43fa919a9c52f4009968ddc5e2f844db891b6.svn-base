<template>
  <div class="order-doctor-page">
    <!-- 1. 顶部筛选搜索区域 -->
    <div class="search-wrap el-card">
      <div class="search-form-row">
        <div class="search-item">
          <label>老人姓名:</label>
          <el-input v-model="searchForm.elderName" placeholder="请输入老人姓名" clearable></el-input>
        </div>
        <div class="search-item">
          <label>期效:</label>
          <el-select v-model="searchForm.period" placeholder="请选择期效" clearable>
            <el-option label="长期医嘱" value="long"></el-option>
            <el-option label="临时医嘱" value="short"></el-option>
          </el-select>
        </div>
        <div class="search-item">
          <label>类型:</label>
          <el-input v-model="searchForm.type" placeholder="请输入类型" clearable></el-input>
        </div>
        <div class="search-item">
          <label>开医嘱时间:</label>
          <el-date-picker v-model="searchForm.createTime" type="datetimerange" range-separator="-"
            start-placeholder="开始" end-placeholder="结束"></el-date-picker>
        </div>
      </div>
      <div class="search-btn-group">
        <el-button type="primary" icon="el-icon-search" @click="handleSearch">搜索</el-button>
        <el-button @click="handleReset">清空</el-button>
      </div>
    </div>

    <!-- 2. 状态筛选栏 -->
    <div class="status-filter el-card">
      <el-radio-group v-model="currentStatus">
        <el-radio label="new">新开/待提交</el-radio>
        <el-radio label="check">待确认/待复核</el-radio>
        <el-radio label="waitExec">已确认/待执行</el-radio>
        <el-radio label="execing">执行中</el-radio>
        <el-radio label="execed">已执行</el-radio>
        <el-radio label="invalid">已作废</el-radio>
        <el-radio label="back">退回</el-radio>
        <el-radio label="stop">已停止</el-radio>
        <el-radio label="cancel">取消</el-radio>
      </el-radio-group>
      <div class="table-tool-icons">
        <i class="el-icon-refresh" @click="refreshTable" title="刷新"></i>
        <i class="el-icon-menu" title="列设置"></i>
        <i class="el-icon-search" title="表格内搜索"></i>
      </div>
    </div>

    <!-- 3. 医嘱表格区域 -->
    <div class="table-wrap el-card">
      <el-table :data="tableData" border width="100%" ref="doctorTable" empty-text="暂无数据">
        <el-table-column type="selection" width="50"></el-table-column>
        <el-table-column label="序号" type="index" width="60"></el-table-column>
        <el-table-column prop="elderName" label="老人姓名" min-width="100"></el-table-column>
        <el-table-column prop="period" label="期效" min-width="80"></el-table-column>
        <el-table-column prop="orderName" label="医嘱项目" min-width="120"></el-table-column>
        <el-table-column prop="unit" label="计量单位" min-width="90"></el-table-column>
        <el-table-column prop="price" label="单价" min-width="70"></el-table-column>
        <el-table-column prop="type" label="类型" min-width="80"></el-table-column>
        <el-table-column prop="num" label="数量" min-width="70"></el-table-column>
        <el-table-column prop="singleNum" label="单次用量" min-width="90"></el-table-column>
        <el-table-column prop="total" label="总" min-width="70"></el-table-column>
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
  name: 'DoctorOrderManage',
  data() {
    return {
      // 顶部搜索表单
      searchForm: {
        elderName: '',
        period: '',
        type: '',
        createTime: []
      },
      // 当前选中状态（默认取消）
      currentStatus: 'cancel',
      // 表格数据
      tableData: [],
    }
  },
  methods: {
    // 搜索
    handleSearch() {
      console.log('搜索参数', this.searchForm, '状态', this.currentStatus)
      this.getTableList()
    },
    // 重置清空
    handleReset() {
      this.searchForm = {
        elderName: '',
        period: '',
        type: '',
        createTime: []
      }
      this.currentStatus = 'cancel'
      this.getTableList()
    },
    // 刷新表格
    refreshTable() {
      this.getTableList()
    },
    // 请求列表接口
    getTableList() {
      this.tableData = []
    }
  }
}
</script>

<style scoped lang="scss">
.order-doctor-page {
  padding: 16px;
  /* 仅这里修改：原来#f5f7fa灰色改为纯白#ffffff */
  background: #ffffff;
  min-height: 100vh;
}

.el-card {
  margin-bottom: 16px;
}

// 顶部搜索栏样式
.search-wrap {
  .search-form-row {
    display: flex;
    align-items: center;
    flex-wrap: wrap;
    gap: 24px;
    margin-bottom: 16px;

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
  }

  .search-btn-group {
    text-align: center;
  }
}

// 状态筛选行
.status-filter {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 12px 16px;

  .el-radio-group {
    display: flex;
    gap: 12px;
  }

  .table-tool-icons {
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
}

// 表格区域
.table-wrap {
  .el-table {
    overflow-x: auto;
  }
}
</style>