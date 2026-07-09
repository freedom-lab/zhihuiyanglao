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

@TableName("tb_jiangyukeji_ins_logistics_goods_info")
@Data
public class InsLogisticsGoodsInfo implements Serializable, Cloneable {

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

    /***** 保质期(月) ***/
    @TableField(value = "period_num")
    private Integer periodNum;

    /***** 是否允许售卖(1否 ***/
    @TableField(value = "is_sales")
    private Integer isSales;

    /***** 销售价格(元) ***/
    @TableField(value = "selling_price")
    private Double sellingPrice;

    /***** 预警库存 ***/
    @TableField(value = "early_stock")
    private Integer earlyStock;

    /***** 物品主图路径 ***/
    @TableField(value = "icon_path")
    private String iconPath;

    /***** 简要描述,卖点等 ***/
    @TableField(value = "brief_content")
    private String briefContent;

    /***** 详细描述 ***/
    @TableField(value = "description")
    private String description;

    /***** 浏览次数 ***/
    @TableField(value = "click_num")
    private Integer clickNum;

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

    /***** 物品状态(1上架 ***/
    @TableField(value = "status")
    private Integer status;


}


