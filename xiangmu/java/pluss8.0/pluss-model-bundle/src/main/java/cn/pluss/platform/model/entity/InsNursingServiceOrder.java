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

@TableName("tb_jiangyukeji_ins_nursing_service_order")
@Data
public class InsNursingServiceOrder implements Serializable, Cloneable {

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

    /***** 订单编号 ***/
    @TableField(value = "order_code")
    private String orderCode;

    /***** 入住信息主键id ***/
    @TableField(value = "check_id")
    private Long checkId;

    /***** 入住日期 ***/
    @TableField(value = "check_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkDate;

    /***** 老人id ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 老人姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 性别(1男，2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 服务时间 ***/
    @TableField(value = "service_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceTime;

    /***** 自选服务大类id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 自选服务大类名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 自选服务项目id ***/
    @TableField(value = "item_id")
    private Long itemId;

    /***** 自选服务项目名称 ***/
    @TableField(value = "item_name")
    private String itemName;

    /***** 服务价格 ***/
    @TableField(value = "item_price")
    private Double itemPrice;

    /***** 购买数量 ***/
    @TableField(value = "buy_number")
    private Integer buyNumber;

    /***** 服务总价 ***/
    @TableField(value = "total_amount")
    private Double totalAmount;

    /***** 服务状态(1未开始 ***/
    @TableField(value = "service_state")
    private Integer serviceState;

    /***** 服务开始时间 ***/
    @TableField(value = "service_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceStartTime;

    /***** 服务结束时间 ***/
    @TableField(value = "service_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date serviceEndTime;

    /***** 支付状态(1未支付 ***/
    @TableField(value = "pay_state")
    private Integer payState;

    /***** 支付方式(1现金 ***/
    @TableField(value = "pay_method")
    private Integer payMethod;

    /***** 护理人员id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 护理人员名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 撤销原因 ***/
    @TableField(value = "revocation_reason")
    private String revocationReason;

    /***** 服务图片路径(多个逗号分隔) ***/
    @TableField(value = "img_path")
    private String imgPath;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 下次服务日期 ***/
    @TableField(value = "next_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date nextDate;

    /***** 服务时长（分钟） ***/
    @TableField(value = "service_duration")
    private Integer serviceDuration;

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


