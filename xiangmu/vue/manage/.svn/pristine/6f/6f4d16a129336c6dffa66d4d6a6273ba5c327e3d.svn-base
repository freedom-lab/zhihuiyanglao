<template>
    <div class="page-card">
        <div class="nav-bar">
            <div style="flex: 1;padding-left: 20px;">
                <el-tabs v-model="activeTab" :before-leave="tabBeforeLeave">
                    <el-tab-pane label="基本信息登记" name="base">
                    </el-tab-pane>
                    <el-tab-pane label="疾病诊断和用药情况" name="disease">
                    </el-tab-pane>
                    <el-tab-pane label="健康相关问题" name="health">
                    </el-tab-pane>
                    <el-tab-pane label="用户能力评估" name="ability">
                    </el-tab-pane>
                    <el-tab-pane label="评估结果" name="result">
                    </el-tab-pane>
                </el-tabs>
            </div>
            <div class="close-btn">
                <el-button icon="el-icon-close" size="mini" @click="closePage" />
            </div>
        </div>


        <div style="flex: 1;overflow: hidden;">

            <!-- 基本信息登记 -->
            <div v-if="activeTab === 'base'" class="scroll-wrap">
                <el-form ref="baseForm" :model="form" label-width="240px" label-position="left">
                    <!-- A.1 评估信息表 -->
                    <div class="form-block">
                        <h3 class="block-title">A.1 评估信息表</h3>
                        <el-form-item label="A.1.1 评估编号：" prop="base.assessCode" required>
                            <el-input v-model="form.assessCode" placeholder="请输入A.1.1评估编号" clearable></el-input>
                        </el-form-item>
                        <el-form-item label="A.1.2 评估基准日期：">
                            <el-date-picker v-model="form.assessDate" type="date" placeholder="请选择 A.1.2评估基准日期"
                                style="width:100%"></el-date-picker>
                        </el-form-item>
                        <el-form-item label="A.1.3 评估原因：">
                            <el-input v-model="form.assessReason" placeholder="请输入A.1.3评估原因" clearable></el-input>
                        </el-form-item>
                    </div>

                    <!-- A.2 评估对象基本信息表 -->
                    <div class="form-block">
                        <h3 class="block-title">A.2 评估对象基本信息表</h3>
                        <el-form-item label="A.2.1 姓名：" prop="elderName" required>
                            <div class="input-search-row">
                                <el-input v-model="form.elderName" placeholder="请输入 A.2.1 姓名" clearable></el-input>
                            </div>
                        </el-form-item>
                        <el-form-item label="A.2.2 性别：">
                            <el-select v-model="form.sex" placeholder="请选择 A.2.2 性别" clearable style="width:100%">
                                <el-option label="男" :value="1"></el-option>
                                <el-option label="女" :value="2"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.2.3 出生日期：">
                            <el-date-picker v-model="form.birthday" type="date" style="width:100%"
                                placeholder="请选择 A.2.3 出生日期" clearable value-format="yyyy-MM-dd"></el-date-picker>
                        </el-form-item>
                        <el-form-item label="A.2.4 身高 (cm)：">
                            <el-input v-model="form.height" placeholder="请输入 A.2.4 身高 (cm)" clearable
                                style="width:100%"></el-input>
                        </el-form-item>
                        <el-form-item label="A.2.5 体重 (kg)：">
                            <el-input v-model="form.weight" placeholder="请输入 A.2.5 体重 (kg)" clearable
                                style="width:100%"></el-input>
                        </el-form-item>
                        <el-form-item label="A.2.6 民族：">
                            <el-select v-model="form.nation" placeholder="请选择 A.2.6 民族" clearable style="width:100%">
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
                        <el-form-item label="A.2.7 宗教信仰：">
                            <el-input v-model="form.religionType" placeholder="请输入A.2.7宗教信仰"></el-input>
                        </el-form-item>
                        <el-form-item label="A.2.8 公民身份证号码：">
                            <el-input v-model="form.idCard" placeholder="请输入 A.2.8 公民身份证号码" clearable></el-input>
                        </el-form-item>
                        <el-form-item label="A.2.9 文化程度：">
                            <el-select v-model="form.degreeEducation" placeholder="请选择A.2.9文化程度" style="width:100%">
                                <el-option label="小学" value="小学"></el-option>
                                <el-option label="初中" value="初中"></el-option>
                                <el-option label="中专" value="中专"></el-option>
                                <el-option label="高中" value="高中"></el-option>
                                <el-option label="本科" value="本科"></el-option>
                                <el-option label="专科" value="专科"></el-option>
                                <el-option label="硕士" value="硕士"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.2.10 居住情况（多选）：">
                            <el-select mulptile v-model="liveStateArray" multiple placeholder="请选择A.2.10居住情况（多选）"
                                style="width:100%">
                                <el-option label="独自居住" value="1"></el-option>
                                <el-option label="与配偶居住" value="2"></el-option>
                                <el-option label="与子女合住" value="3"></el-option>
                                <el-option label="其他" value="4"></el-option>
                                <el-option label="与父母同住" value="5"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.2.11 婚姻状况：">
                            <el-select v-model="form.marryState" placeholder="请选择A.2.11婚姻状况" style="width:100%">
                                <el-option label="已婚" value="已婚"></el-option>
                                <el-option label="未婚" value="未婚"></el-option>
                                <el-option label="离婚" value="离婚"></el-option>
                                <el-option label="丧偶" value="丧偶"></el-option>
                                <el-option label="未说明的婚姻状况" value="未说明的婚姻状况"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.2.12 医疗费用支付方式（多选）：">
                            <el-select v-model="medicalTypeArray" multiple placeholder="请选择A.2.12医疗费用支付方式（多选）"
                                style="width:100%">
                                <el-option label="城镇职工医疗保险" value="1"></el-option>
                                <el-option label="城镇居民医疗保险" value="2"></el-option>
                                <el-option label="新兴农村合作医疗" value="3"></el-option>
                                <el-option label="商业保险" value="4"></el-option>
                                <el-option label="其他" value="5"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.2.13 经济来源（多选）：">
                            <el-select v-model="economicSourcesArray" multiple placeholder="请选择A.2.13经济来源（多选）"
                                style="width:100%">
                                <el-option label="低保" value="1"></el-option>
                                <el-option label="子女赡养" value="2"></el-option>
                                <el-option label="社保工资" value="3"></el-option>
                                <el-option label="出租房子" value="4"></el-option>
                                <el-option label="做小生意" value="5"></el-option>
                                <el-option label="退休金/养老金" value="6"></el-option>
                                <el-option label="亲友资助" value="7"></el-option>
                                <el-option label="其他补贴" value="8"></el-option>
                            </el-select>
                        </el-form-item>
                    </div>

                    <!-- A.2.14 近30天内照护风险事件 -->
                    <div class="form-block">
                        <h3 class="block-title">A.2.14 近30天内照护风险事件</h3>
                        <el-form-item label="A.2.14.1 跌倒：" row class="radio-horizontal">
                            <el-radio-group v-model="form.accidentOne" row>
                                <el-radio label="无"></el-radio>
                                <el-radio label="发生过一次"></el-radio>
                                <el-radio label="发生过两次"></el-radio>
                                <el-radio label="发生过三次及以上"></el-radio>
                            </el-radio-group>
                        </el-form-item>
                        <el-form-item label="A.2.14.2 走失：" row class="radio-horizontal">
                            <el-radio-group v-model="form.accidentTwo">
                                <el-radio label="无"></el-radio>
                                <el-radio label="发生过一次"></el-radio>
                                <el-radio label="发生过两次"></el-radio>
                                <el-radio label="发生过三次及以上"></el-radio>
                            </el-radio-group>
                        </el-form-item>
                        <el-form-item label="A.2.14.3 噎食：">
                            <el-radio-group v-model="form.accidentThree" row class="radio-horizontal">
                                <el-radio label="无"></el-radio>
                                <el-radio label="发生过一次"></el-radio>
                                <el-radio label="发生过两次"></el-radio>
                                <el-radio label="发生过三次及以上"></el-radio>
                            </el-radio-group>
                        </el-form-item>
                        <el-form-item label="A.2.14.4 自杀、自伤：">
                            <el-radio-group v-model="form.accidentFour" row class="radio-horizontal">
                                <el-radio label="无"></el-radio>
                                <el-radio label="发生过一次"></el-radio>
                                <el-radio label="发生过两次"></el-radio>
                                <el-radio label="发生过三次及以上"></el-radio>
                            </el-radio-group>
                        </el-form-item>
                        <el-form-item label="A.2.14.5 其他：">
                            <el-radio-group v-model="form.accidentFive" row class="radio-horizontal">
                                <el-radio label="无"></el-radio>
                                <el-radio label="发生过一次"></el-radio>
                                <el-radio label="发生过两次"></el-radio>
                                <el-radio label="发生过三次及以上"></el-radio>
                            </el-radio-group>
                        </el-form-item>
                    </div>

                    <!-- A.3 信息提供者及联系人信息表 -->
                    <div class="form-block">
                        <h3 class="block-title">A.3 信息提供者及联系人信息表</h3>
                        <el-form-item label="A.3.1 信息提供者的姓名：">
                            <el-input v-model="form.provideName" placeholder="请输入A.3.1信息提供者的姓名"></el-input>
                        </el-form-item>
                        <el-form-item label="A.3.2 信息提供者与老年人关系：">
                            <el-select v-model="form.provideRelation" placeholder="请选择A.3.2信息提供者与老年人关系"
                                style="width:100%">
                                <el-option label="本人" value="1"></el-option>
                                <el-option label="配偶" value="2"></el-option>
                                <el-option label="子女" value="3"></el-option>
                                <el-option label="其他亲属" value="4"></el-option>
                                <el-option label="雇佣照顾者" value="5"></el-option>
                                <el-option label="(村)居委会工作人员" value="6"></el-option>
                                <el-option label="其他" value="7"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="A.3.3 联系人姓名：">
                            <el-input v-model="form.provideMan" placeholder="请输入A.3.3联系人姓名"></el-input>
                        </el-form-item>
                        <el-form-item label="A.3.4 联系人电话：">
                            <el-input v-model="form.provideTel" placeholder="请输入A.3.4联系人电话"></el-input>
                        </el-form-item>
                    </div>

                    <!-- 底部提交按钮 -->
                    <div class="submit-box">
                        <el-button type="primary" icon="el-icon-check" @click="submit1">提交</el-button>
                    </div>
                </el-form>
            </div>


            <!-- 疾病诊断和用药情况 -->
            <div v-else-if="activeTab === 'disease'" class="scroll-wrap">
                <el-form ref="baseForm" :model="form" label-width="240px" label-position="left">
                    <div class="form-block">
                        <h3 class="block-title">A.4 疾病诊断(可多选)</h3>
                        <div class="sub-title">A.4.1 疾病:</div>
                        <el-checkbox-group v-model="diseaseCodeList" class="disease-checkbox-group">
                            <div class="checkbox-row">
                                <el-checkbox :label="1">高血压病I10~I15</el-checkbox>
                                <el-checkbox :label="2">冠心病I25</el-checkbox>
                                <el-checkbox :label="3">糖尿病E10~E14</el-checkbox>
                                <el-checkbox :label="4">肺炎J12~J18</el-checkbox>
                                <el-checkbox :label="5">慢性阻塞性肺疾病J44</el-checkbox>
                            </div>
                            <div class="checkbox-row">
                                <el-checkbox :label="6">脑出血I60~I62</el-checkbox>
                                <el-checkbox :label="7">脑梗塞I63</el-checkbox>
                                <el-checkbox :label="8">尿路感染(30天内)</el-checkbox>
                                <el-checkbox :label="9">帕金森综合征G20~G22</el-checkbox>
                                <el-checkbox :label="10">慢性肾衰竭N18~N19</el-checkbox>

                            </div>
                            <div class="checkbox-row">
                                <el-checkbox :label="11">肝硬化K74</el-checkbox>
                                <el-checkbox :label="12">消化性溃疡K20~K31</el-checkbox>
                                <el-checkbox :label="13">肿瘤C00~D48</el-checkbox>
                                <el-checkbox :label="14">截肢(6个月内)</el-checkbox>
                                <el-checkbox :label="15">骨折(3个月内)M84</el-checkbox>

                            </div>
                            <div class="checkbox-row">
                                <el-checkbox :label="16">癫痫G40</el-checkbox>
                                <el-checkbox :label="17">甲状腺功能减退症E01~E03</el-checkbox>
                                <el-checkbox :label="18">白内障H25~H26</el-checkbox>
                                <el-checkbox :label="19">青光眼H40~H42</el-checkbox>
                                <el-checkbox :label="20">骨质疏松症 M80~82</el-checkbox>
                            </div>
                            <div class="checkbox-row">
                                <el-checkbox :label="21">痴呆F00~F03</el-checkbox>
                                <el-checkbox :label="22">其他精神和行为障碍F04~F99</el-checkbox>
                            </div>
                        </el-checkbox-group>

                        <div class="other-disease-wrap">
                            <div class="sub-title">其他疾病：</div>
                            <el-input v-model="form.majorDiseasesOther" placeholder="请输入其他疾病"
                                style="margin-left: 20px;width: 90%;"></el-input>
                        </div>
                    </div>

                    <!-- A.4.2 用药情况 -->
                    <div class="section-block">
                        <h3 class="section-title">A.4.2 用药情况（目前长期服药情况）</h3>
                        <el-table :data="medicineList" border class="medicine-table">
                            <el-table-column width="70" label-class-name="op-header">
                                <!-- 表头插槽：蓝色圆形加号按钮 -->
                                <template slot="header">
                                    <div class="header-add-box">
                                        <el-button type="primary" circle icon="el-icon-plus"
                                            @click="addMedicineRow"></el-button>
                                    </div>
                                </template>
                                <!-- 单元格插槽：默认显示行号，hover显示删除按钮 -->
                                <template slot-scope="scope">
                                    <div class="cell-op-box">
                                        <!-- 默认展示序号 -->
                                        <span class="row-index">{{ scope.$index + 1 }}</span>
                                        <!-- hover才出现的删除按钮 -->
                                        <div class="red-del-circle" @click="delMedicineRow(scope.$index)">
                                            <i class="el-icon-delete"></i>
                                        </div>
                                    </div>
                                </template>
                            </el-table-column>

                            <el-table-column label="药品名称">
                                <template slot-scope="scope">
                                    <el-input v-model="scope.row.medicineName" placeholder="请输入药品名称"
                                        clearable></el-input>
                                </template>
                            </el-table-column>
                            <el-table-column label="服药方法">
                                <template slot-scope="scope">
                                    <el-input v-model="scope.row.takeMethod" placeholder="请输入服药方法" clearable></el-input>
                                </template>
                            </el-table-column>
                            <el-table-column label="用药剂量">
                                <template slot-scope="scope">
                                    <el-input v-model="scope.row.dosage" placeholder="请输入用药剂量" clearable></el-input>
                                </template>
                            </el-table-column>
                            <el-table-column label="用药频次">
                                <template slot-scope="scope">
                                    <el-input v-model="scope.row.frequency" placeholder="请输入用药频次" clearable></el-input>
                                </template>
                            </el-table-column>
                        </el-table>
                    </div>

                    <!-- 底部提交按钮 -->
                    <div class="submit-box">
                        <el-button type="primary" icon="el-icon-check" @click="submit2">提交</el-button>
                    </div>

                </el-form>
            </div>


            <!-- 健康相关问题 -->
            <div v-else-if="activeTab === 'health'" class="scroll-wrap">
                <el-form ref="baseForm" :model="form" label-width="240px" label-position="left">
                    <!-- A.5.1 压力性损伤 单选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.1 压力性损伤:</h4>
                        <el-radio-group v-model="form.healthOne">
                            <div class="radio-item">
                                <el-radio label="0">无</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="1">I期:皮肤完好，出现指压不会变白的红印</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="2">II期:皮肤真皮层损失、暴露，出现水疱</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="3">III期:全层皮肤缺失，可见脂肪、肉芽组织以及边缘内卷</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="4">IV期:全层皮肤、组织缺失，可见肌腱、肌肉、腱膜，以及边缘内卷，伴随隧道、潜行</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="5">不可分期:全身皮肤、组织被腐肉、焦痂掩盖，无法确认组织缺失程度，去除腐肉、焦痂才可判断损伤程度</el-radio>
                            </div>
                        </el-radio-group>
                    </div>

                    <!-- A.5.2 关节活动度 单选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.2 关节活动度:</h4>
                        <el-radio-group v-model="form.healthTwo">
                            <div class="radio-item">
                                <el-radio label="1">无,没有影响日常生活功能</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="2">是，影响日常生活功能，部位</el-radio>
                                <el-input v-if="form.healthTwo === '2'" style="width: 200px;"
                                    v-model="form.healthTwoMemo" placeholder="请输入受影响部位" clearable></el-input>
                            </div>
                            <div class="radio-item">
                                <el-radio label="3">无法判断</el-radio>
                            </div>
                        </el-radio-group>
                    </div>

                    <!-- A.5.3 伤口情况 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.3 伤口情况(可多选):</h4>
                        <el-checkbox-group mulptile v-model="healthThreeArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无</el-checkbox>
                                <el-checkbox label="2">擦伤</el-checkbox>
                                <el-checkbox label="3">烧烫伤</el-checkbox>
                                <el-checkbox label="4">术后伤口</el-checkbox>
                                <el-checkbox label="5">糖尿病足溃疡</el-checkbox>
                                <el-checkbox label="6">血管性溃疡</el-checkbox>
                                <el-checkbox label="7">其他伤口</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <!-- A.5.4 特殊护理情况 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.4 特殊护理情况(可多选):</h4>
                        <el-checkbox-group mulptile v-model="healthFourArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无</el-checkbox>
                                <el-checkbox label="2">胃管</el-checkbox>
                                <el-checkbox label="3">尿管</el-checkbox>
                                <el-checkbox label="4">气管切开</el-checkbox>
                                <el-checkbox label="5">胃/肠/膀胱造瘘</el-checkbox>
                                <el-checkbox label="6">无创呼吸机</el-checkbox>
                                <el-checkbox label="7">透析</el-checkbox>
                                <el-checkbox label="8">其他</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <!-- A.5.5 疼痛感 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.5 疼痛感(注:通过表情反应和询问来判断):</h4>
                        <el-checkbox-group mulptile v-model="healthFiveArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无疼痛</el-checkbox>
                                <el-checkbox label="2">轻度疼痛</el-checkbox>
                                <el-checkbox label="3">中度疼痛(尚可忍受的程度)</el-checkbox>
                                <el-checkbox label="4">重度疼痛(无法忍受的程度)</el-checkbox>
                                <el-checkbox label="5">不知道或无法判断</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <!-- A.5.6 牙齿缺失 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.6 牙齿缺失情况(可多选):</h4>
                        <el-checkbox-group v-model="healthSixArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无缺损</el-checkbox>
                                <el-checkbox label="2">牙体缺损(如龋齿、楔状缺损)</el-checkbox>
                                <el-checkbox label="3">牙列缺损</el-checkbox>
                                <el-checkbox label="4">牙列缺失</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <div class="health-six-child">
                        <!-- 牙列缺损 -->
                        <div v-if="healthSixArray.includes('3')" class="form-block" style="margin-right: 50px;">
                            <h4 class="form-title">牙列缺损:</h4>
                            <el-radio-group v-model="form.healthSixThree">
                                <div class="radio-item"><el-radio label="1">非对位牙缺失</el-radio></div>
                                <div class="radio-item"><el-radio label="2">单侧对位牙缺失</el-radio></div>
                                <div class="radio-item"><el-radio label="3">双侧对位牙缺失</el-radio></div>
                            </el-radio-group>
                        </div>

                        <!-- 牙列缺失 -->
                        <div v-if="healthSixArray.includes('4')" class="form-block">
                            <h4 class="form-title">牙列缺损:</h4>
                            <el-radio-group v-model="form.healthSixFour">
                                <div class="radio-item"><el-radio label="1">上颌牙缺失</el-radio></div>
                                <div class="radio-item"><el-radio label="2">下颌牙缺失</el-radio></div>
                                <div class="radio-item"><el-radio label="3">全口牙缺失</el-radio></div>
                            </el-radio-group>
                        </div>
                    </div>


                    <!-- A.5.7 义齿佩戴 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.7 义齿佩戴情况(可多选):</h4>
                        <el-checkbox-group v-model="healthSevenArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无义齿</el-checkbox>
                                <el-checkbox label="2">固定义齿</el-checkbox>
                                <el-checkbox label="3">可摘局部义齿</el-checkbox>
                                <el-checkbox label="4">可摘全/半口义齿</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <!-- A.5.8 吞咽困难 多选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.8 吞咽困难的情形和症状(可多选):</h4>
                        <el-checkbox-group v-model="healthEightArray" style="margin-left: 20px;">
                            <div class="checkbox-row">
                                <el-checkbox label="1">无</el-checkbox>
                                <el-checkbox label="2">抱怨吞咽困难或吞咽时会疼痛</el-checkbox>
                                <el-checkbox label="3">吃东西或喝水时出现咳嗽或呛咳</el-checkbox>
                                <el-checkbox label="4">用餐后嘴中仍含着食物或留有残余食物</el-checkbox>
                            </div>
                            <div class="checkbox-row">
                                <el-checkbox label="5">当喝或吃流质或固体的食物时，食物会从嘴角边流失</el-checkbox>
                                <el-checkbox label="6">有流口水的情况</el-checkbox>
                            </div>
                        </el-checkbox-group>
                    </div>

                    <!-- A.5.9 营养不良 单选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.9 营养不良: 体质指数（BMI）低于正常值 （注:BMI=体重(kg)/[身高(m)]²）:</h4>
                        <el-radio-group v-model="form.healthNine">
                            <div class="radio-item">
                                <el-radio label="1">无</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="2">有</el-radio>
                            </div>
                        </el-radio-group>
                    </div>

                    <!-- A.5.10 清理呼吸道无效 单选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.10 清理呼吸道无效:</h4>
                        <el-radio-group v-model="form.healthTen">
                            <div class="radio-item">
                                <el-radio label="1">无</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="2">有</el-radio>
                            </div>
                        </el-radio-group>
                    </div>

                    <!-- A.5.11 昏迷 单选 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.11 昏迷:</h4>
                        <el-radio-group v-model="form.healthEleven">
                            <div class="radio-item">
                                <el-radio label="1">无</el-radio>
                            </div>
                            <div class="radio-item">
                                <el-radio label="2">有</el-radio>
                            </div>
                        </el-radio-group>
                    </div>

                    <!-- A.5.12 其他输入框 -->
                    <div class="form-block">
                        <h4 class="form-title">A.5.12 其他（请补充）:</h4>
                        <el-input v-model="form.healthOther" placeholder="请输入A.5.12 其他（请补充）"></el-input>
                    </div>

                    <!-- 底部提交按钮 -->
                    <div class="submit-box">
                        <el-button type="primary" icon="el-icon-check" @click="submit3">提交</el-button>
                    </div>
                </el-form>
            </div>


            <!-- 用户能力评估 -->
            <div v-else-if="activeTab === 'ability'" class="scroll-wrap">
                <el-form ref="baseForm" :model="form" label-width="240px" label-position="left">
                    <!-- B.1 老年人能力评估表 -->
                    <div class="form-section">
                        <div class="section-title">B.1 老年人能力评估表</div>

                        <!-- B.1.1 进食 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.1 进食:使用适当的器具将食物送入口中并咽下:</div>
                            <el-radio-group v-model="formData.b1_1">
                                <el-radio label="4分:独立使用器具将食物送进口中并咽下,没有呛咳">4分:独立使用器具将食物送进口中并咽下,没有呛咳</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成,或独立使用辅具,没有呛咳">3分:在他人指导或提示下完成,或独立使用辅具,没有呛咳</el-radio>
                                <el-radio label="2分:进食中需要少量接触式协助,偶尔(每月一次及以上)呛咳">2分:进食中需要少量接触式协助,偶尔(每月一次及以上)呛咳</el-radio>
                                <el-radio
                                    label="1分:在进食中需要大量接触式协助,经常(每周一次及以上)呛咳">1分:在进食中需要大量接触式协助,经常(每周一次及以上)呛咳</el-radio>
                                <el-radio label="0分:完全依赖他人协助进食,或吞咽困难,或留置营养管">0分:完全依赖他人协助进食,或吞咽困难,或留置营养管</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.1.2 修饰 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.2 修饰:指洗脸、刷牙、梳头、刮脸、剪指(趾)甲等:
                            </div>
                            <el-radio-group v-model="formData.b1_2">
                                <el-radio label="4分:独立完成,不需要协助">4分:独立完成,不需要协助</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成">3分:在他人指导或提示下完成</el-radio>
                                <el-radio label="2分:需要他人协助,但以自身完成为主">2分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio label="1分:主要依靠他人协助,自身能给予配合">1分:主要依靠他人协助,自身能给予配合</el-radio>
                                <el-radio label="0分:完全依赖他人协助,且不能给予配合">0分:完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.1.5 穿/脱裤子鞋袜 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.5 穿/脱裤子和鞋袜:指穿/脱裤子、鞋袜等:</div>
                            <el-radio-group v-model="formData.b1_5">
                                <el-radio label="4分:独立完成,不需要协助">4分:独立完成,不需要协助</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成">3分:在他人指导或提示下完成</el-radio>
                                <el-radio label="2分:需要他人协助,但以自身完成为主">2分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio label="1分:主要依靠他人协助,自身能给予配合">1分:主要依靠他人协助,自身能给予配合</el-radio>
                                <el-radio label="0分:完全依赖他人协助,且不能给予配合">0分:完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.1.6 小便控制 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.6 小便控制:控制和排出尿液的能力:</div>
                            <el-radio-group v-model="formData.b1_6">
                                <el-radio label="4分:可自行控制排尿,排尿次数、排尿控制均正常">4分:可自行控制排尿,排尿次数、排尿控制均正常</el-radio>
                                <el-radio
                                    label="3分:白天可自行控制排尿次数,夜间出现排尿次数增多、排尿控制较差,或自行使用尿布、尿垫等辅助用物">3分:白天可自行控制排尿次数,夜间出现排尿次数增多、排尿控制较差,或自行使用尿布、尿垫等辅助用物</el-radio>
                                <el-radio
                                    label="2分:白天大部分时间可自行控制排尿,偶出现(每天&lt;1次,但每周&gt;1次)尿失禁,夜间控制排尿较差,或他人少量协助使用尿布、尿垫等辅助用物">2分:白天大部分时间可自行控制排尿,偶出现(每天&lt;1次,但每周&gt;1次)尿失禁,夜间控制排尿较差,或他人少量协助使用尿布、尿垫等辅助用物</el-radio>
                                <el-radio
                                    label="1分:白天大部分时间不能控制排尿(每天≥1次,但尚未完全失禁),夜间出现尿失禁,或他人大量协助使用尿布、尿垫等辅助用物">1分:白天大部分时间不能控制排尿(每天≥1次,但尚未完全失禁),夜间出现尿失禁,或他人大量协助使用尿布、尿垫等辅助用物</el-radio>
                                <el-radio label="0分:小便失禁,完全不能控制排尿,或留置导尿管">0分:小便失禁,完全不能控制排尿,或留置导尿管</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.1.7 大便控制 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.7 大便控制:控制和排出粪便的能力:</div>
                            <el-radio-group v-model="formData.b1_7">
                                <el-radio label="4分:可正常自行控制大便排出">4分:可正常自行控制大便排出</el-radio>
                                <el-radio
                                    label="3分:有时出现(每周&lt;1次)便秘或大便失禁,或自行使用开塞露、尿垫等辅助用物">3分:有时出现(每周&lt;1次)便秘或大便失禁,或自行使用开塞露、尿垫等辅助用物</el-radio>
                                <el-radio
                                    label="2分:经常出现(每天&lt;1次,但每周&gt;1次)便秘或大便失禁,或他人少量协助使用开塞露、尿垫等辅助用物">2分:经常出现(每天&lt;1次,但每周&gt;1次)便秘或大便失禁,或他人少量协助使用开塞露、尿垫等辅助用物</el-radio>
                                <el-radio
                                    label="1分:大部分时间均出现(每天≥1次)便秘或大便失禁,但尚非完全失控,或他人大量协助使用开塞露、尿垫等辅助用物">1分:大部分时间均出现(每天≥1次)便秘或大便失禁,但尚非完全失控,或他人大量协助使用开塞露、尿垫等辅助用物</el-radio>
                                <el-radio
                                    label="0分:严重便秘或者完全大便失禁,需要依赖他人协助排便或清洁皮肤">0分:严重便秘或者完全大便失禁,需要依赖他人协助排便或清洁皮肤</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.1.8 如厕 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.1.8 如厕:上厕所排泄大小便,并清洁身体(注:
                                评估中强调排泄前解开裤子、完成排泄后清洁身体、穿上裤子):</div>
                            <el-radio-group v-model="formData.b1_8">
                                <el-radio label="4分:独立完成,不需要协助">4分:独立完成,不需要协助</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成">3分:在他人指导或提示下完成</el-radio>
                                <el-radio label="2分:需要他人协助,但以自身完成为主">2分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio label="1分:主要依靠他人协助,自身能给予配合">1分:主要依靠他人协助,自身能给予配合</el-radio>
                                <el-radio label="0分:完全依赖他人协助,且不能给予配合">0分:完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>
                    </div>

                    <!-- B.2 基础运动能力评估表 -->
                    <div class="form-section">
                        <div class="section-title">B.2 基础运动能力评估表</div>

                        <!-- B.2.1 床上体位转移 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.2.1 床上体位转移:卧床翻身及坐起躺下:</div>
                            <el-radio-group v-model="formData.b2_1">
                                <el-radio label="4分:独立完成,不需要协助">4分:独立完成,不需要协助</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成">3分:在他人指导或提示下完成</el-radio>
                                <el-radio label="2分:需要他人协助,但以自身完成为主">2分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio label="1分:主要依靠他人协助,自身能给予配合">1分:主要依靠他人协助,自身能给予配合</el-radio>
                                <el-radio label="0分:完全依赖他人协助,且不能给予配合">0分:完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.2.2 床椅转移 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.2.2 床椅转移:从坐位到站位,再从站位到坐位的转换过程:
                            </div>
                            <el-radio-group v-model="formData.b2_2">
                                <el-radio label="4分:独立完成,不需要协助">4分:独立完成,不需要协助</el-radio>
                                <el-radio label="3分:在他人指导或提示下完成">3分:在他人指导或提示下完成</el-radio>
                                <el-radio label="2分:需要他人协助,但以自身完成为主">2分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio label="1分:主要依靠他人协助,自身能给予配合">1分:主要依靠他人协助,自身能给予配合</el-radio>
                                <el-radio label="0分:完全依赖他人协助,且不能给予配合">0分:完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.2.3 平地行走 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.2.3
                                平地行走:双脚交替的方式在地面行动,总是一只脚在前（注：包括他人辅助或者辅助工具的步行）:</div>
                            <el-radio-group v-model="formData.b2_3">
                                <el-radio label="4分:独立平地步行50m左右,不需要协助,无摔倒风险">4分:独立平地步行50m左右,不需要协助,无摔倒风险</el-radio>
                                <el-radio
                                    label="3分:能平地步行50m左右,存在摔倒风险,需要他人监护或指导,或使用拐杖、助行器等辅助工具">3分:能平地步行50m左右,存在摔倒风险,需要他人监护或指导,或使用拐杖、助行器等辅助工具</el-radio>
                                <el-radio label="2分:在步行时需要他人少量扶持协助">2分:在步行时需要他人少量扶持协助</el-radio>
                                <el-radio label="1分:在步行时需要他人大量扶持协助">1分:在步行时需要他人大量扶持协助</el-radio>
                                <el-radio label="0分:完全不能步行">0分:完全不能步行</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.2.4 上下楼梯 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.2.4 上下楼梯:双脚交替完成楼梯台阶连续的上下移动:
                            </div>
                            <el-radio-group v-model="formData.b2_4">
                                <el-radio label="3分:可独立上下楼梯(连续上下 10个 ~15个台阶),不需要协助">3分:可独立上下楼梯(连续上下 10个
                                    ~15个台阶),不需要协助</el-radio>
                                <el-radio label="2分:在他人指导或提示下完成">2分:在他人指导或提示下完成</el-radio>
                                <el-radio label="1分:需要他人协助,但以自身完成为主">1分:需要他人协助,但以自身完成为主</el-radio>
                                <el-radio
                                    label="0分:主要依靠他人协助,自身能给予配合;或者完全依赖他人协助,且不能给予配合">0分:主要依靠他人协助,自身能给予配合;或者完全依赖他人协助,且不能给予配合</el-radio>
                            </el-radio-group>
                        </div>
                    </div>

                    <!-- B.3 精神状态评估表 -->
                    <div class="form-section">
                        <div class="section-title">B.3 精神状态评估表</div>

                        <!-- B.3.1 时间定向 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.1 时间定向:知道并确认时间的能力:</div>
                            <el-radio-group v-model="formData.b3_1">
                                <el-radio
                                    label="4分:时间观念(年、月、日、时)清楚,日期(或星期几)可相差一天">4分:时间观念(年、月、日、时)清楚,日期(或星期几)可相差一天</el-radio>
                                <el-radio
                                    label="3分:时间观念有些下降,(年、月、日、时)不能全部分清(相差两天或以上)">3分:时间观念有些下降,(年、月、日、时)不能全部分清(相差两天或以上)</el-radio>
                                <el-radio
                                    label="2分:时间观念较差,(年、月、日、时)不清楚,可知上半年或下半年或季节">2分:时间观念较差,(年、月、日、时)不清楚,可知上半年或下半年或季节</el-radio>
                                <el-radio
                                    label="1分:时间观念很差,(年、月、日、时)不清楚,可知上午、下午或白天、夜间">1分:时间观念很差,(年、月、日、时)不清楚,可知上午、下午或白天、夜间</el-radio>
                                <el-radio label="0分:无时间观念">0分:无时间观念</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.2 空间定向 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.2 空间定向:知道并确认空间的能力:</div>
                            <el-radio-group v-model="formData.b3_2">
                                <el-radio
                                    label="4分:能在日常生活范围内单独外出,如在日常居住小区内独自外出购物等">4分:能在日常生活范围内单独外出,如在日常居住小区内独自外出购物等</el-radio>
                                <el-radio
                                    label="3分:不能单独外出,但能准确知道自己日常生活所在地的地址信息">3分:不能单独外出,但能准确知道自己日常生活所在地的地址信息</el-radio>
                                <el-radio label="2分:不能单独外出,但知道较多有关自己日常生活的地址信息">2分:不能单独外出,但知道较多有关自己日常生活的地址信息</el-radio>
                                <el-radio
                                    label="1分:不能单独外出,但知道较少自己居住或生活所在地的地址信息">1分:不能单独外出,但知道较少自己居住或生活所在地的地址信息</el-radio>
                                <el-radio label="0分:不能单独外出,无空间观念">0分:不能单独外出,无空间观念</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.3 人物定向 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.3 人物定向:知道并确认人物的能力:</div>
                            <el-radio-group v-model="formData.b3_3">
                                <el-radio label="4分:认识长期共同一起生活的人,能称呼并知道关系">4分:认识长期共同一起生活的人,能称呼并知道关系</el-radio>
                                <el-radio label="3分:能认识大部分共同生活居住的人,能称呼或知道关系">3分:能认识大部分共同生活居住的人,能称呼或知道关系</el-radio>
                                <el-radio
                                    label="2分:能认识部分日常同住的亲人或照护者等,能称呼或知道关系等">2分:能认识部分日常同住的亲人或照护者等,能称呼或知道关系等</el-radio>
                                <el-radio label="1分:只认识自己或极少数日常同住的亲人或照护者等">1分:只认识自己或极少数日常同住的亲人或照护者等</el-radio>
                                <el-radio label="0分:不认识任何人(包括自己)">0分:不认识任何人(包括自己)</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.4 记忆 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.4 记忆:短时、近期和远期记忆能力:</div>
                            <el-radio-group v-model="formData.b3_4">
                                <el-radio label="4分:总是能保持与社会、年龄所适应的记忆能力,能完整的回忆">4分:总是能保持与社会、年龄所适应的记忆能力,能完整的回忆</el-radio>
                                <el-radio
                                    label="3分:出现轻度的记忆紊乱或回忆不能(不能回忆即时信息,3个词语经过 5分钟后仅能回忆 0个 ~1个)">3分:出现轻度的记忆紊乱或回忆不能(不能回忆即时信息,3个词语经过
                                    5分钟后仅能回忆 0个 ~1个)</el-radio>
                                <el-radio
                                    label="2分:出现中度的记忆紊乱或回忆不能(不能回忆近期记忆,不记得上一顿饭吃了什么)">2分:出现中度的记忆紊乱或回忆不能(不能回忆近期记忆,不记得上一顿饭吃了什么)</el-radio>
                                <el-radio
                                    label="1分:出现重度的记忆紊乱或回忆不能(不能回忆远期记忆,不记得自己老朋友)">1分:出现重度的记忆紊乱或回忆不能(不能回忆远期记忆,不记得自己老朋友)</el-radio>
                                <el-radio label="0分:记忆完全紊乱或者完全不能对既往事物进行正确的回忆">0分:记忆完全紊乱或者完全不能对既往事物进行正确的回忆</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.5 理解能力 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.5
                                理解能力:理解语言信息和非语言信息的能力(可借助平时使用助听设备等),即理解别人的话:</div>
                            <el-radio-group v-model="formData.b3_5">
                                <el-radio label="4分:能正常理解他人的话">4分:能正常理解他人的话</el-radio>
                                <el-radio label="3分:能理解他人的话,但需要增加时间">3分:能理解他人的话,但需要增加时间</el-radio>
                                <el-radio label="2分:理解有困难,需频繁重复或简化口头表达">2分:理解有困难,需频繁重复或简化口头表达</el-radio>
                                <el-radio label="1分:理解有严重困难,需要大量他人帮助">1分:理解有严重困难,需要大量他人帮助</el-radio>
                                <el-radio label="0分:完全不能理解他人的话">0分:完全不能理解他人的话</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.6 表达能力 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.6
                                表达能力:表达信息能力,包括口头的和非口头的,即表达自己的想法:</div>
                            <el-radio-group v-model="formData.b3_6">
                                <el-radio label="4分:能正常表达自己的想法">4分:能正常表达自己的想法</el-radio>
                                <el-radio label="3分:能表达自己的需要,但需要增加时间">3分:能表达自己的需要,但需要增加时间</el-radio>
                                <el-radio label="2分:表达需要有困难,需频繁重复或简化口头表达">2分:表达需要有困难,需频繁重复或简化口头表达</el-radio>
                                <el-radio label="1分:表达有严重困难,需要大量他人帮助">1分:表达有严重困难,需要大量他人帮助</el-radio>
                                <el-radio label="0分:完全不能表达需要">0分:完全不能表达需要</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.7 攻击行为 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.7
                                攻击行为:身体攻击行为(如打/踢/推/咬/抓/摔东西)和语言攻击行为(如骂人、语言威胁、尖叫)注:长期的行为状态:
                            </div>
                            <el-radio-group v-model="formData.b3_7">
                                <el-radio label="1分:未出现">1分:未出现</el-radio>
                                <el-radio label="0分:近一个月内出现过攻击行为">0分:近一个月内出现过攻击行为</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.8 抑郁症状 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.8
                                抑郁症状:存在情绪低落、兴趣减退、活力减退等症状,甚至出现妄想、幻觉、自杀念头或自杀行为（注:长期的负性情绪）:
                            </div>
                            <el-radio-group v-model="formData.b3_8">
                                <el-radio label="1分:未出现">1分:未出现</el-radio>
                                <el-radio label="0分:近一个月内出现过负性情绪">0分:近一个月内出现过负性情绪</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.3.9 意识水平 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.3.9
                                意识水平:机体对自身和周围环境的刺激做出应答反应的能力程度,包括清醒和持续的觉醒状态（注:处于昏迷状态者,直接评定为重度失能）:</div>
                            <el-radio-group v-model="formData.b3_9">
                                <el-radio label="2分:神志清醒,对周围环境能做出正确反应">2分:神志清醒,对周围环境能做出正确反应</el-radio>
                                <el-radio
                                    label="1分:嗜睡,表现为睡眠状态过度延长。当呼唤或推动老年人的肢体时可唤醒,并能进行正确的交谈或执行 指令,停止刺激后又继续入睡;意识模糊,对外界刺激不能清晰的认识,空间和时间定向力障碍,理解力迟钝,记忆力模糊和不连贯">1分:嗜睡,表现为睡眠状态过度延长。当呼唤或推动老年人的肢体时可唤醒,并能进行正确的交谈或执行
                                    指令,停止刺激后又继续入睡;意识模糊,对外界刺激不能清晰的认识,空间和时间定向力障碍,理解力迟钝,记忆力模糊和不连贯</el-radio>
                                <el-radio
                                    label="0分:昏睡,一般的外界刺激不能使其觉醒,给予较强烈的刺激时可有短时的意识清醒,醒后可简短回答提问,当刺激减弱后又很快进入睡眠状态;或者昏迷:意识丧失,随意运动丧失,对一般刺激全无反应">0分:昏睡,一般的外界刺激不能使其觉醒,给予较强烈的刺激时可有短时的意识清醒,醒后可简短回答提问,当刺激减弱后又很快进入睡眠状态;或者昏迷:意识丧失,随意运动丧失,对一般刺激全无反应</el-radio>
                            </el-radio-group>
                        </div>
                    </div>

                    <!-- B.4 感知觉与社会参与评估表 -->
                    <div class="form-section">
                        <div class="section-title">B.4 感知觉与社会参与评估表</div>

                        <!-- B.4.1 视力 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.4.1
                                视力:感受存在的光线并感受物体的大小、形状的能力。在个体的最好矫正视力下进行评估:</div>
                            <el-radio-group v-model="formData.b4_1">
                                <el-radio label="2分:视力正常">2分:视力正常</el-radio>
                                <el-radio
                                    label="1分:能看清楚大字、颜色和看书报上关闭的标准字体;视力有限,看不清报纸大标题,但能辨认物体">1分:能看清楚大字、颜色和看书报上关闭的标准字体;视力有限,看不清报纸大标题,但能辨认物体</el-radio>
                                <el-radio label="0分:只能看到亮光/颜色和形状完全失明">0分:只能看到亮光/颜色和形状完全失明</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.4.2 听力 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.4.2
                                听力:能辨别声音的方位、音调、音量和音质的有关能力(可借助平时使用助听设备等):</div>
                            <el-radio-group v-model="formData.b4_2">
                                <el-radio label="2分:听力正常">2分:听力正常</el-radio>
                                <el-radio label="1分:在近距离说话或说话距离超过 2米时听不清,正常交流有些困难,需在安静的环境或大声说话才能听到">1分:在近距离说话或说话距离超过
                                    2米时听不清,正常交流有些困难,需在安静的环境或大声说话才能听到</el-radio>
                                <el-radio label="0分:讲话者大声说话或说话很慢,才能部分听见;完全失聪">0分:讲话者大声说话或说话很慢,才能部分听见;完全失聪</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.4.3 执行日常事务 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.4.3
                                执行日常事务:计划、安排并完成日常事务,包括但不限于洗衣服、小金额购物、服药管理:</div>
                            <el-radio-group v-model="formData.b4_3">
                                <el-radio label="4分:能完全独立计划、安排和完成日常事务,无需协助">4分:能完全独立计划、安排和完成日常事务,无需协助</el-radio>
                                <el-radio label="3分:在计划、安排和完成日常事务时需要他人监护或指导">3分:在计划、安排和完成日常事务时需要他人监护或指导</el-radio>
                                <el-radio label="2分:在计划、安排和完成日常事务时需要少量协助">2分:在计划、安排和完成日常事务时需要少量协助</el-radio>
                                <el-radio label="1分:在计划、安排和完成日常事务时需要大量协助">1分:在计划、安排和完成日常事务时需要大量协助</el-radio>
                                <el-radio label="0分:完全依赖他人进行日常事务">0分:完全依赖他人进行日常事务</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.4.4 使用交通工具外出 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.4.4 使用交通工具外出:</div>
                            <el-radio-group v-model="formData.b4_4">
                                <el-radio label="3分:能自己骑车或搭乘公共交通工具外出">3分:能自己骑车或搭乘公共交通工具外出</el-radio>
                                <el-radio label="2分:能自己搭乘或租车,但不搭乘其他公共交通工具外出">2分:能自己搭乘或租车,但不搭乘其他公共交通工具外出</el-radio>
                                <el-radio label="1分:需有人协助搭乘出租车或私家车外出">1分:需有人协助搭乘出租车或私家车外出</el-radio>
                                <el-radio
                                    label="0分:只能在他人协助下搭乘出租车或私家车外出;完全不能出门,或者外出完全需要协助">0分:只能在他人协助下搭乘出租车或私家车外出;完全不能出门,或者外出完全需要协助</el-radio>
                            </el-radio-group>
                        </div>

                        <!-- B.4.5 社会交往能力 -->
                        <div class="item-block">
                            <div class="item-label"><span style="color: red;">* </span>B.4.5 社会交往能力:</div>
                            <el-radio-group v-model="formData.b4_5">
                                <el-radio label="4分:参与社会,在社会环境有一定的适应能力,待人接物恰当">4分:参与社会,在社会环境有一定的适应能力,待人接物恰当</el-radio>
                                <el-radio
                                    label="3分:能适应单纯环境,主动接触他人,初见面时难让人发现智力问题,不能理解隐喻语">3分:能适应单纯环境,主动接触他人,初见面时难让人发现智力问题,不能理解隐喻语</el-radio>
                                <el-radio
                                    label="2分:脱离社会,可被动接触,不会主动待人,谈话中很多不适词句,容易上当受骗">2分:脱离社会,可被动接触,不会主动待人,谈话中很多不适词句,容易上当受骗</el-radio>
                                <el-radio label="1分:勉强可与他人接触,谈吐内容不清楚,表情不恰当">1分:勉强可与他人接触,谈吐内容不清楚,表情不恰当</el-radio>
                                <el-radio label="0分:不能与人交往">0分:不能与人交往</el-radio>
                            </el-radio-group>
                        </div>
                    </div>

                    <!-- 底部提交按钮 -->
                    <div class="submit-box">
                        <el-button type="primary" icon="el-icon-check" @click="submit4">提交</el-button>
                    </div>
                </el-form>
            </div>


            <!-- 评估结果 -->
            <div v-else-if="activeTab === 'result'" class="scroll-wrap">
                <el-form ref="baseForm" :model="form" label-width="240px" label-position="left">
                    <!-- 顶部等级说明卡片组 -->
                    <div class="level-card-group">
                        <div class="level-card">
                            <div class="card-title">0 能力完好</div>
                            <div class="card-desc">总分90</div>
                        </div>
                        <div class="level-card">
                            <div class="card-title">1 能力轻度受损(轻度失能)</div>
                            <div class="card-desc">总分66~89</div>
                        </div>
                        <div class="level-card">
                            <div class="card-title">2 能力中度受损(中度失能)</div>
                            <div class="card-desc">总分46~65</div>
                        </div>
                        <div class="level-card">
                            <div class="card-title">3 能力重度受损(重度失能)</div>
                            <div class="card-desc">总分30~45</div>
                        </div>
                    </div>
                    <div class="level-card full-card">
                        <div class="card-title">4 能力完全丧失(完全失能)</div>
                        <div class="card-desc">总分0~29</div>
                    </div>

                    <!-- 基础信息行 -->
                    <el-row class="info-row" gutter="20">
                        <el-col span="8">
                            <div class="info-item">
                                <span class="label">老人姓名:</span>
                                <text>{{ form.elderName }}</text>
                            </div>
                        </el-col>
                        <el-col span="8">
                            <div class="info-item">
                                <span class="label">身份证号:</span>
                                <text>{{ form.elderName }}</text>
                            </div>
                        </el-col>
                        <el-col span="8">
                            <div class="info-item">
                                <span class="label">所选标准:</span>
                                <text>{{ form.elderName }}</text>
                            </div>
                        </el-col>
                    </el-row>

                    <!-- C.1 一级指标分级 -->
                    <div class="form-item">
                        <span class="item-title">C.1 一级指标分级:</span>
                        <span class="text-content">
                            C.1.1 自理能力指标和评分: 18分 &nbsp;
                            C.1.2 基础运动能力指标和评分: 8分 &nbsp;
                            C.1.3 精神状态评分和指标: 12分 &nbsp;
                            C.1.4 感知觉与社会参与指标与评分: 14分
                        </span>
                    </div>

                    <!-- C.2 初步等级得分 -->
                    <div class="form-item">
                        <span class="item-title">C.2 初步等级得分:</span>
                        <text>{{ form.elderName }}</text>
                    </div>

                    <!-- C.3 初步等级单选框 -->
                    <div class="form-item">
                        <div class="item-title">C.3 老年人能力初步等级:</div>
                        <el-checkbox-group v-model="formData.initLevel">
                            <el-checkbox label="能力完好">能力完好</el-checkbox>
                            <el-checkbox label="能力轻度受损(轻度失能)">能力轻度受损(轻度失能)</el-checkbox>
                            <el-checkbox label="能力中度受损(中度失能)">能力中度受损(中度失能)</el-checkbox>
                            <el-checkbox label="能力重度受损(重度失能)">能力重度受损(重度失能)</el-checkbox>
                            <el-checkbox label="能力完全丧失(完全失能)">能力完全丧失(完全失能)</el-checkbox>
                        </el-checkbox-group>
                    </div>

                    <!-- C.4 等级变更依据 -->
                    <div class="form-item">
                        <div class="item-title">C.4 能力等级变更依据:</div>
                        <div class="desc-text">
                            依据附录A中表A.5的A.5.11"昏迷"、表A.4的A.4.1"疾病诊断"和表A.2的A.2.14 "近30天内照护风险事件"确定是否存在以下导致能力等级变更的项目:
                        </div>
                        <el-checkbox-group v-model="formData.changeBasis">
                            <el-checkbox label="处于昏迷状态者，直接评定为能力完全丧失(完全失能)">处于昏迷状态者，直接评定为能力完全丧失(完全失能)</el-checkbox>
                            <el-checkbox
                                label="确诊为痴呆(F00~F03)、精神科专科医生诊 断的其他精神和行为障碍疾病(F04~F99)，在原有能力级别上应提高一个级别">确诊为痴呆(F00~F03)、精神科专科医生诊
                                断的其他精神和行为障碍疾病(F04~F99)，在原有能力级别上应提高一个级别</el-checkbox>
                            <el-checkbox
                                label="近30天内发生过2次及以上照护风险事件(如跌倒、噎食、自杀、自伤、走失等)，在原有能力级别上提高一个等级">近30天内发生过2次及以上照护风险事件(如跌倒、噎食、自杀、自伤、走失等)，在原有能力级别上提高一个等级</el-checkbox>
                        </el-checkbox-group>
                    </div>

                    <!-- C.5 最终等级 -->
                    <div class="form-item">
                        <div class="item-title">C.5 老年人能力最终等级:</div>
                        <div class="desc-text">
                            综合C3 "老年人能力初步等级"和C.4"能力等级变更依据"的结果,判定老年人能力最终等级:
                        </div>
                        <el-checkbox-group v-model="formData.finalLevel">
                            <el-checkbox label="能力完好">能力完好</el-checkbox>
                            <el-checkbox label="能力轻度受损(轻度失能)">能力轻度受损(轻度失能)</el-checkbox>
                            <el-checkbox label="能力中度受损(中度失能)">能力中度受损(中度失能)</el-checkbox>
                            <el-checkbox label="能力重度受损(重度失能)">能力重度受损(重度失能)</el-checkbox>
                            <el-checkbox label="能力完全丧失(完全失能)">能力完全丧失(完全失能)</el-checkbox>
                        </el-checkbox-group>
                    </div>
                </el-form>
            </div>

        </div>


    </div>
