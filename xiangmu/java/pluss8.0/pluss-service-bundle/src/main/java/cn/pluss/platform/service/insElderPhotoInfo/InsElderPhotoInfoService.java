package cn.pluss.platform.service.insElderPhotoInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderPhotoInfo;

public interface InsElderPhotoInfoService extends IService<InsElderPhotoInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderPhotoInfo> queryPage(Map map);

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
    public InsElderPhotoInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    public InsElderPhotoInfo queryOne(InsElderPhotoInfo insElderPhotoInfo);

    /**
    * 根据条件获取集合
    * @param insElderPhotoInfo
    * @return
    */
    public List<InsElderPhotoInfo> queryList(InsElderPhotoInfo insElderPhotoInfo);

    /**
    * 新增数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    public InsElderPhotoInfo insert(InsElderPhotoInfo insElderPhotoInfo);

    /**
    * 更新数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    public InsElderPhotoInfo update(InsElderPhotoInfo insElderPhotoInfo);

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
    public boolean saveInsElderPhotoInfoBatch(List<InsElderPhotoInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderPhotoInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderPhotoInfo> list);
 }
