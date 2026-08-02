<template>
  <div>
    <div>
      <el-button type="success" @click="save()"
        ><i class="el-icon-folder"></i>保存</el-button
      >
      <el-button type="primary" @click="add()"
        ><i class="el-icon-plus"></i>新增</el-button
      >
      <el-button type="primary" @click="insert()"
        ><i class="el-icon-delete"></i>插入一行</el-button
      >
      <el-button type="primary" @click="up()"
        ><i class="el-icon-top"></i>上移</el-button
      >
      <el-button type="primary" @click="down()"
        ><i class="el-icon-bottom"></i>下移</el-button
      >
      <el-button type="danger" @click="del()"
        ><i class="el-icon-delete"></i>删除</el-button
      >
    </div>
    <div>
      <el-form
        :model="paramsForm"
        ref="paramsForm"
        :rules="paramsForm.paramsRules"
      >
        <el-table
          :data="paramsForm.tableColumnList"
          highlight-current-row
          style="width: 100%"
          max-height="580px"
         @current-change="handleCurrentChange"
        >
          <el-table-column label="字段名称" align="center" width="200" >
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.columnName'"
              >
                <el-input
                  v-model.number="scope.row.columnName"
                  :disabled="isDisabled"
                ></el-input>
              </el-form-item>
            </template>
          </el-table-column>
          <el-table-column label="字段类型" align="center" width="140">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.columnType'"
              >
                <el-select v-model="scope.row.columnType" @change="changeColumnType($event,scope.$index)">
                  <el-option label="varchar" value="varchar"></el-option>
                  <el-option label="int" value="int"></el-option>
                  <el-option label="double" value="double"></el-option>
                  <el-option label="datetime" value="datetime"></el-option>
                  <el-option label="text" value="text"></el-option>
                  <el-option label="blob" value="blob"></el-option>
                </el-select>
              </el-form-item>
            </template>
          </el-table-column>
          <el-table-column label="字段长度" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.columnLength'"
              >
                <el-input
                  v-model.number="scope.row.columnLength"
                  :disabled="isDisabled"
                ></el-input>
              </el-form-item>
            </template>
          </el-table-column>
          <el-table-column label="字段备注" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.columnDesc'"
              >
                <el-input
                  v-model.number="scope.row.columnDesc"
                  :disabled="isDisabled"
                ></el-input>
              </el-form-item>
            </template>
          </el-table-column>
            <el-table-column label="默认值" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.defaultValue'"
              >
                <el-input
                  v-model.number="scope.row.defaultValue"
                  :disabled="isDisabled"
                ></el-input>
              </el-form-item>
            </template>
          </el-table-column>
            <el-table-column label="主键" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.isKey'"
              >
                <el-checkbox v-model="scope.row.isKey" @change="isKeyHandle($event,scope.$index)" ></el-checkbox>
              </el-form-item>
            </template>
          </el-table-column>
        
           <el-table-column label="自增" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.autoIncrement'"
              >
                <el-checkbox v-model="scope.row.autoIncrement" @change="autoIncrementHandle($event,scope.$index)" ></el-checkbox>
              </el-form-item>
            </template>
          </el-table-column>
          <el-table-column label="不允许空值" align="center">
            <template slot-scope="scope">
              <el-form-item
                :prop="'tableColumnList.' + scope.$index + '.isNotNull'"
              >
                <el-checkbox v-model="scope.row.isNotNull"></el-checkbox>
              </el-form-item>
            </template>
          </el-table-column>
        </el-table>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    tableStr:{
       type: String,
    },
  },
  data() {
    return {
      isDisabled: false,
      tableName:"",
      tableCode:"",
      keyColumn:'',
      table:'',
      paramsForm: {
        tableColumnList: [
        ],
      },
       currentRow: null,
   
    };
  },
  created() {
    
  },
  watch:{
    tableStr:{
      handler(newValue,oldValue){
        this.table =JSON.parse(newValue)
        this.paramsForm.tableColumnList=this.table.tableColumnList;
        if( this.paramsForm.tableColumnList.length==0){
           //添加一行
          this.add()
        }
      }
    },
   
    deep:true
  },
  methods: {
    
    handleCurrentChange(val) {
       this.currentRow = val;
    },
    save(){
      //保存
      let tableParams={}
      tableParams.tableCode=this.table.tableCode
      tableParams.tableName=this.table.tableName
      tableParams.id=this.table.id
      tableParams.keyColumn=this.keyColumn;
      let columnList=[]
      this.paramsForm.tableColumnList.forEach((item,index)=>{
          if(item.columnName!=''&&item.columnName!=undefined){
            columnList.push(item)
          }
      })
      if(columnList.length==0){
           this.$message.error("至少存在一个字段");
        return;
      }
      tableParams.tableColumnList=columnList
      this.$http.post("/table/updateTableColumn",tableParams).then((response) => {
        if (response.data.code == 200) {
         this.$message.success("保存成功");
         this.paramsForm.tableColumnList=columnList;
        } else {
          this.$message.error(response.data.message);
        }
      });

    },
    add(){
      //添加一行
      var tableColumn={}
      tableColumn.tableColumnCode=this.generateUUID();
      tableColumn.isKey=false
      tableColumn.autoIncrement=false
      tableColumn.isNotNull=false
       this.paramsForm.tableColumnList.push(tableColumn);
    },
    insert(){
      //插入
      var index=this.paramsForm.tableColumnList.indexOf(this.currentRow)
      var tableColumn={}
      tableColumn.tableColumnCode=this.generateUUID();
      tableColumn.isKey=false
      tableColumn.autoIncrement=false
      tableColumn.isNotNull=false
      this.paramsForm.tableColumnList.splice(index,0,tableColumn);
    },
    up(){
      //上移
      var currIndex=this.paramsForm.tableColumnList.indexOf(this.currentRow)
      if(currIndex-1>=0){
        this.swapArray(this.paramsForm.tableColumnList,currIndex,currIndex-1)
      }

    },
    changeColumnType(val,index){
      //字段类型
      if(val=='varchar'){
          this.paramsForm.tableColumnList[index].columnLength=50
      }else{
         this.paramsForm.tableColumnList[index].columnLength=''
      }
    },
    isKeyHandle(val,index){

    
      //主键
      if(val){
        //全部主键取消
      this.paramsForm.tableColumnList.forEach((item)=>{
        item.isKey=false
        item.autoIncrement=false
      })
      //选择当前
        this.paramsForm.tableColumnList[index].isKey=true
      }

    },
    autoIncrementHandle(value,index){
      //自增属性,设置主键勾选，字段类型修改成int
      if(value){
             //全部主键取消
      this.paramsForm.tableColumnList.forEach((item)=>{
        item.isKey=false
        item.autoIncrement=false
      })
        this.paramsForm.tableColumnList[index].isKey=true
        this.paramsForm.tableColumnList[index].autoIncrement=true
        this.paramsForm.tableColumnList[index].columnType='int'
        this.keyColumn=this.paramsForm.tableColumnList[index].columnName
      }
    },
    down(){
      //向下移
      var currIndex=this.paramsForm.tableColumnList.indexOf(this.currentRow)
      if(currIndex+2<=this.paramsForm.tableColumnList.length){
        this.swapArray(this.paramsForm.tableColumnList,currIndex,currIndex+1)
      }
    },
    del(){
      //删除
        var currIndex=this.paramsForm.tableColumnList.indexOf(this.currentRow)
        this.paramsForm.tableColumnList.splice(currIndex,1)
    },
    swapArray(arr, index1, index2) {
     //交换位置
     arr[index1] = arr.splice(index2, 1, arr[index1])[0];
    return arr;
    },
     generateUUID() {
       //生产uuid
      var d = new Date().getTime();
      if (window.performance && typeof window.performance.now === "function") {
          d += performance.now(); //use high-precision timer if available
      }
      var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
          var r = (d + Math.random() * 16) % 16 | 0;
          d = Math.floor(d / 16);
          return (c == 'x' ? r : (r & 0x3 | 0x8)).toString(16);
      });
    return uuid;
    }
  }
};
</script>
<style lang="less" scope>
.el-form-item--small.el-form-item {
  margin: 10px;
}
.el-table td{
  padding: 3px 0;
}
.el-table .cell{
  padding-right:0;
}
</style>
