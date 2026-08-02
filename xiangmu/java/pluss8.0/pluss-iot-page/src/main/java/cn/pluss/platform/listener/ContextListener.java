package cn.pluss.platform.listener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//import cn.pluss.platform.model.entity.SystemConfig;
//import com.yunlankeji.im.server.main.YunlankejiImServer;
import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.model.auth.SystemConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

//import cn.pluss.platform.chat.MessageHandler;
//import cn.pluss.platform.systemConfig.SystemConfigService;
import cn.pluss.platform.util.SpringHelper;
import cn.pluss.platform.util.SystemConfigUtil;

@WebListener
public class ContextListener implements ServletContextListener{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private ServletContext servletContext;


	public void contextInitialized(ServletContextEvent event) {
		servletContext = event.getServletContext();
		//初始化spring
		this.initSpringHelper(event);
		// 初始化数据库系统参数
		initSystemConfig();

	}


	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}
	
	

	
	
	public void initSpringHelper(ServletContextEvent event) {
		ApplicationContext springContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(event.getServletContext());
		SpringHelper.getSpringHelper().initApplicationContext(springContext);
	}
	
	/**
	 * 初始化数据库系统参数
	 */
	private void initSystemConfig() {
		SystemConfigService systemConfigService = (SystemConfigService) SpringHelper
				.getSpringHelper().getBean("systemConfigService");
		// 获取所有的系统配置
		List<SystemConfig> systemConfigList = systemConfigService
				.querySystemConfigList(null);
		Map<String, List<SystemConfig>> systemConfigMap = SystemConfigUtil
				.getSystemConfigMap();
		for (SystemConfig systemConfig : systemConfigList) {
			String key = systemConfig.getPropertyKey();
			List<SystemConfig> list = systemConfigMap.get(key);
			if (list == null) {
				list = new ArrayList<SystemConfig>();
				systemConfigMap.put(key, list);
			}
			list.add(systemConfig);
		}
		SystemConfigUtil.setSystemConfigMap(systemConfigMap);
	}

}
