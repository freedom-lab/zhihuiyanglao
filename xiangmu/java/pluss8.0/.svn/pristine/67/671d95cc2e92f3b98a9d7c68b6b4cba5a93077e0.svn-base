package cn.pluss.platform.service.insElderHealthParam;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderHealthParam;

public interface InsElderHealthParamService extends IService<InsElderHealthParam> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderHealthParam> queryPage(Map map);

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
    public InsElderHealthParam queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    public InsElderHealthParam queryOne(InsElderHealthParam insElderHealthParam);

    /**
    * 根据条件获取集合
    * @param insElderHealthParam
    * @return
    */
    public List<InsElderHealthParam> queryList(InsElderHealthParam insElderHealthParam);

    /**
    * 新增数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    public InsElderHealthParam insert(InsElderHealthParam insElderHealthParam);

    /**
    * 更新数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    public InsElderHealthParam update(InsElderHealthParam insElderHealthParam);

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
    public boolean saveInsElderHealthParamBatch(List<InsElderHealthParam> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderHealthParamBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderHealthParam> list);
 }
