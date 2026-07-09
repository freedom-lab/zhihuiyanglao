package cn.pluss.platform.service.insElderContractInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderContractInfo;

public interface InsElderContractInfoService extends IService<InsElderContractInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderContractInfo> queryPage(Map map);

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
    public InsElderContractInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    public InsElderContractInfo queryOne(InsElderContractInfo insElderContractInfo);

    /**
    * 根据条件获取集合
    * @param insElderContractInfo
    * @return
    */
    public List<InsElderContractInfo> queryList(InsElderContractInfo insElderContractInfo);

    /**
    * 新增数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    public InsElderContractInfo insert(InsElderContractInfo insElderContractInfo);

    /**
    * 更新数据
    *
    * @param insElderContractInfo 实例对象
    * @return 实例对象
    */
    public InsElderContractInfo update(InsElderContractInfo insElderContractInfo);

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
    public boolean saveInsElderContractInfoBatch(List<InsElderContractInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderContractInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderContractInfo> list);
 }
