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
import java.util.List;

@TableName("tb_jiangyukeji_ins_base_room_info")
@Data
public class InsBaseRoomInfo implements Serializable, Cloneable {

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

    /***** 房间名称 ***/
    @TableField(value = "room_name")
    private String roomName;

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

    /***** 建筑面积 ***/
    @TableField(value = "room_area")
    private Double roomArea;

    /***** 公摊面积 ***/
    @TableField(value = "share_area")
    private Double shareArea;

    /***** 套内面积 ***/
    @TableField(value = "indoor_area")
    private Double indoorArea;

    /***** 阳台面积 ***/
    @TableField(value = "balcony_area")
    private Double balconyArea;

    /***** 房间类型(数据字典 ***/
    @TableField(value = "room_type")
    private String roomType;

    /***** 房间朝向(数据字典 ***/
    @TableField(value = "room_orientation")
    private String roomOrientation;

    /***** 采光情况(数据字典 ***/
    @TableField(value = "room_lighted")
    private String roomLighted;

    /***** 通风情况(数据字典 ***/
    @TableField(value = "room_airness")
    private String roomAirness;

    /***** 房间户型(数据字典 ***/
    @TableField(value = "house_type")
    private String houseType;

    /***** 房间日价格 ***/
    @TableField(value = "room_day_price")
    private Double roomDayPrice;

    /***** 房间月价格 ***/
    @TableField(value = "room_month_price")
    private Double roomMonthPrice;

    /***** 房间状态(1空闲 ***/
    @TableField(value = "room_state")
    private Integer roomState;

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

    /***** 懋特室内定位楼栋/楼层id ***/
    @TableField(value = "indoor_positioning_id")
    private String indoorPositioningId;

    /***** 懋特室内定位地图楼栋id ***/
    @TableField(value = "indoor_map_id")
    private String indoorMapId;

    /***** 床位列表 ***/
    @TableField(exist = false)
    private List<InsBaseBedInfo> insBaseBedInfo;

}


