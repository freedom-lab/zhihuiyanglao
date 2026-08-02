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

@TableName("tb_jiangyukeji_ins_activity_room_reserve")
@Data
public class InsActivityRoomReserve implements Serializable, Cloneable {

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

    /***** 活动室id ***/
    @TableField(value = "room_id")
    private Long roomId;

    /***** 活动室名称 ***/
    @TableField(value = "room_name")
    private String roomName;

    /***** 预约人姓名 ***/
    @TableField(value = "personnel_name")
    private String personnelName;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 预约日期 ***/
    @TableField(value = "reserve_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reserveDate;

    /***** 使用开始时间(hh:mm) ***/
    @TableField(value = "reserve_start_time")
    private String reserveStartTime;

    /***** 使用结束时间(hh:mm) ***/
    @TableField(value = "reserve_end_time")
    private String reserveEndTime;

    /***** 预约方式（1电话预约，2现场预约，3app预约） ***/
    @TableField(value = "reserve_type")
    private String reserveType;

    /***** 参加人数 ***/
    @TableField(value = "person_num")
    private Integer personNum;

    /***** 用途 ***/
    @TableField(value = "purpose")
    private String purpose;

    /***** 使用状态(0未使用，1使用中 ***/
    @TableField(value = "use_state")
    private String useState;

    /***** 备注 ***/
    @TableField(value = "remarks")
    private String remarks;

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