</template>

<script>
export default {
    data() {
        return {
            checkId: '',
            activeTab: "base",
            page1: false, // 第一页是否提交
            page2: false, // 第二页是否提交
            page3: false, // 第三页是否提交
            page4: false, // 第四页是否提交
            liveStateArray: [], // 居住情况（多选）
            economicSourcesArray: [], // 经济来源（多选）
            medicalTypeArray: [], // 医疗费用支付方式（多选）
            //病症
            diseaseCodeList: [],
            // 编码-名称映射
            diseaseMap: {
                1: "高血压病I10~I15",
                2: "冠心病I25",
                3: "糖尿病E10~E14",
                4: "肺炎J12~J18",
                5: "慢性阻塞性肺疾病J44",
                6: "脑出血I60~I62",
                7: "脑梗塞I63",
                8: "尿路感染(30天内)",
                9: "帕金森综合征G20~G22",
                10: "慢性肾衰竭N18~N19",
                11: "肝硬化K74",
                12: "消化性溃疡K20~K31",
                13: "肿瘤C00~D48",
                14: "截肢(6个月内)",
                15: "骨折(3个月内)M84",
                16: "癫痫G40",
                17: "甲状腺功能减退症E01~E03",
                18: "白内障H25~H26",
                19: "青光眼H40~H42",
                20: "骨质疏松症 M80~82",
                21: "痴呆F00~F03",
                22: "其他精神和行为障碍F04~F99"
            },
            healthThreeArray: [],//伤口情况(可多选)
            healthFourArray: [], // 特殊护理情况(可多选)
            healthFiveArray: [],//疼痛感
            healthSixArray: [],//牙齿缺失情况(可多选)
            healthSevenArray: [],//义齿佩戴情况(可多选)
            healthEightArray: [],//吞咽困难的情形和症状(可多选)
            form: {
                assessCode: "",
                assessDate: "",
                assessReason: "",
                elderName: "",
                sex: '',
                birthday: '',
                height: '',
                weight: '',
                nation: "",
                religionType: "",
                idCard: "",
                degreeEducation: "",
                liveState: "",
                marryState: "",
                medicalType: "",
                economicSources: "",
                accidentOne: "",
                accidentTwo: "",
                accidentThree: "",
                accidentFour: "",
                accidentFive: "",
                provideName: '',
                provideRelation: '',
                provideMan: '',
                provideTel: '',
                majorDiseases: "",
                majorDiseasesName: "",
                majorDiseasesOther: "",
                healthOne: '',
                healthTwo: '',
                healthThree: '',
                healthFour: '',
                healthFive: '',
                healthSix: '',
                healthSixThree: '',
                healthSixFour: '',
                healthSeven: '',
                healthEight: '',
                healthNine: '',
                healthTen: '',
                healthEleven: '',
                healthOther: ''
            },
            medicineList: [
                { medicineName: "", takeMethod: "", dosage: "", frequency: "" }
            ],
            formData: {
                // A5.1 默认 IV期
                pressureInjury: "IV期:全层皮肤、组织缺失，可见肌腱、肌肉、腱膜，以及边缘内卷，伴随隧道、潜行",
                // A5.2 默认无法判断
                jointMove: "无法判断",
                // A5.3 多选 默认无
                woundList: ["无"],
                // A5.4 默认无
                nurseList: ["无"],
                // A5.5 默认无疼痛
                painList: ["无疼痛"],
                // A5.6 无缺损 + 牙体缺损
                toothList: ["无缺损", "牙体缺损(如龋齿、楔状缺损)"],
                // A5.7 无义齿
                dentureList: ["无义齿"],
                // A5.8 两项勾选
                swallowList: ["抱怨吞咽困难或吞咽时会疼痛", "当喝或吃流质或固体的食物时，食物会从嘴角边流失"],
                // A5.9 有
                malnutrition: "有",
                // A5.10 有
                respiratory: "有",
                // A5.11 有
                coma: "有",
                // 其他补充文本
                otherDesc: ""
            }
        }
    },
    created() {
        // 获取传递过来的id
        const elderId = this.$route.query.id
        console.log("接收的老人ID：", elderId)
        this.checkId = elderId
        this.showData()
    },
    methods: {
        showData() {
            this.$http.post("insElderCheckInfo/getCheckInAssessment", { id: this.checkId }).then((res) => {
                if (200 == res.data.code) {
                    console.log("回显数据", JSON.stringify(res))
                }
            })
        },

        closePage() {
            this.$router.back()
        },
        tabBeforeLeave(newTabName, oldTabName) {
            if (newTabName === "disease") {
                if (!this.page1) {
                    this.$message.warning("请先完善基本信息");
                    return false;
                }
            }
            if (newTabName === "health") {
                if (!this.page2) {
                    this.$message.warning("请先完善疾病诊断和用药情况");
                    return false;
                }
            }
            if (newTabName === "ability") {
                if (!this.page3) {
                    this.$message.warning("请先完善相关问题");
                    return false;
                }
            }
            if (newTabName === "result") {
                if (!this.page4) {
                    this.$message.warning("请先完善能力评估");
                    return false;
                }
            }
            return true;
        },
        // 新增药品行
        addMedicineRow() {
            this.medicineList.push({
                medicineName: "",
                takeMethod: "",
                dosage: "",
                frequency: ""
            });
        },
        // 删除药品行
        delMedicineRow(index) {
            this.medicineList.splice(index, 1);
        },
        //基本信息登记 提交
        submit1() {
            this.form.liveState = this.liveStateArray.join(',')
            this.form.economicSources = this.economicSourcesArray.join(',')
            this.form.medicalType = this.medicalTypeArray.join(',')
            if (!this.form.elderName) {
                this.$message.warning("请输入姓名");
                return
            }
            this.activeTab = 'disease'
            this.page1 = true
        },
        //疾病诊断和用药情况 提交
        submit2() {
            console.log("选择的疾病：", this.diseaseCodeList)
            this.form.majorDiseases = this.diseaseCodeList.join(',')

            var diseaseNameList = this.diseaseCodeList.map(code => this.diseaseMap[code])
            this.form.majorDiseasesName = diseaseNameList.join(',')
            console.log("选择的疾病", this.form)

            this.activeTab = 'health'
            this.page2 = true
        },
        //健康相关问题 提交
        submit3() {
            this.form.healthThree = this.healthThreeArray.join(',')
            this.form.healthFour = this.healthFourArray.join(',')
            this.form.healthFive = this.healthFiveArray.join(',')
            this.form.healthSix = this.healthSixArray.join(',')
            this.form.healthSeven = this.healthSevenArray.join(',')
            this.form.healthEight = this.healthEightArray.join(',')

            this.activeTab = 'ability'
            this.page3 = true
        },
        // 用户能力评估 提交
        submit4() {
            console.log(this.form)
            this.form.checkId = this.checkId
            this.$http.post("insElderCheckInfo/saveCheckInAssessment", this.form).then((res) => {
                if (200 == res.data.code) {
                    this.$notify.success({
                        title: "提示",
                        message: "保存成功",
                        showClose: true,
                    });

                    this.activeTab = 'result'
                    this.page4 = true
                    this.closePage()
                } else {
                    this.$notify.info({
                        title: "提示",
                        message: res.data.message,
                        showClose: true,
                    });
                }
            })
        },
    }
}
</script>

