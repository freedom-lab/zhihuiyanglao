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

@TableName("tb_jiangyukeji_ins_sudden_repair_info")
@Data
public class InsSuddenRepairInfo implements Serializable, Cloneable {

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

    /***** 报修时间 ***/
    @TableField(value = "repair_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date repairTime;

    /***** 报修单号 ***/
    @TableField(value = "repair_code")
    private String repairCode;

    /***** 报修类型(数据字典(ins_repair_type)) ***/
    @TableField(value = "repair_type")
    private String repairType;

    /***** 报修地点 ***/
    @TableField(value = "repair_place")
    private String repairPlace;

    /***** 报修说明 ***/
    @TableField(value = "repair_memo")
    private String repairMemo;

    /***** 报修等级(0一般 ***/
    @TableField(value = "repair_level")
    private Integer repairLevel;

    /***** 报修人id ***/
    @TableField(value = "repair_id")
    private Long repairId;

    /***** 报修人 ***/
    @TableField(value = "repair_name")
    private String repairName;

    /***** 报修附件信息 ***/
    @TableField(value = "repair_img_path")
    private String repairImgPath;

    /***** 处理状态(0待处理 ***/
    @TableField(value = "handle_state")
    private Integer handleState;

    /***** 处理人id ***/
    @TableField(value = "handle_id")
    private Long handleId;

    /***** 处理人 ***/
    @TableField(value = "handle_name")
    private String handleName;

    /***** 处理时间 ***/
    @TableField(value = "handle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /***** 处理说明 ***/
    @TableField(value = "handle_memo")
    private String handleMemo;

    /***** 处理图片 ***/
    @TableField(value = "handle_img")
    private String handleImg;

    /***** 报修人确认状态(1未确认2 ***/
    @TableField(value = "confirm_state")
    private Integer confirmState;

    /***** 确认时间 ***/
    @TableField(value = "confirm_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date confirmTime;

    /***** 维修故障时长 ***/
    @TableField(value = "duration")
    private String duration;

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

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 状态(0禁用1启用) ***/
    @TableField(value = "status")
    private Integer status;


}


