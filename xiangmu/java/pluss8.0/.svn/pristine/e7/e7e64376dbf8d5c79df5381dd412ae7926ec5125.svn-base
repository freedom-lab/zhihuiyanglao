package cn.pluss.platform.base.auth.roleUserInfo.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.roleUserInfo.RoleUserInfoService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.RoleUserInfo;
import cn.pluss.platform.mapper.base.auth.RoleUserInfoMapper;

@Transactional
@Service("roleUserInfoService")
public class RoleUserInfoServiceImpl  implements RoleUserInfoService {

	 private static final Logger logger = LoggerFactory.getLogger( RoleUserInfoServiceImpl.class);


    @Autowired
	  private RoleUserInfoMapper roleUserInfoMapper;

    @Override
    public RoleUserInfo queryRoleUserInfo(RoleUserInfo roleUserInfo){
        return roleUserInfoMapper.queryRoleUserInfo(roleUserInfo);
    }

    @Override
    public List<RoleUserInfo> queryRoleUserInfoList(RoleUserInfo roleUserInfo){
        return roleUserInfoMapper.queryRoleUserInfoList(roleUserInfo);
    }
    @Override
    public void saveRoleUserInfo(RoleUserInfo roleUserInfo){
          roleUserInfoMapper.saveRoleUserInfo(roleUserInfo);
    }
    @Override
    public void updateRoleUserInfo(RoleUserInfo roleUserInfo){
        roleUserInfoMapper.updateRoleUserInfo(roleUserInfo);
    }
    @Override
    public void deleteRoleUserInfo(RoleUserInfo roleUserInfo){
        roleUserInfoMapper.deleteRoleUserInfo(roleUserInfo);
    }
    @Override
    public List<RoleUserInfo> queryRoleUserInfoPage(Map map){
        return roleUserInfoMapper.queryRoleUserInfoPage(map);
    }
    @Override
    public Integer queryRoleUserInfoPageCount(Map map){
        return roleUserInfoMapper.queryRoleUserInfoPageCount(map);
    }
    @Override
    public void saveRoleUserInfoBatch(List<RoleUserInfo> roleUserInfoList) {
         roleUserInfoMapper.saveRoleUserInfoBatch(roleUserInfoList);
    }
    @Override
    public void deleteRoleUserInfoBatch(List<String> list) {
         roleUserInfoMapper.deleteRoleUserInfoBatch(list);
    }

	@Override
	public void deleteRoleUserInfoByRoleCode(RoleUserInfo roleUserInfo) {
		 roleUserInfoMapper.deleteRoleUserInfoByRoleCode(roleUserInfo);
	}
}

