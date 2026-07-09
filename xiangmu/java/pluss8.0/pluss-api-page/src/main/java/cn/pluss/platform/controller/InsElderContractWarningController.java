package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderContractWarning;
import cn.pluss.platform.service.insElderContractWarning.InsElderContractWarningService;
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
@RequestMapping("/insElderContractWarning")
@Api(value = "InsElderContractWarning控制类",tags={"InsElderContractWarning接口"})
public class InsElderContractWarningController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderContractWarningService insElderContractWarningService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderContractWarning>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderContractWarning> insElderContractWarningList = insElderContractWarningService.queryPage(map);
        Integer count= insElderContractWarningService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderContractWarning>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderContractWarningList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderContractWarning
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderContractWarning>> queryList(@RequestBody InsElderContractWarning insElderContractWarning) {
        List<InsElderContractWarning> insElderContractWarningList = insElderContractWarningService.queryList(insElderContractWarning);
        return ResultGenerator.genSuccessResult(insElderContractWarningList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderContractWarning 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderContractWarning> queryOne(@RequestBody InsElderContractWarning insElderContractWarning) {
        return ResultGenerator.genSuccessResult(insElderContractWarningService.queryOne(insElderContractWarning));
    }

    /**
    * 保存数据
    * @param insElderContractWarning
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderContractWarning insElderContractWarning) {
        //Date currentDt = new Date();
        if (insElderContractWarning.getId() != null && insElderContractWarning.getId().longValue() > 0) {
            //insElderContractWarning.setUpdatedDt(currentDt);
            insElderContractWarningService.update(insElderContractWarning);
        } else {
            //insElderContractWarning.setCreatedDt(currentDt);
            //insElderContractWarning.setUpdatedDt(currentDt);
            insElderContractWarningService.insert(insElderContractWarning);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderContractWarning 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderContractWarning> add(@RequestBody InsElderContractWarning insElderContractWarning) {
        //Date currentDt = new Date();
        //insElderContractWarning.setCreatedDt(currentDt);
        //insElderContractWarning.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderContractWarningService.insert(insElderContractWarning));
    }

    /**
    * 更新数据
    *
    * @param insElderContractWarning 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderContractWarning> update(@RequestBody InsElderContractWarning insElderContractWarning) {
        return ResultGenerator.genSuccessResult(insElderContractWarningService.update(insElderContractWarning));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderContractWarning 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderContractWarning insElderContractWarning) {
        return ResultGenerator.genSuccessResult(insElderContractWarningService.deleteById(insElderContractWarning.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderContractWarning> insertList) {
        return ResultGenerator.genSuccessResult(insElderContractWarningService.saveInsElderContractWarningBatch(insertList));
    }

}


