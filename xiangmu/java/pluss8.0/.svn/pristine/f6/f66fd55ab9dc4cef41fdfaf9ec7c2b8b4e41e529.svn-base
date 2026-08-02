package cn.pluss.platform.service.communityMedicationDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CommunityMedicationDetail;

public interface CommunityMedicationDetailService extends IService<CommunityMedicationDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CommunityMedicationDetail> queryPage(Map map);

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
    public CommunityMedicationDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    public CommunityMedicationDetail queryOne(CommunityMedicationDetail communityMedicationDetail);

    /**
    * 根据条件获取集合
    * @param communityMedicationDetail
    * @return
    */
    public List<CommunityMedicationDetail> queryList(CommunityMedicationDetail communityMedicationDetail);

    /**
    * 新增数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    public CommunityMedicationDetail insert(CommunityMedicationDetail communityMedicationDetail);

    /**
    * 更新数据
    *
    * @param communityMedicationDetail 实例对象
    * @return 实例对象
    */
    public CommunityMedicationDetail update(CommunityMedicationDetail communityMedicationDetail);

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
    public boolean saveCommunityMedicationDetailBatch(List<CommunityMedicationDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCommunityMedicationDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CommunityMedicationDetail> list);
 }
