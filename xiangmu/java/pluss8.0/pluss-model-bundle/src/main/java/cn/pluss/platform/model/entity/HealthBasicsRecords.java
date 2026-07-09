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
import java.util.List;

@TableName("tb_jiangyukeji_health_basics_records")
@Data
public class HealthBasicsRecords implements Serializable, Cloneable {

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

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 性别（1：男，2：女） ***/
    @TableField(value = "sex")
    private String sex;

    /***** 测量时间 ***/
    @TableField(value = "gauge_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date gaugeTime;

    /***** 测量设备(数据字典(默认1)) ***/
    @TableField(value = "gauge_type")
    private String gaugeType;

    /***** 测量条件 ***/
    @TableField(value = "conditions")
    private String conditions;

    /***** 腰围 ***/
    @TableField(value = "waist")
    private Double waist;

    /***** 身高(厘米) ***/
    @TableField(value = "height")
    private Double height;

    /***** 体重(千克) ***/
    @TableField(value = "weight")
    private Double weight;

    /***** 脂肪含量 ***/
    @TableField(value = "fat_content")
    private Double fatContent;

    /***** 体质指数 ***/
    @TableField(value = "bmi")
    private Double bmi;

    /***** 基础代谢值 ***/
    @TableField(value = "bmr")
    private Double bmr;

    /***** 脂肪率 ***/
    @TableField(value = "pbf")
    private Double pbf;

    /***** 水分率 ***/
    @TableField(value = "water")
    private Double water;

    /***** 骨骼量 ***/
    @TableField(value = "bone")
    private Double bone;

    /***** 肌肉量 ***/
    @TableField(value = "muscle")
    private Double muscle;

    /***** 体质指数判断结果(1偏低，2标准，3偏高，4高) ***/
    @TableField(value = "bmi_result")
    private String bmiResult;

    /***** 体型类型(1消瘦，2标准，3隐性肥胖，4健壮，5肥胖) ***/
    @TableField(value = "bt")
    private String bt;

    /***** 分析结果(0过轻，1正常，2过重，3肥胖,4非常肥胖) ***/
    @TableField(value = "analysis_result")
    private String analysisResult;

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

    /***** 创建人 ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门 ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 修改人 ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 修改时间 ***/
    @TableField(value = "update_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /***** 状态 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 数据来源(字典值) ***/
    @TableField(value = "data_source")
    private String dataSource;

    /***** 异常字段名集合 *****/
    @TableField(exist = false)
    private List<String> abnormalFields;

}


