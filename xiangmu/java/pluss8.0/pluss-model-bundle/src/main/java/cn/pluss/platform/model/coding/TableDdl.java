package cn.pluss.platform.model.coding;

import  java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class TableDdl {

     private  Integer id;
     private String tableCode;
     private String tableName;
     private String ddl;
     @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
     private Date createDt;
     private String status;

    public TableDdl() {
    }

    public TableDdl(String tableCode, String tableName, String ddl, Date createDt, String status) {
        this.tableCode = tableCode;
        this.tableName = tableName;
        this.ddl = ddl;
        this.createDt = createDt;
        this.status = status;
    }

    public  Integer getId() {
        return id;
    }
    public void setId(Integer id) {
     this.id = id;
    }
    public  String getTableCode() {
        return tableCode;
    }
    public void setTableCode(String tableCode) {
     this.tableCode = tableCode;
    }
    public  String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
     this.tableName = tableName;
    }
    public  String getDdl() {
        return ddl;
    }
    public void setDdl(String ddl) {
     this.ddl = ddl;
    }
    public  Date getCreateDt() {
        return createDt;
    }
    public void setCreateDt(Date createDt) {
     this.createDt = createDt;
    }
    public  String getStatus() {
        return status;
    }
    public void setStatus(String status) {
     this.status = status;
    }
}


