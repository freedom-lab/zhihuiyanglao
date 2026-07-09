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

@TableName("tb_jiangyukeji_ins_logistics_inventory_adjust")
@Data
public class InsLogisticsInventoryAdjust implements Serializable, Cloneable {

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

    /***** 调整日期 ***/
    @TableField(value = "adjust_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date adjustDate;

    /***** 仓库id ***/
    @TableField(value = "warehouse_id")
    private Long warehouseId;

    /***** 仓库名称 ***/
    @TableField(value = "warehouse_name")
    private String warehouseName;

    /***** 物品id ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 物品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 物品编号 ***/
    @TableField(value = "goods_code")
    private String goodsCode;

    /***** 原库存数量 ***/
    @TableField(value = "old_stock_num")
    private Integer oldStockNum;

    /***** 调整数量 ***/
    @TableField(value = "adjust_num")
    private Integer adjustNum;

    /***** 现库存数量 ***/
    @TableField(value = "new_stock_num")
    private Integer newStockNum;

    /***** 调整原因 ***/
    @TableField(value = "adjust_memo")
    private String adjustMemo;

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


