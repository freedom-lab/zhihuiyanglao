package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.UserPost;

@Mapper
public interface UserPostMapper {

    public UserPost queryUserPost(UserPost userPost);

    public List<UserPost> queryUserPostList(UserPost userPost);

    public void saveUserPost(UserPost userPost);

    public void updateUserPost(UserPost userPost);

    public void deleteUserPost(UserPost userPost);

    public List<UserPost> queryUserPostPage(Map map);

    public Integer queryUserPostPageCount(Map map);

    public void saveUserPostBatch(List<UserPost>  userPostList);

    public void deleteUserPostBatch(List<String> list);
}

