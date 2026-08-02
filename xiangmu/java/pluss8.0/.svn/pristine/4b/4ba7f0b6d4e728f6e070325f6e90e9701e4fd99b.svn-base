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

@TableName("tb_jiangyukeji_ys_elder_followup_record")
@Data
public class YsElderFollowupRecord implements Serializable, Cloneable {

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

    /***** 老人ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 家庭地址 ***/
    @TableField(value = "home_address")
    private String homeAddress;

    /***** 随访时间 ***/
    @TableField(value = "access_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date accessTime;

    /***** 医生ID ***/
    @TableField(value = "doctor_id")
    private Long doctorId;

    /***** 医生姓名 ***/
    @TableField(value = "doctor_name")
    private String doctorName;

    /***** 随访方式(1诊所2上门3电话)(数据字典) ***/
    @TableField(value = "access_type")
    private String accessType;

    /***** 脉搏率(次/分) ***/
    @TableField(value = "pulse_rate")
    private Double pulseRate;

    /***** 收缩压(高压) ***/
    @TableField(value = "systolic_pressure")
    private Integer systolicPressure;

    /***** 舒张压(低压) ***/
    @TableField(value = "diastolic_pressure")
    private Integer diastolicPressure;

    /***** 分析结果(0正常，1高压异常，2低压异常，3高压和低压异常) ***/
    @TableField(value = "pressure_result")
    private String pressureResult;

    /***** 测量条件(0餐后测量1餐前测量2随机测量) ***/
    @TableField(value = "conditions")
    private String conditions;

    /***** 血糖 ***/
    @TableField(value = "blood_glucose")
    private Double bloodGlucose;

    /***** 分析结果(0正常，1偏高，2偏低) ***/
    @TableField(value = "glucose_result")
    private String glucoseResult;

    /***** 健康说明 ***/
    @TableField(value = "health_context")
    private String healthContext;

    /***** 下次随访时间 ***/
    @TableField(value = "next_access_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date nextAccessTime;

    /***** 现场照片(多个逗号分隔) ***/
    @TableField(value = "attach_path")
    private String attachPath;

    /***** 医生随访建议 ***/
    @TableField(value = "access_recom")
    private String accessRecom;

    /***** 医生随访总结 ***/
    @TableField(value = "access_context")
    private String accessContext;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 数据来源（0系统1医生APP） ***/
    @TableField(value = "data_source")
    private Integer dataSource;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 创建人 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建人ID ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门ID ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人ID ***/
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


