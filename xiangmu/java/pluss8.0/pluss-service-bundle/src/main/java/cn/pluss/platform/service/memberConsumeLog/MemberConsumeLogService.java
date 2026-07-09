package cn.pluss.platform.service.memberConsumeLog;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MemberConsumeLog;

public interface MemberConsumeLogService extends IService<MemberConsumeLog> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MemberConsumeLog> queryPage(Map map);

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
    public MemberConsumeLog queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    public MemberConsumeLog queryOne(MemberConsumeLog memberConsumeLog);

    /**
    * 根据条件获取集合
    * @param memberConsumeLog
    * @return
    */
    public List<MemberConsumeLog> queryList(MemberConsumeLog memberConsumeLog);

    /**
    * 新增数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    public MemberConsumeLog insert(MemberConsumeLog memberConsumeLog);

    /**
    * 更新数据
    *
    * @param memberConsumeLog 实例对象
    * @return 实例对象
    */
    public MemberConsumeLog update(MemberConsumeLog memberConsumeLog);

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
    public boolean saveMemberConsumeLogBatch(List<MemberConsumeLog> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMemberConsumeLogBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MemberConsumeLog> list);
 }
