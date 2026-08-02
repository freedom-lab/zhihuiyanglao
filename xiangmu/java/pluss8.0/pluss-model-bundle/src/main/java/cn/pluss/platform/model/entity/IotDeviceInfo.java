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

@TableName("tb_jiangyukeji_iot_device_info")
@Data
public class IotDeviceInfo implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 租户名称 ***/
    @TableField(value = "tenant_name")
    private String tenantName;

    /***** 主设备ID ***/
    @TableField(value = "pid")
    private String pid;

    /***** 设备大类（1智能安防、2健康监测、3腕表定位、4视频监控、5人脸识别、6智慧收银、7智能终端、8睡眠监测） ***/
    @TableField(value = "big_device_type")
    private String bigDeviceType;

    /***** 设备小类ID ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 设备名称 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 发放设备ID ***/
    @TableField(value = "grant_id")
    private Long grantId;

    /***** 设备版本号 ***/
    @TableField(value = "device_version")
    private String deviceVersion;

    /***** 设备SID ***/
    @TableField(value = "device_serial")
    private String deviceSerial;

    /***** 发放状态(0未发放，1已发放) ***/
    @TableField(value = "issue_state")
    private Integer issueState;

    /***** 电量百分比 ***/
    @TableField(value = "battery")
    private Integer battery;

    /***** 设备状态（0离线、1在线） ***/
    @TableField(value = "device_state")
    private Integer deviceState;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

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

    /***** 业务状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 房间ID ***/
    @TableField(value = "room_id")
    private String roomId;


}


