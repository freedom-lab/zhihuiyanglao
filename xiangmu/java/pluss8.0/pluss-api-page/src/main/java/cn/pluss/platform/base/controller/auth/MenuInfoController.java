package cn.pluss.platform.base.controller.auth;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import javax.annotation.Resource;

import cn.pluss.platform.model.auth.RoleUserInfo;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.base.auth.roleUserInfo.RoleUserInfoService;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
import cn.pluss.platform.model.auth.MenuInfo;
import cn.pluss.platform.base.auth.menuInfo.MenuInfoService;


@RestController
@RequestMapping("/menuInfo")
@Api(value = "MenuInfo控制类",tags={"MenuInfo接口"})
public class MenuInfoController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private MenuInfoService menuInfoService;
	@Resource
	private RoleUserInfoService roleUserInfoService;

	@Resource
	private UserInfoService userInfoService;

	@GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<MenuInfo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<MenuInfo> menuInfoList = menuInfoService.queryMenuInfoPage(map);
   		Integer count= menuInfoService.queryMenuInfoPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<MenuInfo>(count, StringUtil.getPageCount(count,size), page, size, menuInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "MenuInfo",value = "待添加的MenuInfo实例",paramType = "body",dataType = "MenuInfo",required = true)
	    })
	    public Result add(@RequestBody MenuInfo menuInfo) {
	        menuInfoService.saveMenuInfo(menuInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        MenuInfo menuInfo = new MenuInfo();
	        menuInfo.setId(id.intValue());
	        menuInfoService.deleteMenuInfo(menuInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "MenuInfo",value = "更新的MenuInfo实例",paramType = "body",dataType = "MenuInfo",required = true)
	    })
		
	    public Result update(@RequestBody MenuInfo menuInfo) {
	        menuInfoService.updateMenuInfo(menuInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        MenuInfo menuInfo = new MenuInfo();
	        menuInfo.setId(id.intValue());
	        menuInfo=menuInfoService.queryMenuInfo(menuInfo);
	        return ResultGenerator.genSuccessResult(menuInfo);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "MenuInfo",value = "待查询的MenuInfo实例",paramType = "body",dataType = "MenuInfo",required = true)
	    })
	    public Result queryOne(@RequestBody MenuInfo menuInfo) {
	      MenuInfo  menuInfoActual=menuInfoService.queryMenuInfo(menuInfo);
	        return ResultGenerator.genSuccessResult(menuInfoActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "MenuInfo",value = "待查询的MenuInfo实例",paramType = "body",dataType = "MenuInfo",required = true)
	    })
	    public Result queryList(@RequestBody MenuInfo menuInfo) {
	      List<MenuInfo>  menuInfoList=menuInfoService.queryMenuInfoList(menuInfo);
	        return ResultGenerator.genSuccessResult(menuInfoList);
	    }
	    
	    
	    @PostMapping("/queryTreeList")
	    @ApiOperation(value = "菜单树集合",notes = "菜单树集合",httpMethod = "POST")
	    public Result queryTreeList(@RequestBody MenuInfo menuInfo) {
	    	List<MenuInfo>  menuInfoList=menuInfoService.queryMenuInfoList(null);
	    	
	    	List<MenuInfo> list=new ArrayList<MenuInfo>();//父级菜单
	    	List<MenuInfo> subList=new ArrayList<MenuInfo>();//子级菜单
	    	for(MenuInfo m:menuInfoList) {
	    		if(StringUtil.isEmpty(m.getParentCode())) {
	    			list.add(m);
	    		}

				else {
	    			subList.add(m);
	    		}
	    	}
	    	
	    	for(MenuInfo l:list) {
	    		List<MenuInfo> childrens=getSubMenu(l,subList);
	    		l.setChildrens(childrens);
	    	}
	    	
	    	
	        return ResultGenerator.genSuccessResult(list);
	    }

		private List<MenuInfo> getSubMenu(MenuInfo l, List<MenuInfo> subList) {
			List<MenuInfo> childrens=new ArrayList<MenuInfo>();
			for(MenuInfo sub:subList) {
				if(l.getMenuCode().equals(sub.getParentCode())) {
					childrens.add(sub);
					List<MenuInfo> childrens2=getSubMenu(sub,subList);
					sub.setChildrens(childrens2);
				}
			}
			return childrens;
		}

	@PostMapping("/getUserMenu")
	@ApiOperation(value = "根据用户名获取菜单",notes = "根据用户名获取菜单",httpMethod = "POST")
	@ApiImplicitParams({})
	public Result getUserMenu(@RequestBody UserInfo userInfoParam) {

    	//根据登陆名称获取用户编码
		List<UserInfo> userInfoList=userInfoService.queryUserInfoList(userInfoParam);
		if(userInfoList==null){
			return ResultGenerator.genFailResult("不存在当前登陆用户："+userInfoParam.getLoginName());
		}
		if(userInfoList.size()>1){
			return ResultGenerator.genFailResult("当前登陆用户："+userInfoParam.getLoginName()+" 存在重复，请联系管理员！");
		}
		UserInfo userInfo=userInfoList.get(0);
    	//根据登陆名获取用户角色
		RoleUserInfo roleUserInfoParams=new RoleUserInfo();
		roleUserInfoParams.setUserCode(userInfo.getUserCode());
		List<RoleUserInfo> roleUserInfoList=roleUserInfoService.queryRoleUserInfoList(roleUserInfoParams);
		//根据roleCode查询菜单
		List<MenuInfo>  menuInfoList=new ArrayList<MenuInfo>();
		if(roleUserInfoList!=null&&roleUserInfoList.size()>0){
			List<String> roleCodes=new ArrayList<String>();
			for (int i = 0; i < roleUserInfoList.size(); i++) {
				roleCodes.add(roleUserInfoList.get(i).getRoleCode());
			}
		  menuInfoList=menuInfoService.queryMenuInfoByRole(roleCodes);
			//组装菜单树
			if(menuInfoList!=null&&menuInfoList.size()>0){
				List<MenuInfo> parentMenuList=new ArrayList<MenuInfo>();
				for (int i = 0; i < menuInfoList.size(); i++) {

					if(StringUtil.isEmpty(menuInfoList.get(i).getParentCode())){
						parentMenuList.add(menuInfoList.get(i));
					}
				}
				//递归组装菜单树
				for (int i = 0; i < parentMenuList.size(); i++) {
					genMenuTreeList(parentMenuList.get(i),menuInfoList);
				}
				return ResultGenerator.genSuccessResult(parentMenuList);
			}
		}

		return ResultGenerator.genSuccessResult(menuInfoList);
	}

	/**
	 * 递归组装菜单树
	 * @param currMenuInfo
	 * @param menuInfoList
	 */

	private void genMenuTreeList(MenuInfo currMenuInfo, List<MenuInfo> menuInfoList) {

		List<MenuInfo> childrenMenuList =new ArrayList<MenuInfo>();
		for (int i = 0; i <menuInfoList.size() ; i++) {
			if(currMenuInfo.getMenuCode().equals(menuInfoList.get(i).getParentCode())){
				childrenMenuList.add(menuInfoList.get(i));
			}
		}
		if (childrenMenuList == null||childrenMenuList.size()==0) {
			return;
		}
		currMenuInfo.setChildrens(childrenMenuList);
		for (int i = 0; i < childrenMenuList.size(); i++) {
			genMenuTreeList(childrenMenuList.get(i),menuInfoList);
		}
	
	}

}

