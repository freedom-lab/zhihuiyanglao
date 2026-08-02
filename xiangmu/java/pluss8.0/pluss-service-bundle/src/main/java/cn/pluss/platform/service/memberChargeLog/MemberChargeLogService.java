package cn.pluss.platform.service.memberChargeLog;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MemberChargeLog;

public interface MemberChargeLogService extends IService<MemberChargeLog> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MemberChargeLog> queryPage(Map map);

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
    public MemberChargeLog queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    public MemberChargeLog queryOne(MemberChargeLog memberChargeLog);

    /**
    * 根据条件获取集合
    * @param memberChargeLog
    * @return
    */
    public List<MemberChargeLog> queryList(MemberChargeLog memberChargeLog);

    /**
    * 新增数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    public MemberChargeLog insert(MemberChargeLog memberChargeLog);

    /**
    * 更新数据
    *
    * @param memberChargeLog 实例对象
    * @return 实例对象
    */
    public MemberChargeLog update(MemberChargeLog memberChargeLog);

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
    public boolean saveMemberChargeLogBatch(List<MemberChargeLog> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMemberChargeLogBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MemberChargeLog> list);
 }
