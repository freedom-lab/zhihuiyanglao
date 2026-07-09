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

@TableName("tb_jiangyukeji_assessment_person_info")
@Data
public class AssessmentPersonInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 所属评估机构ID ***/
    @TableField(value = "institution_id")
    private String institutionId;

    /***** 所属评估机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 评估师编号(如:PGS000001) ***/
    @TableField(value = "person_code")
    private String personCode;

    /***** 评估人员姓名 ***/
    @TableField(value = "person_name")
    private String personName;

    /***** 性别 ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 手机号码（系统登录账号） ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 登录密码 ***/
    @TableField(value = "password")
    private String password;

    /***** 评估师等级(数据字典) ***/
    @TableField(value = "skill_level")
    private String skillLevel;

    /***** 证件类型 ***/
    @TableField(value = "document_type")
    private String documentType;

    /***** 证件号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 专长 ***/
    @TableField(value = "special_ability")
    private String specialAbility;

    /***** 身份证照片（正） ***/
    @TableField(value = "id_card_patha")
    private String idCardPatha;

    /***** 身份证照片（反） ***/
    @TableField(value = "id_card_pathb")
    private String idCardPathb;

    /***** 民族 ***/
    @TableField(value = "nation")
    private String nation;

    /***** 文化程度 ***/
    @TableField(value = "degree_education")
    private String degreeEducation;

    /***** 职务(数据字典) ***/
    @TableField(value = "duty_type")
    private String dutyType;

    /***** 入职时间 ***/
    @TableField(value = "entry_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date entryDate;

    /***** 离职时间 ***/
    @TableField(value = "dimission_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dimissionDate;

    /***** 照片 ***/
    @TableField(value = "photo")
    private String photo;

    /***** 家庭地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 证书图片(多个逗号分割) ***/
    @TableField(value = "certificate_img")
    private String certificateImg;

    /***** 备注信息 ***/
    @TableField(value = "memo")
    private String memo;

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

    /***** 服务状态(0停止1正常) ***/
    @TableField(value = "server_state")
    private String serverState;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;


}


