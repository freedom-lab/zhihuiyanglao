package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("tb_yunlankeji_role_info")
public class RoleInfo {

    @TableId
    private Integer id;
    private String roleCode;
    private String name;
    private String creator;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
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
    public String getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(String roleCode) {
         this.roleCode = roleCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
         this.creator = creator;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
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

