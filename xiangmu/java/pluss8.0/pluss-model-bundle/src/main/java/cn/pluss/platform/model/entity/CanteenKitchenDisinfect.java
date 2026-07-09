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

@TableName("tb_jiangyukeji_canteen_kitchen_disinfect")
@Data
public class CanteenKitchenDisinfect implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 消毒日期 ***/
    @TableField(value = "disinfect_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date disinfectDate;

    /***** 消毒物品 ***/
    @TableField(value = "device_name")
    private String deviceName;

    /***** 消毒方法 ***/
    @TableField(value = "disinfect_method")
    private String disinfectMethod;

    /***** 负责人 ***/
    @TableField(value = "link_man")
    private String linkMan;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 上传图片 ***/
    @TableField(value = "photo")
    private String photo;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private Long areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

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

    /***** 状态(0禁用1启用) ***/
    @TableField(value = "status")
    private Integer status;

    /***** 同步状态 ***/
    @TableField(value = "gsp_state")
    private Integer gspState;


}


