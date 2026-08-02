package cn.pluss.platform.service.insBaseBedInfo;

import cn.pluss.platform.model.entity.InsBaseBedInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface InsBaseBedInfoService extends IService<InsBaseBedInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsBaseBedInfo> queryPage(Map map);

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
    public InsBaseBedInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    public InsBaseBedInfo queryOne(InsBaseBedInfo insBaseBedInfo);

    /**
    * 根据条件获取集合
    * @param insBaseBedInfo
    * @return
    */
    public List<InsBaseBedInfo> queryList(InsBaseBedInfo insBaseBedInfo);

    /**
    * 新增数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    public InsBaseBedInfo insert(InsBaseBedInfo insBaseBedInfo);

    /**
    * 更新数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    public InsBaseBedInfo update(InsBaseBedInfo insBaseBedInfo);

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
    public boolean saveInsBaseBedInfoBatch(List<InsBaseBedInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsBaseBedInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsBaseBedInfo> list);

    Map<Integer, Long> getBedInfoStatistics();

    List<Map<String, Object>> getBedInfoStatisticsCount();

}
