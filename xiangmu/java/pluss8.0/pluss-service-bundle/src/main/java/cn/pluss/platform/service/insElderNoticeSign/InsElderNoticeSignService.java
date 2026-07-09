package cn.pluss.platform.service.insElderNoticeSign;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.InsElderNoticeSign;

public interface InsElderNoticeSignService extends IService<InsElderNoticeSign> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<InsElderNoticeSign> queryPage(Map map);

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
    public InsElderNoticeSign queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    public InsElderNoticeSign queryOne(InsElderNoticeSign insElderNoticeSign);

    /**
    * 根据条件获取集合
    * @param insElderNoticeSign
    * @return
    */
    public List<InsElderNoticeSign> queryList(InsElderNoticeSign insElderNoticeSign);

    /**
    * 新增数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    public InsElderNoticeSign insert(InsElderNoticeSign insElderNoticeSign);

    /**
    * 更新数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    public InsElderNoticeSign update(InsElderNoticeSign insElderNoticeSign);

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
    public boolean saveInsElderNoticeSignBatch(List<InsElderNoticeSign> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteInsElderNoticeSignBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<InsElderNoticeSign> list);
 }
