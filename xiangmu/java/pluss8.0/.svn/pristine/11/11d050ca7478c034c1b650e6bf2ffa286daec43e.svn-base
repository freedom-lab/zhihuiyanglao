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

@TableName("tb_jiangyukeji_health_lung_function")
@Data
public class HealthLungFunction implements Serializable, Cloneable {

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

    /***** FVC数据 ***/
    @TableField(value = "fVC_Data")
    private String fVCData;

    /***** VC数据 ***/
    @TableField(value = "vC_Data")
    private Integer vCData;

    /***** MVV数据 ***/
    @TableField(value = "mVV_Data")
    private Integer mVVData;

    /***** 诊断结果 ***/
    @TableField(value = "result")
    private Integer result;

    /***** FVC（实测值） ***/
    @TableField(value = "fVC_Real")
    private Integer fVCReal;

    /***** FVC（预计值） ***/
    @TableField(value = "fVC_Plan")
    private Integer fVCPlan;

    /***** FVC（百分比） ***/
    @TableField(value = "fVC_Percent")
    private Integer fVCPercent;

    /***** FVC-1（实测值） ***/
    @TableField(value = "fVC1_Real")
    private Integer fVC1Real;

    /***** FVC-1（预计值） ***/
    @TableField(value = "fVC1_Plan")
    private Integer fVC1Plan;

    /***** FVC-1（百分比） ***/
    @TableField(value = "fVC1_Percent")
    private Integer fVC1Percent;

    /***** FVC-2（实测值） ***/
    @TableField(value = "fVC2_Real")
    private String fVC2Real;

    /***** FVC-3(实测值) ***/
    @TableField(value = "fVC3_Real")
    private Double fVC3Real;

    /***** FEV-1%(实测值) ***/
    @TableField(value = "fEV1_Real")
    private Double fEV1Real;

    /***** FEV-1%(预计值) ***/
    @TableField(value = "fEV1_Plan")
    private Double fEV1Plan;

    /***** FEV-1%(百分比) ***/
    @TableField(value = "fEV1_Percent")
    private Double fEV1Percent;

    /***** FEV-2%(实测值) ***/
    @TableField(value = "fEV2_Real")
    private Double fEV2Real;

    /***** FEV-3%(实测值) ***/
    @TableField(value = "fEV3_Real")
    private Double fEV3Real;

    /***** MMF(实测值) ***/
    @TableField(value = "mMF_Real")
    private Double mMFReal;

    /***** MMF(预计值) ***/
    @TableField(value = "mMF_Plan")
    private Double mMFPlan;

    /***** MMF(百分比) ***/
    @TableField(value = "mMF_Percent")
    private Double mMFPercent;

    /***** MVV1(实测值) ***/
    @TableField(value = "mVV1_Real")
    private Double mVV1Real;

    /***** MVV1(预计值) ***/
    @TableField(value = "mVV1_Plan")
    private Double mVV1Plan;

    /***** MVV1(百分比) ***/
    @TableField(value = "mVV1_Percent")
    private Double mVV1Percent;

    /***** BSA1(实测值) ***/
    @TableField(value = "bSA1_Real")
    private Double bSA1Real;

    /***** MVV1/BSA(实测值) ***/
    @TableField(value = "mVV1_BSA_Real")
    private Double mVV1BSAReal;

    /***** MVV1/BSA(预计值) ***/
    @TableField(value = "mVV1_BSA_Plan")
    private Double mVV1BSAPlan;

    /***** MVV1/BSA(百分比) ***/
    @TableField(value = "mVV1_BSA_Percent")
    private Double mVV1BSAPercent;

    /***** PEF(实测值) ***/
    @TableField(value = "pEF_Real")
    private Double pEFReal;

    /***** PEF(预计值) ***/
    @TableField(value = "pEF_Plan")
    private Double pEFPlan;

    /***** PEF(百分比) ***/
    @TableField(value = "pEF_Percent")
    private Double pEFPercent;

    /***** V75(实测值) ***/
    @TableField(value = "v75_Real")
    private Double v75Real;

    /***** V75(预计值) ***/
    @TableField(value = "v75_Plan")
    private Double v75Plan;

    /***** V75(百分比) ***/
    @TableField(value = "v75_Percent")
    private Double v75Percent;

    /***** V50(实测值) ***/
    @TableField(value = "v50_Real")
    private Double v50Real;

    /***** V50(预计值) ***/
    @TableField(value = "v50_Plan")
    private Double v50Plan;

    /***** V50(百分比) ***/
    @TableField(value = "v50_Percent")
    private Double v50Percent;

    /***** V25(实测值) ***/
    @TableField(value = "v25_Real")
    private Double v25Real;

    /***** V25(预计值) ***/
    @TableField(value = "v25_Plan")
    private Double v25Plan;

    /***** V25(百分比) ***/
    @TableField(value = "v25_Percent")
    private Double v25Percent;

    /***** V50/V25(实测值) ***/
    @TableField(value = "v50_V25_Real")
    private Double v50V25Real;

    /***** V50/V25(预计值) ***/
    @TableField(value = "v50_V25_Plan")
    private Double v50V25Plan;

    /***** V50/V25(百分比) ***/
    @TableField(value = "v50_V25_Percent")
    private Double v50V25Percent;

    /***** V25/H(实测值) ***/
    @TableField(value = "v25_H_Real")
    private Double v25HReal;

    /***** V25/H(预计值) ***/
    @TableField(value = "v25_H_Plan")
    private Double v25HPlan;

    /***** V25/H(百分比) ***/
    @TableField(value = "v25_H_Percent")
    private Double v25HPercent;

    /***** VC(实测值) ***/
    @TableField(value = "vC_Real")
    private Double vCReal;

    /***** VC(预计值) ***/
    @TableField(value = "vC_Plan")
    private Double vCPlan;

    /***** VC(百分比) ***/
    @TableField(value = "vC_Percent")
    private Double vCPercent;

    /***** TV(实测值) ***/
    @TableField(value = "tV_Real")
    private Double tVReal;

    /***** IRV(实测值) ***/
    @TableField(value = "iRV_Real")
    private Double iRVReal;

    /***** ERV(实测值) ***/
    @TableField(value = "eRV_Real")
    private Double eRVReal;

    /***** IC(实测值) ***/
    @TableField(value = "iC_Real")
    private Double iCReal;

    /***** MV(实测值) ***/
    @TableField(value = "mV_Real")
    private Double mVReal;

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


