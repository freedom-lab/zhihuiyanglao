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

@TableName("tb_jiangyukeji_health_arteriosclerosis")
@Data
public class HealthArteriosclerosis implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 运营公司ID ***/
    @TableField(value = "corp_id")
    private Long corpId;

    /***** 服务机构ID ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 服务机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 老人标识ID ***/
    @TableField(value = "elder_id")
    private Long elderId;

    /***** 姓名 ***/
    @TableField(value = "elder_name")
    private String elderName;

    /***** 身份证号 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 性别(1：男，2：女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 年龄 ***/
    @TableField(value = "age")
    private Integer age;

    /***** 测量时间 ***/
    @TableField(value = "gauge_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date gaugeTime;

    /***** 测量设备 ***/
    @TableField(value = "gauge_type")
    private String gaugeType;

    /***** 血压-高压 ***/
    @TableField(value = "heightPressure")
    private Integer heightPressure;

    /***** 血压-低压 ***/
    @TableField(value = "lowPressure")
    private Integer lowPressure;

    /***** 脉搏 ***/
    @TableField(value = "pulse")
    private Integer pulse;

    /***** 动脉脉搏波速率指数 ***/
    @TableField(value = "aVI")
    private Integer aVI;

    /***** 参考状态 ***/
    @TableField(value = "aVI_Refer")
    private Integer aVIRefer;

    /***** 动脉压力容积指数 ***/
    @TableField(value = "aPI")
    private Integer aPI;

    /***** 参考状态 ***/
    @TableField(value = "aPI_Refer")
    private Integer aPIRefer;

    /***** CSBP ***/
    @TableField(value = "cSBP")
    private Integer cSBP;

    /***** CAPP ***/
    @TableField(value = "cAPP")
    private Integer cAPP;

    /***** 测量时间 ***/
    @TableField(value = "addTime")
    private String addTime;

    /***** 健康建议 ***/
    @TableField(value = "tip")
    private String tip;

    /***** 参考意见 ***/
    @TableField(value = "opinion")
    private String opinion;

    /***** 预警标记(0未扫描1已扫描(默认0)) ***/
    @TableField(value = "warn_flag")
    private String warnFlag;

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

    /***** 业务字段 ***/
    @TableField(value = "status")
    private Integer status;

    /***** 数据来源(字典值) ***/
    @TableField(value = "data_source")
    private String dataSource;


}


