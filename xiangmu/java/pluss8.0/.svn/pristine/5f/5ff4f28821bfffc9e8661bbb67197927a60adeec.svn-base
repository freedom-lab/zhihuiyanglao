package cn.pluss.platform.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.SystemConfig;

@Mapper
public interface SystemConfigMapper {

    public SystemConfig querySystemConfig(SystemConfig systemConfig);

    public List<SystemConfig> querySystemConfigList(SystemConfig systemConfig);

    public void saveSystemConfig(SystemConfig systemConfig);

    public void updateSystemConfig(SystemConfig systemConfig);

    public void deleteSystemConfig(SystemConfig systemConfig);

    public List<SystemConfig> querySystemConfigPage(Map map);

    public Integer querySystemConfigPageCount(Map map);

    public void saveSystemConfigBatch(List<SystemConfig>  systemConfigList);

    public void deleteSystemConfigBatch(List<String> list);

}


