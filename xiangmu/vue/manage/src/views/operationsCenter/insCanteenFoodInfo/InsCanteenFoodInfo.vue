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

    <div class="table-box">
      <el-table border ref="table" v-loading="loading" :data="tableData" tooltip-effect="dark" style="width: 100%"
        :header-cell-style="{
          backgroundColor: '#fafafa',
          color: '#333',
          fontWeight: 'bold',
          fontSize: '14px',
        }" :height="height">
        <el-table-column label="#" type="index" width="50" align="center"></el-table-column>

        <el-table-column label="餐品大类名称" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.typeName || '-' }}</template>
        </el-table-column>
        <el-table-column label="餐品类型" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isPackage === 1 ? '单品' : '套餐' }}</template>
        </el-table-column>
        <el-table-column label="餐品名称" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodName || '-' }}</template>
        </el-table-column>
        <el-table-column label="单价(元)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodPrice }}</template>
        </el-table-column>
        <el-table-column label="单位" width="70" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodUnit || '-' }}</template>
        </el-table-column>
        <el-table-column label="餐品口味" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodTaste || '-' }}</template>
        </el-table-column>
        <el-table-column label="禁忌人群" min-width="130" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodAvoid || '-' }}</template>
        </el-table-column>
        <el-table-column label="辣味级别" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">
            {{ scope.row.pungencyDegree === 0 ? '不辣' : scope.row.pungencyDegree === 1 ? '微辣' : scope.row.pungencyDegree
              === 2 ? '中辣' : '特辣' }}
          </template>
        </el-table-column>
        <el-table-column label="营养说明" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.nutritionDesp || '-' }}</template>
        </el-table-column>
        <el-table-column label="食材说明" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.ingredientDesp || '-' }}</template>
        </el-table-column>
        <el-table-column label="餐品简图" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.foodImg ? '有图片' : '无' }}</template>
        </el-table-column>
        <el-table-column label="套餐说明" min-width="160" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.packageDesp || '-' }}</template>
        </el-table-column>
        <el-table-column label="菜品类型" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.recipeType || '-' }}</template>
        </el-table-column>
        <el-table-column label="适用餐次" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.mealTimeType || '-' }}</template>
        </el-table-column>
        <el-table-column label="烹饪方式" min-width="110" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.cookingMethod || '-' }}</template>
        </el-table-column>
        <el-table-column label="单份重量(g)" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.portionWeight }}</template>
        </el-table-column>
        <el-table-column label="份量描述" min-width="120" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.servingSize || '-' }}</template>
        </el-table-column>
        <el-table-column label="热量(千卡)" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalCalorie }}</template>
        </el-table-column>
        <el-table-column label="蛋白质(g)" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalProtein }}</template>
        </el-table-column>
        <el-table-column label="脂肪(g)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalFat }}</template>
        </el-table-column>
        <el-table-column label="碳水(g)" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalCarbohydrate }}</template>
        </el-table-column>
        <el-table-column label="膳食纤维(g)" width="100" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalDietaryFiber }}</template>
        </el-table-column>
        <el-table-column label="钠(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalSodium }}</template>
        </el-table-column>
        <el-table-column label="钾(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalPotassium }}</template>
        </el-table-column>
        <el-table-column label="钙(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalCalcium }}</template>
        </el-table-column>
        <el-table-column label="镁(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalMagnesium }}</template>
        </el-table-column>
        <el-table-column label="磷(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalPhosphorus }}</template>
        </el-table-column>
        <el-table-column label="铁(mg)" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalIron }}</template>
        </el-table-column>
        <el-table-column label="嘌呤(mg)" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.totalPurine }}</template>
        </el-table-column>
        <el-table-column label="高嘌呤食谱" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isHighPurine === 0 ? '否' : '是' }}</template>
        </el-table-column>
        <el-table-column label="高糖食谱" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isHighSugar === 0 ? '否' : '是' }}</template>
        </el-table-column>
        <el-table-column label="高脂食谱" width="80" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.isHighFat === 0 ? '否' : '是' }}</template>
        </el-table-column>
        <el-table-column label="禁忌过敏原" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.tabooExplain || '-' }}</template>
        </el-table-column>
        <el-table-column label="餐品简介" min-width="140" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.remark || '-' }}</template>
        </el-table-column>
        <el-table-column label="上架状态" width="90" align="center" show-overflow-tooltip>
          <template slot-scope="scope">{{ scope.row.status === 1 ? '上架' : '下架' }}</template>
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
                <el-form-item label="餐品大类名称：" prop="typeName">
                  <el-input v-model="form.typeName" placeholder="请输入餐品大类"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐品类型：" prop="isPackage">
                  <el-select v-model="form.isPackage" placeholder="请选择类型" style="width:100%">
                    <el-option label="单品" :value="1"></el-option>
                    <el-option label="套餐" :value="2"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐品名称：" prop="foodName">
                  <el-input v-model="form.foodName" placeholder="请输入餐品名称"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐品单价(元)：" prop="foodPrice">
                  <el-input v-model="form.foodPrice" type="number" placeholder="请输入单价"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐品单位：" prop="foodUnit">
                  <el-input v-model="form.foodUnit" placeholder="例：份、碗"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="辣味级别：" prop="pungencyDegree">
                  <el-select v-model="form.pungencyDegree" placeholder="选择辣度" style="width:100%">
                    <el-option label="不辣" :value="0"></el-option>
                    <el-option label="微辣" :value="1"></el-option>
                    <el-option label="中辣" :value="2"></el-option>
                    <el-option label="特辣" :value="3"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="餐品口味(多选)：" prop="foodTaste">
                  <el-input v-model="form.foodTaste" placeholder="多个用逗号分隔"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="禁忌人群(多选)：" prop="foodAvoid">
                  <el-input v-model="form.foodAvoid" placeholder="多个用逗号分隔"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="菜品类型：" prop="recipeType">
                  <el-input v-model="form.recipeType" placeholder="填写菜品分类"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="适用餐次：" prop="mealTimeType">
                  <el-input v-model="form.mealTimeType" placeholder="早/中/晚/加餐"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="烹饪方式：" prop="cookingMethod">
                  <el-input v-model="form.cookingMethod" placeholder="蒸/煮/炖/炒等"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="每份成品重量(克)：" prop="portionWeight">
                  <el-input v-model="form.portionWeight" type="number" placeholder="单份克重"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="份量描述：" prop="servingSize">
                  <el-input v-model="form.servingSize" placeholder="如：1碗，约200g"></el-input>
                </el-form-item>
              </el-col>
              <!-- 营养数据行 -->
              <el-col :span="12">
                <el-form-item label="总热量（千卡/份）：" prop="totalCalorie">
                  <el-input v-model="form.totalCalorie" type="number" placeholder="热量数值"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总蛋白质（克/份）：" prop="totalProtein">
                  <el-input v-model="form.totalProtein" type="number" placeholder="蛋白质"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总脂肪（克/份）：" prop="totalFat">
                  <el-input v-model="form.totalFat" type="number" placeholder="脂肪"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总碳水化合物（克/份）：" prop="totalCarbohydrate">
                  <el-input v-model="form.totalCarbohydrate" type="number" placeholder="碳水"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总膳食纤维（克/份）：" prop="totalDietaryFiber">
                  <el-input v-model="form.totalDietaryFiber" type="number" placeholder="膳食纤维"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总钠（毫克/份）：" prop="totalSodium">
                  <el-input v-model="form.totalSodium" type="number" placeholder="钠含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总钾（毫克/份）：" prop="totalPotassium">
                  <el-input v-model="form.totalPotassium" type="number" placeholder="钾含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总钙（毫克/份）：" prop="totalCalcium">
                  <el-input v-model="form.totalCalcium" type="number" placeholder="钙含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总镁（毫克/份）：" prop="totalMagnesium">
                  <el-input v-model="form.totalMagnesium" type="number" placeholder="镁含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总磷（毫克/份）：" prop="totalPhosphorus">
                  <el-input v-model="form.totalPhosphorus" type="number" placeholder="磷含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总铁（毫克/份）：" prop="totalIron">
                  <el-input v-model="form.totalIron" type="number" placeholder="铁含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="总嘌呤（毫克/份）：" prop="totalPurine">
                  <el-input v-model="form.totalPurine" type="number" placeholder="嘌呤含量"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否高嘌呤食谱：" prop="isHighPurine">
                  <el-select v-model="form.isHighPurine" placeholder="请选择" style="width:100%">
                    <el-option label="否" :value="0"></el-option>
                    <el-option label="是" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否高糖食谱：" prop="isHighSugar">
                  <el-select v-model="form.isHighSugar" placeholder="请选择" style="width:100%">
                    <el-option label="否" :value="0"></el-option>
                    <el-option label="是" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="是否高脂食谱：" prop="isHighFat">
                  <el-select v-model="form.isHighFat" placeholder="请选择" style="width:100%">
                    <el-option label="否" :value="0"></el-option>
                    <el-option label="是" :value="1"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <el-col :span="12">
                <el-form-item label="上架状态：" prop="status">
                  <el-select v-model="form.status" placeholder="选择上下架" style="width:100%">
                    <el-option label="上架" :value="1"></el-option>
                    <el-option label="下架" :value="0"></el-option>
                  </el-select>
                </el-form-item>
              </el-col>
              <!-- 长文本区域整行24跨度 -->
              <el-col :span="24">
                <el-form-item label="营养说明：" prop="nutritionDesp">
                  <el-input v-model="form.nutritionDesp" type="textarea" rows="2" placeholder="描述餐品营养特点"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="食材说明：" prop="ingredientDesp">
                  <el-input v-model="form.ingredientDesp" type="textarea" rows="2" placeholder="列出主要食材"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="套餐说明：" prop="packageDesp">
                  <el-input v-model="form.packageDesp" type="textarea" rows="2" placeholder="套餐餐品组合说明，单品可留空"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="禁忌与过敏原说明：" prop="tabooExplain">
                  <el-input v-model="form.tabooExplain" type="textarea" rows="2" placeholder="含过敏原、禁忌人群提示"></el-input>
                </el-form-item>
              </el-col>
              <el-col :span="24">
                <el-form-item label="餐品简介：" prop="remark">
                  <el-input v-model="form.remark" type="textarea" rows="2" placeholder="餐品简短介绍"></el-input>
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
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - this.headerHeight - 256;
    },

    //获取数据
    getList() {
      var that = this;
      that.loading = true
      that.$http.post("/insCanteenFoodInfo/list", that.queryInfo).then(function (response) {
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
      that.$http.post("/insCanteenFoodInfo/save", that.form).then(function (response) {
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
        that.$http.post("/insCanteenFoodInfo/delete", { "id": id }).then(function (response) {
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

