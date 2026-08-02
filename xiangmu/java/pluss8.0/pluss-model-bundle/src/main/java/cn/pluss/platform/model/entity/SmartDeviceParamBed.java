package cn.pluss.platform.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("tb_jiangyukeji_smart_device_param_bed")
@Data
public class SmartDeviceParamBed implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** (租户id) ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 发放设备ID ***/
    @TableField(value = "grant_id")
    private Long grantId;

    /***** 设备名称 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 设备SID ***/
    @TableField(value = "device_serial")
    private String deviceSerial;

    /***** 心率异常预警开关,0:关闭 ***/
    @TableField(value = "hr_alarm_enable")
    private Integer hrAlarmEnable;

    /***** 心率上限预警值 ***/
    @TableField(value = "hr_alarm_max")
    private Integer hrAlarmMax;

    /***** 心率下限预警值 ***/
    @TableField(value = "hr_alarm_min")
    private Integer hrAlarmMin;

    /***** 呼吸异常预警开关,0:关闭 ***/
    @TableField(value = "rr_alarm_enable")
    private Integer rrAlarmEnable;

    /***** 呼吸暂停预警开关 ***/
    @TableField(value = "rr_stop_enable")
    private Integer rrStopEnable;

    /***** 呼吸上限预警值 ***/
    @TableField(value = "rr_alarm_max")
    private Integer rrAlarmMax;

    /***** 呼吸下限预警值 ***/
    @TableField(value = "rr_alarm_min")
    private Integer rrAlarmMin;

    /***** 脱离在床预警开关 ***/
    @TableField(value = "off_bed_enable")
    private Integer offBedEnable;

    /***** 脱离监测在床时间上限 ***/
    @TableField(value = "leave_dura")
    private Integer leaveDura;

    /***** 午睡起始时间段 ***/
    @TableField(value = "sleep_day_dura_start")
    private String sleepDayDuraStart;

    /***** 午睡结束时间段 ***/
    @TableField(value = "sleep_day_dura_stop")
    private String sleepDayDuraStop;

    /***** 全天 ***/
    @TableField(value = "sleep_all_day_enable")
    private Integer sleepAllDayEnable;

    /***** 晚间起始时间段 ***/
    @TableField(value = "sleep_night_dura_start")
    private String sleepNightDuraStart;

    /***** 晚间结束时间段 ***/
    @TableField(value = "sleep_night_dura_stop")
    private String sleepNightDuraStop;

    /***** 午间预警开关 ***/
    @TableField(value = "noon_sleep_day_enable")
    private Integer noonSleepDayEnable;

    /***** 晚间预警开关 ***/
    @TableField(value = "night_sleeps_day_enable")
    private Integer nightSleepsDayEnable;

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

    @TableField(value = "heart_rate")
    private Integer heartRate;

    @TableField(value = "breath_rate")
    private Integer breathRate;

    @TableField(value = "body_shake")
    private Integer bodyShake;

    @TableField(value = "on_bed")
    private Integer onBed;

}


