package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.RoleMenuInfo;
import cn.pluss.platform.base.auth.roleMenuInfo.RoleMenuInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/roleMenuInfo")
@Api(value = "RoleMenuInfo控制类",tags={"RoleMenuInfo接口"})
public class RoleMenuInfoController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private RoleMenuInfoService roleMenuInfoService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<RoleMenuInfo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<RoleMenuInfo> roleMenuInfoList = roleMenuInfoService.queryRoleMenuInfoPage(map);
   		Integer count= roleMenuInfoService.queryRoleMenuInfoPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<RoleMenuInfo>(count, StringUtil.getPageCount(count,size), page, size, roleMenuInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping("/add")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result add(@RequestBody RoleMenuInfo roleMenuInfo) {
	    	String roleCode=roleMenuInfo.getRoleCode();
	    	String menuCode=roleMenuInfo.getMenuCode();
	    	if(StringUtil.isEmpty(roleCode)) {
	    		 return ResultGenerator.genFailResult("角色编码不能为空");
	    	}
	    	if(StringUtil.isEmpty(menuCode)) {
	    		 return ResultGenerator.genFailResult("菜单编码不能为空");
	    	}
	    	//1、删除该角色下菜单
	    	roleMenuInfoService.deleteRoleMenuInfoByRoleCode(roleMenuInfo);
	    	
	    	//2、添加对应菜单
	    	List<RoleMenuInfo> list=new ArrayList<RoleMenuInfo>();
	    	String menuCodes []=menuCode.split(",");
	    	for(int i=0;i<menuCodes.length;i++) {
	    		if(!StringUtil.isEmpty(menuCodes[i])) {
	    			RoleMenuInfo roleMenu=new RoleMenuInfo();
	    			roleMenu.setMenuCode(menuCodes[i]);
	    			roleMenu.setRoleCode(roleCode);
	    			list.add(roleMenu);
	    		}
	    	}
	        roleMenuInfoService.saveRoleMenuInfoBatch(list);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        RoleMenuInfo roleMenuInfo = new RoleMenuInfo();
	        roleMenuInfo.setId(id.intValue());
	        roleMenuInfoService.deleteRoleMenuInfo(roleMenuInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "RoleMenuInfo",value = "更新的RoleMenuInfo实例",paramType = "body",dataType = "RoleMenuInfo",required = true)
	    })
	    public Result update(@RequestBody RoleMenuInfo roleMenuInfo) {
	        roleMenuInfoService.updateRoleMenuInfo(roleMenuInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        RoleMenuInfo roleMenuInfo = new RoleMenuInfo();
	        roleMenuInfo.setId(id.intValue());
	        roleMenuInfo=roleMenuInfoService.queryRoleMenuInfo(roleMenuInfo);
	        return ResultGenerator.genSuccessResult(roleMenuInfo);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleMenuInfo",value = "待查询的RoleMenuInfo实例",paramType = "body",dataType = "RoleMenuInfo",required = true)
	    })
	    public Result queryOne(@RequestBody RoleMenuInfo roleMenuInfo) {
	      RoleMenuInfo  roleMenuInfoActual=roleMenuInfoService.queryRoleMenuInfo(roleMenuInfo);
	        return ResultGenerator.genSuccessResult(roleMenuInfoActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleMenuInfo",value = "待查询的RoleMenuInfo实例",paramType = "body",dataType = "RoleMenuInfo",required = true)
	    })
	    public Result queryList(@RequestBody RoleMenuInfo roleMenuInfo) {
	    	String roleCode=roleMenuInfo.getRoleCode();
	    	if(StringUtil.isEmpty(roleCode)) {
	    		 return ResultGenerator.genFailResult("角色编码不能为空");
	    	}
	      List<RoleMenuInfo>  roleMenuInfoList=roleMenuInfoService.queryRoleMenuInfoList(roleMenuInfo);
	        return ResultGenerator.genSuccessResult(roleMenuInfoList);
	    }

}

