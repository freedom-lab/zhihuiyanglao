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

@TableName("tb_jiangyukeji_health_lung_breathing")
@Data
public class HealthLungBreathing implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 服务机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 服务机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人标识ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 测量时间 ***/
    @TableField(value = "gauge_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date gaugeTime;

    /***** 测量设备 ***/
    @TableField(value = "gauge_type")
    private String gaugeType;

    /***** 峰值流量 ***/
    @TableField(value = "peakFlow")
    private float peakFlow;

    /***** 用力吹第一秒流量 ***/
    @TableField(value = "forcedVolume1")
    private float forcedVolume1;

    /***** 用力呼气流量 ***/
    @TableField(value = "forcedVitalCapacity")
    private float forcedVitalCapacity;

    /***** 峰值流量与正常的百分比 ***/
    @TableField(value = "pEF")
    private float pEF;

    /***** 用力吹第一秒流量与正常的百分比 ***/
    @TableField(value = "fEV1")
    private float fEV1;

    /***** 用力吹第一秒流量与用力呼气流量的百分比 ***/
    @TableField(value = "fVC")
    private float fVC;

    /***** PEF结果（0：正常;1：警告; ***/
    @TableField(value = "pEFState")
    private Integer pEFState;

    /***** FEV1结果，（0：正常;1：轻度; ***/
    @TableField(value = "fEV1State")
    private Integer fEV1State;

    /***** FVC结果，（0：正常;1：轻度; ***/
    @TableField(value = "fVCState")
    private Integer fVCState;

    /***** 参考意见 ***/
    @TableField(value = "opinion")
    private String opinion;

    /***** 预警标记(0未扫描1已扫描(默认0)) ***/
    @TableField(value = "warn_flag")
    private String warnFlag;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 数据来源(字典值) ***/
    @TableField(value = "data_source")
    private String dataSource;


}


