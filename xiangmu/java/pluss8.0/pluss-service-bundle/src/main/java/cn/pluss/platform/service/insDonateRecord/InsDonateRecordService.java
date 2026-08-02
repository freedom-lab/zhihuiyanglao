package cn.pluss.platform.service.insDonateRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsDonateRecord;

public interface InsDonateRecordService extends IService<InsDonateRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsDonateRecord> queryPage(Map map);

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
    public InsDonateRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    public InsDonateRecord queryOne(InsDonateRecord insDonateRecord);

    /**
    * 根据条件获取集合
    * @param insDonateRecord
    * @return
    */
    public List<InsDonateRecord> queryList(InsDonateRecord insDonateRecord);

    /**
    * 新增数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    public InsDonateRecord insert(InsDonateRecord insDonateRecord);

    /**
    * 更新数据
    *
    * @param insDonateRecord 实例对象
    * @return 实例对象
    */
    public InsDonateRecord update(InsDonateRecord insDonateRecord);

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
    public boolean saveInsDonateRecordBatch(List<InsDonateRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsDonateRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsDonateRecord> list);
 }
