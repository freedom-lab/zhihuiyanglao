package cn.pluss.platform.service.insOfficeNewsInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsOfficeNewsInfo;

public interface InsOfficeNewsInfoService extends IService<InsOfficeNewsInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsOfficeNewsInfo> queryPage(Map map);

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
    public InsOfficeNewsInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeNewsInfo queryOne(InsOfficeNewsInfo insOfficeNewsInfo);

    /**
    * 根据条件获取集合
    * @param insOfficeNewsInfo
    * @return
    */
    public List<InsOfficeNewsInfo> queryList(InsOfficeNewsInfo insOfficeNewsInfo);

    /**
    * 新增数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeNewsInfo insert(InsOfficeNewsInfo insOfficeNewsInfo);

    /**
    * 更新数据
    *
    * @param insOfficeNewsInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeNewsInfo update(InsOfficeNewsInfo insOfficeNewsInfo);

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
    public boolean saveInsOfficeNewsInfoBatch(List<InsOfficeNewsInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsOfficeNewsInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsOfficeNewsInfo> list);
 }
