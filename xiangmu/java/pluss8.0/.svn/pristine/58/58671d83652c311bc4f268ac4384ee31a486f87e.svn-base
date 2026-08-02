package cn.pluss.platform.base.controller.auth;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.auth.Organ;
import cn.pluss.platform.base.auth.organ.OrganService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/organ")
@Api(value = "Organ控制类",tags={"Organ接口"})
public class OrganController{

	  private Logger logger = Logger.getLogger(this.getClass());
	  @Resource
	  private OrganService organService;

    @GetMapping
    @ApiOperation(value = "获取全部",notes = "返回分页过后的数据",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "查询页码", paramType = "query",dataType = "Integer",defaultValue = "0"),
            @ApiImplicitParam(name = "size",value = "每页数据量", paramType = "query",dataType = "Integer",defaultValue = "0")
    })
    public Result<PageInfo<Organ>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
	  	if(size==null||size==0) {
	  		size=ProjectConstant.PAGE_SIZE;
	  	}
		if(page==null||page==0) {
			page=1;
	  	}
	  		Map<String,Object> map=new HashMap<String, Object>();
    		map.put("pageSize",size);
    		map.put("offset", (page-1)*size);
   		List<Organ> organList = organService.queryOrganPage(map);
   		Integer count= organService.queryOrganPageCount(map);
   			//返回参数
        PageInfo pager=new PageInfo<Organ>(count, StringUtil.getPageCount(count,size), page, size, organList);
        return ResultGenerator.genSuccessResult(pager);
    }

	    @PostMapping
	    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "Organ",value = "待添加的Organ实例",paramType = "body",dataType = "Organ",required = true)
	    })
	    public Result add(@RequestBody Organ organ) {
	        organService.saveOrgan(organ);
	        return ResultGenerator.genSuccessResult();
	    }

	    @DeleteMapping("/{id}")
	    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "DELETE")
	    @ApiImplicitParams({
	    	@ApiImplicitParam(name = "id",value = "查询的id实例",paramType = "path",dataType = "Integer",required = true)
	    })
	    public Result delete(@PathVariable Integer id) {
	        Organ organ = new Organ();
	        organ.setId(id.intValue());
	        organService.deleteOrgan(organ);
	        return ResultGenerator.genSuccessResult();
	    }

	    @PutMapping
	    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "PUT")
	    @ApiImplicitParams({
	   		@ApiImplicitParam(name = "Organ",value = "更新的Organ实例",paramType = "body",dataType = "Organ",required = true)
	    })
	    public Result update(@RequestBody Organ organ) {
	        organService.updateOrgan(organ);
	        return ResultGenerator.genSuccessResult();
	    }

	    @GetMapping("/{id}")
	    @ApiOperation(value = "获取单个值",notes = "查看单个项目的内容",httpMethod = "GET")
	    @ApiImplicitParams({
	    	 @ApiImplicitParam(name = "id",value = "查询的id", paramType = "path",required = true,dataType = "Integer",defaultValue = "0")
	    })
	    public Result detail(@PathVariable Long id) {
	        Organ organ = new Organ();
	        organ.setId(id.intValue());
	        organ=organService.queryOrgan(organ);
	        return ResultGenerator.genSuccessResult(organ);
	    }
	    @PostMapping("/queryOne")
	    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
	    @ApiImplicitParams({
	    	 	@ApiImplicitParam(name = "Organ",value = "待查询的Organ实例",paramType = "body",dataType = "Organ",required = true)
	    })
	    public Result queryOne(@RequestBody Organ organ) {
	      Organ  organActual=organService.queryOrgan(organ);
	        return ResultGenerator.genSuccessResult(organActual);
	    }
	    @PostMapping("/queryList")
	    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
	    public Result queryList(@RequestBody Organ organ) {
	      List<Organ>  organList=organService.queryOrganList(organ);
	        return ResultGenerator.genSuccessResult(organList);
	    }




	@PostMapping("/queryOrganTreeList")
	@ApiOperation(value = "组织树集合",notes = "组织树集合",httpMethod = "POST")
	public Result queryOrganTreeList(@RequestBody Organ organ) {
		List<Organ>  organList=organService.queryOrganList(null);

		List<Organ> list=new ArrayList<Organ>();//父级菜单
		List<Organ> subList=new ArrayList<Organ>();//子级菜单
		for(Organ m:organList) {
			if(StringUtil.isEmpty(m.getParentCode())) {
				list.add(m);
			}else {
				subList.add(m);
			}
		}

		for(Organ l:list) {
			List<Organ> childrens=getSubOrg(l,subList);
			l.setChildrens(childrens);
		}

		return ResultGenerator.genSuccessResult(list);
	}

	private List<Organ> getSubOrg(Organ l, List<Organ> subList) {
		List<Organ> childrens=new ArrayList<Organ>();
		for(Organ sub:subList) {
			if(l.getOrganCode().equals(sub.getParentCode())) {
				childrens.add(sub);
				List<Organ> childrens2=getSubOrg(sub,subList);
				sub.setChildrens(childrens2);
			}
		}
		return childrens;
	}
}

