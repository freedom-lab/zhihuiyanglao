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

@TableName("tb_jiangyukeji_market_order_evaluation")
@Data
public class MarketOrderEvaluation implements Serializable, Cloneable {

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

    /***** 商品ID ***/
    @TableField(value = "goods_id")
    private Long goodsId;

    /***** 商品名称 ***/
    @TableField(value = "goods_name")
    private String goodsName;

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 订单ID ***/
    @TableField(value = "order_id")
    private Long orderId;

    /***** 评价人类别(1老人2子女3管家) ***/
    @TableField(value = "person_type")
    private String personType;

    /***** 评价人人ID ***/
    @TableField(value = "person_id")
    private Long personId;

    /***** 评价人 ***/
    @TableField(value = "person_name")
    private String personName;

    /***** 评价人头像 ***/
    @TableField(value = "person_img")
    private String personImg;

    /***** 评价时间 ***/
    @TableField(value = "complaint_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date complaintTime;

    /***** 评论内容 ***/
    @TableField(value = "content")
    private String content;

    /***** 评价图片 ***/
    @TableField(value = "images")
    private String images;

    /***** 商家回复 ***/
    @TableField(value = "reply_content")
    private String replyContent;

    /***** 回复时间 ***/
    @TableField(value = "reply_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date replyTime;

    /***** 是否回复 ***/
    @TableField(value = "reply_state")
    private String replyState;

    /***** 得分，1-5星 ***/
    @TableField(value = "score")
    private String score;

    /***** 是否匿名(1:是 ***/
    @TableField(value = "is_anonymous")
    private String isAnonymous;

    /***** 是否显示，1:为显示，0:不显示 ***/
    @TableField(value = "is_show")
    private String isShow;

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


}


