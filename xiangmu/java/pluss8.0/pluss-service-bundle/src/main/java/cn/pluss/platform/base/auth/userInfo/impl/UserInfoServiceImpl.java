package cn.pluss.platform.base.auth.userInfo.impl;

import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.mapper.base.auth.RoleInfoMapper;
import cn.pluss.platform.mapper.base.auth.RoleUserInfoMapper;
import cn.pluss.platform.mapper.base.auth.UserInfoMapper;
import cn.pluss.platform.model.auth.RoleInfo;
import cn.pluss.platform.model.auth.RoleUserInfo;
import cn.pluss.platform.model.auth.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Transactional
@Service("userInfoService")
public class UserInfoServiceImpl  implements UserInfoService {

	 private static final Logger logger = LoggerFactory.getLogger( UserInfoServiceImpl.class);


    @Autowired
	  private UserInfoMapper userInfoMapper;

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Autowired
    private RoleUserInfoMapper roleUserInfoMapper;


    @Override
    public UserInfo queryUserInfo(UserInfo userInfo){
        return userInfoMapper.queryUserInfo(userInfo);
    }

    @Override
    public List<UserInfo> queryUserInfoList(UserInfo userInfo){
        return userInfoMapper.queryUserInfoList(userInfo);
    }
    @Override
    public void saveUserInfo(UserInfo userInfo){
          userInfoMapper.saveUserInfo(userInfo);
    }
    @Override
    public void updateUserInfo(UserInfo userInfo){
        userInfoMapper.updateUserInfo(userInfo);
    }
    @Override
    public void deleteUserInfo(UserInfo userInfo){
        userInfoMapper.deleteUserInfo(userInfo);
    }
    @Override
    public List<UserInfo> queryUserInfoPage(Map map){
        return userInfoMapper.queryUserInfoPage(map);
    }
    @Override
    public Integer queryUserInfoPageCount(Map map){
        return userInfoMapper.queryUserInfoPageCount(map);
    }
    @Override
    public void saveUserInfoBatch(List<UserInfo> userInfoList) {
         userInfoMapper.saveUserInfoBatch(userInfoList);
    }
    @Override
    public void deleteUserInfoBatch(List<String> list) {
         userInfoMapper.deleteUserInfoBatch(list);
    }

    @Override
    public Object getEmployeeStatistics() {
        // 员工总数
        List<UserInfo> userList = userInfoMapper.queryUserInfoList(new UserInfo());
        int total = userList == null ? 0 : userList.size();

        // 查询所有角色
        List<RoleInfo> roleList = roleInfoMapper.queryRoleInfoList(new RoleInfo());

        // 查询所有 角色-用户 关联
        List<RoleUserInfo> roleUserList = roleUserInfoMapper.queryRoleUserInfoList(new RoleUserInfo());

        // roleCode -> 角色名称
        Map<String, String> roleNameMap = new LinkedHashMap<>();
        if (roleList != null) {
            for (RoleInfo role : roleList) {
                roleNameMap.put(role.getRoleCode(),
                        role.getName() != null ? role.getName() : "未知角色");
            }
        }

        //roleCode -> 人数
        Map<String, Long> roleCountMap = (roleUserList == null || roleUserList.isEmpty())
                ? Collections.emptyMap()
                : roleUserList.stream().collect(Collectors.groupingBy(
                        ru -> ru.getRoleCode() != null ? ru.getRoleCode() : "",
                        Collectors.counting()));

        // 遍历所有角色，组装 count + ratio
        List<Map<String, Object>> roleStats = new ArrayList<>();
        for (Map.Entry<String, String> entry : roleNameMap.entrySet()) {
            long count = roleCountMap.getOrDefault(entry.getKey(), 0L);
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("name", entry.getValue());
            item.put("count", count);
            item.put("ratio", (total > 0 ? Math.round(count * 10000.0 / total) / 100.0 : 0)+"%");
            roleStats.add(item);
        }


        Map<String, Object> result = new LinkedHashMap<>();
        result.put("total", total);
        result.put("roles", roleStats);
        return result;
    }

}

