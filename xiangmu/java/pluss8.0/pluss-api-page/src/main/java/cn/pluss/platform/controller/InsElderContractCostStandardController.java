package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderContractCostStandard;
import cn.pluss.platform.service.insElderContractCostStandard.InsElderContractCostStandardService;
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
@RequestMapping("/insElderContractCostStandard")
@Api(value = "InsElderContractCostStandard控制类",tags={"InsElderContractCostStandard接口"})
public class InsElderContractCostStandardController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderContractCostStandardService insElderContractCostStandardService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderContractCostStandard>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderContractCostStandard> insElderContractCostStandardList = insElderContractCostStandardService.queryPage(map);
        Integer count= insElderContractCostStandardService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderContractCostStandard>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderContractCostStandardList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractCostStandard
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderContractCostStandard>> queryList(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        List<InsElderContractCostStandard> insElderContractCostStandardList = insElderContractCostStandardService.queryList(insElderContractCostStandard);
        return ResultGenerator.genSuccessResult(insElderContractCostStandardList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderContractCostStandard 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderContractCostStandard> queryOne(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        return ResultGenerator.genSuccessResult(insElderContractCostStandardService.queryOne(insElderContractCostStandard));
    }

    /**
    * 保存数据
    * @param insElderContractCostStandard
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        //Date currentDt = new Date();
        if (insElderContractCostStandard.getId() != null && insElderContractCostStandard.getId().longValue() > 0) {
            //insElderContractCostStandard.setUpdatedDt(currentDt);
            insElderContractCostStandardService.update(insElderContractCostStandard);
        } else {
            //insElderContractCostStandard.setCreatedDt(currentDt);
            //insElderContractCostStandard.setUpdatedDt(currentDt);
            insElderContractCostStandardService.insert(insElderContractCostStandard);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderContractCostStandard> add(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        //Date currentDt = new Date();
        //insElderContractCostStandard.setCreatedDt(currentDt);
        //insElderContractCostStandard.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderContractCostStandardService.insert(insElderContractCostStandard));
    }

    /**
    * 更新数据
    *
    * @param insElderContractCostStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderContractCostStandard> update(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        return ResultGenerator.genSuccessResult(insElderContractCostStandardService.update(insElderContractCostStandard));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderContractCostStandard 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderContractCostStandard insElderContractCostStandard) {
        return ResultGenerator.genSuccessResult(insElderContractCostStandardService.deleteById(insElderContractCostStandard.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderContractCostStandard> insertList) {
        return ResultGenerator.genSuccessResult(insElderContractCostStandardService.saveInsElderContractCostStandardBatch(insertList));
    }

}


