package cn.pluss.platform.service.insNursingItemInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingItemInfo;

public interface InsNursingItemInfoService extends IService<InsNursingItemInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingItemInfo> queryPage(Map map);

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
    public InsNursingItemInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    public InsNursingItemInfo queryOne(InsNursingItemInfo insNursingItemInfo);

    /**
    * 根据条件获取集合
    * @param insNursingItemInfo
    * @return
    */
    public List<InsNursingItemInfo> queryList(InsNursingItemInfo insNursingItemInfo);

    /**
    * 新增数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    public InsNursingItemInfo insert(InsNursingItemInfo insNursingItemInfo);

    /**
    * 更新数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    public InsNursingItemInfo update(InsNursingItemInfo insNursingItemInfo);

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
    public boolean saveInsNursingItemInfoBatch(List<InsNursingItemInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingItemInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingItemInfo> list);
 }
