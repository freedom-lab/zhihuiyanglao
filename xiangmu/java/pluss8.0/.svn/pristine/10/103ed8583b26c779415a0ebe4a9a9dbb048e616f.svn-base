package cn.pluss.platform.service.insRegisterVisitInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsRegisterVisitInfo;

public interface InsRegisterVisitInfoService extends IService<InsRegisterVisitInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsRegisterVisitInfo> queryPage(Map map);

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
    public InsRegisterVisitInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    public InsRegisterVisitInfo queryOne(InsRegisterVisitInfo insRegisterVisitInfo);

    /**
    * 根据条件获取集合
    * @param insRegisterVisitInfo
    * @return
    */
    public List<InsRegisterVisitInfo> queryList(InsRegisterVisitInfo insRegisterVisitInfo);

    /**
    * 新增数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    public InsRegisterVisitInfo insert(InsRegisterVisitInfo insRegisterVisitInfo);

    /**
    * 更新数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    public InsRegisterVisitInfo update(InsRegisterVisitInfo insRegisterVisitInfo);

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
    public boolean saveInsRegisterVisitInfoBatch(List<InsRegisterVisitInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsRegisterVisitInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsRegisterVisitInfo> list);
 }
