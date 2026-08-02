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

@TableName("tb_jiangyukeji_smart_device_param_fall")
@Data
public class SmartDeviceParamFall implements Serializable, Cloneable {

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

    /***** 设备类型(1苗米 ***/
    @TableField(value = "fall_type")
    private String fallType;

    /***** 安装高度 ***/
    @TableField(value = "install_height")
    private Integer installHeight;

    /***** 人体存在状态(0无人 ***/
    @TableField(value = "someone_exist")
    private String someoneExist;

    /***** 运动信息(0无 ***/
    @TableField(value = "motion_status")
    private String motionStatus;

    /***** 运动体征参数 ***/
    @TableField(value = "movement_sign")
    private String movementSign;

    /***** 设备参数 ***/
    @TableField(value = "param")
    private String param;

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

    /*****  ***/
    @TableField(value = "status")
    private Integer status;


}


