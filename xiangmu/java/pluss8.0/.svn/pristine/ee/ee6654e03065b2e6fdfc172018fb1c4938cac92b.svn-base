package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSchedulingClasses;
import cn.pluss.platform.service.insSchedulingClasses.InsSchedulingClassesService;
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
@RequestMapping("/insSchedulingClasses")
@Api(value = "InsSchedulingClasses控制类",tags={"InsSchedulingClasses接口"})
public class InsSchedulingClassesController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSchedulingClassesService insSchedulingClassesService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSchedulingClasses>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSchedulingClasses> insSchedulingClassesList = insSchedulingClassesService.queryPage(map);
        Integer count= insSchedulingClassesService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSchedulingClasses>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSchedulingClassesList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSchedulingClasses
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSchedulingClasses>> queryList(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        List<InsSchedulingClasses> insSchedulingClassesList = insSchedulingClassesService.queryList(insSchedulingClasses);
        return ResultGenerator.genSuccessResult(insSchedulingClassesList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSchedulingClasses 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSchedulingClasses> queryOne(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        return ResultGenerator.genSuccessResult(insSchedulingClassesService.queryOne(insSchedulingClasses));
    }

    /**
    * 保存数据
    * @param insSchedulingClasses
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        //Date currentDt = new Date();
        if (insSchedulingClasses.getId() != null && insSchedulingClasses.getId().longValue() > 0) {
            //insSchedulingClasses.setUpdatedDt(currentDt);
            insSchedulingClassesService.update(insSchedulingClasses);
        } else {
            //insSchedulingClasses.setCreatedDt(currentDt);
            //insSchedulingClasses.setUpdatedDt(currentDt);
            insSchedulingClassesService.insert(insSchedulingClasses);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSchedulingClasses> add(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        //Date currentDt = new Date();
        //insSchedulingClasses.setCreatedDt(currentDt);
        //insSchedulingClasses.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSchedulingClassesService.insert(insSchedulingClasses));
    }

    /**
    * 更新数据
    *
    * @param insSchedulingClasses 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSchedulingClasses> update(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        return ResultGenerator.genSuccessResult(insSchedulingClassesService.update(insSchedulingClasses));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSchedulingClasses 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSchedulingClasses insSchedulingClasses) {
        return ResultGenerator.genSuccessResult(insSchedulingClassesService.deleteById(insSchedulingClasses.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSchedulingClasses> insertList) {
        return ResultGenerator.genSuccessResult(insSchedulingClassesService.saveInsSchedulingClassesBatch(insertList));
    }

}


