package cn.pluss.platform.service.smartCareParam;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.SmartCareParam;

public interface SmartCareParamService extends IService<SmartCareParam> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<SmartCareParam> queryPage(Map map);

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
    public SmartCareParam queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    public SmartCareParam queryOne(SmartCareParam smartCareParam);

    /**
    * 根据条件获取集合
    * @param smartCareParam
    * @return
    */
    public List<SmartCareParam> queryList(SmartCareParam smartCareParam);

    /**
    * 新增数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    public SmartCareParam insert(SmartCareParam smartCareParam);

    /**
    * 更新数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    public SmartCareParam update(SmartCareParam smartCareParam);

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
    public boolean saveSmartCareParamBatch(List<SmartCareParam> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteSmartCareParamBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<SmartCareParam> list);
 }
