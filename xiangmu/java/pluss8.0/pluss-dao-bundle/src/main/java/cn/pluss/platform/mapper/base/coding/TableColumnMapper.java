package cn.pluss.platform.mapper.base.coding;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.coding.TableColumn;

@Mapper
public interface TableColumnMapper {

    public TableColumn queryTableColumn(TableColumn tableColumn);

    public List<TableColumn> queryTableColumnList(TableColumn tableColumn);

    public void saveTableColumn(TableColumn tableColumn);

    public void updateTableColumn(TableColumn tableColumn);

    public void deleteTableColumn(TableColumn tableColumn);

    public List<TableColumn> queryTableColumnPage(Map map);

    public Integer queryTableColumnPageCount(Map map);

    public void saveTableColumnBatch(List<TableColumn>  tableColumnList);

    public void deleteTableColumnBatch(List<String> list);

    void deleteTableColumnByTableCode(TableColumn tableColumn);
}


