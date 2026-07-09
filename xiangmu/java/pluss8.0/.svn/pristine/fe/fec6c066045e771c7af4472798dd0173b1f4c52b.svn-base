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

@TableName("tb_jiangyukeji_market_goods_prop")
@Data
public class MarketGoodsProp implements Serializable, Cloneable {

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 商品ID ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 属性名称 ***/
    @TableField(value = "prop_name")
    private String propName;

    /***** 屬性值 ***/
    @TableField(value = "prop_value")
    private String propValue;

    /***** 属性类别 ***/
    @TableField(value = "rule")
    private String rule;

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

    /***** 商品规格ID ***/
    @TableField(value = "prop_category_id")
    private Long propCategoryId;

    /***** 属性选择类型：0->唯一；1->单选；2->多选 ***/
    @TableField(value = "select_type")
    private String selectType;

    /***** 属性录入方式：0->手工录入；1->从列表中选取 ***/
    @TableField(value = "input_type")
    private String inputType;

    /***** 可选值列表，以逗号隔开 ***/
    @TableField(value = "input_list")
    private String inputList;

    /***** 分类筛选样式：1->普通；2->颜色 ***/
    @TableField(value = "filter_type")
    private String filterType;

    /***** 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索 ***/
    @TableField(value = "search_type")
    private String searchType;

    /***** 相同属性产品是否关联；0->不关联；1->关联 ***/
    @TableField(value = "related_status")
    private String relatedStatus;

    /***** 是否支持手动新增；0->不支持；1->支持 ***/
    @TableField(value = "hand_add_status")
    private String handAddStatus;


}


