package cn.pluss.platform.service.insLogisticsMaterialOut;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsLogisticsMaterialOut;

public interface InsLogisticsMaterialOutService extends IService<InsLogisticsMaterialOut> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsLogisticsMaterialOut> queryPage(Map map);

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
    public InsLogisticsMaterialOut queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    public InsLogisticsMaterialOut queryOne(InsLogisticsMaterialOut insLogisticsMaterialOut);

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialOut
    * @return
    */
    public List<InsLogisticsMaterialOut> queryList(InsLogisticsMaterialOut insLogisticsMaterialOut);

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    public InsLogisticsMaterialOut insert(InsLogisticsMaterialOut insLogisticsMaterialOut);

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    public InsLogisticsMaterialOut update(InsLogisticsMaterialOut insLogisticsMaterialOut);

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
    public boolean saveInsLogisticsMaterialOutBatch(List<InsLogisticsMaterialOut> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsLogisticsMaterialOutBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsLogisticsMaterialOut> list);
 }
