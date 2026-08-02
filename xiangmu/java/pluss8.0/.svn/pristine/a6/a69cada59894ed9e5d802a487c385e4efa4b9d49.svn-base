package cn.pluss.platform.service.insTrainRelease;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsTrainRelease;

public interface InsTrainReleaseService extends IService<InsTrainRelease> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsTrainRelease> queryPage(Map map);

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
    public InsTrainRelease queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    public InsTrainRelease queryOne(InsTrainRelease insTrainRelease);

    /**
    * 根据条件获取集合
    * @param insTrainRelease
    * @return
    */
    public List<InsTrainRelease> queryList(InsTrainRelease insTrainRelease);

    /**
    * 新增数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    public InsTrainRelease insert(InsTrainRelease insTrainRelease);

    /**
    * 更新数据
    *
    * @param insTrainRelease 实例对象
    * @return 实例对象
    */
    public InsTrainRelease update(InsTrainRelease insTrainRelease);

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
    public boolean saveInsTrainReleaseBatch(List<InsTrainRelease> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsTrainReleaseBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsTrainRelease> list);
 }
