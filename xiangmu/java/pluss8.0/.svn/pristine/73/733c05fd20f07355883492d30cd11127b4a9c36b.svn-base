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

@TableName("tb_jiangyukeji_gsp_institution_building_transfer")
@Data
public class GspInstitutionBuildingTransfer implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 唯一标识ID ***/
    @TableField(value = "data_id")
    private String dataId;

    /***** 机构唯一标识ID ***/
    @TableField(value = "institution_id")
    private String institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 统一社会信用代码 ***/
    @TableField(value = "credit_code")
    private String creditCode;

    /***** 建筑物名称 ***/
    @TableField(value = "building_name")
    private String buildingName;

    /***** 结构 ***/
    @TableField(value = "structure")
    private String structure;

    /***** 楼层 ***/
    @TableField(value = "floor")
    private String floor;

    /***** 层高 ***/
    @TableField(value = "floor_num")
    private String floorNum;

    /***** 建成年月 ***/
    @TableField(value = "building_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date buildingTime;

    /***** 建筑面积 ***/
    @TableField(value = "building_area")
    private String buildingArea;

    /***** 成本单价 ***/
    @TableField(value = "price")
    private String price;

    /***** 原值 ***/
    @TableField(value = "original_value")
    private String originalValue;

    /***** 成新率 ***/
    @TableField(value = "residue_ratio")
    private String residueRatio;

    /***** 净值 ***/
    @TableField(value = "net_value")
    private String netValue;

    /***** 装修价值 ***/
    @TableField(value = "total_price")
    private String totalPrice;

    /***** 房屋类型(1国有2自投） ***/
    @TableField(value = "building_type")
    private String buildingType;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 业务字段 ***/
    @TableField(value = "status")
    private Integer status;


}


