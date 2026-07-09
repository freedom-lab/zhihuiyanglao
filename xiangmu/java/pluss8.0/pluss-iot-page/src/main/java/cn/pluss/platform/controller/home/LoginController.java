package cn.pluss.platform.controller.home;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    /**
    *引导页
    * @return
    */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
   
        return "index/login";
    }
    
    
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(@RequestParam("loginName") String username, @RequestParam("password") String password) {
    	
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 2);
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
    		result.put("result", 1);
    		result.put("redirectUri", "/platform/console");
        } catch (Exception uae) {
    		result.put("message", "用户名或者密码错误");
        }

        return result;
    }

    
    
    

}
