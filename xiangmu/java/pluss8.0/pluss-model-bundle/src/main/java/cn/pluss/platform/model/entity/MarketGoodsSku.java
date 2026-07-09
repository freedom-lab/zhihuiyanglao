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

@TableName("tb_jiangyukeji_market_goods_sku")
@Data
public class MarketGoodsSku implements Serializable, Cloneable {

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 商品ID ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 销售属性组合字符串 ***/
    @TableField(value = "properties")
    private String properties;

    /***** 原价（划线价格） ***/
    @TableField(value = "original_price")
    private Double originalPrice;

    /***** 价格（销售价格） ***/
    @TableField(value = "price")
    private Double price;

    /***** 初始销量 ***/
    @TableField(value = "start_sales_volume")
    private Integer startSalesVolume;

    /***** 商品库存 ***/
    @TableField(value = "stock")
    private Integer stock;

    /***** 实际库存 ***/
    @TableField(value = "actual_stock")
    private Integer actualStock;

    /***** 预警库存 ***/
    @TableField(value = "alarm_stock")
    private Integer alarmStock;

    /***** 商品条形码 ***/
    @TableField(value = "bar_code")
    private String barCode;

    /***** sku图片 ***/
    @TableField(value = "pic")
    private String pic;

    /***** sku名称 ***/
    @TableField(value = "sku_name")
    private String skuName;

    /***** 商品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 商品重量 ***/
    @TableField(value = "weight")
    private String weight;

    /***** 商品体积 ***/
    @TableField(value = "volume")
    private String volume;

    /***** 服务时长(针对服务类商品) ***/
    @TableField(value = "server_hour")
    private Double serverHour;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人 ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否删除(0否1是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;


}


