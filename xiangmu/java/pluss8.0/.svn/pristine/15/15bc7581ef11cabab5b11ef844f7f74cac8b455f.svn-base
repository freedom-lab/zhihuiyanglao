package cn.pluss.platform.mapper.base.auth;

import cn.pluss.platform.model.auth.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserInfoMapper {

    public UserInfo queryUserInfo(UserInfo userInfo);

    public List<UserInfo> queryUserInfoList(UserInfo userInfo);

    public void saveUserInfo(UserInfo userInfo);

    public void updateUserInfo(UserInfo userInfo);

    public void deleteUserInfo(UserInfo userInfo);

    public List<UserInfo> queryUserInfoPage(Map map);

    public Integer queryUserInfoPageCount(Map map);

    public void saveUserInfoBatch(List<UserInfo>  userInfoList);

    public void deleteUserInfoBatch(List<String> list);

}

