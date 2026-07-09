package cn.pluss.platform.base.auth.roleMenuInfo.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.roleMenuInfo.RoleMenuInfoService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.RoleMenuInfo;
import cn.pluss.platform.mapper.base.auth.RoleMenuInfoMapper;

@Transactional
@Service("roleMenuInfoService")
public class RoleMenuInfoServiceImpl  implements RoleMenuInfoService {

	 private static final Logger logger = LoggerFactory.getLogger( RoleMenuInfoServiceImpl.class);


    @Autowired
	  private RoleMenuInfoMapper roleMenuInfoMapper;

    @Override
    public RoleMenuInfo queryRoleMenuInfo(RoleMenuInfo roleMenuInfo){
        return roleMenuInfoMapper.queryRoleMenuInfo(roleMenuInfo);
    }

    @Override
    public List<RoleMenuInfo> queryRoleMenuInfoList(RoleMenuInfo roleMenuInfo){
        return roleMenuInfoMapper.queryRoleMenuInfoList(roleMenuInfo);
    }
    @Override
    public void saveRoleMenuInfo(RoleMenuInfo roleMenuInfo){
          roleMenuInfoMapper.saveRoleMenuInfo(roleMenuInfo);
    }
    @Override
    public void updateRoleMenuInfo(RoleMenuInfo roleMenuInfo){
        roleMenuInfoMapper.updateRoleMenuInfo(roleMenuInfo);
    }
    @Override
    public void deleteRoleMenuInfo(RoleMenuInfo roleMenuInfo){
        roleMenuInfoMapper.deleteRoleMenuInfo(roleMenuInfo);
    }
    @Override
    public List<RoleMenuInfo> queryRoleMenuInfoPage(Map map){
        return roleMenuInfoMapper.queryRoleMenuInfoPage(map);
    }
    @Override
    public Integer queryRoleMenuInfoPageCount(Map map){
        return roleMenuInfoMapper.queryRoleMenuInfoPageCount(map);
    }
    @Override
    public void saveRoleMenuInfoBatch(List<RoleMenuInfo> roleMenuInfoList) {
         roleMenuInfoMapper.saveRoleMenuInfoBatch(roleMenuInfoList);
    }
    @Override
    public void deleteRoleMenuInfoBatch(List<String> list) {
         roleMenuInfoMapper.deleteRoleMenuInfoBatch(list);
    }

	@Override
	public void deleteRoleMenuInfoByRoleCode(RoleMenuInfo roleMenuInfo) {
		 roleMenuInfoMapper.deleteRoleMenuInfoByRoleCode(roleMenuInfo);
		
	}
}

