package cn.pluss.platform.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import cn.pluss.platform.base.coding.srobot.inf.SrobotService;
import cn.pluss.platform.base.coding.tableDdl.TableDdlService;
import cn.pluss.platform.model.auth.SystemConfig;
import cn.pluss.platform.model.coding.TableDdl;
import cn.pluss.platform.util.DBUtil;
import cn.pluss.platform.util.StringUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.util.SpringHelper;
import cn.pluss.platform.util.SystemConfigUtil;

@WebListener
public class ContextListener implements ServletContextListener{
	
	private ServletContext servletContext;
	@Value("${spring.datasource.url}")
	public String dbUrl;

	public void contextInitialized(ServletContextEvent event) {
		servletContext = event.getServletContext();
		//初始化spring
		this.initSpringHelper(event);
		//初始化数据库脚本
		initDB();
		// 初始化数据库系统参数
		initSystemConfig();

	}

	/**
	 * 判断数据库是否已初始化了
	 *
	 */
	private void initDB() {
		 SrobotService srobotService = (SrobotService) SpringHelper.getSpringHelper().getBean("srobotService");

		String dbName=getDbInfo("db");
		String tableName="tb_yunlankeji_system_config";
		String isExsits=srobotService.isTargetTableExistInDB(dbName,tableName);
		if(StringUtil.isEmpty(isExsits)){
			//初始化数据库脚本
			try {
				doInitDB();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 初始化数据库脚本
	 */
	private void doInitDB() throws Exception {
		//读取数据库文件
		String dbFilePath=this.getClass().getResource("/").getPath()+"init_db.sql";
		List<String> sqlList=DBUtil.loadSql(dbFilePath);
		 TableDdlService tableDdlService = (TableDdlService) SpringHelper.getSpringHelper().getBean("tableDdlService");

		//执行sql
		for (String sql:sqlList) {
			TableDdl ddl=new TableDdl();
			ddl.setDdl(sql);
			tableDdlService.execSql(ddl);
		}

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

	/**
	 * 根据dburl 获取对于的数据库信息
	 * @param key
	 * @return
	 */
	public String getDbInfo(String key){

		String value="";
		String keyInfo=dbUrl.split("\\?")[0];
		String[]  dbInfoArray=keyInfo.split("\\/");
		String[] keyArray=dbInfoArray[2].split(":");
		if("ip".equals(key)){
			value=keyArray[0];
		}else if("port".equals(key)){
			value=keyArray[1];
		}else if("db".equals(key)){
			value=dbInfoArray[dbInfoArray.length-1];
		}
		return value;
	}


}
