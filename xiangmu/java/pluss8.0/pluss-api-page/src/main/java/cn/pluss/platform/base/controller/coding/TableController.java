package cn.pluss.platform.base.controller.coding;

import java.util.*;
import javax.annotation.Resource;

import cn.pluss.platform.model.coding.TableColumn;
import cn.pluss.platform.model.coding.TableDdl;
import cn.pluss.platform.base.coding.tableColumn.TableColumnService;
import cn.pluss.platform.base.coding.tableDdl.TableDdlService;
import cn.pluss.platform.util.CodingUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.base.coding.table.TableService;


@RestController
@RequestMapping("/table")
@Api(value = "Table控制类",tags={"Table接口"})
public class TableController{

    private Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private TableService tableService;
    @Resource
    private TableColumnService tableColumnService;
    @Resource
    private TableDdlService tableDdlService;

    private String[] baseTableArray={"tb_yunlankeji_menu_info","tb_yunlankeji_organ","tb_yunlankeji_organ_post","tb_yunlankeji_organ_type","tb_yunlankeji_organ_type_post","tb_yunlankeji_post","tb_yunlankeji_role_info","tb_yunlankeji_role_menu_info","tb_yunlankeji_role_user_info","tb_yunlankeji_system_config","tb_yunlankeji_table","tb_yunlankeji_table_column","tb_yunlankeji_table_ddl","tb_yunlankeji_user_info","tb_yunlankeji_user_organ","tb_yunlankeji_user_post"};



