package cn.pluss.platform.service.insSuddenRepairInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSuddenRepairInfo;

public interface InsSuddenRepairInfoService extends IService<InsSuddenRepairInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSuddenRepairInfo> queryPage(Map map);

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
    public InsSuddenRepairInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    public InsSuddenRepairInfo queryOne(InsSuddenRepairInfo insSuddenRepairInfo);

    /**
    * 根据条件获取集合
    * @param insSuddenRepairInfo
    * @return
    */
    public List<InsSuddenRepairInfo> queryList(InsSuddenRepairInfo insSuddenRepairInfo);

    /**
    * 新增数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    public InsSuddenRepairInfo insert(InsSuddenRepairInfo insSuddenRepairInfo);

    /**
    * 更新数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    public InsSuddenRepairInfo update(InsSuddenRepairInfo insSuddenRepairInfo);

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
    public boolean saveInsSuddenRepairInfoBatch(List<InsSuddenRepairInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSuddenRepairInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSuddenRepairInfo> list);
 }
