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

@TableName("tb_jiangyukeji_market_goods_info")
@Data
public class MarketGoodsInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 产品规格ID ***/
    @TableField(value = "attribute_category_id")
    private Long attributeCategoryId;

    /***** 商品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 商品货号 ***/
    @TableField(value = "goods_sn")
    private String goodsSn;

    /***** 副标题 ***/
    @TableField(value = "sub_good_name")
    private String subGoodName;

    /***** 商品编号 ***/
    @TableField(value = "goods_code")
    private String goodsCode;

    /***** 品牌ID ***/
    @TableField(value = "brand_id")
    private Long brandId;

    /***** 品牌名称 ***/
    @TableField(value = "brand_name")
    private String brandName;

    /***** 原价 ***/
    @TableField(value = "original_price")
    private Double originalPrice;

    /***** 现价(不用了) ***/
    @TableField(value = "price")
    private Double price;

    /***** 简要描述,卖点等 ***/
    @TableField(value = "brief")
    private String brief;

    /***** 详细描述 ***/
    @TableField(value = "description")
    private String description;

    /***** 商品主图 ***/
    @TableField(value = "pic")
    private String pic;

    /***** 商品图片，以,分割 ***/
    @TableField(value = "imgs")
    private String imgs;

    /***** 商品大类ID ***/
    @TableField(value = "big_type_id")
    private Long bigTypeId;

    /***** 商品大类名称 ***/
    @TableField(value = "big_type_name")
    private String bigTypeName;

    /***** 商品分类id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 商品分类名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 销量 ***/
    @TableField(value = "sale_num")
    private Integer saleNum;

    /***** 总库存 ***/
    @TableField(value = "total_stock")
    private Integer totalStock;

    /***** 商品类型(1居家上门2老年商城) ***/
    @TableField(value = "category_type")
    private String categoryType;

    /***** 配送类型(1邮寄2自取3送货上门) ***/
    @TableField(value = "delivery_type")
    private String deliveryType;

    /***** 是否包邮(0否1是) ***/
    @TableField(value = "is_free_ship")
    private String isFreeShip;

    /***** 邮费 ***/
    @TableField(value = "express_fee")
    private Double expressFee;

    /***** 是否新品(0否1是) ***/
    @TableField(value = "is_new")
    private String isNew;

    /***** 是否推荐(0否1是) ***/
    @TableField(value = "is_suggest")
    private String isSuggest;

    /***** 是否允许使用积分抵扣(0否1是) ***/
    @TableField(value = "is_use_integral")
    private String isUseIntegral;

    /***** 是否允许使用会员折扣(0否1是) ***/
    @TableField(value = "is_use_member")
    private String isUseMember;

    /***** 是否允许使用优惠券(0否1是) ***/
    @TableField(value = "is_use_coupon")
    private String isUseCoupon;

    /***** 计量单位 ***/
    @TableField(value = "unit")
    private String unit;

    /***** 审核状态（0未审批1审批通过2审批不通过） ***/
    @TableField(value = "audit_state")
    private String auditState;

    /***** 上架时间 ***/
    @TableField(value = "putaway_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date putawayTime;

    /***** 浏览次数 ***/
    @TableField(value = "click_num")
    private Integer clickNum;

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

    /***** 默认是1，表示正常状态, ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否删除(0否1是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 产品服务(1->无忧退货；2->快速退款；3->免费包邮 ***/
    @TableField(value = "service_ids")
    private String serviceIds;


}


