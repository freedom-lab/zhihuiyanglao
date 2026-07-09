package cn.pluss.platform.service.insNursingRehabSettingDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingRehabSettingDetail;

public interface InsNursingRehabSettingDetailService extends IService<InsNursingRehabSettingDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingRehabSettingDetail> queryPage(Map map);

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
    public InsNursingRehabSettingDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSettingDetail queryOne(InsNursingRehabSettingDetail insNursingRehabSettingDetail);

    /**
    * 根据条件获取集合
    * @param insNursingRehabSettingDetail
    * @return
    */
    public List<InsNursingRehabSettingDetail> queryList(InsNursingRehabSettingDetail insNursingRehabSettingDetail);

    /**
    * 新增数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSettingDetail insert(InsNursingRehabSettingDetail insNursingRehabSettingDetail);

    /**
    * 更新数据
    *
    * @param insNursingRehabSettingDetail 实例对象
    * @return 实例对象
    */
    public InsNursingRehabSettingDetail update(InsNursingRehabSettingDetail insNursingRehabSettingDetail);

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
    public boolean saveInsNursingRehabSettingDetailBatch(List<InsNursingRehabSettingDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingRehabSettingDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingRehabSettingDetail> list);
 }
