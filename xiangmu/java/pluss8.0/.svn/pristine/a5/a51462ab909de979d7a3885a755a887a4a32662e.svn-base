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

@TableName("tb_jiangyukeji_elder_base_info")
@Data
public class ElderBaseInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人编号 ***/
    @TableField(value = "file_code")
    private String fileCode;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 长者码 ***/
    @TableField(value = "elder_code")
    private String elderCode;

    /***** 照片 ***/
    @TableField(value = "elder_img")
    private String elderImg;

    /***** 二维码 ***/
    @TableField(value = "elder_code_image")
    private String elderCodeImage;

    /***** 老人护理等级 ***/
    @TableField(value = "elder_nursing_level")
    private String elderNursingLevel;

    /***** 性别(1男，2女) ***/
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

    /***** 农历生日 ***/
    @TableField(value = "traditional_birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date traditionalBirthday;

    /***** 血型 ***/
    @TableField(value = "blood_type")
    private String bloodType;

    /***** 国籍 ***/
    @TableField(value = "nationality")
    private String nationality;

    /***** 民族 ***/
    @TableField(value = "nation")
    private String nation;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 固定电话 ***/
    @TableField(value = "home_tel")
    private String homeTel;

    /***** 服务类型(1社会老人2政府购买) ***/
    @TableField(value = "census_type")
    private Integer censusType;

    /***** 老人类别(CH052收住老人类型代码) ***/
    @TableField(value = "elder_type")
    private String elderType;

    /***** 证件类型 ***/
    @TableField(value = "document_type")
    private String documentType;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 社保卡号 ***/
    @TableField(value = "social_card_no")
    private String socialCardNo;

    /***** 服务状态(0停止服务1正常服务) ***/
    @TableField(value = "elder_state")
    private Integer elderState;

    /***** 养老方式(1居家2机构) ***/
    @TableField(value = "pension_mode")
    private Integer pensionMode;

    /***** 身份状况 ***/
    @TableField(value = "identity_status")
    private String identityStatus;

    /***** 供养类型(1集中供养2分散供养;数据字典provide_type) ***/
    @TableField(value = "provide_type")
    private String provideType;

    /***** 婚姻状况 ***/
    @TableField(value = "marry_state")
    private String marryState;

    /***** 文化程度 ***/
    @TableField(value = "degree_education")
    private String degreeEducation;

    /***** 政治面貌(C0013 ***/
    @TableField(value = "political_status")
    private String politicalStatus;

    /***** 宗教信仰(CFB01 ***/
    @TableField(value = "religion_type")
    private String religionType;

    /***** 经济来源(CJ015 ***/
    @TableField(value = "economic_sources")
    private String economicSources;

    /***** 月收入(数据字典) ***/
    @TableField(value = "monthly_income")
    private String monthlyIncome;

    /***** 居住状况 ***/
    @TableField(value = "live_state")
    private String liveState;

    /***** 户籍类型 ***/
    @TableField(value = "pesidence_type")
    private String pesidenceType;

    /***** 户籍行政区划 ***/
    @TableField(value = "pesidence_area_code")
    private Long pesidenceAreaCode;

    /***** 户籍行政区划名称 ***/
    @TableField(value = "pesidence_area_name")
    private String pesidenceAreaName;

    /***** 户籍地址 ***/
    @TableField(value = "pesidence_address")
    private String pesidenceAddress;

    /***** 现居住地址 ***/
    @TableField(value = "home_address")
    private String homeAddress;

    /***** 所属小区ID ***/
    @TableField(value = "residence_id")
    private Long residenceId;

    /***** 所属小区 ***/
    @TableField(value = "residence_name")
    private String residenceName;

    /***** 是否特困供养（0否1是） ***/
    @TableField(value = "is_provide")
    private String isProvide;

    /***** 是否居住户籍所在地（0-非户籍 ***/
    @TableField(value = "is_stay_pesidence")
    private String isStayPesidence;

    /***** 是否独居（0：否，1：是） ***/
    @TableField(value = "is_alone")
    private String isAlone;

    /***** 是否失智（0-否 ***/
    @TableField(value = "is_dementia")
    private String isDementia;

    /***** 是否留守（0-否 ***/
    @TableField(value = "is_stay_behind")
    private String isStayBehind;

    /***** 是否低保（0-否 ***/
    @TableField(value = "is_allowance")
    private String isAllowance;

    /***** 是否特困（0-否 ***/
    @TableField(value = "is_poor")
    private String isPoor;

    /***** 是否孤老（0-否 ***/
    @TableField(value = "is_lonely_old")
    private String isLonelyOld;

    /***** 是否享受长护险（0-否 ***/
    @TableField(value = "is_ltci")
    private String isLtci;

    /***** 是否失能（0-否 ***/
    @TableField(value = "is_disabled")
    private String isDisabled;

    /***** 是否计划生育特殊困难家庭老年人（0-否 ***/
    @TableField(value = "is_extremely_poor")
    private String isExtremelyPoor;

    /***** 是否参加社保（0-否 ***/
    @TableField(value = "is_social_insurance")
    private String isSocialInsurance;

    /***** 是否优抚（0-否1-是） ***/
    @TableField(value = "is_entitled")
    private String isEntitled;

    /***** 医保类别代码 ***/
    @TableField(value = "medical_category")
    private String medicalCategory;

    /***** 基本养老保险类型(1职工养老保险2城乡居民养老保险) ***/
    @TableField(value = "oldage_insurance_type")
    private String oldageInsuranceType;

    /***** 能力评估等级（A.54 ***/
    @TableField(value = "ability_level")
    private String abilityLevel;

    /***** 是否残疾（0-否 ***/
    @TableField(value = "is_disability")
    private String isDisability;

    /***** 残疾等级代码 ***/
    @TableField(value = "disability_level")
    private String disabilityLevel;

    /***** 残疾类别类型 ***/
    @TableField(value = "disability_type")
    private String disabilityType;

    /***** 残疾证号码 ***/
    @TableField(value = "disability_card")
    private String disabilityCard;

    /***** 主要慢性病情况 ***/
    @TableField(value = "major_diseases")
    private String majorDiseases;

    /***** 主要慢性病名称 ***/
    @TableField(value = "major_diseases_name")
    private String majorDiseasesName;

    /***** 监护人姓名 ***/
    @TableField(value = "guardian_contact")
    private String guardianContact;

    /***** 监护人电话 ***/
    @TableField(value = "guardian_contact_tel")
    private String guardianContactTel;

    /***** 与老人关系代码 ***/
    @TableField(value = "guardian_contact_relationship")
    private String guardianContactRelationship;

    /***** 监护人地址 ***/
    @TableField(value = "guardian_contact_address")
    private String guardianContactAddress;

    /***** 紧急联系人姓名 ***/
    @TableField(value = "emergency_contact")
    private String emergencyContact;

    /***** 紧急联系人电话 ***/
    @TableField(value = "emergency_contact_tel")
    private String emergencyContactTel;

    /***** 与老人关系代码 ***/
    @TableField(value = "emergency_contact_relationship")
    private String emergencyContactRelationship;

    /***** 监护人地址 ***/
    @TableField(value = "emergency_contact_address")
    private String emergencyContactAddress;

    /***** 子女数 ***/
    @TableField(value = "child_num")
    private Integer childNum;

    /***** 性格(1外向2内向) ***/
    @TableField(value = "character_type")
    private String characterType;

    /***** 兴趣爱好 ***/
    @TableField(value = "hobby")
    private String hobby;

    /***** 饮食习惯 ***/
    @TableField(value = "eating_habits")
    private String eatingHabits;

    /***** 禁忌事项 ***/
    @TableField(value = "taboo")
    private String taboo;

    /***** 工作单位 ***/
    @TableField(value = "work_unit")
    private String workUnit;

    /***** 默认值(Sd3500135@)弃用 ***/
    @TableField(value = "app_pass")
    private String appPass;

    /***** 数据来源(1批量导入2接口上报3后台新增4用户注册5管家新增6采集新增) ***/
    @TableField(value = "is_come")
    private String isCome;

    /***** 高德地图经度 ***/
    @TableField(value = "lon")
    private Double lon;

    /***** 高德地图纬度 ***/
    @TableField(value = "lat")
    private Double lat;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 审核状态（0未审批1审批通过2审批不通过） ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审核意见 ***/
    @TableField(value = "audit_opinion")
    private String auditOpinion;

    /***** 是否高龄(0否1是) ***/
    @TableField(value = "is_older_age")
    private String isOlderAge;

    /***** 是否空巢(0否1是) ***/
    @TableField(value = "is_empty_nest")
    private String isEmptyNest;

    /***** 是否已进行适老化改造(0否1残联2民政实施) ***/
    @TableField(value = "is_reform")
    private String isReform;

    /***** 是否已做过家庭养老床位建设(0否1是) ***/
    @TableField(value = "is_bed_build")
    private String isBedBuild;

    /***** 是否享受养老服务补贴(0否1是) ***/
    @TableField(value = "is_service_subsidy")
    private String isServiceSubsidy;

    /***** 是否享受护理补贴(0否1是) ***/
    @TableField(value = "is_nursing_subsidy")
    private String isNursingSubsidy;

    /***** 是否自理(0否1是) ***/
    @TableField(value = "is_self_care")
    private String isSelfCare;

    /***** 经济困难失能老年人集中照护((0否1是) ***/
    @TableField(value = "is_centralized_care")
    private String isCentralizedCare;

    /***** 户主姓名 ***/
    @TableField(value = "householder_name")
    private String householderName;

    /***** 户主身份证 ***/
    @TableField(value = "householder_id_card")
    private String householderIdCard;

    /***** 户主年龄 ***/
    @TableField(value = "householder_age")
    private Integer householderAge;

    /***** 20项基本养老服务ids ***/
    @TableField(value = "basic_service_ids")
    private String basicServiceIds;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 登记人 ***/
    @TableField(value = "create_name")
    private String createName;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 实体ID ***/
    @TableField(value = "guid")
    private String guid;

    /***** 人员实体ID ***/
    @TableField(value = "face_guid")
    private String faceGuid;

    /***** 同步状态 ***/
    @TableField(value = "gsp_state")
    private Integer gspState;

    /***** 世行服务老人主键Id ***/
    @TableField(value = "fk_elder_id")
    private String fkElderId;

    /***** 平均可支配月收入（元） ***/
    @TableField(value = "monthly_disposable_income")
    private Double monthlyDisposableIncome;

    /***** 健康状况(数据字典 ***/
    @TableField(value = "health_condition")
    private String healthCondition;

    /***** 一体机ID ***/
    @TableField(value = "health_id")
    private String healthId;

    /***** 护理床意愿(0否1是) ***/
    @TableField(value = "is_wish_care_bed")
    private Integer isWishCareBed;

    /***** 护理床安装条件(0无1有) ***/
    @TableField(value = "is_install_care_bed")
    private Integer isInstallCareBed;

    /***** NFC卡号 ***/
    @TableField(value = "nfc_number")
    private String nfcNumber;

    /***** 其他疾病名称 ***/
    @TableField(value = "major_diseases_other")
    private String majorDiseasesOther;

    /***** 1未评估，2已评估 ***/
    @TableField(value = "is_check")
    private Integer isCheck;


}


