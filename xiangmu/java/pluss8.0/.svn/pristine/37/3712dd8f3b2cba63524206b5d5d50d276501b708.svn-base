package cn.pluss.platform.base.coding.srobot.inf;

import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.model.coding.TableField;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SrobotService {

    /**
     * 创建表
     * @param
     * @return
     */
    void createTable(Table table);
    /**
     * 修改数据库的表名字
     * @param originalTableName
     * @param newTableName
     * @return
     */
    int alterTableName(@Param("originalTableName") String originalTableName,
                       @Param("newTableName") String newTableName);

    /**
     * 从指定数据库中，查询是否存在某张表
     * @param dataBaseName
     * @param tableName
     * @return
     */
    String isTargetTableExistInDB(@Param("dataBaseName") String dataBaseName,
                                  @Param("tableName") String tableName);

    /**
     * 删除表
     * @param table
     */
    void dropTable(Table table);

    /**
     * 查询表字段
     * @param tableField
     * @return
     */
    List<TableField> queryTableField(TableField tableField);
}
