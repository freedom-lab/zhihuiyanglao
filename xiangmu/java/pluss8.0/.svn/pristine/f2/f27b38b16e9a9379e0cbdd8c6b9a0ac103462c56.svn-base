package cn.pluss.platform.service.insDonateInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsDonateInfo;

public interface InsDonateInfoService extends IService<InsDonateInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsDonateInfo> queryPage(Map map);

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
    public InsDonateInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    public InsDonateInfo queryOne(InsDonateInfo insDonateInfo);

    /**
    * 根据条件获取集合
    * @param insDonateInfo
    * @return
    */
    public List<InsDonateInfo> queryList(InsDonateInfo insDonateInfo);

    /**
    * 新增数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    public InsDonateInfo insert(InsDonateInfo insDonateInfo);

    /**
    * 更新数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    public InsDonateInfo update(InsDonateInfo insDonateInfo);

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
    public boolean saveInsDonateInfoBatch(List<InsDonateInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsDonateInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsDonateInfo> list);
 }
