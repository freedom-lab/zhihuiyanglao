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

@TableName("tb_jiangyukeji_ins_medical_drug_info")
@Data
public class InsMedicalDrugInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 所属运营公司id ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 所属运营公司名称 ***/
    @TableField(value = "corp_name")
    private String corpName;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 入住信息主键id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 入住日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 药品名称 ***/
    @TableField(value = "drug_name")
    private String drugName;

    /***** 给药途径(数据字典(ins_drug_route)) ***/
    @TableField(value = "drug_route")
    private String drugRoute;

    /***** 开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 药品总量 ***/
    @TableField(value = "total_num")
    private Double totalNum;

    /***** 用药频次(数据字典(ins_drug_methods)) ***/
    @TableField(value = "drug_methods")
    private String drugMethods;

    /***** 每次用药剂量 ***/
    @TableField(value = "drug_dosage")
    private Double drugDosage;

    /***** 每次用药单位(数据字典(ins_drug_unit)) ***/
    @TableField(value = "drug_unit")
    private String drugUnit;

    /***** 用药时间(1每日 ***/
    @TableField(value = "time_type")
    private Integer timeType;

    /***** 周几(周一到周日逗号分隔1,2,3,4,5,6,7) ***/
    @TableField(value = "week_num")
    private String weekNum;

    /***** 早晨用药时间(hh:mm) ***/
    @TableField(value = "zao_time")
    private String zaoTime;

    /***** 早晨用药剂量 ***/
    @TableField(value = "zao_dosage")
    private Double zaoDosage;

    /***** 中午用药时间(hh:mm) ***/
    @TableField(value = "zhong_time")
    private String zhongTime;

    /***** 中午药剂量 ***/
    @TableField(value = "zhong_dosage")
    private Double zhongDosage;

    /***** 晚上用药时间(hh:mm) ***/
    @TableField(value = "wan_time")
    private String wanTime;

    /***** 晚上用药剂量 ***/
    @TableField(value = "wan_dosage")
    private Double wanDosage;

    /***** 睡前用药时间(hh:mm) ***/
    @TableField(value = "sq_time")
    private String sqTime;

    /***** 睡前用药剂量 ***/
    @TableField(value = "sq_dosage")
    private Double sqDosage;

    /***** 药品来源(1院内 ***/
    @TableField(value = "drug_source")
    private Integer drugSource;

    /***** 不良反应(1无 ***/
    @TableField(value = "is_adverse")
    private Integer isAdverse;

    /***** 审核状态(1未审核 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人主键id ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审核人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审核意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 服药状态(1启用 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 停用日期 ***/
    @TableField(value = "stop_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date stopDate;

    /***** 停用原因 ***/
    @TableField(value = "stop_memo")
    private String stopMemo;

    /***** 停用审核状态(1未审核 ***/
    @TableField(value = "stop_audit_state")
    private Integer stopAuditState;

    /***** 停用审核人主键id ***/
    @TableField(value = "stop_audit_id")
    private Long stopAuditId;

    /***** 停用审核人姓名 ***/
    @TableField(value = "stop_audit_name")
    private String stopAuditName;

    /***** 停用审核时间 ***/
    @TableField(value = "stop_audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date stopAuditTime;

    /***** 停用审核意见 ***/
    @TableField(value = "stop_audit_memo")
    private String stopAuditMemo;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人名称 ***/
    @TableField(value = "create_name")
    private String createName;

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


}


