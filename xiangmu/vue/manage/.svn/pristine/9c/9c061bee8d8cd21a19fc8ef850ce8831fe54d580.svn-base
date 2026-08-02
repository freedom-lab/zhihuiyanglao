<template>
  <div class="health-monitor-container">
    <!-- 顶部标签导航 el-menu 横向 -->
    <div class="top-bar">
      <div class="top-menu-scroll-wrap">
        <div v-for="(item, index) in menuList" class="top-menu-box" @click="topBarMenuChange(item, index)">
          <div class="top-menu-item" :class="currTopMenuIndex == index ? 'active' : 'normal'">
            {{ item.label }}
          </div>
        </div>
      </div>
    </div>

    <div class="card-wrap">
      <!-- 最近需关注的老人 红色边框卡片 -->
      <div class="warn-card" shadow="hover">
        <div class="card-header">
          <div class="title">
            <div class="title-line"></div>
            <span>
              最近需关注的老人
              <span style="color: red;">（{{ warnElderList.length }}位）</span>
            </span>
          </div>
          <el-button text class="moreBtn" @click="goAllWarn">查看全部 >></el-button>
        </div>

        <div class="card-list">
          <div v-for="item in warnElderList" :key="item.id" class="elder-item">
            <div class="elder-top">
              <div class="avatar-name">
                <img class="avatar-img" src="../../../assets/images/older_header_logo.png" alt="">
                <div class="name-info">
                  <div>{{ item.elderName }}</div>
                  <div class="gender-age">{{ item.sex == 1 ? '男' : '女' }} {{ item.age }}岁</div>
                </div>
              </div>

              <div class="danger-tag">
                <img class="danger-img" src="../../../assets/images/elder_ai_status1.png" alt="">
                <span>DANGER!</span>
              </div>
            </div>

            <!-- 指标数值 -->
            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血压'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'systolicPressure') ? 'green' : 'red'">
                <div class="num">{{ item.systolicPressure ? Number(item.systolicPressure).toFixed(2) : '-' }}</div>
                <div class="label">高压(mmHg)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'diastolicPressure') ? 'green' : 'red'">
                <div class="num">{{ item.diastolicPressure ? Number(item.diastolicPressure).toFixed(2) : '-' }}</div>
                <div class="label">低压(mmHg)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'pulseRate') ? 'green' : 'red'">
                <div class="num">{{ item.pulseRate ? Number(item.pulseRate).toFixed(2) : '-' }}</div>
                <div class="label">脉搏(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血糖'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bloodGlucose') ? 'green' : 'red'">
                <div class="num">{{ item.bloodGlucose ? Number(item.bloodGlucose).toFixed(2) : '-' }}</div>
                <div class="label">血糖(mmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血氧'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'oxygenSaturation') ? 'green' : 'red'">
                <div class="num">{{ item.oxygenSaturation ? Number(item.oxygenSaturation).toFixed(2) : '-' }}</div>
                <div class="label">血氧饱和度(%)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bodyTemperature') ? 'green' : 'red'">
                <div class="num">{{ item.bodyTemperature ? Number(item.bodyTemperature).toFixed(2) : '-' }}</div>
                <div class="label">体温(℃)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'pulseRate') ? 'green' : 'red'">
                <div class="num">{{ item.pulseRate ? Number(item.pulseRate).toFixed(2) : '-' }}</div>
                <div class="label">脉搏(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '心率'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'heartRate') ? 'green' : 'red'">
                <div class="num">{{ item.heartRate ? Number(item.heartRate).toFixed(2) : '-' }}</div>
                <div class="label">心率(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '体温'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bodyTemperature') ? 'green' : 'red'">
                <div class="num">{{ item.bodyTemperature ? Number(item.bodyTemperature).toFixed(2) : '-' }}</div>
                <div class="label">体温(℃)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == 'BMI'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bmi') ? 'green' : 'red'">
                <div class="num">{{ item.bmi ? Number(item.bmi).toFixed(2) : '-' }}</div>
                <div class="label">体质指数(kg/m²)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '胆固醇'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'chol') ? 'green' : 'red'">
                <div class="num">{{ item.chol ? Number(item.chol).toFixed(2) : '-' }}</div>
                <div class="label">胆固醇(mmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '尿酸'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'uricAcid') ? 'green' : 'red'">
                <div class="num">{{ item.uricAcid ? Number(item.uricAcid).toFixed(2) : '-' }}</div>
                <div class="label">尿酸(μmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '尿常规'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'ph') ? 'green' : 'red'">
                <div class="num">{{ item.ph ? Number(item.ph).toFixed(2) : '-' }}</div>
                <div class="label">酸碱度(pH)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'sg') ? 'green' : 'red'">
                <div class="num">{{ item.sg ? Number(item.sg).toFixed(2) : '-' }}</div>
                <div class="label">尿比重(SG)</div>
              </div>
            </div>

            <!-- 功能按钮 -->
            <div class="btn-row">
              <span size="small">趋势图</span>
              <span size="small">参考值</span>
              <span size="small">AI解读</span>
            </div>
          </div>

          <div class="emptyBox" v-if="warnElderList.length == 0">
            <!-- 加载中显示旋转loading，否则显示空图片 -->
            <div v-if="isLoading" class="loading-spin"></div>
            <img v-else class="empty-img" src="../../../assets/images/no_msg.png" alt="">
            <span>{{ isLoading ? "加载中" : "暂无人员" }}</span>
          </div>
        </div>

        <div class="card-bottom-bar">
          <!-- 服务步骤 -->
          <div class="step-row">
            <div v-for="(step, idx) in warnStepList" :key="idx" class="step-item">
              <span class="step-num">{{ idx + 1 }}</span>
              <span class="step-text">{{ step }}</span>
            </div>
          </div>
        </div>
      </div>

      <!-- 需长期观察的老人 绿色边框卡片 -->
      <div class="observe-card" shadow="hover">
        <div class="card-header">
          <div class="title">
            <div class="title-line"></div>
            <span>
              需长期观察的老人
              <span style="color: green;">（{{ observeElderList.length }}位）</span>
            </span>
          </div>
          <el-button text class="moreBtn" @click="goAllObserve">查看全部 >></el-button>
        </div>

        <div class="card-list">
          <div v-for="item in observeElderList" :key="item.id" class="elder-item">
            <div class="elder-top">
              <div class="avatar-name">
                <img class="avatar-img" src="../../../assets/images/older_header_logo.png" alt="">
                <div class="name-info">
                  <div>{{ item.elderName }}</div>
                  <div class="gender-age">{{ item.sex == 1 ? '男' : '女' }} {{ item.age }}岁</div>
                </div>
              </div>

              <img class="healthy-img" src="../../../assets/images/elder_ai_status2.png" alt="">
            </div>

            <!-- 指标数值 -->
            <!-- 指标数值 -->
            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血压'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'systolicPressure') ? 'green' : 'red'">
                <div class="num">{{ item.systolicPressure ? Number(item.systolicPressure).toFixed(2) : '-' }}</div>
                <div class="label">高压(mmHg)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'diastolicPressure') ? 'green' : 'red'">
                <div class="num">{{ item.diastolicPressure ? Number(item.diastolicPressure).toFixed(2) : '-' }}</div>
                <div class="label">低压(mmHg)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'pulseRate') ? 'green' : 'red'">
                <div class="num">{{ item.pulseRate ? Number(item.pulseRate).toFixed(2) : '-' }}</div>
                <div class="label">脉搏(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血糖'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bloodGlucose') ? 'green' : 'red'">
                <div class="num">{{ item.bloodGlucose ? Number(item.bloodGlucose).toFixed(2) : '-' }}</div>
                <div class="label">血糖(mmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '血氧'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'oxygenSaturation') ? 'green' : 'red'">
                <div class="num">{{ item.oxygenSaturation ? Number(item.oxygenSaturation).toFixed(2) : '-' }}</div>
                <div class="label">血氧饱和度(%)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bodyTemperature') ? 'green' : 'red'">
                <div class="num">{{ item.bodyTemperature ? Number(item.bodyTemperature).toFixed(2) : '-' }}</div>
                <div class="label">体温(℃)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'pulseRate') ? 'green' : 'red'">
                <div class="num">{{ item.pulseRate ? Number(item.pulseRate).toFixed(2) : '-' }}</div>
                <div class="label">脉搏(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '心率'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'heartRate') ? 'green' : 'red'">
                <div class="num">{{ item.heartRate ? Number(item.heartRate).toFixed(2) : '-' }}</div>
                <div class="label">心率(bpm)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '体温'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bodyTemperature') ? 'green' : 'red'">
                <div class="num">{{ item.bodyTemperature ? Number(item.bodyTemperature).toFixed(2) : '-' }}</div>
                <div class="label">体温(℃)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == 'BMI'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'bmi') ? 'green' : 'red'">
                <div class="num">{{ item.bmi ? Number(item.bmi).toFixed(2) : '-' }}</div>
                <div class="label">体质指数(kg/m²)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '胆固醇'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'chol') ? 'green' : 'red'">
                <div class="num">{{ item.chol ? Number(item.chol).toFixed(2) : '-' }}</div>
                <div class="label">胆固醇(mmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '尿酸'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'uricAcid') ? 'green' : 'red'">
                <div class="num">{{ item.uricAcid ? Number(item.uricAcid).toFixed(2) : '-' }}</div>
                <div class="label">尿酸(μmol/L)</div>
              </div>
            </div>

            <div class="value-row" v-if="menuList[currTopMenuIndex].label == '尿常规'">
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'ph') ? 'green' : 'red'">
                <div class="num">{{ item.ph ? Number(item.ph).toFixed(2) : '-' }}</div>
                <div class="label">酸碱度(pH)</div>
              </div>
              <div class="val-item" :class="checkValueState(item.abnormalFields, 'sg') ? 'green' : 'red'">
                <div class="num">{{ item.sg ? Number(item.sg).toFixed(2) : '-' }}</div>
                <div class="label">尿比重(SG)</div>
              </div>
            </div>

            <div class="btn-row">
              <span size="small">趋势图</span>
              <span size="small">参考值</span>
              <span size="small">AI解读</span>
            </div>
          </div>
          
          <div class="emptyBox" v-if="observeElderList.length == 0">
            <!-- 加载中显示旋转loading，否则显示空图片 -->
            <div v-if="isLoading" class="loading-spin"></div>
            <img v-else class="empty-img" src="../../../assets/images/no_msg.png" alt="">
            <span>{{ isLoading ? "加载中" : "暂无人员" }}</span>
          </div>
        </div>

        <div class="card-bottom-bar">
          <div class="step-row">
            <div v-for="(step, idx) in observeStepList" :key="idx" class="step-item">
              <span class="step-num">{{ idx + 1 }}</span>
              <span class="step-text">{{ step }}</span>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HealthMonitor',
  data() {
    return {
      currTopMenuIndex: 0,
      menuList: [
        {
          "monitorType": "1",
          "label": "血压",
          "url": '/healthBloodPressure/queryList',
        },
        {
          "monitorType": "2",
          "label": "血糖",
          "url": '/healthBloodSugar/queryList',
        },
        {
          "monitorType": "3",
          "label": "血氧",
          "url": '/healthBloodOxygen/queryList',
        },
        {
          "monitorType": "4",
          "label": "心率",
          "url": '/healthEcgRecords/queryList',
        },
        {
          "monitorType": "5",
          "label": "体温",
          "url": '/healthTemperatureRecords/queryList',
        },
        {
          "monitorType": "6",
          "label": "BMI",
          "url": '/healthBasicsRecords/queryList',
        },
        {
          "monitorType": "7",
          "label": "胆固醇",
          "url": '/healthBloodFat/queryList',
        },
        {
          "monitorType": "8",
          "label": "尿酸",
          "url": '/healthUricacidRecords/queryList',
        },
        {
          "monitorType": "9",
          "label": "尿常规",
          "url": '/healthUrinalysisRecords/queryList',
        }
      ],
      isLoading: false,

      // 需关注老人数据
      warnElderList: [],
      // 长期观察老人
      observeElderList: [],
      // 高危服务步骤
      warnStepList: [
        '与老人沟通身体情况',
        '测量体温、血压、呼吸、心率',
        '提供理疗等健康改善服务',
        '陪诊去医院检查'
      ],
      // 长期观察服务步骤
      observeStepList: [
        '日常生活协助',
        '慢病跟踪',
        '心理疏导',
        '健康、理疗等服务'
      ]
    }
  },
  created() {
    this.getHealthList();
  },
  methods: {
    //判定数据异常正常
    checkValueState(list, key) {
      // 数组包含key → 异常，返回false；不包含 → 正常，返回true
      console.log(key, JSON.stringify(list), ':', !list.includes(key));
      return !list.includes(key);
    },

    // 切换顶部tab
    topBarMenuChange(item, index) {
      this.currTopMenuIndex = index
      // 此处可调用接口刷新对应指标数据
      console.log('切换指标', index)
      this.getHealthList();
    },
    goAllWarn() {
      // 跳转到全部高危老人页面
    },
    goAllObserve() {
      // 跳转到全部长期观察老人页面
    },

    //获取数据
    getHealthList() {
      this.isLoading = true;
      this.warnElderList = [];
      this.observeElderList = [];

      var that = this;
      let menuItem = this.menuList[this.currTopMenuIndex];
      that.loading = true
      that.$http.post("/healthBloodPressure/monitorElderList", {
        monitorType: menuItem.monitorType
      }).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.warnElderList = response.data.data.abnormalList;
          that.observeElderList = response.data.data.normalList;
          that.isLoading = false;
        }
      });
    },
  }
}
</script>

