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

@TableName("tb_jiangyukeji_health_bone_density")
@Data
public class HealthBoneDensity implements Serializable, Cloneable {

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

    /***** 骨密度测量部位(四个部位分别为：左侧桡骨远端1/3处， ***/
    @TableField(value = "position")
    private String position;

    /***** SOS ***/
    @TableField(value = "sos")
    private float sos;

    /***** T值 ***/
    @TableField(value = "tValue")
    private float tValue;

    /***** Z值 ***/
    @TableField(value = "zValue")
    private float zValue;

    /***** 骨龄指数 ***/
    @TableField(value = "bQI")
    private float bQI;

    /***** 骨折风险系数 ***/
    @TableField(value = "risk")
    private float risk;

    /***** 骨龄 ***/
    @TableField(value = "pAB")
    private float pAB;

    /***** 预计发生骨质疏松年龄 ***/
    @TableField(value = "eOA")
    private float eOA;

    /***** 成人比 ***/
    @TableField(value = "adtPct")
    private float adtPct;

    /***** 同龄比 ***/
    @TableField(value = "agePct")
    private float agePct;

    /***** 骨密度判断结果 ***/
    @TableField(value = "boneResult")
    private String boneResult;

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


