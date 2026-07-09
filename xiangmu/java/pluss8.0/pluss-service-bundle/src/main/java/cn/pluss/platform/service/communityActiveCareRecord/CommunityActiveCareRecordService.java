package cn.pluss.platform.service.communityActiveCareRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CommunityActiveCareRecord;

public interface CommunityActiveCareRecordService extends IService<CommunityActiveCareRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CommunityActiveCareRecord> queryPage(Map map);

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
    public CommunityActiveCareRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    public CommunityActiveCareRecord queryOne(CommunityActiveCareRecord communityActiveCareRecord);

    /**
    * 根据条件获取集合
    * @param communityActiveCareRecord
    * @return
    */
    public List<CommunityActiveCareRecord> queryList(CommunityActiveCareRecord communityActiveCareRecord);

    /**
    * 新增数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    public CommunityActiveCareRecord insert(CommunityActiveCareRecord communityActiveCareRecord);

    /**
    * 更新数据
    *
    * @param communityActiveCareRecord 实例对象
    * @return 实例对象
    */
    public CommunityActiveCareRecord update(CommunityActiveCareRecord communityActiveCareRecord);

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
    public boolean saveCommunityActiveCareRecordBatch(List<CommunityActiveCareRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCommunityActiveCareRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CommunityActiveCareRecord> list);
 }
