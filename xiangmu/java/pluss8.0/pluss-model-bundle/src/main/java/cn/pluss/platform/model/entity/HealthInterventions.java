package cn.pluss.platform.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_jiangyukeji_health_interventions")
@Data
public class HealthInterventions implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 服务机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 服务机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人标识ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 出生日期 ***/
    @TableField(value = "birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /***** 疾病分类(数据字典) ***/
    @TableField(value = "disease_id")
    private String diseaseId;

    /***** 疾病名称 ***/
    @TableField(value = "disease_name")
    private String diseaseName;

    /***** 干预时间 ***/
    @TableField(value = "meddle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date meddleTime;

    /***** 控制目标 ***/
    @TableField(value = "control_plan")
    private String controlPlan;

    /***** 饮食指导 ***/
    @TableField(value = "diet_guide")
    private String dietGuide;

    /***** 运动指导 ***/
    @TableField(value = "sport_guide")
    private String sportGuide;

    /***** 参考食谱 ***/
    @TableField(value = "reference_recipe")
    private String referenceRecipe;

    /***** 中医药养 ***/
    @TableField(value = "traditional_medicine")
    private String traditionalMedicine;

    /***** 其他建议 ***/
    @TableField(value = "other_tips")
    private String otherTips;

    /***** 干预方案制作人 ***/
    @TableField(value = "make_name")
    private String makeName;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人id ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 业务字段 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;


}


