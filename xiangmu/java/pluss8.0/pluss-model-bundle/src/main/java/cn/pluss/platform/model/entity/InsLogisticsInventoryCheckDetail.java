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

@TableName("tb_jiangyukeji_ins_logistics_inventory_check_detail")
@Data
public class InsLogisticsInventoryCheckDetail implements Serializable, Cloneable {

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

    /***** 盘点主表id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 物品id ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 物品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 物品编号 ***/
    @TableField(value = "goods_code")
    private String goodsCode;

    /***** 物品类别id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 物品类别名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 物品单位(数据字典(ins_goods_unit)) ***/
    @TableField(value = "goods_unit")
    private String goodsUnit;

    /***** 物品规格 ***/
    @TableField(value = "goods_standards")
    private String goodsStandards;

    /***** 条形码 ***/
    @TableField(value = "bar_code")
    private String barCode;

    /***** 生产厂家 ***/
    @TableField(value = "manufactor_name")
    private String manufactorName;

    /***** 账面结存库存数 ***/
    @TableField(value = "stock_num")
    private Integer stockNum;

    /***** 实际盘点数 ***/
    @TableField(value = "real_num")
    private Integer realNum;

    /***** 单价(元) ***/
    @TableField(value = "goods_price")
    private Double goodsPrice;

    /***** 盘盈盘亏数(自动计算) ***/
    @TableField(value = "differ_num")
    private Integer differNum;

    /***** 盘盈盘亏金额(元) ***/
    @TableField(value = "differ_amount")
    private Double differAmount;

    /***** 结转状态(1未结转 ***/
    @TableField(value = "check_state")
    private Integer checkState;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
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


