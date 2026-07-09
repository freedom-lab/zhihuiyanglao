package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthVisitRecords;

@Mapper
public interface HealthVisitRecordsMapper extends BaseMapper<HealthVisitRecords>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<HealthVisitRecords> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthVisitRecords> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


