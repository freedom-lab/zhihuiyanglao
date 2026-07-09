package cn.pluss.platform.base.auth.post;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.auth.Post;

public interface PostService {

    public Post queryPost(Post post);

    public List<Post> queryPostList(Post post);

    public void savePost(Post post);

    public void updatePost(Post post);

    public void deletePost(Post post);

    public List<Post> queryPostPage(Map map);

    public Integer queryPostPageCount(Map map);

    public void savePostBatch(List<Post> postList);

    public void deletePostBatch(List<String> list);
}

