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

@TableName("tb_jiangyukeji_ins_base_building_info")
@Data
public class InsBaseBuildingInfo implements Serializable, Cloneable {

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

    /***** 父级主键id（楼栋） ***/
    @TableField(value = "parent_id")
    private Long parentId;

    /***** 父级名称（楼栋） ***/
    @TableField(value = "parent_name")
    private String parentName;

    /***** 楼栋/楼层名称 ***/
    @TableField(value = "building_name")
    private String buildingName;

    /***** 楼栋/楼层照片 ***/
    @TableField(value = "img_path")
    private String imgPath;

    /***** 楼层/房间数 ***/
    @TableField(value = "floor_num")
    private Integer floorNum;

    /***** 楼栋类型(1养护型 ***/
    @TableField(value = "building_type")
    private Integer buildingType;

    /***** 户型图(多个逗号分隔) ***/
    @TableField(value = "house_img")
    private String houseImg;

    /***** 房型结构图 ***/
    @TableField(value = "structure_img")
    private String structureImg;

    /***** 懋特室内定位楼栋/楼层id ***/
    @TableField(value = "indoor_positioning_id")
    private String indoorPositioningId;

    /***** 懋特室内定位地图楼栋id ***/
    @TableField(value = "indoor_map_id")
    private String indoorMapId;

    /***** 懋特室内定位吸顶信标数量 ***/
    @TableField(value = "indoor_ceiling_num")
    private Integer indoorCeilingNum;

    /***** 懋特室内定位地面信标数量 ***/
    @TableField(value = "indoor_ground_num")
    private Integer indoorGroundNum;

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

    @TableField(value = "bed_num")
    private Integer bedNum;

    @TableField(value = "occupancy_num")
    private Integer occupancyNum;

    /***** 楼层列表 ***/
    @TableField(exist = false)
    public List<InsBaseFloorInfo> floorInfoList;
    /***** 是否只显示空闲 ***/
    @TableField(exist = false)
    private Integer isShowFree;
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


