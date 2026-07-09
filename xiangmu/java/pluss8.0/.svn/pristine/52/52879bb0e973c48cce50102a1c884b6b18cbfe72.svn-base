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

@TableName("tb_jiangyukeji_health_disease_encyclopedia")
@Data
public class HealthDiseaseEncyclopedia implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
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

    /***** 标题 ***/
    @TableField(value = "title")
    private String title;

    /***** 慢病id ***/
    @TableField(value = "disease_id")
    private Long diseaseId;

    /***** 慢病名称 ***/
    @TableField(value = "disease_name")
    private String diseaseName;

    /***** 内容类型(数据字典(ins_content_type)) ***/
    @TableField(value = "content_type")
    private String contentType;

    /***** 来源(如:国家卫健委) ***/
    @TableField(value = "source")
    private String source;

    /***** 正文内容(富文本) ***/
    @TableField(value = "content")
    private String content;

    /***** 封面图片路径 ***/
    @TableField(value = "cover_image")
    private String coverImage;

    /***** 视频链接 ***/
    @TableField(value = "video_url")
    private String videoUrl;

    /***** 发布时间 ***/
    @TableField(value = "publish_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    /***** 浏览量 ***/
    @TableField(value = "view_count")
    private Integer viewCount;

    /***** 收藏量 ***/
    @TableField(value = "collect_count")
    private Integer collectCount;

    /***** 是否推荐(0否 ***/
    @TableField(value = "is_recommend")
    private Integer isRecommend;

    /***** 内容状态(0草稿 ***/
    @TableField(value = "content_status")
    private Integer contentStatus;

    /***** 审核状态(1未审核 ***/
    @TableField(value = "audit_state")
    private Integer auditState;

    /***** 审核人ID ***/
    @TableField(value = "audit_id")
    private Long auditId;

    /***** 审核人姓名 ***/
    @TableField(value = "audit_name")
    private String auditName;

    /***** 审核时间 ***/
    @TableField(value = "audit_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /***** 审核意见 ***/
    @TableField(value = "audit_memo")
    private String auditMemo;

    /***** 关键词(逗号分隔) ***/
    @TableField(value = "keywords")
    private String keywords;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人ID ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人姓名 ***/
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

    /***** 修改人ID ***/
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

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


