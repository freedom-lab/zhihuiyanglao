<template>
  <!-- 最外层flex左右布局容器 -->
  <div class="home-wrap">
    <!-- 左侧大区域 -->
    <div class="home-left">
      <!-- 左上：数据概览 8张统计卡片 -->
      <div class="panel-box stat-panel">
        <div class="panel-title">
          <!-- <i class="el-icon-data-line"></i>
          <span>数据概况</span> -->
          <div class="table-title">数据概况</div>
        </div>
        <el-row :gutter="16">
          <!-- 第一行4张 -->
          <el-col :span="6">
            <div class="stat-card card1">
              <div class="stat-icon"><i class="el-icon-document-checked"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.checkInElder }}</div>
                <div class="label">入住老人人数 (人)</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card2">
              <div class="stat-icon"><i class="el-icon-notebook"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.tryElder }}</div>
                <div class="label">试住老人人数 (人)</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card3">
              <div class="stat-icon"><i class="el-icon-tickets"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.bookElder }}</div>
                <div class="label">预定老人人数 (人)</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card4">
              <div class="stat-icon"><i class="el-icon-document-delete"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.outElder }}</div>
                <div class="label">退住老人人数 (人)</div>
              </div>
            </div>
          </el-col>
          <!-- 第二行4张 -->
          <el-col :span="6">
            <div class="stat-card card5">
              <div class="stat-icon"><i class="el-icon-house"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.totalBed }}</div>
                <div class="label">床位总数 (张)</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card6">
              <div class="stat-icon"><i class="el-icon-s-home"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.freeBed }}</div>
                <div class="label">空闲床位数 (张)</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card7">
              <div class="stat-icon"><i class="el-icon-data-analysis"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.checkInRate }} %</div>
                <div class="label">入住率</div>
              </div>
            </div>
          </el-col>
          <el-col :span="6">
            <div class="stat-card card8">
              <div class="stat-icon"><i class="el-icon-group"></i></div>
              <div class="stat-text">
                <div class="num">{{ statData.staffTotal }}</div>
                <div class="label">员工总数 (人)</div>
              </div>
            </div>
          </el-col>
        </el-row>
      </div>

      <!-- 左中：常用功能 -->
      <div class="panel-box func-panel">
        <div class="panel-title">
          <!-- <i class="el-icon-menu"></i> -->
          <div class="table-title">常用功能</div>
          <i class="el-icon-setting setting-icon"></i>
        </div>
        <div class="func-empty">
          <i class="el-icon-s-order empty-icon"></i>
          <p>暂无菜单</p>
        </div>
      </div>

      <!-- 左下：左右分栏 入住审核 / 退住审核 -->
      <div class="panel-row-two">
        <!-- 入住审核 -->
        <div class="panel-box audit-left">
          <div class="panel-title">
            <div class="table-title">入住审核</div>
            <span class="more-text" @click="goAuditIn">更多 ></span>
          </div>
          <el-table border :data="auditInList" empty-text="暂无数据" max-height="100%">
            <el-table-column label="老人姓名" prop="name" align="center" />
            <el-table-column label="入住日期" prop="checkDate" align="center" />
            <el-table-column label="床位信息" prop="bedInfo" align="center" />
            <el-table-column label="能力等级" prop="nursingLevel" align="center" />
            <el-table-column label="操作" align="center">
              <template slot-scope="scope">
                <el-button size="mini" type="primary">审核</el-button>
              </template>
            </el-table-column>
          </el-table>
        </div>
        <!-- 退住审核 -->
        <div class="panel-box audit-right">
          <div class="panel-title">
            <div class="table-title">退住审核</div>
            <span class="more-text" @click="goAuditOut">更多 ></span>
          </div>
          <el-table border :data="auditOutList" empty-text="暂无数据" max-height="100%">
            <el-table-column label="姓名" prop="name" align="center" />
            <el-table-column label="计划退住日期" prop="outPlanDate" align="center" />
            <el-table-column label="退住类型" prop="outType" align="center" />
            <el-table-column label="退住原因" prop="outReason" align="center" />
            <el-table-column label="操作" align="center">
              <template slot-scope="scope">
                <el-button size="mini" type="primary">审核</el-button>
              </template>
            </el-table-column>
          </el-table>
        </div>
      </div>
    </div>

    <!-- 右侧大区域 -->
    <div class="home-right">
      <!-- 右1：今日个人信息卡片 -->
      <div class="user-card">
        <div class="user-head">
          <div class="avatar"><i class="el-icon-user-solid"></i></div>
          <div class="user-text">
            <div class="name">您好😊，{{ loginUserName }}</div>
            <div class="weather">☀️ 天气晴，温度28℃, 2026-06-09，星期二</div>
          </div>
        </div>
      </div>

      <!-- 右2：告警信息 -->
      <div class="panel-box warn-panel">
        <div class="panel-title">
          <div class="table-title">告警信息</div>
          <span class="more-text">更多 ></span>
        </div>
        <el-table border :data="warnList" empty-text="暂无数据" max-height="100%">
          <el-table-column label="告警类型" prop="warnType" align="center" />
          <el-table-column label="告警内容" prop="warnContent" align="center" />
          <el-table-column label="告警时间" prop="warnTime" align="center" />
          <el-table-column label="状态" prop="status" align="center" />
          <el-table-column label="操作" align="center">
            <template slot-scope="scope">
              <el-button size="mini" type="text">处理</el-button>
            </template>
          </el-table-column>
        </el-table>
      </div>

      <!-- 右3：本月生日提醒 -->
      <div class="panel-box birthday-panel">
        <div class="panel-title">
          <div class="table-title">生日提醒 (本月)</div>
        </div>
        <div class="birthday-item" v-for="(item,idx) in birthdayList" :key="idx">
          <span>{{ item.name }}</span>
          <span>{{ item.gender }}</span>
          <span>{{ item.age }}岁</span>
          <span>{{ item.birthDay }}</span>
          <span>{{ item.bedAddr }}</span>
        </div>
      </div>

      <!-- 右4：Tab标签栏 -->
      <div class="panel-box tab-panel">
        <el-tabs v-model="activeTab">
          <el-tab-pane label="养老新闻" name="news">
            <div class="tab-empty">暂无养老新闻</div>
          </el-tab-pane>
          <el-tab-pane label="通知公告" name="notice">
            <div class="tab-empty">暂无通知公告</div>
          </el-tab-pane>
          <el-tab-pane label="机构活动" name="activity">
            <div class="tab-empty">暂无机构活动</div>
          </el-tab-pane>
        </el-tabs>
        <span class="more-tab">更多 ></span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "HomeIndex",
  data() {
    return {
      // Tab激活项
      activeTab: "news",
      // 数据概览虚拟统计
      statData: {
        checkInElder: 3,
        tryElder: 0,
        bookElder: 0,
        outElder: 0,
        totalBed: 12,
        freeBed: 9,
        checkInRate: "25.00",
        staffTotal: 133
      },
      // 入住审核虚拟表格数据
      auditInList: [],
      // 退住审核虚拟表格数据
      auditOutList: [],
      // 告警信息
      warnList: [],
      // 本月生日老人列表
      birthdayList: [
        { name: "钱测试", gender: "男", age: 71, birthDay: "1954-06-08", bedAddr: "1号楼-1F-103-1" },
        { name: "赵测试", gender: "女", age: 74, birthDay: "1952-06-01", bedAddr: "1号楼-1F-102-1" },
        { name: "李测试", gender: "男", age: 68, birthDay: "1958-06-01", bedAddr: "1号楼-1F-101-2" }
      ],
      loginUserName: "",
    }
  },
  created() {
    try{
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      console.log(userInfo)
      this.loginUserName = userInfo.userInfo.name;
    }catch(e){
      console.log(e)
    }
  },
  methods: {
    goAuditIn() {
      this.$message.info("跳转入住审核页面");
    },
    goAuditOut() {
      this.$message.info("跳转退住审核页面");
    }
  }
}
</script>

