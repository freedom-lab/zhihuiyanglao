package cn.pluss.platform.mapper;

import cn.pluss.platform.model.entity.BladeDict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BladeDictMapper extends BaseMapper<BladeDict>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<BladeDict> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<BladeDict> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


