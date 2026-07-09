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
        <el-table-column label="身份证号" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard }}</template>
        </el-table-column>
        <el-table-column label="出生日期" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.birthday }}</template>
        </el-table-column>
        <el-table-column label="性别" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : '女' }}</template>
        </el-table-column>
        <el-table-column label="身高(cm)" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.height }}</template>
        </el-table-column>
        <el-table-column label="体重(kg)" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.weight }}</template>
        </el-table-column>
        <el-table-column label="民族" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.nation }}</template>
        </el-table-column>
        <el-table-column label="宗教信仰" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.religionType }}</template>
        </el-table-column>
        <el-table-column label="文化程度" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.degreeEducation }}</template>
        </el-table-column>
        <el-table-column label="居住情况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ renderLiveState(scope.row.liveState) }}</template>
        </el-table-column>
        <el-table-column label="婚姻状况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.marryState }}</template>
        </el-table-column>
        <el-table-column label="医疗费用支付方式" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.medicalType }}</template>
        </el-table-column>
        <el-table-column label="经济来源" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.economicSources }}</template>
        </el-table-column>
        <el-table-column label="跌倒" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.accidentOne === 0 ? '无' :
            scope.row.accidentOne === 1 ? '发生过 1 次' :
              scope.row.accidentOne === 2 ? '发生过 2 次' : '发生过 3 次及以上'
          }}</template>
        </el-table-column>
        <el-table-column label="走失" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.accidentTwo === 0 ? '无' :
            scope.row.accidentTwo === 1 ? '发生过 1 次' :
              scope.row.accidentTwo === 2 ? '发生过 2 次' : '发生过 3 次及以上'
          }}</template>
        </el-table-column>
        <el-table-column label="噎食" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.accidentThree === 0 ? '无' :
              scope.row.accidentThree === 1 ? '发生过 1 次' :
                scope.row.accidentThree === 2 ? '发生过 2 次' : '发生过 3 次及以上'
            }}
          </template>
        </el-table-column>
        <el-table-column label="自杀" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.accidentFour === 0 ? '无' :
              scope.row.accidentFour === 1 ? '发生过 1 次' :
                scope.row.accidentFour === 2 ? '发生过 2 次' : '发生过 3 次及以上'
            }}
          </template>
        </el-table-column>
        <el-table-column label="信息提供者姓名" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.provideName }}</template>
        </el-table-column>
        <el-table-column label="信息提供者与老人关系" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.provideRelation === 1 ? '本人' :
              scope.row.provideRelation === 2 ? '配偶' :
                scope.row.provideRelation === 3 ? '子女' :
                  scope.row.provideRelation === 4 ? '其他亲属' :
                    scope.row.provideRelation === 5 ? '雇佣照顾者' :
                      scope.row.provideRelation === 6 ? '(村)居委会工作人员' : '其他'
          }}</template>
        </el-table-column>
        <el-table-column label="联系人" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.provideMan }}</template>
        </el-table-column>
        <el-table-column label="联系电话" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.provideTel }}</template>
        </el-table-column>
        <el-table-column label="备注" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark }}</template>
        </el-table-column>
        <el-table-column label="创建时间" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.createTime }}</template>
        </el-table-column>
        <el-table-column label="所属区划" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaCode }}</template>
        </el-table-column>
        <el-table-column label="所属区划名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.areaName }}</template>
        </el-table-column>
        <el-table-column label="疾病诊断" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.majorDiseases }}</template>
        </el-table-column>
        <el-table-column label="疾病名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.majorDiseasesName }}</template>
        </el-table-column>
        <el-table-column label="压力性损伤" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthOne === 1 ? 'Ⅰ期:皮肤完好，出现指压不会变白的红印' :
              scope.row.healthOne === 2 ? 'Ⅱ期:皮肤真皮层损失，暴露，出现水痘' :
                scope.row.healthOne === 3 ? 'Ⅲ期:全层皮肤缺失，可见脂肪，肉芽组织以及边缘内卷' :
                  scope.row.healthOne === 4 ? 'Ⅳ期:全层皮肤，组织缺失，可见肌腱，肌肉，腱膜，以及边缘内卷，伴随隧道，潜行' :
                    '不可分期：全身皮肤，组织被腐肉，焦痂掩盖，无法确认组织缺失程度，去除腐肉，焦痂才可判断损伤程度'
          }}</template>
        </el-table-column>
        <el-table-column label="关节活动度" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthTwo === 1 ? '无，没有影响日常生活功能' :
              scope.row.healthTwo === 2 ? '是，影响日常生活功能' : '无法判断'
          }}</template>
        </el-table-column>
        <el-table-column label="部位" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.healthTwoMemo }}</template>
        </el-table-column>
        <el-table-column label="伤口情况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthThree === 1 ? '无' :
              scope.row.healthThree === 2 ? '擦伤' :
                scope.row.healthThree === 3 ? '烧烫伤' :
                  scope.row.healthThree === 4 ? '术后伤口' :
                    scope.row.healthThree === 5 ? '糖尿病足溃疡' :
                      scope.row.healthThree === 6 ? '血管性溃疡' : '其他伤口'
          }}</template>
        </el-table-column>
        <el-table-column label="特殊护理情况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthFour === 1 ? '无' :
              scope.row.healthFour === 2 ? '胃管' :
                scope.row.healthFour === 3 ? '尿管' :
                  scope.row.healthFour === 4 ? '气管切开' :
                    scope.row.healthFour === 5 ? '胃/肠/膀胱造痿' :
                      scope.row.healthFour === 6 ? '无创呼吸机' :
                        scope.row.healthFour === 7 ? '透析' : '其他'
          }}</template>
        </el-table-column>
        <el-table-column label="疼痛感" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthFive === 1 ? '无疼痛' :
              scope.row.healthFive === 2 ? '轻度疼痛' :
                scope.row.healthFive === 3 ? '中度疼痛(尚可忍受的程度)' :
                  scope.row.healthFive === 4 ? '重度疼痛(无法忍受的程度)' : '不知道或无法判断'
          }}</template>
        </el-table-column>
        <el-table-column label="牙齿缺失情况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthSix === 1 ? '无缺损' :
              scope.row.healthSix === 2 ? '牙体缺损' :
                scope.row.healthSix === 3 ? '牙列缺损' : '牙列缺失'
          }}</template>
        </el-table-column>
        <el-table-column label="牙列缺损" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span v-if="scope.row.healthSix === 3">
              {{
                scope.row.healthSixThree === 1 ? '非对位牙缺失' :
                  scope.row.healthSixThree === 2 ? '单侧对位牙缺失' : '双侧对位牙缺失'
              }}
            </span>
            <span v-else>--</span>
          </template>
        </el-table-column>
        <el-table-column label="牙列缺失" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span v-if="scope.row.healthSix === 4">
              {{
                scope.row.healthSixFour === 1 ? '上颌牙缺失' :
                  scope.row.healthSixFour === 2 ? '下颌牙缺失' : '全口牙缺失'
              }}
            </span>
            <span v-else>--</span>
          </template>
        </el-table-column>
        <el-table-column label="义齿佩戴情况" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthSeven === 1 ? '无义齿' :
              scope.row.healthSeven === 1 ? '固定义齿' :
                scope.row.healthSeven === 1 ? '可摘局部义齿' : '可摘全/半口义齿'
          }}</template>
        </el-table-column>
        <el-table-column label="吞咽困难的情形和症状" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{
            scope.row.healthEight === 1 ? '无' :
              scope.row.healthEight === 2 ? '抱怨吞咽困难或吞咽时会疼痛' :
                scope.row.healthEight === 3 ? '吃东西或喝水的时出现咳嗽或呛咳' :
                  scope.row.healthEight === 4 ? '用餐后嘴中仍含着食物或留有残余食物' :
                    scope.row.healthEight === 5 ? '当喝或者吃流质或固体的食物时,食物会从嘴角边流失' : '有流口水的情况'
          }}</template>
        </el-table-column>
        <el-table-column label="营养不良:体值指数(BMI)低于正常值" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.healthNine === 1 ? '无' : '有' }}</template>
        </el-table-column>
        <el-table-column label="清理呼吸道无效" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.healthTen === 1 ? '无' : '有' }}</template>
        </el-table-column>
        <el-table-column label="昏迷" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.healthEleven === 1 ? '无' : '有' }}</template>
        </el-table-column>
        <el-table-column label="其他" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.healthOther }}</template>
        </el-table-column>
        <el-table-column label="其他疾病名称" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.majorDiseasesOther }}</template>
        </el-table-column>
        <el-table-column label="操作" width="135" align="center" fixed="right">
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
          :current-page="queryInfo.currPage" :page-sizes="[10, 20, 30, 40]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <el-dialog :title="(labelType == 'add' ? '新增' : '编辑')" :visible.sync="showDialog" width="900px" height="600px">
      <div style="height: 500px; overflow-y: auto; padding-right: 8px;">
        <el-form ref="form" :model="form" :rules="rules" label-width="120px">
          <el-row :gutter="10">
            <el-col :span="12">
              <el-form-item label="老人姓名：" prop="elderName">
                <el-input v-model="form.elderName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身份证号：" prop="idCard">
                <el-input v-model="form.idCard" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="出生日期：" prop="birthday">
                <div class="form-box">
                  <el-input v-model="form.birthday" placeholder="请输入名称"></el-input>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="性别：" prop="sex">
                <div class="form-box">
                  <el-select v-model="form.sex" placeholder="请选择性别">
                    <el-option label="男" value="1"></el-option>
                    <el-option label="女" value="2"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="身高（CM）：" prop="height">
                <el-input v-model="form.height" placeholder="请输入"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="体重（KG）：" prop="weight">
                <el-input v-model="form.weight" placeholder="请输入"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="民族：" prop="nation">
                <el-select v-model="form.nation" placeholder="请选择民族" clearable style="width:100%">
                  <el-option label="汉族" value="汉族"></el-option>
                  <el-option label="蒙古族" value="蒙古族"></el-option>
                  <el-option label="回族" value="回族"></el-option>
                  <el-option label="藏族" value="藏族"></el-option>
                  <el-option label="维吾尔族" value="维吾尔族"></el-option>
                  <el-option label="苗族族" value="苗族"></el-option>
                  <el-option label="彝族" value="彝族"></el-option>
                  <el-option label="壮族" value="壮族"></el-option>
                  <el-option label="布依族" value="布依族"></el-option>
                  <el-option label="朝鲜族" value="朝鲜族"></el-option>
                  <el-option label="满族" value="满族"></el-option>
                  <el-option label="侗族" value="侗族"></el-option>
                  <el-option label="瑶族" value="瑶族"></el-option>
                  <el-option label="白族" value="白族"></el-option>
                  <el-option label="土家族" value="土家族"></el-option>
                  <el-option label="哈尼族" value="哈尼族"></el-option>
                  <el-option label="哈萨克族" value="哈萨克族"></el-option>
                  <el-option label="傣族" value="傣族"></el-option>
                  <el-option label="黎族" value="黎族"></el-option>
                  <el-option label="僳僳族" value="僳僳族"></el-option>
                  <el-option label="佤族" value="佤族"></el-option>
                  <el-option label="畲族" value="畲族"></el-option>
                  <el-option label="高山族" value="高山族"></el-option>
                  <el-option label="拉祜族" value="拉祜族"></el-option>
                  <el-option label="水族" value="水族"></el-option>
                  <el-option label="东乡族" value="东乡族"></el-option>
                  <el-option label="纳西族" value="纳西族"></el-option>
                  <el-option label="景颇族" value="景颇族"></el-option>
                  <el-option label="柯尔克孜族" value="柯尔克孜族"></el-option>
                  <el-option label="土族" value="土族"></el-option>
                  <el-option label="达斡尔族" value="达斡尔族"></el-option>
                  <el-option label="仫佬族" value="仫佬族"></el-option>
                  <el-option label="羌族" value="羌族"></el-option>
                  <el-option label="布朗族" value="布朗族"></el-option>
                  <el-option label="撒拉族" value="撒拉族"></el-option>
                  <el-option label="毛难族" value="毛难族"></el-option>
                  <el-option label="仡佬族" value="仡佬族"></el-option>
                  <el-option label="锡伯族" value="锡伯族"></el-option>
                  <el-option label="阿昌族" value="阿昌族"></el-option>
                  <el-option label="普米族" value="普米族"></el-option>
                  <el-option label="塔吉克族" value="塔吉克族"></el-option>
                  <el-option label="怒族" value="怒族"></el-option>
                  <el-option label="乌孜别克族" value="乌孜别克族"></el-option>
                  <el-option label="俄罗斯族" value="俄罗斯族"></el-option>
                  <el-option label="鄂温克族" value="鄂温克族"></el-option>
                  <el-option label="德昂族" value="德昂族"></el-option>
                  <el-option label="保安族" value="保安族"></el-option>
                  <el-option label="裕固族" value="裕固族"></el-option>
                  <el-option label="京族" value="京族"></el-option>
                  <el-option label="塔塔尔族" value="塔塔尔族"></el-option>
                  <el-option label="独龙族" value="独龙族"></el-option>
                  <el-option label="鄂伦春族" value="鄂伦春族"></el-option>
                  <el-option label="赫哲族" value="赫哲族"></el-option>
                  <el-option label="门巴族" value="门巴族"></el-option>
                  <el-option label="珞巴族" value="珞巴族"></el-option>
                  <el-option label="基诺族" value="基诺族"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="宗教信仰：" prop="religionType">
                <el-input v-model="form.religionType" placeholder="请输入"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="文化程度：" prop="degreeEducation">
                <el-select v-model="form.degreeEducation" placeholder="请选择文化程度" style="width:100%">
                  <el-option label="小学" value="小学"></el-option>
                  <el-option label="初中" value="初中"></el-option>
                  <el-option label="中专" value="中专"></el-option>
                  <el-option label="高中" value="高中"></el-option>
                  <el-option label="专科" value="专科"></el-option>
                  <el-option label="本科" value="本科"></el-option>
                  <el-option label="硕士" value="硕士"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="居住情况：" prop="liveState">
                <el-select mulptile v-model="liveStateArray" placeholder="请选择居住情况" style="width:100%">
                  <el-option label="独自居住" value="1"></el-option>
                  <el-option label="与配偶居住" value="2"></el-option>
                  <el-option label="与子女合住" value="3"></el-option>
                  <el-option label="其他" value="4"></el-option>
                  <el-option label="与父母同住" value="5"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="婚姻状况：" prop="marryState">
                <el-select v-model="form.marryState" placeholder="请选择婚姻状况" style="width:100%">
                  <el-option label="已婚" value="已婚"></el-option>
                  <el-option label="未婚" value="未婚"></el-option>
                  <el-option label="离婚" value="离婚"></el-option>
                  <el-option label="丧偶" value="丧偶"></el-option>
                  <el-option label="未说明的婚姻状况" value="未说明的婚姻状况"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="医疗费支付方式：" prop="medicalType">
                <el-select v-model="medicalTypeArray" multiple placeholder="请选择医疗费用支付方式" style="width:100%">
                  <el-option label="城镇职工医疗保险" value="1"></el-option>
                  <el-option label="城镇居民医疗保险" value="2"></el-option>
                  <el-option label="新兴农村合作医疗" value="3"></el-option>
                  <el-option label="商业保险" value="4"></el-option>
                  <el-option label="其他" value="5"></el-option>
                </el-select>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="经济来源：" prop="siteName">
                <div class="form-box">
                  <el-select v-model="economicSourcesArray" multiple placeholder="请选择经济来源" style="width:100%">
                    <el-option label="低保" value="1"></el-option>
                    <el-option label="子女赡养" value="2"></el-option>
                    <el-option label="社保工资" value="3"></el-option>
                    <el-option label="出租房子" value="4"></el-option>
                    <el-option label="做小生意" value="5"></el-option>
                    <el-option label="退休金/养老金" value="6"></el-option>
                    <el-option label="亲友资助" value="7"></el-option>
                    <el-option label="其他补贴" value="8"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="跌倒：" prop="accidentOne">
                <div class="form-box">
                  <el-select v-model="form.accidentOne" placeholder="请选择跌倒次数">
                    <el-option label="无" value="0"></el-option>
                    <el-option label="发生过 1 次" value="1"></el-option>
                    <el-option label="发生过 2 次" value="2"></el-option>
                    <el-option label="发生过 3 次及以上" value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="走失：" prop="accidentTwo">
                <div class="form-box">
                  <el-select v-model="form.accidentTwo" placeholder="请选择走失次数">
                    <el-option label="无" value="0"></el-option>
                    <el-option label="发生过 1 次" value="1"></el-option>
                    <el-option label="发生过 2 次" value="2"></el-option>
                    <el-option label="发生过 3 次及以上" value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="噎食：" prop="accidentThree">
                <div class="form-box">
                  <el-select v-model="form.accidentThree" placeholder="请选择噎食次数">
                    <el-option label="无" value="0"></el-option>
                    <el-option label="发生过 1 次" value="1"></el-option>
                    <el-option label="发生过 2 次" value="2"></el-option>
                    <el-option label="发生过 3 次及以上" value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="自杀：" prop="accidentFour">
                <div class="form-box">
                  <el-select v-model="form.accidentFour" placeholder="请选择自杀次数">
                    <el-option label="无" value="0"></el-option>
                    <el-option label="发生过 1 次" value="1"></el-option>
                    <el-option label="发生过 2 次" value="2"></el-option>
                    <el-option label="发生过 3 次及以上" value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="其他：" prop="accidentFive">
                <div class="form-box">
                  <el-select v-model="form.accidentFive" placeholder="请选择其他">
                    <el-option label="无" value="0"></el-option>
                    <el-option label="发生过 1 次" value="1"></el-option>
                    <el-option label="发生过 2 次" value="2"></el-option>
                    <el-option label="发生过 3 次及以上" value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="信息提供者姓名：" prop="provideName">
                <el-input v-model="form.provideName" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="信息提供者与老人关系：" prop="provideRelation">
                <div class="form-box">
                  <el-select v-model="form.provideRelation" placeholder="请选择信息提供者与老人关系">
                    <el-option label="本人" value="1"></el-option>
                    <el-option label="配偶" value="2"></el-option>
                    <el-option label="子女" value="3"></el-option>
                    <el-option label="其他亲属" value="4"></el-option>
                    <el-option label="雇佣照顾者" value="5"></el-option>
                    <el-option label="(村)居委会工作人员" value="6"></el-option>
                    <el-option label="其他" value="7"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系人：" prop="provideMan">
                <el-input v-model="form.provideMan" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="联系电话：" prop="provideTel">
                <el-input v-model="form.provideTel" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="备注：" prop="remark">
                <el-input v-model="form.remark" placeholder="请输入名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="所属区划名称：" prop="areaName">
                <el-input v-model="form.areaName" placeholder="请输入所属区划名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="疾病诊断：" prop="majorDiseases">
                <el-input v-model="form.majorDiseases" placeholder="请输入疾病诊断名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="疾病名称：" prop="majorDiseasesName">
                <el-input v-model="form.majorDiseasesName" placeholder="请输入疾病名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="压力性损伤：" prop="healthOne">
                <div class="form-box">
                  <el-select v-model="form.healthOne" placeholder="请选择是否启用">
                    <el-option label="Ⅰ期:皮肤完好，出现指压不会变白的红印" :value="1"></el-option>
                    <el-option label="Ⅱ期:皮肤真皮层损失，暴露，出现水痘" :value="2"></el-option>
                    <el-option label="Ⅲ期:全层皮肤缺失，可见脂肪，肉芽组织以及边缘内卷" :value="3"></el-option>
                    <el-option label="Ⅳ期:全层皮肤，组织缺失，可见肌腱，肌肉，腱膜，以及边缘内卷，伴随隧道，潜行" :value="4"></el-option>
                    <el-option label="不可分期：全身皮肤，组织被腐肉，焦痂掩盖，无法确认组织缺失程度，去除腐肉，焦痂才可判断损伤程度" :value="5"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="关节活动度：" prop="healthTwo">
                <div class="form-box">
                  <el-select v-model="form.healthTwo" placeholder="请选择关节活动度">
                    <el-option label="无，没有影响日常生活功能" :value="1"></el-option>
                    <el-option label="是，影响日常生活功能" :value="2"></el-option>
                    <el-option label="无法判断" :value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="部位：" prop="healthTwoMemo">
                <el-input v-model="form.healthTwoMemo" placeholder="请输入部位名称"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="伤口情况(可多选)：">
                <div class="form-box">
                  <el-select multiple v-model="healthThree" collapse-tags-limit="3" placeholder="请选择伤口情况">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="擦伤" :value="2"></el-option>
                    <el-option label="烧烫伤" :value="3"></el-option>
                    <el-option label="术后伤口" :value="4"></el-option>
                    <el-option label="糖尿病足溃疡" :value="5"></el-option>
                    <el-option label="血管性溃疡" :value="6"></el-option>
                    <el-option label="其他伤口" :value="7"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="特殊护理情况(可多选)：">
                <div class="form-box">
                  <el-select multiple v-model="healthFour" collapse-tags-limit="2" placeholder="请选择特殊护理情况">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="胃管" :value="2"></el-option>
                    <el-option label="尿管" :value="3"></el-option>
                    <el-option label="气管切开" :value="4"></el-option>
                    <el-option label="胃/肠/膀胱造痿" :value="5"></el-option>
                    <el-option label="无创呼吸机" :value="6"></el-option>
                    <el-option label="透析" :value="7"></el-option>
                    <el-option label="其他" :value="8"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="疼痛感：" prop="healthFive">
                <div class="form-box">
                  <el-select v-model="form.healthFive" placeholder="请选择疼痛感">
                    <el-option label="无疼痛" :value="1"></el-option>
                    <el-option label="轻度疼痛" :value="2"></el-option>
                    <el-option label="中度疼痛(尚可忍受的程度)" :value="3"></el-option>
                    <el-option label="重度疼痛(无法忍受的程度)" :value="4"></el-option>
                    <el-option label="不知道或无法判断" :value="5"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="牙齿缺失情况(可多选)：">
                <div class="form-box">
                  <el-select multiple v-model="healthSix" collapse-tags-limit="2" placeholder="请选择牙齿缺失情况(可多选)">
                    <el-option label="无缺损" :value="1"></el-option>
                    <el-option label="牙体缺损(如 龋齿，楔状缺损)" :value="2"></el-option>
                    <el-option label="牙列缺损" :value="3"></el-option>
                    <el-option label="牙列缺失" :value="4"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="牙列缺损：" prop="healthSixThree">
                <div class="form-box">
                  <el-select v-model="form.healthSixThree" placeholder="请选择牙列缺损">
                    <el-option label="非对位牙缺失" :value="1"></el-option>
                    <el-option label="单侧对位牙缺失" :value="2"></el-option>
                    <el-option label="双侧对位牙缺失" :value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="牙列缺失：" prop="healthSixFour">
                <div class="form-box">
                  <el-select v-model="form.healthSixFour" placeholder="请选择牙列缺失">
                    <el-option label="上颌牙缺失" :value="1"></el-option>
                    <el-option label="下颌牙缺失" :value="2"></el-option>
                    <el-option label="全口牙缺失" :value="3"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="义齿佩戴情况(可多选)：">
                <div class="form-box">
                  <el-select multiple v-model="healthSeven" collapse-tags-limit="2" placeholder="请选择义齿佩戴情况(可多选)">
                    <el-option label="无义齿" :value="1"></el-option>
                    <el-option label="固定义齿" :value="2"></el-option>
                    <el-option label="可摘局部义齿" :value="3"></el-option>
                    <el-option label="可摘全/半口义齿" :value="4"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="吞咽困难的情形和症状(可多选)：">
                <div class="form-box">
                  <el-select multiple v-model="healthEight" collapse-tags-limit="2" placeholder="请选择吞咽困难的情形和症状(可多选)">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="抱怨吞咽困难或吞咽时会疼痛" :value="2"></el-option>
                    <el-option label="吃东西或喝水的时出现咳嗽或呛咳" :value="3"></el-option>
                    <el-option label="用餐后嘴中仍含着食物或留有残余食物" :value="4"></el-option>
                    <el-option label="当喝或者吃流质或固体的食物时，食物会从嘴角边流失" :value="5"></el-option>
                    <el-option label="有流口水的情况" :value="6"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="营养不良:体值指数(BMI)低于正常值：" prop="healthNine">
                <div class="form-box">
                  <el-select v-model="form.healthNine" placeholder="请选择营养不良:体值指数(BMI)低于正常值">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="有" :value="2"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="清理呼吸道无效：" prop="siteName">
                <div class="form-box">
                  <el-select v-model="form.healthTen" placeholder="请选择清理呼吸道无效">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="有" :value="2"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="昏迷：" prop="siteName">
                <div class="form-box">
                  <el-select v-model="form.healthEleven" placeholder="请选择是否有昏迷">
                    <el-option label="无" :value="1"></el-option>
                    <el-option label="有" :value="2"></el-option>
                  </el-select>
                </div>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="其他：" prop="healthOther">
                <el-input v-model="form.healthOther" placeholder="请输入"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="其他疾病名称：" prop="majorDiseasesOther">
                <el-input v-model="form.majorDiseasesOther" placeholder="请输入"></el-input>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
      </div>

      <span slot="footer">
        <el-button size="small" @click="showDialog = false">取消</el-button>
        <el-button size="small" type="primary" @click="handleSave">确定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 10,
        pageCount: 1,
        currPage: 1,
        condition: {}
      },
      form: {},
      healthThree: [],
      healthFour: [],
      healthSix: [],
      healthSeven: [],
      healthEight: [],
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256, //表格高度
      headerHeight: 0,
      loading: false,
      liveStateArray: [], // 居住情况（多选）
      economicSourcesArray: [], // 经济来源（多选）
      medicalTypeArray: [], // 医疗费用支付方式（多选）
    };
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
      that.$http.post("/assessmentElderBase/list", that.queryInfo).then(function (response) {
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
      this.form.economicSources = this.economicSourcesArray.join(',')
      this.form.liveState = this.liveStateArray.join(',')
      this.form.medicalType = this.medicalTypeArray.join(',')

      var that = this;
      that.$http.post("/assessmentElderBase/save", that.form).then(function (response) {
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
    edit(row) {
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
        that.$http.post("/assessmentElderBase/delete", { "id": id }).then(function (response) {
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

    // 渲染居住情况文本
    renderLiveState(value) {
      if (value === null || value === undefined || value === '') {
        return ''
      }
      const map = {
        '1': '独自居住',
        '2': '与配偶居住',
        '3': '与子女合住',
        '4': '其他',
        '5': '与父母同住'
      }
      return String(value)
        .split(',')
        .map(item => item.trim())
        .filter(item => item !== '')
        .map(item => map[item] || item)
        .join('，')
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

<style scoped lang="scss">
.form-box {
  width: 100%;

  // 强制输入框、下拉容器填满父盒子
  ::v-deep .el-input,
  ::v-deep .el-select {
    width: 100%;
  }

  // 统一左右内边距
  ::v-deep .el-input__inner {
    padding: 0 15px;
  }

  // 关键：缩小下拉框右侧预留空间，把箭头往里挪，文字区域和input对齐
  ::v-deep .el-select .el-input__inner {
    padding-right: 32px; // 缩小右侧空白，释放文字宽度
  }

  // 下拉箭头左移，匹配新padding
  ::v-deep .el-select__caret {
    right: 10px;
  }

  // 禁止修改高度，保持原生默认高度
  ::v-deep .el-input__inner {
    height: auto !important;
    line-height: auto !important;
  }
}
</style>
