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

@TableName("tb_jiangyukeji_member_consume_log")
@Data
public class MemberConsumeLog implements Serializable, Cloneable {

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

    /***** 流水号 ***/
    @TableField(value = "serial_number")
    private String serialNumber;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 会员卡号 ***/
    @TableField(value = "member_card")
    private String memberCard;

    /***** 会员等级 ***/
    @TableField(value = "member_level")
    private Long memberLevel;

    /***** 消费名称 ***/
    @TableField(value = "consume_name")
    private String consumeName;

    /***** 消费类型(1门店服务2养老商城3日照中心4老年食堂5老年大学6辅具租赁10机构会员) ***/
    @TableField(value = "consume_type")
    private String consumeType;

    /***** 消费金额 ***/
    @TableField(value = "consume_amount")
    private Double consumeAmount;

    /***** 赠送积分 ***/
    @TableField(value = "integral")
    private Integer integral;

    /***** 居家付款方式(1现金2微信3支付宝4余额5银联卡)，机构支付方式(1现金 ***/
    @TableField(value = "pay_type")
    private String payType;

    /***** 支付状态 ***/
    @TableField(value = "pay_state")
    private String payState;

    /***** 消费状态 ***/
    @TableField(value = "consume_state")
    private String consumeState;

    /***** 消费时间 ***/
    @TableField(value = "consume_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date consumeTime;

    /***** 操作人 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 数据来源(1本系统 ***/
    @TableField(value = "data_source")
    private Integer dataSource;

    /***** 是否已读(0未读 ***/
    @TableField(value = "is_readly")
    private Integer isReadly;


}