<style scoped lang="scss">
.page-card {
    margin: 10px;
    background: #fff;
    border-radius: 12px;
    box-shadow: 0 2px 12px rgba(0, 0, 0, 0.06);
    height: 100%;
    display: flex;
    flex-direction: column;
    overflow: hidden;
}

.nav-bar {
    width: 100%;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}

.close-btn {
    margin-right: 10px;
    margin-top: 5px;
}

.scroll-wrap {
    width: 100%;
    height: 100%;
    padding: 20px;
    box-sizing: border-box;
    overflow-y: auto;
}


.form-block {
    margin-bottom: 40px;
}

.block-title {
    font-size: 18px;
    font-weight: 600;
    margin: 0 0 24px 0;
}

.sub-title {
    font-size: 17px;
    font-weight: bold;
    margin: 12px 20px 8px;
    color: #616266;
}

.disease-checkbox-group {
    margin-left: 20px;

    .checkbox-row {
        margin-bottom: 10px;
        display: flex;
        flex-wrap: wrap;
    }

    .el-checkbox {
        min-width: 180px;
    }
}

// 姓名搜索输入行
.input-search-row {
    display: flex;
    width: 100%;

    .el-input {
        flex: 1;
    }

    .el-button {
        border-left: none;
    }
}

// 底部提交居中
.submit-box {
    text-align: center;
    margin-top: 60px;
    padding-bottom: 30px;
}

