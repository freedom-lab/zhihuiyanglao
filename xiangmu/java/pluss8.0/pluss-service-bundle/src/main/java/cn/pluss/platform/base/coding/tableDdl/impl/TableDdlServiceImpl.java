package cn.pluss.platform.base.coding.tableDdl.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.coding.tableDdl.TableDdlService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.coding.TableDdl;
import cn.pluss.platform.mapper.base.coding.TableDdlMapper;

@Transactional
@Service("tableDdlService")
public class TableDdlServiceImpl  implements TableDdlService {

private static final Logger logger = LoggerFactory.getLogger(TableDdlServiceImpl.class);


    @Autowired
    private TableDdlMapper tableDdlMapper;

    @Override
    public TableDdl queryTableDdl(TableDdl tableDdl){
        return tableDdlMapper.queryTableDdl(tableDdl);
    }

    @Override
    public List<TableDdl> queryTableDdlList(TableDdl tableDdl){
        return tableDdlMapper.queryTableDdlList(tableDdl);
    }

    @Override
    public void saveTableDdl(TableDdl tableDdl){
        tableDdlMapper.saveTableDdl(tableDdl);
    }

    @Override
    public void updateTableDdl(TableDdl tableDdl){
        tableDdlMapper.updateTableDdl(tableDdl);
    }

    @Override
    public void deleteTableDdl(TableDdl tableDdl){
        tableDdlMapper.deleteTableDdl(tableDdl);
    }

    @Override
    public List<TableDdl> queryTableDdlPage(Map map){
        return tableDdlMapper.queryTableDdlPage(map);
    }

    @Override
    public Integer queryTableDdlPageCount(Map map){
        return tableDdlMapper.queryTableDdlPageCount(map);
    }

    @Override
    public void saveTableDdlBatch(List<TableDdl> tableDdlList) {
        tableDdlMapper.saveTableDdlBatch(tableDdlList);
    }

    @Override
    public void deleteTableDdlBatch(List<String> list) {
        tableDdlMapper.deleteTableDdlBatch(list);
    }

    @Override
    public void execSql(TableDdl ddl) {
        tableDdlMapper.execSql(ddl);
    }

    @Override
    public List<TableDdl> queryTableDdlListOrderByIdAsc(TableDdl tableDdl) {
        return tableDdlMapper.queryTableDdlListOrderByIdAsc(tableDdl);
    }
}


