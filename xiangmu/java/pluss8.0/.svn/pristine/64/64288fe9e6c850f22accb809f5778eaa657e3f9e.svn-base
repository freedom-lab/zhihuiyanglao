package cn.pluss.platform.service.insTrainType;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsTrainType;

public interface InsTrainTypeService extends IService<InsTrainType> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsTrainType> queryPage(Map map);

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
    public InsTrainType queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    public InsTrainType queryOne(InsTrainType insTrainType);

    /**
    * 根据条件获取集合
    * @param insTrainType
    * @return
    */
    public List<InsTrainType> queryList(InsTrainType insTrainType);

    /**
    * 新增数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    public InsTrainType insert(InsTrainType insTrainType);

    /**
    * 更新数据
    *
    * @param insTrainType 实例对象
    * @return 实例对象
    */
    public InsTrainType update(InsTrainType insTrainType);

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
    public boolean saveInsTrainTypeBatch(List<InsTrainType> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsTrainTypeBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsTrainType> list);
 }
