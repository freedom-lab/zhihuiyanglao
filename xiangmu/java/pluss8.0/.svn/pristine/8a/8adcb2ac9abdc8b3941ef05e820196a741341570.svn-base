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

@TableName("tb_jiangyukeji_jc_sms_send")
@Data
public class JcSmsSend implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户id ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 机构id ***/
    @TableField(value = "institution_id")
    private Long institutionId;

    /***** 机构名称 ***/
    @TableField(value = "institution_name")
    private String institutionName;

    /***** 接收方手机号码 ***/
    @TableField(value = "tel_num")
    private String telNum;

    /***** 短信模板ID ***/
    @TableField(value = "templet_id")
    private Long templetId;

    /***** 短信内容 ***/
    @TableField(value = "sms_context")
    private String smsContext;

    /***** 发送状态(0-未知,1-等待发送,2-发送成功,3-发送失败) ***/
    @TableField(value = "send_state")
    private Integer sendState;

    /***** 发送结果(从短信服务器返回) ***/
    @TableField(value = "send_result")
    private String sendResult;

    /***** 短信发送时间 ***/
    @TableField(value = "send_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    /***** 发送类型(1主动关怀 ***/
    @TableField(value = "send_type")
    private Integer sendType;

    /***** 发送类型主表ID ***/
    @TableField(value = "log_id")
    private Long logId;

    /***** IP地址 ***/
    @TableField(value = "ip")
    private String ip;

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

    /***** 是否启用(1:启用，0:未启用) ***/
    @TableField(value = "status")
    private Integer status;


}


