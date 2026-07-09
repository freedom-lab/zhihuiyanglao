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

@TableName("tb_jiangyukeji_health_physical_check")
@Data
public class HealthPhysicalCheck implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

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

    /***** 出生日期 ***/
    @TableField(value = "birthday")
    private String birthday;

    /***** 近期症状 ***/
    @TableField(value = "recent_symptom")
    private String recentSymptom;

    /***** 睡眠时间(小时) ***/
    @TableField(value = "sleep_time")
    private String sleepTime;

    /***** 体温 ***/
    @TableField(value = "temperature")
    private String temperature;

    /***** 脉率 ***/
    @TableField(value = "pulse")
    private Integer pulse;

    /***** 呼吸频率 ***/
    @TableField(value = "breathe")
    private Integer breathe;

    /***** 高压 ***/
    @TableField(value = "high_pressure")
    private Integer highPressure;

    /***** 低压 ***/
    @TableField(value = "low_pressure")
    private Integer lowPressure;

    /***** 身高(厘米) ***/
    @TableField(value = "height")
    private Integer height;

    /***** 体重(千克) ***/
    @TableField(value = "weight")
    private Integer weight;

    /***** 腰围(厘米) ***/
    @TableField(value = "waistline")
    private Integer waistline;

    /***** 自我评估(0满意1基本满意2说不清楚3不太满意4不满意) ***/
    @TableField(value = "self_assessment")
    private String selfAssessment;

    /***** 自我描述 ***/
    @TableField(value = "self_desp")
    private String selfDesp;

    /***** 皮肤情况(0正常1潮红2苍白3发绀4黄染5色素沉着6赘生物、其他) ***/
    @TableField(value = "skin_status")
    private String skinStatus;

    /***** 皮肤描述 ***/
    @TableField(value = "skin_desp")
    private String skinDesp;

    /***** 淋巴结状况(0未触及1已触及) ***/
    @TableField(value = "lymph_status")
    private String lymphStatus;

    /***** 淋巴结描述 ***/
    @TableField(value = "lymph_desp")
    private String lymphDesp;

    /***** 口唇(0红润1苍白2发绀3疱疹4皲裂) ***/
    @TableField(value = "lips_status")
    private String lipsStatus;

    /***** 齿列(0正常1缺齿2龋齿3义齿) ***/
    @TableField(value = "tooth_status")
    private String toothStatus;

    /***** 咽部(0正常1赘生物) ***/
    @TableField(value = "throat_status")
    private String throatStatus;

    /***** 视力(左) ***/
    @TableField(value = "left_eyesight")
    private Double leftEyesight;

    /***** 视力(右) ***/
    @TableField(value = "right_eyesight")
    private Double rightEyesight;

    /***** 听力(0听见1听不见或听不清) ***/
    @TableField(value = "listening_status")
    private String listeningStatus;

    /***** 耳鼻部(0正常1异常) ***/
    @TableField(value = "ear_nose_status")
    private String earNoseStatus;

    /***** 眼底(0正常1异常) ***/
    @TableField(value = "eye_status")
    private String eyeStatus;

    /***** 胸部形状(0正常1桶状胸2扁平胸3其他) ***/
    @TableField(value = "chest_shape")
    private String chestShape;

    /***** 胸部叩诊(0清音1过清音2实音) ***/
    @TableField(value = "chest_percussion")
    private String chestPercussion;

    /***** 胸部呼吸音(0正常1异常) ***/
    @TableField(value = "chest_sounds")
    private String chestSounds;

    /***** 心脏状态(0抬举性心尖搏动1心界扩大) ***/
    @TableField(value = "heart_status")
    private String heartStatus;

    /***** 心率 ***/
    @TableField(value = "heart_rate")
    private String heartRate;

    /***** 心律(0齐1不齐2绝对不齐) ***/
    @TableField(value = "heart_rhythm")
    private String heartRhythm;

    /***** 心音(0齐1不齐2绝对不齐) ***/
    @TableField(value = "heart_sounds")
    private String heartSounds;

    /***** 腹部状况(0压痛1叩击痛2包块3肝脾4移动性浊音) ***/
    @TableField(value = "abdomen_status")
    private String abdomenStatus;

    /***** 腹部描述 ***/
    @TableField(value = "abdomen_desp")
    private String abdomenDesp;

    /***** 四肢皮肤水肿(0无1有) ***/
    @TableField(value = "arms_skin")
    private String armsSkin;

    /***** 四肢皮肤描述 ***/
    @TableField(value = "arms_skin_desp")
    private String armsSkinDesp;

    /***** 可扪及(0减弱1右2左) ***/
    @TableField(value = "can_touch")
    private String canTouch;

    /***** 未扪及(1右2左) ***/
    @TableField(value = "no_touch")
    private String noTouch;

    /***** 肛门生殖器(0正常1异常) ***/
    @TableField(value = "anus_status")
    private String anusStatus;

    /***** 乳房生殖器 ***/
    @TableField(value = "woman_check")
    private String womanCheck;

    /***** 辅助附件 ***/
    @TableField(value = "check_file")
    private String checkFile;

    /***** 体检总评价 ***/
    @TableField(value = "check_result")
    private String checkResult;

    /***** 是否为入院体检(0否1是) ***/
    @TableField(value = "physical_state")
    private String physicalState;

    /***** 医院名称 ***/
    @TableField(value = "hospital_name")
    private String hospitalName;

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


}


