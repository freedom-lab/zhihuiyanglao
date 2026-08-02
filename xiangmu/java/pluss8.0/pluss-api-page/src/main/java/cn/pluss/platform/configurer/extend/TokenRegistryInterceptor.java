package cn.pluss.platform.configurer.extend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.alibaba.fastjson.JSON;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultCode;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.vo.BaseUser;
import cn.pluss.platform.util.ComUtil;

public class TokenRegistryInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = LoggerFactory.getLogger(TokenRegistryInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String requestToken = request.getHeader("token");
		String requestSource = request.getHeader("source");//所属系统
		// 验证Pass注解
		boolean pass = verificationPassAnnotation(request, response, handler,requestToken);
		if(pass){
			return true;
		}
		boolean token = false;
		synchronized(this) {
			token = validateSign(request,requestToken,requestSource);
		}
		if(token){
			return true;
		}else{
			logger.warn("签名认证失败，请求接口：{}，请求IP：{}，请求参数：{}",request.getRequestURI(), ComUtil.getIpAddress(request), JSON.toJSONString(request.getParameterMap()));
            Result result = new Result();
            result.setCode(ResultCode.NOT_TOKEN).setMessage("TOKEN丢失，请检查");
            ComUtil.responseResult(response, result);
            return false;
		}
	}
	
	private boolean verificationPassAnnotation(HttpServletRequest request,HttpServletResponse response, Object handler,String requestToken) throws Exception {
 		for(String urlMethod : ProjectConstant.METHOD_URL_SET) {
			String[] split = urlMethod.split(":--:");
			if (split[0].equals(request.getRequestURI()) && (split[1].equals(request.getMethod()) || split[1].equals("RequestMapping"))) {
				ProjectConstant.isPass = true;
				if (ComUtil.isEmpty(requestToken)) {
					// 如果当前url不需要认证，则注入当前登录用户时，给一个空的
					request.setAttribute("currentUser", new BaseUser());
					return true;
				} else {
					super.preHandle(request, response, handler);
				}
			}
			if(StringUtils.countMatches(urlMethod, "{")>0 && StringUtils.countMatches(urlMethod, "/") == StringUtils.countMatches(split[0], "/")  && (split[1].equals(request.getMethod()) || split[1].equals("RequestMapping"))){
                if(isSameUrl(split[0],request.getRequestURI())){
                	ProjectConstant.isPass = true;
                    if(ComUtil.isEmpty(requestToken)){
                    	request.setAttribute("currentUser",new BaseUser());
                        return true;
                    }else {
                    	super.preHandle(request, response, handler);
                    }
                }
            }
		}
        return false;
    }
	

	/**
	 * 此处处理 当前token
	 * 获取的是微信openId，需通过openId库查找，若查找到对应的用户怎通过并查询用户放入seesion.否则先新增一条用户数据
	 */
	private synchronized boolean validateSign(HttpServletRequest request,String requestToken,String requestSource) {
		return true;// 比较
	}

	private boolean isSameUrl(String localUrl, String requestUrl) {
		String[] tempLocalUrls = localUrl.split("/");
		String[] tempRequestUrls = requestUrl.split("/");
		if (tempLocalUrls.length != tempRequestUrls.length) {
			return false;
		}
		StringBuilder sbLocalUrl = new StringBuilder();
		StringBuilder sbRequestUrl = new StringBuilder();
		for (int i = 0; i < tempLocalUrls.length; i++) {
			if (StringUtils.countMatches(tempLocalUrls[i], "{") > 0) {
				tempLocalUrls[i] = "*";
				tempRequestUrls[i] = "*";
			}
			sbLocalUrl.append(tempLocalUrls[i] + "/");
			sbRequestUrl.append(tempRequestUrls[i] + "/");
		}
		return sbLocalUrl.toString().trim().equals(sbRequestUrl.toString().trim());
	}
}
