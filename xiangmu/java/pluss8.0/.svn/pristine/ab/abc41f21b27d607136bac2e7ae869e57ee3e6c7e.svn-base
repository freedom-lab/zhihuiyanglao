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

@TableName("tb_jiangyukeji_smart_device_grant")
@Data
public class SmartDeviceGrant implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 机构编号 ***/
    @TableField(value = "institution_code")
    private String institutionCode;

    /***** 设备大类 ***/
    @TableField(value = "big_device_type")
    private String bigDeviceType;

    /***** 父级设备ID ***/
    @TableField(value = "pid")
    private String pid;

    /***** 设备小类ID(iot_device_type) ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 设备名称 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 设备SID ***/
    @TableField(value = "device_serial")
    private String deviceSerial;

    /***** 在线状态(0离线1在线) ***/
    @TableField(value = "is_online")
    private String isOnline;

    /***** 设备电量百分比 ***/
    @TableField(value = "battery")
    private Integer battery;

    /***** 同步状态0未同步1已同步 ***/
    @TableField(value = "syn_status")
    private String synStatus;

    /***** 发放类型(1老人2机构/公区3房间4床位) ***/
    @TableField(value = "grant_type")
    private String grantType;

    /***** 应用场景(1居家看护、2家庭床位、3探访关爱、4日间照料、5无感社区、6老年食堂、10养老机构) ***/
    @TableField(value = "scene_type")
    private String sceneType;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 房间ID ***/
    @TableField(value = "room_id")
    private Long roomId;

    /***** 房间名称 ***/
    @TableField(value = "room_name")
    private String roomName;

    /***** 床位ID ***/
    @TableField(value = "bed_id")
    private Long bedId;

    /***** 床位名称 ***/
    @TableField(value = "bed_name")
    private String bedName;

    /***** 发放位置 ***/
    @TableField(value = "grant_location")
    private String grantLocation;

    /***** 设备照片 ***/
    @TableField(value = "img")
    private String img;

    /***** 设备参数 ***/
    @TableField(value = "param")
    private String param;

    /***** 设备版本号 ***/
    @TableField(value = "device_version")
    private String deviceVersion;

    /***** 所属机构类型(0居家1机构) ***/
    @TableField(value = "belong_institution_type")
    private Integer belongInstitutionType;

    /***** 区域编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 区域名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人 ***/
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

    /***** 业务状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 数据同步状态 ***/
    @TableField(value = "gsp_state")
    private Integer gspState;


}


