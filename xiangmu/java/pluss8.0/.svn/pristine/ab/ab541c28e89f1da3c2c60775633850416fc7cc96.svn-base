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

@TableName("tb_jiangyukeji_ins_staff_member_card_info")
@Data
public class InsStaffMemberCardInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
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

    /***** 员工ID ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 员工姓名 ***/
    @TableField(value = "staff_name")
    private String staffName;

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

    /***** 会员卡密码 ***/
    @TableField(value = "card_pass")
    private String cardPass;

    /***** 会员等级 ***/
    @TableField(value = "member_level")
    private Long memberLevel;

    /***** 会员状态(1正常2挂失3注销4失效) ***/
    @TableField(value = "member_state")
    private String memberState;

    /***** 卡押金 ***/
    @TableField(value = "card_deposit")
    private Double cardDeposit;

    /***** 账户余额 ***/
    @TableField(value = "member_amount")
    private Double memberAmount;

    /***** 账户积分 ***/
    @TableField(value = "member_integral")
    private Integer memberIntegral;

    /***** 开卡人 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 推荐人 ***/
    @TableField(value = "referee_name")
    private String refereeName;

    /***** 生效日期 ***/
    @TableField(value = "effective_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date effectiveDate;

    /***** 失效日期 ***/
    @TableField(value = "expiration_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date expirationDate;

    /***** 消费上限阀值 ***/
    @TableField(value = "max_consumption")
    private Double maxConsumption;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

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


}


