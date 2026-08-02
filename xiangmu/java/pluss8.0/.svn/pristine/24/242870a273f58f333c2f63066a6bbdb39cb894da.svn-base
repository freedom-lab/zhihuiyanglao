package cn.pluss.platform.service.insExpensesBillRecordDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsExpensesBillRecordDetail;

public interface InsExpensesBillRecordDetailService extends IService<InsExpensesBillRecordDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsExpensesBillRecordDetail> queryPage(Map map);

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
    public InsExpensesBillRecordDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecordDetail queryOne(InsExpensesBillRecordDetail insExpensesBillRecordDetail);

    /**
    * 根据条件获取集合
    * @param insExpensesBillRecordDetail
    * @return
    */
    public List<InsExpensesBillRecordDetail> queryList(InsExpensesBillRecordDetail insExpensesBillRecordDetail);

    /**
    * 新增数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecordDetail insert(InsExpensesBillRecordDetail insExpensesBillRecordDetail);

    /**
    * 更新数据
    *
    * @param insExpensesBillRecordDetail 实例对象
    * @return 实例对象
    */
    public InsExpensesBillRecordDetail update(InsExpensesBillRecordDetail insExpensesBillRecordDetail);

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
    public boolean saveInsExpensesBillRecordDetailBatch(List<InsExpensesBillRecordDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsExpensesBillRecordDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsExpensesBillRecordDetail> list);
 }
