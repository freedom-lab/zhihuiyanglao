<template>
  <div class="base-info-page">
    <h3 class="page-title">基础信息</h3>

    <!-- 基础信息表单区域 -->
    <el-row :gutter="16" class="form-row">
      <el-col :span="8">
        <div class="form-item">
          <label>客户姓名：</label>
          <el-input v-model="form.name" disabled placeholder="施中惠" />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>身份证号码：</label>
          <el-input v-model="form.idCard" disabled placeholder="310202192209083924" />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>性别：</label>
          <el-input v-model="form.gender" disabled placeholder="女" />
        </div>
      </el-col>

      <el-col :span="8">
        <div class="form-item">
          <label>联系手机号：</label>
          <el-input v-model="form.phone1" disabled placeholder="14076397908" />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>婚姻状况：</label>
          <el-input v-model="form.marriage" disabled />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>民族：</label>
          <el-input v-model="form.nation" disabled />
        </div>
      </el-col>

      <el-col :span="8">
        <div class="form-item">
          <label>联系手机号2：</label>
          <el-input v-model="form.phone2" disabled />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>联系手机号3：</label>
          <el-input v-model="form.phone3" disabled />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>出生日期：</label>
          <el-input v-model="form.birthday" disabled />
        </div>
      </el-col>

      <el-col :span="8">
        <div class="form-item radio-row">
          <label>生日类型：</label>
          <el-radio-group v-model="form.birthType" disabled>
            <el-radio label="公历"></el-radio>
            <el-radio label="农历"></el-radio>
          </el-radio-group>
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>年龄：</label>
          <el-input v-model="form.age" disabled placeholder="102" />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item radio-row">
          <label>是否本地户籍：</label>
          <el-radio-group v-model="form.localRegister" disabled>
            <el-radio label="是"></el-radio>
            <el-radio label="否"></el-radio>
          </el-radio-group>
        </div>
      </el-col>

      <el-col :span="8">
        <div class="form-item radio-row">
          <label>客户类别：</label>
          <el-radio-group v-model="form.customerType" disabled>
            <el-radio label="半自理"></el-radio>
            <el-radio label="自理"></el-radio>
          </el-radio-group>
        </div>
      </el-col>
      <el-col :span="16"></el-col>

      <el-col :span="24">
        <div class="form-item radio-row">
          <label>居住情况：</label>
          <el-radio-group v-model="form.liveType" disabled>
            <el-radio label="独自居住"></el-radio>
            <el-radio label="与配偶居住"></el-radio>
            <el-radio label="与子女合住"></el-radio>
            <el-radio label="其他"></el-radio>
            <el-radio label="与父母同住"></el-radio>
          </el-radio-group>
        </div>
      </el-col>

      <el-col :span="24">
        <div class="form-item">
          <label>家庭地址：</label>
          <el-input v-model="form.homeAddr" disabled />
        </div>
      </el-col>
      <el-col :span="24">
        <div class="form-item">
          <label>家庭详细地址：</label>
          <el-input v-model="form.homeDetailAddr" disabled />
        </div>
      </el-col>
      <el-col :span="24">
        <div class="form-item">
          <label>户籍地址：</label>
          <el-input v-model="form.registerAddr" disabled />
        </div>
      </el-col>

      <el-col :span="12">
        <div class="form-item">
          <label>政治面貌：</label>
          <el-input v-model="form.politics" disabled />
        </div>
      </el-col>
      <el-col :span="12">
        <div class="form-item">
          <label>助老卡号：</label>
          <el-input v-model="form.oldCard" disabled />
        </div>
      </el-col>
    </el-row>

    <!-- 家属信息 -->
    <div class="block-title">家属信息</div>
    <el-table :data="familyTable" border class="common-table">
      <el-table-column label="亲属姓名" prop="name" align="center"></el-table-column>
      <el-table-column label="紧急联系电话" prop="phone" align="center"></el-table-column>
      <el-table-column label="关系" prop="relation" align="center"></el-table-column>
      <el-table-column label="是否接收信息" prop="receiveMsg" align="center"></el-table-column>
      <template slot="empty">
        <div class="empty-wrap">
          <i class="el-icon-document empty-icon"></i>
          <p>暂无数据</p>
        </div>
      </template>
    </el-table>

    <!-- 餐饮信息 -->
    <div class="block-title">餐饮信息</div>
    <el-table :data="foodTable" border class="common-table">
      <el-table-column label="套餐" prop="packageName" align="center"></el-table-column>
      <el-table-column label="日收费用" prop="dayPrice" align="center"></el-table-column>
      <el-table-column label="月收费用" prop="monthPrice" align="center"></el-table-column>
      <template slot="empty">
        <div class="empty-wrap">
          <i class="el-icon-document empty-icon"></i>
          <p>暂无数据</p>
        </div>
      </template>
    </el-table>

    <!-- 服务需求 -->
    <div class="block-title">服务需求</div>
    <el-table :data="serviceTable" border class="common-table">
      <el-table-column label="项目名称" prop="projectName" align="center"></el-table-column>
      <template slot="empty">
        <div class="empty-wrap">
          <i class="el-icon-document empty-icon"></i>
          <p>暂无数据</p>
        </div>
      </template>
    </el-table>

    <!-- 床位信息 -->
    <div class="block-title">床位信息</div>
    <el-row :gutter="16" class="form-row">
      <el-col :span="8">
        <div class="form-item radio-row">
          <label>是否拼房：</label>
          <el-radio-group v-model="form.isShareBed" disabled>
            <el-radio label="是"></el-radio>
            <el-radio label="否"></el-radio>
          </el-radio-group>
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>床位号：</label>
          <el-input v-model="form.bedNo" disabled placeholder="床位号" />
        </div>
      </el-col>
      <el-col :span="8"></el-col>

      <el-col :span="8">
        <div class="form-item">
          <label>床位类型：</label>
          <el-input v-model="form.bedType" disabled />
        </div>
      </el-col>
      <el-col :span="8"></el-col>
      <el-col :span="8"></el-col>

      <el-col :span="8">
        <div class="form-item">
          <label>包房价格:元/天：</label>
          <el-input v-model="form.roomDayPrice" disabled />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>包房价格:元/月：</label>
          <el-input v-model="form.roomMonthPrice" disabled />
        </div>
      </el-col>
      <el-col :span="8"></el-col>

      <el-col :span="8">
        <div class="form-item">
          <label>拼房价格:元/天：</label>
          <el-input v-model="form.shareDayPrice" disabled />
        </div>
      </el-col>
      <el-col :span="8">
        <div class="form-item">
          <label>拼房价格:元/月：</label>
          <el-input v-model="form.shareMonthPrice" disabled />
        </div>
      </el-col>
      <el-col :span="8"></el-col>

      <el-col :span="24">
        <div class="form-item">
          <label>备注：</label>
          <el-input v-model="form.remark" disabled />
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        name: "施中惠",
        idCard: "310202192209083924",
        gender: "女",
        phone1: "14076397908",
        phone2: "",
        phone3: "",
        marriage: "",
        nation: "",
        birthday: "",
        birthType: "",
        age: "102",
        localRegister: "",
        customerType: "",
        liveType: "",
        homeAddr: "",
        homeDetailAddr: "",
        registerAddr: "",
        politics: "",
        oldCard: "",
        isShareBed: "",
        bedNo: "",
        bedType: "",
        roomDayPrice: "",
        roomMonthPrice: "",
        shareDayPrice: "",
        shareMonthPrice: "",
        remark: "",
      },
      familyTable: [],
      foodTable: [],
      serviceTable: [],
    };
  },
  created() {
    // const id = this.$route.params.id;
    // this.getBaseData(id);
  },
  methods: {
    // getBaseData(id) {}
  },
}
</script>

<style scoped lang="less">
.base-info-page {
  .page-title {
    font-size: 18px;
    color: #333;
    margin: 0 0 24px;
    font-weight: 500;
  }

  .form-row {
    margin-bottom: 32px;
  }

  .form-item {
    display: flex;
    align-items: center;
    margin-bottom: 16px;

    label {
      width: 110px;
      font-size: 14px;
      color: #333;
      flex-shrink: 0;
    }

    .el-input {
      flex: 1;
    }

    &.radio-row {
      align-items: center;

      .el-radio-group {
        display: flex;
      }

      :deep .el-radio {
        margin-right: 0 !important;
      }
    }
  }

  .block-title {
    font-size: 16px;
    color: #333;
    margin: 32px 0 16px;
    font-weight: 500;
  }

  .common-table {
    margin-bottom: 24px;

    .empty-wrap {
      padding: 60px 0;
      text-align: center;
      color: #999;

      .empty-icon {
        font-size: 48px;
        margin-bottom: 12px;
      }

      p {
        font-size: 14px;
      }
    }
  }

  :deep .common-table .el-table__header th {
    background-color: #f5f7fa !important;
  }
}
</style>