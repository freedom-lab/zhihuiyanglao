package cn.pluss.platform.service.careNursingItemInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CareNursingItemInfo;

public interface CareNursingItemInfoService extends IService<CareNursingItemInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CareNursingItemInfo> queryPage(Map map);

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
    public CareNursingItemInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    public CareNursingItemInfo queryOne(CareNursingItemInfo careNursingItemInfo);

    /**
    * 根据条件获取集合
    * @param careNursingItemInfo
    * @return
    */
    public List<CareNursingItemInfo> queryList(CareNursingItemInfo careNursingItemInfo);

    /**
    * 新增数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    public CareNursingItemInfo insert(CareNursingItemInfo careNursingItemInfo);

    /**
    * 更新数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    public CareNursingItemInfo update(CareNursingItemInfo careNursingItemInfo);

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
    public boolean saveCareNursingItemInfoBatch(List<CareNursingItemInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCareNursingItemInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CareNursingItemInfo> list);
 }
