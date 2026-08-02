package cn.pluss.platform.service.insInstitutionEvaluate;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsInstitutionEvaluate;

public interface InsInstitutionEvaluateService extends IService<InsInstitutionEvaluate> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsInstitutionEvaluate> queryPage(Map map);

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
    public InsInstitutionEvaluate queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    public InsInstitutionEvaluate queryOne(InsInstitutionEvaluate insInstitutionEvaluate);

    /**
    * 根据条件获取集合
    * @param insInstitutionEvaluate
    * @return
    */
    public List<InsInstitutionEvaluate> queryList(InsInstitutionEvaluate insInstitutionEvaluate);

    /**
    * 新增数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    public InsInstitutionEvaluate insert(InsInstitutionEvaluate insInstitutionEvaluate);

    /**
    * 更新数据
    *
    * @param insInstitutionEvaluate 实例对象
    * @return 实例对象
    */
    public InsInstitutionEvaluate update(InsInstitutionEvaluate insInstitutionEvaluate);

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
    public boolean saveInsInstitutionEvaluateBatch(List<InsInstitutionEvaluate> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsInstitutionEvaluateBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsInstitutionEvaluate> list);
 }
