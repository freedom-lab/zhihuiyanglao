package cn.pluss.platform.service.insNursingGroupMember;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingGroupMember;

public interface InsNursingGroupMemberService extends IService<InsNursingGroupMember> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingGroupMember> queryPage(Map map);

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
    public InsNursingGroupMember queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    public InsNursingGroupMember queryOne(InsNursingGroupMember insNursingGroupMember);

    /**
    * 根据条件获取集合
    * @param insNursingGroupMember
    * @return
    */
    public List<InsNursingGroupMember> queryList(InsNursingGroupMember insNursingGroupMember);

    /**
    * 新增数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    public InsNursingGroupMember insert(InsNursingGroupMember insNursingGroupMember);

    /**
    * 更新数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    public InsNursingGroupMember update(InsNursingGroupMember insNursingGroupMember);

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
    public boolean saveInsNursingGroupMemberBatch(List<InsNursingGroupMember> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingGroupMemberBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingGroupMember> list);
 }
