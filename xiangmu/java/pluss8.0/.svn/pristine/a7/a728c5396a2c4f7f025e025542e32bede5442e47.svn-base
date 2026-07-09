package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.model.vo.Ticket;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.util.StringUtil;
import cn.pluss.platform.util.SystemConfigUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/auth")
@Api(value = "鉴权控制类",tags={"用户鉴权"})
public class UserAuthController {

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private UserInfoService userInfoService;
	  
	    @PostMapping("/genTicket")
	    @ApiOperation(value = "票据生成",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    })
	    public Result<String> genTicket(@RequestBody Ticket ticket) {
	    
	    	if(StringUtil.isEmpty(ticket.getLoginName())) {
	    		return ResultGenerator.genFailResult("登录名为空");
	    	}
	    	//判断用户是否存在
	    	UserInfo userInfo=new UserInfo();
	    	userInfo.setLoginName(ticket.getLoginName());
	        UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
	     	if(userInfoActual==null) {
	    		return ResultGenerator.genFailResult("该用户不存在");
	    	}
	    	
	    	String ticketKey=UUID.randomUUID().toString().replace("-", "");
	    	Ticket t=new Ticket();
	    	t.setTicket(ticketKey);
	    	t.setGenDate(new Date());
	    	t.setLoginName(ticket.getLoginName());
	    	ProjectConstant.TICKET_STORAGE.put(ticketKey, t);
	        return ResultGenerator.genSuccessResult(ticketKey);
	    }
	    
	    @PostMapping("/checkTicket")
	    @ApiOperation(value = "用户鉴权",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    })
	    public Result<UserInfo> checkTicket(@RequestBody Ticket ticket) {
	    
	    	if(StringUtil.isEmpty(ticket.getTicket())) {
	    		return ResultGenerator.genFailResult("登录票据不能为空");
	    	}
	    	//验证ticket是否存在
	    	Ticket t=ProjectConstant.TICKET_STORAGE.get(ticket.getTicket());
	    	if(t==null) {
	      		return ResultGenerator.genFailResult("登录票据不存在");
	    	}
	    	//验证ticket失效
	    	long length=(new Date().getTime()-t.getGenDate().getTime())/1000;
	    	long invalidLength=Long.valueOf(SystemConfigUtil.getSingleProperty("TICKET_INVIAD_LENGTH").getPropertyValue());
	    	//清除票据
	    	ProjectConstant.TICKET_STORAGE.remove(ticket.getTicket());
	    	//判断时效
	    	if(length>invalidLength) {
	    		return ResultGenerator.genFailResult("当前票据已失效");
	    	}
	    	//ticket验证通过返回用户信息
	    	UserInfo userInfo=new UserInfo();
	    	userInfo.setLoginName(t.getLoginName());
	        UserInfo  userInfoActual=userInfoService.queryUserInfo(userInfo);
	        return ResultGenerator.genSuccessResult(userInfoActual);
	    }
	    
	    @PostMapping("/queryTicketStorageStatus")
	    @ApiOperation(value = "查询票据池状态",notes = "查询票据池状态",httpMethod = "POST")
	    @ApiImplicitParams({
	    })
	    public Result<String> queryTicketStorageStatus() {
	  
	    	String str="当前票据池长度:"+ProjectConstant.TICKET_STORAGE.size();
	        return ResultGenerator.genSuccessResult(str);
	    }
	    
	    @PostMapping("/clearTicketStorage")
	    @ApiOperation(value = "清空票据池",notes = "情况票据池",httpMethod = "POST")
	    @ApiImplicitParams({
	    })
	    public Result<String> clearTicketStorage() {
	    	ProjectConstant.TICKET_STORAGE.clear();
	    	String str="清空票据池成功";
	        return ResultGenerator.genSuccessResult(str);
	    }
}
