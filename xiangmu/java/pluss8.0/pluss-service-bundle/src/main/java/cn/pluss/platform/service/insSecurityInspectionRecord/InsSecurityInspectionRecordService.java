package cn.pluss.platform.service.insSecurityInspectionRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSecurityInspectionRecord;

public interface InsSecurityInspectionRecordService extends IService<InsSecurityInspectionRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSecurityInspectionRecord> queryPage(Map map);

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
    public InsSecurityInspectionRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecord queryOne(InsSecurityInspectionRecord insSecurityInspectionRecord);

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRecord
    * @return
    */
    public List<InsSecurityInspectionRecord> queryList(InsSecurityInspectionRecord insSecurityInspectionRecord);

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecord insert(InsSecurityInspectionRecord insSecurityInspectionRecord);

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRecord 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecord update(InsSecurityInspectionRecord insSecurityInspectionRecord);

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
    public boolean saveInsSecurityInspectionRecordBatch(List<InsSecurityInspectionRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSecurityInspectionRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSecurityInspectionRecord> list);
 }
