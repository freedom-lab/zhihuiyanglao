package cn.pluss.platform.service.insSecurityDangersCheck;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSecurityDangersCheck;

public interface InsSecurityDangersCheckService extends IService<InsSecurityDangersCheck> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSecurityDangersCheck> queryPage(Map map);

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
    public InsSecurityDangersCheck queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersCheck queryOne(InsSecurityDangersCheck insSecurityDangersCheck);

    /**
    * 根据条件获取集合
    * @param insSecurityDangersCheck
    * @return
    */
    public List<InsSecurityDangersCheck> queryList(InsSecurityDangersCheck insSecurityDangersCheck);

    /**
    * 新增数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersCheck insert(InsSecurityDangersCheck insSecurityDangersCheck);

    /**
    * 更新数据
    *
    * @param insSecurityDangersCheck 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersCheck update(InsSecurityDangersCheck insSecurityDangersCheck);

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
    public boolean saveInsSecurityDangersCheckBatch(List<InsSecurityDangersCheck> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSecurityDangersCheckBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSecurityDangersCheck> list);
 }
