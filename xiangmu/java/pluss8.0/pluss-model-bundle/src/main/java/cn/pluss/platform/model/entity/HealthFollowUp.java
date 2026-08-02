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

@TableName("tb_jiangyukeji_health_follow_up")
@Data
public class HealthFollowUp implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
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

    /***** 随访编号 ***/
    @TableField(value = "follow_up_no")
    private String followUpNo;

    /***** 档案ID ***/
    @TableField(value = "archive_id")
    private Long archiveId;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 随访医生ID ***/
    @TableField(value = "doctor_id")
    private Long doctorId;

    /***** 随访医生姓名 ***/
    @TableField(value = "doctor_name")
    private String doctorName;

    /***** 随访日期 ***/
    @TableField(value = "follow_up_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date followUpDate;

    /***** 随访类型(数据字典(ins_follow_up_type)) ***/
    @TableField(value = "follow_up_type")
    private String followUpType;

    /***** 症状体征 ***/
    @TableField(value = "symptoms_signs")
    private String symptomsSigns;

    /***** 血压收缩压(mmHg) ***/
    @TableField(value = "blood_pressure_sys")
    private Integer bloodPressureSys;

    /***** 血压舒张压(mmHg) ***/
    @TableField(value = "blood_pressure_dia")
    private Integer bloodPressureDia;

    /***** 空腹血糖(mmol/L) ***/
    @TableField(value = "blood_sugar_fasting")
    private Double bloodSugarFasting;

    /***** 餐后血糖(mmol/L) ***/
    @TableField(value = "blood_sugar_postprandial")
    private Double bloodSugarPostprandial;

    /***** 心率(次/分) ***/
    @TableField(value = "heart_rate")
    private Integer heartRate;

    /***** 体重(kg) ***/
    @TableField(value = "weight")
    private Double weight;

    /***** 用药依从性(1完全依从 ***/
    @TableField(value = "medication_adherence")
    private Integer medicationAdherence;

    /***** 干预方案执行情况 ***/
    @TableField(value = "plan_execution")
    private String planExecution;

    /***** 存在问题 ***/
    @TableField(value = "existing_problems")
    private String existingProblems;

    /***** 处理意见 ***/
    @TableField(value = "treatment_advice")
    private String treatmentAdvice;

    /***** 病情控制情况(1控制良好 ***/
    @TableField(value = "control_status")
    private Integer controlStatus;

    /***** 风险等级(1低危 ***/
    @TableField(value = "risk_level")
    private Integer riskLevel;

    /***** 下次随访时间 ***/
    @TableField(value = "next_follow_up_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date nextFollowUpDate;

    /***** 附件路径(随访照片) ***/
    @TableField(value = "file_path")
    private String filePath;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人ID ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人姓名 ***/
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

    /***** 修改人ID ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


