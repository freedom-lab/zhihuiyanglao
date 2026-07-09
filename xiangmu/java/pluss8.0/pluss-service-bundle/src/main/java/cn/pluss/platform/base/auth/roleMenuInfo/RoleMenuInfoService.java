package cn.pluss.platform.base.auth.roleMenuInfo;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.auth.RoleMenuInfo;

public interface RoleMenuInfoService {

    public RoleMenuInfo queryRoleMenuInfo(RoleMenuInfo roleMenuInfo);

    public List<RoleMenuInfo> queryRoleMenuInfoList(RoleMenuInfo roleMenuInfo);

    public void saveRoleMenuInfo(RoleMenuInfo roleMenuInfo);

    public void updateRoleMenuInfo(RoleMenuInfo roleMenuInfo);

    public void deleteRoleMenuInfo(RoleMenuInfo roleMenuInfo);

    public List<RoleMenuInfo> queryRoleMenuInfoPage(Map map);

    public Integer queryRoleMenuInfoPageCount(Map map);

    public void saveRoleMenuInfoBatch(List<RoleMenuInfo> roleMenuInfoList);

    public void deleteRoleMenuInfoBatch(List<String> list);
    
    public void deleteRoleMenuInfoByRoleCode(RoleMenuInfo roleMenuInfo);
}

