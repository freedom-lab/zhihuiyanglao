package cn.pluss.platform.service.insAptSatisfactionRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsAptSatisfactionRecord;

public interface InsAptSatisfactionRecordService extends IService<InsAptSatisfactionRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsAptSatisfactionRecord> queryPage(Map map);

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
    public InsAptSatisfactionRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    public InsAptSatisfactionRecord queryOne(InsAptSatisfactionRecord insAptSatisfactionRecord);

    /**
    * 根据条件获取集合
    * @param insAptSatisfactionRecord
    * @return
    */
    public List<InsAptSatisfactionRecord> queryList(InsAptSatisfactionRecord insAptSatisfactionRecord);

    /**
    * 新增数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    public InsAptSatisfactionRecord insert(InsAptSatisfactionRecord insAptSatisfactionRecord);

    /**
    * 更新数据
    *
    * @param insAptSatisfactionRecord 实例对象
    * @return 实例对象
    */
    public InsAptSatisfactionRecord update(InsAptSatisfactionRecord insAptSatisfactionRecord);

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
    public boolean saveInsAptSatisfactionRecordBatch(List<InsAptSatisfactionRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsAptSatisfactionRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsAptSatisfactionRecord> list);
 }
