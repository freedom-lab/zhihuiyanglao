package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.OrganType;
import cn.pluss.platform.base.auth.organType.OrganTypeService;
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
@RequestMapping("/organType")
@Api(value = "OrganType控制类",tags={"OrganType接口"})
public class OrganTypeController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private OrganTypeService organTypeService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<OrganType>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<OrganType> organTypeList = organTypeService.queryOrganTypePage(map);
   		Integer count= organTypeService.queryOrganTypePageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<OrganType>(count, StringUtil.getPageCount(count,size), page, size, organTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "OrganType",value = "待添加的OrganType实例",paramType = "body",dataType = "OrganType",required = true)
	    })
	    public Result add(@RequestBody OrganType organType) {
	        organTypeService.saveOrganType(organType);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        OrganType organType = new OrganType();
	        organType.setId(id.intValue());
	        organTypeService.deleteOrganType(organType);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "OrganType",value = "更新的OrganType实例",paramType = "body",dataType = "OrganType",required = true)
	    })
	    public Result update(@RequestBody OrganType organType) {
	        organTypeService.updateOrganType(organType);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        OrganType organType = new OrganType();
	        organType.setId(id.intValue());
	        organType=organTypeService.queryOrganType(organType);
	        return ResultGenerator.genSuccessResult(organType);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "OrganType",value = "待查询的OrganType实例",paramType = "body",dataType = "OrganType",required = true)
	    })
	    public Result queryOne(@RequestBody OrganType organType) {
	      OrganType  organTypeActual=organTypeService.queryOrganType(organType);
	        return ResultGenerator.genSuccessResult(organTypeActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryList(@RequestBody OrganType organType) {
	      List<OrganType>  organTypeList=organTypeService.queryOrganTypeList(organType);
	        return ResultGenerator.genSuccessResult(organTypeList);
	    }

}

