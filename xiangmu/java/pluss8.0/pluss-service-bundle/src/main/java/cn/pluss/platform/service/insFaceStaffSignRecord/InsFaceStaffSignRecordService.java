package cn.pluss.platform.service.insFaceStaffSignRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsFaceStaffSignRecord;

public interface InsFaceStaffSignRecordService extends IService<InsFaceStaffSignRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsFaceStaffSignRecord> queryPage(Map map);

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
    public InsFaceStaffSignRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    public InsFaceStaffSignRecord queryOne(InsFaceStaffSignRecord insFaceStaffSignRecord);

    /**
    * 根据条件获取集合
    * @param insFaceStaffSignRecord
    * @return
    */
    public List<InsFaceStaffSignRecord> queryList(InsFaceStaffSignRecord insFaceStaffSignRecord);

    /**
    * 新增数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    public InsFaceStaffSignRecord insert(InsFaceStaffSignRecord insFaceStaffSignRecord);

    /**
    * 更新数据
    *
    * @param insFaceStaffSignRecord 实例对象
    * @return 实例对象
    */
    public InsFaceStaffSignRecord update(InsFaceStaffSignRecord insFaceStaffSignRecord);

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
    public boolean saveInsFaceStaffSignRecordBatch(List<InsFaceStaffSignRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsFaceStaffSignRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsFaceStaffSignRecord> list);
 }
