package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.RoleUserInfo;

@Mapper
public interface RoleUserInfoMapper {

    public RoleUserInfo queryRoleUserInfo(RoleUserInfo roleUserInfo);

    public List<RoleUserInfo> queryRoleUserInfoList(RoleUserInfo roleUserInfo);

    public void saveRoleUserInfo(RoleUserInfo roleUserInfo);

    public void updateRoleUserInfo(RoleUserInfo roleUserInfo);

    public void deleteRoleUserInfo(RoleUserInfo roleUserInfo);

    public List<RoleUserInfo> queryRoleUserInfoPage(Map map);

    public Integer queryRoleUserInfoPageCount(Map map);

    public void saveRoleUserInfoBatch(List<RoleUserInfo>  roleUserInfoList);

    public void deleteRoleUserInfoBatch(List<String> list);
    
    public void deleteRoleUserInfoByRoleCode(RoleUserInfo roleUserInfo);
    
}

