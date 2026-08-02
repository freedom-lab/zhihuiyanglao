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

@TableName("tb_jiangyukeji_ins_elder_track_record")
@Data
public class InsElderTrackRecord implements Serializable, Cloneable {

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

    /***** 第1日存在问题 ***/
    @TableField(value = "problem_describe_one")
    private String problemDescribeOne;

    /***** 第1日处理措施 ***/
    @TableField(value = "handle_describe_one")
    private String handleDescribeOne;

    /***** 第2日存在问题 ***/
    @TableField(value = "problem_describe_two")
    private String problemDescribeTwo;

    /***** 第2日处理措施 ***/
    @TableField(value = "handle_describe_two")
    private String handleDescribeTwo;

    /***** 第3日存在问题 ***/
    @TableField(value = "problem_describe_three")
    private String problemDescribeThree;

    /***** 第3日处理措施 ***/
    @TableField(value = "handle_describe_three")
    private String handleDescribeThree;

    /***** 第4日存在问题 ***/
    @TableField(value = "problem_describe_four")
    private String problemDescribeFour;

    /***** 第4日处理措施 ***/
    @TableField(value = "handle_describe_four")
    private String handleDescribeFour;

    /***** 第5日存在问题 ***/
    @TableField(value = "problem_describe_five")
    private String problemDescribeFive;

    /***** 第5日处理措施 ***/
    @TableField(value = "handle_describe_five")
    private String handleDescribeFive;

    /***** 第6日存在问题 ***/
    @TableField(value = "problem_describe_six")
    private String problemDescribeSix;

    /***** 第6日处理措施 ***/
    @TableField(value = "handle_describe_six")
    private String handleDescribeSix;

    /***** 第7日存在问题 ***/
    @TableField(value = "problem_describe_seven")
    private String problemDescribeSeven;

    /***** 第7日处理措施 ***/
    @TableField(value = "handle_describe_seven")
    private String handleDescribeSeven;

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


