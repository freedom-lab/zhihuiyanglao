package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.Post;
import cn.pluss.platform.model.auth.UserInfo;
import cn.pluss.platform.model.auth.UserPost;
import cn.pluss.platform.base.auth.post.PostService;
import cn.pluss.platform.base.auth.userInfo.UserInfoService;
import cn.pluss.platform.base.auth.userPost.UserPostService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;


@RestController
@RequestMapping("/userPost")
@Api(value = "UserPost控制类",tags={"UserPost接口"})
public class UserPostController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private UserPostService userPostService;
	  
	  @Resource
	  private PostService postService;
	  
	  @Resource
	  private UserInfoService userInfoService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<UserPost>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<UserPost> userPostList = userPostService.queryUserPostPage(map);
   		Integer count= userPostService.queryUserPostPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<UserPost>(count, StringUtil.getPageCount(count,size), page, size, userPostList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "UserPost",value = "待添加的UserPost实例",paramType = "body",dataType = "UserPost",required = true)
	    })
	    public Result add(@RequestBody UserPost userPost) {
	        userPostService.saveUserPost(userPost);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        UserPost userPost = new UserPost();
	        userPost.setId(id.intValue());
	        userPostService.deleteUserPost(userPost);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "UserPost",value = "更新的UserPost实例",paramType = "body",dataType = "UserPost",required = true)
	    })
	    public Result update(@RequestBody UserPost userPost) {
	        userPostService.updateUserPost(userPost);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        UserPost userPost = new UserPost();
	        userPost.setId(id.intValue());
	        userPost=userPostService.queryUserPost(userPost);
	        return ResultGenerator.genSuccessResult(userPost);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "UserPost",value = "待查询的UserPost实例",paramType = "body",dataType = "UserPost",required = true)
	    })
	    public Result queryOne(@RequestBody UserPost userPost) {
	      UserPost  userPostActual=userPostService.queryUserPost(userPost);
	        return ResultGenerator.genSuccessResult(userPostActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "UserPost",value = "待查询的UserPost实例",paramType = "body",dataType = "UserPost",required = true)
	    })
	    public Result queryList(@RequestBody UserPost userPost) {
	      List<UserPost>  userPostList=userPostService.queryUserPostList(userPost);
	        return ResultGenerator.genSuccessResult(userPostList);
	    }
	    
	    
	    @PostMapping("/queryListByUserCode")
	    @ApiOperation(value = "获条件取集合,传userCode",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByUserCode(@RequestBody UserPost userPost) {
	    	if(StringUtil.isEmpty(userPost.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	      List<UserPost>  userPostList=userPostService.queryUserPostList(userPost);
	      
	      List<Post> postList=postService.queryPostList(null);
	      List<Post> list=new ArrayList<Post>();
	      for(Post p:postList) {
	    	  for(UserPost up:userPostList) {
	    		  if(p.getPostCode().equals(up.getPostCode())) {
	    			  p.setId(up.getId());
	    			  list.add(p);
	    		  }
	    	  }
	      }
	      
	        return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
	    @PostMapping("add")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result insert(@RequestBody UserPost userPost) {
	    	if(StringUtil.isEmpty(userPost.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	
	    	if(StringUtil.isEmpty(userPost.getPostCode())) {
	    		return ResultGenerator.genFailResult("无岗位编码");
	    	}
	    	
	    	String postCode=userPost.getPostCode();
	    	String postCodes[]=postCode.split(",");
	    	
	    	
	    	
	    	UserPost uorg=new UserPost();
	        uorg.setUserCode(userPost.getUserCode());
	        List<UserPost>  userPostList=userPostService.queryUserPostList(uorg);
	        
	        
	        List<String> postlist = new ArrayList<>(Arrays.asList(postCodes));
	        
	        List<String> postlist2 = new ArrayList<String>();
	        
        	for(String s:postlist ) {
        		if(!StringUtil.isEmpty(s)) {
        			for(UserPost u:userPostList) {
            			if(s.equals(u.getPostCode())) {
            				postlist2.add(s);
            			}
            		}
        		}
        	}
        	if(postlist2.size()>0) {
        		postlist.removeAll(postlist2);
        	}
	    	
	    	List<UserPost> list=new ArrayList<UserPost>();
	    	for(String s:postlist) {
	    		if(!StringUtil.isEmpty(s)) {
	    			UserPost up=new UserPost();
	    			up.setUserCode(userPost.getUserCode());
	    			up.setPostCode(s);
	    			list.add(up);
	    		}
	    	}
	    	
	    	if(list.size()>0) {
	    		userPostService.saveUserPostBatch(list);
	    	}
	    	
	    	
	    	if(postlist2.size()>0) {
	    		return ResultGenerator.genSuccessResult("有"+postlist2.size()+"个重复数据未录入");
	    	}else {
	    		return ResultGenerator.genSuccessResult();
	    	}
	    }
	    
	    
	    @PostMapping("/queryListByPostCode")
	    @ApiOperation(value = "获条件取集合,传userCode",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryListByPostCode(@RequestBody UserPost userPost) {
	    	if(StringUtil.isEmpty(userPost.getPostCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	      List<UserPost>  userPostList=userPostService.queryUserPostList(userPost);
	      
	      List<UserInfo> userList=userInfoService.queryUserInfoList(null);
	      List<UserInfo> list=new ArrayList<UserInfo>();
	      for(UserInfo p:userList) {
	    	  for(UserPost up:userPostList) {
	    		  if(p.getUserCode().equals(up.getUserCode())) {
	    			  p.setId(up.getId());
	    			  list.add(p);
	    		  }
	    	  }
	      }
	        return ResultGenerator.genSuccessResult(list);
	    }
	    
	    
	    @PostMapping("addUser")
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    public Result addUser(@RequestBody UserPost userPost) {
	    	if(StringUtil.isEmpty(userPost.getUserCode())) {
	    		return ResultGenerator.genFailResult("无用户编码");
	    	}
	    	
	    	if(StringUtil.isEmpty(userPost.getPostCode())) {
	    		return ResultGenerator.genFailResult("无岗位编码");
	    	}
	    	
	    	String userCode=userPost.getUserCode();
	    	String userCodes[]=userCode.split(",");
	    	
	    	
	    	
	    	UserPost uorg=new UserPost();
	        uorg.setPostCode(userPost.getPostCode());
	        List<UserPost>  userPostList=userPostService.queryUserPostList(uorg);
	        
	        
	        List<String> userlist = new ArrayList<>(Arrays.asList(userCodes));
	        List<String> userlist2 = new ArrayList<String>();
	        
        	for(String s:userlist ) {
        		if(!StringUtil.isEmpty(s)) {
        			for(UserPost u:userPostList) {
            			if(s.equals(u.getUserCode())) {
            				userlist2.add(s);
            			}
            		}
        		}
        	}
        	if(userlist2.size()>0) {
        		userlist.removeAll(userlist2);
        	}
	    	
	    	List<UserPost> list=new ArrayList<UserPost>();
	    	for(String s:userlist) {
	    		if(!StringUtil.isEmpty(s)) {
	    			UserPost up=new UserPost();
	    			up.setUserCode(s);
	    			up.setPostCode(userPost.getPostCode());
	    			list.add(up);
	    		}
	    	}
	    	if(list.size()>0) {
	    		userPostService.saveUserPostBatch(list);
	    	}
	    	if(userlist2.size()>0) {
	    		return ResultGenerator.genSuccessResult("有"+userlist2.size()+"个重复数据未录入");
	    	}else {
	    		return ResultGenerator.genSuccessResult();
	    	}
	    }

}

