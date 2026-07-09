package cn.pluss.platform.service.insDonateGrantDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsDonateGrantDetail;

public interface InsDonateGrantDetailService extends IService<InsDonateGrantDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsDonateGrantDetail> queryPage(Map map);

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
    public InsDonateGrantDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    public InsDonateGrantDetail queryOne(InsDonateGrantDetail insDonateGrantDetail);

    /**
    * 根据条件获取集合
    * @param insDonateGrantDetail
    * @return
    */
    public List<InsDonateGrantDetail> queryList(InsDonateGrantDetail insDonateGrantDetail);

    /**
    * 新增数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    public InsDonateGrantDetail insert(InsDonateGrantDetail insDonateGrantDetail);

    /**
    * 更新数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    public InsDonateGrantDetail update(InsDonateGrantDetail insDonateGrantDetail);

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
    public boolean saveInsDonateGrantDetailBatch(List<InsDonateGrantDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsDonateGrantDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsDonateGrantDetail> list);
 }
