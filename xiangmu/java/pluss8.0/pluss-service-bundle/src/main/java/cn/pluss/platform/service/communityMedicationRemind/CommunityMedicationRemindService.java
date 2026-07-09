package cn.pluss.platform.service.communityMedicationRemind;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CommunityMedicationRemind;

public interface CommunityMedicationRemindService extends IService<CommunityMedicationRemind> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CommunityMedicationRemind> queryPage(Map map);

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
    public CommunityMedicationRemind queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    public CommunityMedicationRemind queryOne(CommunityMedicationRemind communityMedicationRemind);

    /**
    * 根据条件获取集合
    * @param communityMedicationRemind
    * @return
    */
    public List<CommunityMedicationRemind> queryList(CommunityMedicationRemind communityMedicationRemind);

    /**
    * 新增数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    public CommunityMedicationRemind insert(CommunityMedicationRemind communityMedicationRemind);

    /**
    * 更新数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    public CommunityMedicationRemind update(CommunityMedicationRemind communityMedicationRemind);

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
    public boolean saveCommunityMedicationRemindBatch(List<CommunityMedicationRemind> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCommunityMedicationRemindBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CommunityMedicationRemind> list);
 }
