package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingElderStandard;
import cn.pluss.platform.service.insNursingElderStandard.InsNursingElderStandardService;
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
@RequestMapping("/insNursingElderStandard")
@Api(value = "InsNursingElderStandard控制类",tags={"InsNursingElderStandard接口"})
public class InsNursingElderStandardController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingElderStandardService insNursingElderStandardService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingElderStandard>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingElderStandard> insNursingElderStandardList = insNursingElderStandardService.queryPage(map);
        Integer count= insNursingElderStandardService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingElderStandard>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingElderStandardList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingElderStandard
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingElderStandard>> queryList(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        List<InsNursingElderStandard> insNursingElderStandardList = insNursingElderStandardService.queryList(insNursingElderStandard);
        return ResultGenerator.genSuccessResult(insNursingElderStandardList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingElderStandard 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingElderStandard> queryOne(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        return ResultGenerator.genSuccessResult(insNursingElderStandardService.queryOne(insNursingElderStandard));
    }

    /**
    * 保存数据
    * @param insNursingElderStandard
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        //Date currentDt = new Date();
        if (insNursingElderStandard.getId() != null && insNursingElderStandard.getId().longValue() > 0) {
            //insNursingElderStandard.setUpdatedDt(currentDt);
            insNursingElderStandardService.update(insNursingElderStandard);
        } else {
            //insNursingElderStandard.setCreatedDt(currentDt);
            //insNursingElderStandard.setUpdatedDt(currentDt);
            insNursingElderStandardService.insert(insNursingElderStandard);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingElderStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingElderStandard> add(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        //Date currentDt = new Date();
        //insNursingElderStandard.setCreatedDt(currentDt);
        //insNursingElderStandard.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingElderStandardService.insert(insNursingElderStandard));
    }

    /**
    * 更新数据
    *
    * @param insNursingElderStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingElderStandard> update(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        return ResultGenerator.genSuccessResult(insNursingElderStandardService.update(insNursingElderStandard));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingElderStandard 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingElderStandard insNursingElderStandard) {
        return ResultGenerator.genSuccessResult(insNursingElderStandardService.deleteById(insNursingElderStandard.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingElderStandard> insertList) {
        return ResultGenerator.genSuccessResult(insNursingElderStandardService.saveInsNursingElderStandardBatch(insertList));
    }

}


