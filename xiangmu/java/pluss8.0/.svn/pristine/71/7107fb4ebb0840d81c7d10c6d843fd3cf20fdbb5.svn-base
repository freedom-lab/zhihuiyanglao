package cn.pluss.platform.service.insLogisticsProcureInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsProcureInfo;

public interface InsLogisticsProcureInfoService extends IService<InsLogisticsProcureInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsProcureInfo> queryPage(Map map);

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
    public InsLogisticsProcureInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfo queryOne(InsLogisticsProcureInfo insLogisticsProcureInfo);

    /**
    * 根据条件获取集合
    * @param insLogisticsProcureInfo
    * @return
    */
    public List<InsLogisticsProcureInfo> queryList(InsLogisticsProcureInfo insLogisticsProcureInfo);

    /**
    * 新增数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfo insert(InsLogisticsProcureInfo insLogisticsProcureInfo);

    /**
    * 更新数据
    *
    * @param insLogisticsProcureInfo 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfo update(InsLogisticsProcureInfo insLogisticsProcureInfo);

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
    public boolean saveInsLogisticsProcureInfoBatch(List<InsLogisticsProcureInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsProcureInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsProcureInfo> list);
 }
