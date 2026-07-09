package cn.pluss.platform.service.insNursingPlanRoom;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingPlanRoom;

public interface InsNursingPlanRoomService extends IService<InsNursingPlanRoom> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingPlanRoom> queryPage(Map map);

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
    public InsNursingPlanRoom queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoom queryOne(InsNursingPlanRoom insNursingPlanRoom);

    /**
    * 根据条件获取集合
    * @param insNursingPlanRoom
    * @return
    */
    public List<InsNursingPlanRoom> queryList(InsNursingPlanRoom insNursingPlanRoom);

    /**
    * 新增数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoom insert(InsNursingPlanRoom insNursingPlanRoom);

    /**
    * 更新数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    public InsNursingPlanRoom update(InsNursingPlanRoom insNursingPlanRoom);

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
    public boolean saveInsNursingPlanRoomBatch(List<InsNursingPlanRoom> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingPlanRoomBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingPlanRoom> list);
 }
