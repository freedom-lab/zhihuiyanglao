package cn.pluss.platform.service.jcSmsTemplet;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.JcSmsTemplet;

public interface JcSmsTempletService extends IService<JcSmsTemplet> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<JcSmsTemplet> queryPage(Map map);

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
    public JcSmsTemplet queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    public JcSmsTemplet queryOne(JcSmsTemplet jcSmsTemplet);

    /**
    * 根据条件获取集合
    * @param jcSmsTemplet
    * @return
    */
    public List<JcSmsTemplet> queryList(JcSmsTemplet jcSmsTemplet);

    /**
    * 新增数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    public JcSmsTemplet insert(JcSmsTemplet jcSmsTemplet);

    /**
    * 更新数据
    *
    * @param jcSmsTemplet 实例对象
    * @return 实例对象
    */
    public JcSmsTemplet update(JcSmsTemplet jcSmsTemplet);

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
    public boolean saveJcSmsTempletBatch(List<JcSmsTemplet> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteJcSmsTempletBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<JcSmsTemplet> list);
 }
