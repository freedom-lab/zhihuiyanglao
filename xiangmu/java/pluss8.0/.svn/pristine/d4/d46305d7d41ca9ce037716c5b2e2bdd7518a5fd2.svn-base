package ${packageName}.service.${beanNameSmall}.impl;

import ${packageName}.mapper.${beanName}Mapper;
import ${packageName}.model.entity.${beanName};
import ${packageName}.service.${beanNameSmall}.${beanName}Service;
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
@Service("${beanNameSmall}Service")
public class ${beanName}ServiceImpl extends ServiceImpl< ${beanName}Mapper, ${beanName}> implements ${beanName}Service {
    private static final Logger logger = LoggerFactory.getLogger(${beanName}ServiceImpl.class);

    /**
    * 分页查询
    * @param map
    * @return
    */
    @Override
    public List<${beanName}> queryPage(Map map) {
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
    public ${beanName} queryById(Long id) {
        return getBaseMapper().selectById(id);
    }

    /**
    * 根据条件查询单条数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    @Override
    public ${beanName} queryOne(${beanName} ${beanNameSmall}){
        LambdaQueryWrapper<${beanName}> queryWrapper = getQueryWrapper(${beanNameSmall});
        return getBaseMapper().selectOne(queryWrapper);
    }

    /**
    * 根据条件获取集合
    * @param ${beanNameSmall}
    * @return
    */
    @Override
    public List<${beanName}> queryList(${beanName} ${beanNameSmall}) {
        LambdaQueryWrapper<${beanName}> queryWrapper = getQueryWrapper(${beanNameSmall});
        return getBaseMapper().selectList(queryWrapper);
    }

    /**
    * 获取查询包装器
    * @param ${beanNameSmall}
    * @return
    */
    public static LambdaQueryWrapper<${beanName}> getQueryWrapper(${beanName} ${beanNameSmall}){
        LambdaQueryWrapper<${beanName}> queryWrapper = new LambdaQueryWrapper<>();
        <#list fieldList as tableField>
            <#if tableField.fieldName=='id' && tableField.fieldName=='bigint'>
                if (${beanNameSmall}.getId() != null && ${beanNameSmall}.getId().longValue() > 0) {
                queryWrapper.eq(${beanName}::getId, ${beanNameSmall}.getId());
                }
            <#elseif tableField.fieldType=='datetime' || tableField.fieldType=='int' || tableField.fieldType=='bigint' || tableField.fieldType=='bit'
                || tableField.fieldType=='double' || tableField.fieldType=='decimal'>
                if (${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}() != null) {
                queryWrapper.eq(${beanName}::get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}, ${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}());
                }
            <#elseif tableField.fieldType=='varchar' || tableField.fieldType=='char' || tableField.fieldType=='text' || tableField.fieldType=='longtext'>
                if (StringUtil.isNotEmpty(${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}())) {
                queryWrapper.eq(${beanName}::get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}, ${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}());
                }
            <#else>
            </#if>
        </#list>
        return queryWrapper;
    }

    /**
    * 新增数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public ${beanName} insert(${beanName} ${beanNameSmall}) {
        ${beanNameSmall}.setId(null);
        getBaseMapper().insert(${beanNameSmall});
        return ${beanNameSmall};
    }

    /**
    * 更新数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public ${beanName} update(${beanName} ${beanNameSmall}) {
        //1. 根据条件动态更新
        LambdaUpdateChainWrapper<${beanName}> chainWrapper = new LambdaUpdateChainWrapper<${beanName}>(getBaseMapper());
        <#list fieldList as tableField>
        <#if tableField.fieldName=='id' && tableField.fieldName=='bigint'>

        <#elseif tableField.fieldType=='datetime' || tableField.fieldType=='int' || tableField.fieldType=='bigint' || tableField.fieldType=='bit'>
        if (${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}() != null) {
            chainWrapper.set(${beanName}::get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}, ${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}());
        }
        <#elseif tableField.fieldType=='varchar' || tableField.fieldType=='text' || tableField.fieldType=='longtext' || tableField.fieldType=='char'>
        if (StringUtil.isNotBlank(${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}())) {
            chainWrapper.set(${beanName}::get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}, ${beanNameSmall}.get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}());
        }
        <#else>
        </#if>
        </#list>
        //2. 设置主键，并更新
        chainWrapper.eq(${beanName}::getId, ${beanNameSmall}.getId());
        boolean ret = chainWrapper.update();
        //3. 更新成功了，查询最最对象返回
        if (ret) {
            return queryById(${beanNameSmall}.getId());
        } else {
            return ${beanNameSmall};
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
    public boolean save${beanName}Batch(List<${beanName}> insertList) {
        if(CollectionUtils.isEmpty(insertList)){
            return true;
        }
        //Date currentDte = new Date();
        for (${beanName} ${beanNameSmall} : insertList) {
            //使用默认的雪花算法生成
            ${beanNameSmall}.setId(null);
            //${beanNameSmall}.setCreatedDt(currentDte);
            //${beanNameSmall}.setUpdatedDt(currentDte);
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
    public Integer delete${beanName}Batch(List<Long> delList) {
        return getBaseMapper().deleteBatchIds(delList);
    }

}

