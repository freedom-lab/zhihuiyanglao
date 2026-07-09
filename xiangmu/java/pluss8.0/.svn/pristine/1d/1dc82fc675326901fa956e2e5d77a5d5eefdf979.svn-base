package cn.pluss.platform.service.insElderInsureInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderInsureInfo;

public interface InsElderInsureInfoService extends IService<InsElderInsureInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderInsureInfo> queryPage(Map map);

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
    public InsElderInsureInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    public InsElderInsureInfo queryOne(InsElderInsureInfo insElderInsureInfo);

    /**
    * 根据条件获取集合
    * @param insElderInsureInfo
    * @return
    */
    public List<InsElderInsureInfo> queryList(InsElderInsureInfo insElderInsureInfo);

    /**
    * 新增数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    public InsElderInsureInfo insert(InsElderInsureInfo insElderInsureInfo);

    /**
    * 更新数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    public InsElderInsureInfo update(InsElderInsureInfo insElderInsureInfo);

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
    public boolean saveInsElderInsureInfoBatch(List<InsElderInsureInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderInsureInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderInsureInfo> list);
 }
