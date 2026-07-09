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

@TableName("tb_jiangyukeji_ins_register_consult_info")
@Data
public class InsRegisterConsultInfo implements Serializable, Cloneable {

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

    /***** 咨询类型(1咨询 ***/
    @TableField(value = "consult_type")
    private Integer consultType;

    /***** 咨询日期 ***/
    @TableField(value = "consult_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date consultTime;

    /***** 咨询人姓名 ***/
    @TableField(value = "consult_name")
    private String consultName;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 与老人关系(数据字典 ***/
    @TableField(value = "condition_type")
    private String conditionType;

    /***** 咨询方式(数据字典 ***/
    @TableField(value = "consult_mode")
    private String consultMode;

    /***** 咨询意向(数据字典 ***/
    @TableField(value = "consult_intention")
    private String consultIntention;

    /***** 咨询次数 ***/
    @TableField(value = "consult_num")
    private Long consultNum;

    /***** 媒介渠道(数据字典 ***/
    @TableField(value = "media_channels")
    private String mediaChannels;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 老人身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1男 ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 家庭住址 ***/
    @TableField(value = "home_address")
    private String homeAddress;

    /***** 能力等级(数据字典 ***/
    @TableField(value = "ability_level")
    private String abilityLevel;

    /***** 入住方式(数据字典 ***/
    @TableField(value = "check_method")
    private String checkMethod;

    /***** 理想价格(数据字典 ***/
    @TableField(value = "ideal_price")
    private String idealPrice;

    /***** 可承担费用 ***/
    @TableField(value = "assume_cost")
    private Double assumeCost;

    /***** 关注点(数据字典 ***/
    @TableField(value = "concerns")
    private String concerns;

    /***** 客户满意部分 ***/
    @TableField(value = "satisfied")
    private String satisfied;

    /***** 客户不满意部分 ***/
    @TableField(value = "dissatisfied")
    private String dissatisfied;

    /***** 来访人数 ***/
    @TableField(value = "visitors_number")
    private Integer visitorsNumber;

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

    /***** 床位信息 ***/
    @TableField(value = "bed_info")
    private String bedInfo;

    /***** 是否包房(1否 ***/
    @TableField(value = "is_room")
    private Integer isRoom;

    /***** 预留开始时间 ***/
    @TableField(value = "reserve_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reserveStartTime;

    /***** 预留结束时间 ***/
    @TableField(value = "reserve_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reserveEndTime;

    /***** 订金 ***/
    @TableField(value = "appointment_fee")
    private Double appointmentFee;

    /***** 推荐人姓名 ***/
    @TableField(value = "referee_name")
    private String refereeName;

    /***** 营销人id ***/
    @TableField(value = "reception_id")
    private Long receptionId;

    /***** 营销人姓名 ***/
    @TableField(value = "reception_person")
    private String receptionPerson;

    /***** 咨询状态(1咨询 ***/
    @TableField(value = "consult_state")
    private Integer consultState;

    /***** 数据来源(数据字典 ***/
    @TableField(value = "data_source")
    private String dataSource;

    /***** 子女账号id ***/
    @TableField(value = "children_id")
    private Long childrenId;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 预约状态(数据字典 ***/
    @TableField(value = "appointment_state")
    private String appointmentState;

    /***** 出生日期 ***/
    @TableField(value = "birthday")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /***** 社保卡号 ***/
    @TableField(value = "social_card_no")
    private String socialCardNo;

    /***** 婚姻情况 ***/
    @TableField(value = "marry_state")
    private String marryState;

    /***** 文化程度 ***/
    @TableField(value = "degree_education")
    private String degreeEducation;

    /***** 经济来源(CJ015 ***/
    @TableField(value = "economic_sources")
    private String economicSources;

    /***** 兴趣组(兴趣爱好) ***/
    @TableField(value = "hobby")
    private String hobby;

    /***** 兴趣组名称(兴趣爱好) ***/
    @TableField(value = "hobby_name")
    private String hobbyName;

    /***** 基础病情况 ***/
    @TableField(value = "major_diseases")
    private String majorDiseases;

    /***** 基础病名称 ***/
    @TableField(value = "major_diseases_name")
    private String majorDiseasesName;

    /***** 其他基础病名称 ***/
    @TableField(value = "major_diseases_other")
    private String majorDiseasesOther;

    /***** 预约失败原因 ***/
    @TableField(value = "failure_reason")
    private String failureReason;

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


}


