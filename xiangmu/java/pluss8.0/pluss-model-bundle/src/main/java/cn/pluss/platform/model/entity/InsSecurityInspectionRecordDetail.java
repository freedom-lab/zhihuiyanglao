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

@TableName("tb_jiangyukeji_ins_security_inspection_record_detail")
@Data
public class InsSecurityInspectionRecordDetail implements Serializable, Cloneable {

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

    /***** 记录id ***/
    @TableField(value = "record_id")
    private Long recordId;

    /***** 点位id ***/
    @TableField(value = "point_id")
    private Long pointId;

    /***** 点位名称 ***/
    @TableField(value = "point_name")
    private String pointName;

    /***** 点位顺序 ***/
    @TableField(value = "sort_num")
    private Integer sortNum;

    /***** 点位位置 ***/
    @TableField(value = "point_position")
    private String pointPosition;

    /***** 巡检时间 ***/
    @TableField(value = "inspection_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date inspectionTime;

    /***** 巡检人id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 巡检人姓名 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 巡检状态(0未巡检 ***/
    @TableField(value = "inspection_state")
    private Integer inspectionState;

    /***** 巡检说明 ***/
    @TableField(value = "patrol_illustrate")
    private String patrolIllustrate;

    /***** 巡检图片(多个逗号分隔) ***/
    @TableField(value = "img_path")
    private String imgPath;

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


