package cn.pluss.platform.service.insElderRetreatInfo;

import cn.pluss.platform.model.entity.InsElderRetreatInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface InsElderRetreatInfoService extends IService<InsElderRetreatInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderRetreatInfo> queryPage(Map map);

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
    public InsElderRetreatInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    public InsElderRetreatInfo queryOne(InsElderRetreatInfo insElderRetreatInfo);

    /**
    * 根据条件获取集合
    * @param insElderRetreatInfo
    * @return
    */
    public List<InsElderRetreatInfo> queryList(InsElderRetreatInfo insElderRetreatInfo);

    /**
    * 新增数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    public InsElderRetreatInfo insert(InsElderRetreatInfo insElderRetreatInfo);

    /**
    * 更新数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    public InsElderRetreatInfo update(InsElderRetreatInfo insElderRetreatInfo);

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
    public boolean saveInsElderRetreatInfoBatch(List<InsElderRetreatInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderRetreatInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderRetreatInfo> list);

}
