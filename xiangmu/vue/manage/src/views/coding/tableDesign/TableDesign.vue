<template>
  <div class="tableDesign">
   
    <!-- 内容主体 -->
    <div class="bgwhite bort">
      <el-row>
        <!-- 左侧树结构 -->
        <el-col :span="6" class="tree-left">
          <el-row style="flex-direction: column; overflow: auto">
            <el-col>
              <el-row>
                <el-col :span="10"><div class="modal">模型列表</div></el-col>
              </el-row>
              <div class="header">
                <el-row>
                  <el-col :span="12"
                    ><i class="el-icon-s-grid"></i
                    ><span style="margin-left: 10px">数据表({{tableCount}})</span></el-col
                  >
                  <el-col :span="12" style="text-align: right">
                    <span class="btn"
                      ><i class="el-icon-sort-down" @click="down()"></i
                    ></span>
                    <span class="btn"
                      ><i class="el-icon-sort-up" @click="up()"></i
                    ></span>
                    <span class="btn"
                      ><i class="el-icon-circle-plus-outline" @click="add()"></i
                    ></span>
                  </el-col>
                </el-row>
              </div>
            </el-col>
            <el-col style="height: 100%">
              <div style="height: 91vh">
                <el-scrollbar>
                   <el-table
                    ref="singleTable"
                    :show-header="false"
                    :data="dataTable"
                    highlight-current-row
                    @current-change="goToDetail"
                    style="width: 100%;margin-top:0;">
                     <el-table-column
                      label="1111"
                       property="tableName"
                       show-overflow-tooltip
                      >
                      <template slot-scope="scope">
                          <img
                          src="@/assets/images/table.png" alt="" width="20"
                          style="vertical-align: middle"/>
                          <span>{{ scope.row.tableName }}[{{ scope.row.tableComment }}]</span>
                      </template>
                    </el-table-column>
                  </el-table>
                </el-scrollbar>
              </div>
            </el-col>
          </el-row>
        </el-col>
        <!-- 右侧对应内容 -->
        <el-col :span="18" class="tree-right" ref="getheight">
          <div style="margin: 10px 10px 10px 0">
            <div class="tab">
              <el-tabs v-model="activeName" @tab-click="handleClick">
                <el-tab-pane name="first">
                  <span slot="label"
                    ><i class="el-icon-date"></i> 字段明细</span
                  >
                  <DatabaseProperties :tableStr="tableStr" ></DatabaseProperties>
                </el-tab-pane>
                <el-tab-pane name="second">
                  <span slot="label"
                    ><i class="el-icon-pie-chart"></i> 页面属性</span
                  >
                  <div>页面属性</div>
                </el-tab-pane>
              </el-tabs>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
    <el-dialog
      title="添加新表"
      :visible.sync="dialogVisible"
      width="30%"
      @close="dialogVisible = false"
    >
      <div>
        <el-input placeholder="新增表名称" v-model="tableName"></el-input>
        <el-input
          placeholder="新增表描述"
          style="margin-top: 20px"
          v-model="tableComment"
        ></el-input>
      </div>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addTable()">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
