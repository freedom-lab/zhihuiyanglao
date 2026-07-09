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
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%" :height="height">
        <el-table-column label="序号" type="index" width="50" align="center"></el-table-column>

           
          <el-table-column label="姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderName }}</template>
          </el-table-column>
          <el-table-column label="身份证号" align="center" width="150" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
          <el-table-column label="年龄" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.age }}</template>
          </el-table-column>
          <el-table-column label="测量时间" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.gaugeTime }}</template>
          </el-table-column>
          <el-table-column label="测量设备" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.gaugeType }}</template>
          </el-table-column>
          <el-table-column label="FVC数据" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVCData }}</template>
          </el-table-column>
          <el-table-column label="VC数据" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.vCData }}</template>
          </el-table-column>
          <el-table-column label="MVV数据" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVVData }}</template>
          </el-table-column>
          <el-table-column label="诊断结果" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.result }}</template>
          </el-table-column>
          <el-table-column label="FVC（实测值）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVCReal }}</template>
          </el-table-column>
          <el-table-column label="FVC（预计值）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVCPlan }}</template>
          </el-table-column>
          <el-table-column label="FVC（百分比）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVCPercent }}</template>
          </el-table-column>
          <el-table-column label="FVC-1（实测值）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVC1Real }}</template>
          </el-table-column>
          <el-table-column label="FVC-1（预计值）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVC1Plan }}</template>
          </el-table-column>
          <el-table-column label="FVC-1（百分比）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVC1Percent }}</template>
          </el-table-column>
          <el-table-column label="FVC-2（实测值）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVC2Real }}</template>
          </el-table-column>
          <el-table-column label="FVC-3(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fVC3Real }}</template>
          </el-table-column>
          <el-table-column label="FEV-1%(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fEV1Real }}</template>
          </el-table-column>
          <el-table-column label="FEV-1%(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fEV1Plan }}</template>
          </el-table-column>
          <el-table-column label="FEV-1%(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fEV1Percent }}</template>
          </el-table-column>
          <el-table-column label="FEV-2%(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fEV2Real }}</template>
          </el-table-column>
          <el-table-column label="FEV-3%(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fEV3Real }}</template>
          </el-table-column>
          <el-table-column label="MMF(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mMFReal }}</template>
          </el-table-column>
          <el-table-column label="MMF(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mMFPlan }}</template>
          </el-table-column>
          <el-table-column label="MMF(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mMFPercent }}</template>
          </el-table-column>
          <el-table-column label="MVV1(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1Real }}</template>
          </el-table-column>
          <el-table-column label="MVV1(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1Plan }}</template>
          </el-table-column>
          <el-table-column label="MVV1(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1Percent }}</template>
          </el-table-column>
          <el-table-column label="BSA1(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bSA1Real }}</template>
          </el-table-column>
          <el-table-column label="MVV1/BSA(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1BSAReal }}</template>
          </el-table-column>
          <el-table-column label="MVV1/BSA(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1BSAPlan }}</template>
          </el-table-column>
          <el-table-column label="MVV1/BSA(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVV1BSAPercent }}</template>
          </el-table-column>
          <el-table-column label="PEF(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pEFReal }}</template>
          </el-table-column>
          <el-table-column label="PEF(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pEFPlan }}</template>
          </el-table-column>
          <el-table-column label="PEF(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.pEFPercent }}</template>
          </el-table-column>
          <el-table-column label="V75(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v75Real }}</template>
          </el-table-column>
          <el-table-column label="V75(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v75Plan }}</template>
          </el-table-column>
          <el-table-column label="V75(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v75Percent }}</template>
          </el-table-column>
          <el-table-column label="V50(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50Real }}</template>
          </el-table-column>
          <el-table-column label="V50(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50Plan }}</template>
          </el-table-column>
          <el-table-column label="V50(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50Percent }}</template>
          </el-table-column>
          <el-table-column label="V25(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25Real }}</template>
          </el-table-column>
          <el-table-column label="V25(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25Plan }}</template>
          </el-table-column>
          <el-table-column label="V25(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25Percent }}</template>
          </el-table-column>
          <el-table-column label="V50/V25(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50V25Real }}</template>
          </el-table-column>
          <el-table-column label="V50/V25(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50V25Plan }}</template>
          </el-table-column>
          <el-table-column label="V50/V25(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v50V25Percent }}</template>
          </el-table-column>
          <el-table-column label="V25/H(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25HReal }}</template>
          </el-table-column>
          <el-table-column label="V25/H(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25HPlan }}</template>
          </el-table-column>
          <el-table-column label="V25/H(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.v25HPercent }}</template>
          </el-table-column>
          <el-table-column label="VC(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.vCReal }}</template>
          </el-table-column>
          <el-table-column label="VC(预计值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.vCPlan }}</template>
          </el-table-column>
          <el-table-column label="VC(百分比)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.vCPercent }}</template>
          </el-table-column>
          <el-table-column label="TV(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.tVReal }}</template>
          </el-table-column>
          <el-table-column label="IRV(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.iRVReal }}</template>
          </el-table-column>
          <el-table-column label="ERV(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.eRVReal }}</template>
          </el-table-column>
          <el-table-column label="IC(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.iCReal }}</template>
          </el-table-column>
          <el-table-column label="MV(实测值)" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.mVReal }}</template>
          </el-table-column>
          <el-table-column label="参考意见" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.opinion }}</template>
          </el-table-column>
          <el-table-column label="预警标记" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.warnFlag }}</template>
          </el-table-column>
        
        <el-table-column label="操作" width="260" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text">删除</el-button>
            </el-popconfirm>
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

    <el-dialog :title="(labelType=='add'?'新增':'编辑')" :visible.sync="showDialog" width="800px">
      <el-form ref="form" :model="form" :rules="rules" label-width="120px">
        <el-row :gutter="10">

            <!-- <el-col :span="12">
              <el-form-item label="：" prop="siteName">
                <el-input v-model="form.id" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col> -->
           
            <el-col :span="12">
              <el-form-item label="姓名：" prop="siteName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号：" prop="siteName">
                <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="性别：" prop="siteName">
                <el-input v-model="form.sex" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="年龄：" prop="siteName">
                <el-input v-model="form.age" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="测量时间：" prop="siteName">
                <el-input v-model="form.gaugeTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="测量设备：" prop="siteName">
                <el-input v-model="form.gaugeType" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC数据：" prop="siteName">
                <el-input v-model="form.fVCData" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="VC数据：" prop="siteName">
                <el-input v-model="form.vCData" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV数据：" prop="siteName">
                <el-input v-model="form.mVVData" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="诊断结果：" prop="siteName">
                <el-input v-model="form.result" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC（实测值）：" prop="siteName">
                <el-input v-model="form.fVCReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC（预计值）：" prop="siteName">
                <el-input v-model="form.fVCPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC（百分比）：" prop="siteName">
                <el-input v-model="form.fVCPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC-1（实测值）：" prop="siteName">
                <el-input v-model="form.fVC1Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC-1（预计值）：" prop="siteName">
                <el-input v-model="form.fVC1Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC-1（百分比）：" prop="siteName">
                <el-input v-model="form.fVC1Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC-2（实测值）：" prop="siteName">
                <el-input v-model="form.fVC2Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FVC-3(实测值)：" prop="siteName">
                <el-input v-model="form.fVC3Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FEV-1%(实测值)：" prop="siteName">
                <el-input v-model="form.fEV1Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FEV-1%(预计值)：" prop="siteName">
                <el-input v-model="form.fEV1Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FEV-1%(百分比)：" prop="siteName">
                <el-input v-model="form.fEV1Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FEV-2%(实测值)：" prop="siteName">
                <el-input v-model="form.fEV2Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="FEV-3%(实测值)：" prop="siteName">
                <el-input v-model="form.fEV3Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MMF(实测值)：" prop="siteName">
                <el-input v-model="form.mMFReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MMF(预计值)：" prop="siteName">
                <el-input v-model="form.mMFPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MMF(百分比)：" prop="siteName">
                <el-input v-model="form.mMFPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1(实测值)：" prop="siteName">
                <el-input v-model="form.mVV1Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1(预计值)：" prop="siteName">
                <el-input v-model="form.mVV1Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1(百分比)：" prop="siteName">
                <el-input v-model="form.mVV1Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="BSA1(实测值)：" prop="siteName">
                <el-input v-model="form.bSA1Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1/BSA(实测值)：" prop="siteName">
                <el-input v-model="form.mVV1BSAReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1/BSA(预计值)：" prop="siteName">
                <el-input v-model="form.mVV1BSAPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MVV1/BSA(百分比)：" prop="siteName">
                <el-input v-model="form.mVV1BSAPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="PEF(实测值)：" prop="siteName">
                <el-input v-model="form.pEFReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="PEF(预计值)：" prop="siteName">
                <el-input v-model="form.pEFPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="PEF(百分比)：" prop="siteName">
                <el-input v-model="form.pEFPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V75(实测值)：" prop="siteName">
                <el-input v-model="form.v75Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V75(预计值)：" prop="siteName">
                <el-input v-model="form.v75Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V75(百分比)：" prop="siteName">
                <el-input v-model="form.v75Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50(实测值)：" prop="siteName">
                <el-input v-model="form.v50Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50(预计值)：" prop="siteName">
                <el-input v-model="form.v50Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50(百分比)：" prop="siteName">
                <el-input v-model="form.v50Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25(实测值)：" prop="siteName">
                <el-input v-model="form.v25Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25(预计值)：" prop="siteName">
                <el-input v-model="form.v25Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25(百分比)：" prop="siteName">
                <el-input v-model="form.v25Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50/V25(实测值)：" prop="siteName">
                <el-input v-model="form.v50V25Real" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50/V25(预计值)：" prop="siteName">
                <el-input v-model="form.v50V25Plan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V50/V25(百分比)：" prop="siteName">
                <el-input v-model="form.v50V25Percent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25/H(实测值)：" prop="siteName">
                <el-input v-model="form.v25HReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25/H(预计值)：" prop="siteName">
                <el-input v-model="form.v25HPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="V25/H(百分比)：" prop="siteName">
                <el-input v-model="form.v25HPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="VC(实测值)：" prop="siteName">
                <el-input v-model="form.vCReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="VC(预计值)：" prop="siteName">
                <el-input v-model="form.vCPlan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="VC(百分比)：" prop="siteName">
                <el-input v-model="form.vCPercent" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="TV(实测值)：" prop="siteName">
                <el-input v-model="form.tVReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="IRV(实测值)：" prop="siteName">
                <el-input v-model="form.iRVReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="ERV(实测值)：" prop="siteName">
                <el-input v-model="form.eRVReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="IC(实测值)：" prop="siteName">
                <el-input v-model="form.iCReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="MV(实测值)：" prop="siteName">
                <el-input v-model="form.mVReal" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="参考意见：" prop="siteName">
                <el-input v-model="form.opinion" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="预警标记：" prop="siteName">
                <el-input v-model="form.warnFlag" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
           
        </el-row>
      </el-form>
      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data () {
    return {
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
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading:false
    };
  },

  created () {
    this.getList()
  },

  mounted () {
    this.$nextTick(() => {
      // 获取定义ref属性 和 元素高度
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight())
    })
  },

  methods: {
    // 监听表格高度
    getHeight () {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList () {
	  var that = this;
    that.loading = true
	  that.$http.post("/healthLungFunction/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.loading = false
          that.total = response.data.data.count;
          that.queryInfo.currPage=response.data.data.currPage
          that.tableData = response.data.data.data;
        }
      });
    },

    // 保存
    handleSave () {
	    var that = this;
	  that.$http.post("/healthLungFunction/save", that.form).then(function (response) {
		  if (response.data.code == 200) {
			  that.$notify.success({
				title: "提示",
				message: "保存成功",
				showClose: true,
			  });
			 that.showDialog = false
			  that.getList()
		  }else{
			  that.$notify.info({
				title: "提示",
				message: response.data.message,
				showClose: true,
			  });
		  }
      }).catch(function(error){


      })
	  
	  
    },

    //修改
    edit (row) {
      this.showDialog = true;
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
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
        that.$http.post("/healthLungFunction/delete" ,{"id":id}).then(function (response) {
			if(response.data.code == 200){
			 that.$notify.success({
				title: "提示",
				message: "删除成功",
				showClose: true,
			  });
			  that.getList();
			}else{
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
    newBtn () {
      this.labelType = 'add'
      this.showDialog = true;
      this.form = {}
    },

    // 修改页数大小
    handleSizeChange (val) {
      this.queryInfo.pageSize = val;
      this.getList()
    },

    // 获取当前页面
    handleCurrentChange (val) {
      this.queryInfo.currPage = val;
      this.getList()
    },

  },
};
</script>

<style scoped>
</style>

