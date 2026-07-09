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

@TableName("tb_jiangyukeji_ins_logistics_material_into")
@Data
public class InsLogisticsMaterialInto implements Serializable, Cloneable {

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

    /***** 入库单号 ***/
    @TableField(value = "into_code")
    private String intoCode;

    /***** 物资类型(数据字典(ins_material_type)) ***/
    @TableField(value = "material_type")
    private String materialType;

    /***** 物资来源(数据字典(ins_material_source)) ***/
    @TableField(value = "material_source")
    private String materialSource;

    /***** 物资名称 ***/
    @TableField(value = "material_name")
    private String materialName;

    /***** 物资规格型号 ***/
    @TableField(value = "material_specs")
    private String materialSpecs;

    /***** 物资单位(数据字典(ins_goods_unit)) ***/
    @TableField(value = "material_unit")
    private String materialUnit;

    /***** 生产厂家 ***/
    @TableField(value = "factory_name")
    private String factoryName;

    /***** 生产批号 ***/
    @TableField(value = "lot_number")
    private String lotNumber;

    /***** 入库数量 ***/
    @TableField(value = "into_num")
    private Integer intoNum;

    /***** 存放地点 ***/
    @TableField(value = "place_name")
    private String placeName;

    /***** 当前库存 ***/
    @TableField(value = "surplus_num")
    private Integer surplusNum;

    /***** 物资说明 ***/
    @TableField(value = "remark")
    private String remark;

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


