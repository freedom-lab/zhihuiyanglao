package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.Organ;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.model.auth.UserOrgan;
import cn.pluss.platform.base.auth.organ.OrganService;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.base.auth.userOrgan.UserOrganService;
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
@RequestMapping("/userOrgan")
@Api(value = "UserOrgan控制类",tags={"UserOrgan接口"})
public class UserOrganController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private UserOrganService userOrganService;
	  @Resource
	  private OrganService  organService;
	  @Resource
	  private UserInfoService  userInfoService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<UserOrgan>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<UserOrgan> userOrganList = userOrganService.queryUserOrganPage(map);
   		Integer count= userOrganService.queryUserOrganPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<UserOrgan>(count, StringUtil.getPageCount(count,size), page, size, userOrganList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result add(@RequestBody UserOrgan userOrgan) {
	        userOrganService.saveUserOrgan(userOrgan);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        UserOrgan userOrgan = new UserOrgan();
	        userOrgan.setId(id.intValue());
	        userOrganService.deleteUserOrgan(userOrgan);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "UserOrgan",value = "更新的UserOrgan实例",paramType = "body",dataType = "UserOrgan",required = true)
	    })
	    public Result update(@RequestBody UserOrgan userOrgan) {
	        userOrganService.updateUserOrgan(userOrgan);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        UserOrgan userOrgan = new UserOrgan();
	        userOrgan.setId(id.intValue());
	        userOrgan=userOrganService.queryUserOrgan(userOrgan);
	        return ResultGenerator.genSuccessResult(userOrgan);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "UserOrgan",value = "待查询的UserOrgan实例",paramType = "body",dataType = "UserOrgan",required = true)
	    })
	    public Result queryOne(@RequestBody UserOrgan userOrgan) {
	      UserOrgan  userOrganActual=userOrganService.queryUserOrgan(userOrgan);
	        return ResultGenerator.genSuccessResult(userOrganActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "UserOrgan",value = "待查询的UserOrgan实例",paramType = "body",dataType = "UserOrgan",required = true)
	    })
	    public Result queryList(@RequestBody UserOrgan userOrgan) {
	      List<UserOrgan>  userOrganList=userOrganService.queryUserOrganList(userOrgan);
	        return ResultGenerator.genSuccessResult(userOrganList);
	    }
	    
	    
	    @PostMapping("/queryListByUserCode")
	    @ApiOperation(value = "获条件取集合,传userCode",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByUserCode(@RequestBody UserOrgan userOrgan) {
	    	if(StringUtil.isEmpty(userOrgan.getUserCode())) {
	    		 return ResultGenerator.genFailResult("无用户编码");
	    	}
	      List<UserOrgan>  userOrganList=userOrganService.queryUserOrganList(userOrgan);
	      List<Organ> list=new ArrayList<Organ>();
	      List<Organ> organList=organService.queryOrganList(null);
	      for(Organ o:organList) {
	    	  for(UserOrgan uo:userOrganList) {
	    		  if(o.getOrganCode().equals(uo.getOrganCode())) {
	    			  o.setId(uo.getId());
	    			  list.add(o);
	    		  }
	    	  }
	      }
	        return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
//	    @PostMapping("add")
//	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
//	    public Result insert(@RequestBody UserOrgan userOrgan) {
//	    	if(StringUtil.isEmpty(userOrgan.getUserCode())) {
//	    		 return ResultGenerator.genFailResult("无用户编码");
//	    	}
//	    	if(StringUtil.isEmpty(userOrgan.getOrganCode())) {
//	    		 return ResultGenerator.genFailResult("无组织编码");
//	    	}
//	        String organCode=userOrgan.getOrganCode();
//	        String organCodes []=organCode.split(",");
//
//
//
//	        UserOrgan uorg=new UserOrgan();
//	        uorg.setUserCode(userOrgan.getUserCode());
//	        List<UserOrgan>  userOrganList=userOrganService.queryUserOrganList(uorg);
//
//	        List<String> orglist = new ArrayList<>(Arrays.asList(organCodes));
//
//	        List<String> orglist2 = new ArrayList<String>();
//
//        	for(String s:orglist ) {
//        		if(!StringUtil.isEmpty(s)) {
//        			for(UserOrgan u:userOrganList) {
//            			if(s.equals(u.getOrganCode())) {
//            				orglist2.add(s);
//            			}
//            		}
//        		}
//        	}
//        	if(orglist2.size()>0) {
//        		orglist.removeAll(orglist2);
//        	}
//
//
//        	List<UserOrgan> list=new ArrayList<UserOrgan>();
//	    	for(String s:orglist) {
//	    		if(!StringUtil.isEmpty(s)) {
//	    			UserOrgan uo=new UserOrgan();
//	    			uo.setUserCode(userOrgan.getUserCode());
//	    			uo.setOrganCode(s);
//	    			list.add(uo);
//	    		}
//	    	}
//	    	if(list.size()>0) {
//	    		userOrganService.saveUserOrganBatch(list);
//	    	}
//
//
//	    	if(orglist2.size()>0) {
//	    		return ResultGenerator.genSuccessResult("有"+orglist2.size()+"个重复数据未录入");
//	    	}else {
//	    		return ResultGenerator.genSuccessResult();
//	    	}
//
//
//	    }

	@PostMapping("add")
	@ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	public Result insert(@RequestBody UserOrgan userOrgan) {
		if(StringUtil.isEmpty(userOrgan.getUserCode())) {
			return ResultGenerator.genFailResult("无用户编码");
		}
		if(StringUtil.isEmpty(userOrgan.getOrganCode())) {
			return ResultGenerator.genFailResult("无组织编码");
		}
		String organCode=userOrgan.getOrganCode();
		String organCodes []=organCode.split(",");




		return ResultGenerator.genSuccessResult();



	}
	    
	    
	    @PostMapping("/queryListByOrganCode")
	    @ApiOperation(value = "获条件取集合,传organCode",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByOrganCode(@RequestBody UserOrgan userOrgan) {
	    	if(StringUtil.isEmpty(userOrgan.getOrganCode())) {
	    		 return ResultGenerator.genFailResult("无岗位编码");
	    	}
	      List<UserOrgan>  userOrganList=userOrganService.queryUserOrganList(userOrgan);
	      List<UserInfo> list=new ArrayList<UserInfo>();
	      List<UserInfo> userList=userInfoService.queryUserInfoList(null);
	      for(UserInfo u:userList) {
	    	  for(UserOrgan uo:userOrganList) {
	    		  if(u.getUserCode().equals(uo.getUserCode())) {
	    			  u.setId(uo.getId());
	    			  list.add(u);
	    		  }
	    	  }
	      }
	      return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
	    @PostMapping("addUser")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result addUser(@RequestBody UserOrgan userOrgan) {
	    	if(StringUtil.isEmpty(userOrgan.getUserCode())) {
	    		 return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	if(StringUtil.isEmpty(userOrgan.getOrganCode())) {
	    		 return ResultGenerator.genFailResult("无组织编码");
	    	}
	        String userCode=userOrgan.getUserCode();
	        String userCodes []=userCode.split(",");
	        
	        //查询已有岗位与人员绑定关系
	        UserOrgan uorg=new UserOrgan();
	        uorg.setUserCode(userOrgan.getOrganCode());
	        List<UserOrgan>  userOrganList=userOrganService.queryUserOrganList(uorg);
	        
	        
	        List<String> userlist = new ArrayList<>(Arrays.asList(userCodes));
	        List<String> userlist2 = new ArrayList<String>();
	        
        	List<UserOrgan> list=new ArrayList<UserOrgan>();
        	for(String s:userlist ) {
        		if(!StringUtil.isEmpty(s)) {
        			for(UserOrgan u:userOrganList) {
            			if(s.equals(u.getUserCode())) {
            				userlist2.add(s);
            			}
            		}
        		}
        	}
        	if(userlist2.size()>0) {
        		userlist.removeAll(userlist2);
        	}
	    	for(String s:userlist) {
	    		if(!StringUtil.isEmpty(s)) {
	    			UserOrgan uo=new UserOrgan();
	    			uo.setUserCode(s);
	    			uo.setOrganCode(userOrgan.getOrganCode());
	    			list.add(uo);
	    		}
	    	}
	    	if(list.size()>0) {
	    		userOrganService.saveUserOrganBatch(list);
	    	}
	    	
	    	
	    	if(userlist2.size()>0) {
	    		return ResultGenerator.genSuccessResult("有"+userlist2.size()+"个重复数据未录入");
	    	}else {
	    		return ResultGenerator.genSuccessResult();
	    	}
	        
	        
	        
	    }

}

