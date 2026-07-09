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

@TableName("tb_jiangyukeji_care_nursing_plan_setting")
@Data
public class CareNursingPlanSetting implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 所属运营公司id ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 照护等级id ***/
    @TableField(value = "nursing_level_id")
    private Long nursingLevelId;

    /***** 照护等级名称 ***/
    @TableField(value = "nursing_level_name")
    private String nursingLevelName;

    /***** 大类id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 大类名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 项目id ***/
    @TableField(value = "item_id")
    private Long itemId;

    /***** 项目名称 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 项目频率(1每天 ***/
    @TableField(value = "item_frequency")
    private Integer itemFrequency;

    /***** 操作类型(数据字典(ins_operation_type)) ***/
    @TableField(value = "operation_type")
    private String operationType;

    /***** 开始时间(hh:mm) ***/
    @TableField(value = "start_time")
    private String startTime;

    /***** 结束时间(hh:mm) ***/
    @TableField(value = "end_time")
    private String endTime;

    /***** 星期几(频率每周) ***/
    @TableField(value = "week_num")
    private Integer weekNum;

    /***** 几号(频率每月) ***/
    @TableField(value = "day_num")
    private Integer dayNum;

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


