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

@TableName("tb_jiangyukeji_gsp_institution_device_transfer")
@Data
public class GspInstitutionDeviceTransfer implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 数据唯一ID ***/
    @TableField(value = "data_id")
    private String dataId;

    /***** 机构唯一ID ***/
    @TableField(value = "institution_id")
    private String institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 资产编号 ***/
    @TableField(value = "device_code")
    private String deviceCode;

    /***** 设备名称 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 规格 ***/
    @TableField(value = "model")
    private String model;

    /***** 数量 ***/
    @TableField(value = "num")
    private Integer num;

    /***** 价值 ***/
    @TableField(value = "price")
    private String price;

    /***** 购置日期 ***/
    @TableField(value = "buy_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date buyTime;

    /***** 厂家 ***/
    @TableField(value = "vender")
    private String vender;

    /***** 存放地点 ***/
    @TableField(value = "storage_location")
    private String storageLocation;

    /***** 设备类型(1国有2自投3捐赠) ***/
    @TableField(value = "device_type")
    private String deviceType;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 业务字段 ***/
    @TableField(value = "status")
    private Integer status;


}


