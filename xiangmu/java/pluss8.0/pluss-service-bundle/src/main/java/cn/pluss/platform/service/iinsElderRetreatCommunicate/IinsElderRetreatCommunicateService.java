package cn.pluss.platform.service.iinsElderRetreatCommunicate;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.IinsElderRetreatCommunicate;

public interface IinsElderRetreatCommunicateService extends IService<IinsElderRetreatCommunicate> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<IinsElderRetreatCommunicate> queryPage(Map map);

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
    public IinsElderRetreatCommunicate queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    public IinsElderRetreatCommunicate queryOne(IinsElderRetreatCommunicate iinsElderRetreatCommunicate);

    /**
    * 根据条件获取集合
    * @param iinsElderRetreatCommunicate
    * @return
    */
    public List<IinsElderRetreatCommunicate> queryList(IinsElderRetreatCommunicate iinsElderRetreatCommunicate);

    /**
    * 新增数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    public IinsElderRetreatCommunicate insert(IinsElderRetreatCommunicate iinsElderRetreatCommunicate);

    /**
    * 更新数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    public IinsElderRetreatCommunicate update(IinsElderRetreatCommunicate iinsElderRetreatCommunicate);

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
    public boolean saveIinsElderRetreatCommunicateBatch(List<IinsElderRetreatCommunicate> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteIinsElderRetreatCommunicateBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<IinsElderRetreatCommunicate> list);
 }
