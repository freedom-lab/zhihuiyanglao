package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenFoodCategory;
import cn.pluss.platform.service.insCanteenFoodCategory.InsCanteenFoodCategoryService;
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
@RequestMapping("/insCanteenFoodCategory")
@Api(value = "InsCanteenFoodCategory控制类",tags={"InsCanteenFoodCategory接口"})
public class InsCanteenFoodCategoryController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenFoodCategoryService insCanteenFoodCategoryService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenFoodCategory>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsCanteenFoodCategory> insCanteenFoodCategoryList = insCanteenFoodCategoryService.queryPage(map);
        Integer count= insCanteenFoodCategoryService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenFoodCategory>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenFoodCategoryList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodCategory
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenFoodCategory>> queryList(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        List<InsCanteenFoodCategory> insCanteenFoodCategoryList = insCanteenFoodCategoryService.queryList(insCanteenFoodCategory);
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenFoodCategory 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenFoodCategory> queryOne(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryService.queryOne(insCanteenFoodCategory));
    }

    /**
    * 保存数据
    * @param insCanteenFoodCategory
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        //Date currentDt = new Date();
        if (insCanteenFoodCategory.getId() != null && insCanteenFoodCategory.getId().longValue() > 0) {
            //insCanteenFoodCategory.setUpdatedDt(currentDt);
            insCanteenFoodCategoryService.update(insCanteenFoodCategory);
        } else {
            //insCanteenFoodCategory.setCreatedDt(currentDt);
            //insCanteenFoodCategory.setUpdatedDt(currentDt);
            insCanteenFoodCategoryService.insert(insCanteenFoodCategory);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenFoodCategory> add(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        //Date currentDt = new Date();
        //insCanteenFoodCategory.setCreatedDt(currentDt);
        //insCanteenFoodCategory.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryService.insert(insCanteenFoodCategory));
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodCategory 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenFoodCategory> update(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryService.update(insCanteenFoodCategory));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenFoodCategory 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenFoodCategory insCanteenFoodCategory) {
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryService.deleteById(insCanteenFoodCategory.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenFoodCategory> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenFoodCategoryService.saveInsCanteenFoodCategoryBatch(insertList));
    }

}


