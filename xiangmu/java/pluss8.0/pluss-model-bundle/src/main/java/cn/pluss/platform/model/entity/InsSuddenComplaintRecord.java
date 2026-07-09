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

@TableName("tb_jiangyukeji_ins_sudden_complaint_record")
@Data
public class InsSuddenComplaintRecord implements Serializable, Cloneable {

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

    /***** 投诉类型(数据字典(ins_complaint_type)) ***/
    @TableField(value = "complaint_type")
    private String complaintType;

    /***** 投诉人 ***/
    @TableField(value = "complaint_name")
    private String complaintName;

    /***** 联系方式 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 投诉时间 ***/
    @TableField(value = "complaint_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date complaintTime;

    /***** 投诉内容 ***/
    @TableField(value = "complaint_content")
    private String complaintContent;

    /***** 处理状态(1未处理 ***/
    @TableField(value = "handle_state")
    private Integer handleState;

    /***** 处理人id ***/
    @TableField(value = "handle_id")
    private Long handleId;

    /***** 处理人 ***/
    @TableField(value = "handle_name")
    private String handleName;

    /***** 处理结果 ***/
    @TableField(value = "handle_results")
    private String handleResults;

    /***** 处理时间 ***/
    @TableField(value = "handle_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date handleTime;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 附件路径(多个逗号分隔) ***/
    @TableField(value = "file_path")
    private String filePath;

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


