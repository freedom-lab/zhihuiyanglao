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

@TableName("tb_jiangyukeji_ins_train_release")
@Data
public class InsTrainRelease implements Serializable, Cloneable {

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

    /***** 培训名称 ***/
    @TableField(value = "release_name")
    private String releaseName;

    /***** 类别id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 类别名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 培训信息id ***/
    @TableField(value = "train_id")
    private Long trainId;

    /***** 培训主题 ***/
    @TableField(value = "train_name")
    private String trainName;

    /***** 培训开始时间 ***/
    @TableField(value = "train_start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date trainStartTime;

    /***** 培训结束时间 ***/
    @TableField(value = "train_end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date trainEndTime;

    /***** 主讲人 ***/
    @TableField(value = "speaker_name")
    private String speakerName;

    /***** 培训内容 ***/
    @TableField(value = "train_content")
    private String trainContent;

    /***** 培训地点 ***/
    @TableField(value = "train_location")
    private String trainLocation;

    /***** 联系人 ***/
    @TableField(value = "link_name")
    private String linkName;

    /***** 联系电话 ***/
    @TableField(value = "link_tel")
    private String linkTel;

    /***** 培训状态(1未开始 ***/
    @TableField(value = "train_state")
    private Integer trainState;

    /***** 记录人 ***/
    @TableField(value = "record_name")
    private String recordName;

    /***** 培训总结 ***/
    @TableField(value = "train_conclusion")
    private String trainConclusion;

    /***** 培训图片附件路径 ***/
    @TableField(value = "train_path")
    private String trainPath;

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


