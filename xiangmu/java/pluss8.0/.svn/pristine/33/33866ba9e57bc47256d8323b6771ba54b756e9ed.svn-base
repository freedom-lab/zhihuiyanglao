package cn.pluss.platform.service.healthArteriosclerosis;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.HealthArteriosclerosis;

public interface HealthArteriosclerosisService extends IService<HealthArteriosclerosis> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<HealthArteriosclerosis> queryPage(Map map);

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
    public HealthArteriosclerosis queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    public HealthArteriosclerosis queryOne(HealthArteriosclerosis healthArteriosclerosis);

    /**
    * 根据条件获取集合
    * @param healthArteriosclerosis
    * @return
    */
    public List<HealthArteriosclerosis> queryList(HealthArteriosclerosis healthArteriosclerosis);

    /**
    * 新增数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    public HealthArteriosclerosis insert(HealthArteriosclerosis healthArteriosclerosis);

    /**
    * 更新数据
    *
    * @param healthArteriosclerosis 实例对象
    * @return 实例对象
    */
    public HealthArteriosclerosis update(HealthArteriosclerosis healthArteriosclerosis);

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
    public boolean saveHealthArteriosclerosisBatch(List<HealthArteriosclerosis> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteHealthArteriosclerosisBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<HealthArteriosclerosis> list);
 }
