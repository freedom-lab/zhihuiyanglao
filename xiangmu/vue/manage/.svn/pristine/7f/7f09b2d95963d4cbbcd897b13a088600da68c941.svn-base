<template>
  <div class="app-container">
    <!-- 1. 周菜单基础信息设置 -->
    <el-card shadow="hover" class="box-card">
      <el-form :model="weekMenuForm" label-width="100px">
        <el-row :gutter="20">
          <el-col :span="8">
            <el-form-item label="选择周">
              <!-- 周选择器，自动取周一为开始、周日为结束 -->
              <el-date-picker
                v-model="weekValue"
                type="week"
                placeholder="选择整周"
                value-format="yyyy-MM-dd"
                @change="handleWeekChange"
              />
            </el-form-item>
          </el-col>
          <el-col :span="8">
            <el-form-item label="本周区间" label-width="100px">
              <el-input v-model="weekRangeText" disabled placeholder="选择周后自动生成周一至周日" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
    </el-card>

    <!-- 2. 每日菜单明细编辑区 (主子表联动) -->
    <el-card shadow="hover" style="margin-top: 15px;">
      <div slot="header" class="clearfix">
        <span>每周餐单明细</span>
        <el-button style="float: right;" type="primary" plain size="mini" icon="el-icon-plus" @click="addDetailRow">添加一行</el-button>
      </div>
      
      <el-table :data="weekMenuForm.details" border>
        <el-table-column label="星期" width="120">
          <template slot-scope="scope">
            <el-select 
              v-model="scope.row.weekNum" 
              placeholder="选择星期"
              @change="handleWeekNumChange(scope.row)"
            >
              <el-option :value="1" label="星期一" />
              <el-option :value="2" label="星期二" />
              <el-option :value="3" label="星期三" />
              <el-option :value="4" label="星期四" />
              <el-option :value="5" label="星期五" />
              <el-option :value="6" label="星期六" />
              <el-option :value="7" label="星期日" />
            </el-select>
          </template>
        </el-table-column>
        
        <el-table-column label="餐次" width="120">
          <template slot-scope="scope">
            <el-select v-model="scope.row.detailType" placeholder="选择餐次">
              <el-option :value="1" label="早餐" /><el-option :value="2" label="中餐" /><el-option :value="3" label="晚餐" />
            </el-select>
          </template>
        </el-table-column>

        <el-table-column label="选择菜品" min-width="300">
          <template slot-scope="scope">
            <el-select v-model="scope.row.foodId" filterable remote placeholder="搜索并选择菜品" >
              <el-option v-for="item in foodOptions" :key="item.id" :label="item.foodName" :value="item.id" />
            </el-select>
          </template>
        </el-table-column>

        <el-table-column label="操作" width="80" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="danger" icon="el-icon-delete" circle size="mini" @click="removeDetailRow(scope.$index)"></el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>

    <!-- 3. 底部提交按钮 -->
    <div style="margin-top: 20px; text-align: right;padding-bottom: 20px;">
      <el-button @click="cancel">取 消</el-button>
      <el-button type="primary" @click="submitWeekMenu">保存并发布周菜单</el-button>
    </div>
  </div>
</template>

