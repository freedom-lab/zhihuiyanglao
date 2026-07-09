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

@TableName("tb_jiangyukeji_ins_office_news_info")
@Data
public class InsOfficeNewsInfo implements Serializable, Cloneable {

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

    /***** 新闻标题 ***/
    @TableField(value = "news_title")
    private String newsTitle;

    /***** 新闻摘要 ***/
    @TableField(value = "news_summary")
    private String newsSummary;

    /***** 新闻图片 ***/
    @TableField(value = "news_img")
    private String newsImg;

    /***** 新闻内容（富文本） ***/
    @TableField(value = "content")
    private String content;

    /***** 新闻类型（1图片新闻、2热点动态） ***/
    @TableField(value = "news_type")
    private Integer newsType;

    /***** 新闻小类（预留） ***/
    @TableField(value = "sub_type")
    private Integer subType;

    /***** 是否置顶（0否1是） ***/
    @TableField(value = "is_top")
    private Integer isTop;

    /***** 是否热门（0否1是） ***/
    @TableField(value = "is_hot")
    private Integer isHot;

    /***** 文章来源 ***/
    @TableField(value = "news_source")
    private String newsSource;

    /***** 附件 ***/
    @TableField(value = "attachment")
    private String attachment;

    /***** 发文字号 ***/
    @TableField(value = "publish_number")
    private String publishNumber;

    /***** 浏览数量 ***/
    @TableField(value = "click_number")
    private Integer clickNumber;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

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

    /***** 业务状态（0：未启用；1：启用） ***/
    @TableField(value = "status")
    private Integer status;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /***** 创建人姓名 ***/
    @TableField(value = "create_name")
    private String createName;


}


