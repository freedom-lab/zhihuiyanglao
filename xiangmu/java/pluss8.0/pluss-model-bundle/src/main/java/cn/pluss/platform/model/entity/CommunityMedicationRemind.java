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

@TableName("tb_jiangyukeji_community_medication_remind")
@Data
public class CommunityMedicationRemind implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 服务机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 手机号码 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 药物名称 ***/
    @TableField(value = "drug_name")
    private String drugName;

    /***** 用药开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 用药结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 用药周期（天） ***/
    @TableField(value = "drug_days")
    private Integer drugDays;

    /***** 每次用量 ***/
    @TableField(value = "drug_dosage")
    private String drugDosage;

    /***** 用药时间(1饭前2饭后) ***/
    @TableField(value = "medication_type")
    private Integer medicationType;

    /***** 早上 ***/
    @TableField(value = "morning_time")
    private String morningTime;

    /***** 中午 ***/
    @TableField(value = "noon_time")
    private String noonTime;

    /***** 晚上 ***/
    @TableField(value = "evening_time")
    private String eveningTime;

    /***** 选择早中晚的时间（1早上2中午3晚上，多选时逗号分隔） ***/
    @TableField(value = "select_time")
    private String selectTime;

    /***** 用药状态(0未完结 ***/
    @TableField(value = "drug_state")
    private Integer drugState;

    /***** 发送内容 ***/
    @TableField(value = "send_context")
    private String sendContext;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 提醒方式(1每餐 ***/
    @TableField(value = "reminder_method")
    private Integer reminderMethod;


}


