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

@TableName("tb_jiangyukeji_health_base_info")
@Data
public class HealthBaseInfo implements Serializable, Cloneable {

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

    /***** 性别（1：男，2：女） ***/
    @TableField(value = "sex")
    private String sex;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 婚姻状况 ***/
    @TableField(value = "marry_state")
    private String marryState;

    /***** 文化程度 ***/
    @TableField(value = "degree_education")
    private String degreeEducation;

    /***** 残疾情况类型 ***/
    @TableField(value = "disability_type")
    private String disabilityType;

    /***** 主要慢性病IDS ***/
    @TableField(value = "major_diseases")
    private String majorDiseases;

    /***** 主要慢性病名称 ***/
    @TableField(value = "major_diseases_name")
    private String majorDiseasesName;

    /***** 医保类别代码 ***/
    @TableField(value = "medical_category")
    private String medicalCategory;

    /***** 有无子女（0否1是） ***/
    @TableField(value = "is_children")
    private Integer isChildren;

    /***** 工作单位 ***/
    @TableField(value = "work_unit")
    private String workUnit;

    /***** 职业 ***/
    @TableField(value = "career")
    private String career;

    /***** 档案编号 ***/
    @TableField(value = "file_code")
    private String fileCode;

    /***** 建档日期 ***/
    @TableField(value = "file_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date fileDate;

    /***** 建档人 ***/
    @TableField(value = "put_file_name")
    private String putFileName;

    /***** 基本情况-身高（厘米） ***/
    @TableField(value = "height")
    private Double height;

    /***** 基本情况-体重（千克） ***/
    @TableField(value = "weight")
    private Double weight;

    /***** 基本情况-腰围（厘米） ***/
    @TableField(value = "waist")
    private Double waist;

    /***** 个人史-暴露史(1.无 ***/
    @TableField(value = "exposure_history")
    private String exposureHistory;

    /***** 个人史-饮酒史(1无2已戒3偶尔4经常5每天) ***/
    @TableField(value = "drinking_habits")
    private String drinkingHabits;

    /***** 个人史-吸烟史(1无，2已戒，3每10支以内，4每日1包，5每日2包或以上) ***/
    @TableField(value = "smoking_habits")
    private String smokingHabits;

    /***** 个人史-过敏史（1.无2.青霉素3磺胺4链霉素5其他） ***/
    @TableField(value = "allergic_history")
    private String allergicHistory;

    /***** 一般情况-饮食(1.普食 ***/
    @TableField(value = "dietary_habit")
    private String dietaryHabit;

    /***** 一般情况-睡眠(1.3-5小时2.5-7小时3.7-9小时4.9-12小时) ***/
    @TableField(value = "sleep_quality")
    private String sleepQuality;

    /***** 一般情况-二便（1.正常 ***/
    @TableField(value = "relieve_bowels")
    private String relieveBowels;

    /***** 病史-手术史-手术名称1 ***/
    @TableField(value = "operation_name_one")
    private String operationNameOne;

    /***** 病史-手术史-手术时间1 ***/
    @TableField(value = "operation_time_one")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operationTimeOne;

    /***** 病史-手术史-手术名称2 ***/
    @TableField(value = "operation_name_two")
    private String operationNameTwo;

    /***** 病史-手术史-手术时间2 ***/
    @TableField(value = "operation_time_two")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operationTimeTwo;

    /***** 病史-外伤史-外伤名称1 ***/
    @TableField(value = "trauma_name_one")
    private String traumaNameOne;

    /***** 病史-外伤史-外伤时间1 ***/
    @TableField(value = "trauma_time_one")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date traumaTimeOne;

    /***** 病史-外伤史-外伤名称2 ***/
    @TableField(value = "trauma_name_two")
    private String traumaNameTwo;

    /***** 病史-外伤史-外伤名称2 ***/
    @TableField(value = "trauma_time_two")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date traumaTimeTwo;

    /***** 病史-输血史-输血原因1 ***/
    @TableField(value = "blood_name_one")
    private String bloodNameOne;

    /***** 病史-输血史-输血日期1 ***/
    @TableField(value = "blood_time_one")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date bloodTimeOne;

    /***** 病史-输血史-输血原因2 ***/
    @TableField(value = "blood_name_two")
    private String bloodNameTwo;

    /***** 病史-输血史-输血日期2 ***/
    @TableField(value = "blood_time_two")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date bloodTimeTwo;

    /***** 家族史-父亲 ***/
    @TableField(value = "father_disease_ids")
    private String fatherDiseaseIds;

    /***** 家族史-母亲 ***/
    @TableField(value = "mother_disease_ids")
    private String motherDiseaseIds;

    /***** 家族史-子女 ***/
    @TableField(value = "children_disease_ids")
    private String childrenDiseaseIds;

    /***** 家族史-兄弟姐妹 ***/
    @TableField(value = "brother_disease_ids")
    private String brotherDiseaseIds;

    /***** 遗传病史 ***/
    @TableField(value = "genetic_disease")
    private String geneticDisease;

    /***** 健康指导 ***/
    @TableField(value = "health_guidance")
    private String healthGuidance;

    /***** 插管种类(数据字典 ***/
    @TableField(value = "intubation_type")
    private String intubationType;

    /***** 备注 ***/
    @TableField(value = "memo")
    private String memo;

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

    /***** 其他疾病名称 ***/
    @TableField(value = "major_diseases_other")
    private String majorDiseasesOther;

    /***** 患者ID(360视图使用) ***/
    @TableField(value = "pid")
    private String pid;

    /***** 就诊ID(360视图使用) ***/
    @TableField(value = "pvid")
    private String pvid;

    /***** 血型 ***/
    @TableField(value = "blood_type")
    private String bloodType;


}


