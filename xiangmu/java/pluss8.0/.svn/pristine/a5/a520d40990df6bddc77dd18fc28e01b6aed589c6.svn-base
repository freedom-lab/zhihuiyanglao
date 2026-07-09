package cn.pluss.platform.base.auth.userOrgan.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.UserOrgan;
import cn.pluss.platform.base.auth.userOrgan.UserOrganService;
import cn.pluss.platform.mapper.base.auth.UserOrganMapper;

@Transactional
@Service("userOrganService")
public class UserOrganServiceImpl  implements UserOrganService{

	 private static final Logger logger = LoggerFactory.getLogger( UserOrganServiceImpl.class);


    @Autowired
	  private UserOrganMapper userOrganMapper;

    @Override
    public UserOrgan queryUserOrgan(UserOrgan userOrgan){
        return userOrganMapper.queryUserOrgan(userOrgan);
    }

    @Override
    public List<UserOrgan> queryUserOrganList(UserOrgan userOrgan){
        return userOrganMapper.queryUserOrganList(userOrgan);
    }
    @Override
    public void saveUserOrgan(UserOrgan userOrgan){
          userOrganMapper.saveUserOrgan(userOrgan);
    }
    @Override
    public void updateUserOrgan(UserOrgan userOrgan){
        userOrganMapper.updateUserOrgan(userOrgan);
    }
    @Override
    public void deleteUserOrgan(UserOrgan userOrgan){
        userOrganMapper.deleteUserOrgan(userOrgan);
    }
    @Override
    public List<UserOrgan> queryUserOrganPage(Map map){
        return userOrganMapper.queryUserOrganPage(map);
    }
    @Override
    public Integer queryUserOrganPageCount(Map map){
        return userOrganMapper.queryUserOrganPageCount(map);
    }
    @Override
    public void saveUserOrganBatch(List<UserOrgan> userOrganList) {
         userOrganMapper.saveUserOrganBatch(userOrganList);
    }
    @Override
    public void deleteUserOrganBatch(List<String> list) {
         userOrganMapper.deleteUserOrganBatch(list);
    }
}

