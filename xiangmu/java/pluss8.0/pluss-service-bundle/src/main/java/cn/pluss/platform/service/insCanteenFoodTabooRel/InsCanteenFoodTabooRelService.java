package cn.pluss.platform.service.insCanteenFoodTabooRel;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenFoodTabooRel;

public interface InsCanteenFoodTabooRelService extends IService<InsCanteenFoodTabooRel> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenFoodTabooRel> queryPage(Map map);

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
    public InsCanteenFoodTabooRel queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodTabooRel queryOne(InsCanteenFoodTabooRel insCanteenFoodTabooRel);

    /**
    * 根据条件获取集合
    * @param insCanteenFoodTabooRel
    * @return
    */
    public List<InsCanteenFoodTabooRel> queryList(InsCanteenFoodTabooRel insCanteenFoodTabooRel);

    /**
    * 新增数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodTabooRel insert(InsCanteenFoodTabooRel insCanteenFoodTabooRel);

    /**
    * 更新数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    public InsCanteenFoodTabooRel update(InsCanteenFoodTabooRel insCanteenFoodTabooRel);

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
    public boolean saveInsCanteenFoodTabooRelBatch(List<InsCanteenFoodTabooRel> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenFoodTabooRelBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenFoodTabooRel> list);
 }
