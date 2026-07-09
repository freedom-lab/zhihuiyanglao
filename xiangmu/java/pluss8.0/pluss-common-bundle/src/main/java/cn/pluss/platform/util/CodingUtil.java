package cn.pluss.platform.util;

import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.model.coding.TableColumn;
/**
 * 生产对应的sql ddl代码
 */
public class CodingUtil {
    public static String genCreateTable(Table table){
        StringBuffer code=new StringBuffer();
        //创建
        code.append("create  table ").append(table.getTableName()).append("(");
        //添加字段
        for (int i=0;i<table.getTableColumnList().size();i++) {
            TableColumn tableColumn=table.getTableColumnList().get(i);
            code.append(tableColumn.getColumnName());
            //字段串处理
            if("varchar".equals(tableColumn.getColumnType())){
                code.append(" varchar(").append(tableColumn.getColumnLength()).append(")");
            }else{
                code.append(" ").append(tableColumn.getColumnType());
            }
            //处理默认值
            if(!StringUtil.isEmpty(tableColumn.getDefaultValue())){
                code.append(" DEFAULT ").append(tableColumn.getDefaultValue());
            }
            //备注
            if(!StringUtil.isEmpty(tableColumn.getColumnDesc())){
                code.append("  COMMENT '").append(tableColumn.getColumnDesc()).append("'");
            }
            //处理非空
            if(tableColumn.getIsNotNull()){
                code.append(" NOT NULL ");
            }
            //处理自增
            if(tableColumn.getAutoIncrement()){
                code.append(" AUTO_INCREMENT ");
            }


            if(i<table.getTableColumnList().size()-1){
                code.append(",");
            }

        }
        //处理主键
        if (!StringUtil.isEmpty(table.getKeyColumn())){
            code.append(" , PRIMARY KEY (").append(table.getKeyColumn()).append(")");
        }
        //关闭
        code.append(")");
        return code.toString();
    }
}
