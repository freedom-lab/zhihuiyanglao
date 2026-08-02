package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsExpensesElderCostStandard;
import cn.pluss.platform.service.insExpensesElderCostStandard.InsExpensesElderCostStandardService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/insExpensesElderCostStandard")
@Api(value = "InsExpensesElderCostStandard控制类",tags={"InsExpensesElderCostStandard接口"})
public class InsExpensesElderCostStandardController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsExpensesElderCostStandardService insExpensesElderCostStandardService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsExpensesElderCostStandard>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsExpensesElderCostStandard> insExpensesElderCostStandardList = insExpensesElderCostStandardService.queryPage(map);
        Integer count= insExpensesElderCostStandardService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsExpensesElderCostStandard>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insExpensesElderCostStandardList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insExpensesElderCostStandard
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsExpensesElderCostStandard>> queryList(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        List<InsExpensesElderCostStandard> insExpensesElderCostStandardList = insExpensesElderCostStandardService.queryList(insExpensesElderCostStandard);
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insExpensesElderCostStandard 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsExpensesElderCostStandard> queryOne(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardService.queryOne(insExpensesElderCostStandard));
    }

    /**
    * 保存数据
    * @param insExpensesElderCostStandard
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        //Date currentDt = new Date();
        if (insExpensesElderCostStandard.getId() != null && insExpensesElderCostStandard.getId().longValue() > 0) {
            //insExpensesElderCostStandard.setUpdatedDt(currentDt);
            insExpensesElderCostStandardService.update(insExpensesElderCostStandard);
        } else {
            //insExpensesElderCostStandard.setCreatedDt(currentDt);
            //insExpensesElderCostStandard.setUpdatedDt(currentDt);
            insExpensesElderCostStandardService.insert(insExpensesElderCostStandard);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsExpensesElderCostStandard> add(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        //Date currentDt = new Date();
        //insExpensesElderCostStandard.setCreatedDt(currentDt);
        //insExpensesElderCostStandard.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardService.insert(insExpensesElderCostStandard));
    }

    /**
    * 更新数据
    *
    * @param insExpensesElderCostStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsExpensesElderCostStandard> update(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardService.update(insExpensesElderCostStandard));
    }

    /**
    * 通过主键删除数据
    *
    * @param insExpensesElderCostStandard 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsExpensesElderCostStandard insExpensesElderCostStandard) {
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardService.deleteById(insExpensesElderCostStandard.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsExpensesElderCostStandard> insertList) {
        return ResultGenerator.genSuccessResult(insExpensesElderCostStandardService.saveInsExpensesElderCostStandardBatch(insertList));
    }

}