<script>
export default {
  name: "WeekMenuEdit",
  data() {
    return {
      // 周菜单主表单
      weekMenuForm: {
        weekNum: "",
        startDate: "", // 周一
        endDate: "",    // 周日
        details: []
      },
      weekValue: "",       // 周选择器绑定值（当周周一日期）
      weekRangeText: "",   // 页面展示文本：2026-06-08 ~ 2026-06-14
      foodOptions: [],
      loading: false
    };
  },
  created() {
    this.setDefaultWeek();
    this.getFoodList();
    this.getWeekMenuDetail();
  },
  methods: {
    // 设置默认本周，获取今日所在周的周一赋值给weekValue
    setDefaultWeek() {
      const today = new Date();
      // 获取当天星期 0=周日 1=周一 ...6=周六
      const day = today.getDay();
      // 计算本周周一：周日要往前减6天，周一减0，周二减1...周六减5
      const monday = new Date(today);
      const offset = day === 0 ? 6 : day - 1;
      monday.setDate(today.getDate() - offset);

      // 格式化 yyyy-MM-dd
      const formatDate = (date) => {
        const y = date.getFullYear();
        const m = String(date.getMonth() + 1).padStart(2, "0");
        const d = String(date.getDate()).padStart(2, "0");
        return `${y}-${m}-${d}`;
      };
      const mondayStr = formatDate(monday);
      // 赋值给周选择器
      this.weekValue = mondayStr;
      // 主动调用周变化事件，自动生成起止日期
      this.handleWeekChange(mondayStr);
    },
    //获取数据
    getFoodList() {
      var that = this;
      that.loading = true
      that.$http.post("/insCanteenFoodInfo/queryList", {}).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.foodOptions = response.data.data;
        }
      });
    },

    //切换星期，自动计算该行weekDate
    handleWeekNumChange(row) {
      const startStr = this.weekMenuForm.startDate; // 周一日期 yyyy-MM-dd
      const weekNum = row.weekNum; // 1=周一 2=周二 ...7=周日

      if (!startStr || !weekNum) {
        row.weekDate = "";
        return;
      }

      // 解析周一日期
      const monday = new Date(startStr);
      // 偏移天数：周一+0，周二+1 ...周日+6
      const offsetDay = weekNum - 1;
      const targetDate = new Date(monday.getTime() + offsetDay * 24 * 60 * 60 * 1000);

      // 格式化 yyyy-MM-dd
      const formatDate = (date) => {
        const y = date.getFullYear();
        const m = String(date.getMonth() + 1).padStart(2, "0");
        const d = String(date.getDate()).padStart(2, "0");
        return `${y}-${m}-${d}`;
      };

      // 赋值给当前行weekDate，传给后端
      row.weekDate = formatDate(targetDate);
    },

    getWeekMenuDetail() {
      var that = this;
      that.loading = true
      that.$http.post("/insCanteenWeekMenuDetail/queryList", {
        startDate: that.weekMenuForm.startDate,
        endDate: that.weekMenuForm.endDate,
      }).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.weekMenuForm.details = response.data.data;
        }
      });
    },

    // 周选择切换：自动算出本周周一、周日
    handleWeekChange(weekStartDay) {
      if (!weekStartDay) {
        this.weekMenuForm.startDate = "";
        this.weekMenuForm.endDate = "";
        this.weekRangeText = "";
        return;
      }
      const start = new Date(weekStartDay);
      const end = new Date(start);
      end.setDate(start.getDate() + 6); // 周一 +6天 = 周日

      // 格式化 yyyy-MM-dd
      const formatDate = (date) => {
        const y = date.getFullYear();
        const m = String(date.getMonth() + 1).padStart(2, "0");
        const d = String(date.getDate()).padStart(2, "0");
        return `${y}-${m}-${d}`;
      };

      this.weekMenuForm.startDate = formatDate(start);
      this.weekMenuForm.endDate = formatDate(end);
      this.weekRangeText = `${this.weekMenuForm.startDate} ~ ${this.weekMenuForm.endDate}`;

      this.getWeekMenuDetail();
    },

    // 新增明细行
    addDetailRow() {
      this.weekMenuForm.details.push({
        weekNum: "",
        detailType: "",
        foodId: ""
      });
    },

    // 删除明细行
    removeDetailRow(index) {
      this.weekMenuForm.details.splice(index, 1);
    },

    // 提交保存
    submitWeekMenu() {
      if (!this.weekMenuForm.startDate || !this.weekMenuForm.endDate) {
        return this.$message.warning("请选择所属周，自动生成周一至周日区间");
      }
      if (this.weekMenuForm.details.length === 0) {
        return this.$message.warning("请至少添加一条菜品明细");
      }
      // 明细校验
      for (let i = 0; i < this.weekMenuForm.details.length; i++) {
        const row = this.weekMenuForm.details[i];
        if (!row.detailType) return this.$message.warning(`第${i+1}行请选择餐次`);
        if (!row.foodId) return this.$message.warning(`第${i+1}行请选择菜品`);
      }

      var that = this;
      that.$http.post("/insCanteenWeekMenuDetail/saveWeekFoodInfoBatch", this.weekMenuForm.details).then(function (response) {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: "保存成功",
            showClose: true,
          });
          that.getWeekMenuDetail()
        } else {
          that.$notify.info({
            title: "提示",
            message: response.data.message,
            showClose: true,
          });
        }
      }).catch(function (error) {


      })
    },

    // 取消返回
    cancel() {
      this.$router.back();
    },
  }
};
</script>

<style lang="less" scoped>
.dialog-title {
      font-size: 15px;
      display: flex;
      align-items: center;

      .line {
        color: rgb(0, 121, 254);
        font-size: 14px;
        font-weight: 600;
      }
    }
</style>

