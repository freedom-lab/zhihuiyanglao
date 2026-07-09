package cn.pluss.platform.base.coding.srobot.inf;


import cn.pluss.platform.model.coding.TableField;

import java.util.List;

public interface WebStyleService {
     void codingJs(String tableName, String packageName,
                         List<TableField> fieldList);

     void codingPage(String tableName, String packageName,
                           List<TableField> fieldList);

     void initGlobal(String tableNames, String packageName);
}
