package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.RoleInfo;

@Mapper
public interface RoleInfoMapper {

    public RoleInfo queryRoleInfo(RoleInfo roleInfo);

    public List<RoleInfo> queryRoleInfoList(RoleInfo roleInfo);

    public void saveRoleInfo(RoleInfo roleInfo);

    public void updateRoleInfo(RoleInfo roleInfo);

    public void deleteRoleInfo(RoleInfo roleInfo);

    public List<RoleInfo> queryRoleInfoPage(Map map);

    public Integer queryRoleInfoPageCount(Map map);

    public void saveRoleInfoBatch(List<RoleInfo>  roleInfoList);

    public void deleteRoleInfoBatch(List<String> list);
}

