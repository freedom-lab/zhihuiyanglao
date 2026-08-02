package cn.pluss.platform.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("tb_yunlankeji_login_log")
public class LoginLog {

     @TableId
     private  Integer id;
     private String loginName;
     private String trueName;
     @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
     private Date createDt;
     private String mac;
     private String ip;
     private String city;
     private String browser;
     private String os;
     private String remark;
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
    public  String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
     this.loginName = loginName;
    }
    public  String getTrueName() {
        return trueName;
    }
    public void setTrueName(String trueName) {
     this.trueName = trueName;
    }
    public  Date getCreateDt() {
        return createDt;
    }
    public void setCreateDt(Date createDt) {
     this.createDt = createDt;
    }
    public  String getMac() {
        return mac;
    }
    public void setMac(String mac) {
     this.mac = mac;
    }
    public  String getIp() {
        return ip;
    }
    public void setIp(String ip) {
     this.ip = ip;
    }
    public  String getCity() {
        return city;
    }
    public void setCity(String city) {
     this.city = city;
    }
    public  String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
     this.browser = browser;
    }
    public  String getOs() {
        return os;
    }
    public void setOs(String os) {
     this.os = os;
    }
    public  String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
     this.remark = remark;
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


