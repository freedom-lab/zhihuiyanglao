package cn.pluss.platform.service.insElderTrackRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderTrackRecord;

public interface InsElderTrackRecordService extends IService<InsElderTrackRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderTrackRecord> queryPage(Map map);

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
    public InsElderTrackRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    public InsElderTrackRecord queryOne(InsElderTrackRecord insElderTrackRecord);

    /**
    * 根据条件获取集合
    * @param insElderTrackRecord
    * @return
    */
    public List<InsElderTrackRecord> queryList(InsElderTrackRecord insElderTrackRecord);

    /**
    * 新增数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    public InsElderTrackRecord insert(InsElderTrackRecord insElderTrackRecord);

    /**
    * 更新数据
    *
    * @param insElderTrackRecord 实例对象
    * @return 实例对象
    */
    public InsElderTrackRecord update(InsElderTrackRecord insElderTrackRecord);

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
    public boolean saveInsElderTrackRecordBatch(List<InsElderTrackRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderTrackRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderTrackRecord> list);
 }
