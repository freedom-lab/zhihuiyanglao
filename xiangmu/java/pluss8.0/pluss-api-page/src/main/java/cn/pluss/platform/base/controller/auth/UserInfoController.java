package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.base.auth.organ.OrganService;
import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.base.auth.userOrgan.UserOrganService;
import cn.pluss.platform.model.entity.LoginLog;
import cn.pluss.platform.service.loginLog.LoginLogService;
import cn.pluss.platform.util.*;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;


@RestController
@RequestMapping("/userInfo")
@Api(value = "UserInfo控制类",tags={"UserInfo接口"})
public class UserInfoController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private UserInfoService userInfoService;
	  
	  @Resource
	  private SystemConfigService systemConfigService;
	@Resource
	private LoginLogService loginLogService;

	@Resource
	private UserOrganService userOrganService;
	@Resource
	private OrganService organService;

	@PostMapping("/list")
	@ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
	public Result<PageInfo<UserInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
		if(pageQueryInfo.getPageSize()==0) {
			pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
		}
		if(pageQueryInfo.getCurrPage()==0) {
			pageQueryInfo.setCurrPage(1);
		}
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("pageSize",pageQueryInfo.getPageSize());
		map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
		if(pageQueryInfo.getCondition()!=null){
			map.putAll(pageQueryInfo.getCondition());
		}
		List<UserInfo> userInfoList = userInfoService.queryUserInfoPage(map);
		Integer count= userInfoService.queryUserInfoPageCount(map);
		//返回参数
		PageInfo pager=new PageInfo<UserInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), userInfoList);
		return ResultGenerator.genSuccessResult(pager);
	}

	@PostMapping("/add")
	@ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "UserInfo",value = "待添加的UserInfo实例",paramType = "body",dataType = "UserInfo",required = true)
	})
	public Result add(@RequestBody UserInfo userInfo) {
		userInfo.setUserCode(StringUtil.getBillno());
		userInfo.setCreateTime(new Date());
		userInfo.setPassword(MD5Util.MD5Encode("123456", "UTF-8"));
		userInfo.setStatus(1);
		userInfoService.saveUserInfo(userInfo);
		return ResultGenerator.genSuccessResult();
	}

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        UserInfo userInfo = new UserInfo();
	        userInfo.setId(id.intValue());
	        userInfoService.deleteUserInfo(userInfo);
	        return ResultGenerator.genSuccessResult();
	    }

		@PostMapping("/update")
		@ApiOperation(value = "更新数据",notes = "更新数据",httpMethod = "POST")
		@ApiImplicitParams({
				@ApiImplicitParam(name = "UserInfo",value = "更新数据UserInfo实例",paramType = "body",dataType = "UserInfo",required = true)
		})
	    public Result update(@RequestBody UserInfo userInfo) {
    	//根据userCode 修改用户信息
			if(StringUtil.isEmpty(userInfo.getUserCode())) {
				return ResultGenerator.genFailResult("用户名编码不能为空！");
			}
	        userInfoService.updateUserInfo(userInfo);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        UserInfo userInfo = new UserInfo();
	        userInfo.setId(id.intValue());
	        userInfo=userInfoService.queryUserInfo(userInfo);
	        return ResultGenerator.genSuccessResult(userInfo);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    public Result queryOne(@RequestBody UserInfo userInfo) {
	      UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
	        return ResultGenerator.genSuccessResult(userInfoActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "UserInfo",value = "待查询的UserInfo实例",paramType = "body",dataType = "UserInfo",required = true)
	    })
	    public Result queryList(@RequestBody UserInfo userInfo) {
	      List<UserInfo>  userInfoList=userInfoService.queryUserInfoList(userInfo);
	        return ResultGenerator.genSuccessResult(userInfoList);
	    }



	@PostMapping("/login")
	@ApiOperation(value = "登陆",notes = "登陆",httpMethod = "POST")
	@ApiImplicitParams({

	})
	public Result login(@RequestBody UserInfo u, HttpServletRequest request) {
		if(StringUtil.isEmpty(u.getLoginName())||StringUtil.isEmpty(u.getPassword())) {
			return ResultGenerator.genFailResult("用户名密码不能为空！");
		}

		String sessionId=StringUtil.genRandomNum();
		UserInfo userInfo=new UserInfo();
		userInfo.setLoginName(u.getLoginName());
		userInfo.setPassword(u.getPassword());
		UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
		if(userInfoActual==null) {
			return ResultGenerator.genFailResult("用户名或密码错误！");
		}
		//保存用户信息
		String ip=IpUtil.getIp(request);
		//保存用户信息
//		String city = null;
//		try {
//			//获取到公网地址
//			city = IpUtil.getAddressByPublicIP(ip);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResultGenerator.genFailResult("获取用户登录地址失败！");
//		}
		LoginLog loginLog=new LoginLog();
		loginLog.setLoginName(u.getLoginName());
		loginLog.setIp(ip);
//		loginLog.setCity(city);
		loginLog.setCreateDt(new Date());

		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));   //req就是request请求
		Browser browser = userAgent.getBrowser();  //获取浏览器信息
		OperatingSystem os = userAgent.getOperatingSystem(); //获取操作系统信息
		loginLog.setOs(os.getName());
		loginLog.setBrowser(browser.getName());
		loginLog.setRemark("登陆成功");
		loginLogService.saveLoginLog(loginLog);

		Map<String,Object> map=new HashMap<String, Object>();
		map.put("token",sessionId);
		map.put("userInfo", userInfoActual);
		return ResultGenerator.genSuccessResult(map);
	}
	
	
	
	@PostMapping("/updatePwd")
	@ApiOperation(value = "修改密码",notes = "修改密码",httpMethod = "POST")
	public Result updatePwd(@RequestBody UserInfo u, HttpServletRequest request) {
		if(StringUtil.isEmpty(u.getLoginName())) {
			return ResultGenerator.genFailResult("用户名不能为空！");
		}
		
		if(StringUtil.isEmpty(u.getOldPwd())) {
			return ResultGenerator.genFailResult("旧密码不能为空！");
		}
		
		if(StringUtil.isEmpty(u.getPassword())) {
			return ResultGenerator.genFailResult("新密码不能为空！");
		}

		UserInfo userInfo=new UserInfo();
		userInfo.setLoginName(u.getLoginName());
		UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
		if(userInfoActual==null) {
			return ResultGenerator.genFailResult("用户名不存在！");
		}
		if(!MD5Util.MD5Encode(u.getOldPwd(), "utf-8").equals(userInfoActual.getPassword())) {
			return ResultGenerator.genFailResult("旧密码错误");
		}
		
		userInfoActual.setPassword(MD5Util.MD5Encode(u.getPassword(), "utf-8"));
		userInfoService.updateUserInfo(userInfoActual);

		Map<String,Object> map=new HashMap<String, Object>();
		map.put("userInfo", userInfoActual);
		return ResultGenerator.genSuccessResult("修改密码成功");
	}
	
	
	
	@PostMapping("/updateUserLogo")
	@ApiOperation(value = "修改头像",notes = "修改头像",httpMethod = "POST")
	public Result updateUserLogo(@RequestBody UserInfo u, HttpServletRequest request) {
		if(StringUtil.isEmpty(u.getLoginName())) {
			return ResultGenerator.genFailResult("用户名不能为空！");
		}

		UserInfo userInfo=new UserInfo();
		userInfo.setLoginName(u.getLoginName());
		UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
		if(userInfoActual==null) {
			return ResultGenerator.genFailResult("用户名不存在！");
		}
		
		userInfoActual.setLogo(u.getLogo());
		userInfoService.updateUserInfo(userInfoActual);

		Map<String,Object> map=new HashMap<String, Object>();
		map.put("userInfo", userInfoActual);
		return ResultGenerator.genSuccessResult("修改头像成功");
	}
	
	
	    @PostMapping("/uploadXls")
		@ApiOperation(value = "导入人员",notes = "导入人员",httpMethod = "POST")
	    public Result uploadXls(@RequestBody UserInfo u) throws Exception 
	    {
	    	 String url=u.getUrl();
	    	 System.out.println(url+"url===="+url);
			 Map<String, Object> reslut = new HashMap<String, Object>();
			 List<HashMap<String, Object>> readExcel = null;
			 
			 reslut.put("code", 0);
			
			 if(url.endsWith("xls")) {
				 readExcel = ReadExcelUtil.readExcelXLS(url, 2, 0, 0);
			 }
			 if(url.endsWith("xlsx")) {
				 readExcel = ReadExcelUtil.readNewExcelXLS(url, 2, 0, 0);	
			 }
			 if(readExcel!=null&&readExcel.size()>0) {
				 
				int repeatCount=saveBatchUserInfo(readExcel);
				reslut.put("code", 1);
				if(repeatCount==0) {
					reslut.put("message", "成功导入记录"+readExcel.size()+"条");
				}else {
					int count=readExcel.size()-repeatCount;
					reslut.put("message", "成功导入记录"+count+"条");
				}
			 }else {
				 reslut.put("message", "未读取到数据");
			 }
			 return ResultGenerator.genSuccessResult(reslut);
	    }
	 
	 
	 /**
	     * 批量导入人员信息
	     * @param readExcel
	 * @return 
	     */
	    private int saveBatchUserInfo(List<HashMap<String, Object>> readExcel) {
	    	int count=0;
	    	int repeatCount=0;
	    	List<UserInfo> list=new ArrayList<UserInfo>();
	    	//整理数据
			for (HashMap<String, Object> hashMap : readExcel) {
				String familyName = (String) hashMap.get("var0");//姓
				String name = (String) hashMap.get("var1");//名
				String loginName = (String) hashMap.get("var2");//登录账号
				String email = (String) hashMap.get("var3");//邮箱
				String ad = (String) hashMap.get("var4");//AD
				String status = (String) hashMap.get("var5");//状态
				String sex = (String) hashMap.get("var6");//性别
				String phone = (String) hashMap.get("var7");//手机号
				String employeeType = (String) hashMap.get("var8");//员工类型
				
				UserInfo userInfo=new UserInfo();
				userInfo.setLoginName(loginName);
				List<UserInfo> userList=userInfoService.queryUserInfoList(userInfo);
				if(userList!=null&&userList.size()>0) {
					repeatCount++;
				}else {
					UserInfo user=new UserInfo();
					user.setFamilyName(familyName);
					user.setName(name);
					user.setLoginName(loginName);
					user.setEmail(email);
					user.setAd(ad);
					if(!StringUtil.isEmpty(status)) {
						user.setStatus(Integer.parseInt(status));
					}
					user.setSex(sex);
					user.setPhone(phone);
					if(!StringUtil.isEmpty(employeeType)) {
						user.setEmployeeType(Integer.parseInt(employeeType));
					}
					user.setPassword("e10adc3949ba59abbe56e057f20f883e");
					user.setCreateTime(new Date());
					user.setUserCode(StringUtil.genRandomNum());
					list.add(user);
				}
			}
			userInfoService.saveUserInfoBatch(list);
			
			return repeatCount;
		}
	    
	    
	    
	    
	    /**
		 * 导出
		 * 
		 * @throws IOException
		 */
		@PostMapping("/exportUser")
		@ApiOperation(value = "导出人员",notes = "导出人员",httpMethod = "POST")
		public Result exportProduct(String types){
			Map<String, Object> reslut = new HashMap<String, Object>();
			List<UserInfo> userlist=userInfoService.queryUserInfoList(null);
			try {

				ArrayList<String> headInfoList = new ArrayList<String>();
				headInfoList.add("姓");
				headInfoList.add("名");
				headInfoList.add("登录账号");
				headInfoList.add("邮箱");
				headInfoList.add("AD");
				headInfoList.add("状态：1在职   2离职  3产期休假   4代理   5供应商   6外部");
				headInfoList.add("性别   1男  2女");
				headInfoList.add("手机号");
				headInfoList.add("员工类型  1内部员工  2外部员工");

				ArrayList<ArrayList<String>> dataList = new ArrayList<ArrayList<String>>();
				for (UserInfo user : userlist) {

					ArrayList<String> list = new ArrayList<String>();
					
					if(!StringUtil.isEmpty(user.getFamilyName())) {
						list.add(user.getFamilyName());
					}else {
						list.add("----");
					}
					
					if(!StringUtil.isEmpty(user.getName())) {
						list.add(user.getName());
					}else {
						list.add("----");
					}
					if(!StringUtil.isEmpty(user.getLoginName())) {
						list.add(user.getLoginName());
					}else {
						list.add("----");
					}
					
					if(!StringUtil.isEmpty(user.getEmail())) {
						list.add(user.getEmail());
					}else {
						list.add("----");
					}
					
					
					
					
					if(!StringUtil.isEmpty(user.getAd())) {
						list.add(user.getAd());
					}else {
						list.add("----");
					}
					
					
					
					if(user.getStatus()!=null) {
						list.add(user.getStatus()+"");
					}else {
						list.add("----");
					}
					
					if(!StringUtil.isEmpty(user.getSex())) {
						list.add(user.getSex());
					}else {
						list.add("----");
					}
					
					
					if(!StringUtil.isEmpty(user.getPhone())) {
						list.add(user.getPhone());
					}else {
						list.add("----");
					}
					
					if(user.getEmployeeType()!=null) {
						list.add(user.getEmployeeType()+"");
					}else {
						list.add("----");
					}
					
					dataList.add(list);
				}

				String fileName = "file_" + StringUtil.getBillno() + ".xlsx";
				String uploadPath = systemConfigService.querySystemConfigValue("upload_save_path");
				String visitPath = systemConfigService.querySystemConfigValue("upload_visit_path");
				Properties prop = System.getProperties();
				String os = prop.getProperty("os.name");
				if (os.startsWith("win") || os.startsWith("Win")) {
					// windows目录
					uploadPath = "D:\\images";// 测试
					visitPath = "http://127.0.0.1";
				}
				String path = uploadPath + "/" + fileName;
				ExportExcelUtil.exportExcelFilePath("人员信息", path, headInfoList, dataList);
				path = visitPath + "/" + fileName;

				reslut.put("code", "1");
				reslut.put("msg", "导出成功!");
				reslut.put("data", path);
			} catch (Exception e) {
				reslut.put("code", "0");
				reslut.put("msg", "系统异常");
				e.printStackTrace();
			}

			return ResultGenerator.genSuccessResult(reslut);
		}

}

