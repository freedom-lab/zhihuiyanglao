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

            
          <el-table-column label="老人姓名" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.elderName }}</template>
          </el-table-column>
          <el-table-column label="身份证号" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.idCard }}</template>
          </el-table-column>
          <el-table-column label="年龄" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.age }}</template>
          </el-table-column>
          <el-table-column label="性别" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sex }}</template>
          </el-table-column>
          <el-table-column label="联系电话" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.linkTel }}</template>
          </el-table-column>
          <el-table-column label="婚姻状况" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.marryState }}</template>
          </el-table-column>
          <el-table-column label="文化程度" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.degreeEducation }}</template>
          </el-table-column>
          <el-table-column label="残疾情况类型" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.disabilityType }}</template>
          </el-table-column>
     
          <el-table-column label="主要慢性病名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.majorDiseasesName }}</template>
          </el-table-column>
          <el-table-column label="医保类别代码" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.medicalCategory }}</template>
          </el-table-column>
          <el-table-column label="有无子女" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.isChildren }}</template>
          </el-table-column>
          <el-table-column label="工作单位" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.workUnit }}</template>
          </el-table-column>
          <el-table-column label="职业" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.career }}</template>
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
          <el-table-column label="基本情况-身高（厘米）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.height }}</template>
          </el-table-column>
          <el-table-column label="基本情况-体重（千克）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.weight }}</template>
          </el-table-column>
          <el-table-column label="基本情况-腰围（厘米）" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.waist }}</template>
          </el-table-column>
          <el-table-column label="个人史-暴露史" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.exposureHistory }}</template>
          </el-table-column>
          <el-table-column label="个人史-饮酒史" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.drinkingHabits }}</template>
          </el-table-column>
          <el-table-column label="个人史-吸烟史" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.smokingHabits }}</template>
          </el-table-column>
          <el-table-column label="个人史-过敏史" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.allergicHistory }}</template>
          </el-table-column>
          <el-table-column label="一般情况-饮食" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.dietaryHabit }}</template>
          </el-table-column>
          <el-table-column label="一般情况-睡眠" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.sleepQuality }}</template>
          </el-table-column>
          <el-table-column label="一般情况-二便" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.relieveBowels }}</template>
          </el-table-column>
          <el-table-column label="病史-手术史-手术名称1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.operationNameOne }}</template>
          </el-table-column>
          <el-table-column label="病史-手术史-手术时间1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.operationTimeOne }}</template>
          </el-table-column>
          <el-table-column label="病史-手术史-手术名称2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.operationNameTwo }}</template>
          </el-table-column>
          <el-table-column label="病史-手术史-手术时间2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.operationTimeTwo }}</template>
          </el-table-column>
          <el-table-column label="病史-外伤史-外伤名称1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.traumaNameOne }}</template>
          </el-table-column>
          <el-table-column label="病史-外伤史-外伤时间1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.traumaTimeOne }}</template>
          </el-table-column>
          <el-table-column label="病史-外伤史-外伤名称2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.traumaNameTwo }}</template>
          </el-table-column>
          <el-table-column label="病史-外伤史-外伤名称2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.traumaTimeTwo }}</template>
          </el-table-column>
          <el-table-column label="病史-输血史-输血原因1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bloodNameOne }}</template>
          </el-table-column>
          <el-table-column label="病史-输血史-输血日期1" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bloodTimeOne }}</template>
          </el-table-column>
          <el-table-column label="病史-输血史-输血原因2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bloodNameTwo }}</template>
          </el-table-column>
          <el-table-column label="病史-输血史-输血日期2" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.bloodTimeTwo }}</template>
          </el-table-column>
          <el-table-column label="家族史-父亲" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.fatherDiseaseIds }}</template>
          </el-table-column>
          <el-table-column label="家族史-母亲" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.motherDiseaseIds }}</template>
          </el-table-column>
          <el-table-column label="家族史-子女" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.childrenDiseaseIds }}</template>
          </el-table-column>
          <el-table-column label="家族史-兄弟姐妹" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.brotherDiseaseIds }}</template>
          </el-table-column>
          <el-table-column label="遗传病史" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.geneticDisease }}</template>
          </el-table-column>
          <el-table-column label="健康指导" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.healthGuidance }}</template>
          </el-table-column>
          <el-table-column label="插管种类" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.intubationType }}</template>
          </el-table-column>
          <el-table-column label="备注" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.memo }}</template>
          </el-table-column>
        
          <el-table-column label="其他疾病名称" align="center" show-overflow-tooltip>
            <template slot-scope="scope">{{ scope.row.majorDiseasesOther }}</template>
          </el-table-column>
        
        <el-table-column label="操作" width="165" align="center">
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
              <el-form-item label="个人史-暴露史(1.无：" prop="siteName">
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
              <el-form-item label="插管种类：" prop="siteName">
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
              <el-form-item label="创建人：" prop="siteName">
                <el-input v-model="form.createUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建部门：" prop="siteName">
                <el-input v-model="form.createDept" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="创建时间：" prop="siteName">
                <el-input v-model="form.createTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改人：" prop="siteName">
                <el-input v-model="form.updateUser" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="修改时间：" prop="siteName">
                <el-input v-model="form.updateTime" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="状态：" prop="siteName">
                <el-input v-model="form.status" placeholder="请输入名称"></el-input>
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
	  that.$http.post("/healthBaseInfo/list", that.queryInfo).then(function (response) {
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
	  that.$http.post("/healthBaseInfo/save", that.form).then(function (response) {
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
        that.$http.post("/healthBaseInfo/delete" ,{"id":id}).then(function (response) {
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

