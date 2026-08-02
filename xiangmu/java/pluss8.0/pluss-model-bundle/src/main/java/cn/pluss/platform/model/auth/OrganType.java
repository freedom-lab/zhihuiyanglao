package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("tb_yunlankeji_organ_type")
public class OrganType {

    @TableId
    private Integer id;
    private String organTypeCode;
    private String organTypeName;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createDt;
    private String description;
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
    public String getOrganTypeCode() {
        return organTypeCode;
    }
    public void setOrganTypeCode(String organTypeCode) {
         this.organTypeCode = organTypeCode;
    }
    public String getOrganTypeName() {
        return organTypeName;
    }
    public void setOrganTypeName(String organTypeName) {
         this.organTypeName = organTypeName;
    }
    public Date getCreateDt() {
        return createDt;
    }
    public void setCreateDt(Date createDt) {
         this.createDt = createDt;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
         this.description = description;
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

