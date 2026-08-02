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

@TableName("tb_jiangyukeji_assessment_appoint")
@Data
public class AssessmentAppoint implements Serializable, Cloneable {

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

    /***** 身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 居住地址 ***/
    @TableField(value = "address")
    private String address;

    /***** 老人联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 计划评估日期 ***/
    @TableField(value = "plan_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date planDate;

    /***** 评估编号 ***/
    @TableField(value = "assess_code")
    private String assessCode;

    /***** 评估原因(1 ***/
    @TableField(value = "assess_memo")
    private String assessMemo;

    /***** 评估方式(1集中评估2上门评估) ***/
    @TableField(value = "assess_way")
    private String assessWay;

    /***** 分配状态（0平台未分配1平台已分配） ***/
    @TableField(value = "allocation_state")
    private String allocationState;

    /***** 评估状态（1待派单2已派单3已接单4评估开始5评估完成） ***/
    @TableField(value = "assess_state")
    private String assessState;

    /***** 评估日期 ***/
    @TableField(value = "assess_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assessTime;

    /***** 下次评估日期 ***/
    @TableField(value = "next_assess_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date nextAssessTime;

    /***** 初步结果(0能力完好1轻度失能2中度失能3重度失能4完全失能) ***/
    @TableField(value = "initial_level")
    private String initialLevel;

    /***** 最终评估结果(0能力完好1轻度失能2中度失能3重度失能4完全失能) ***/
    @TableField(value = "assess_result")
    private String assessResult;

    /***** 专项评估结果 ***/
    @TableField(value = "special_result")
    private String specialResult;

    /***** 评估地点 ***/
    @TableField(value = "assess_address")
    private String assessAddress;

    /***** 总得分 ***/
    @TableField(value = "total_points")
    private Integer totalPoints;

    /***** 选中的题目类型 ***/
    @TableField(value = "question_types")
    private String questionTypes;

    /***** 数据来源（1老人申请2系统录入3批量录入4家庭床位5日照中心） ***/
    @TableField(value = "data_source")
    private String dataSource;

    /***** 选中的选项ID串 ***/
    @TableField(value = "option_ids")
    private String optionIds;

    /***** 选中的问题ID串 ***/
    @TableField(value = "question_ids")
    private String questionIds;

    /***** 评估类型（1能力评估2专项评估3自定义评估） ***/
    @TableField(value = "assess_type")
    private String assessType;

    /***** 评估模板id ***/
    @TableField(value = "template_id")
    private Long templateId;

    /***** 评估标准 ***/
    @TableField(value = "assessment_criteria")
    private String assessmentCriteria;

    /***** 评估报告附件 ***/
    @TableField(value = "assess_file")
    private String assessFile;

    /***** 评估员签名照片（2张） ***/
    @TableField(value = "assess_sign_img")
    private String assessSignImg;

    /***** 老人签名照片(单张) ***/
    @TableField(value = "elder_sign_img")
    private String elderSignImg;

    /***** 评估过程照片（多张） ***/
    @TableField(value = "assess_process_img")
    private String assessProcessImg;

    /***** 评估过程视频 ***/
    @TableField(value = "assess_process_video")
    private String assessProcessVideo;

    /***** 信息提供者签名（1张） ***/
    @TableField(value = "provide_sign_img")
    private String provideSignImg;

    /***** 指派机构ID ***/
    @TableField(value = "assign_org_id")
    private Long assignOrgId;

    /***** 指派机构名称 ***/
    @TableField(value = "assign_org_name")
    private String assignOrgName;

    /***** 指派评估人ID ***/
    @TableField(value = "assign_staff_id")
    private Long assignStaffId;

    /***** 指派评估人姓名 ***/
    @TableField(value = "assign_staff_name")
    private String assignStaffName;

    /***** 评估人员电话 ***/
    @TableField(value = "assign_staff_tel")
    private String assignStaffTel;

    /***** 派单时间 ***/
    @TableField(value = "assign_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assignTime;

    /***** 接单时间 ***/
    @TableField(value = "accept_order_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date acceptOrderTime;

    /***** 评估开始时间 ***/
    @TableField(value = "assess_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assessStartTime;

    /***** 评估结束时间 ***/
    @TableField(value = "assess_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date assessEndTime;

    /***** 评估机构评估结果审核( ***/
    @TableField(value = "institution_aduit_state")
    private String institutionAduitState;

    /***** 评估机构审核时间 ***/
    @TableField(value = "institution_aduit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date institutionAduitTime;

    /***** 评估机构审核人ID ***/
    @TableField(value = "institution_aduit_id")
    private Long institutionAduitId;

    /***** 评估机构审核人姓名 ***/
    @TableField(value = "institution_aduit_name")
    private String institutionAduitName;

    /***** 评估机构审核备注 ***/
    @TableField(value = "institution_aduit_reason")
    private String institutionAduitReason;

    /***** 民政审核状态( ***/
    @TableField(value = "civil_audit_state")
    private String civilAuditState;

    /***** 民政审核人姓名 ***/
    @TableField(value = "civil_audit_name")
    private String civilAuditName;

    /***** 民政审核时间 ***/
    @TableField(value = "civil_audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date civilAuditTime;

    /***** 民政审核备注 ***/
    @TableField(value = "civil_aduit_reason")
    private String civilAduitReason;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 所属区划 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 所属区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 评估用途（1补贴申请2机构入住3家庭床位4其他） ***/
    @TableField(value = "assess_uses")
    private Integer assessUses;

    /***** 监护人姓名 ***/
    @TableField(value = "guardian_contact")
    private String guardianContact;

    /***** 监护人电话 ***/
    @TableField(value = "guardian_contact_tel")
    private String guardianContactTel;

    /***** 护理床意愿(0否1是) ***/
    @TableField(value = "is_wish_care_bed")
    private Integer isWishCareBed;

    /***** 护理床安装条件(0无1有) ***/
    @TableField(value = "is_install_care_bed")
    private Integer isInstallCareBed;

    /***** 老人类别 ***/
    @TableField(value = "elder_type")
    private String elderType;

    /***** 居住状况 ***/
    @TableField(value = "live_state")
    private String liveState;

    /***** 残疾等级代码 ***/
    @TableField(value = "disability_level")
    private String disabilityLevel;

    /***** 残疾类别类型 ***/
    @TableField(value = "disability_type")
    private String disabilityType;

    /***** 经济来源(CJ015 ***/
    @TableField(value = "economic_sources")
    private String economicSources;

    @TableField(exist = false)
    private AssessmentElderBase assessmentElderBase;
}


