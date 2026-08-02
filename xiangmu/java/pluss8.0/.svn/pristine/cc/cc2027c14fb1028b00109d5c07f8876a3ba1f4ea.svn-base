package cn.pluss.platform.service.insNursingGroupInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingGroupInfo;

public interface InsNursingGroupInfoService extends IService<InsNursingGroupInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingGroupInfo> queryPage(Map map);

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
    public InsNursingGroupInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    public InsNursingGroupInfo queryOne(InsNursingGroupInfo insNursingGroupInfo);

    /**
    * 根据条件获取集合
    * @param insNursingGroupInfo
    * @return
    */
    public List<InsNursingGroupInfo> queryList(InsNursingGroupInfo insNursingGroupInfo);

    /**
    * 新增数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    public InsNursingGroupInfo insert(InsNursingGroupInfo insNursingGroupInfo);

    /**
    * 更新数据
    *
    * @param insNursingGroupInfo 实例对象
    * @return 实例对象
    */
    public InsNursingGroupInfo update(InsNursingGroupInfo insNursingGroupInfo);

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
    public boolean saveInsNursingGroupInfoBatch(List<InsNursingGroupInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingGroupInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingGroupInfo> list);
 }
