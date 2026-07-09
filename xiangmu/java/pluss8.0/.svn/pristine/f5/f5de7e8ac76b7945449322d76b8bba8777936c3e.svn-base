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

@TableName("tb_jiangyukeji_ins_logistics_outbound_info_detail")
@Data
public class InsLogisticsOutboundInfoDetail implements Serializable, Cloneable {

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

    /***** 出库主表id ***/
    @TableField(value = "outbound_id")
    private Long outboundId;

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

    /***** 出库单价(元) ***/
    @TableField(value = "out_price")
    private Double outPrice;

    /***** 出库数量 ***/
    @TableField(value = "out_num")
    private Integer outNum;

    /***** 出库金额(元) ***/
    @TableField(value = "out_amount")
    private Double outAmount;

    /***** 库存表id ***/
    @TableField(value = "inventory_id")
    private Long inventoryId;

    /***** 是否回收(0 ***/
    @TableField(value = "is_recovery")
    private Integer isRecovery;

    /***** 回收时间 ***/
    @TableField(value = "recovery_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date recoveryTime;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 录单人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 录单人姓名 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 录单时间 ***/
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


