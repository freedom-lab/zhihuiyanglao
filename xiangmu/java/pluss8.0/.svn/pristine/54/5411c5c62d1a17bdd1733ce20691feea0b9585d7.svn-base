package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderCheckInfo;

@Mapper
public interface InsElderCheckInfoMapper extends BaseMapper<InsElderCheckInfo>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsElderCheckInfo> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderCheckInfo> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


