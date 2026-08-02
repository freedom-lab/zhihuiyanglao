package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesChangeFoodRecord;

@Mapper
public interface InsExpensesChangeFoodRecordMapper extends BaseMapper<InsExpensesChangeFoodRecord>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsExpensesChangeFoodRecord> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesChangeFoodRecord> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


