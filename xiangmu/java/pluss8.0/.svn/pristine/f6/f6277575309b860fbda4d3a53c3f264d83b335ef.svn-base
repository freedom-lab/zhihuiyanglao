package cn.pluss.platform.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("tb_jiangyukeji_ins_canteen_food_material")
@Data
public class InsCanteenFoodMaterial implements Serializable, Cloneable {

    /***** 主键 ***/
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /***** 租户ID ***/
    @TableField(value = "tenant_id")
    private String tenantId;

    /***** 食材名称 ***/
    @TableField(value = "material_name")
    private String materialName;

    /***** 拼音首字母码，用于快速检索 ***/
    @TableField(value = "pinyin_code")
    private String pinyinCode;

    /***** 食材分类ID（关联diet_food_category） ***/
    @TableField(value = "cate_id")
    private Long cateId;

    /***** 计量单位（g或ml） ***/
    @TableField(value = "unit")
    private String unit;

    /***** 参考份量（克或其他单位），营养成分基于此份量 ***/
    @TableField(value = "reference_amount")
    private Double referenceAmount;

    /***** 热量（千卡） ***/
    @TableField(value = "calorie")
    private Double calorie;

    /***** 蛋白质（克） ***/
    @TableField(value = "protein")
    private Double protein;

    /***** 脂肪（克） ***/
    @TableField(value = "fat")
    private Double fat;

    /***** 碳水化合物（克） ***/
    @TableField(value = "carbohydrate")
    private Double carbohydrate;

    /***** 膳食纤维（克） ***/
    @TableField(value = "dietary_fiber")
    private Double dietaryFiber;

    /***** 钠（mg） ***/
    @TableField(value = "sodium")
    private Double sodium;

    /***** 钾（mg） ***/
    @TableField(value = "potassium")
    private Double potassium;

    /***** 钙（mg） ***/
    @TableField(value = "calcium")
    private Double calcium;

    /***** 磷（mg） ***/
    @TableField(value = "phosphorus")
    private Double phosphorus;

    /***** 镁（mg） ***/
    @TableField(value = "magnesium")
    private Double magnesium;

    /***** 铁（mg） ***/
    @TableField(value = "iron")
    private Double iron;

    /***** 嘌呤含量（mg/100g） ***/
    @TableField(value = "purine")
    private Double purine;

    /***** 升糖指数GI值（0表示未知，1低GI≤55，2中GI56-69，3高GI≥70） ***/
    @TableField(value = "gi_value")
    private Integer giValue;

    /***** 是否高嘌呤食材：0否 ***/
    @TableField(value = "is_high_purine")
    private Integer isHighPurine;

    /***** 是否高糖食材：0否 ***/
    @TableField(value = "is_high_sugar")
    private Integer isHighSugar;

    /***** 可食部比例（%），默认100 ***/
    @TableField(value = "edible_part_rate")
    private Double ediblePartRate;

    /***** 食材描述/注意事项 ***/
    @TableField(value = "description")
    private String description;

    /***** 备注 ***/
    @TableField(value = "remark")
    private String remark;

    /***** 创建人ID ***/
    @TableField(value = "create_user")
    private Long createUser;

    /***** 创建人名称 ***/
    @TableField(value = "create_name")
    private String createName;

    /***** 创建部门ID ***/
    @TableField(value = "create_dept")
    private Long createDept;

    /***** 修改人ID ***/
    @TableField(value = "update_user")
    private Long updateUser;

    /***** 是否删除：0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 是否启用：1启用 ***/
    @TableField(value = "status")
    private Integer status;


}


