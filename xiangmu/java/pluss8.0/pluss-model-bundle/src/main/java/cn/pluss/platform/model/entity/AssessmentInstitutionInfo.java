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

@TableName("tb_jiangyukeji_assessment_institution_info")
@Data
public class AssessmentInstitutionInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 机构编码（如:PGJG000001） ***/
    @TableField(value = "institution_code")
    private String institutionCode;

    /***** 机构简图 ***/
    @TableField(value = "institution_img")
    private String institutionImg;

    /***** 营业执照 ***/
    @TableField(value = "license_img")
    private String licenseImg;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 统一社会信用代码 ***/
    @TableField(value = "credit_code")
    private String creditCode;

    /***** 法定代表人 ***/
    @TableField(value = "legal_man")
    private String legalMan;

    /***** 法人联系电话 ***/
    @TableField(value = "legal_link_tel")
    private String legalLinkTel;

    /***** 法人身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系人 ***/
    @TableField(value = "manager")
    private String manager;

    /***** 联系人电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 成立日期 ***/
    @TableField(value = "establish_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date establishDate;

    /***** 登记机关 ***/
    @TableField(value = "registrar")
    private String registrar;

    /***** 经营范围 ***/
    @TableField(value = "business_area")
    private String businessArea;

    /***** 注册地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 登录用户名 ***/
    @TableField(value = "username")
    private String username;

    /***** 登录密码 ***/
    @TableField(value = "password")
    private String password;

    /***** 机构简介 ***/
    @TableField(value = "institution_brief")
    private String institutionBrief;

    /***** 服务状态(1正常服务0停止服务) ***/
    @TableField(value = "institution_status")
    private String institutionStatus;

    /***** 所属区划 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 所属区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 机构类型(1能力评估机构2等级评定机构) ***/
    @TableField(value = "institution_type")
    private String institutionType;

    /***** 服务范围(1省级2市级3县区级) ***/
    @TableField(value = "manage_level")
    private String manageLevel;


}


