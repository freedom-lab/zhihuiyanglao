package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.AssessmentOption;

@Mapper
public interface AssessmentOptionMapper extends BaseMapper<AssessmentOption>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<AssessmentOption> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentOption> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);

    /**
    * 根据问题ID列表批量查询选项
    * @param questionIds
    * @return
    */
    List<AssessmentOption> selectByQuestionIds(List<Long> questionIds);
}


