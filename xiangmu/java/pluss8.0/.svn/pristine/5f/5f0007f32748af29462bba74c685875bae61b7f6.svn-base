package cn.pluss.platform.service.insStaffMemberCardInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsStaffMemberCardInfo;

public interface InsStaffMemberCardInfoService extends IService<InsStaffMemberCardInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsStaffMemberCardInfo> queryPage(Map map);

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
    public InsStaffMemberCardInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    public InsStaffMemberCardInfo queryOne(InsStaffMemberCardInfo insStaffMemberCardInfo);

    /**
    * 根据条件获取集合
    * @param insStaffMemberCardInfo
    * @return
    */
    public List<InsStaffMemberCardInfo> queryList(InsStaffMemberCardInfo insStaffMemberCardInfo);

    /**
    * 新增数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    public InsStaffMemberCardInfo insert(InsStaffMemberCardInfo insStaffMemberCardInfo);

    /**
    * 更新数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    public InsStaffMemberCardInfo update(InsStaffMemberCardInfo insStaffMemberCardInfo);

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
    public boolean saveInsStaffMemberCardInfoBatch(List<InsStaffMemberCardInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsStaffMemberCardInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsStaffMemberCardInfo> list);
 }
