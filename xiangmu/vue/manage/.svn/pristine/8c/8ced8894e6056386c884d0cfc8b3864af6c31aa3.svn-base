<template>
  <div style="padding:16px">
    <!-- 头部部分 -->
    <div ref="search_d">
      <el-row type="flex" class="row-bg" justify="space-between" align="middle">
        <el-col :span="18">
          <el-button type="primary" @click="newBtn">新建</el-button>
        </el-col>
        <el-col :span="6">
          <div class="top-right-sort">
            <el-input placeholder="关键词搜索" v-model="queryInfo.condition.queryKey" class="input-with-select" clearable @keyup.enter="getList">
              <el-button slot="append" icon="el-icon-search" @click="getList"></el-button>
            </el-input>
          </div>
        </el-col>
      </el-row>
    </div>

    <!-- 表格部分 -->
    <div class="table-box" style="margin-top:10px">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center" show-overflow-tooltip></el-table-column>

        <el-table-column label="联系人" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultName || '-' }}</template>
        </el-table-column>

        <el-table-column label="预定日期" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.consultTime ? scope.row.consultTime.slice(0, 10) : '-' }}
          </template>
        </el-table-column>

        <el-table-column label="预定状态" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            <span v-if="scope.row.consultState === 1" style="color: #2e59fb;">● 预定中</span>
            <span v-else-if="scope.row.consultState === 2" style="color: #4ccc34;">● 预定成功</span>
            <span v-else-if="scope.row.consultState === -1" style="color: #e66;">● 预定取消</span>
            <span v-else>-</span>
          </template>
        </el-table-column>

        <el-table-column label="楼栋名称" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.floorName || '-' }}</template>
        </el-table-column>

        <el-table-column label="房间名称" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.roomName || '-' }}</template>
        </el-table-column>

        <el-table-column label="床位名称" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.bedName || '-' }}</template>
        </el-table-column>

        <el-table-column label="是否包房" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isRoom === 0 ? '是' : '否' }}</template>
        </el-table-column>

        <el-table-column label="预留开始时间" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.reserveStartTime ? scope.row.reserveStartTime.slice(0, 10) : '-' }}
          </template>
        </el-table-column>

        <el-table-column label="预留结束时间" width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.reserveEndTime ? scope.row.reserveEndTime.slice(0, 10) : '-' }}
          </template>
        </el-table-column>

        <el-table-column label="订金" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.appointmentFee || 0 }}</template>
        </el-table-column>

        <el-table-column label="联系电话" width="150" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
        </el-table-column>

        <el-table-column label="老人姓名" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.elderName || '-' }}</template>
        </el-table-column>

        <el-table-column label="身份证号" width="180" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.idCard || '-' }}</template>
        </el-table-column>

        <el-table-column label="性别" width="60" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.sex === 1 ? '男' : scope.row.sex === 2 ? '女' : '-' }}</template>
        </el-table-column>
        <el-table-column label="年龄" width="60" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.age || '-' }}</template>
        </el-table-column>
        <el-table-column label="家庭住址" width="150" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.homeAddress || '-' }}</template>
        </el-table-column>

        <el-table-column label="推荐人" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.refereeName || '-' }}</template>
        </el-table-column>

        <el-table-column label="咨询方式" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultMode || '-' }}</template>
        </el-table-column>
        <el-table-column label="咨询意向" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.consultIntention || '-' }}</template>
        </el-table-column>
        <el-table-column label="媒介渠道" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.mediaChannels || '-' }}</template>
        </el-table-column>
        <el-table-column label="最后回访内容" width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.lastVisitContent || '-' }}</template>
        </el-table-column>
        <el-table-column label="回访人" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitStaff || '-' }}</template>
        </el-table-column>
        <el-table-column label="回访时间" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.visitTime ? scope.row.visitTime.slice(0,10) : '-' }}
          </template>
        </el-table-column>
        <el-table-column label="回访次数" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.visitCount || 0 }}</template>
        </el-table-column>
        <el-table-column label="备注" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>

        <!-- 操作 -->
        <el-table-column label="操作" width="120" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除这条预定记录？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 10px;color: red;">删除</el-button>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>

      <!-- 分页 -->
      <div class="block" style="margin-top: 10px;">
        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
          :current-page="queryInfo.currPage" :page-sizes="[100, 200, 300, 400]" :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper" :total="total">
        </el-pagination>
      </div>
    </div>

    <!-- 新增/编辑抽屉 -->
    <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>{{ labelType == 'add' ? '新增预定咨询' : '编辑预定咨询' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">保存</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <!-- 联系人信息 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>联系人信息</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="联系人姓名" prop="consultName">
                  <el-input v-model="form.consultName" placeholder="请输入联系人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系日期" prop="consultTime">
                  <el-date-picker v-model="form.consultTime" type="date" placeholder="请选择联系日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系电话" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="请输入联系电话"></el-input>
                </el-form-item>
              </el-col>
            </el-row>

            <!-- 床位信息 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>预定床位信息</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="楼栋名称" prop="floorName">
                  <el-input v-model="form.floorName" placeholder="请输入楼栋名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="房间名称" prop="roomName">
                  <el-input v-model="form.roomName" placeholder="请输入房间名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="床位名称" prop="bedName">
                  <el-input v-model="form.bedName" placeholder="请输入床位名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="订金金额" prop="appointmentFee">
                  <el-input v-model.number="form.appointmentFee" placeholder="请输入订金金额"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预留开始时间" prop="reserveStartTime">
                  <el-date-picker v-model="form.reserveStartTime" type="date" placeholder="选择预留开始时间" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预留结束时间" prop="reserveEndTime">
                  <el-date-picker v-model="form.reserveEndTime" type="date" placeholder="选择预留结束时间" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否包房" prop="isRoom">
                  <el-select v-model="form.isRoom" placeholder="请选择是否包房" style="width:100%" clearable>
                    <el-option label="否" :value="1"></el-option>
                    <el-option label="是" :value="0"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预定状态" prop="consultState">
                  <el-select v-model="form.consultState" placeholder="请选择预定状态" style="width:100%" clearable>
                    <el-option label="预定中" :value="1"></el-option>
                    <el-option label="预定成功" :value="2"></el-option>
                    <el-option label="预定取消" :value="-1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
            </el-row>

            <!-- 老人信息 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>老人基础信息</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="老人姓名" prop="elderName">
                  <el-input v-model="form.elderName" placeholder="请输入老人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="身份证号" prop="idCard">
                  <el-input v-model="form.idCard" placeholder="请输入身份证号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="性别" prop="sex">
                  <el-select v-model="form.sex" placeholder="请选择性别" style="width:100%" clearable>
                    <el-option label="男" :value="1"></el-option>
                    <el-option label="女" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="年龄" prop="age">
                  <el-input v-model.number="form.age" placeholder="请输入年龄"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="家庭住址" prop="homeAddress">
                  <el-input v-model="form.homeAddress" placeholder="请输入家庭住址"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="出生日期" prop="birthday">
                  <el-date-picker v-model="form.birthday" type="date" placeholder="请选择出生日期" style="width:100%" clearable></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="能力等级" prop="abilityLevel">
                  <el-select v-model="form.abilityLevel" placeholder="请选择能力等级" style="width:100%" clearable>
                    <el-option label="自理" value="自理"></el-option>
                    <el-option label="半失能" value="半失能"></el-option>
                    <el-option label="失能" value="失能"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="社保卡号" prop="socialCardNo">
                  <el-input v-model="form.socialCardNo" placeholder="请输入社保卡号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="预约状态" prop="appointmentState">
                  <el-select v-model="form.appointmentState" placeholder="请选择预约状态" style="width:100%" clearable>
                    <el-option label="待预约" :value="1"></el-option>
                    <el-option label="已预约" :value="2"></el-option>
                    <el-option label="已取消" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
            </el-row>

            <!-- 咨询情况 -->
            <div class="dialog-title">
              <span class="line">▎</span>
              <span>咨询详情</span>
            </div>
            <el-row :gutter="10">
              <el-col :span="12">
                <el-form-item label="咨询方式" prop="consultMode">
                  <el-select v-model="form.consultMode" placeholder="请选择咨询方式" style="width:100%" clearable>
                    <el-option label="线上" value="线上"></el-option>
                    <el-option label="到店" value="到店"></el-option>
                    <el-option label="上门" value="上门"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="咨询意向" prop="consultIntention">
                  <el-select v-model="form.consultIntention" placeholder="请选择咨询意向" style="width:100%" clearable>
                    <el-option label="短期试住" value="短期试住"></el-option>
                    <el-option label="长期入住" value="长期入住"></el-option>
                    <el-option label="仅咨询了解" value="仅咨询了解"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="咨询次数" prop="consultNum">
                  <el-input v-model.number="form.consultNum" placeholder="请输入咨询次数"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="媒介渠道" prop="mediaChannels">
                  <el-select v-model="form.mediaChannels" placeholder="请选择媒介渠道" style="width:100%" clearable>
                    <el-option label="短视频" value="短视频"></el-option>
                    <el-option label="社区推广" value="社区推广"></el-option>
                    <el-option label="亲友推荐" value="亲友推荐"></el-option>
                    <el-option label="线下活动" value="线下活动"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="入住方式" prop="checkMethod">
                  <el-input v-model="form.checkMethod" placeholder="请输入入住方式"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="可承担费用" prop="assumeCost">
                  <el-input v-model="form.assumeCost" placeholder="请输入可承担费用"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="理想价格" prop="idealPrice">
                  <el-input v-model="form.idealPrice" placeholder="请输入理想价格"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="关注重点" prop="concerns">
                  <el-input v-model="form.concerns" placeholder="请输入关注重点"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="满意点" prop="satisfied">
                  <el-input v-model="form.satisfied" placeholder="请输入客户满意部分"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="不满意点" prop="dissatisfied">
                  <el-input v-model="form.dissatisfied" placeholder="请输入客户不满意部分"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="推荐人姓名" prop="refereeName">
                  <el-input v-model="form.refereeName" placeholder="请输入推荐人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="营销人ID" prop="receptionId">
                  <el-input v-model="form.receptionId" placeholder="请输入营销人ID"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="营销人姓名" prop="receptionPerson">
                  <el-input v-model="form.receptionPerson" placeholder="请输入营销人姓名"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="备注" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="3" placeholder="请输入备注信息"></el-input>
                </el-form-item>
              </el-col>
            </el-row>
          </el-form>
        </el-main>
      </el-container>
    </el-drawer>
  </div>
</template>

<script>
export default {
  name: 'InsRegisterConsult',
  data() {
    return {
      labelType: 'add',
      rules: {},
      total: 0,
      queryInfo: {
        pageSize: 100,
        pageCount: 1,
        currPage: 1,
        condition: {
          consultType: 2
        }
      },
      form: {},
      showDialog: false,
      tableData: [],
      height: window.innerHeight - 256,
      headerHeight: 0,
      loading: false
    };
  },

  created() {
    this.getList()
  },

  mounted() {
    this.$nextTick(() => {
      this.headerHeight = this.$refs.search_d.offsetHeight;
      window.addEventListener('resize', this.getHeight)
    })
  },
  beforeDestroy() {
    window.removeEventListener('resize', this.getHeight)
  },

  methods: {
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    // 查询列表
    getList() {
      const that = this;
      that.loading = true
      that.$http.post("/insRegisterConsultInfo/list", that.queryInfo).then(res => {
        if (res.data.code === 200) {
          that.loading = false
          that.total = res.data.data.count;
          that.queryInfo.currPage = res.data.data.currPage
          that.tableData = res.data.data.data || [];
        }
      })
    },

    // 保存新增/编辑
    handleSave() {
      const that = this;
      // 固定预定咨询类型为2
      that.form.consultType = 2;
      that.$refs.form.validate(valid => {
        if (!valid) return
        that.$http.post("/insRegisterConsultInfo/save", that.form).then(res => {
          if (res.data.code === 200) {
            that.$notify.success({ title: '提示', message: '保存成功' })
            that.showDialog = false
            that.getList()
          } else {
            that.$notify.info({ title: '提示', message: res.data.message })
          }
        })
      })
    },

    // 编辑
    edit(row) {
      this.labelType = 'edit'
      this.form = JSON.parse(JSON.stringify(row))
      this.showDialog = true
    },

    // 删除
    async handleDelte(id) {
      const confirmResult = await this.$confirm("确定删除这条预定咨询记录？", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      }).catch(() => null);
      if (!confirmResult) return
      const that = this;
      that.$http.post("/insRegisterConsultInfo/delete", { id }).then(res => {
        if (res.data.code === 200) {
          that.$notify.success({ title: "提示", message: "删除成功" });
          that.getList();
        } else {
          that.$notify.info({ title: "提示", message: res.data.message });
        }
      })
    },

    // 新增按钮
    newBtn() {
      this.labelType = 'add'
      this.form = {}
      this.showDialog = true
    },

    // 每页条数切换
    handleSizeChange(val) {
      this.queryInfo.pageSize = val;
      this.queryInfo.currPage = 1;
      this.getList()
    },

    // 页码切换
    handleCurrentChange(val) {
      this.queryInfo.currPage = val;
      this.getList()
    },
  },
};
</script>

<style lang="less" scoped>
.top-right-sort {
  display: flex;
  align-items: center;
  gap: 10px;
}
.table-box {
  background-color: #fff;
  padding: 0 0 10px 0;
}
.table-box ::v-deep .el-table .cell {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
.dialogBox {
  height: 100%;
  overflow-y: hidden;
  .dialogHeader {
    display: flex;
    padding: 0 15px;
    height: 70px;
    align-items: center;
    justify-content: space-between;
    border-bottom: 1px solid #ddd;
    font-size: 16px;
    font-weight: 500;
  }
  .dialogMain {
    padding: 15px;
    .dialog-title {
      display: flex;
      align-items: center;
      margin: 18px 0 12px;
      font-size: 15px;
      font-weight: 500;
      .line {
        color: #0079fe;
        font-size: 18px;
        margin-right: 6px;
      }
    }
  }
}
</style>