package cn.pluss.platform.service.careAccidentRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CareAccidentRecord;

public interface CareAccidentRecordService extends IService<CareAccidentRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CareAccidentRecord> queryPage(Map map);

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
    public CareAccidentRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    public CareAccidentRecord queryOne(CareAccidentRecord careAccidentRecord);

    /**
    * 根据条件获取集合
    * @param careAccidentRecord
    * @return
    */
    public List<CareAccidentRecord> queryList(CareAccidentRecord careAccidentRecord);

    /**
    * 新增数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    public CareAccidentRecord insert(CareAccidentRecord careAccidentRecord);

    /**
    * 更新数据
    *
    * @param careAccidentRecord 实例对象
    * @return 实例对象
    */
    public CareAccidentRecord update(CareAccidentRecord careAccidentRecord);

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
    public boolean saveCareAccidentRecordBatch(List<CareAccidentRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCareAccidentRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CareAccidentRecord> list);
 }
