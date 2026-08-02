package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CommunityMedicationDetail;

@Mapper
public interface CommunityMedicationDetailMapper extends BaseMapper<CommunityMedicationDetail>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<CommunityMedicationDetail> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CommunityMedicationDetail> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


