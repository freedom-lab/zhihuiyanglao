package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.Post;
import cn.pluss.platform.base.auth.post.PostService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/post")
@Api(value = "Post控制类",tags={"Post接口"})
public class PostController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private PostService postService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<Post>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<Post> postList = postService.queryPostPage(map);
   		Integer count= postService.queryPostPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<Post>(count, StringUtil.getPageCount(count,size), page, size, postList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "Post",value = "待添加的Post实例",paramType = "body",dataType = "Post",required = true)
	    })
	    public Result add(@RequestBody Post post) {
	        postService.savePost(post);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        Post post = new Post();
	        post.setId(id.intValue());
	        postService.deletePost(post);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "Post",value = "更新的Post实例",paramType = "body",dataType = "Post",required = true)
	    })
	    public Result update(@RequestBody Post post) {
	        postService.updatePost(post);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        Post post = new Post();
	        post.setId(id.intValue());
	        post=postService.queryPost(post);
	        return ResultGenerator.genSuccessResult(post);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "Post",value = "待查询的Post实例",paramType = "body",dataType = "Post",required = true)
	    })
	    public Result queryOne(@RequestBody Post post) {
	      Post  postActual=postService.queryPost(post);
	        return ResultGenerator.genSuccessResult(postActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryList(@RequestBody Post post) {
	      List<Post>  postList=postService.queryPostList(post);
	        return ResultGenerator.genSuccessResult(postList);
	    }

}

