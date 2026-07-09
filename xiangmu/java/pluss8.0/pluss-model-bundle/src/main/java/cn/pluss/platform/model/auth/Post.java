package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("tb_yunlankeji_post")
public class Post {

    @TableId
    private Integer id;
    private String postCode;
    private String postName;
    private String description;
    private Integer seq;
    private String postTypeCode;
    private String postTypeName;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    private String creator;
    private String updator;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    @TableField("tenant_id")
    private String tenantId;
    @TableField("corp_id")
    private Long corpId;
    @TableField("corp_name")
    private String corpName;
    @TableField("institution_id")
    private Long institutionId;
    @TableField("institution_name")
    private String institutionName;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
         this.id = id;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
         this.postCode = postCode;
    }
    public String getPostName() {
        return postName;
    }
    public void setPostName(String postName) {
         this.postName = postName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
         this.description = description;
    }
    public Integer getSeq() {
        return seq;
    }
    public void setSeq(Integer seq) {
         this.seq = seq;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
         this.creator = creator;
    }
    public String getUpdator() {
        return updator;
    }
    public void setUpdator(String updator) {
         this.updator = updator;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
         this.updateTime = updateTime;
    }
	public String getPostTypeCode() {
		return postTypeCode;
	}
	public void setPostTypeCode(String postTypeCode) {
		this.postTypeCode = postTypeCode;
	}
	public String getPostTypeName() {
		return postTypeName;
	}
	public void setPostTypeName(String postTypeName) {
		this.postTypeName = postTypeName;
	}
    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public Long getCorpId() {
        return corpId;
    }
    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }
    public String getCorpName() {
        return corpName;
    }
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }
    public Long getInstitutionId() {
        return institutionId;
    }
    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
    }
    public String getInstitutionName() {
        return institutionName;
    }
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

}

