package cn.pluss.platform.service.insElderCheckAudit;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderCheckAudit;

public interface InsElderCheckAuditService extends IService<InsElderCheckAudit> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderCheckAudit> queryPage(Map map);

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
    public InsElderCheckAudit queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    public InsElderCheckAudit queryOne(InsElderCheckAudit insElderCheckAudit);

    /**
    * 根据条件获取集合
    * @param insElderCheckAudit
    * @return
    */
    public List<InsElderCheckAudit> queryList(InsElderCheckAudit insElderCheckAudit);

    /**
    * 新增数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    public InsElderCheckAudit insert(InsElderCheckAudit insElderCheckAudit);

    /**
    * 更新数据
    *
    * @param insElderCheckAudit 实例对象
    * @return 实例对象
    */
    public InsElderCheckAudit update(InsElderCheckAudit insElderCheckAudit);

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
    public boolean saveInsElderCheckAuditBatch(List<InsElderCheckAudit> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderCheckAuditBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderCheckAudit> list);
 }
