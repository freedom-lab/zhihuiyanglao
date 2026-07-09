package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import  java.util.Date;

@TableName("tb_yunlankeji_system_config")
public class SystemConfig {

    @TableId
    private  Integer id;
    private  String propertyKey;
    private  String propertyValue;
    private  String propertyDesc;
    private  Integer propertyIndex;
    private  String systemId;
    private  String adress;
    private  Date createDt;
    private  String wechat;
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

    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
     this.id = id;
    }
    public  String getPropertyKey() {
        return propertyKey;
    }
    public void setPropertyKey(String propertyKey) {
     this.propertyKey = propertyKey;
    }
    public  String getPropertyValue() {
        return propertyValue;
    }
    public void setPropertyValue(String propertyValue) {
     this.propertyValue = propertyValue;
    }
    public  String getPropertyDesc() {
        return propertyDesc;
    }
    public void setPropertyDesc(String propertyDesc) {
     this.propertyDesc = propertyDesc;
    }
    public  Integer getPropertyIndex() {
        return propertyIndex;
    }
    public void setPropertyIndex(Integer propertyIndex) {
     this.propertyIndex = propertyIndex;
    }
    public  String getSystemId() {
        return systemId;
    }
    public void setSystemId(String systemId) {
     this.systemId = systemId;
    }
    public  String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
     this.adress = adress;
    }
    public  Date getCreateDt() {
        return createDt;
    }
    public void setCreateDt(Date createDt) {
     this.createDt = createDt;
    }
    public  String getWechat() {
        return wechat;
    }
    public void setWechat(String wechat) {
     this.wechat = wechat;
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


