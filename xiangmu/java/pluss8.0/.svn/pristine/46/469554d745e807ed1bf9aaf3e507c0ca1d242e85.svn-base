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

@TableName("tb_jiangyukeji_ins_register_visit_info")
@Data
public class InsRegisterVisitInfo implements Serializable, Cloneable {

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

    /***** 探访人姓名 ***/
    @TableField(value = "visit_name")
    private String visitName;

    /***** 联系电话 ***/
    @TableField(value = "visit_link_tel")
    private String visitLinkTel;

    /***** 证件类型(数据字典 ***/
    @TableField(value = "document_type")
    private String documentType;

    /***** 证件号码 ***/
    @TableField(value = "document_code")
    private String documentCode;

    /***** 探访时间 ***/
    @TableField(value = "visit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date visitTime;

    /***** 探访人数 ***/
    @TableField(value = "visit_num")
    private Integer visitNum;

    /***** 计划离开时间 ***/
    @TableField(value = "plan_leave_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date planLeaveTime;

    /***** 与老人关系(数据字典 ***/
    @TableField(value = "relation_type")
    private String relationType;

    /***** 老人id ***/
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

    /***** 老人房间信息 ***/
    @TableField(value = "bed_info")
    private String bedInfo;

    /***** 携带物品 ***/
    @TableField(value = "belongings")
    private String belongings;

    /***** 附件路径(多个逗号分隔) ***/
    @TableField(value = "file_path")
    private String filePath;

    /***** 是否去过高风险区域(1否2是) ***/
    @TableField(value = "from_risk")
    private Integer fromRisk;

    /***** 体温 ***/
    @TableField(value = "temperature")
    private Double temperature;

    /***** 同意状态(0待确认 ***/
    @TableField(value = "is_agree")
    private String isAgree;

    /***** 不同意原因 ***/
    @TableField(value = "agree_explain")
    private String agreeExplain;

    /***** 是否同意的操作人 ***/
    @TableField(value = "agree_name")
    private String agreeName;

    /***** 是否同意的操作时间 ***/
    @TableField(value = "agree_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date agreeTime;

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


