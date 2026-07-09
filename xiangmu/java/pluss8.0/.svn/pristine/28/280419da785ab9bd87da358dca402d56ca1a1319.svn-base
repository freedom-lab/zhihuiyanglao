package cn.pluss.platform.service.carePaymentDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CarePaymentDetail;

public interface CarePaymentDetailService extends IService<CarePaymentDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CarePaymentDetail> queryPage(Map map);

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
    public CarePaymentDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    public CarePaymentDetail queryOne(CarePaymentDetail carePaymentDetail);

    /**
    * 根据条件获取集合
    * @param carePaymentDetail
    * @return
    */
    public List<CarePaymentDetail> queryList(CarePaymentDetail carePaymentDetail);

    /**
    * 新增数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    public CarePaymentDetail insert(CarePaymentDetail carePaymentDetail);

    /**
    * 更新数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    public CarePaymentDetail update(CarePaymentDetail carePaymentDetail);

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
    public boolean saveCarePaymentDetailBatch(List<CarePaymentDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCarePaymentDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CarePaymentDetail> list);
 }
