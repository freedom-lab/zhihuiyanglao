package cn.pluss.platform.base.controller.coding;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.SystemConfig;
import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
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
@RequestMapping("/systemConfig")
@Api(value = "SystemConfig控制类",tags={"SystemConfig接口"})
public class SystemConfigController{

    private Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private SystemConfigService systemConfigService;

    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result<PageInfo<SystemConfig>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
        map.putAll(pageQueryInfo.getCondition());
        List<SystemConfig> systemConfigList = systemConfigService.querySystemConfigPage(map);
        Integer count= systemConfigService.querySystemConfigPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<SystemConfig>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), systemConfigList);
        return ResultGenerator.genSuccessResult(pager);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result save(@RequestBody SystemConfig systemConfig) {
        if(systemConfig.getId()!=null&&systemConfig.getId().intValue()>0){
            systemConfigService.updateSystemConfig(systemConfig);
        }else{
            systemConfigService.saveSystemConfig(systemConfig);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result add(@RequestBody SystemConfig systemConfig) {
        systemConfigService.saveSystemConfig(systemConfig);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result update(@RequestBody SystemConfig systemConfig) {
        systemConfigService.updateSystemConfig(systemConfig);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result delete(@RequestBody SystemConfig systemConfig) {
        systemConfigService.deleteSystemConfig(systemConfig);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/queryOne")
    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result queryOne(@RequestBody SystemConfig systemConfig) {
        SystemConfig  systemConfigActual=systemConfigService.querySystemConfig(systemConfig);
        return ResultGenerator.genSuccessResult(systemConfigActual);
    }
    @PostMapping("/queryList")
    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result queryList(@RequestBody SystemConfig systemConfig) {
        List<SystemConfig>  systemConfigList=systemConfigService.querySystemConfigList(systemConfig);
        return ResultGenerator.genSuccessResult(systemConfigList);
    }

}


