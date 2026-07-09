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

@TableName("tb_jiangyukeji_ins_logistics_supplier_info")
@Data
public class InsLogisticsSupplierInfo implements Serializable, Cloneable {

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

    /***** 供应商名称 ***/
    @TableField(value = "supplier_name")
    private String supplierName;

    /***** 供应商类型 ***/
    @TableField(value = "supplier_type")
    private String supplierType;

    /***** 联系人 ***/
    @TableField(value = "link_man")
    private String linkMan;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 法人姓名 ***/
    @TableField(value = "legal_person")
    private String legalPerson;

    /***** 证件类型(数据字典 ***/
    @TableField(value = "document_type")
    private String documentType;

    /***** 证件号码 ***/
    @TableField(value = "document_code")
    private String documentCode;

    /***** 税号 ***/
    @TableField(value = "tax_number")
    private String taxNumber;

    /***** 开户名 ***/
    @TableField(value = "account_name")
    private String accountName;

    /***** 开户银行 ***/
    @TableField(value = "bank_name")
    private String bankName;

    /***** 银行账号 ***/
    @TableField(value = "bank_code")
    private String bankCode;

    /***** 营业执照编号 ***/
    @TableField(value = "business_number")
    private String businessNumber;

    /***** 有效期 ***/
    @TableField(value = "period_validity")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date periodValidity;

    /***** 经营范围 ***/
    @TableField(value = "business_scope")
    private String businessScope;

    /***** 供应商地址 ***/
    @TableField(value = "supplier_address")
    private String supplierAddress;

    /***** 营业执照路径 ***/
    @TableField(value = "business_img_path")
    private String businessImgPath;

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

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


