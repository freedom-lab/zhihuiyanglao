package cn.pluss.platform.service.insNursingTemporaryRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingTemporaryRecord;

public interface InsNursingTemporaryRecordService extends IService<InsNursingTemporaryRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingTemporaryRecord> queryPage(Map map);

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
    public InsNursingTemporaryRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    public InsNursingTemporaryRecord queryOne(InsNursingTemporaryRecord insNursingTemporaryRecord);

    /**
    * 根据条件获取集合
    * @param insNursingTemporaryRecord
    * @return
    */
    public List<InsNursingTemporaryRecord> queryList(InsNursingTemporaryRecord insNursingTemporaryRecord);

    /**
    * 新增数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    public InsNursingTemporaryRecord insert(InsNursingTemporaryRecord insNursingTemporaryRecord);

    /**
    * 更新数据
    *
    * @param insNursingTemporaryRecord 实例对象
    * @return 实例对象
    */
    public InsNursingTemporaryRecord update(InsNursingTemporaryRecord insNursingTemporaryRecord);

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
    public boolean saveInsNursingTemporaryRecordBatch(List<InsNursingTemporaryRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingTemporaryRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingTemporaryRecord> list);
 }
