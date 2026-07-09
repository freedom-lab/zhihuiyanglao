package cn.pluss.platform.service.insDonateRecordDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsDonateRecordDetail;

public interface InsDonateRecordDetailService extends IService<InsDonateRecordDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsDonateRecordDetail> queryPage(Map map);

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
    public InsDonateRecordDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    public InsDonateRecordDetail queryOne(InsDonateRecordDetail insDonateRecordDetail);

    /**
    * 根据条件获取集合
    * @param insDonateRecordDetail
    * @return
    */
    public List<InsDonateRecordDetail> queryList(InsDonateRecordDetail insDonateRecordDetail);

    /**
    * 新增数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    public InsDonateRecordDetail insert(InsDonateRecordDetail insDonateRecordDetail);

    /**
    * 更新数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    public InsDonateRecordDetail update(InsDonateRecordDetail insDonateRecordDetail);

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
    public boolean saveInsDonateRecordDetailBatch(List<InsDonateRecordDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsDonateRecordDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsDonateRecordDetail> list);
 }
