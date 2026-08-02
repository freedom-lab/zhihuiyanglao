package cn.pluss.platform.base.auth.roleInfo.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.RoleInfo;
import cn.pluss.platform.base.auth.roleInfo.RoleInfoService;
import cn.pluss.platform.mapper.base.auth.RoleInfoMapper;

@Transactional
@Service("roleInfoService")
public class RoleInfoServiceImpl  implements RoleInfoService{

	 private static final Logger logger = LoggerFactory.getLogger( RoleInfoServiceImpl.class);


    @Autowired
	  private RoleInfoMapper roleInfoMapper;

    @Override
    public RoleInfo queryRoleInfo(RoleInfo roleInfo){
        return roleInfoMapper.queryRoleInfo(roleInfo);
    }

    @Override
    public List<RoleInfo> queryRoleInfoList(RoleInfo roleInfo){
        return roleInfoMapper.queryRoleInfoList(roleInfo);
    }
    @Override
    public void saveRoleInfo(RoleInfo roleInfo){
          roleInfoMapper.saveRoleInfo(roleInfo);
    }
    @Override
    public void updateRoleInfo(RoleInfo roleInfo){
        roleInfoMapper.updateRoleInfo(roleInfo);
    }
    @Override
    public void deleteRoleInfo(RoleInfo roleInfo){
        roleInfoMapper.deleteRoleInfo(roleInfo);
    }
    @Override
    public List<RoleInfo> queryRoleInfoPage(Map map){
        return roleInfoMapper.queryRoleInfoPage(map);
    }
    @Override
    public Integer queryRoleInfoPageCount(Map map){
        return roleInfoMapper.queryRoleInfoPageCount(map);
    }
    @Override
    public void saveRoleInfoBatch(List<RoleInfo> roleInfoList) {
         roleInfoMapper.saveRoleInfoBatch(roleInfoList);
    }
    @Override
    public void deleteRoleInfoBatch(List<String> list) {
         roleInfoMapper.deleteRoleInfoBatch(list);
    }
}

