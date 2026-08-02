package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenFoodType;
import cn.pluss.platform.service.insCanteenFoodType.InsCanteenFoodTypeService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/insCanteenFoodType")
@Api(value = "InsCanteenFoodType控制类",tags={"InsCanteenFoodType接口"})
public class InsCanteenFoodTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenFoodTypeService insCanteenFoodTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenFoodType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
        if(pageQueryInfo.getCondition() != null){
            map.putAll(pageQueryInfo.getCondition());
        }
        List<InsCanteenFoodType> insCanteenFoodTypeList = insCanteenFoodTypeService.queryPage(map);
        Integer count= insCanteenFoodTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenFoodType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenFoodTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenFoodType>> queryList(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        List<InsCanteenFoodType> insCanteenFoodTypeList = insCanteenFoodTypeService.queryList(insCanteenFoodType);
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenFoodType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenFoodType> queryOne(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeService.queryOne(insCanteenFoodType));
    }

    /**
    * 保存数据
    * @param insCanteenFoodType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        //Date currentDt = new Date();
        if (insCanteenFoodType.getId() != null && insCanteenFoodType.getId().longValue() > 0) {
            //insCanteenFoodType.setUpdatedDt(currentDt);
            insCanteenFoodTypeService.update(insCanteenFoodType);
        } else {
            //insCanteenFoodType.setCreatedDt(currentDt);
            //insCanteenFoodType.setUpdatedDt(currentDt);
            insCanteenFoodTypeService.insert(insCanteenFoodType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenFoodType> add(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        //Date currentDt = new Date();
        //insCanteenFoodType.setCreatedDt(currentDt);
        //insCanteenFoodType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeService.insert(insCanteenFoodType));
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenFoodType> update(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeService.update(insCanteenFoodType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenFoodType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenFoodType insCanteenFoodType) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeService.deleteById(insCanteenFoodType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenFoodType> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTypeService.saveInsCanteenFoodTypeBatch(insertList));
    }

}


