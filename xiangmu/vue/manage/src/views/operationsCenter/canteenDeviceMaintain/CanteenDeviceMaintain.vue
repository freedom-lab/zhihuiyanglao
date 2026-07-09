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
    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="保养日期" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.maintainDate ? scope.row.maintainDate.slice(0, 10) : '-' }}</template>
        </el-table-column>
        <el-table-column label="所属位置" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.devicePlace || '-' }}</template>
        </el-table-column>
        <el-table-column label="设备名称" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.deviceName || '-' }}</template>
        </el-table-column>
        <el-table-column label="保养方式" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.maintainMethod || '-' }}</template>
        </el-table-column>
        <el-table-column label="保养详情" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.maintainContent || '-' }}</template>
        </el-table-column>
        <el-table-column label="负责人" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkMan || '-' }}</template>
        </el-table-column>
        <el-table-column label="联系电话" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.linkTel || '-' }}</template>
        </el-table-column>
        <el-table-column label="上传图片" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.photo ? '有图片' : '无' }}</template>
        </el-table-column>
        <el-table-column label="备注" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>

        <!-- 操作列 -->
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <el-button type="text" @click="edit(scope.row)" size="small" style="padding: 0;">编辑</el-button>
            <el-popconfirm title="确定删除吗？" @confirm="handleDelte(scope.row.id)">
              <el-button slot="reference" type="text" style="padding: 0;margin-left: 15px;color: red;">删除</el-button>
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

    <el-drawer :visible.sync="showDialog" direction="rtl" size="70%" :with-header="false" :destroy-on-close="true">
      <el-container class="dialogBox">
        <el-header class="dialogHeader">
          <div>{{ labelType == 'add' ? '新增' : '编辑' }}</div>
          <div>
            <el-button size="small" @click="showDialog = false">取消</el-button>
            <el-button size="small" type="primary" @click="handleSave">确定</el-button>
          </div>
        </el-header>

        <el-main class="dialogMain">
          <el-form ref="form" :model="form" :rules="rules" label-width="120px">
            <el-row :gutter="12">
              <el-col :span="12">
                <el-form-item label="保养日期：" prop="maintainDate">
                  <el-date-picker v-model="form.maintainDate" type="date" placeholder="选择保养日期"
                    style="width:100%"></el-date-picker>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="所属位置：" prop="devicePlace">
                  <el-input v-model="form.devicePlace" placeholder="填写设备存放位置"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="设备名称：" prop="deviceName">
                  <el-input v-model="form.deviceName" placeholder="填写保养设备名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="保养方式：" prop="maintainMethod">
                  <el-input v-model="form.maintainMethod" placeholder="填写保养操作方式"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="负责人：" prop="linkMan">
                  <el-input v-model="form.linkMan" placeholder="填写现场保养负责人"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="联系电话：" prop="linkTel">
                  <el-input v-model="form.linkTel" placeholder="填写负责人手机号"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="上传图片：" prop="photo">
                  <el-upload class="avatar-uploader" :action="$uploadURL" :show-file-list="false"
                    :on-success="handleUploadSuccess"
                    :before-upload="beforeUpload">
                    <img v-if="form.photo" :src="form.photo" class="avatar"
                      style="width:100px;height:100px" />
                    <i v-else class="el-icon-plus avatar-uploader-icon"></i>
                  </el-upload>
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
  data() {
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
      loading: false
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
    //图片上传成功处理
    handleUploadSuccess(res, file) {
      this.form.photo = file.response.data.url;
    },
    //图片上传成功处理
    handleAddUploadSuccess(res, file) {
      this.form.photo = file.response.data.url;
    },
    //图片上传之前处理
    beforeUpload(file) {
      // const isLt2M = file.size / 1024 / 1024 < 2;
      // if (!isLt2M) {
      //   this.$message.error("上传图片大小不能超过 2MB!");
      // }
      // return  isLt2M;
    },
    
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/canteenDeviceMaintain/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/canteenDeviceMaintain/save", that.form).then(function (response) {
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
        that.$http.post("/canteenDeviceMaintain/delete", { "id": id }).then(function (response) {
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

<style lang="less" scoped>
.table-box {
  background-color: white;
  padding: 0 0 10px 0;
}

.table-box ::v-deep .el-table .cell {
  white-space: nowrap;
  /* 强制不换行 */
  overflow: hidden;
  /* 超出隐藏 */
  text-overflow: ellipsis;
  /* 超出显示省略号 */
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
  }

  .dialogMain {
    padding: 15px;

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
  }
}
</style>

