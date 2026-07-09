package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenFoodTabooRel;
import cn.pluss.platform.service.insCanteenFoodTabooRel.InsCanteenFoodTabooRelService;
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
@RequestMapping("/insCanteenFoodTabooRel")
@Api(value = "InsCanteenFoodTabooRel控制类",tags={"InsCanteenFoodTabooRel接口"})
public class InsCanteenFoodTabooRelController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenFoodTabooRelService insCanteenFoodTabooRelService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenFoodTabooRel>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsCanteenFoodTabooRel> insCanteenFoodTabooRelList = insCanteenFoodTabooRelService.queryPage(map);
        Integer count= insCanteenFoodTabooRelService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenFoodTabooRel>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenFoodTabooRelList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenFoodTabooRel
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenFoodTabooRel>> queryList(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        List<InsCanteenFoodTabooRel> insCanteenFoodTabooRelList = insCanteenFoodTabooRelService.queryList(insCanteenFoodTabooRel);
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenFoodTabooRel 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenFoodTabooRel> queryOne(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelService.queryOne(insCanteenFoodTabooRel));
    }

    /**
    * 保存数据
    * @param insCanteenFoodTabooRel
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        //Date currentDt = new Date();
        if (insCanteenFoodTabooRel.getId() != null && insCanteenFoodTabooRel.getId().longValue() > 0) {
            //insCanteenFoodTabooRel.setUpdatedDt(currentDt);
            insCanteenFoodTabooRelService.update(insCanteenFoodTabooRel);
        } else {
            //insCanteenFoodTabooRel.setCreatedDt(currentDt);
            //insCanteenFoodTabooRel.setUpdatedDt(currentDt);
            insCanteenFoodTabooRelService.insert(insCanteenFoodTabooRel);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenFoodTabooRel> add(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        //Date currentDt = new Date();
        //insCanteenFoodTabooRel.setCreatedDt(currentDt);
        //insCanteenFoodTabooRel.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelService.insert(insCanteenFoodTabooRel));
    }

    /**
    * 更新数据
    *
    * @param insCanteenFoodTabooRel 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenFoodTabooRel> update(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelService.update(insCanteenFoodTabooRel));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenFoodTabooRel 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenFoodTabooRel insCanteenFoodTabooRel) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelService.deleteById(insCanteenFoodTabooRel.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenFoodTabooRel> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenFoodTabooRelService.saveInsCanteenFoodTabooRelBatch(insertList));
    }

}


