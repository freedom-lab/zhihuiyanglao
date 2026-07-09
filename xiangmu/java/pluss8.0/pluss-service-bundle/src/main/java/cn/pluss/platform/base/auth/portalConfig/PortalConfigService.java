package cn.pluss.platform.base.auth.portalConfig;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.auth.PortalConfig;

public interface PortalConfigService {

    public PortalConfig queryPortalConfig(PortalConfig portalConfig);

    public List<PortalConfig> queryPortalConfigList(PortalConfig portalConfig);

    public void savePortalConfig(PortalConfig portalConfig);

    public void updatePortalConfig(PortalConfig portalConfig);

    public void deletePortalConfig(PortalConfig portalConfig);

    public List<PortalConfig> queryPortalConfigPage(Map map);

    public Integer queryPortalConfigPageCount(Map map);

    public void savePortalConfigBatch(List<PortalConfig> portalConfigList);

    public void deletePortalConfigBatch(List<String> list);
}

