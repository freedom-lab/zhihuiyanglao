<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="${packageName}.mapper.${beanName}Mapper">

    <select id="queryPage" parameterType="java.util.Map" resultType="${packageName}.model.entity.${beanName}">
        SELECT * from  ${tableName}
        <where>
            <#list fieldList as tableField>
                <if test="${tableField.filedUpcaseName}!=null and ${tableField.filedUpcaseName}!=''">
                    and ${tableField.fieldName} = ${r"#"}{${tableField.filedUpcaseName}}
                </if>
            </#list>
        </where>
        order by id desc limit ${r"#"}{pageSize} offset ${r"#"}{offset}
    </select>

    <select id="queryPageCount" parameterType="java.util.Map" resultType="java.lang.Integer">
        SELECT count(*) from ${tableName}
        <where>
            <#list fieldList as tableField>
                <if test="${tableField.filedUpcaseName}!=null and ${tableField.filedUpcaseName}!=''">
                    and ${tableField.fieldName} = ${r"#"}{${tableField.filedUpcaseName}}
                </if>
            </#list>
        </where>
    </select>

</mapper>
