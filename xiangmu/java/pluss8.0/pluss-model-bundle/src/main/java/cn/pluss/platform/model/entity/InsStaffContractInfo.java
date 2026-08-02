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

@TableName("tb_jiangyukeji_ins_staff_contract_info")
@Data
public class InsStaffContractInfo implements Serializable, Cloneable {

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

    /***** 人员id ***/
    @TableField(value = "staff_id")
    private Long staffId;

    /***** 人员名称 ***/
    @TableField(value = "staff_name")
    private String staffName;

    /***** 性別(1男2女) ***/
    @TableField(value = "sex")
    private String sex;

    /***** 身份证号码 ***/
    @TableField(value = "id_card")
    private String idCard;

    /***** 合同编号 ***/
    @TableField(value = "contract_code")
    private String contractCode;

    /***** 合同签订时间 ***/
    @TableField(value = "sign_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date signTime;

    /***** 合同开始日期 ***/
    @TableField(value = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /***** 合同结束日期 ***/
    @TableField(value = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /***** 合同说明 ***/
    @TableField(value = "contract_desp")
    private String contractDesp;

    /***** 甲方名称 ***/
    @TableField(value = "party_name_a")
    private String partyNameA;

    /***** 甲方联系电话 ***/
    @TableField(value = "link_tel_a")
    private String linkTelA;

    /***** 甲方地址 ***/
    @TableField(value = "address_a")
    private String addressA;

    /***** 乙方名称 ***/
    @TableField(value = "party_name_b")
    private String partyNameB;

    /***** 乙方联系电话 ***/
    @TableField(value = "link_tel_b")
    private String linkTelB;

    /***** 乙方地址 ***/
    @TableField(value = "address_b")
    private String addressB;

    /***** 合同附件(多个逗号分隔) ***/
    @TableField(value = "contract_path")
    private String contractPath;

    /***** 合同状态(1待签订 ***/
    @TableField(value = "contract_state")
    private Integer contractState;

    /***** 行政区划编码 ***/
    @TableField(value = "area_code")
    private String areaCode;

    /***** 行政区划名称 ***/
    @TableField(value = "area_name")
    private String areaName;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人id ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人名称 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门id ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 创建时间 ***/
    @TableField(value = "create_time")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

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

    /***** 是否启用(1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


