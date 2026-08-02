package cn.pluss.platform.model.auth;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName("tb_yunlankeji_menu_info")
public class MenuInfo {

    @TableId
    private Integer id;
    private String name;
    private Integer menuType;
    private String link;
    private Integer menuOrder;
    private String iconUrl;
    private String activeIconUrl;
    private Integer visible;
    private String creator;
    private String description;
    private Integer seq;
    private String menuCode;
    private String parentCode;
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
    
    private List<MenuInfo> childrens;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
         this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public Integer getMenuType() {
        return menuType;
    }
    public void setMenuType(Integer menuType) {
         this.menuType = menuType;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
         this.link = link;
    }
    public Integer getMenuOrder() {
        return menuOrder;
    }
    public void setMenuOrder(Integer menuOrder) {
         this.menuOrder = menuOrder;
    }
    public String getIconUrl() {
        return iconUrl;
    }
    public void setIconUrl(String iconUrl) {
         this.iconUrl = iconUrl;
    }
    public Integer getVisible() {
        return visible;
    }
    public void setVisible(Integer visible) {
         this.visible = visible;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
         this.creator = creator;
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
    public String getMenuCode() {
        return menuCode;
    }
    public void setMenuCode(String menuCode) {
         this.menuCode = menuCode;
    }
    public String getParentCode() {
        return parentCode;
    }
    public void setParentCode(String parentCode) {
         this.parentCode = parentCode;
    }
	public List<MenuInfo> getChildrens() {
		return childrens;
	}
	public void setChildrens(List<MenuInfo> childrens) {
		this.childrens = childrens;
	}

    public String getActiveIconUrl() {
        return activeIconUrl;
    }
    public void setActiveIconUrl(String activeIconUrl) {
        this.activeIconUrl = activeIconUrl;
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

