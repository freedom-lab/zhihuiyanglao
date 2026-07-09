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

@TableName("tb_jiangyukeji_ins_canteen_food_info")
@Data
public class InsCanteenFoodInfo implements Serializable, Cloneable {

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

    /***** 餐品大类id ***/
    @TableField(value = "type_id")
    private Long typeId;

    /***** 餐品大类名称 ***/
    @TableField(value = "type_name")
    private String typeName;

    /***** 餐品类型（1单品 ***/
    @TableField(value = "is_package")
    private Integer isPackage;

    /***** 餐品名称 ***/
    @TableField(value = "food_name")
    private String foodName;

    /***** 餐品单价(元) ***/
    @TableField(value = "food_price")
    private Double foodPrice;

    /***** 餐品单位 ***/
    @TableField(value = "food_unit")
    private String foodUnit;

    /***** 餐品口味（数据字典多选(food_tastee)） ***/
    @TableField(value = "food_taste")
    private String foodTaste;

    /***** 禁忌人群（数据字典多选(food_avoid)） ***/
    @TableField(value = "food_avoid")
    private String foodAvoid;

    /***** 辣味级别（0不辣1微辣2中辣3特辣） ***/
    @TableField(value = "pungency_degree")
    private Integer pungencyDegree;

    /***** 营养说明 ***/
    @TableField(value = "nutrition_desp")
    private String nutritionDesp;

    /***** 食材说明 ***/
    @TableField(value = "ingredient_desp")
    private String ingredientDesp;

    /***** 餐品简图 ***/
    @TableField(value = "food_img")
    private String foodImg;

    /***** 套餐说明(餐品类型是套餐填写) ***/
    @TableField(value = "package_desp")
    private String packageDesp;

    /***** 菜品类型（数据字典(ins_recipe_type)） ***/
    @TableField(value = "recipe_type")
    private String recipeType;

    /***** 适用餐次（数据字典(ins_meal_time_type)） ***/
    @TableField(value = "meal_time_type")
    private String mealTimeType;

    /***** 烹饪方式（数据字典(ins_cooking_method)） ***/
    @TableField(value = "cooking_method")
    private String cookingMethod;

    /***** 每份成品重量（克） ***/
    @TableField(value = "portion_weight")
    private Double portionWeight;

    /***** 份量描述（如：1碗，约200g） ***/
    @TableField(value = "serving_size")
    private String servingSize;

    /***** 总热量（千卡/份） ***/
    @TableField(value = "total_calorie")
    private Double totalCalorie;

    /***** 总蛋白质（克/份） ***/
    @TableField(value = "total_protein")
    private Double totalProtein;

    /***** 总脂肪（克/份） ***/
    @TableField(value = "total_fat")
    private Double totalFat;

    /***** 总碳水化合物（克/份） ***/
    @TableField(value = "total_carbohydrate")
    private Double totalCarbohydrate;

    /***** 总膳食纤维（克/份） ***/
    @TableField(value = "total_dietary_fiber")
    private Double totalDietaryFiber;

    /***** 总钠（毫克/份） ***/
    @TableField(value = "total_sodium")
    private Double totalSodium;

    /***** 总钾（毫克/份） ***/
    @TableField(value = "total_potassium")
    private Double totalPotassium;

    /***** 总钙（毫克/份） ***/
    @TableField(value = "total_calcium")
    private Double totalCalcium;

    /***** 总镁（毫克/份） ***/
    @TableField(value = "total_magnesium")
    private Double totalMagnesium;

    /***** 总磷（毫克/份） ***/
    @TableField(value = "total_phosphorus")
    private Double totalPhosphorus;

    /***** 总铁（毫克/份） ***/
    @TableField(value = "total_iron")
    private Double totalIron;

    /***** 总嘌呤（毫克/份） ***/
    @TableField(value = "total_purine")
    private Double totalPurine;

    /***** 是否高嘌呤食谱：0否 ***/
    @TableField(value = "is_high_purine")
    private Integer isHighPurine;

    /***** 是否高糖食谱：0否 ***/
    @TableField(value = "is_high_sugar")
    private Integer isHighSugar;

    /***** 是否高脂食谱：0否 ***/
    @TableField(value = "is_high_fat")
    private Integer isHighFat;

    /***** 禁忌与过敏原说明 ***/
    @TableField(value = "taboo_explain")
    private String tabooExplain;

    /***** 餐品简介 ***/
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

    /***** 是否已删除(0未删除 ***/
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /***** 上架状态(0下架1上架) ***/
    @TableField(value = "status")
    private Integer status;


}


