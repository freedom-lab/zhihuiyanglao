package cn.pluss.platform.base.auth.userPost.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.userPost.UserPostService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.UserPost;
import cn.pluss.platform.mapper.base.auth.UserPostMapper;

@Transactional
@Service("userPostService")
public class UserPostServiceImpl  implements UserPostService {

	 private static final Logger logger = LoggerFactory.getLogger( UserPostServiceImpl.class);


    @Autowired
	  private UserPostMapper userPostMapper;

    @Override
    public UserPost queryUserPost(UserPost userPost){
        return userPostMapper.queryUserPost(userPost);
    }

    @Override
    public List<UserPost> queryUserPostList(UserPost userPost){
        return userPostMapper.queryUserPostList(userPost);
    }
    @Override
    public void saveUserPost(UserPost userPost){
          userPostMapper.saveUserPost(userPost);
    }
    @Override
    public void updateUserPost(UserPost userPost){
        userPostMapper.updateUserPost(userPost);
    }
    @Override
    public void deleteUserPost(UserPost userPost){
        userPostMapper.deleteUserPost(userPost);
    }
    @Override
    public List<UserPost> queryUserPostPage(Map map){
        return userPostMapper.queryUserPostPage(map);
    }
    @Override
    public Integer queryUserPostPageCount(Map map){
        return userPostMapper.queryUserPostPageCount(map);
    }
    @Override
    public void saveUserPostBatch(List<UserPost> userPostList) {
         userPostMapper.saveUserPostBatch(userPostList);
    }
    @Override
    public void deleteUserPostBatch(List<String> list) {
         userPostMapper.deleteUserPostBatch(list);
    }
}

