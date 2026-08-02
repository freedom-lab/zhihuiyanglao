package cn.pluss.platform.service.insSuddenEventSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSuddenEventSetting;

public interface InsSuddenEventSettingService extends IService<InsSuddenEventSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSuddenEventSetting> queryPage(Map map);

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
    public InsSuddenEventSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    public InsSuddenEventSetting queryOne(InsSuddenEventSetting insSuddenEventSetting);

    /**
    * 根据条件获取集合
    * @param insSuddenEventSetting
    * @return
    */
    public List<InsSuddenEventSetting> queryList(InsSuddenEventSetting insSuddenEventSetting);

    /**
    * 新增数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    public InsSuddenEventSetting insert(InsSuddenEventSetting insSuddenEventSetting);

    /**
    * 更新数据
    *
    * @param insSuddenEventSetting 实例对象
    * @return 实例对象
    */
    public InsSuddenEventSetting update(InsSuddenEventSetting insSuddenEventSetting);

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
    public boolean saveInsSuddenEventSettingBatch(List<InsSuddenEventSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSuddenEventSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSuddenEventSetting> list);
 }
