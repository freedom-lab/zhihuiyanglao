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

@TableName("tb_jiangyukeji_market_order_item")
@Data
public class MarketOrderItem implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 订单ID ***/
    @TableField(value = "order_id")
    private Long orderId;

    /***** 商品ID ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 大类ID ***/
    @TableField(value = "big_type_id")
    private Long bigTypeId;

    /***** 大类名称 ***/
    @TableField(value = "big_type_name")
    private String bigTypeName;

    /***** 商品SkuID ***/
    @TableField(value = "sku_id")
    private Long skuId;

    /***** 购物车商品个数 ***/
    @TableField(value = "goods_count")
    private Integer goodsCount;

    /***** 商品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** sku名称 ***/
    @TableField(value = "sku_name")
    private String skuName;

    /***** 商品主图片路径 ***/
    @TableField(value = "pic")
    private String pic;

    /***** 商品单价 ***/
    @TableField(value = "price")
    private Double price;

    /***** 用户Id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 商品总金额 ***/
    @TableField(value = "total_amount")
    private Double totalAmount;

    /***** 购物时间 ***/
    @TableField(value = "buy_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date buyTime;

    /***** 评论状态： ***/
    @TableField(value = "evaluate_state")
    private String evaluateState;

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


