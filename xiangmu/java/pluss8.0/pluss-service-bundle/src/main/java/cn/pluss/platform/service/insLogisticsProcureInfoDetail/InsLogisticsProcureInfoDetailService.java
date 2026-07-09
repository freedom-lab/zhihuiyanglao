package cn.pluss.platform.service.insLogisticsProcureInfoDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsProcureInfoDetail;

public interface InsLogisticsProcureInfoDetailService extends IService<InsLogisticsProcureInfoDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsProcureInfoDetail> queryPage(Map map);

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
    public InsLogisticsProcureInfoDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfoDetail queryOne(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail);

    /**
    * 根据条件获取集合
    * @param insLogisticsProcureInfoDetail
    * @return
    */
    public List<InsLogisticsProcureInfoDetail> queryList(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail);

    /**
    * 新增数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfoDetail insert(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail);

    /**
    * 更新数据
    *
    * @param insLogisticsProcureInfoDetail 实例对象
    * @return 实例对象
    */
    public InsLogisticsProcureInfoDetail update(InsLogisticsProcureInfoDetail insLogisticsProcureInfoDetail);

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
    public boolean saveInsLogisticsProcureInfoDetailBatch(List<InsLogisticsProcureInfoDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsProcureInfoDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsProcureInfoDetail> list);
 }
