package cn.pluss.platform.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import cn.pluss.platform.model.entity.LoginLog;
import cn.pluss.platform.service.loginLog.LoginLogService;


@RestController
@RequestMapping("/loginLog")
@Api(value = "LoginLog控制类",tags={"LoginLog接口"})
public class LoginLogController{

    private Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private LoginLogService loginLogService;

    @PostMapping("/list")
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<LoginLog>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<LoginLog> loginLogList = loginLogService.queryLoginLogPage(map);
        Integer count= loginLogService.queryLoginLogPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<LoginLog>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), loginLogList);
        return ResultGenerator.genSuccessResult(pager);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result save(@RequestBody LoginLog loginLog) {
        if(loginLog.getId()!=null&&loginLog.getId().intValue()>0){
            loginLogService.updateLoginLog(loginLog);
        }else{
            loginLogService.saveLoginLog(loginLog);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result add(@RequestBody LoginLog loginLog) {
        loginLogService.saveLoginLog(loginLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "POST")
    public Result update(@RequestBody LoginLog loginLog) {
        loginLogService.updateLoginLog(loginLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
    public Result delete(@RequestBody LoginLog loginLog) {
        loginLogService.deleteLoginLog(loginLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/queryOne")
    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
    public Result queryOne(@RequestBody LoginLog loginLog) {
        LoginLog  loginLogActual=loginLogService.queryLoginLog(loginLog);
        return ResultGenerator.genSuccessResult(loginLogActual);
    }

    @PostMapping("/queryList")
    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
    public Result queryList(@RequestBody LoginLog loginLog) {
        List<LoginLog>  loginLogList=loginLogService.queryLoginLogList(loginLog);
        return ResultGenerator.genSuccessResult(loginLogList);
    }

}


