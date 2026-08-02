package cn.pluss.platform.service.insOfficePolicyInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsOfficePolicyInfo;

public interface InsOfficePolicyInfoService extends IService<InsOfficePolicyInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsOfficePolicyInfo> queryPage(Map map);

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
    public InsOfficePolicyInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    public InsOfficePolicyInfo queryOne(InsOfficePolicyInfo insOfficePolicyInfo);

    /**
    * 根据条件获取集合
    * @param insOfficePolicyInfo
    * @return
    */
    public List<InsOfficePolicyInfo> queryList(InsOfficePolicyInfo insOfficePolicyInfo);

    /**
    * 新增数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    public InsOfficePolicyInfo insert(InsOfficePolicyInfo insOfficePolicyInfo);

    /**
    * 更新数据
    *
    * @param insOfficePolicyInfo 实例对象
    * @return 实例对象
    */
    public InsOfficePolicyInfo update(InsOfficePolicyInfo insOfficePolicyInfo);

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
    public boolean saveInsOfficePolicyInfoBatch(List<InsOfficePolicyInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsOfficePolicyInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsOfficePolicyInfo> list);
 }
