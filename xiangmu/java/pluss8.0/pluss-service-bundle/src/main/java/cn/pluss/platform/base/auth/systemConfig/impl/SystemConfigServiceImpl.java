package cn.pluss.platform.base.auth.systemConfig.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.SystemConfig;
import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.mapper.SystemConfigMapper;

@Transactional
@Service("systemConfigService")
public class SystemConfigServiceImpl  implements SystemConfigService{

	 private static final Logger logger = LoggerFactory.getLogger( SystemConfigServiceImpl.class);


    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public SystemConfig querySystemConfig(SystemConfig systemConfig){
        return systemConfigMapper.querySystemConfig(systemConfig);
    }

    @Override
    public List<SystemConfig> querySystemConfigList(SystemConfig systemConfig){
        return systemConfigMapper.querySystemConfigList(systemConfig);
    }
    @Override
    public void saveSystemConfig(SystemConfig systemConfig){
          systemConfigMapper.saveSystemConfig(systemConfig);
    }
    @Override
    public void updateSystemConfig(SystemConfig systemConfig){
        systemConfigMapper.updateSystemConfig(systemConfig);
    }
    @Override
    public void deleteSystemConfig(SystemConfig systemConfig){
        systemConfigMapper.deleteSystemConfig(systemConfig);
    }
    @Override
    public List<SystemConfig> querySystemConfigPage(Map map){
        return systemConfigMapper.querySystemConfigPage(map);
    }
    @Override
    public Integer querySystemConfigPageCount(Map map){
        return systemConfigMapper.querySystemConfigPageCount(map);
    }
    @Override
    public void saveSystemConfigBatch(List<SystemConfig> systemConfigList) {
         systemConfigMapper.saveSystemConfigBatch(systemConfigList);
    }
    @Override
    public void deleteSystemConfigBatch(List<String> list) {

        systemConfigMapper.deleteSystemConfigBatch(list);
    }
    
    @Override
	public String querySystemConfigValue(String key) {
		SystemConfig systemConfig=new SystemConfig();
		systemConfig.setPropertyKey(key);
		systemConfig=systemConfigMapper.querySystemConfig(systemConfig);
		if(systemConfig==null) {
			return "";
		}
		return systemConfig.getPropertyValue();
	}
}

