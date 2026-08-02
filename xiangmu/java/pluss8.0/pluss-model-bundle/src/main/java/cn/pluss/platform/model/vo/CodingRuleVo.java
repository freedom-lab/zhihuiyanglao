package cn.pluss.platform.model.vo;

import cn.pluss.platform.model.coding.Connection;
import cn.pluss.platform.model.coding.Table;

import java.util.List;

public class CodingRuleVo {

    private String packageName;

    private String springbootDir;

    private String vueDir;
    //all:全量 select：增量
    private String codingType;

    private  String tableNames;

    private String webStyle;

    private Connection con;

    private List<Table> selectRowList;

    public List<Table> getSelectRowList() {
        return selectRowList;
    }

    public void setSelectRowList(List<Table> selectRowList) {
        this.selectRowList = selectRowList;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getSpringbootDir() {
        return springbootDir;
    }

    public void setSpringbootDir(String springbootDir) {
        this.springbootDir = springbootDir;
    }

    public String getVueDir() {
        return vueDir;
    }

    public void setVueDir(String vueDir) {
        this.vueDir = vueDir;
    }

    public String getCodingType() {
        return codingType;
    }

    public void setCodingType(String codingType) {
        this.codingType = codingType;
    }

    public String getTableNames() {
        return tableNames;
    }

    public void setTableNames(String tableNames) {
        this.tableNames = tableNames;
    }

    public String getWebStyle() {
        return webStyle;
    }

    public void setWebStyle(String webStyle) {
        this.webStyle = webStyle;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
