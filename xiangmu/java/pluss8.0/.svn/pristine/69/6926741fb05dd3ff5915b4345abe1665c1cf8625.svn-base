package cn.pluss.platform.service.insOfficeKnowledgeInfo;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsOfficeKnowledgeInfo;

public interface InsOfficeKnowledgeInfoService extends IService<InsOfficeKnowledgeInfo> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsOfficeKnowledgeInfo> queryPage(Map map);

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
    public InsOfficeKnowledgeInfo queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeKnowledgeInfo queryOne(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo);

    /**
    * 根据条件获取集合
    * @param insOfficeKnowledgeInfo
    * @return
    */
    public List<InsOfficeKnowledgeInfo> queryList(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo);

    /**
    * 新增数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeKnowledgeInfo insert(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo);

    /**
    * 更新数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    public InsOfficeKnowledgeInfo update(InsOfficeKnowledgeInfo insOfficeKnowledgeInfo);

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
    public boolean saveInsOfficeKnowledgeInfoBatch(List<InsOfficeKnowledgeInfo> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsOfficeKnowledgeInfoBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsOfficeKnowledgeInfo> list);
 }
