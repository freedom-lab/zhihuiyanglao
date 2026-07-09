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

@TableName("tb_jiangyukeji_smart_device_param_bracelet")
@Data
public class SmartDeviceParamBracelet implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 机构编码(租户id) ***/
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

    /***** sos号码1 ***/
    @TableField(value = "sos_number_one")
    private String sosNumberOne;

    /***** sos号码2 ***/
    @TableField(value = "sos_number_two")
    private String sosNumberTwo;

    /***** sos号码3 ***/
    @TableField(value = "sos_number_three")
    private String sosNumberThree;

    /***** 亲情姓名1 ***/
    @TableField(value = "family_name_one")
    private String familyNameOne;

    /***** 亲情姓名2 ***/
    @TableField(value = "family_name_two")
    private String familyNameTwo;

    /***** 亲情姓名3 ***/
    @TableField(value = "family_name_three")
    private String familyNameThree;

    /***** 亲情姓名4 ***/
    @TableField(value = "family_name_four")
    private String familyNameFour;

    /***** 亲情号码1 ***/
    @TableField(value = "family_number_one")
    private String familyNumberOne;

    /***** 亲情号码2 ***/
    @TableField(value = "family_number_two")
    private String familyNumberTwo;

    /***** 亲情号码3 ***/
    @TableField(value = "family_number_three")
    private String familyNumberThree;

    /***** 亲情号码4 ***/
    @TableField(value = "family_number_four")
    private String familyNumberFour;

    /***** 定位上传间隔(分钟) ***/
    @TableField(value = "location_interval")
    private Integer locationInterval;

    /***** 心率上传间隔(分钟) ***/
    @TableField(value = "heart_interval")
    private Integer heartInterval;

    /***** 步数上传间隔(分钟) ***/
    @TableField(value = "step_interval")
    private Integer stepInterval;

    /***** 是否需要更新(1需要，0不需要) ***/
    @TableField(value = "need_update")
    private Integer needUpdate;

    /***** 低电量提醒（1关，2开） ***/
    @TableField(value = "battery_alert")
    private Integer batteryAlert;

    /***** sos提醒（1关，2开） ***/
    @TableField(value = "sos_alert")
    private Integer sosAlert;

    /***** 提醒手机号码 ***/
    @TableField(value = "center_tel")
    private String centerTel;

    /***** 远程关机（默认1：不执行，2执行远程关机） ***/
    @TableField(value = "remote_shutdowm")
    private Integer remoteShutdowm;

    /***** 设置更新状态(1更新失败2更新成功) ***/
    @TableField(value = "update_state")
    private Integer updateState;

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


}


