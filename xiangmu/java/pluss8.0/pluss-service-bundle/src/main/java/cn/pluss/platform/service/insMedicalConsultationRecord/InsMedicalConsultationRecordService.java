package cn.pluss.platform.service.insMedicalConsultationRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsMedicalConsultationRecord;

public interface InsMedicalConsultationRecordService extends IService<InsMedicalConsultationRecord> {

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

    /**
    * 通过ID查询单条数据
    *
    * @param id 主键
    * @return 实例对象
    */
    public InsMedicalConsultationRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalConsultationRecord queryOne(InsMedicalConsultationRecord insMedicalConsultationRecord);

    /**
    * 根据条件获取集合
    * @param insMedicalConsultationRecord
    * @return
    */
    public List<InsMedicalConsultationRecord> queryList(InsMedicalConsultationRecord insMedicalConsultationRecord);

    /**
    * 新增数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalConsultationRecord insert(InsMedicalConsultationRecord insMedicalConsultationRecord);

    /**
    * 更新数据
    *
    * @param insMedicalConsultationRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalConsultationRecord update(InsMedicalConsultationRecord insMedicalConsultationRecord);

    /**
    * 通过主键删除数据
    *
    * @param id 主键
    * @return 是否成功
    */
    public boolean deleteById(Long id);

    /**
    * 批量新增
    * @param insertList
    */
    public boolean saveInsMedicalConsultationRecordBatch(List<InsMedicalConsultationRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsMedicalConsultationRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsMedicalConsultationRecord> list);
 }
