package cn.pluss.platform.base.coding.srobot.impl;

import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.model.coding.TableField;
import cn.pluss.platform.mapper.base.coding.SrobotMapper;
import cn.pluss.platform.base.coding.srobot.inf.SrobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("srobotService")
public class SrobotServiceImpl implements SrobotService {

    @Autowired
    private SrobotMapper srobotMapper;

    @Override
    public void createTable(Table table) {
        srobotMapper.createTable(table);
    }

    @Override
    public int alterTableName(String originalTableName, String newTableName) {
        return srobotMapper.alterTableName( originalTableName,  newTableName);
    }

    @Override
    public String isTargetTableExistInDB(String dataBaseName, String tableName) {
        return srobotMapper.isTargetTableExistInDB( dataBaseName,  tableName);
    }

    @Override
    public void dropTable(Table table) {
        srobotMapper.dropTable(table);
    }

    @Override
    public List<TableField> queryTableField(TableField tableField) {
        return srobotMapper.queryTableField(tableField);
    }
}
