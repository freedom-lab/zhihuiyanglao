package cn.pluss.platform.service.leaseContractRemind;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.LeaseContractRemind;

public interface LeaseContractRemindService extends IService<LeaseContractRemind> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<LeaseContractRemind> queryPage(Map map);

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
    public LeaseContractRemind queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    public LeaseContractRemind queryOne(LeaseContractRemind leaseContractRemind);

    /**
    * 根据条件获取集合
    * @param leaseContractRemind
    * @return
    */
    public List<LeaseContractRemind> queryList(LeaseContractRemind leaseContractRemind);

    /**
    * 新增数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    public LeaseContractRemind insert(LeaseContractRemind leaseContractRemind);

    /**
    * 更新数据
    *
    * @param leaseContractRemind 实例对象
    * @return 实例对象
    */
    public LeaseContractRemind update(LeaseContractRemind leaseContractRemind);

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
    public boolean saveLeaseContractRemindBatch(List<LeaseContractRemind> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteLeaseContractRemindBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<LeaseContractRemind> list);
 }
