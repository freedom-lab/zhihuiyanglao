package cn.pluss.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsMedicalDrugExecuteRecord;

@Mapper
public interface InsMedicalDrugExecuteRecordMapper extends BaseMapper<InsMedicalDrugExecuteRecord>{
    /**
    * 批量新增
    * @param list
    * @return
    */
    void insertBatch(List<InsMedicalDrugExecuteRecord> list);

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsMedicalDrugExecuteRecord> queryPage(Map map);

    /**
    * 分页查询计数
    * @param map
    * @return
    */
    public Integer queryPageCount(Map map);
}