<style lang="less" scoped>
// 最外层左右flex布局
.home-wrap {
  display: flex;
  gap: 10px;
  padding: 8px 16px;
  background: #f5f7fa;
  flex: 1;
  height: 90%;
  width: 100%;

  *{
    box-sizing: border-box;
  }
  // 左侧容器
  .home-left {
    width: 70%;
    flex: 7;
    // flex: 1;
    display: flex;
    flex-direction: column;
    gap: 10px;
  }
  // 右侧容器
  .home-right {
    width: 30%;
    flex: 3;
    display: flex;
    flex-direction: column;
    gap: 10px;
  }

  // 通用面板盒子
  .panel-box {
    background: #fff;
    border-radius: 6px;
    padding: 12px;
    box-shadow: 0 1px 4px rgba(0,0,0,0.08);
    overflow-y: auto;

    .panel-title {
      display: flex;
      justify-content: space-between;
      align-items: center;
      font-size: 16px;
      font-weight: 500;
      color: #303133;
      margin-bottom: 4px;
      i {
        color: #409eff;
        margin-right: 6px;
      }
      .setting-icon {
        color: #909399;
        cursor: pointer;
      }
      .more-text {
        font-size: 13px;
        color: #409eff;
        cursor: pointer;
      }
    }
  }

  // 数据概览卡片
  .stat-panel {
    .stat-card {
      border-radius: 6px;
      padding: 10px;
      display: flex;
      align-items: center;
      margin-bottom: 6px;
      box-sizing: border-box;
      gap: 10px;
      .stat-icon {
        width: 40px;
        height: 40px;
        border-radius: 4px;
        display: flex;
        align-items: center;
        justify-content: center;
        i {
          font-size: 22px;
          color: #fff;
        }
      }
      .stat-text {
        .num {
          font-size: 24px;
          font-weight: bold;
          color: #303133;
          line-height: 1;
        }
        .label {
          font-size: 13px;
          color: #606266;
          margin-top: 2px;
        }
      }
    }
    .card1 {
      background: #ecfbf7;
      .stat-icon {
        background: #36c9a6;
      }
    }
    .card2 {
      background: #fff9e6;
      .stat-icon {
        background: #ffb940;
      }
    }
    .card3 {
      background: #e8f7ff;
      .stat-icon {
        background: #40a9ff;
      }
    }
    .card4 {
      background: #ffeef0;
      .stat-icon {
        background: #f56c6c;
      }
    }
    .card5 {
      background: #fff7e6;
      .stat-icon {
        background: #ff9500;
      }
    }
    .card6 {
      background: #e6faf8;
      .stat-icon {
        background: #26c2b1;
      }
    }
    .card7 {
      background: #e8f3ff;
      .stat-icon {
        background: #4285f4;
      }
    }
    .card8 {
      background: #f3efff;
      .stat-icon {
        background: #8c61e8;
      }
    }
  }

  // 常用功能面板
  .func-panel {
    .func-empty {
      text-align: center;
      padding: 10px 0;
      color: #c0c4cc;
      .empty-icon {
        font-size: 48px;
        margin-bottom: 10px;
      }
    }
  }

  // 左下 入住+退住 左右双栏
  .panel-row-two {
    display: flex;
    gap: 16px;
    flex: 1;
    .panel-box {
      flex: 1;
    }
  }

  // 右侧顶部用户信息卡片
  .user-card {
    background: linear-gradient(135deg, #63b8ff, #4089f7);
    border-radius: 6px;
    padding: 20px 16px;
    color: #fff;
    .user-head {
      display: flex;
      align-items: center;
      gap: 12px;
      .avatar {
        width: 48px;
        height: 48px;
        background: #fff;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        i {
          font-size: 26px;
          color: #4089f7;
        }
      }
      .user-text {
        .name {
          font-size: 18px;
          font-weight: 500;
          margin-bottom: 6px;
        }
        .weather {
          font-size: 14px;
          opacity: 0.9;
        }
      }
    }
  }
  .warn-panel{
    height: 210px;
  }

  // 生日提醒列表
  .birthday-panel {
    .birthday-item {
      display: flex;
      gap: 10px;
      font-size: 13px;
      color: #606266;
      padding: 6px 0;
      border-bottom: 1px solid #f0f0f0;
      &:last-child {
        border-bottom: none;
      }
    }
  }

  // Tab面板
  .tab-panel {
    position: relative;
    flex: 1;
    .more-tab {
      position: absolute;
      top: 16px;
      right: 16px;
      font-size: 13px;
      color: #409eff;
      cursor: pointer;
    }
    .tab-empty {
      text-align: center;
      padding: 30px 0;
      color: #c0c4cc;
    }
  }
}
@media (max-width: 1440px) {
  .home-wrap{
    font-size: 14px;
  }
  .warn-panel{
    height: 140px;
  }
}
</style>