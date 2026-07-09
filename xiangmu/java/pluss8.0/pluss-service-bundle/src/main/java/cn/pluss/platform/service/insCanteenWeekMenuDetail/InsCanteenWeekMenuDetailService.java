package cn.pluss.platform.service.insCanteenWeekMenuDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsCanteenWeekMenuDetail;

public interface InsCanteenWeekMenuDetailService extends IService<InsCanteenWeekMenuDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsCanteenWeekMenuDetail> queryPage(Map map);

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
    public InsCanteenWeekMenuDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenuDetail queryOne(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail);

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenuDetail
    * @return
    */
    public List<InsCanteenWeekMenuDetail> queryList(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail);

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenuDetail insert(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail);

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    public InsCanteenWeekMenuDetail update(InsCanteenWeekMenuDetail insCanteenWeekMenuDetail);

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
    public boolean saveInsCanteenWeekMenuDetailBatch(List<InsCanteenWeekMenuDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsCanteenWeekMenuDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsCanteenWeekMenuDetail> list);
 }
