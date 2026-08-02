package cn.pluss.platform.controller.home;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.model.auth.SystemConfig;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pluss.platform.util.SpringHelper;

@Controller
@RequestMapping("platform")
public class HomeController {
	@Autowired
	private SystemConfigService systemConfigService;
	
	
    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
    	
    	List<SystemConfig> systemConfigList=((SystemConfigService)SpringHelper.getSpringHelper().getBean("systemConfigService")).querySystemConfigList(null);
    	request.setAttribute("systemConfigList", systemConfigList);
        return "index/index";
    }
    @RequestMapping(value = "/first", method = RequestMethod.GET)
	public String first() {
		
		System.out.println(111);
		return "index/first";
	}
    
   
    
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login() {
    	
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 2);
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
       
        // 执行认证登陆
        try {
            subject.logout();
    		result.put("result", 1);
    		result.put("url", "/login");
        } catch (Exception uae) {
        }

        return result;
    }
    
  
}
