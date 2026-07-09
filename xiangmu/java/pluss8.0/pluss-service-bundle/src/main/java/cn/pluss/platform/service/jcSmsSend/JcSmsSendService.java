package cn.pluss.platform.service.jcSmsSend;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.JcSmsSend;

public interface JcSmsSendService extends IService<JcSmsSend> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<JcSmsSend> queryPage(Map map);

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
    public JcSmsSend queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    public JcSmsSend queryOne(JcSmsSend jcSmsSend);

    /**
    * 根据条件获取集合
    * @param jcSmsSend
    * @return
    */
    public List<JcSmsSend> queryList(JcSmsSend jcSmsSend);

    /**
    * 新增数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    public JcSmsSend insert(JcSmsSend jcSmsSend);

    /**
    * 更新数据
    *
    * @param jcSmsSend 实例对象
    * @return 实例对象
    */
    public JcSmsSend update(JcSmsSend jcSmsSend);

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
    public boolean saveJcSmsSendBatch(List<JcSmsSend> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteJcSmsSendBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<JcSmsSend> list);
 }
