package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@TableName("tb_yunlankeji_organ")
public class Organ {

    @TableId
    private Integer id;
    private String organCode;
    private String organName;
    private String organAlias;
    private String organType;
    private Integer seq;
    private String description;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    private String creator;
    private String updator;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    private String parentCode;
    private String userCode;
    private String userName;
    private String executeUserName;
    private String organLevel;
    private String organGroup;
    private String status;
    private List<Organ> childrens;
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
    public String getOrganCode() {
        return organCode;
    }
    public void setOrganCode(String organCode) {
         this.organCode = organCode;
    }
    public String getOrganName() {
        return organName;
    }
    public void setOrganName(String organName) {
         this.organName = organName;
    }
    public String getOrganAlias() {
        return organAlias;
    }
    public void setOrganAlias(String organAlias) {
         this.organAlias = organAlias;
    }
    public String getOrganType() {
        return organType;
    }
    public void setOrganType(String organType) {
         this.organType = organType;
    }
    public Integer getSeq() {
        return seq;
    }
    public void setSeq(Integer seq) {
         this.seq = seq;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
         this.description = description;
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
    public String getParentCode() {
        return parentCode;
    }
    public void setParentCode(String parentCode) {
         this.parentCode = parentCode;
    }
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
         this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
         this.userName = userName;
    }
    public String getExecuteUserName() {
        return executeUserName;
    }
    public void setExecuteUserName(String executeUserName) {
         this.executeUserName = executeUserName;
    }
    public String getOrganLevel() {
        return organLevel;
    }
    public void setOrganLevel(String organLevel) {
         this.organLevel = organLevel;
    }
    public String getOrganGroup() {
        return organGroup;
    }
    public void setOrganGroup(String organGroup) {
         this.organGroup = organGroup;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
         this.status = status;
    }
	public List<Organ> getChildrens() {
		return childrens;
	}
	public void setChildrens(List<Organ> childrens) {
		this.childrens = childrens;
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

