package cn.pluss.platform.service.jcUserFunction;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.JcUserFunction;

public interface JcUserFunctionService extends IService<JcUserFunction> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<JcUserFunction> queryPage(Map map);

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
    public JcUserFunction queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    public JcUserFunction queryOne(JcUserFunction jcUserFunction);

    /**
    * 根据条件获取集合
    * @param jcUserFunction
    * @return
    */
    public List<JcUserFunction> queryList(JcUserFunction jcUserFunction);

    /**
    * 新增数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    public JcUserFunction insert(JcUserFunction jcUserFunction);

    /**
    * 更新数据
    *
    * @param jcUserFunction 实例对象
    * @return 实例对象
    */
    public JcUserFunction update(JcUserFunction jcUserFunction);

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
    public boolean saveJcUserFunctionBatch(List<JcUserFunction> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteJcUserFunctionBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<JcUserFunction> list);
 }