import DatabaseProperties from "@/components/tableDesign/DatabaseProperties.vue";
export default {
  components: { DatabaseProperties },
  data() {
    return {
      dialogVisible: false,
      visible: false,
      top: 0,
      left: 130,
      tableName: "",
      tableComment: "",
      downFlag:false,
      upFlag:false,
      dataTable: [],
      tableStr:"",
      tableCount:0,
     currentRow: null,
      ruleForm: {
        tableName: "",
        tableComment: "",
        type: "",
        classify: "",
        strategy: "",
        checkbox: "",
        topic: "",
        style: "elementUI",
        scroll: "",
        page: "",
        tree: "",
      },
      activeName: "first",
      currentSort: 0,
      isShowSearch: false,
    };
  },
  watch: {
    visible(value) {
      if (value) {
        document.body.addEventListener("click", this.closeMenu);
      } else {
        document.body.removeEventListener("click", this.closeMenu);
      }
    },
  },
  created() {
    this.loadTable();
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    showSearch() {
      this.isShowSearch = true;
    },
    hideSearch() {
      this.isShowSearch = false;
    },
    handleClick(tab, event) {
      // console.log(tab, event);
    },
    add() {
      this.dialogVisible = true;
    },
    addTable() {
      //添加表
      var table = {};
      table.tableName = this.tableName;
      table.tableComment = this.tableComment;
      this.$http.post("/table/add", table).then((response) => {
        if (response.data.code == 200) {
          this.$message.success("添加成功");
          this.loadTable();
          this.dialogVisible = false;
          this.tableName = "";
          this.tableComment = "";
        } else {
          this.$message.error(response.data.message);
        }
      });
    },
    up() {
      //表向上
      var currIndex=this.dataTable.indexOf(this.currentRow)
      if(currIndex-1>=0){
           //查找seq
         let currSeq=this.currentRow.seq
         let upSeq=this.dataTable[currIndex-1].seq
         console.log('--->seq',currSeq,upSeq);

          let tableChangeArray=[];
          let currTable={}
          currTable.id=this.currentRow.id
          currTable.seq=upSeq
          this.currentRow.seq=upSeq
          tableChangeArray.push(currTable)
          let upTable={}
          upTable.id=this.dataTable[currIndex-1].id
          upTable.seq=currSeq
          this.dataTable[currIndex-1].seq=currSeq
          tableChangeArray.push(upTable)
        //调用接口切换顺序
         this.$http.post("/table/changeSeq", tableChangeArray).then((response) => {
            if (response.data.code == 200) {
             this.swapArray(this.dataTable,currIndex,currIndex-1)
            } else {
              this.$message.error(response.data.message);
            }
          });
       
      }
  


    },
    down() {
      if(this.downFlag){
          return
      }
      this.downFlag=true
      //表向下
      var currIndex=this.dataTable.indexOf(this.currentRow)
      if(currIndex+2<=this.dataTable.length){
       //查找seq
         let currSeq=this.currentRow.seq
         let downSeq=this.dataTable[currIndex+1].seq
         console.log('--->seq2',currSeq,downSeq);

          let tableChangeArray=[];
          let currTable={}
          currTable.id=this.currentRow.id
          currTable.seq=downSeq
          this.currentRow.seq=downSeq
          tableChangeArray.push(currTable)
          let downTable={}
          downTable.id=this.dataTable[currIndex+1].id
          downTable.seq=currSeq
          this.dataTable[currIndex+1].seq=currSeq
          tableChangeArray.push(downTable)
        //调用接口切换顺序
         this.$http.post("/table/changeSeq", tableChangeArray).then((response) => {
            if (response.data.code == 200) {
              this.swapArray(this.dataTable,currIndex,currIndex+1)
            } else {
              this.$message.error(response.data.message);
            }
                this.downFlag=false
          });
      }
    },
    goToDetail(val) {
       this.currentRow = val;
      let tableCode=val.tableCode
      //点击表获取详情
     this.$http.post("/table/queryOne", {"tableCode":tableCode}).then((response) => {
        if (response.data.code == 200) {
         let table=response.data.data
        this.ruleForm.tableName=table.tableName
        this.ruleForm.tableComment=table.tableComment
        //传值给子组件
        this.tableStr=JSON.stringify(table)
        } else {
          this.$message.error(response.data.message);
        }
      });
    },
     setCurrent(row) {
        this.$refs.singleTable.setCurrentRow(row);
      },
    openMenu(e) {
      this.top = e.clientY - 240; // fix 位置bug
      this.visible = true;
    },
    closeMenu() {
      this.visible = false;
    },
    loadTable() {
      this.$http.post("/table/queryList", {}).then( (response)=> {
        if (response.data.code == 200) {
          this.dataTable = response.data.data;
          this.tableCount=response.data.data.length
        }
      });
    },
     swapArray(arr, index1, index2) {
     //交换位置
     arr[index1] = arr.splice(index2, 1, arr[index1])[0];
    return arr;
    },
  },
};
</script>

<style lang='less' scope>
.tableDesign {
  .el-scrollbar {
    overflow: auto;
    height: 100%;
  }
  .tree-left {
    .header {
      color: #333;
      padding: 10px;
      padding-left: 16px;
      font-size: 15px;
      font-weight: bold;
      background: #f2f2f2;
      .btn {
        display: inline-block;
        margin-right: 10px;
        cursor: pointer;
      }
    }
    .list {
      width: 100%;
      .el-button.tabs {
        width: 100%;
        text-align: left;
        border: none;
        height: 26px;
        position: relative;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
        padding: 0 5px 0 30px;
      }
      .el-button.keys {
        padding: 2px 5px;
        text-align: center;
        width: 100%;
      }
      div {
        cursor: pointer;
        padding: 2px;
        color: #333;
        font-size: 12px;
        span {
          vertical-align: middle;
        }
        &.active {
          color: #fff;
          background: #409eff;
        }
      }
    }
  }

  .tree-right {
    height: 91vh;
    border-left: 1px solid #eee;
    .tab {
      margin-top: 30px;
      margin-left: 20px;
    }
  }
  .modal {
    font-size: 16px;
    font-weight: bold;
    padding-left: 10px;
    margin: 10px;
    border-left: 3px solid #333;
  }
  .el-form-item--small.el-form-item {
    margin: 3px 0;
  }
  .el-form-item__label {
    font-size: 12px;
  }
  .contextmenu {
    background: #fff;
    z-index: 3000;
    position: absolute;
    list-style-type: none;
    border-radius: 4px;
    font-size: 12px;
    font-weight: 400;
    color: #333;
    box-shadow: 2px 2px 5px 0 rgba(204, 204, 204, 0.1);
  }
}
</style>