    @PostMapping("/list")
    @ApiOperation(value = "后台分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<Table>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
		if(pageQueryInfo.getCondition()!=null){
			map.putAll(pageQueryInfo.getCondition());
		}
        List<Table> tableList = tableService.queryTablePage(map);
        Integer count= tableService.queryTablePageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<Table>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), tableList);
        return ResultGenerator.genSuccessResult(pager);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result save(@RequestBody Table table) {
        if(table.getId()!=null&&table.getId().intValue()>0){
            tableService.updateTable(table);
        }else{
            tableService.saveTable(table);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result add(@RequestBody Table table) {

        //表名不能为空
        if(StringUtil.isEmpty(table.getTableName())){
            return ResultGenerator.genFailResult("表名不能为空");
        }
        //根据表名查询是否已经存在
        Table  tableQuery=new Table();
        tableQuery.setTableName(table.getTableName());
        List<Table>  tableActualList=tableService.queryTableList(tableQuery);
        if(tableActualList!=null&&tableActualList.size()>0){
            return ResultGenerator.genFailResult("表名已存在");
        }
        //判断是否在基础表
        boolean exist= Arrays.asList(baseTableArray).contains(table.getTableName());
        if(exist){
            return ResultGenerator.genFailResult("不能和基表同名");
        }
        //查询最大的seq
        Integer maxSeq=tableService.queryMaxSeq();
        if(maxSeq==null||maxSeq==0){
            maxSeq=1;
        }
        table.setSeq(++maxSeq);
        table.setCreateDt(new Date());
        table.setStatus("0");
        table.setTableCode(StringUtil.genRandomNum());
       Integer id= tableService.saveTable(table);
        table.setId(id);
        return ResultGenerator.genSuccessResult(table);
    }

    @PostMapping("/updateTable")
    @ApiOperation(value = "更新表基本数据",notes = "更新表基本数据",httpMethod = "POST")
    public Result update(@RequestBody Table table) {
        if(StringUtil.isEmpty(table.getTableCode())){
            return ResultGenerator.genFailResult("未找到对应模型");
        }
        Table  tableQuery=new Table();
        tableQuery.setId(table.getId());
        Table tableActual=tableService.queryTable(tableQuery);
        table.setTableCode(tableActual.getTableCode());
        table.setCreateDt(new Date());
        table.setStatus("0");
        tableService.updateTable(table);
        return ResultGenerator.genSuccessResult();
    }
    @PostMapping("/updateTableColumn")
    @ApiOperation(value = "更新表字段数据",notes = "更新表字段数据",httpMethod = "POST")
    public Result updateTableColumn(@RequestBody Table table) {
        if(StringUtil.isEmpty(table.getTableCode())){
            return ResultGenerator.genFailResult("未找到对应模型");
        }
        Table  tableQuery=new Table();
        tableQuery.setId(table.getId());
        Table tableActual=tableService.queryTable(tableQuery);
        //设置老主键
        table.setOldKeyAutoIncrement(tableActual.getAutoIncrement());
        table.setTableCode(tableActual.getTableCode());
        table.setCreateDt(new Date());
        table.setStatus("0");
        table.setAutoIncrement(false);

        //字段排序和基础初始化
        int seq=1000;
        for (int i = 0; i < table.getTableColumnList().size(); i++) {
            TableColumn t=table.getTableColumnList().get(i);
            t.setSeq(seq);
            t.setTableCode(table.getTableCode());
            t.setTableName(table.getTableName());
            if(StringUtil.isEmpty(t.getTableColumnCode())){
                t.setTableColumnCode(StringUtil.getUUid());
            }
            //主键自增
            if(t.getAutoIncrement()){
                table.setAutoIncrement(true);
            }
            //新主键
            if(t.getIsKey()){
                String json= JSONObject.toJSONString(t);
                TableColumn curr= JSONObject.parseObject(json,TableColumn.class);
                table.setCurrKeyColumn(curr);
                table.setKeyColumn(curr.getColumnName());
            }
            //老主键
            if(t.getColumnName().equals(tableActual.getKeyColumn())){
                //深拷贝
                String json= JSONObject.toJSONString(t);
                TableColumn old=JSONObject.parseObject(json,TableColumn.class);
                table.setOldKeyColumn(old);
            }
            //设置前置字段
            if(i>0){
                TableColumn preTableColumn=table.getTableColumnList().get(i-1);
                t.setPreColumn(preTableColumn.getColumnName());
            }
            seq--;
        }

        //保存基表信息
        tableService.updateTable(table);

        //获取当前表字段
        TableColumn tableColumnQuery=new TableColumn();
        tableColumnQuery.setTableCode(table.getTableCode());
        List<TableColumn> tableColumnList=tableColumnService.queryTableColumnList(tableColumnQuery);
        if(tableColumnList!=null&&tableColumnList.size()>0){
            //修改表
            alterTable(table,tableColumnList);
        }else{
            //新增表
            addNewTable(table);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 新增表
     * @param table
     */
    private void addNewTable(Table table) {

        //存在先删除
        StringBuffer dropTableColumnDdl=new StringBuffer(" drop  table if exists ");
        dropTableColumnDdl.append(table.getTableName());
        TableDdl dropTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),dropTableColumnDdl.toString(),table.getCreateDt(),"0");
        tableDdlService.saveTableDdl(dropTableDdl);

        //生成ddl信息
       String createDdl= CodingUtil.genCreateTable(table);
       //保存到ddl表中
        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),createDdl,table.getCreateDt(),"0");
        tableDdlService.saveTableDdl(tableDdl);
        //保存字段信息
        tableColumnService.saveTableColumnBatch(table.getTableColumnList());
    }

    /**
     * 清空ddl表，并生生成创建表的ddl代码
     */
    @PostMapping("/addTableDdl")
    @ApiOperation(value = "清空ddl表，并生生成创建表的ddl代码",notes = "清空ddl表，并生生成创建表的ddl代码",httpMethod = "POST")
    public Result addTableDdl(@RequestBody Table table){
        try {
            //查询所有的表
            List<Table> tableList = tableService.queryTableList(new Table());
            /**
             * 清空sql脚本表，表中只存create表sql脚本记录
             */
            if(!CollectionUtils.isEmpty(tableList)){
                StringBuffer truncateTableDdl = new StringBuffer(" truncate table tb_yunlankeji_table_ddl ");
                TableDdl tableDdl = new TableDdl();
                tableDdl.setDdl(truncateTableDdl.toString());
                tableDdlService.execSql(tableDdl);
            }

            //查询到所有表的属性
            for (Table bean : tableList) {
                //存在先删除
                StringBuffer dropTableColumnDdl=new StringBuffer(" drop  table if exists ");
                dropTableColumnDdl.append(bean.getTableName());
                TableDdl dropTableDdl=new TableDdl(bean.getTableCode(),bean.getTableName(),dropTableColumnDdl.toString(),bean.getCreateDt(),"0");
                tableDdlService.saveTableDdl(dropTableDdl);

                //获取当前表字段
                TableColumn tableColumnQuery=new TableColumn();
                tableColumnQuery.setTableCode(bean.getTableCode());
                List<TableColumn> tableColumnList=tableColumnService.queryTableColumnList(tableColumnQuery);
                bean.setTableColumnList(tableColumnList);

                //生成ddl信息
                String createDdl= CodingUtil.genCreateTable(bean);
                //保存到ddl表中
                TableDdl tableDdl=new TableDdl(bean.getTableCode(),bean.getTableName(),createDdl,bean.getCreateDt(),"0");
                tableDdlService.saveTableDdl(tableDdl);
            }
            return ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult("系统异常，请联系管理员!");
        }
    }

    /**
     * 修改表
     * @param table
     * @param originalTableColumnList
     */
    private void alterTable(Table table, List<TableColumn> originalTableColumnList) {

        List<TableDdl> tableDdlList=new ArrayList<>();
        //字段处理
        for (int i = 0; i < table.getTableColumnList().size(); i++) {
            TableColumn tableColumn=table.getTableColumnList().get(i);
            boolean isExsist=false;
            for (int j = 0; j < originalTableColumnList.size(); j++) {
                TableColumn originalTableColumn=originalTableColumnList.get(j);
                //当前字段存在
                if(tableColumn.getTableColumnCode().equals(originalTableColumn.getTableColumnCode())){
                    isExsist=true;
                    //修改字段名称
                    if(!tableColumn.getColumnName().equals(originalTableColumn.getColumnName())){
                        StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" change column ");
                        modifyColumnDdl.append(originalTableColumn.getColumnName()).append(" ").append(tableColumn.getColumnName());
                        if("varchar".equals(tableColumn.getColumnType())){
                            modifyColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                        }else{
                            modifyColumnDdl.append(" ").append(tableColumn.getColumnType());
                        }
                        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                        tableDdlList.add(tableDdl);
                    }
                    //修改字段类型
                    if(!tableColumn.getColumnType().equals(originalTableColumn.getColumnType())){
                        StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify column ");
                        modifyColumnDdl.append(tableColumn.getColumnName());
                        if("varchar".equals(tableColumn.getColumnType())){
                            modifyColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                        }else{
                            modifyColumnDdl.append(" ").append(tableColumn.getColumnType());
                        }
                        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                        tableDdlList.add(tableDdl);
                    }
                    //修改字段长度
                    if(tableColumn.getColumnLength()!=null&&originalTableColumn.getColumnLength()!=null&&tableColumn.getColumnLength().intValue()!=originalTableColumn.getColumnLength().intValue()){
                        StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify column ");
                        modifyColumnDdl.append(tableColumn.getColumnName());
                        if("varchar".equals(tableColumn.getColumnType())){
                            modifyColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                        }else{
                            modifyColumnDdl.append(" ").append(tableColumn.getColumnType());
                        }
                        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                        tableDdlList.add(tableDdl);
                    }
                    //修改字段备注
                    if(!StringUtil.isEmpty(tableColumn.getColumnDesc())&&!tableColumn.getColumnDesc().equals(originalTableColumn.getColumnDesc())){
                        StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify column ");
                        modifyColumnDdl.append(tableColumn.getColumnName());
                        if("varchar".equals(tableColumn.getColumnType())){
                            modifyColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                        }else{
                            modifyColumnDdl.append(" ").append(tableColumn.getColumnType());
                        }
                        modifyColumnDdl.append( " comment ").append("'").append(tableColumn.getColumnDesc()).append("'");
                        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                        tableDdlList.add(tableDdl);
                    }
                    //修改字段默认值
                    boolean hasDefaultValue=false;
                    if(StringUtil.isEmpty(tableColumn.getDefaultValue())&&!StringUtil.isEmpty(originalTableColumn.getDefaultValue())){
                        hasDefaultValue=true;
                    }else if(!StringUtil.isEmpty(tableColumn.getDefaultValue())&&StringUtil.isEmpty(originalTableColumn.getDefaultValue())){
                        hasDefaultValue=true;
                    }else if(!StringUtil.isEmpty(tableColumn.getDefaultValue())&&!StringUtil.isEmpty(originalTableColumn.getDefaultValue())&&!tableColumn.getDefaultValue().equals(originalTableColumn.getDefaultValue())){
                        hasDefaultValue=true;
                    }
                    if(hasDefaultValue){
                        //修改新的默认值
                        if(!StringUtil.isEmpty(tableColumn.getDefaultValue())){
                            StringBuffer modifyColumnDefaultDdl=new StringBuffer("alter table "+table.getTableName()+" alter column ");
                            modifyColumnDefaultDdl.append(tableColumn.getColumnName()).append(" set default '").append(tableColumn.getDefaultValue()).append("'");
                            TableDdl columnDefaultDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDefaultDdl.toString(),table.getCreateDt(),"0");
                            tableDdlList.add(columnDefaultDdl);
                        }
                    }
                    //修改空值
                    if(!tableColumn.getIsNotNull().equals(originalTableColumn.getIsNotNull())){

                        if(tableColumn.getIsNotNull()){
                            //修改字段不允许空值
                            StringBuffer notNullColumnDdl=new StringBuffer("alter table "+table.getTableName()+" change column  " );
                            notNullColumnDdl.append(tableColumn.getColumnName());
                            if("varchar".equals(tableColumn.getColumnType())){
                                notNullColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                            }else{
                                notNullColumnDdl.append(" ").append(tableColumn.getColumnType());
                            }
                            notNullColumnDdl .append(" ") .append("not null ");
                            TableDdl notNullTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),notNullColumnDdl.toString(),table.getCreateDt(),"0");
                            tableDdlList.add(notNullTableDdl);

                        }else{
                            //取消非空约束
                            StringBuffer nullColumnDdl=new StringBuffer("alter table "+table.getTableName()+" change column  " );
                            nullColumnDdl.append(tableColumn.getColumnName());
                            if("varchar".equals(tableColumn.getColumnType())){
                                nullColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                            }else{
                                nullColumnDdl.append(" ").append(tableColumn.getColumnType());
                            }
                            nullColumnDdl .append(" ") .append(" null ");
                            TableDdl nullColumnDdlTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),nullColumnDdl.toString(),table.getCreateDt(),"0");
                            tableDdlList.add(nullColumnDdlTableDdl);
                        }
                    }


                    //字段排序
                    if(!StringUtil.isEmpty(tableColumn.getPreColumn())&&!tableColumn.getPreColumn().equals(originalTableColumn.getPreColumn())){
                        StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify column ");
                        modifyColumnDdl.append(tableColumn.getColumnName());
                        if("varchar".equals(tableColumn.getColumnType())){
                            modifyColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                        }else{
                            modifyColumnDdl.append(" ").append(tableColumn.getColumnType());
                        }
                        modifyColumnDdl.append(" after ").append(tableColumn.getPreColumn());
                        TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                        tableDdlList.add(tableDdl);
                    }

                }
            }
            //新增
            if(!isExsist){

                StringBuffer addColumnDdl=new StringBuffer("alter table "+table.getTableName()+" add column ").append(tableColumn.getColumnName());
               //类型
                if("varchar".equals(tableColumn.getColumnType())){
                    addColumnDdl.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
                }else{
                    addColumnDdl.append(" ").append(tableColumn.getColumnType());
                }
                //默认值
                if(!StringUtil.isEmpty(tableColumn.getDefaultValue())){
                    if("varchar".equals(tableColumn.getColumnType())){
                        addColumnDdl.append(" DEFAULT '").append(tableColumn.getDefaultValue()).append("'");
                    }else{
                        addColumnDdl.append(" DEFAULT ").append(tableColumn.getDefaultValue()) ;
                    }
                }
                //NOT NULL
                if(tableColumn.getIsNotNull()){
                    addColumnDdl.append(" not null");
                }
                //备注
                if(!StringUtil.isEmpty(tableColumn.getColumnDesc())){
                    addColumnDdl.append("  COMMENT '").append(tableColumn.getColumnDesc()).append("'");
                }
                //排序
                addColumnDdl.append(" after ").append(tableColumn.getPreColumn());

                TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),addColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(tableDdl);
            }
        }

        //删除字段
        for (int i = 0; i < originalTableColumnList.size(); i++) {
            TableColumn originalTableColumn=originalTableColumnList.get(i);
            boolean isExsist=false;
            for (int j = 0; j < table.getTableColumnList().size(); j++) {
                TableColumn tableColumn=table.getTableColumnList().get(j);
                if(tableColumn.getTableColumnCode().equals(originalTableColumn.getTableColumnCode())){
                    isExsist=true;
                }
            }
            //删除脚本
            if(!isExsist){
                StringBuffer dropColumnDdl=new StringBuffer("alter table "+table.getTableName()+" drop column ").append(originalTableColumn.getColumnName());
                TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),dropColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(tableDdl);
            }
        }

        //主键处理
        if(table.getCurrKeyColumn()!=null&&table.getOldKeyColumn()==null){
            //原来表增加主键
            if(table.getCurrKeyColumn().getAutoIncrement()){
                //自增 一定要设置为primary key.
                StringBuffer primaryKeyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify  " );
                primaryKeyColumnDdl.append(table.getKeyColumn()) .append(" int auto_increment not null  primary key ");
                TableDdl primaryKeyTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),primaryKeyColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(primaryKeyTableDdl);
                //设置从1开始
                StringBuffer autoIncrementColumnDdl=new StringBuffer("alter table "+table.getTableName()+" AUTO_INCREMENT=1 " );
                TableDdl autoIncrementDdl=new TableDdl(table.getTableCode(),table.getTableName(),autoIncrementColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(autoIncrementDdl);
            }else{
                //主键不自增
                StringBuffer primaryKeyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" add primary key  '" );
                primaryKeyColumnDdl.append(table.getKeyColumn()) .append("' ");
                TableDdl primaryKeyTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),primaryKeyColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(primaryKeyTableDdl);
            }

        }else if(table.getCurrKeyColumn()!=null&&table.getOldKeyColumn()!=null&&!table.getCurrKeyColumn().getColumnName().equals(table.getOldKeyColumn().getColumnName())){

           if(table.getOldKeyAutoIncrement()){
               //取消老字段自增
               StringBuffer dropAutoIncrementColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify "+table.getOldKeyColumn().getColumnName()+" int " );
               TableDdl dropAutoIncrementDdl=new TableDdl(table.getTableCode(),table.getTableName(),dropAutoIncrementColumnDdl.toString(),table.getCreateDt(),"0");
               tableDdlList.add(dropAutoIncrementDdl);

           }
            //删除主键
            StringBuffer delModifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" DROP PRIMARY KEY ");
            TableDdl delTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),delModifyColumnDdl.toString(),table.getCreateDt(),"0");
            tableDdlList.add(delTableDdl);
            //删除默认值
            StringBuffer dropDefaultColumnDdl=new StringBuffer("alter table "+table.getTableName()+" ");
            dropDefaultColumnDdl.append(" modify ").append(table.getOldKeyColumn().getColumnName());
            if("varchar".equals(table.getOldKeyColumn().getColumnType())){
                dropDefaultColumnDdl.append(" varchar(").append(table.getOldKeyColumn().getColumnLength()).append(")");
            }else{
                dropDefaultColumnDdl.append(" ").append(table.getOldKeyColumn().getColumnType()) ;
            }
            dropDefaultColumnDdl.append(" default  null");
            TableDdl dropDefaultColumnDdlDdl=new TableDdl(table.getTableCode(),table.getTableName(),dropDefaultColumnDdl.toString(),table.getCreateDt(),"0");
            tableDdlList.add(dropDefaultColumnDdlDdl);

            if(table.getCurrKeyColumn().getAutoIncrement()){
             //自增主键
                //自增 一定要设置为primary key.
                StringBuffer primaryKeyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" modify  " );
                primaryKeyColumnDdl.append(table.getKeyColumn()) .append(" int auto_increment not null  primary key ");
                TableDdl primaryKeyTableDdl=new TableDdl(table.getTableCode(),table.getTableName(),primaryKeyColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(primaryKeyTableDdl);
                //设置从1开始
                StringBuffer autoIncrementColumnDdl=new StringBuffer("alter table "+table.getTableName()+" AUTO_INCREMENT=1 " );
                TableDdl autoIncrementDdl=new TableDdl(table.getTableCode(),table.getTableName(),autoIncrementColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(autoIncrementDdl);
            }else{
                //添加新的主键
                StringBuffer modifyColumnDdl=new StringBuffer("alter table "+table.getTableName()+" ADD PRIMARY KEY ( `"+table.getKeyColumn()+"` ) ");
                TableDdl tableDdl=new TableDdl(table.getTableCode(),table.getTableName(),modifyColumnDdl.toString(),table.getCreateDt(),"0");
                tableDdlList.add(tableDdl);
            }

        }
        if(tableDdlList!=null&&tableDdlList.size()>0){
            tableDdlService.saveTableDdlBatch(tableDdlList);
        }

        //删除关联
        TableColumn tableColumn=new TableColumn();
        tableColumn.setTableCode(table.getTableCode());
        tableColumnService.deleteTableColumnByTableCode(tableColumn);
        //保存新的数据
        if(table.getTableColumnList()!=null&&table.getTableColumnList().size()>0){

            tableColumnService.saveTableColumnBatch(table.getTableColumnList());
        }
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
    public Result delete(@RequestBody Table table) {
        if(table.getId()==null||table.getId()==0){
            return ResultGenerator.genFailResult("未找到对应模型");
        }
        tableService.deleteTable(table);
        Table  tableQuery=new Table();
        tableQuery.setId(table.getId());
        Table tableActual=tableService.queryTable(tableQuery);
        //删除关联
        TableColumn tableColumn=new TableColumn();
        tableColumn.setTableCode(tableActual.getTableCode());
        tableColumnService.deleteTableColumnByTableCode(tableColumn);

        return ResultGenerator.genSuccessResult();
    }


    @PostMapping("/changeSeq")
    @ApiOperation(value = "修改表顺序",notes = "修改表顺序",httpMethod = "POST")
    public Result changeSeq(@RequestBody List<Table> tableList) {

        for (Table table:tableList) {
            tableService.updateTable(table);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/queryOne")
    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
    public Result queryOne(@RequestBody Table table) {
        Table  tableActual=tableService.queryTable(table);
        //查询字段明细
        TableColumn tableColumn=new TableColumn();
        tableColumn.setTableName(tableActual.getTableName());
        List<TableColumn> tableColumnList= tableColumnService.queryTableColumnList(tableColumn);
        tableActual.setTableColumnList(tableColumnList);
        return ResultGenerator.genSuccessResult(tableActual);
    }
    @PostMapping("/queryList")
    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
    public Result queryList(@RequestBody Table table) {
        List<Table>  tableList=tableService.queryTableList(table);
        return ResultGenerator.genSuccessResult(tableList);
    }


}


