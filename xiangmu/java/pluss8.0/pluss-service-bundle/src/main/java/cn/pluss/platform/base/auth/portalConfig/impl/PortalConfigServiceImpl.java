package cn.pluss.platform.base.auth.portalConfig.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.portalConfig.PortalConfigService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.PortalConfig;
import cn.pluss.platform.mapper.base.auth.PortalConfigMapper;

@Transactional
@Service("portalConfigService")
public class PortalConfigServiceImpl  implements PortalConfigService {

	 private static final Logger logger = LoggerFactory.getLogger( PortalConfigServiceImpl.class);


    @Autowired
	  private PortalConfigMapper portalConfigMapper;

    @Override
    public PortalConfig queryPortalConfig(PortalConfig portalConfig){
        return portalConfigMapper.queryPortalConfig(portalConfig);
    }

    @Override
    public List<PortalConfig> queryPortalConfigList(PortalConfig portalConfig){
        return portalConfigMapper.queryPortalConfigList(portalConfig);
    }
    @Override
    public void savePortalConfig(PortalConfig portalConfig){
          portalConfigMapper.savePortalConfig(portalConfig);
    }
    @Override
    public void updatePortalConfig(PortalConfig portalConfig){
        portalConfigMapper.updatePortalConfig(portalConfig);
    }
    @Override
    public void deletePortalConfig(PortalConfig portalConfig){
        portalConfigMapper.deletePortalConfig(portalConfig);
    }
    @Override
    public List<PortalConfig> queryPortalConfigPage(Map map){
        return portalConfigMapper.queryPortalConfigPage(map);
    }
    @Override
    public Integer queryPortalConfigPageCount(Map map){
        return portalConfigMapper.queryPortalConfigPageCount(map);
    }
    @Override
    public void savePortalConfigBatch(List<PortalConfig> portalConfigList) {
         portalConfigMapper.savePortalConfigBatch(portalConfigList);
    }
    @Override
    public void deletePortalConfigBatch(List<String> list) {
         portalConfigMapper.deletePortalConfigBatch(list);
    }
}

