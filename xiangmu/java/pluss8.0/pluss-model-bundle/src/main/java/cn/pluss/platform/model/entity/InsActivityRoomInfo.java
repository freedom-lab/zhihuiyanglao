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

@TableName("tb_jiangyukeji_ins_activity_room_info")
@Data
public class InsActivityRoomInfo implements Serializable, Cloneable {

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

    /***** 活动室名称 ***/
    @TableField(value = "room_name")
    private String roomName;

    /***** 房间号 ***/
    @TableField(value = "room_code")
    private String roomCode;

    /***** 活动室简图 ***/
    @TableField(value = "room_pic")
    private String roomPic;

    /***** 活动室展示图片 ***/
    @TableField(value = "show_pics")
    private String showPics;

    /***** 活动室设施和设备 ***/
    @TableField(value = "room_facilities")
    private String roomFacilities;

    /***** 活动室简介 ***/
    @TableField(value = "room_introduce")
    private String roomIntroduce;

    /***** 负责人 ***/
    @TableField(value = "manager")
    private String manager;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 场所面积 ***/
    @TableField(value = "place_area")
    private Double placeArea;

    /***** 开放时间 ***/
    @TableField(value = "open_time")
    private String openTime;

    /***** 关闭时间 ***/
    @TableField(value = "close_time")
    private String closeTime;

    /***** 容纳人数 ***/
    @TableField(value = "capacity")
    private Integer capacity;

    /***** 使用状态(0未使用，1使用中) ***/
    @TableField(value = "use_state")
    private Integer useState;

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


