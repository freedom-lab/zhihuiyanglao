package cn.pluss.platform.mapper.base.coding;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.coding.TableDdl;

@Mapper
public interface TableDdlMapper {

    public TableDdl queryTableDdl(TableDdl tableDdl);

    public List<TableDdl> queryTableDdlList(TableDdl tableDdl);

    public void saveTableDdl(TableDdl tableDdl);

    public void updateTableDdl(TableDdl tableDdl);

    public void deleteTableDdl(TableDdl tableDdl);

    public List<TableDdl> queryTableDdlPage(Map map);

    public Integer queryTableDdlPageCount(Map map);

    public void saveTableDdlBatch(List<TableDdl>  tableDdlList);

    public void deleteTableDdlBatch(List<String> list);

    void execSql(TableDdl ddl);

    List<TableDdl> queryTableDdlListOrderByIdAsc(TableDdl tableDdl);
}


