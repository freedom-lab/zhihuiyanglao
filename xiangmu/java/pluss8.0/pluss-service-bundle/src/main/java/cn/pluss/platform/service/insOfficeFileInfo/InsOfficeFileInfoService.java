package cn.pluss.platform.service.insOfficeFileInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsOfficeFileInfo;

public interface InsOfficeFileInfoService extends IService<InsOfficeFileInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsOfficeFileInfo> queryPage(Map map);

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
    public InsOfficeFileInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeFileInfo queryOne(InsOfficeFileInfo insOfficeFileInfo);

    /**
    * 根据条件获取集合
    * @param insOfficeFileInfo
    * @return
    */
    public List<InsOfficeFileInfo> queryList(InsOfficeFileInfo insOfficeFileInfo);

    /**
    * 新增数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeFileInfo insert(InsOfficeFileInfo insOfficeFileInfo);

    /**
    * 更新数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeFileInfo update(InsOfficeFileInfo insOfficeFileInfo);

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
    public boolean saveInsOfficeFileInfoBatch(List<InsOfficeFileInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsOfficeFileInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsOfficeFileInfo> list);
 }
