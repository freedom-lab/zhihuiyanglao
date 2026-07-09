package cn.pluss.platform.service.communityConsultationRecord;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.CommunityConsultationRecord;

public interface CommunityConsultationRecordService extends IService<CommunityConsultationRecord> {

    /**
    * 分页查询
    * @param map
    * @return
    */
    public List<CommunityConsultationRecord> queryPage(Map map);

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
    public CommunityConsultationRecord queryById(Long id);

    /**
    * 根据条件查询单条数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    public CommunityConsultationRecord queryOne(CommunityConsultationRecord communityConsultationRecord);

    /**
    * 根据条件获取集合
    * @param communityConsultationRecord
    * @return
    */
    public List<CommunityConsultationRecord> queryList(CommunityConsultationRecord communityConsultationRecord);

    /**
    * 新增数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    public CommunityConsultationRecord insert(CommunityConsultationRecord communityConsultationRecord);

    /**
    * 更新数据
    *
    * @param communityConsultationRecord 实例对象
    * @return 实例对象
    */
    public CommunityConsultationRecord update(CommunityConsultationRecord communityConsultationRecord);

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
    public boolean saveCommunityConsultationRecordBatch(List<CommunityConsultationRecord> insertList);

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    public Integer deleteCommunityConsultationRecordBatch(List<Long> delList);

    /**
    * 批量新增
    *
    * @param list
    * @return 实例对象
    */
    public void insertBatch(List<CommunityConsultationRecord> list);
 }
