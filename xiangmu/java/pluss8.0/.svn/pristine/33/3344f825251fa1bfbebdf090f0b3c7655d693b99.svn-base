package cn.pluss.platform.service.insElderAccidentInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderAccidentInfo;

public interface InsElderAccidentInfoService extends IService<InsElderAccidentInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderAccidentInfo> queryPage(Map map);

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
    public InsElderAccidentInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    public InsElderAccidentInfo queryOne(InsElderAccidentInfo insElderAccidentInfo);

    /**
    * 根据条件获取集合
    * @param insElderAccidentInfo
    * @return
    */
    public List<InsElderAccidentInfo> queryList(InsElderAccidentInfo insElderAccidentInfo);

    /**
    * 新增数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    public InsElderAccidentInfo insert(InsElderAccidentInfo insElderAccidentInfo);

    /**
    * 更新数据
    *
    * @param insElderAccidentInfo 实例对象
    * @return 实例对象
    */
    public InsElderAccidentInfo update(InsElderAccidentInfo insElderAccidentInfo);

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
    public boolean saveInsElderAccidentInfoBatch(List<InsElderAccidentInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderAccidentInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderAccidentInfo> list);
 }
