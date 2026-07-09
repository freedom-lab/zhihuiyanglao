package cn.pluss.platform.service.careLeaveRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CareLeaveRecord;

public interface CareLeaveRecordService extends IService<CareLeaveRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CareLeaveRecord> queryPage(Map map);

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
    public CareLeaveRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    public CareLeaveRecord queryOne(CareLeaveRecord careLeaveRecord);

    /**
    * 根据条件获取集合
    * @param careLeaveRecord
    * @return
    */
    public List<CareLeaveRecord> queryList(CareLeaveRecord careLeaveRecord);

    /**
    * 新增数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    public CareLeaveRecord insert(CareLeaveRecord careLeaveRecord);

    /**
    * 更新数据
    *
    * @param careLeaveRecord 实例对象
    * @return 实例对象
    */
    public CareLeaveRecord update(CareLeaveRecord careLeaveRecord);

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
    public boolean saveCareLeaveRecordBatch(List<CareLeaveRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCareLeaveRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CareLeaveRecord> list);
 }
