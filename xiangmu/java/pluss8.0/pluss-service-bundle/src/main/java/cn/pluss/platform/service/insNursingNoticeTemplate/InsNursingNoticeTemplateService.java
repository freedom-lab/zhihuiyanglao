package cn.pluss.platform.service.insNursingNoticeTemplate;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsNursingNoticeTemplate;

public interface InsNursingNoticeTemplateService extends IService<InsNursingNoticeTemplate> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsNursingNoticeTemplate> queryPage(Map map);

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
    public InsNursingNoticeTemplate queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    public InsNursingNoticeTemplate queryOne(InsNursingNoticeTemplate insNursingNoticeTemplate);

    /**
    * 根据条件获取集合
    * @param insNursingNoticeTemplate
    * @return
    */
    public List<InsNursingNoticeTemplate> queryList(InsNursingNoticeTemplate insNursingNoticeTemplate);

    /**
    * 新增数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    public InsNursingNoticeTemplate insert(InsNursingNoticeTemplate insNursingNoticeTemplate);

    /**
    * 更新数据
    *
    * @param insNursingNoticeTemplate 实例对象
    * @return 实例对象
    */
    public InsNursingNoticeTemplate update(InsNursingNoticeTemplate insNursingNoticeTemplate);

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
    public boolean saveInsNursingNoticeTemplateBatch(List<InsNursingNoticeTemplate> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsNursingNoticeTemplateBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsNursingNoticeTemplate> list);
 }
