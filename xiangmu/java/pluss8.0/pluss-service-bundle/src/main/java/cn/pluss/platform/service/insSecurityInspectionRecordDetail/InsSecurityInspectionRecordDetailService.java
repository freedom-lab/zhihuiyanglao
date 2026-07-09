package cn.pluss.platform.service.insSecurityInspectionRecordDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSecurityInspectionRecordDetail;

public interface InsSecurityInspectionRecordDetailService extends IService<InsSecurityInspectionRecordDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSecurityInspectionRecordDetail> queryPage(Map map);

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
    public InsSecurityInspectionRecordDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecordDetail queryOne(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail);

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRecordDetail
    * @return
    */
    public List<InsSecurityInspectionRecordDetail> queryList(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail);

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecordDetail insert(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail);

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRecordDetail 实例对象
    * @return 实例对象
    */
    public InsSecurityInspectionRecordDetail update(InsSecurityInspectionRecordDetail insSecurityInspectionRecordDetail);

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
    public boolean saveInsSecurityInspectionRecordDetailBatch(List<InsSecurityInspectionRecordDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSecurityInspectionRecordDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSecurityInspectionRecordDetail> list);
 }
