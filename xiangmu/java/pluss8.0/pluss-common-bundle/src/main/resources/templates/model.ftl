package ${packageName}.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("${tableName}")
@Data
public class ${beanName} implements Serializable, Cloneable {

<#list fieldList as tableField>
    <#if tableField.fieldType=='bigint' && tableField.fieldName=='id'>
    /***** 主键 ***/
    @TableId(value = "${tableField.fieldName}", type = IdType.ASSIGN_ID)
    private Long ${tableField.filedUpcaseName};

    <#elseif tableField.fieldType=='datetime'>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date ${tableField.filedUpcaseName};

    <#elseif tableField.fieldType=='int' || tableField.fieldType=='tinyint'>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    private Integer ${tableField.filedUpcaseName};

    <#elseif tableField.fieldType=='bigint'>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    private Long ${tableField.filedUpcaseName};

    <#elseif tableField.fieldType=='decimal' || tableField.fieldType=='double'>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    private Double ${tableField.filedUpcaseName};

    <#elseif tableField.fieldType=='varchar' || tableField.fieldType=='char' || tableField.fieldType=='text' || tableField.fieldType=='longtext'>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    private String ${tableField.filedUpcaseName};

    <#else>
    /***** ${tableField.fieldComment} ***/
    @TableField(value = "${tableField.fieldName}")
    private ${tableField.fieldType} ${tableField.filedUpcaseName};

    </#if>
</#list>

<#--<#list fieldList as tableField>-->
<#--    public <#if tableField.fieldType=='datetime'> Date<#elseif tableField.fieldType=='int'> Integer<#elseif tableField.fieldType=='varchar'> String<#else> ${tableField.fieldType}</#if> get<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}() {-->
<#--    return ${tableField.filedUpcaseName};-->
<#--    }-->
<#--    public void set<#assign filedUpcaseName=StringUtil.firstCharUpCase("${tableField.filedUpcaseName}")>${filedUpcaseName}(<#if tableField.fieldType=='datetime'>Date<#elseif tableField.fieldType=='int'>Integer<#elseif tableField.fieldType=='varchar'>String<#else>${tableField.fieldType}</#if> ${tableField.filedUpcaseName}) {-->
<#--    this.${tableField.filedUpcaseName} = ${tableField.filedUpcaseName};-->
<#--    }-->
<#--</#list>-->
}

