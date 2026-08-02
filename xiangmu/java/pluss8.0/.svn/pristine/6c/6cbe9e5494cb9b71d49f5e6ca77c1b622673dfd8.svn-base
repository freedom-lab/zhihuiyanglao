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

@TableName("tb_jiangyukeji_smart_device_param_partner")
@Data
public class SmartDeviceParamPartner implements Serializable, Cloneable {

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

    /***** sos号码 ***/
    @TableField(value = "sos_number")
    private String sosNumber;

    /***** 亲情号码 ***/
    @TableField(value = "family_number")
    private String familyNumber;

    /***** 白名单号码1 ***/
    @TableField(value = "white_number_one")
    private String whiteNumberOne;

    /***** 白名单号码2 ***/
    @TableField(value = "white_number_two")
    private String whiteNumberTwo;

    /***** 白名单号码3 ***/
    @TableField(value = "white_number_three")
    private String whiteNumberThree;

    /***** 白名单号码4 ***/
    @TableField(value = "white_number_four")
    private String whiteNumberFour;

    /***** 白名单号码5 ***/
    @TableField(value = "white_number_five")
    private String whiteNumberFive;

    /***** 白名单号码6 ***/
    @TableField(value = "white_number_sex")
    private String whiteNumberSex;

    /***** 白名单号码7 ***/
    @TableField(value = "white_number_seven")
    private String whiteNumberSeven;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;


}


