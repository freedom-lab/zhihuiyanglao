package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingTableDetail;

@Mapper
public interface InsSchedulingTableDetailMapper extends BaseMapper<InsSchedulingTableDetail>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsSchedulingTableDetail> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingTableDetail> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


