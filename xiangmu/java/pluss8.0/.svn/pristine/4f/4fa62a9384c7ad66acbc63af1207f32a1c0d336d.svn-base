package cn.pluss.platform.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@TableName("tb_jiangyukeji_ins_base_floor_info")
@Data
public class InsBaseFloorInfo implements Serializable, Cloneable {

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

    /***** 楼层名称 ***/
    @TableField(value = "floor_name")
    private String floorName;

    /***** 房间数 ***/
    @TableField(value = "room_num")
    private Integer roomNum;

    /***** 楼栋id ***/
    @TableField(value = "building_id")
    private Long buildingId;

    /***** 楼栋名称 ***/
    @TableField(value = "building_name")
    private String buildingName;

    /***** 排序 ***/
    @TableField(value = "sort_num")
    private Integer sortNum;

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

    /***** 床位数 ***/
    @TableField(value = "bed_num")
    private Integer bedNum;
    /***** 入住数 ***/
    @TableField(value = "occupancy_num")
    private Integer occupancyNum;
    /***** 房间列表 ***/
    @TableField(exist = false)
    private List<InsBaseRoomInfo> roomInfoList;
    /***** 房间总数 ***/
    @TableField(exist = false)
    private Integer totalRoomCount;
    /***** 床位总数 ***/
    @TableField(exist = false)
    private Integer totalBedCount;
    /***** 空闲床数量 ***/
    @TableField(exist = false)
    private Integer freeBedCount;
    /***** 入住床数量 ***/
    @TableField(exist = false)
    private Integer checkInBedCount;




    /***** 试住床数量 ***/
    @TableField(exist = false)
    private Integer testBedCount;
    /***** 预定床数量 ***/
    @TableField(exist = false)
    private Integer reserveBedCount;

    /***** 变更占用床数量 ***/
    @TableField(exist = false)
    private Integer changeBedCount;

    /***** 入住率***/
    @TableField(exist = false)
    private BigDecimal occupancyRate;
}


