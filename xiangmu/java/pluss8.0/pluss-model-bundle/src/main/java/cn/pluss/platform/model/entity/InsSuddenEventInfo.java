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

@TableName("tb_jiangyukeji_ins_sudden_event_info")
@Data
public class InsSuddenEventInfo implements Serializable, Cloneable {

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

    /***** 事件类别(数据字典(ins_event_type)) ***/
    @TableField(value = "event_type")
    private String eventType;

    /***** 事件预案内容 ***/
    @TableField(value = "plan_memo")
    private String planMemo;

    /***** 发生时间 ***/
    @TableField(value = "event_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date eventTime;

    /***** 发生地点 ***/
    @TableField(value = "event_place")
    private String eventPlace;

    /***** 事件经过 ***/
    @TableField(value = "event_process")
    private String eventProcess;

    /***** 严重程度(数据字典(ins_severity_type)) ***/
    @TableField(value = "severity_type")
    private String severityType;

    /***** 处理状态(1未处理 ***/
    @TableField(value = "handle_state")
    private Integer handleState;

    /***** 处理人员id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 处理人员名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 处理时间 ***/
    @TableField(value = "handle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /***** 处理结果 ***/
    @TableField(value = "handle_results")
    private String handleResults;

    /***** 最终讨论意见 ***/
    @TableField(value = "discussion_opinions")
    private String discussionOpinions;

    /***** 附件路径 ***/
    @TableField(value = "event_img_path")
    private String eventImgPath;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 状态(0禁用1启用) ***/
    @TableField(value = "status")
    private Integer status;


}


