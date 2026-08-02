package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.RoleInfo;
import cn.pluss.platform.base.auth.roleInfo.RoleInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/roleInfo")
@Api(value = "RoleInfo控制类",tags={"RoleInfo接口"})
public class RoleInfoController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private RoleInfoService roleInfoService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<RoleInfo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<RoleInfo> roleInfoList = roleInfoService.queryRoleInfoPage(map);
   		Integer count= roleInfoService.queryRoleInfoPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<RoleInfo>(count, StringUtil.getPageCount(count,size), page, size, roleInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping("/add")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "RoleInfo",value = "待添加的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
	    })
	    public Result add(@RequestBody RoleInfo roleInfo) {
			roleInfo.setRoleCode(StringUtil.random6());
			roleInfo.setCreateTime(new Date());
	        roleInfoService.saveRoleInfo(roleInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PostMapping("/delete")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
		@ApiImplicitParams({
				@ApiImplicitParam(name = "RoleInfo",value = "待删除的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
		})
	    public Result delete(@RequestBody RoleInfo roleInfo) {
	        roleInfoService.deleteRoleInfo(roleInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "RoleInfo",value = "更新的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
	    })
	    public Result update(@RequestBody RoleInfo roleInfo) {
	        roleInfoService.updateRoleInfo(roleInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        RoleInfo roleInfo = new RoleInfo();
	        roleInfo.setId(id.intValue());
	        roleInfo=roleInfoService.queryRoleInfo(roleInfo);
	        return ResultGenerator.genSuccessResult(roleInfo);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleInfo",value = "待查询的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
	    })
	    public Result queryOne(@RequestBody RoleInfo roleInfo) {
	      RoleInfo  roleInfoActual=roleInfoService.queryRoleInfo(roleInfo);
	        return ResultGenerator.genSuccessResult(roleInfoActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleInfo",value = "待查询的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
	    })
	    public Result queryList(@RequestBody RoleInfo roleInfo) {
	      List<RoleInfo>  roleInfoList=roleInfoService.queryRoleInfoList(roleInfo);
	        return ResultGenerator.genSuccessResult(roleInfoList);
	    }
	@PostMapping("/queryRoleMenu")
	@ApiOperation(value = "根据角色查询菜单",notes = "根据角色查询菜单",httpMethod = "POST")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "RoleInfo",value = "待查询的RoleInfo实例",paramType = "body",dataType = "RoleInfo",required = true)
	})
	public Result queryRoleMenu(@RequestBody RoleInfo roleInfo) {

		RoleInfo  roleInfoActual=roleInfoService.queryRoleInfo(roleInfo);

		//查询对应的菜单

		return ResultGenerator.genSuccessResult(roleInfoActual);
	}
}

