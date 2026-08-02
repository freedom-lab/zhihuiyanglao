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

@TableName("tb_jiangyukeji_smart_alarm_record")
@Data
public class SmartAlarmRecord implements Serializable, Cloneable {

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

    /***** 发放设备ID ***/
    @TableField(value = "grant_id")
    private Long grantId;

    /***** 设备大类 ***/
    @TableField(value = "big_device_type")
    private String bigDeviceType;

    /***** 设备小类ID ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 设备名称 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 设备SID ***/
    @TableField(value = "device_serial")
    private String deviceSerial;

    /***** 应用场景(1居家看护、2家庭床位、3探访关爱、4日间照料、5无感社区、6老年食堂、10养老机构) ***/
    @TableField(value = "scene_type")
    private String sceneType;

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private String elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 高德地图经度 ***/
    @TableField(value = "lon")
    private Double lon;

    /***** 高德地图纬度 ***/
    @TableField(value = "lat")
    private Double lat;

    /***** 地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 告警单号 ***/
    @TableField(value = "alarm_code")
    private String alarmCode;

    /***** 告警等级（1一级2二级3三级数据字典） ***/
    @TableField(value = "alarm_level")
    private String alarmLevel;

    /***** 告警类型(1燃气告警，2烟雾告警，3水浸告警，4紧急呼叫告警，5门磁告警，6红外告警，7低电量告警，8离线告警，9跌倒告警，10床垫告警,11围栏告警) ***/
    @TableField(value = "alarm_type")
    private String alarmType;

    /***** 床垫告警类型(1心率异常，2呼吸异常，3离床告警，4体动过多 ***/
    @TableField(value = "sleep_alarm_type")
    private String sleepAlarmType;

    /***** 告警时间 ***/
    @TableField(value = "alarm_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date alarmTime;

    /***** 告警内容 ***/
    @TableField(value = "alarm_content")
    private String alarmContent;

    /***** 用户读取状态（0未看1已看） ***/
    @TableField(value = "read_state")
    private Integer readState;

    /***** 处理方式（1回访处理，2取消误报，3派单处理) ***/
    @TableField(value = "handle_type")
    private Integer handleType;

    /***** 处理状态(0未处理 ***/
    @TableField(value = "handle_state")
    private String handleState;

    /***** 处理结果 ***/
    @TableField(value = "handle_result")
    private String handleResult;

    /***** 处理照片 ***/
    @TableField(value = "handle_img")
    private String handleImg;

    /***** 处理人ID/服务人员id ***/
    @TableField(value = "handle_id")
    private Long handleId;

    /***** 处理人 ***/
    @TableField(value = "handle_user")
    private String handleUser;

    /***** 处理时间 ***/
    @TableField(value = "handle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /***** 所属机构类型(0居家1机构) ***/
    @TableField(value = "belong_institution_type")
    private Integer belongInstitutionType;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 电话录音地址 ***/
    @TableField(value = "audio_url")
    private String audioUrl;

    /***** 呼叫电话号码 ***/
    @TableField(value = "call_phones")
    private String callPhones;

    /***** 呼叫任务ID ***/
    @TableField(value = "call_task_ids")
    private String callTaskIds;

    /***** 呼叫次数 ***/
    @TableField(value = "call_count")
    private Integer callCount;


}


