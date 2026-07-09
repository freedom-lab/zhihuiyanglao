package cn.pluss.platform.base.coding.tableColumn.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.coding.tableColumn.TableColumnService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.coding.TableColumn;
import cn.pluss.platform.mapper.base.coding.TableColumnMapper;

@Transactional
@Service("tableColumnService")
public class TableColumnServiceImpl  implements TableColumnService {

private static final Logger logger = LoggerFactory.getLogger(TableColumnServiceImpl.class);


    @Autowired
    private TableColumnMapper tableColumnMapper;

    @Override
    public TableColumn queryTableColumn(TableColumn tableColumn){
        return tableColumnMapper.queryTableColumn(tableColumn);
    }

    @Override
    public List<TableColumn> queryTableColumnList(TableColumn tableColumn){
        return tableColumnMapper.queryTableColumnList(tableColumn);
    }

    @Override
    public void saveTableColumn(TableColumn tableColumn){
        tableColumnMapper.saveTableColumn(tableColumn);
    }

    @Override
    public void updateTableColumn(TableColumn tableColumn){
        tableColumnMapper.updateTableColumn(tableColumn);
    }

    @Override
    public void deleteTableColumn(TableColumn tableColumn){
        tableColumnMapper.deleteTableColumn(tableColumn);
    }

    @Override
    public List<TableColumn> queryTableColumnPage(Map map){
        return tableColumnMapper.queryTableColumnPage(map);
    }

    @Override
    public Integer queryTableColumnPageCount(Map map){
        return tableColumnMapper.queryTableColumnPageCount(map);
    }

    @Override
    public void saveTableColumnBatch(List<TableColumn> tableColumnList) {
        tableColumnMapper.saveTableColumnBatch(tableColumnList);
    }

    @Override
    public void deleteTableColumnBatch(List<String> list) {
        tableColumnMapper.deleteTableColumnBatch(list);
    }

    @Override
    public void deleteTableColumnByTableCode(TableColumn tableColumn) {
        tableColumnMapper.deleteTableColumnByTableCode(tableColumn);
    }
}


