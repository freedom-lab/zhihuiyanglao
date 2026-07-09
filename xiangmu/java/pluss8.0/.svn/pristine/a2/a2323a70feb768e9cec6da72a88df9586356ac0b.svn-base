package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareNursingElderStandard;
import cn.pluss.platform.service.careNursingElderStandard.CareNursingElderStandardService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/careNursingElderStandard")
@Api(value = "CareNursingElderStandard控制类",tags={"CareNursingElderStandard接口"})
public class CareNursingElderStandardController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareNursingElderStandardService careNursingElderStandardService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareNursingElderStandard>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareNursingElderStandard> careNursingElderStandardList = careNursingElderStandardService.queryPage(map);
        Integer count= careNursingElderStandardService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareNursingElderStandard>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careNursingElderStandardList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careNursingElderStandard
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareNursingElderStandard>> queryList(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        List<CareNursingElderStandard> careNursingElderStandardList = careNursingElderStandardService.queryList(careNursingElderStandard);
        return ResultGenerator.genSuccessResult(careNursingElderStandardList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careNursingElderStandard 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareNursingElderStandard> queryOne(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        return ResultGenerator.genSuccessResult(careNursingElderStandardService.queryOne(careNursingElderStandard));
    }

    /**
    * 保存数据
    * @param careNursingElderStandard
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        //Date currentDt = new Date();
        if (careNursingElderStandard.getId() != null && careNursingElderStandard.getId().longValue() > 0) {
            //careNursingElderStandard.setUpdatedDt(currentDt);
            careNursingElderStandardService.update(careNursingElderStandard);
        } else {
            //careNursingElderStandard.setCreatedDt(currentDt);
            //careNursingElderStandard.setUpdatedDt(currentDt);
            careNursingElderStandardService.insert(careNursingElderStandard);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareNursingElderStandard> add(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        //Date currentDt = new Date();
        //careNursingElderStandard.setCreatedDt(currentDt);
        //careNursingElderStandard.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careNursingElderStandardService.insert(careNursingElderStandard));
    }

    /**
    * 更新数据
    *
    * @param careNursingElderStandard 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareNursingElderStandard> update(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        return ResultGenerator.genSuccessResult(careNursingElderStandardService.update(careNursingElderStandard));
    }

    /**
    * 通过主键删除数据
    *
    * @param careNursingElderStandard 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareNursingElderStandard careNursingElderStandard) {
        return ResultGenerator.genSuccessResult(careNursingElderStandardService.deleteById(careNursingElderStandard.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareNursingElderStandard> insertList) {
        return ResultGenerator.genSuccessResult(careNursingElderStandardService.saveCareNursingElderStandardBatch(insertList));
    }

}


