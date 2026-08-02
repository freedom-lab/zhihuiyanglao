package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingTableSettings;

@Mapper
public interface InsSchedulingTableSettingsMapper extends BaseMapper<InsSchedulingTableSettings>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsSchedulingTableSettings> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingTableSettings> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


