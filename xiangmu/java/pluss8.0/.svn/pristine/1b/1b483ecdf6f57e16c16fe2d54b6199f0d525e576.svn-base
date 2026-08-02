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

@TableName("tb_jiangyukeji_ins_donate_record_detail")
@Data
public class InsDonateRecordDetail implements Serializable, Cloneable {

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

    /***** 捐赠记录表主键id ***/
    @TableField(value = "donate_id")
    private Long donateId;

    /***** 捐赠类型(1物资 ***/
    @TableField(value = "donate_type")
    private Integer donateType;

    /***** 物资名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 物资规格 ***/
    @TableField(value = "goods_specificate")
    private String goodsSpecificate;

    /***** 物资单位 ***/
    @TableField(value = "goods_unit")
    private String goodsUnit;

    /***** 物资数量 ***/
    @TableField(value = "goods_num")
    private Integer goodsNum;

    /***** 物资为折合金额，现金为捐赠金额 ***/
    @TableField(value = "conver_amount")
    private Double converAmount;

    /***** 存放地址 ***/
    @TableField(value = "storage_position")
    private String storagePosition;

    /***** 有效期 ***/
    @TableField(value = "effective_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date effectiveDate;

    /***** 物资为剩余数量，现金为剩余金额 ***/
    @TableField(value = "surplus_num")
    private Double surplusNum;

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


