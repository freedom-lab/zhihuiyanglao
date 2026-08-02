package cn.pluss.platform.service.insElderContractCostStandard;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderContractCostStandard;

public interface InsElderContractCostStandardService extends IService<InsElderContractCostStandard> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderContractCostStandard> queryPage(Map map);

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
    public InsElderContractCostStandard queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    public InsElderContractCostStandard queryOne(InsElderContractCostStandard insElderContractCostStandard);

    /**
    * 根据条件获取集合
    * @param insElderContractCostStandard
    * @return
    */
    public List<InsElderContractCostStandard> queryList(InsElderContractCostStandard insElderContractCostStandard);

    /**
    * 新增数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    public InsElderContractCostStandard insert(InsElderContractCostStandard insElderContractCostStandard);

    /**
    * 更新数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    public InsElderContractCostStandard update(InsElderContractCostStandard insElderContractCostStandard);

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
    public boolean saveInsElderContractCostStandardBatch(List<InsElderContractCostStandard> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderContractCostStandardBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderContractCostStandard> list);
 }
