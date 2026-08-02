package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSecurityInspectionRoute;
import cn.pluss.platform.service.insSecurityInspectionRoute.InsSecurityInspectionRouteService;
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
@RequestMapping("/insSecurityInspectionRoute")
@Api(value = "InsSecurityInspectionRoute控制类",tags={"InsSecurityInspectionRoute接口"})
public class InsSecurityInspectionRouteController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSecurityInspectionRouteService insSecurityInspectionRouteService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSecurityInspectionRoute>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSecurityInspectionRoute> insSecurityInspectionRouteList = insSecurityInspectionRouteService.queryPage(map);
        Integer count= insSecurityInspectionRouteService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSecurityInspectionRoute>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSecurityInspectionRouteList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSecurityInspectionRoute
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSecurityInspectionRoute>> queryList(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        List<InsSecurityInspectionRoute> insSecurityInspectionRouteList = insSecurityInspectionRouteService.queryList(insSecurityInspectionRoute);
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSecurityInspectionRoute 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSecurityInspectionRoute> queryOne(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteService.queryOne(insSecurityInspectionRoute));
    }

    /**
    * 保存数据
    * @param insSecurityInspectionRoute
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        //Date currentDt = new Date();
        if (insSecurityInspectionRoute.getId() != null && insSecurityInspectionRoute.getId().longValue() > 0) {
            //insSecurityInspectionRoute.setUpdatedDt(currentDt);
            insSecurityInspectionRouteService.update(insSecurityInspectionRoute);
        } else {
            //insSecurityInspectionRoute.setCreatedDt(currentDt);
            //insSecurityInspectionRoute.setUpdatedDt(currentDt);
            insSecurityInspectionRouteService.insert(insSecurityInspectionRoute);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSecurityInspectionRoute 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSecurityInspectionRoute> add(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        //Date currentDt = new Date();
        //insSecurityInspectionRoute.setCreatedDt(currentDt);
        //insSecurityInspectionRoute.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteService.insert(insSecurityInspectionRoute));
    }

    /**
    * 更新数据
    *
    * @param insSecurityInspectionRoute 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSecurityInspectionRoute> update(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteService.update(insSecurityInspectionRoute));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSecurityInspectionRoute 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSecurityInspectionRoute insSecurityInspectionRoute) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteService.deleteById(insSecurityInspectionRoute.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSecurityInspectionRoute> insertList) {
        return ResultGenerator.genSuccessResult(insSecurityInspectionRouteService.saveInsSecurityInspectionRouteBatch(insertList));
    }

}


