package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.RoleInfo;
import cn.pluss.platform.model.auth.RoleUserInfo;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.base.auth.roleInfo.RoleInfoService;
import cn.pluss.platform.base.auth.roleUserInfo.RoleUserInfoService;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;


@RestController
@RequestMapping("/roleUserInfo")
@Api(value = "RoleUserInfo控制类",tags={"RoleUserInfo接口"})
public class RoleUserInfoController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private RoleUserInfoService roleUserInfoService;
	  @Resource
	  private RoleInfoService roleInfoService;
	  @Resource
	  private UserInfoService userInfoService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<RoleUserInfo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<RoleUserInfo> roleUserInfoList = roleUserInfoService.queryRoleUserInfoPage(map);
   		Integer count= roleUserInfoService.queryRoleUserInfoPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<RoleUserInfo>(count, StringUtil.getPageCount(count,size), page, size, roleUserInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "RoleUserInfo",value = "待添加的RoleUserInfo实例",paramType = "body",dataType = "RoleUserInfo",required = true)
	    })
	    public Result add(@RequestBody RoleUserInfo roleUserInfo) {
	        roleUserInfoService.saveRoleUserInfo(roleUserInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        RoleUserInfo roleUserInfo = new RoleUserInfo();
	        roleUserInfo.setId(id.intValue());
	        roleUserInfoService.deleteRoleUserInfo(roleUserInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "RoleUserInfo",value = "更新的RoleUserInfo实例",paramType = "body",dataType = "RoleUserInfo",required = true)
	    })
	    public Result update(@RequestBody RoleUserInfo roleUserInfo) {
	        roleUserInfoService.updateRoleUserInfo(roleUserInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        RoleUserInfo roleUserInfo = new RoleUserInfo();
	        roleUserInfo.setId(id.intValue());
	        roleUserInfo=roleUserInfoService.queryRoleUserInfo(roleUserInfo);
	        return ResultGenerator.genSuccessResult(roleUserInfo);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleUserInfo",value = "待查询的RoleUserInfo实例",paramType = "body",dataType = "RoleUserInfo",required = true)
	    })
	    public Result queryOne(@RequestBody RoleUserInfo roleUserInfo) {
	      RoleUserInfo  roleUserInfoActual=roleUserInfoService.queryRoleUserInfo(roleUserInfo);
	        return ResultGenerator.genSuccessResult(roleUserInfoActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "RoleUserInfo",value = "待查询的RoleUserInfo实例",paramType = "body",dataType = "RoleUserInfo",required = true)
	    })
	    public Result queryList(@RequestBody RoleUserInfo roleUserInfo) {
	      List<RoleUserInfo>  roleUserInfoList=roleUserInfoService.queryRoleUserInfoList(roleUserInfo);
	        return ResultGenerator.genSuccessResult(roleUserInfoList);
	    }
	    
	    
	    
	    @PostMapping("/queryListByUserCode")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByUserCode(@RequestBody RoleUserInfo roleUserInfo) {
	    	if(StringUtil.isEmpty(roleUserInfo.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	
	      List<RoleUserInfo>  roleUserInfoList=roleUserInfoService.queryRoleUserInfoList(roleUserInfo);
	      
	      List<RoleInfo> roleInfoList=roleInfoService.queryRoleInfoList(null);
	      List<RoleInfo> list=new ArrayList<RoleInfo>();
	      for(RoleInfo ri:roleInfoList) {
	    	  for(RoleUserInfo rui:roleUserInfoList) {
	    		  if(ri.getRoleCode().equals(rui.getRoleCode())) {
	    			  ri.setId(rui.getId());
	    			  list.add(ri);
	    		  }
	    	  }
	      }
	      return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
	    @PostMapping("/queryListByRoleCode")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByRoleCode(@RequestBody RoleUserInfo roleUserInfo) {
	    	if(StringUtil.isEmpty(roleUserInfo.getRoleCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	
	      List<RoleUserInfo>  roleUserInfoList=roleUserInfoService.queryRoleUserInfoList(roleUserInfo);
	      
	      List<UserInfo> userInfoList=userInfoService.queryUserInfoList(null);
	      List<UserInfo> list=new ArrayList<UserInfo>();
	      for(UserInfo ui:userInfoList) {
	    	  for(RoleUserInfo rui:roleUserInfoList) {
	    		  if(ui.getUserCode().equals(rui.getUserCode())) {
	    			  ui.setId(rui.getId());
	    			  list.add(ui);
	    		  }
	    	  }
	      }
	      return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
	    
	    @PostMapping("add")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result insert(@RequestBody RoleUserInfo roleUserInfo) {
	    	if(StringUtil.isEmpty(roleUserInfo.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	if(StringUtil.isEmpty(roleUserInfo.getRoleCode())) {
	    		return ResultGenerator.genFailResult("无角色编码");
	    	}
	    	String roleCode=roleUserInfo.getRoleCode();
	    	String roleCodes[]=roleCode.split(",");
	    	
	    	RoleUserInfo uorg=new RoleUserInfo();
	        uorg.setUserCode(roleUserInfo.getUserCode());
	        List<RoleUserInfo>  userRoleList=roleUserInfoService.queryRoleUserInfoList(uorg);
	        
	        
	        List<String> rolelist = new ArrayList<>(Arrays.asList(roleCodes));
	        
	        List<String> rolelist2 = new ArrayList<String>();
	        
        	for(String s:rolelist ) {
        		if(!StringUtil.isEmpty(s)) {
        			for(RoleUserInfo u:userRoleList) {
            			if(s.equals(u.getRoleCode())) {
            				rolelist2.add(s);
            			}
            		}
        		}
        	}
        	if(rolelist2.size()>0) {
        		rolelist.removeAll(rolelist2);
        	}
	    	
	    	
	    	List<RoleUserInfo> list=new ArrayList<RoleUserInfo>();
	    	for(String s:rolelist) {
	    		if(!StringUtil.isEmpty(s)) {
	    			RoleUserInfo rui=new RoleUserInfo();
	    			rui.setUserCode(roleUserInfo.getUserCode());
	    			rui.setRoleCode(s);
	    			list.add(rui);
	    		}
	    	}
	    	if(list.size()>0) {
	    		roleUserInfoService.saveRoleUserInfoBatch(list);
	    	}
	    	
	    	if(rolelist2.size()>0) {
	    		return ResultGenerator.genSuccessResult("有"+rolelist2.size()+"个重复数据未录入");
	    	}else {
	    		return ResultGenerator.genSuccessResult();
	    	}
	    }
	    
	    
	    @PostMapping("addUser")
	    @ApiOperation(value = "角色与用户绑定关系",notes = "角色与用户绑定关系",httpMethod = "POST")
	    public Result addUser(@RequestBody RoleUserInfo roleUserInfo) {
	    	if(StringUtil.isEmpty(roleUserInfo.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	if(StringUtil.isEmpty(roleUserInfo.getRoleCode())) {
	    		return ResultGenerator.genFailResult("无角色编码");
	    	}
//	    	
	    	//添加角色与用户的绑定关系
	    	String userCode=roleUserInfo.getUserCode();
	    	String userCodes[]=userCode.split(",");
	    	
	    	
	    	RoleUserInfo uorg=new RoleUserInfo();
	        uorg.setRoleCode(roleUserInfo.getRoleCode());
	        List<RoleUserInfo>  userRoleList=roleUserInfoService.queryRoleUserInfoList(uorg);
	        
	        
	        List<String> userlist = new ArrayList<>(Arrays.asList(userCodes));
	        List<String> userlist2 = new ArrayList<String>();
	        
        	for(String s:userlist ) {
        		if(!StringUtil.isEmpty(s)) {
        			for(RoleUserInfo u:userRoleList) {
            			if(s.equals(u.getUserCode())) {
            				userlist2.add(s);
            			}
            		}
        		}
        	}
        	if(userlist2.size()>0) {
        		userlist.removeAll(userlist2);
        	}
	    	
	    	
	    	List<RoleUserInfo> list=new ArrayList<RoleUserInfo>();
	    	for(String s:userlist) {
	    		if(!StringUtil.isEmpty(s)) {
	    			RoleUserInfo rui=new RoleUserInfo();
	    			rui.setUserCode(s);
	    			rui.setRoleCode(roleUserInfo.getRoleCode());
	    			list.add(rui);
	    		}
	    	}
	    	if(list.size()>0) {
	    		roleUserInfoService.saveRoleUserInfoBatch(list);
	    	}
	    	
	    	if(userlist2.size()>0) {
	    		return ResultGenerator.genSuccessResult("有"+userlist2.size()+"个重复数据未录入");
	    	}else {
	    		return ResultGenerator.genSuccessResult();
	    	}
	    }

}

