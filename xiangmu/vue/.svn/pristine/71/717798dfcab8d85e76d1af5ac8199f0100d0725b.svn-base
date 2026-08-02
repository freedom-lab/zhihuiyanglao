<template>
  <div class="page-container">
    <!-- 顶部筛选区域 -->
    <div class="search-card">
      <div class="search-row">
        <div class="search-item">
          <label>姓名：</label>
          <el-input v-model="searchForm.name" placeholder="请输入老人姓名" clearable></el-input>
        </div>
        <div class="search-item">
          <label>床位号：</label>
          <el-input v-model="searchForm.bedNo" placeholder="请输入床位号" clearable></el-input>
        </div>
        <div class="search-item">
          <label>入住状态：</label>
          <el-select v-model="searchForm.liveStatus" placeholder="请选择" clearable>
            <el-option label="在住" value="1"></el-option>
            <el-option label="退住" value="2"></el-option>
          </el-select>
        </div>
        <div class="search-item">
          <label>所属机构：</label>
          <el-select v-model="searchForm.orgId" placeholder="请选择" clearable>
            <el-option label="总院" value="1"></el-option>
            <el-option label="分院A" value="2"></el-option>
          </el-select>
        </div>
        <div class="search-btn-wrap">
          <el-button type="primary" icon="el-icon-search" @click="handleSearch">搜索</el-button>
          <el-button @click="handleReset">清空</el-button>
        </div>
      </div>
      <!-- 上方分页 -->
      <div class="page-top">
        <el-pagination :current-page="page.pageNum" :page-size="page.pageSize" layout="prev, pager, next, jumper, total"
          :total="page.total" @current-change="pageChange"></el-pagination>
      </div>
    </div>

    <!-- 中间空白暂无数据区域 -->
    <div class="empty-box">
      <i class="el-icon-box empty-icon"></i>
      <p class="empty-text">暂无数据</p>
    </div>

    <!-- 底部分页 -->
    <div class="page-bottom">
      <el-pagination :current-page="page.pageNum" :page-size="page.pageSize" layout="prev, pager, next, jumper, total"
        :total="page.total" @current-change="pageChange"></el-pagination>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ElderListPage',
  data() {
    return {
      // 搜索条件
      searchForm: {
        name: '',
        bedNo: '',
        liveStatus: '',
        orgId: ''
      },
      // 分页参数
      page: {
        pageNum: 1,
        pageSize: 10,
        total: 0
      },
      tableData: []
    }
  },
  methods: {
    // 查询
    handleSearch() {
      this.page.pageNum = 1
      this.getList()
    },
    // 重置
    handleReset() {
      this.searchForm = {
        name: '',
        bedNo: '',
        liveStatus: '',
        orgId: ''
      }
      this.page.pageNum = 1
      this.getList()
    },
    // 分页切换
    pageChange(val) {
      this.page.pageNum = val
      this.getList()
    },
    // 列表接口
    getList() {
      // 模拟请求，total=0 展示暂无数据
      this.page.total = 0
      this.tableData = []
    }
  },
  mounted() {
    this.getList()
  }
}
</script>

<style scoped lang="scss">
// 全局页面：纯白背景，无灰色
.page-container {
  background-color: #ffffff;
  min-height: 100vh;
  padding: 12px;
}

// 顶部筛选卡片，纯白底色，无边距灰色
.search-card {
  background: #fff;
  border: 1px solid #e6e6e6;
  border-radius: 4px;
  padding: 16px;
  margin-bottom: 40px;

  .search-row {
    display: flex;
    align-items: center;
    flex-wrap: wrap;
    gap: 20px;
    margin-bottom: 16px;

    .search-item {
      display: flex;
      align-items: center;

      label {
        white-space: nowrap;
        margin-right: 6px;
      }

      .el-input,
      .el-select {
        width: 160px;
      }
    }

    .search-btn-wrap {
      margin-left: 10px;
    }
  }

  // 上方分页居右
  .page-top {
    text-align: right;
  }
}

// 中间空白区域居中
.empty-box {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 80px 0;

  .empty-icon {
    font-size: 100px;
    color: #e5e7eb;
  }

  .empty-text {
    margin-top: 12px;
    color: #999;
    font-size: 14px;
  }
}

// 底部分页居右
.page-bottom {
  text-align: right;
  margin-top: 20px;
}
</style>