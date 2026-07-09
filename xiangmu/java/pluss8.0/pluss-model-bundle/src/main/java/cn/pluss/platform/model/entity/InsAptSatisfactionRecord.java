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

@TableName("tb_jiangyukeji_ins_apt_satisfaction_record")
@Data
public class InsAptSatisfactionRecord implements Serializable, Cloneable {

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

    /***** 管家日常沟通与响应速度(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_one")
    private String questionOne;

    /***** 问题跟进与反馈效率(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_two")
    private String questionTwo;

    /***** 服务态度与专业度(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_three")
    private String questionThree;

    /***** 公区清洁效率与效果(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_four")
    private String questionFour;

    /***** 园区绿化养护(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_five")
    private String questionFive;

    /***** 垃圾清运及时性(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_six")
    private String questionSix;

    /***** 报修响应速度(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_seven")
    private String questionSeven;

    /***** 维修质量与耐用性(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_eight")
    private String questionEight;

    /***** 电梯、照明维护状况(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_nine")
    private String questionNine;

    /***** 门禁与访客登记规范(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_ten")
    private String questionTen;

    /***** 巡逻频率与安全性(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_eleven")
    private String questionEleven;

    /***** 节日氛围与活动组织(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_twelve")
    private String questionTwelve;

    /***** 您对物业服务的整体满意度(数据字典(ins_satisfaction_type)) ***/
    @TableField(value = "question_thirteen")
    private String questionThirteen;

    /***** 需要改进的内容 ***/
    @TableField(value = "improve_content")
    private String improveContent;

    /***** 您想对我们说 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 填表人id(亲属账号id) ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 填表人姓名(亲属账号用户名称) ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 填表时间 ***/
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


