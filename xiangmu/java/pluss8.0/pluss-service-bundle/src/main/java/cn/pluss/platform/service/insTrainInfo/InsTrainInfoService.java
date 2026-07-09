package cn.pluss.platform.service.insTrainInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsTrainInfo;

public interface InsTrainInfoService extends IService<InsTrainInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsTrainInfo> queryPage(Map map);

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
    public InsTrainInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    public InsTrainInfo queryOne(InsTrainInfo insTrainInfo);

    /**
    * 根据条件获取集合
    * @param insTrainInfo
    * @return
    */
    public List<InsTrainInfo> queryList(InsTrainInfo insTrainInfo);

    /**
    * 新增数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    public InsTrainInfo insert(InsTrainInfo insTrainInfo);

    /**
    * 更新数据
    *
    * @param insTrainInfo 实例对象
    * @return 实例对象
    */
    public InsTrainInfo update(InsTrainInfo insTrainInfo);

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
    public boolean saveInsTrainInfoBatch(List<InsTrainInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsTrainInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsTrainInfo> list);
 }
