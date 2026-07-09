package cn.pluss.platform.service.careNursingElderStandard;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CareNursingElderStandard;

public interface CareNursingElderStandardService extends IService<CareNursingElderStandard> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CareNursingElderStandard> queryPage(Map map);

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
    public CareNursingElderStandard queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    public CareNursingElderStandard queryOne(CareNursingElderStandard careNursingElderStandard);

    /**
    * 根据条件获取集合
    * @param careNursingElderStandard
    * @return
    */
    public List<CareNursingElderStandard> queryList(CareNursingElderStandard careNursingElderStandard);

    /**
    * 新增数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    public CareNursingElderStandard insert(CareNursingElderStandard careNursingElderStandard);

    /**
    * 更新数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    public CareNursingElderStandard update(CareNursingElderStandard careNursingElderStandard);

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
    public boolean saveCareNursingElderStandardBatch(List<CareNursingElderStandard> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCareNursingElderStandardBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CareNursingElderStandard> list);
 }
