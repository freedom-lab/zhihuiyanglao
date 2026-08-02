package cn.pluss.platform.mapper;

import cn.pluss.platform.model.entity.InsElderContractWarning;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InsElderContractWarningMapper extends BaseMapper<InsElderContractWarning>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsElderContractWarning> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderContractWarning> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


