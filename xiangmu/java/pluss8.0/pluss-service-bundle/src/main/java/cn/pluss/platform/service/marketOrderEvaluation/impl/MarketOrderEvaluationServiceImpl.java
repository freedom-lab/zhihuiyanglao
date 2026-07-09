package cn.pluss.platform.service.marketOrderEvaluation.impl;

import cn.pluss.platform.mapper.MarketOrderEvaluationMapper;
import cn.pluss.platform.model.entity.MarketOrderEvaluation;
import cn.pluss.platform.service.marketOrderEvaluation.MarketOrderEvaluationService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Transactional
@Service("marketOrderEvaluationService")
public class MarketOrderEvaluationServiceImpl extends ServiceImpl< MarketOrderEvaluationMapper, MarketOrderEvaluation> implements MarketOrderEvaluationService {
    private static final Logger logger = LoggerFactory.getLogger(MarketOrderEvaluationServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<MarketOrderEvaluation> queryPage(Map map) {
        return getBaseMapper().queryPage(map);
    }

    /**
    * 分页查询计数
    * @param map
    * @return 
    */
    @Override
    public Integer queryPageCount(Map map) {
        return getBaseMapper().queryPageCount(map);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param id 主键
    * @return 实例对象
    */
    @Override
    public MarketOrderEvaluation queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param marketOrderEvaluation 实例对象
    * @return 实例对象
    */
    @Override
    public MarketOrderEvaluation queryOne(MarketOrderEvaluation marketOrderEvaluation){
        LambdaQueryWrapper<MarketOrderEvaluation> queryWrapper = getQueryWrapper(marketOrderEvaluation);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param marketOrderEvaluation
    * @return
    */
    @Override
    public List<MarketOrderEvaluation> queryList(MarketOrderEvaluation marketOrderEvaluation) {
        LambdaQueryWrapper<MarketOrderEvaluation> queryWrapper = getQueryWrapper(marketOrderEvaluation);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param marketOrderEvaluation
    * @return
    */
    public static LambdaQueryWrapper<MarketOrderEvaluation> getQueryWrapper(MarketOrderEvaluation marketOrderEvaluation){
        LambdaQueryWrapper<MarketOrderEvaluation> queryWrapper = new LambdaQueryWrapper<>();
        if (marketOrderEvaluation.getId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getId, marketOrderEvaluation.getId());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getTenantId())) {
            queryWrapper.eq(MarketOrderEvaluation::getTenantId, marketOrderEvaluation.getTenantId());
        }
        if (marketOrderEvaluation.getCorpId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getCorpId, marketOrderEvaluation.getCorpId());
        }
        if (marketOrderEvaluation.getInstitutionId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getInstitutionId, marketOrderEvaluation.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getInstitutionName())) {
            queryWrapper.eq(MarketOrderEvaluation::getInstitutionName, marketOrderEvaluation.getInstitutionName());
        }
        if (marketOrderEvaluation.getGoodsId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getGoodsId, marketOrderEvaluation.getGoodsId());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getGoodsName())) {
            queryWrapper.eq(MarketOrderEvaluation::getGoodsName, marketOrderEvaluation.getGoodsName());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getOrderCode())) {
            queryWrapper.eq(MarketOrderEvaluation::getOrderCode, marketOrderEvaluation.getOrderCode());
        }
        if (marketOrderEvaluation.getOrderId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getOrderId, marketOrderEvaluation.getOrderId());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getPersonType())) {
            queryWrapper.eq(MarketOrderEvaluation::getPersonType, marketOrderEvaluation.getPersonType());
        }
        if (marketOrderEvaluation.getPersonId() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getPersonId, marketOrderEvaluation.getPersonId());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getPersonName())) {
            queryWrapper.eq(MarketOrderEvaluation::getPersonName, marketOrderEvaluation.getPersonName());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getPersonImg())) {
            queryWrapper.eq(MarketOrderEvaluation::getPersonImg, marketOrderEvaluation.getPersonImg());
        }
        if (marketOrderEvaluation.getComplaintTime() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getComplaintTime, marketOrderEvaluation.getComplaintTime());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getContent())) {
            queryWrapper.eq(MarketOrderEvaluation::getContent, marketOrderEvaluation.getContent());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getImages())) {
            queryWrapper.eq(MarketOrderEvaluation::getImages, marketOrderEvaluation.getImages());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getReplyContent())) {
            queryWrapper.eq(MarketOrderEvaluation::getReplyContent, marketOrderEvaluation.getReplyContent());
        }
        if (marketOrderEvaluation.getReplyTime() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getReplyTime, marketOrderEvaluation.getReplyTime());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getReplyState())) {
            queryWrapper.eq(MarketOrderEvaluation::getReplyState, marketOrderEvaluation.getReplyState());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getScore())) {
            queryWrapper.eq(MarketOrderEvaluation::getScore, marketOrderEvaluation.getScore());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getIsAnonymous())) {
            queryWrapper.eq(MarketOrderEvaluation::getIsAnonymous, marketOrderEvaluation.getIsAnonymous());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getIsShow())) {
            queryWrapper.eq(MarketOrderEvaluation::getIsShow, marketOrderEvaluation.getIsShow());
        }
        if (StringUtil.isNotEmpty(marketOrderEvaluation.getRemark())) {
            queryWrapper.eq(MarketOrderEvaluation::getRemark, marketOrderEvaluation.getRemark());
        }
        if (marketOrderEvaluation.getCreateUser() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getCreateUser, marketOrderEvaluation.getCreateUser());
        }
        if (marketOrderEvaluation.getCreateDept() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getCreateDept, marketOrderEvaluation.getCreateDept());
        }
        if (marketOrderEvaluation.getCreateTime() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getCreateTime, marketOrderEvaluation.getCreateTime());
        }
        if (marketOrderEvaluation.getUpdateUser() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getUpdateUser, marketOrderEvaluation.getUpdateUser());
        }
        if (marketOrderEvaluation.getUpdateTime() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getUpdateTime, marketOrderEvaluation.getUpdateTime());
        }
        if (marketOrderEvaluation.getStatus() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getStatus, marketOrderEvaluation.getStatus());
        }
        if (marketOrderEvaluation.getIsDeleted() != null) {
            queryWrapper.eq(MarketOrderEvaluation::getIsDeleted, marketOrderEvaluation.getIsDeleted());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param marketOrderEvaluation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderEvaluation insert(MarketOrderEvaluation marketOrderEvaluation) {
        marketOrderEvaluation.setId(null);
        getBaseMapper().insert(marketOrderEvaluation);
        return marketOrderEvaluation;
    }

    /**
    * 更新数据
    *
    * @param marketOrderEvaluation 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public MarketOrderEvaluation update(MarketOrderEvaluation marketOrderEvaluation) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<MarketOrderEvaluation> chainWrapper = new LambdaUpdateChainWrapper<MarketOrderEvaluation>(getBaseMapper());
        if (marketOrderEvaluation.getId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getId, marketOrderEvaluation.getId());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getTenantId())) {
            chainWrapper.set(MarketOrderEvaluation::getTenantId, marketOrderEvaluation.getTenantId());
        }
        if (marketOrderEvaluation.getCorpId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getCorpId, marketOrderEvaluation.getCorpId());
        }
        if (marketOrderEvaluation.getInstitutionId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getInstitutionId, marketOrderEvaluation.getInstitutionId());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getInstitutionName())) {
            chainWrapper.set(MarketOrderEvaluation::getInstitutionName, marketOrderEvaluation.getInstitutionName());
        }
        if (marketOrderEvaluation.getGoodsId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getGoodsId, marketOrderEvaluation.getGoodsId());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getGoodsName())) {
            chainWrapper.set(MarketOrderEvaluation::getGoodsName, marketOrderEvaluation.getGoodsName());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getOrderCode())) {
            chainWrapper.set(MarketOrderEvaluation::getOrderCode, marketOrderEvaluation.getOrderCode());
        }
        if (marketOrderEvaluation.getOrderId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getOrderId, marketOrderEvaluation.getOrderId());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getPersonType())) {
            chainWrapper.set(MarketOrderEvaluation::getPersonType, marketOrderEvaluation.getPersonType());
        }
        if (marketOrderEvaluation.getPersonId() != null) {
            chainWrapper.set(MarketOrderEvaluation::getPersonId, marketOrderEvaluation.getPersonId());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getPersonName())) {
            chainWrapper.set(MarketOrderEvaluation::getPersonName, marketOrderEvaluation.getPersonName());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getPersonImg())) {
            chainWrapper.set(MarketOrderEvaluation::getPersonImg, marketOrderEvaluation.getPersonImg());
        }
        if (marketOrderEvaluation.getComplaintTime() != null) {
            chainWrapper.set(MarketOrderEvaluation::getComplaintTime, marketOrderEvaluation.getComplaintTime());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getContent())) {
            chainWrapper.set(MarketOrderEvaluation::getContent, marketOrderEvaluation.getContent());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getImages())) {
            chainWrapper.set(MarketOrderEvaluation::getImages, marketOrderEvaluation.getImages());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getReplyContent())) {
            chainWrapper.set(MarketOrderEvaluation::getReplyContent, marketOrderEvaluation.getReplyContent());
        }
        if (marketOrderEvaluation.getReplyTime() != null) {
            chainWrapper.set(MarketOrderEvaluation::getReplyTime, marketOrderEvaluation.getReplyTime());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getReplyState())) {
            chainWrapper.set(MarketOrderEvaluation::getReplyState, marketOrderEvaluation.getReplyState());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getScore())) {
            chainWrapper.set(MarketOrderEvaluation::getScore, marketOrderEvaluation.getScore());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getIsAnonymous())) {
            chainWrapper.set(MarketOrderEvaluation::getIsAnonymous, marketOrderEvaluation.getIsAnonymous());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getIsShow())) {
            chainWrapper.set(MarketOrderEvaluation::getIsShow, marketOrderEvaluation.getIsShow());
        }
        if (StringUtil.isNotBlank(marketOrderEvaluation.getRemark())) {
            chainWrapper.set(MarketOrderEvaluation::getRemark, marketOrderEvaluation.getRemark());
        }
        if (marketOrderEvaluation.getCreateUser() != null) {
            chainWrapper.set(MarketOrderEvaluation::getCreateUser, marketOrderEvaluation.getCreateUser());
        }
        if (marketOrderEvaluation.getCreateDept() != null) {
            chainWrapper.set(MarketOrderEvaluation::getCreateDept, marketOrderEvaluation.getCreateDept());
        }
        if (marketOrderEvaluation.getCreateTime() != null) {
            chainWrapper.set(MarketOrderEvaluation::getCreateTime, marketOrderEvaluation.getCreateTime());
        }
        if (marketOrderEvaluation.getUpdateUser() != null) {
            chainWrapper.set(MarketOrderEvaluation::getUpdateUser, marketOrderEvaluation.getUpdateUser());
        }
        if (marketOrderEvaluation.getUpdateTime() != null) {
            chainWrapper.set(MarketOrderEvaluation::getUpdateTime, marketOrderEvaluation.getUpdateTime());
        }
        if (marketOrderEvaluation.getStatus() != null) {
            chainWrapper.set(MarketOrderEvaluation::getStatus, marketOrderEvaluation.getStatus());
        }
        if (marketOrderEvaluation.getIsDeleted() != null) {
            chainWrapper.set(MarketOrderEvaluation::getIsDeleted, marketOrderEvaluation.getIsDeleted());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(MarketOrderEvaluation::getId, marketOrderEvaluation.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(marketOrderEvaluation.getId());
        } else {
            return marketOrderEvaluation;
        }
    }

    /**
    * 通过主键删除数据
    *
    * @param id 主键
    * @return 是否成功
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean deleteById(Long id) {
        int total = getBaseMapper().deleteById(id);
        return total > 0;
    }

    /**
    * 批量新增
    * @param insertList
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean saveMarketOrderEvaluationBatch(List<MarketOrderEvaluation> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (MarketOrderEvaluation marketOrderEvaluation : insertList) {
            //使用默认的雪花算法生成
            marketOrderEvaluation.setId(null);
            //marketOrderEvaluation.setCreatedDt(currentDte);
            //marketOrderEvaluation.setUpdatedDt(currentDte);
        }
        return saveBatch(insertList);
    }

    /**
    * 批量删除 根据ID或实体
    * @param delList
    * @return
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public Integer deleteMarketOrderEvaluationBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<MarketOrderEvaluation> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


