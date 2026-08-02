package cn.pluss.platform.service.insSuddenComplaintRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSuddenComplaintRecord;

public interface InsSuddenComplaintRecordService extends IService<InsSuddenComplaintRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSuddenComplaintRecord> queryPage(Map map);

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
    public InsSuddenComplaintRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    public InsSuddenComplaintRecord queryOne(InsSuddenComplaintRecord insSuddenComplaintRecord);

    /**
    * 根据条件获取集合
    * @param insSuddenComplaintRecord
    * @return
    */
    public List<InsSuddenComplaintRecord> queryList(InsSuddenComplaintRecord insSuddenComplaintRecord);

    /**
    * 新增数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    public InsSuddenComplaintRecord insert(InsSuddenComplaintRecord insSuddenComplaintRecord);

    /**
    * 更新数据
    *
    * @param insSuddenComplaintRecord 实例对象
    * @return 实例对象
    */
    public InsSuddenComplaintRecord update(InsSuddenComplaintRecord insSuddenComplaintRecord);

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
    public boolean saveInsSuddenComplaintRecordBatch(List<InsSuddenComplaintRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSuddenComplaintRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSuddenComplaintRecord> list);
 }
