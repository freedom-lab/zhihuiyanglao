package cn.pluss.platform.model.vo;

import lombok.Data;

/**
 * 血糖检测统计VO
 */
@Data
public class SugarDetectionVo {
    //血糖测量总数
    private Integer bloodSugarCount;
    //正常血糖统计
    private Integer normalBloodSugar;
    //正常血糖比例
    private String normalBloodSugarProportion;
    //偏高血糖
    private Integer highBloodSugar;
    //偏高血糖比例
    private String highBloodSugarProportion;
    //偏低血糖
    private Integer lowBloodSugar;
    //偏低血糖比例
    private String lowBloodSugarProportion;
}
