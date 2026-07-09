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

@TableName("tb_jiangyukeji_assessment_elder_base")
@Data
public class AssessmentElderBase implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 评估记录id ***/
    @TableField(value = "appoint_id")
    private Long appointId;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 出生日期 ***/
    @TableField(value = "birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 身高（CM） ***/
    @TableField(value = "height")
    private Integer height;

    /***** 体重（KG） ***/
    @TableField(value = "weight")
    private Double weight;

    /***** 民族 ***/
    @TableField(value = "nation")
    private String nation;

    /***** 宗教信仰(CFB01 ***/
    @TableField(value = "religion_type")
    private String religionType;

    /***** 文化程度 ***/
    @TableField(value = "degree_education")
    private String degreeEducation;

    /***** 居住情况（多选） ***/
    @TableField(value = "live_state")
    private String liveState;

    /***** 婚姻状况 ***/
    @TableField(value = "marry_state")
    private String marryState;

    /***** 医疗费用支付方式（多选） ***/
    @TableField(value = "medical_type")
    private String medicalType;

    /***** 经济来源（多选） ***/
    @TableField(value = "economic_sources")
    private String economicSources;

    /***** 跌倒(0 ***/
    @TableField(value = "accident_one")
    private String accidentOne;

    /***** 走失(0 ***/
    @TableField(value = "accident_two")
    private String accidentTwo;

    /***** 噎食(0 ***/
    @TableField(value = "accident_three")
    private String accidentThree;

    /***** 自杀(0 ***/
    @TableField(value = "accident_four")
    private String accidentFour;

    /***** 其他(0 ***/
    @TableField(value = "accident_five")
    private String accidentFive;

    /***** 信息提供者姓名 ***/
    @TableField(value = "provide_name")
    private String provideName;

    /***** 信息提供者与老人关系( ***/
    @TableField(value = "provide_relation")
    private String provideRelation;

    /***** 联系人 ***/
    @TableField(value = "provide_man")
    private String provideMan;

    /***** 联系电话 ***/
    @TableField(value = "provide_tel")
    private String provideTel;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

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

    /***** 所属区划 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 所属区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 疾病诊断（字典多选） ***/
    @TableField(value = "major_diseases")
    private String majorDiseases;

    /***** 疾病名称 ***/
    @TableField(value = "major_diseases_name")
    private String majorDiseasesName;

    /***** 压力性损伤 ***/
    @TableField(value = "health_one")
    private Integer healthOne;

    /***** 关节活动度 ***/
    @TableField(value = "health_two")
    private Integer healthTwo;

    /***** 部位 ***/
    @TableField(value = "health_two_memo")
    private String healthTwoMemo;

    /***** 伤口情况(可多选) ***/
    @TableField(value = "health_three")
    private String healthThree;

    /***** 特殊护理情况(可多选) ***/
    @TableField(value = "health_four")
    private String healthFour;

    /***** 疼痛感 ***/
    @TableField(value = "health_five")
    private Integer healthFive;

    /***** 牙齿缺失情况(可多选) ***/
    @TableField(value = "health_six")
    private String healthSix;

    /***** 牙列缺损 ***/
    @TableField(value = "health_six_three")
    private Integer healthSixThree;

    /***** 牙列缺失 ***/
    @TableField(value = "health_six_four")
    private Integer healthSixFour;

    /***** 义齿佩戴情况(可多选) ***/
    @TableField(value = "health_seven")
    private String healthSeven;

    /***** 吞咽困难的情形和症状(可多选) ***/
    @TableField(value = "health_eight")
    private String healthEight;

    /***** 营养不良:体值指数(BMI)低于正常值 ***/
    @TableField(value = "health_nine")
    private Integer healthNine;

    /***** 清理呼吸道无效 ***/
    @TableField(value = "health_ten")
    private Integer healthTen;

    /***** 昏迷 ***/
    @TableField(value = "health_eleven")
    private Integer healthEleven;

    /***** 其他 ***/
    @TableField(value = "health_other")
    private String healthOther;

    /***** 其他疾病名称 ***/
    @TableField(value = "major_diseases_other")
    private String majorDiseasesOther;

    @TableField(exist = false)
    private Long checkId;


}


