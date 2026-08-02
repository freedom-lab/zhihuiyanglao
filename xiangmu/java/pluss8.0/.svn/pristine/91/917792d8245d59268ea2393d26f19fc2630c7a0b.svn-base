package cn.pluss.platform.service.insMedicalDrugExecuteRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsMedicalDrugExecuteRecord;

public interface InsMedicalDrugExecuteRecordService extends IService<InsMedicalDrugExecuteRecord> {

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

    /**
    * 通过ID查询单条数据
    *
    * @param id 主键
    * @return 实例对象
    */
    public InsMedicalDrugExecuteRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalDrugExecuteRecord queryOne(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord);

    /**
    * 根据条件获取集合
    * @param insMedicalDrugExecuteRecord
    * @return
    */
    public List<InsMedicalDrugExecuteRecord> queryList(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord);

    /**
    * 新增数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalDrugExecuteRecord insert(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord);

    /**
    * 更新数据
    *
    * @param insMedicalDrugExecuteRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalDrugExecuteRecord update(InsMedicalDrugExecuteRecord insMedicalDrugExecuteRecord);

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
    public boolean saveInsMedicalDrugExecuteRecordBatch(List<InsMedicalDrugExecuteRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsMedicalDrugExecuteRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsMedicalDrugExecuteRecord> list);
 }
