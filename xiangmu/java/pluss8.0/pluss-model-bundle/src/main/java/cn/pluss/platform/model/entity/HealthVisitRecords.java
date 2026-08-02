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

@TableName("tb_jiangyukeji_health_visit_records")
@Data
public class HealthVisitRecords implements Serializable, Cloneable {

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

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 基本信息-就诊日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 基本信息-就诊医院 ***/
    @TableField(value = "hospital")
    private String hospital;

    /***** 基本信息-就诊科室 ***/
    @TableField(value = "office")
    private String office;

    /***** 基本信息-接诊医生 ***/
    @TableField(value = "doctor")
    private String doctor;

    /***** 基本信息-主诉内容 ***/
    @TableField(value = "main_content")
    private String mainContent;

    /***** 基本信息-现病史 ***/
    @TableField(value = "present_illness")
    private String presentIllness;

    /***** 基本信息-既往史 ***/
    @TableField(value = "past_history")
    private String pastHistory;

    /***** 基本信息-家族史 ***/
    @TableField(value = "family_history")
    private String familyHistory;

    /***** 基本信息-体检检查 ***/
    @TableField(value = "body_check")
    private String bodyCheck;

    /***** 基本信息-辅助检查 ***/
    @TableField(value = "auxiliary_check")
    private String auxiliaryCheck;

    /***** 一般情况-神态 ***/
    @TableField(value = "mien")
    private String mien;

    /***** 一般情况-发育(1正常2不良) ***/
    @TableField(value = "auxe")
    private String auxe;

    /***** 一般情况-营养(1良好2中等3不良) ***/
    @TableField(value = "nutrition")
    private String nutrition;

    /***** 一般情况-皮肤黏膜 ***/
    @TableField(value = "skin_mucosa")
    private String skinMucosa;

    /***** 一般情况-浅表淋巴结 ***/
    @TableField(value = "lymph_node")
    private String lymphNode;

    /***** 一般情况-头部及器官 ***/
    @TableField(value = "head_organ")
    private String headOrgan;

    /***** 一般情况-胸部 ***/
    @TableField(value = "chest")
    private String chest;

    /***** 一般情况-腹部 ***/
    @TableField(value = "abdomen")
    private String abdomen;

    /***** 诊断结果-初步诊断结果 ***/
    @TableField(value = "check_result")
    private String checkResult;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人 ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 记录人 ***/
    @TableField(value = "record_name")
    private String recordName;


}


