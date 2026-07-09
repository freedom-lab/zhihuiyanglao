package cn.pluss.platform.service.insCanteenDailyRecipe;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenDailyRecipe;

public interface InsCanteenDailyRecipeService extends IService<InsCanteenDailyRecipe> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenDailyRecipe> queryPage(Map map);

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
    public InsCanteenDailyRecipe queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    public InsCanteenDailyRecipe queryOne(InsCanteenDailyRecipe insCanteenDailyRecipe);

    /**
    * 根据条件获取集合
    * @param insCanteenDailyRecipe
    * @return
    */
    public List<InsCanteenDailyRecipe> queryList(InsCanteenDailyRecipe insCanteenDailyRecipe);

    /**
    * 新增数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    public InsCanteenDailyRecipe insert(InsCanteenDailyRecipe insCanteenDailyRecipe);

    /**
    * 更新数据
    *
    * @param insCanteenDailyRecipe 实例对象
    * @return 实例对象
    */
    public InsCanteenDailyRecipe update(InsCanteenDailyRecipe insCanteenDailyRecipe);

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
    public boolean saveInsCanteenDailyRecipeBatch(List<InsCanteenDailyRecipe> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenDailyRecipeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenDailyRecipe> list);
 }
