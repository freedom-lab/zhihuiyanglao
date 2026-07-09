<template>
  <div style="padding:16px">

    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-around">
        <el-col :span="18">
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col :span="6">
          <el-input placeholder="请输入内容" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable>
            <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
          </el-input>
        </el-col>
      </el-row>
    </div>

    <!-- 表格部分 -->
    <div>
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="老人姓名" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName }}</template>
        </el-table-column>
        <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="年龄" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.age }}</template>
        </el-table-column>
        <el-table-column label="性别" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex | sexFormat }}</template>
        </el-table-column>
        <el-table-column label="联系电话" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel }}</template>
        </el-table-column>
        <el-table-column label="婚姻状况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.marryState }}</template>
        </el-table-column>

        <el-table-column label="档案编号" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.fileCode }}</template>
        </el-table-column>
        <el-table-column label="建档日期" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.fileDate }}</template>
        </el-table-column>
        <el-table-column label="建档人" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.putFileName }}</template>
        </el-table-column>

        <el-table-column label="操作" width="160" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">查看</el-button>
            <!-- <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text">删除</el-button>
            </el-popconfirm> -->
          </template>
        </el-table-column>
      </el-table>
      <!-- 分页 -->
      <div class="block">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <el-dialog :title="(labelType == 'add' ? '新增' : '编辑')" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="10">
          <!-- 
            <el-col :span="12">
              <el-form-item label="：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->

          <el-col :span="12">
            <el-form-item label="老人姓名：" prop="siteName">
              <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="身份证号：" prop="siteName">
              <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="年龄：" prop="siteName">
              <el-input v-model="form.age" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="性别：" prop="siteName">
              <el-input v-model="form.sex" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="联系电话：" prop="siteName">
              <el-input v-model="form.linkTel" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="婚姻状况：" prop="siteName">
              <el-input v-model="form.marryState" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="文化程度：" prop="siteName">
              <el-input v-model="form.degreeEducation" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="残疾情况类型：" prop="siteName">
              <el-input v-model="form.disabilityType" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="主要慢性病IDS：" prop="siteName">
              <el-input v-model="form.majorDiseases" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="主要慢性病名称：" prop="siteName">
              <el-input v-model="form.majorDiseasesName" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="医保类别代码：" prop="siteName">
              <el-input v-model="form.medicalCategory" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="有无子女：" prop="siteName">
              <el-input v-model="form.isChildren" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="工作单位：" prop="siteName">
              <el-input v-model="form.workUnit" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="职业：" prop="siteName">
              <el-input v-model="form.career" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="档案编号：" prop="siteName">
              <el-input v-model="form.fileCode" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="建档日期：" prop="siteName">
              <el-input v-model="form.fileDate" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="建档人：" prop="siteName">
              <el-input v-model="form.putFileName" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="基本情况-身高（厘米）：" prop="siteName">
              <el-input v-model="form.height" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="基本情况-体重（千克）：" prop="siteName">
              <el-input v-model="form.weight" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="基本情况-腰围（厘米）：" prop="siteName">
              <el-input v-model="form.waist" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="个人史-暴露史：" prop="siteName">
              <el-input v-model="form.exposureHistory" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="个人史-饮酒史：" prop="siteName">
              <el-input v-model="form.drinkingHabits" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="个人史-吸烟史：" prop="siteName">
              <el-input v-model="form.smokingHabits" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="个人史-过敏史：" prop="siteName">
              <el-input v-model="form.allergicHistory" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="一般情况-饮食：" prop="siteName">
              <el-input v-model="form.dietaryHabit" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="一般情况-睡眠：" prop="siteName">
              <el-input v-model="form.sleepQuality" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="一般情况-二便：" prop="siteName">
              <el-input v-model="form.relieveBowels" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-手术史-手术名称1：" prop="siteName">
              <el-input v-model="form.operationNameOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-手术史-手术时间1：" prop="siteName">
              <el-input v-model="form.operationTimeOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-手术史-手术名称2：" prop="siteName">
              <el-input v-model="form.operationNameTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-手术史-手术时间2：" prop="siteName">
              <el-input v-model="form.operationTimeTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-外伤史-外伤名称1：" prop="siteName">
              <el-input v-model="form.traumaNameOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-外伤史-外伤时间1：" prop="siteName">
              <el-input v-model="form.traumaTimeOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-外伤史-外伤名称2：" prop="siteName">
              <el-input v-model="form.traumaNameTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-外伤史-外伤名称2：" prop="siteName">
              <el-input v-model="form.traumaTimeTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-输血史-输血原因1：" prop="siteName">
              <el-input v-model="form.bloodNameOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-输血史-输血日期1：" prop="siteName">
              <el-input v-model="form.bloodTimeOne" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-输血史-输血原因2：" prop="siteName">
              <el-input v-model="form.bloodNameTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="病史-输血史-输血日期2：" prop="siteName">
              <el-input v-model="form.bloodTimeTwo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家族史-父亲：" prop="siteName">
              <el-input v-model="form.fatherDiseaseIds" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家族史-母亲：" prop="siteName">
              <el-input v-model="form.motherDiseaseIds" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家族史-子女：" prop="siteName">
              <el-input v-model="form.childrenDiseaseIds" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="家族史-兄弟姐妹：" prop="siteName">
              <el-input v-model="form.brotherDiseaseIds" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="遗传病史：" prop="siteName">
              <el-input v-model="form.geneticDisease" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="健康指导：" prop="siteName">
              <el-input v-model="form.healthGuidance" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="插管种类(数据字典：" prop="siteName">
              <el-input v-model="form.intubationType" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="备注：" prop="siteName">
              <el-input v-model="form.memo" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="行政区划编码：" prop="siteName">
              <el-input v-model="form.areaCode" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="行政区划名称：" prop="siteName">
              <el-input v-model="form.areaName" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="状态：" prop="siteName">
              <el-input v-model="form.status" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="是否已删除：" prop="siteName">
              <el-input v-model="form.isDeleted" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
          <el-col :span="12">
            <el-form-item label="其他疾病名称：" prop="siteName">
              <el-input v-model="form.majorDiseasesOther" placeholder="请输入名称"></el-input>
            </el-form-item>
          </el-col>
  
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>
    <!-- 用户详情抽屉 -->
    <el-drawer
      ref="drawer"
      title="健康档案"
      class="ljd-drawer"
      direction="ttb"
      :visible.sync="drawer"
      size="96%"
      :with-header="false"
      :show-close="true"
    >
      <div class="ljd-drawer-content" style="">
        <div class="drawer-close-btn" @click="closeDrawer">
          <i class="el-icon-close"></i>
        </div>

        <!-- 顶部头部：头像+姓名+切换箭头+标签 -->
        <div class="top-header flex align-items-center" style="justify-content: space-between;">
          <div class="user-avatar" style="width:40px;height:40px;background:#409eff;border-radius:6px;display:flex;align-items:center;justify-content:center;margin-right:10px;">
            <i class="el-icon-user-solid" style="color:#fff;font-size:24px;"></i>
          </div>
          <div class="title-text-class" style="flex: 1;">
            <span class="subtitle" style="font-size:13px;font-weight:400;color: #666;">健康档案</span>
            <span class="username" style="font-size:20px;font-weight:bold;margin-right:10px;">{{form.elderName}}</span>
          </div>
          <!-- <div class="arrow-group flex">
            <el-button icon="el-icon-arrow-left" size="mini" circle></el-button>
            <el-button icon="el-icon-arrow-right" size="mini" circle></el-button>
          </div> -->
          <!-- <el-tag size="small" style="margin-left:20px;background:#e6f7ff;color:#1890ff;border:none;">{{form.nursingLevelName}}</el-tag> -->
          <div class="btn-line">
            <el-button type="primary" icon="el-icon-edit" @click="manualEntry">手工录入</el-button>
          </div>
        </div>

        <!-- 第一行老人基础统计栏 -->
        <div class="info-bar flex">
          <div class="info-item">
            <span style="color:#666;font-size:13px;">年龄</span>
            <div style="font-size:14px;">{{form.age}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">性别</span>
            <div style="font-size:14px;">{{form.sex | sexFormat}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">身份证号</span>
            <div style="font-size:14px;">{{form.idCard}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">身高（CM）</span>
            <div style="font-size:14px;">{{form.checkDate}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">体重（KG）</span>
            <div style="font-size:14px;">{{form.weight}}</div>
          </div>
          <div class="info-item">
            <span style="color:#666;font-size:13px;">腰围（CM）</span>
            <div style="font-size:14px;">{{form.waist}}</div>
          </div>
        </div>

        <!-- 标签页导航 -->
        <el-tabs v-model="activeTab" type="card" tab-position="top" style="" @tab-click="tabClick">
          <el-tab-pane label="健康档案" name="drawerTabInfo1"></el-tab-pane>
          <el-tab-pane label="血压" name="drawerTabInfo2"></el-tab-pane>
          <el-tab-pane label="血糖" name="drawerTabInfo3"></el-tab-pane>
          <el-tab-pane label="血氧" name="drawerTabInfo4"></el-tab-pane>
          <el-tab-pane label="心率" name="drawerTabInfo5"></el-tab-pane>
          <el-tab-pane label="体温" name="drawerTabInfo6"></el-tab-pane>
          <el-tab-pane label="运动" name="drawerTabInfo7"></el-tab-pane>
          <el-tab-pane label="BMI" name="drawerTabInfo8"></el-tab-pane>
          <el-tab-pane label="胆固醇" name="drawerTabInfo9"></el-tab-pane>
          <el-tab-pane label="尿酸" name="drawerTabInfo10"></el-tab-pane>
          <el-tab-pane label="尿常规" name="drawerTabInfo11"></el-tab-pane>
          <el-tab-pane label="评估记录" name="drawerTabInfo12"></el-tab-pane>
        </el-tabs>
        

        <!-- tab面板内容 -->
        <div class="base-panel">
          <component ref="drawerTabInfo" :is="currentComponent" :elderForm="form"></component>
        </div>
        <!-- 底部操作按钮 -->
        <!-- <div class="btn-bottom flex" style="position:sticky;bottom:-20px;background:#fff;padding:16px 0;margin-top:30px;border-top:1px solid #eee;">
          <el-button @click="drawer = false">返回</el-button>
          <el-button size="small" type="primary" @click="handleSave2">保存</el-button>
        </div> -->
      </div>
    </el-drawer>
    <el-dialog title="手工录入健康参数" class="reservation-dialog" append-to-body :visible.sync="showManualDialog" width="60%" top="5vh">
      <div class="dialog-cnt">
        <el-form ref="manualForm" :model="manualForm" :rules="manualRules" label-width="120px">
          <div class="title-gap">
            基本信息录入
          </div>
          <el-row :gutter="20">
            <!-- 第一行 左 -->
            <el-col :span="12">
              <el-form-item label="测量时间" prop="gaugeTime">
                <el-date-picker v-model="manualForm.gaugeTime" type="date" value-format="yyyy-MM-dd HH:mm:ss" placeholder="请选择时间" style="width:100%"></el-date-picker>
              </el-form-item>
            </el-col>
          </el-row>
          <div class="title-gap">
            血压信息采集
          </div>
          <el-row :gutter="20">
            <!-- 第二行 -->
            <el-col :span="12">
              <el-form-item label="高压" prop="systolicPressure">
                <el-input v-model="manualForm.systolicPressure" placeholder="请输入" clearable>
                  <template slot="append">mmHg</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="低压" prop="diastolicPressure">
                <el-input v-model="manualForm.diastolicPressure" placeholder="请输入" clearable>
                  <template slot="append">mmHg</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="脉搏率" prop="pulseRate">
                <el-input v-model="manualForm.pulseRate" placeholder="请输入" clearable>
                  <template slot="append">次/分</template>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>

          <div class="title-gap">
            血糖信息采集
          </div>
          <el-row :gutter="20">
            <el-col :span="12">
              <el-form-item label="测量条件" prop="conditions">
                <el-radio-group v-model="manualForm.conditions">
                  <el-radio :label="0">餐后测量</el-radio>
                  <el-radio :label="1">餐前测量</el-radio>
                  <el-radio :label="2">随机测量</el-radio>
                </el-radio-group>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="血糖" prop="bloodGlucose">
                <el-input v-model="manualForm.bloodGlucose" placeholder="请输入" clearable>
                  <template slot="append">mmol/L</template>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>

          <div class="title-gap">
            血氧信息采集
          </div>
          <el-row :gutter="20">
            <el-col :span="12">
              <el-form-item label="血氧" prop="oxygenSaturation">
                <el-input v-model="manualForm.oxygenSaturation" placeholder="请输入" clearable>
                  <template slot="append">%</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="脉搏" prop="pulseRate">
                <el-input v-model="manualForm.pulseRate" placeholder="请输入" clearable>
                  <template slot="append">次/分</template>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>
          
          <div class="title-gap">
            心率信息采集
          </div>
          <el-row :gutter="20">
            <el-col :span="12">
              <el-form-item label="心率" prop="heartRate">
                <el-input v-model="manualForm.heartRate" placeholder="请输入" clearable>
                  <template slot="append">次/分</template>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>
          
          <div class="title-gap">
            体温信息采集
          </div>
          <el-row :gutter="20">
            <el-col :span="12">
              <el-form-item label="体温" prop="bodyTemperature">
                <el-input v-model="manualForm.bodyTemperature" placeholder="请输入" clearable>
                  <template slot="append">℃</template>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>
          
          <div class="title-gap">
            BMI信息采集
          </div>
          <el-row :gutter="20">
            <el-col :span="12">
              <el-form-item label="身高" prop="height">
                <el-input v-model="manualForm.height" placeholder="请输入" clearable>
                  <template slot="append">厘米</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体重" prop="weight">
                <el-input v-model="manualForm.weight" placeholder="请输入" clearable>
                  <template slot="append">千克</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="腰围" prop="waist">
                <el-input v-model="manualForm.waist" placeholder="请输入" clearable>
                  <template slot="append">厘米</template>
                </el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体质指数" prop="bmi">
                <el-input v-model="manualForm.bmi" placeholder="请输入" clearable>
                </el-input>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
      </div>
      
      <div slot="footer" class="dialog-footer">
        <el-button size="small" type="primary" icon="el-icon-circle-plus-outline" @click="handleSave2">保存</el-button>
        <el-button size="small" icon="el-icon-circle-close" @click="showManualDialog = false">取消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
// 健康档案
import drawerTabInfo1 from './components/drawerTabInfo1.vue';
// 血压
import drawerTabInfo2 from './components/drawerTabInfo2.vue';
// 血糖
import drawerTabInfo3 from './components/drawerTabInfo3.vue';
// 血氧
import drawerTabInfo4 from './components/drawerTabInfo4.vue';
// 心率
import drawerTabInfo5 from './components/drawerTabInfo5.vue';
// 体温
import drawerTabInfo6 from './components/drawerTabInfo6.vue';
// 运动
import drawerTabInfo7 from './components/drawerTabInfo7.vue';
// BMI
import drawerTabInfo8 from './components/drawerTabInfo8.vue';
// 胆固醇
import drawerTabInfo9 from './components/drawerTabInfo9.vue';
// 尿酸
import drawerTabInfo10 from './components/drawerTabInfo10.vue';
// 尿常规
import drawerTabInfo11 from './components/drawerTabInfo11.vue';
// 评估记录
import drawerTabInfo12 from './components/drawerTabInfo12.vue';
export default {
  components: {
      drawerTabInfo1,
      drawerTabInfo2,
      drawerTabInfo3,
      drawerTabInfo4,
      drawerTabInfo5,
      drawerTabInfo6,
      drawerTabInfo7,
      drawerTabInfo8,
      drawerTabInfo9,
      drawerTabInfo10,
      drawerTabInfo11,
      drawerTabInfo12,
  },
  data() {
    return {
      currentComponent: null,
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {}
      },
      form: {},
      showDialog: false,
      drawer: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,
      activeTab: 'drawerTabInfo1',
      manualForm: {},
      manualRules: {},
      showManualDialog: false,
    };
  },
  filters: {
    sexFormat(val){
      switch (val) {
        case 1:
        case '1':
          return '男';
        case 2:
        case '2':
          return '女';
      
        default:
          return val || '-';
      }
    },
  },

  created() {
    this.getList()
  },

  mounted() {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/healthBaseInfo/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },

    // 保存
    handleSave() {
      var that = this;
      that.$http.post("/healthBaseInfo/save", that.form).then(function (response) {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: "保存成功",
            showClose: true,
          });
          that.showDialog = false
          that.getList()
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

    //修改
    // edit(row) {
    //   this.showDialog = true;
    //   this.labelType = 'edit'
    //   this.form = JSON.parse(JSON.stringify(row))
    // },
    //修改
    async edit(row) {
      this.drawer = true;
      this.labelType = 'edit'
      this.activeTab = 'drawerTabInfo1'
      this.form = JSON.parse(JSON.stringify(row))
      this.currentComponent = 'drawerTabInfo1'
      // await this.getElderCheckInfo()
      // await this.getElderBaseInfo()
      // this.$nextTick(()=>{
      //   this.$refs.drawerTabInfo.initDefaultData()
      // })
    },
    tabClick(e){
      console.log('tab页：',e,this.activeTab)
      this.currentComponent = this.activeTab
      this.$nextTick(()=>{
        this.$refs.drawerTabInfo.initDefaultData()
      })
    },
    closeDrawer(){
      this.$refs.drawer.closeDrawer();
    },
    manualEntry(){
      this.showManualDialog = true
    },
    
    // s手工录入保存
    handleSave2() {
      var that = this;
      return
      that.$http.post("/healthBaseInfo/save", that.form).then(function (response) {
        if (response.data.code == 200) {
          that.$notify.success({
            title: "提示",
            message: "保存成功",
            showClose: true,
          });
          that.showDialog = false
          that.getList()
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

    // 删除当前行
    //    handleDelte (id) {
    //      del({ id: id }).then(res => {
    //        if (res.code == 200) {
    //         this.$message.success('删除成功')
    //         this.getList()
    //       }
    //      })
    //    },

    // 删除用户
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除吗?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch((err) => err);
      if (confirmResult === "confirm") {
        var that = this;
        that.$http.post("/healthBaseInfo/delete", { "id": id }).then(function (response) {
          if (response.data.code == 200) {
            that.$notify.success({
              title: "提示",
              message: "删除成功",
              showClose: true,
            });
            that.getList();
          } else {
            that.$notify.info({
              title: "提示",
              message: response.data.message,
              showClose: true,
            });
          }

        });
      }
    },

    //新增按钮
    newBtn() {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>

<style lang="scss" scoped>
.ljd-drawer-content{
  .drawer-close-btn{
    position: absolute;
    top: 0px;
    right: 6px;
    cursor: pointer;
    padding: 10px;
    font-size: 20px;
  }
  ::v-deep .el-tabs__header{
    margin-bottom: 0;
  }
}
</style>
