package cn.pluss.platform.service.insMedicalCheckRoomRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsMedicalCheckRoomRecord;

public interface InsMedicalCheckRoomRecordService extends IService<InsMedicalCheckRoomRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsMedicalCheckRoomRecord> queryPage(Map map);

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
    public InsMedicalCheckRoomRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalCheckRoomRecord queryOne(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord);

    /**
    * 根据条件获取集合
    * @param insMedicalCheckRoomRecord
    * @return
    */
    public List<InsMedicalCheckRoomRecord> queryList(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord);

    /**
    * 新增数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalCheckRoomRecord insert(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord);

    /**
    * 更新数据
    *
    * @param insMedicalCheckRoomRecord 实例对象
    * @return 实例对象
    */
    public InsMedicalCheckRoomRecord update(InsMedicalCheckRoomRecord insMedicalCheckRoomRecord);

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
    public boolean saveInsMedicalCheckRoomRecordBatch(List<InsMedicalCheckRoomRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsMedicalCheckRoomRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsMedicalCheckRoomRecord> list);
 }
