package cn.pluss.platform.base.auth.post.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.post.PostService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.Post;
import cn.pluss.platform.mapper.base.auth.PostMapper;

@Transactional
@Service("postService")
public class PostServiceImpl  implements PostService {

	 private static final Logger logger = LoggerFactory.getLogger( PostServiceImpl.class);


    @Autowired
	  private PostMapper postMapper;

    @Override
    public Post queryPost(Post post){
        return postMapper.queryPost(post);
    }

    @Override
    public List<Post> queryPostList(Post post){
        return postMapper.queryPostList(post);
    }
    @Override
    public void savePost(Post post){
          postMapper.savePost(post);
    }
    @Override
    public void updatePost(Post post){
        postMapper.updatePost(post);
    }
    @Override
    public void deletePost(Post post){
        postMapper.deletePost(post);
    }
    @Override
    public List<Post> queryPostPage(Map map){
        return postMapper.queryPostPage(map);
    }
    @Override
    public Integer queryPostPageCount(Map map){
        return postMapper.queryPostPageCount(map);
    }
    @Override
    public void savePostBatch(List<Post> postList) {
         postMapper.savePostBatch(postList);
    }
    @Override
    public void deletePostBatch(List<String> list) {
         postMapper.deletePostBatch(list);
    }
}