:deep .el-form-item__label {
    text-align: left !important;
}


// 底部提交按钮
.submit-box {
    text-align: center;
    margin-top: 60px;
    padding-bottom: 40px;
}

.empty {
    color: #999;
}



.medicine-table {
    width: 100%;

    :deep(.op-header .cell) {
        text-align: center !important;
        padding: 0 !important;
    }

    :deep(.header-add-box) {
        padding: 8px 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    /* 强制圆形按钮兜底，解决被挤压变椭圆 */
    :deep(.el-button.is-circle) {
        width: 36px !important;
        height: 36px !important;
        border-radius: 50% !important;
        padding: 0 !important;
    }

    // :deep(.el-button--primary.is-circle:hover) {
    //     background-color: #409EFF !important;
    //     border-color: #409EFF !important;
    // }

    /* 单元格容器铺满整格 */
    :deep(tbody td.cell-op-box) {
        position: relative;
        width: 100%;
        height: 100%;
        min-height: 44px;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    :deep(.row-index) {
        font-size: 16px;
        color: #333;
        transition: all 0.2s ease;
        text-align: center;
        display: flex;
        justify-content: center;
        z-index: 1;
    }

    :deep(.red-del-circle) {
        width: 36px;
        height: 36px;
        border-radius: 50%;
        background-color: #F56C6C;
        display: flex;
        align-items: center;
        justify-content: center;
        cursor: pointer;
        position: absolute;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
        opacity: 0;
        visibility: hidden;
        transition: all 0.2s ease;
        z-index: 99;
    }

    :deep(.red-del-circle .el-icon-delete) {
        color: #fff;
        font-size: 18px;
    }

    :deep(tbody tr:hover .row-index) {
        opacity: 0 !important;
        visibility: hidden !important;
    }

    :deep(tbody tr:hover .red-del-circle) {
        opacity: 1 !important;
        visibility: visible !important;
    }

    :deep(.el-input) {
        width: 96%;
    }
}


.form-title {
    font-size: 17px;
    font-weight: bold;
    color: #616266;
    margin: 12px 20px 8px;
}

.health-six-child {
    display: flex;
}

.el-checkbox-group {
    display: flex;
    flex-wrap: wrap;
    gap: 16px;

    .el-checkbox {
        margin-bottom: 8px;
    }
}

.el-input {
    width: 100%;
    max-width: 100%;
}





.section-title {
    font-size: 17px;
    font-weight: 600;
    color: #303133;
    margin-bottom: 16px;
    padding-bottom: 6px;
    margin-top: 15px;
}

.item-block {
    margin-bottom: 18px;
}

.item-label {
    font-size: 16px;
    color: #616266;
    margin-left: 20px;
    font-weight: bold;
    margin-bottom: 20px;
    margin-top: 20px;
    line-height: 1.5;
}

/* 横向单选间距 */
:deep(.radio-horizontal .el-radio) {
    display: flex;
    flex-direction: row;
    margin-left: 23px;
    gap: 8px;
}

.el-radio-group {
    display: flex;
    margin-left: 23px;
    margin-top: 10px;
    flex-direction: column;
    gap: 8px;
}

.el-radio {
    line-height: 1.6;
    font-size: 17px;
    color: #616266;
    text-wrap: wrap;
}

.submit-wrap {
    margin-top: 40px;
    text-align: center;
}

.level-card-group {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    gap: 12px;
    margin-bottom: 12px;
}

.level-card {
    border: 1px solid #e4e7ed;
    border-radius: 4px;
    padding: 16px 12px;
}

.full-card {
    grid-column: 1 / -1;
    margin-bottom: 24px;
}

.card-title {
    font-size: 15px;
    font-weight: 500;
    margin-bottom: 8px;
}

.card-desc {
    font-size: 14px;
    color: #666;
}

/* 基础信息行 */
.info-row {
    margin-bottom: 20px;
}

.info-item {
    display: flex;
    align-items: center;
    gap: 8px;
}

.label {
    white-space: nowrap;
    font-size: 14px;
}

/* 表单项通用 */
.form-item {
    margin-bottom: 20px;
}

.item-title {
    font-size: 15px;
    font-weight: 500;
    display: inline-block;
    margin-right: 8px;
}

.text-content {
    font-size: 14px;
}

.desc-text {
    font-size: 14px;
    color: #444;
    margin: 8px 0 10px;
    line-height: 1.6;
}

.el-checkbox-group {
    display: flex;
    flex-direction: column;
    gap: 10px;
}
</style>