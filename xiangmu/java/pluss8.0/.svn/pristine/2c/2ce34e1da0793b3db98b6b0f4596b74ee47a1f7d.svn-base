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

@TableName("tb_jiangyukeji_ins_donate_record")
@Data
public class InsDonateRecord implements Serializable, Cloneable {

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

    /***** 捐赠单号 ***/
    @TableField(value = "donate_code")
    private String donateCode;

    /***** 捐赠方名称 ***/
    @TableField(value = "donate_name")
    private String donateName;

    /***** 捐赠时间 ***/
    @TableField(value = "donate_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date donateTime;

    /***** 捐赠类型(数据字典(ins_donor_type)) ***/
    @TableField(value = "donate_type")
    private String donateType;

    /***** 接收人 ***/
    @TableField(value = "recipient_name")
    private String recipientName;

    /***** 捐赠去向(数据字典(ins_donate_destinate)) ***/
    @TableField(value = "donate_destinate")
    private String donateDestinate;

    /***** 开具捐赠发票或证明(1捐赠证明 ***/
    @TableField(value = "donate_certificate")
    private Integer donateCertificate;

    /***** 赠送荣誉牌或锦旗(1荣誉牌 ***/
    @TableField(value = "back_honor")
    private Integer backHonor;

    /***** 捐赠者留言 ***/
    @TableField(value = "donor_words")
    private String donorWords;

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


