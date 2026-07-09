package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentStandard;

@Mapper
public interface AssessmentStandardMapper extends BaseMapper<AssessmentStandard>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<AssessmentStandard> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentStandard> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);

    List<AssessmentStandard> queryAssessmentStandardsByTemplateId(Long id);

    List<AssessmentStandard> queryAssessmentStandardsByTemplateIds(@Param("templateIds") List<Long> templateIds);
}


