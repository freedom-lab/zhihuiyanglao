package ${packageName}.service.${beanNameSmall};

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import ${packageName}.model.entity.${beanName};

public interface ${beanName}Service extends IService<${beanName}> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<${beanName}> queryPage(Map map);

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
    public ${beanName} queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    public ${beanName} queryOne(${beanName} ${beanNameSmall});

    /**
    * 根据条件获取集合
    * @param ${beanNameSmall}
    * @return
    */
    public List<${beanName}> queryList(${beanName} ${beanNameSmall});

    /**
    * 新增数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    public ${beanName} insert(${beanName} ${beanNameSmall});

    /**
    * 更新数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    public ${beanName} update(${beanName} ${beanNameSmall});

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
    public boolean save${beanName}Batch(List<${beanName}> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer delete${beanName}Batch(List<Long> delList);
 }