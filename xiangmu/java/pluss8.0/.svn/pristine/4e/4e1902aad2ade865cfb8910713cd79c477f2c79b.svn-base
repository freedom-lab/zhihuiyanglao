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

@TableName("tb_jiangyukeji_ins_activity_info")
@Data
public class InsActivityInfo implements Serializable, Cloneable {

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

    /***** 活动编号 ***/
    @TableField(value = "activity_code")
    private String activityCode;

    /***** 活动类别id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 活动类别名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 活动名称 ***/
    @TableField(value = "activity_name")
    private String activityName;

    /***** 活动简图 ***/
    @TableField(value = "activity_pic")
    private String activityPic;

    /***** 活动内容 ***/
    @TableField(value = "activity_content")
    private String activityContent;

    /***** 活动状态（0未开始1已开始2已结束3已取消） ***/
    @TableField(value = "activity_state")
    private Integer activityState;

    /***** 活动负责人 ***/
    @TableField(value = "manager")
    private String manager;

    /***** 负责人电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 参加人数 ***/
    @TableField(value = "elder_num")
    private Integer elderNum;

    /***** 活动日期 ***/
    @TableField(value = "activity_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date activityDate;

    /***** 活动开始时间(hh:mm) ***/
    @TableField(value = "start_activity_time")
    private String startActivityTime;

    /***** 活动结束时间(hh:mm) ***/
    @TableField(value = "end_activity_time")
    private String endActivityTime;

    /***** 签到方式(1仅签到 ***/
    @TableField(value = "sign_type")
    private Integer signType;

    /***** 活动地点 ***/
    @TableField(value = "activity_address")
    private String activityAddress;

    /***** 活动室id ***/
    @TableField(value = "room_id")
    private Long roomId;

    /***** 针对人群 ***/
    @TableField(value = "point_people")
    private String pointPeople;

    /***** 活动目的 ***/
    @TableField(value = "point")
    private String point;

    /***** 奖励积分 ***/
    @TableField(value = "bonus_integral")
    private Integer bonusIntegral;

    /***** 活动简介 ***/
    @TableField(value = "resolve_name")
    private String resolveName;

    /***** 审核状态(1未审核 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人id ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审核人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 取消原因 ***/
    @TableField(value = "cancel_reason")
    private String cancelReason;

    /***** 活动风采图 ***/
    @TableField(value = "activity_pics")
    private String activityPics;

    /***** 活动总结 ***/
    @TableField(value = "activity_summary")
    private String activitySummary;

    /***** 报名人数 ***/
    @TableField(value = "entry_num")
    private Integer entryNum;

    /***** 签到人数 ***/
    @TableField(value = "sign_num")
    private Integer signNum;

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

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 状态(0禁用1启用) ***/
    @TableField(value = "status")
    private Integer status;


}


