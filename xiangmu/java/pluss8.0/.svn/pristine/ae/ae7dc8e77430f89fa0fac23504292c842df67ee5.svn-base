package cn.pluss.platform.configurer.extend;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import cn.pluss.platform.model.vo.BaseUser;


public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver{

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		BaseUser user = (BaseUser) webRequest.getAttribute("currentUser", RequestAttributes.SCOPE_REQUEST);
        if (user == null) {
            throw new Exception("获取用户信息失败");
        }
        return user;
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		 return parameter.getParameterType().isAssignableFrom(BaseUser.class);
	}

}
