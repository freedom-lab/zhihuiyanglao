package cn.pluss.platform.mapper.base.coding;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.coding.Table;

@Mapper
public interface TableMapper {

    public Table queryTable(Table table);

    public List<Table> queryTableList(Table table);

    public Integer saveTable(Table table);

    public void updateTable(Table table);

    public void deleteTable(Table table);

    public List<Table> queryTablePage(Map map);

    public Integer queryTablePageCount(Map map);

    public void saveTableBatch(List<Table>  tableList);

    public void deleteTableBatch(List<String> list);

    Integer queryMaxSeq();
}


