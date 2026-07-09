package cn.pluss.platform.mapper;

import cn.pluss.platform.model.entity.InsExpensesExpenditureRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InsExpensesExpenditureRecordMapper extends BaseMapper<InsExpensesExpenditureRecord>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsExpensesExpenditureRecord> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesExpenditureRecord> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


