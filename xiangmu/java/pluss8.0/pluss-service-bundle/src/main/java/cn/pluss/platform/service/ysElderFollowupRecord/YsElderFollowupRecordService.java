package cn.pluss.platform.service.ysElderFollowupRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.YsElderFollowupRecord;

public interface YsElderFollowupRecordService extends IService<YsElderFollowupRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<YsElderFollowupRecord> queryPage(Map map);

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
    public YsElderFollowupRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    public YsElderFollowupRecord queryOne(YsElderFollowupRecord ysElderFollowupRecord);

    /**
    * 根据条件获取集合
    * @param ysElderFollowupRecord
    * @return
    */
    public List<YsElderFollowupRecord> queryList(YsElderFollowupRecord ysElderFollowupRecord);

    /**
    * 新增数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    public YsElderFollowupRecord insert(YsElderFollowupRecord ysElderFollowupRecord);

    /**
    * 更新数据
    *
    * @param ysElderFollowupRecord 实例对象
    * @return 实例对象
    */
    public YsElderFollowupRecord update(YsElderFollowupRecord ysElderFollowupRecord);

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
    public boolean saveYsElderFollowupRecordBatch(List<YsElderFollowupRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteYsElderFollowupRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<YsElderFollowupRecord> list);
 }
