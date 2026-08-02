package cn.pluss.platform.service.insSecurityDangersQuestion;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsSecurityDangersQuestion;

public interface InsSecurityDangersQuestionService extends IService<InsSecurityDangersQuestion> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsSecurityDangersQuestion> queryPage(Map map);

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
    public InsSecurityDangersQuestion queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersQuestion queryOne(InsSecurityDangersQuestion insSecurityDangersQuestion);

    /**
    * 根据条件获取集合
    * @param insSecurityDangersQuestion
    * @return
    */
    public List<InsSecurityDangersQuestion> queryList(InsSecurityDangersQuestion insSecurityDangersQuestion);

    /**
    * 新增数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersQuestion insert(InsSecurityDangersQuestion insSecurityDangersQuestion);

    /**
    * 更新数据
    *
    * @param insSecurityDangersQuestion 实例对象
    * @return 实例对象
    */
    public InsSecurityDangersQuestion update(InsSecurityDangersQuestion insSecurityDangersQuestion);

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
    public boolean saveInsSecurityDangersQuestionBatch(List<InsSecurityDangersQuestion> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsSecurityDangersQuestionBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsSecurityDangersQuestion> list);
 }
