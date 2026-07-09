package cn.pluss.platform.service.insBaseRoomInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsBaseRoomInfo;

public interface InsBaseRoomInfoService extends IService<InsBaseRoomInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsBaseRoomInfo> queryPage(Map map);

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
    public InsBaseRoomInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    public InsBaseRoomInfo queryOne(InsBaseRoomInfo insBaseRoomInfo);

    /**
    * 根据条件获取集合
    * @param insBaseRoomInfo
    * @return
    */
    public List<InsBaseRoomInfo> queryList(InsBaseRoomInfo insBaseRoomInfo);

    /**
    * 新增数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    public InsBaseRoomInfo insert(InsBaseRoomInfo insBaseRoomInfo);

    /**
    * 更新数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    public InsBaseRoomInfo update(InsBaseRoomInfo insBaseRoomInfo);

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
    public boolean saveInsBaseRoomInfoBatch(List<InsBaseRoomInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsBaseRoomInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsBaseRoomInfo> list);
 }
