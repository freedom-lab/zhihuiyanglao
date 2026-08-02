package cn.pluss.platform.service.insNursingChangeNursingRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingChangeNursingRecord;

public interface InsNursingChangeNursingRecordService extends IService<InsNursingChangeNursingRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingChangeNursingRecord> queryPage(Map map);

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
    public InsNursingChangeNursingRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    public InsNursingChangeNursingRecord queryOne(InsNursingChangeNursingRecord insNursingChangeNursingRecord);

    /**
    * 根据条件获取集合
    * @param insNursingChangeNursingRecord
    * @return
    */
    public List<InsNursingChangeNursingRecord> queryList(InsNursingChangeNursingRecord insNursingChangeNursingRecord);

    /**
    * 新增数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    public InsNursingChangeNursingRecord insert(InsNursingChangeNursingRecord insNursingChangeNursingRecord);

    /**
    * 更新数据
    *
    * @param insNursingChangeNursingRecord 实例对象
    * @return 实例对象
    */
    public InsNursingChangeNursingRecord update(InsNursingChangeNursingRecord insNursingChangeNursingRecord);

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
    public boolean saveInsNursingChangeNursingRecordBatch(List<InsNursingChangeNursingRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingChangeNursingRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingChangeNursingRecord> list);
 }
