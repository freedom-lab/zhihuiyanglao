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

@TableName("tb_jiangyukeji_ins_nursing_room_execution_record")
@Data
public class InsNursingRoomExecutionRecord implements Serializable, Cloneable {

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

    /***** 巡房计划主键id ***/
    @TableField(value = "plan_id")
    private Long planId;

    /***** 巡房计划名称 ***/
    @TableField(value = "plan_name")
    private String planName;

    /***** 巡房日期 ***/
    @TableField(value = "patrol_room_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date patrolRoomDate;

    /***** 巡房时段(hh:mm) ***/
    @TableField(value = "time_slot")
    private String timeSlot;

    /***** 巡房内容 ***/
    @TableField(value = "patrol_content")
    private String patrolContent;

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

    /***** 房间信息 ***/
    @TableField(value = "room_info")
    private String roomInfo;

    /***** 巡房状态(1未完成 ***/
    @TableField(value = "patrol_state")
    private Integer patrolState;

    /***** 巡房人id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 巡房人姓名 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 护理组id ***/
    @TableField(value = "nursing_group_id")
    private Long nursingGroupId;

    /***** 护理组名称 ***/
    @TableField(value = "nursing_group_name")
    private String nursingGroupName;

    /***** 完成时间 ***/
    @TableField(value = "complete_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date completeTime;

    /***** 巡房说明 ***/
    @TableField(value = "patrol_illustrate")
    private String patrolIllustrate;

    /***** 巡房图片(多个逗号分隔) ***/
    @TableField(value = "img_path")
    private String imgPath;

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

    /***** 巡房类型(1app巡房 ***/
    @TableField(value = "patrol_type")
    private Integer patrolType;


}


