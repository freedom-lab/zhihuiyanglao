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

@TableName("tb_jiangyukeji_health_chronic_disease_archive")
@Data
public class HealthChronicDiseaseArchive implements Serializable, Cloneable {

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

    /***** 建档医生ID ***/
    @TableField(value = "doctor_id")
    private Long doctorId;

    /***** 建档医生姓名 ***/
    @TableField(value = "doctor_name")
    private String doctorName;

    /***** 档案编号(区域编码+年份+流水号) ***/
    @TableField(value = "archive_no")
    private String archiveNo;

    /***** 建档日期 ***/
    @TableField(value = "establish_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date establishDate;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1男 ***/
    @TableField(value = "sex")
    private String sex;

    /***** 出生日期 ***/
    @TableField(value = "birth_date")
    private String birthDate;

    /***** 医保类型(数据字典(medical_category)) ***/
    @TableField(value = "medical_category")
    private String medicalCategory;

    /***** 医保卡号 ***/
    @TableField(value = "medical_card_number")
    private String medicalCardNumber;

    /***** 慢病名称ids ***/
    @TableField(value = "disease_ids")
    private String diseaseIds;

    /***** 慢病名称(多个逗号分隔) ***/
    @TableField(value = "disease_names")
    private String diseaseNames;

    /***** 吸烟状态(数据字典(smoking_state)) ***/
    @TableField(value = "smoking_status")
    private String smokingStatus;

    /***** 饮酒状态(数据字典(drinking_habits)) ***/
    @TableField(value = "drinking_status")
    private String drinkingStatus;

    /***** 饮食习惯(数据字典(eating_habits)) ***/
    @TableField(value = "diet_habits")
    private String dietHabits;

    /***** 运动习惯(运动类型、频率、时长) ***/
    @TableField(value = "exercise_habits")
    private String exerciseHabits;

    /***** 睡眠情况(每日睡眠时间、睡眠质量) ***/
    @TableField(value = "sleep_condition")
    private String sleepCondition;

    /***** 药物过敏史 ***/
    @TableField(value = "drug_allergy_history")
    private String drugAllergyHistory;

    /***** 既往重大疾病史 ***/
    @TableField(value = "major_disease_history")
    private String majorDiseaseHistory;

    /***** 家族病史 ***/
    @TableField(value = "family_medical_history")
    private String familyMedicalHistory;

    /***** 既往转诊记录 ***/
    @TableField(value = "past_referral_records")
    private String pastReferralRecords;

    /***** 风险等级(1低危 ***/
    @TableField(value = "risk_level")
    private Integer riskLevel;

    /***** 病情控制情况(1控制良好 ***/
    @TableField(value = "control_status")
    private Integer controlStatus;

    /***** 随访周期(1.每1个月1次 ***/
    @TableField(value = "follow_up_cycle")
    private Integer followUpCycle;

    /***** 家庭医生签约状态(0未签约 ***/
    @TableField(value = "sign_state")
    private Integer signState;

    /***** 签约日期 ***/
    @TableField(value = "sign_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date signDate;

    /***** 签约医生ID ***/
    @TableField(value = "sign_doctor_id")
    private Long signDoctorId;

    /***** 签约医生姓名 ***/
    @TableField(value = "sign_doctor_name")
    private String signDoctorName;

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


