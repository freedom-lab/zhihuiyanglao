package cn.pluss.platform.service.insActivityRoomInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsActivityRoomInfo;

public interface InsActivityRoomInfoService extends IService<InsActivityRoomInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsActivityRoomInfo> queryPage(Map map);

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
    public InsActivityRoomInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    public InsActivityRoomInfo queryOne(InsActivityRoomInfo insActivityRoomInfo);

    /**
    * 根据条件获取集合
    * @param insActivityRoomInfo
    * @return
    */
    public List<InsActivityRoomInfo> queryList(InsActivityRoomInfo insActivityRoomInfo);

    /**
    * 新增数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    public InsActivityRoomInfo insert(InsActivityRoomInfo insActivityRoomInfo);

    /**
    * 更新数据
    *
    * @param insActivityRoomInfo 实例对象
    * @return 实例对象
    */
    public InsActivityRoomInfo update(InsActivityRoomInfo insActivityRoomInfo);

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
    public boolean saveInsActivityRoomInfoBatch(List<InsActivityRoomInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsActivityRoomInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsActivityRoomInfo> list);
 }
