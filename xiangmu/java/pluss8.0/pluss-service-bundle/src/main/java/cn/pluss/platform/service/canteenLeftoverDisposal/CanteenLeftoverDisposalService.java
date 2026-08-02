package cn.pluss.platform.service.canteenLeftoverDisposal;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CanteenLeftoverDisposal;

public interface CanteenLeftoverDisposalService extends IService<CanteenLeftoverDisposal> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CanteenLeftoverDisposal> queryPage(Map map);

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
    public CanteenLeftoverDisposal queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    public CanteenLeftoverDisposal queryOne(CanteenLeftoverDisposal canteenLeftoverDisposal);

    /**
    * 根据条件获取集合
    * @param canteenLeftoverDisposal
    * @return
    */
    public List<CanteenLeftoverDisposal> queryList(CanteenLeftoverDisposal canteenLeftoverDisposal);

    /**
    * 新增数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    public CanteenLeftoverDisposal insert(CanteenLeftoverDisposal canteenLeftoverDisposal);

    /**
    * 更新数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    public CanteenLeftoverDisposal update(CanteenLeftoverDisposal canteenLeftoverDisposal);

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
    public boolean saveCanteenLeftoverDisposalBatch(List<CanteenLeftoverDisposal> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCanteenLeftoverDisposalBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CanteenLeftoverDisposal> list);
 }
