package cn.pluss.platform.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.pluss.platform.configurer.extend.AllExceptionResolver;
import cn.pluss.platform.configurer.extend.CurrentUserMethodArgumentResolver;
import cn.pluss.platform.configurer.extend.FastJsonHttpMessageConverterEx;
import cn.pluss.platform.configurer.extend.TokenRegistryInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Spring MVC 配置
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {


	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(currentUserMethodArgumentResolver());
	}

	// 使用阿里 FastJson 作为JSON MessageConverter
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(fastJsonHttpMessageConverterEx());
	}

	// 统一异常处理
	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		exceptionResolvers.add(allExceptionResolver());
	}

	// 解决跨域问题
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowedHeaders("*");
	}

	// 添加拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 接口签名认证拦截器，该签名认证比较简单，实际项目中可以使用Json Web Token或其他更好的方式替代。
		List<String> excludes = new ArrayList<String>();
		excludes.add("/webjars/**");
		excludes.add("/doc.html");
		excludes.add("/swagger-resources");
		registry.addInterceptor(tokenRegistryInterceptor()).excludePathPatterns(excludes); 
	}
	

	@Bean
	public TokenRegistryInterceptor tokenRegistryInterceptor() {
		return new TokenRegistryInterceptor();
	}

	@Bean
	public AllExceptionResolver allExceptionResolver() {
		return new AllExceptionResolver();
	}

	@Bean
	public CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver() {
		return new CurrentUserMethodArgumentResolver();
	}

	@Bean
	public FastJsonHttpMessageConverterEx fastJsonHttpMessageConverterEx() {
		return new FastJsonHttpMessageConverterEx();
	}
}
