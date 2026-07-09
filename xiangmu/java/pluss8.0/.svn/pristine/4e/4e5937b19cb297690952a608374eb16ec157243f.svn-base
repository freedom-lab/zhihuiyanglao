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

@TableName("tb_jiangyukeji_ins_su_water_electric_record")
@Data
public class InsSuWaterElectricRecord implements Serializable, Cloneable {

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

    /***** 楼栋id ***/
    @TableField(value = "building_id")
    private Long buildingId;

    /***** 楼栋名称 ***/
    @TableField(value = "building_name")
    private String buildingName;

    /***** 楼层id ***/
    @TableField(value = "floor_id")
    private Long floorId;

    /***** 楼层名称 ***/
    @TableField(value = "floor_name")
    private String floorName;

    /***** 房间id ***/
    @TableField(value = "room_id")
    private Long roomId;

    /***** 房间名称 ***/
    @TableField(value = "room_name")
    private String roomName;

    /***** 抄表日期 ***/
    @TableField(value = "reading_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date readingDate;

    /***** 水费(每吨) ***/
    @TableField(value = "water_price")
    private Double waterPrice;

    /***** 用水量(吨) ***/
    @TableField(value = "water_number")
    private Double waterNumber;

    /***** 电费(每千瓦) ***/
    @TableField(value = "electric_price")
    private Double electricPrice;

    /***** 电费用量(千瓦) ***/
    @TableField(value = "electric_number")
    private Double electricNumber;

    /***** 热水费单价(m²) ***/
    @TableField(value = "hot_water_price")
    private Double hotWaterPrice;

    /***** 房屋平米数(m²) ***/
    @TableField(value = "hot_water_number")
    private Double hotWaterNumber;

    /***** 供热费单价(m²) ***/
    @TableField(value = "heating_price")
    private Double heatingPrice;

    /***** 房屋平米数(m²) ***/
    @TableField(value = "heating_number")
    private Double heatingNumber;

    /***** 开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 水费总金额 ***/
    @TableField(value = "water_total_amount")
    private Double waterTotalAmount;

    /***** 电费总金额 ***/
    @TableField(value = "electric_total_amount")
    private Double electricTotalAmount;

    /***** 热水费总金额 ***/
    @TableField(value = "hot_water_total_amount")
    private Double hotWaterTotalAmount;

    /***** 供热费总金额 ***/
    @TableField(value = "heating_total_amount")
    private Double heatingTotalAmount;

    /***** 结算状态(1未结算 ***/
    @TableField(value = "settlement_state")
    private Integer settlementState;

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


