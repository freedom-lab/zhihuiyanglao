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

@TableName("tb_jiangyukeji_care_leave_record")
@Data
public class CareLeaveRecord implements Serializable, Cloneable {

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

    /***** 入托信息主键id ***/
    @TableField(value = "enroll_id")
    private Long enrollId;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 请假开始日期 ***/
    @TableField(value = "leave_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date leaveDate;

    /***** 销假日期 ***/
    @TableField(value = "back_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date backDate;

    /***** 请假天数 ***/
    @TableField(value = "leave_day")
    private Integer leaveDay;

    /***** 请假原因 ***/
    @TableField(value = "leave_reason")
    private String leaveReason;

    /***** 陪同人 ***/
    @TableField(value = "with_name")
    private String withName;

    /***** 陪同人联系电话 ***/
    @TableField(value = "with_link_tel")
    private String withLinkTel;

    /***** 是否退床位费(0否1是) ***/
    @TableField(value = "is_refund")
    private String isRefund;

    /***** 费用是否已结算(0否1是) ***/
    @TableField(value = "is_fee")
    private Integer isFee;

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

    /***** 请假状态(1:请假中，0:已销假) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否删除(0否1是) ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否已核算退费(1未核算 ***/
    @TableField(value = "calculate_state")
    private Integer calculateState;


}


