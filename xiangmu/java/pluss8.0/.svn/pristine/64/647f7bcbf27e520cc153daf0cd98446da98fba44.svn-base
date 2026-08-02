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

@TableName("tb_jiangyukeji_ins_nursing_rehab_execution_record")
@Data
public class InsNursingRehabExecutionRecord implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 所属运营公司id ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 所属运营公司名称 ***/
    @TableField(value = "corp_name")
    private String corpName;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 入住信息主键id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 入住日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 康复执行日期 ***/
    @TableField(value = "execution_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date executionDate;

    /***** 康复计划主键id ***/
    @TableField(value = "plan_id")
    private Long planId;

    /***** 康复计划名称 ***/
    @TableField(value = "plan_name")
    private String planName;

    /***** 项目id ***/
    @TableField(value = "item_id")
    private Long itemId;

    /***** 项目名称 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 康复训练内容 ***/
    @TableField(value = "training_content")
    private String trainingContent;

    /***** 计划开始时间(hh:mm) ***/
    @TableField(value = "plan_start_time")
    private String planStartTime;

    /***** 计划结束时间(hh:mm) ***/
    @TableField(value = "plan_end_time")
    private String planEndTime;

    /***** 执行状态(1未开始 ***/
    @TableField(value = "nursing_state")
    private Integer nursingState;

    /***** 训练开始时间 ***/
    @TableField(value = "service_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceStartTime;

    /***** 训练结束时间 ***/
    @TableField(value = "service_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceEndTime;

    /***** 训练时长(分钟) ***/
    @TableField(value = "service_time")
    private Integer serviceTime;

    /***** 康复师id ***/
    @TableField(value = "nursing_staff_id")
    private Long nursingStaffId;

    /***** 康复师名称 ***/
    @TableField(value = "nursing_staff_name")
    private String nursingStaffName;

    /***** 撤销原因 ***/
    @TableField(value = "revocation_reason")
    private String revocationReason;

    /***** 训练图片路径(多个逗号分隔) ***/
    @TableField(value = "img_path")
    private String imgPath;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人名称 ***/
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

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


