package cn.pluss.platform.service.insNursingPlanRoomDetail;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingPlanRoomDetail;

public interface InsNursingPlanRoomDetailService extends IService<InsNursingPlanRoomDetail> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingPlanRoomDetail> queryPage(Map map);

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
    public InsNursingPlanRoomDetail queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoomDetail queryOne(InsNursingPlanRoomDetail insNursingPlanRoomDetail);

    /**
    * 根据条件获取集合
    * @param insNursingPlanRoomDetail
    * @return
    */
    public List<InsNursingPlanRoomDetail> queryList(InsNursingPlanRoomDetail insNursingPlanRoomDetail);

    /**
    * 新增数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoomDetail insert(InsNursingPlanRoomDetail insNursingPlanRoomDetail);

    /**
    * 更新数据
    *
    * @param insNursingPlanRoomDetail 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoomDetail update(InsNursingPlanRoomDetail insNursingPlanRoomDetail);

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
    public boolean saveInsNursingPlanRoomDetailBatch(List<InsNursingPlanRoomDetail> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingPlanRoomDetailBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingPlanRoomDetail> list);
 }
