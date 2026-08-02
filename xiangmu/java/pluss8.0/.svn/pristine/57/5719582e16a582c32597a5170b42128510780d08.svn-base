package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsTrainRelease;

@Mapper
public interface InsTrainReleaseMapper extends BaseMapper<InsTrainRelease>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsTrainRelease> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsTrainRelease> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