<style lang="less" scoped>
.health-monitor-container {
  margin: 1px 0 0 1px;
  background-color: #fff;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.top-bar {
  display: flex;
  flex-direction: row;
  gap: 10px;
  background-color: white;
  padding: 0 10px;
  box-sizing: border-box;
  margin-top: 10px;
  margin-bottom: 10px;

  .top-menu-scroll-wrap {
    display: flex;
    /* 子元素横排 */
    overflow-x: auto;
    /* 水平溢出滚动 */
    overflow-y: hidden;
    /* 禁止纵向滚动 */
    white-space: nowrap;

    .top-menu-box {
      flex-shrink: 0;
      /* 关键：不让元素被压缩 */
      display: flex;
      align-items: center;
      cursor: pointer;

      .top-menu-icon {
        width: 16px;
        height: 16px;
      }

      .top-menu-item {
        display: flex;
        font-size: 14px;
        font-weight: 500;
        padding: 4px 15px;
      }

      .active {
        color: rgba(64, 158, 255, .8);
        border: 1px solid rgba(64, 158, 255, .8);
      }

      .normal {
        color: #333;
        border: 1px solid #ccc;
      }
    }

    /* hover 背景色 */
    .top-menu-box:hover {
      background-color: #dbecff;
      /* 悬浮背景色，可自定义 */
      border-radius: 5px;
    }
  }
}

