package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.Post;

@Mapper
public interface PostMapper {

    public Post queryPost(Post post);

    public List<Post> queryPostList(Post post);

    public void savePost(Post post);

    public void updatePost(Post post);

    public void deletePost(Post post);

    public List<Post> queryPostPage(Map map);

    public Integer queryPostPageCount(Map map);

    public void savePostBatch(List<Post>  postList);

    public void deletePostBatch(List<String> list);
}

