package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentQuestion;

@Mapper
public interface AssessmentQuestionMapper extends BaseMapper<AssessmentQuestion>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<AssessmentQuestion> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentQuestion> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);

    List<AssessmentQuestion> queryAssessmentQuestionsByTemplateId(AssessmentQuestion assessmentQuestion);

    List<AssessmentQuestion> queryAssessmentQuestionsByTemplateIds(@Param("templateIds") List<Long> templateIds);
}


