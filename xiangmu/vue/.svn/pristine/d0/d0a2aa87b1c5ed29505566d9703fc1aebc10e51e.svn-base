<template>
  <div class="managingPeople hp100 bbox">
    <!-- 卡片视图 -->
    <el-card>
      <!-- 搜索-->

      <el-row :gutter="20">
        <el-col :span="8"> 
            <el-input placeholder="SpringBoot代码包名称 e.g. cn.pluss.platform" v-model="packageName" disabled>
            </el-input>
        </el-col>
        <el-col :span="8">
            <div >
            <el-input placeholder="请选择SpringBoot代码存放位置" v-model="springBootDir">
              <template slot="append" >
                <el-button slot="append" icon="el-icon-folder" type="success" ></el-button>
              </template>
            </el-input>
          </div>
        </el-col>
        <el-col :span="8"> 
            <el-input placeholder="请输入vue代码存放位置  e.g. D:/vue" v-model="vueDir">
               <template slot="append" >
                  <el-button slot="append" icon="el-icon-folder" type="success" ></el-button>
              </template>
            </el-input>
        </el-col>
     
      
      </el-row>
      <el-row :gutter="20">
               <el-col :span="3"
          ><el-button
            plain
            class="add-column-btn bbox"
            @click="codingAll('select')"
            type="primary"
          >
            <i class="el-icon-plus fw900 f16"></i>生成代码</el-button
          ></el-col
        >
         <el-col :span="4"
          ><el-button
            plain
            class="add-column-btn bbox"
            @click="codingAll('all')"
            type="primary"
          >
            <i class="el-icon-plus fw900 f16"></i> 全部生成</el-button
          ></el-col
        >
        </el-row>
      <!-- 用户列表区域 -->
      <el-table
        :data="tableData"
        border
        fit
        :height="height"
        highlight-current-row
        style="width: 100%"
        @sort-change="sortChange"
        @selection-change="handleSelectionChange"
      >
       <el-table-column
      type="selection"
      width="55">
    </el-table-column>
        <el-table-column label="id" align="center" prop="id">
          <template slot-scope="scope">
            <span>{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column label="表名" align="center" prop="表名">
          <template slot-scope="scope">
            <span>{{ scope.row.tableName }}</span>
          </template>
        </el-table-column>
        <el-table-column label="表描述" align="center" prop="表描述">
          <template slot-scope="scope">
            <span>{{ scope.row.tableComment }}</span>
          </template>
        </el-table-column>
        
        <el-table-column label="创建时间" align="center" prop="createDt" :formatter="dateFormat">
         
        </el-table-column>
        
        <el-table-column
          label="操作"
          align="center"
          class-name="small-padding fixed-width"
        >
          <template slot-scope="scope">
            <el-tooltip
              class="item"
              effect="dark"
              content="编辑"
              placement="bottom"
            >
              <i
                class="el-icon-edit textblue f16"
                @click="gotoDetail(scope.row.id, scope.row.userCode)"
              ></i>
            </el-tooltip>
            <el-tooltip
              class="item"
              effect="dark"
              content="删除"
              placement="bottom"
            >
              <i
                class="el-icon-delete textblue f16 ml20"
                @click="del(scope.row.id)"
              ></i>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
      <div class="footerBox">
        <!-- 分页区域 -->
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page.sync="queryInfo.currPage"
          :page-sizes="[10, 20, 30, 50]"
          :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
        ></el-pagination>
      </div>
    </el-card>
  </div>
</template>

<script>
import moment from 'moment'
export default {
  data() {
    return {
      height: window.innerHeight - 256, //表格高度
      value: "",
      searchInput: "",
      tableData: [],
      springBootDir:'',
      vueDir:'',
      packageName:'cn.pluss.platform',
         total: 0,
      // 获取用户列表查询参数对象
      queryInfo: {
        // 当前页数
        currPage: 1,
        // 每页显示多少数据
        pageSize: 20,
        //查询条件
        condition: {
          id: "",
        },
      },
     selectRows: [],
    };
  },
  created() {
    this.queryInfo.currPage = this.$route.query.currPage;
    this.queryInfo.pageSize = this.$route.query.pageSize;
    this.getListData();
    this.getSpringbootDir()
    window.addEventListener("resize", this.getHeight);
  },
  mounted() {
    this.loading = false;
    this.$options.__source = __filename
  },
  destroyed() {
    window.removeEventListener("resize", this.getHeight);
  },
  methods: {
    //条件查询
    search() {
      this.queryInfo.condition.id = this.searchInput;
      this.getListData();
    },
    // 监听 pagesize改变的事件
    handleSizeChange(newSize) {
      this.queryInfo.pageSize = newSize;
      this.getListData();
    },
    // 监听 页码值 改变事件
    handleCurrentChange(newSize) {
      this.queryInfo.currPage = newSize;
      this.getListData();
    },

    // 监听排序
    sortChange() {},
    codingAll(codeType) {
      //生成代码
     if(this.packageName==''){
      this.$message({
          message: 'springboot代码包名不能为空',
          type: 'warning'
        });
       return 
     }
     if(this.springBootDir==''){
      this.$message({
          message: 'springboot代码位置不能为空',
          type: 'warning'
        });
       return 
     }
      if(this.vueDir==''){
      this.$message({
          message: 'vue代码位置不能为空',
          type: 'warning'
        });
       return 
     }
     var codingRuleVo={}
     codingRuleVo.packageName=this.packageName
     codingRuleVo.springbootDir=this.springBootDir
     codingRuleVo.vueDir=this.vueDir
     codingRuleVo.codingType = codeType
     if(codeType=='select'){
       codingRuleVo.selectRowList = this.selectRows
     }
    this.$http.post("/srobot/action", codingRuleVo).then(response=> {
        if (response.data.code == 200) {
            console.log(response.data.data);
          this.$message.success("生成成功")
        }else{
          this.$message.error(response.data.message);
        }
      })

    },
    handleSelectionChange(val) {
        this.selectRows = val;
    },
    getSpringbootDir(){
      //获取springb 
      this.$http.post("/srobot/springBootDir", {}).then(response=> {
        if (response.data.code == 200) {
            console.log(response.data.data);
            this.springBootDir=response.data.data
        }
      })

    },
    
    getListData() {
      // 获取列表
      var that = this;
      that.$http.post("/table/list", that.queryInfo).then(function (response) {
        console.log(response.data.data);
        if (response.data.code == 200) {
          that.total = response.data.data.count;
          that.queryInfo.currPage = response.data.data.currPage;
          that.tableData = response.data.data.data;
        }
      });
    },
    // 监听表格高度
    getHeight() {
      this.height = window.innerHeight - 256;
    },
    dateFormat(row,column){
        //日期格式化
        var date = row[column.property];
        if(date == undefined){return ''};
        return moment(date).format("YYYY-MM-DD HH:mm:ss")
    },
  },
};
</script>

<style lang="less" scoped>
.textblue {
  color: #008eff;
}
.managingPeople {
  .el-card {
    height: calc(100vh - 114px);
    position: relative;
    .el-select > .el-input {
      width: 200px;
    }
    .header-search-box .header-search-input {
      width: 325px;
    }
    input::placeholder {
      font-size: 12px;
    }
    .handle-btn .el-button.add-column-btn {
      width: 100%;
      font-size: 13px;
      background-color: transparent;
      color: #008eff;
      z-index: 102;
    }
    .footerBox {
      position: absolute;
      width: 100%;
      height: 48px;
      left: 20px;
      right: 20px;
      bottom: 0;
    }
  }
}
.el-row {
  margin-bottom: 20px;
  &:last-child {
    margin-bottom: 0;
  }
}
.el-col {
  border-radius: 4px;
}
.bg-purple-dark {
  background: #99a9bf;
}
.bg-purple {
  background: #d3dce6;
}
.bg-purple-light {
  background: #e5e9f2;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
</style>

