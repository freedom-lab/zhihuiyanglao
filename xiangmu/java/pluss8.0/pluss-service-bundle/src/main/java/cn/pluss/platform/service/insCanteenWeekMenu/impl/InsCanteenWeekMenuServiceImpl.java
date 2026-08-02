package cn.pluss.platform.service.insCanteenWeekMenu.impl;

import cn.pluss.platform.mapper.InsCanteenWeekMenuMapper;
import cn.pluss.platform.model.entity.InsCanteenWeekMenu;
import cn.pluss.platform.service.insCanteenWeekMenu.InsCanteenWeekMenuService;
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
@Service("insCanteenWeekMenuService")
public class InsCanteenWeekMenuServiceImpl extends ServiceImpl< InsCanteenWeekMenuMapper, InsCanteenWeekMenu> implements InsCanteenWeekMenuService {
    private static final Logger logger = LoggerFactory.getLogger(InsCanteenWeekMenuServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<InsCanteenWeekMenu> queryPage(Map map) {
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
    public InsCanteenWeekMenu queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    @Override
    public InsCanteenWeekMenu queryOne(InsCanteenWeekMenu insCanteenWeekMenu){
        LambdaQueryWrapper<InsCanteenWeekMenu> queryWrapper = getQueryWrapper(insCanteenWeekMenu);
		queryWrapper.last(" limit 1");
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenu
    * @return
    */
    @Override
    public List<InsCanteenWeekMenu> queryList(InsCanteenWeekMenu insCanteenWeekMenu) {
        LambdaQueryWrapper<InsCanteenWeekMenu> queryWrapper = getQueryWrapper(insCanteenWeekMenu);
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param insCanteenWeekMenu
    * @return
    */
    public static LambdaQueryWrapper<InsCanteenWeekMenu> getQueryWrapper(InsCanteenWeekMenu insCanteenWeekMenu){
        LambdaQueryWrapper<InsCanteenWeekMenu> queryWrapper = new LambdaQueryWrapper<>();
        if (insCanteenWeekMenu.getId() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getId, insCanteenWeekMenu.getId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getTenantId())) {
            queryWrapper.eq(InsCanteenWeekMenu::getTenantId, insCanteenWeekMenu.getTenantId());
        }
        if (insCanteenWeekMenu.getCorpId() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getCorpId, insCanteenWeekMenu.getCorpId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getCorpName())) {
            queryWrapper.eq(InsCanteenWeekMenu::getCorpName, insCanteenWeekMenu.getCorpName());
        }
        if (insCanteenWeekMenu.getInstitutionId() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getInstitutionId, insCanteenWeekMenu.getInstitutionId());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getInstitutionName())) {
            queryWrapper.eq(InsCanteenWeekMenu::getInstitutionName, insCanteenWeekMenu.getInstitutionName());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getWeekNum())) {
            queryWrapper.eq(InsCanteenWeekMenu::getWeekNum, insCanteenWeekMenu.getWeekNum());
        }
        if (insCanteenWeekMenu.getStartDate() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getStartDate, insCanteenWeekMenu.getStartDate());
        }
        if (insCanteenWeekMenu.getEndDate() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getEndDate, insCanteenWeekMenu.getEndDate());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getRemark())) {
            queryWrapper.eq(InsCanteenWeekMenu::getRemark, insCanteenWeekMenu.getRemark());
        }
        if (insCanteenWeekMenu.getCreateUser() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getCreateUser, insCanteenWeekMenu.getCreateUser());
        }
        if (StringUtil.isNotEmpty(insCanteenWeekMenu.getCreateName())) {
            queryWrapper.eq(InsCanteenWeekMenu::getCreateName, insCanteenWeekMenu.getCreateName());
        }
        if (insCanteenWeekMenu.getCreateDept() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getCreateDept, insCanteenWeekMenu.getCreateDept());
        }
        if (insCanteenWeekMenu.getCreateTime() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getCreateTime, insCanteenWeekMenu.getCreateTime());
        }
        if (insCanteenWeekMenu.getUpdateUser() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getUpdateUser, insCanteenWeekMenu.getUpdateUser());
        }
        if (insCanteenWeekMenu.getUpdateTime() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getUpdateTime, insCanteenWeekMenu.getUpdateTime());
        }
        if (insCanteenWeekMenu.getIsDeleted() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getIsDeleted, insCanteenWeekMenu.getIsDeleted());
        }
        if (insCanteenWeekMenu.getStatus() != null) {
            queryWrapper.eq(InsCanteenWeekMenu::getStatus, insCanteenWeekMenu.getStatus());
        }
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenWeekMenu insert(InsCanteenWeekMenu insCanteenWeekMenu) {
        insCanteenWeekMenu.setId(null);
        getBaseMapper().insert(insCanteenWeekMenu);
        return insCanteenWeekMenu;
    }

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public InsCanteenWeekMenu update(InsCanteenWeekMenu insCanteenWeekMenu) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<InsCanteenWeekMenu> chainWrapper = new LambdaUpdateChainWrapper<InsCanteenWeekMenu>(getBaseMapper());
        if (insCanteenWeekMenu.getId() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getId, insCanteenWeekMenu.getId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getTenantId())) {
            chainWrapper.set(InsCanteenWeekMenu::getTenantId, insCanteenWeekMenu.getTenantId());
        }
        if (insCanteenWeekMenu.getCorpId() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getCorpId, insCanteenWeekMenu.getCorpId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getCorpName())) {
            chainWrapper.set(InsCanteenWeekMenu::getCorpName, insCanteenWeekMenu.getCorpName());
        }
        if (insCanteenWeekMenu.getInstitutionId() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getInstitutionId, insCanteenWeekMenu.getInstitutionId());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getInstitutionName())) {
            chainWrapper.set(InsCanteenWeekMenu::getInstitutionName, insCanteenWeekMenu.getInstitutionName());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getWeekNum())) {
            chainWrapper.set(InsCanteenWeekMenu::getWeekNum, insCanteenWeekMenu.getWeekNum());
        }
        if (insCanteenWeekMenu.getStartDate() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getStartDate, insCanteenWeekMenu.getStartDate());
        }
        if (insCanteenWeekMenu.getEndDate() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getEndDate, insCanteenWeekMenu.getEndDate());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getRemark())) {
            chainWrapper.set(InsCanteenWeekMenu::getRemark, insCanteenWeekMenu.getRemark());
        }
        if (insCanteenWeekMenu.getCreateUser() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getCreateUser, insCanteenWeekMenu.getCreateUser());
        }
        if (StringUtil.isNotBlank(insCanteenWeekMenu.getCreateName())) {
            chainWrapper.set(InsCanteenWeekMenu::getCreateName, insCanteenWeekMenu.getCreateName());
        }
        if (insCanteenWeekMenu.getCreateDept() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getCreateDept, insCanteenWeekMenu.getCreateDept());
        }
        if (insCanteenWeekMenu.getCreateTime() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getCreateTime, insCanteenWeekMenu.getCreateTime());
        }
        if (insCanteenWeekMenu.getUpdateUser() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getUpdateUser, insCanteenWeekMenu.getUpdateUser());
        }
        if (insCanteenWeekMenu.getUpdateTime() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getUpdateTime, insCanteenWeekMenu.getUpdateTime());
        }
        if (insCanteenWeekMenu.getIsDeleted() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getIsDeleted, insCanteenWeekMenu.getIsDeleted());
        }
        if (insCanteenWeekMenu.getStatus() != null) {
            chainWrapper.set(InsCanteenWeekMenu::getStatus, insCanteenWeekMenu.getStatus());
        }
        //2. 设置主键，并更新
        chainWrapper.eq(InsCanteenWeekMenu::getId, insCanteenWeekMenu.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(insCanteenWeekMenu.getId());
        } else {
            return insCanteenWeekMenu;
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
    public boolean saveInsCanteenWeekMenuBatch(List<InsCanteenWeekMenu> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (InsCanteenWeekMenu insCanteenWeekMenu : insertList) {
            //使用默认的雪花算法生成
            insCanteenWeekMenu.setId(null);
            //insCanteenWeekMenu.setCreatedDt(currentDte);
            //insCanteenWeekMenu.setUpdatedDt(currentDte);
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
    public Integer deleteInsCanteenWeekMenuBatch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

    /**
    * 批量新增
    * @param list
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void insertBatch(List<InsCanteenWeekMenu> list) {
        if(!CollectionUtils.isEmpty(list)){
            getBaseMapper().insertBatch(list);
        }
    }
}


