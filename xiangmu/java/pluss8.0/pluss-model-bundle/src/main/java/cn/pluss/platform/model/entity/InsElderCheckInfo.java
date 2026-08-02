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

@TableName("tb_jiangyukeji_ins_elder_check_info")
@Data
public class InsElderCheckInfo implements Serializable, Cloneable {

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

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 申请日期 ***/
    @TableField(value = "apply_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date applyDate;

    /***** 入住步骤(1申请中/上传体检报告 ***/
    @TableField(value = "check_step")
    private Integer checkStep;

    /***** 计划入住日期 ***/
    @TableField(value = "plan_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date planDate;

    /***** 实际入住日期/试住开始日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 试住结束日期 ***/
    @TableField(value = "trying_end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date tryingEndDate;

    /***** 入住状态(1未住 ***/
    @TableField(value = "check_state")
    private Integer checkState;

    /***** 入住档案号 ***/
    @TableField(value = "check_code")
    private String checkCode;

    /***** 楼栋id ***/
    @TableField(value = "building_id")
    private Long buildingId;

    /***** 楼栋名称 ***/
    @TableField(value = "building_name")
    private String buildingName;

    /***** 楼层id ***/
    @TableField(value = "floor_id")
    private Long floorId;

    /***** 楼层名称 ***/
    @TableField(value = "floor_name")
    private String floorName;

    /***** 房间id ***/
    @TableField(value = "room_id")
    private Long roomId;

    /***** 房间名称 ***/
    @TableField(value = "room_name")
    private String roomName;

    /***** 床位id ***/
    @TableField(value = "bed_id")
    private Long bedId;

    /***** 床位名称 ***/
    @TableField(value = "bed_name")
    private String bedName;

    /***** 床位码 ***/
    @TableField(value = "bed_code")
    private String bedCode;

    /***** 床位信息 ***/
    @TableField(value = "bed_info")
    private String bedInfo;

    /***** 是否包房(1否 ***/
    @TableField(value = "is_room")
    private Integer isRoom;

    /***** 护理等级id ***/
    @TableField(value = "nursing_level_id")
    private Long nursingLevelId;

    /***** 护理等级名称 ***/
    @TableField(value = "nursing_level_name")
    private String nursingLevelName;

    /***** 护理组id ***/
    @TableField(value = "nursing_group_id")
    private Long nursingGroupId;

    /***** 护理组名称 ***/
    @TableField(value = "nursing_group_name")
    private String nursingGroupName;

    /***** 护理人员id ***/
    @TableField(value = "nursing_staff_id")
    private Long nursingStaffId;

    /***** 护理人员名称 ***/
    @TableField(value = "nursing_staff_name")
    private String nursingStaffName;

    /***** 入住类型(1入住养老院 ***/
    @TableField(value = "check_type")
    private Integer checkType;

    /***** 是否是户主(1是 ***/
    @TableField(value = "is_household")
    private Integer isHousehold;

    /***** 户主id ***/
    @TableField(value = "household_id")
    private Long householdId;

    /***** 是否需要翻身(1否2是) ***/
    @TableField(value = "turn_over_state")
    private Integer turnOverState;

    /***** 身份类别(1社会老人2农村特困3城市特困4农村低保5城市低保) ***/
    @TableField(value = "elder_category")
    private Integer elderCategory;

    /***** 身份类别更新时间 ***/
    @TableField(value = "elder_category_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date elderCategoryTime;

    /***** 退住时间 ***/
    @TableField(value = "retreat_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date retreatTime;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 总的审核状态: ***/
    @TableField(value = "total_audit_state")
    private Integer totalAuditState;

    /***** 媒介渠道(数据字典 ***/
    @TableField(value = "media_channels")
    private String mediaChannels;

    /***** 打卡方式(0未设置 ***/
    @TableField(value = "sign_way")
    private Integer signWay;

    /***** 是否视频打卡替代人脸打卡(0否 ***/
    @TableField(value = "sign_is_video")
    private Integer signIsVideo;

    /***** 亲属id ***/
    @TableField(value = "relatives_id")
    private Integer relativesId;

    /***** 亲属名称 ***/
    @TableField(value = "relatives_name")
    private String relativesName;

    /***** 登录密码 ***/
    @TableField(value = "pass_word")
    private String passWord;

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

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;

    /*****  ***/
    @TableField(value = "video_id")
    private Integer videoId;

    /***** 会员权益id ***/
    @TableField(value = "benefits_id")
    private Long benefitsId;

    /***** 会员权益名称 ***/
    @TableField(value = "benefits_name")
    private String benefitsName;

    /***** 入院方式(数据字典 ***/
    @TableField(value = "admission_method")
    private String admissionMethod;

    /***** 户主是否在住(1是 ***/
    @TableField(value = "household_check_state")
    private Integer householdCheckState;

    /***** 住户和户主关系(ins_household_relationship) ***/
    @TableField(value = "household_relationship")
    private String householdRelationship;

    @TableField(exist = false)
    private String auditMemo;

    @TableField(exist = false)
    private Integer auditState;

    @TableField(value = "blood_type")
    private String bloodType;



}


