package cn.pluss.platform.service.insSchedulingHandoverRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSchedulingHandoverRecord;

public interface InsSchedulingHandoverRecordService extends IService<InsSchedulingHandoverRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSchedulingHandoverRecord> queryPage(Map map);

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
    public InsSchedulingHandoverRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingHandoverRecord queryOne(InsSchedulingHandoverRecord insSchedulingHandoverRecord);

    /**
    * 根据条件获取集合
    * @param insSchedulingHandoverRecord
    * @return
    */
    public List<InsSchedulingHandoverRecord> queryList(InsSchedulingHandoverRecord insSchedulingHandoverRecord);

    /**
    * 新增数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingHandoverRecord insert(InsSchedulingHandoverRecord insSchedulingHandoverRecord);

    /**
    * 更新数据
    *
    * @param insSchedulingHandoverRecord 实例对象
    * @return 实例对象
    */
    public InsSchedulingHandoverRecord update(InsSchedulingHandoverRecord insSchedulingHandoverRecord);

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
    public boolean saveInsSchedulingHandoverRecordBatch(List<InsSchedulingHandoverRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSchedulingHandoverRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSchedulingHandoverRecord> list);
 }
