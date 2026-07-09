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

@TableName("tb_jiangyukeji_health_tongue_diagnosis_report")
@Data
public class HealthTongueDiagnosisReport implements Serializable, Cloneable {

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

    /***** 设备代码，用于识别特定的健康检测设备 ***/
    @TableField(value = "device_code")
    private String deviceCode;

    /***** 设备名称，提供更详细的设备信息 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 登录用户的唯一标识码 ***/
    @TableField(value = "login_user_code")
    private String loginUserCode;

    /***** 登录用户的名字 ***/
    @TableField(value = "login_user_name")
    private String loginUserName;

    /***** 被检测者的姓名 ***/
    @TableField(value = "name")
    private String name;

    /***** 性别，假设1代表男性，其他值代表女性或其他性别定义 ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private int age;

    /***** 身高，单位为厘米 ***/
    @TableField(value = "height")
    private Double height;

    /***** 体重，单位为千克 ***/
    @TableField(value = "weight")
    private Double weight;

    /***** 记录时间 ***/
    @TableField(value = "time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    /***** PDF文件链接，存储健康报告的位置 ***/
    @TableField(value = "pdf")
    private String pdf;

    /***** 健康指数，一个综合评分 ***/
    @TableField(value = "health_index")
    private Double healthIndex;

    /***** 体质名称，描述个人体质特征 ***/
    @TableField(value = "constitution_names")
    private String constitutionNames;

    /***** 症状名称，当前存在的症状 ***/
    @TableField(value = "symptom_name")
    private String symptomName;

    /***** 舌色名称，中医术语中的舌头颜色 ***/
    @TableField(value = "color_of_tongue_names")
    private String colorOfTongueNames;

    /***** 苔色名称，中医术语中舌苔的颜色 ***/
    @TableField(value = "color_of_moss_names")
    private String colorOfMossNames;

    /***** 苔质名称，中医术语中舌苔的状态 ***/
    @TableField(value = "moss_names")
    private String mossNames;

    /***** 体液状态，描述体内液体状况 ***/
    @TableField(value = "bodyfluid_names")
    private String bodyfluidNames;

    /***** 舌形名称，描述舌头的形状 ***/
    @TableField(value = "shape_of_tongue_names")
    private String shapeOfTongueNames;

    /***** 静脉状态，描述舌下静脉的情况 ***/
    @TableField(value = "vein_names")
    private String veinNames;

    /***** 疾病风险列表，可能存在的健康问题 ***/
    @TableField(value = "disease_risks")
    private String diseaseRisks;

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

    /***** 饮食建议 ***/
    @TableField(value = "diet_suggestion")
    private String dietSuggestion;

    /***** 运动建议 ***/
    @TableField(value = "exercise_suggestion")
    private String exerciseSuggestion;


}


