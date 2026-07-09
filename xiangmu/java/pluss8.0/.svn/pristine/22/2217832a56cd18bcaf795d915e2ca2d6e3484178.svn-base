package cn.pluss.platform.service.memberBaseInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.MemberBaseInfo;

public interface MemberBaseInfoService extends IService<MemberBaseInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<MemberBaseInfo> queryPage(Map map);

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
    public MemberBaseInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    public MemberBaseInfo queryOne(MemberBaseInfo memberBaseInfo);

    /**
    * 根据条件获取集合
    * @param memberBaseInfo
    * @return
    */
    public List<MemberBaseInfo> queryList(MemberBaseInfo memberBaseInfo);

    /**
    * 新增数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    public MemberBaseInfo insert(MemberBaseInfo memberBaseInfo);

    /**
    * 更新数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    public MemberBaseInfo update(MemberBaseInfo memberBaseInfo);

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
    public boolean saveMemberBaseInfoBatch(List<MemberBaseInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteMemberBaseInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<MemberBaseInfo> list);
 }
