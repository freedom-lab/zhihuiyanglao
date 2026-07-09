package cn.pluss.platform.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("tb_jiangyukeji_blade_dict")
@Data
public class BladeDict implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 父主键 ***/
    @TableField(value = "parent_id")
    private Long parentId;

    /***** 字典码 ***/
    @TableField(value = "code")
    private String code;

    /***** 字典值 ***/
    @TableField(value = "dict_key")
    private String dictKey;

    /***** 字典名称 ***/
    @TableField(value = "dict_value")
    private String dictValue;

    /***** 排序 ***/
    @TableField(value = "sort")
    private Integer sort;

    /***** 字典备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 是否已封存 ***/
    @TableField(value = "is_sealed")
    private Integer isSealed;

    /***** 是否已删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;


}


