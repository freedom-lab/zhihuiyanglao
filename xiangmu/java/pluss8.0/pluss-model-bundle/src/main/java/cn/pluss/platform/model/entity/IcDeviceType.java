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

@TableName("tb_jiangyukeji_ic_device_type")
@Data
public class IcDeviceType implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 传输方式(4g，wifi,nb) ***/
    @TableField(value = "trans_mode")
    private Integer transMode;

    /***** 设备类型（1智能安防、2健康监测、3腕表定位、4视频监控、5人脸识别、6紧急呼叫、7跌倒监测） ***/
    @TableField(value = "device_type")
    private Integer deviceType;

    /***** 对接方式(1http ***/
    @TableField(value = "interface_method")
    private Integer interfaceMethod;

    /***** 接口地址 ***/
    @TableField(value = "interface_url")
    private String interfaceUrl;

    /***** 设备编码（3位编号:如101） ***/
    @TableField(value = "type_code")
    private String typeCode;

    /***** 设备类型名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 设备厂家 ***/
    @TableField(value = "manufacturer")
    private String manufacturer;

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

    /***** 0不是主机1是主机 ***/
    @TableField(value = "host_state")
    private Integer hostState;

    /***** 设备图标 ***/
    @TableField(value = "device_img")
    private String deviceImg;


}


