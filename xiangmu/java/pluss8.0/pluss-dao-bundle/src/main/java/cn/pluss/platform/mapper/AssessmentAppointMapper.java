package cn.pluss.platform.mapper;

import cn.pluss.platform.model.entity.AssessmentAppoint;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AssessmentAppointMapper extends BaseMapper<AssessmentAppoint>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<AssessmentAppoint> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<AssessmentAppoint> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);

    List<AssessmentAppoint> queryTaskPage(Map<String, Object> map);

    Integer queryTaskPageCount(Map<String, Object> map);

    List<AssessmentAppoint> queryResultPage(Map<String, Object> map);

    Integer queryResultPageCount(Map<String, Object> map);
}


