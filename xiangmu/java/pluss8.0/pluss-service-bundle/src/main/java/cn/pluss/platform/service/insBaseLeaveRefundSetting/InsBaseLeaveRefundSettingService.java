package cn.pluss.platform.service.insBaseLeaveRefundSetting;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsBaseLeaveRefundSetting;

public interface InsBaseLeaveRefundSettingService extends IService<InsBaseLeaveRefundSetting> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsBaseLeaveRefundSetting> queryPage(Map map);

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
    public InsBaseLeaveRefundSetting queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    public InsBaseLeaveRefundSetting queryOne(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting);

    /**
    * 根据条件获取集合
    * @param insBaseLeaveRefundSetting
    * @return
    */
    public List<InsBaseLeaveRefundSetting> queryList(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting);

    /**
    * 新增数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    public InsBaseLeaveRefundSetting insert(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting);

    /**
    * 更新数据
    *
    * @param insBaseLeaveRefundSetting 实例对象
    * @return 实例对象
    */
    public InsBaseLeaveRefundSetting update(InsBaseLeaveRefundSetting insBaseLeaveRefundSetting);

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
    public boolean saveInsBaseLeaveRefundSettingBatch(List<InsBaseLeaveRefundSetting> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsBaseLeaveRefundSettingBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsBaseLeaveRefundSetting> list);
 }
