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

@TableName("tb_jiangyukeji_market_goods_brand")
@Data
public class MarketGoodsBrand implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 商品分类 ***/
    @TableField(value = "goods_type")
    private Long goodsType;

    /***** 商品分类名称 ***/
    @TableField(value = "goods_type_name")
    private String goodsTypeName;

    /***** 品牌名称 ***/
    @TableField(value = "brand_name")
    private String brandName;

    /***** 图片路径 ***/
    @TableField(value = "brand_pic")
    private String brandPic;

    /***** 备注 ***/
    @TableField(value = "memo")
    private String memo;

    /***** 顺序 ***/
    @TableField(value = "sort")
    private Integer sort;

    /***** 简要描述 ***/
    @TableField(value = "brief")
    private String brief;

    /***** 内容 ***/
    @TableField(value = "content")
    private String content;

    /***** 品牌首字母 ***/
    @TableField(value = "first_char")
    private String firstChar;

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

    /***** 默认是1，表示正常状态,0为下线状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否删除(0否1是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;


}


