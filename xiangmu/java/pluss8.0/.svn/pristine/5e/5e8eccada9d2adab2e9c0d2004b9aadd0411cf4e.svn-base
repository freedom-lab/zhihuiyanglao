package cn.pluss.platform.base.coding.table.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.coding.table.TableService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.mapper.base.coding.TableMapper;

@Transactional
@Service("tableService")
public class TableServiceImpl  implements TableService {

private static final Logger logger = LoggerFactory.getLogger(TableServiceImpl.class);


    @Autowired
    private TableMapper tableMapper;

    @Override
    public Table queryTable(Table table){
        return tableMapper.queryTable(table);
    }

    @Override
    public List<Table> queryTableList(Table table){
        return tableMapper.queryTableList(table);
    }

    @Override
    public Integer saveTable(Table table){
       return tableMapper.saveTable(table);
    }

    @Override
    public void updateTable(Table table){
        tableMapper.updateTable(table);
    }

    @Override
    public void deleteTable(Table table){
        tableMapper.deleteTable(table);
    }

    @Override
    public List<Table> queryTablePage(Map map){
        return tableMapper.queryTablePage(map);
    }

    @Override
    public Integer queryTablePageCount(Map map){
        return tableMapper.queryTablePageCount(map);
    }

    @Override
    public void saveTableBatch(List<Table> tableList) {
        tableMapper.saveTableBatch(tableList);
    }

    @Override
    public void deleteTableBatch(List<String> list) {
        tableMapper.deleteTableBatch(list);
    }

    @Override
    public Integer queryMaxSeq() {
        return tableMapper.queryMaxSeq();
    }
}


