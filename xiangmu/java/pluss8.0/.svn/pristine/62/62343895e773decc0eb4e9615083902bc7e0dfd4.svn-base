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

@TableName("tb_jiangyukeji_smart_care_param")
@Data
public class SmartCareParam implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 参数类型（1全局参数，2用户参数） ***/
    @TableField(value = "param_type")
    private String paramType;

    /***** 大门长时间未关参数（分钟） ***/
    @TableField(value = "gate_time")
    private Integer gateTime;

    /***** 红外无人检测上午开始时间 ***/
    @TableField(value = "morning_start_time")
    private String morningStartTime;

    /***** 红外无人检测上午结束时间 ***/
    @TableField(value = "morning_end_time")
    private String morningEndTime;

    /***** 红外无人检测下午开始时间 ***/
    @TableField(value = "afternoon_start_time")
    private String afternoonStartTime;

    /***** 红外无人检测下午结束时间 ***/
    @TableField(value = "afternoon_end_time")
    private String afternoonEndTime;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

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

    /***** 状态 ***/
    @TableField(value = "status")
    private Integer status;


}


