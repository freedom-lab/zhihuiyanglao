package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsMedicalConsultationRecord;

@Mapper
public interface InsMedicalConsultationRecordMapper extends BaseMapper<InsMedicalConsultationRecord>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsMedicalConsultationRecord> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsMedicalConsultationRecord> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