.card-wrap {
  padding: 0 10px 10px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  height: calc(100vh - 170px);
  overflow-y: auto;

  .warn-card {
    border: 2px solid #f56c6c;
    border-radius: 10px;
    padding: 5px 10px 10px 10px;
    background-color: white;
  }

  .observe-card {
    border: 2px solid #67c23a;
    border-radius: 10px;
    padding: 10px;
    background-color: white;
  }

  .card-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 10px;

    .moreBtn {
      border: none;
      font-size: 15px;
      color: #000;
    }

    .title {
      display: flex;
      align-items: center;
      font-size: 14px;
      font-weight: 500;
      color: #000;
      gap: 10px;

      .title-line {
        background-color: rgba(64, 158, 255, .8);
        width: 5px;
        height: 18px;
        border-radius: 2px;
      }
    }
  }

  .card-list {
    display: flex;
    flex-direction: row;
    min-height: 150px;
    gap: 10px;
    margin-top: -5px;

    .elder-item {
      display: flex;
      flex-direction: column;
      padding: 10px;
      border-radius: 10px;
      box-shadow: 3px 2px 10px rgba(0, 0, 0, 0.15);
      width: 260px;

      .elder-top {
        display: flex;
        justify-content: space-between;
        position: relative;

        .avatar-name {
          display: flex;
          align-items: center;
          gap: 10px;
          font-size: 13px;
          color: #333;

          .avatar-img {
            width: 36px;
            height: 36px;
            border-radius: 50%;
          }
        }

        .danger-tag {
          position: absolute;
          display: flex;
          flex-direction: column;
          color: #f56c6c;
          display: flex;
          align-items: center;
          font-size: 10px;
          right: 0;
          top: 0;

          .danger-img {
            width: 32px;
            height: 32px;
          }
        }

        .healthy-img {
          width: 40px;
          height: 40px;
        }

        .name-info>div:first-child {
          font-weight: 500;
          font-size: 15px;
        }

        .gender-age {
          color: #999;
          font-size: 12px;
        }
      }

      .value-row {
        display: flex;
        justify-content: center;
        gap: 32px;
        margin-top: 10px;

        .val-item {
          text-align: center;

          .num {
            font-size: 18px;
            font-weight: bold;
          }

          .label {
            font-size: 10px;
            color: #666;
          }
        }

        .red {
          color: #f56c6c;
        }

        .green {
          color: #67c23a;
        }
      }

      .btn-row {
        display: flex;
        background-color: #e5f6ff;
        padding: 0 30px;
        height: 28px;
        align-items: center;
        gap: 20px;
        margin-top: 10px;
        justify-content: space-between;
        border-radius: 14px;
        font-size: 12px;
      }
    }

    .emptyBox {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      padding: 10px 0 20px;
      width: 100%;
      gap: 12px;

      .empty-img {
        width: 80px;
        opacity: 0.7;
      }
      span {
        color: #999;
        font-size: 12px;
      }
      // 旋转加载动画
      .loading-spin {
        width: 40px;
        height: 40px;
        border: 4px solid #e4e7ed;
        border-top-color: #409EFF;
        border-radius: 50%;
        animation: spin 1s linear infinite;
      }
    }

    @keyframes spin {
      to {
        transform: rotate(360deg);
      }
    }
  }

  .card-bottom-bar {
    display: flex;
    margin-top: 10px;


    .step-row {
      display: flex;
      align-items: center;
      gap: 20px;
      width: 100%;
      overflow-x: auto;
    }

    .step-item {
      display: flex;
      align-items: center;
      white-space: nowrap;
      font-size: 12px;
      color: #555;
    }

    .step-num {
      display: inline-flex;
      width: 16px;
      height: 16px;
      border-radius: 50%;
      background: #333;
      color: #fff;
      justify-content: center;
      align-items: center;
      font-size: 11px;
      margin-right: 4px;
    }
  }

}
</style>