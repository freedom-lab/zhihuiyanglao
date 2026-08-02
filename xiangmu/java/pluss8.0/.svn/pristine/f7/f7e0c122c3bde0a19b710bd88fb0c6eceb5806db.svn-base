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

@TableName("tb_jiangyukeji_ins_logistics_material_out")
@Data
public class InsLogisticsMaterialOut implements Serializable, Cloneable {

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

    /***** 出库单号 ***/
    @TableField(value = "out_code")
    private String outCode;

    /***** 出库类型(1领用 ***/
    @TableField(value = "out_type")
    private Integer outType;

    /***** 物资id ***/
    @TableField(value = "material_id")
    private Long materialId;

    /***** 物资名称 ***/
    @TableField(value = "material_name")
    private String materialName;

    /***** 出库日期 ***/
    @TableField(value = "out_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date outTime;

    /***** 出库数量 ***/
    @TableField(value = "out_num")
    private Integer outNum;

    /***** 领用人id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 领用人名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 部门名称 ***/
    @TableField(value = "neck_department")
    private String neckDepartment;

    /***** 领用说明 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 借用是否归还(1未归还 ***/
    @TableField(value = "state")
    private Integer state;

    /***** 归还时间 ***/
    @TableField(value = "return_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date returnTime;

    /***** 登记人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 登记人名称 ***/
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


