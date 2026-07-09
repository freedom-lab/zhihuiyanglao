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

@TableName("tb_jiangyukeji_ins_base_cost_item_info")
@Data
public class InsBaseCostItemInfo implements Serializable, Cloneable {

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

    /***** 项目名称 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 项目日价格 ***/
    @TableField(value = "item_day_price")
    private Double itemDayPrice;

    /***** 项目月价格 ***/
    @TableField(value = "item_month_price")
    private Double itemMonthPrice;

    /***** 费用id ***/
    @TableField(value = "cost_id")
    private Long costId;

    /***** 费用类别编号 ***/
    @TableField(value = "cost_code")
    private String costCode;

    /***** 费用名称 ***/
    @TableField(value = "cost_name")
    private String costName;

    /***** 费用类别（1固定费用 ***/
    @TableField(value = "cost_type")
    private Integer costType;

    /***** 收费方式（1一次费用 ***/
    @TableField(value = "cost_mode")
    private Integer costMode;

    /***** 可否退款（1可退款 ***/
    @TableField(value = "is_refund")
    private Integer isRefund;

    /***** 对应能力评估等级 ***/
    @TableField(value = "ability_level")
    private String abilityLevel;

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


