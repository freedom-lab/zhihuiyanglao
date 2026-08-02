package cn.pluss.platform.base.controller.coding;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import cn.pluss.platform.model.coding.TableDdl;
import cn.pluss.platform.base.coding.tableDdl.TableDdlService;


@RestController
@RequestMapping("/tableDdl")
@Api(value = "TableDdl控制类",tags={"TableDdl接口"})
public class TableDdlController{

    private Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private TableDdlService tableDdlService;

    @PostMapping("/list")
    @ApiOperation(value = "后台分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<TableDdl>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
		if(pageQueryInfo.getCondition()!=null){
			map.putAll(pageQueryInfo.getCondition());
		}
        List<TableDdl> tableDdlList = tableDdlService.queryTableDdlPage(map);
        Integer count= tableDdlService.queryTableDdlPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<TableDdl>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), tableDdlList);
        return ResultGenerator.genSuccessResult(pager);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result save(@RequestBody TableDdl tableDdl) {
        if(tableDdl.getId()!=null&&tableDdl.getId().intValue()>0){
            tableDdlService.updateTableDdl(tableDdl);
        }else{
            tableDdlService.saveTableDdl(tableDdl);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result add(@RequestBody TableDdl tableDdl) {
        tableDdlService.saveTableDdl(tableDdl);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "POST")
    public Result update(@RequestBody TableDdl tableDdl) {
        tableDdlService.updateTableDdl(tableDdl);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
    public Result delete(@RequestBody TableDdl tableDdl) {
        tableDdlService.deleteTableDdl(tableDdl);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/queryOne")
    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
    public Result queryOne(@RequestBody TableDdl tableDdl) {
        TableDdl  tableDdlActual=tableDdlService.queryTableDdl(tableDdl);
        return ResultGenerator.genSuccessResult(tableDdlActual);
    }
    @PostMapping("/queryList")
    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
    public Result queryList(@RequestBody TableDdl tableDdl) {
        List<TableDdl>  tableDdlList=tableDdlService.queryTableDdlList(tableDdl);
        return ResultGenerator.genSuccessResult(tableDdlList);
    }

    @PostMapping("/execSql")
    @ApiOperation(value = "执行生成脚本",notes = "执行生成脚本",httpMethod = "POST")
    public Result execSql(@RequestBody TableDdl tableDdl) {
        tableDdl.setStatus("0");
        List<TableDdl>  tableDdlList=tableDdlService.queryTableDdlListOrderByIdAsc(tableDdl);
        for (int i = 0; i < tableDdlList.size(); i++) {

            tableDdlService.execSql(tableDdlList.get(i));
            //更新执行状态
            tableDdlList.get(i).setStatus("1");
            tableDdlService.updateTableDdl(tableDdlList.get(i));
        }
        return ResultGenerator.genSuccessResult(tableDdlList);
    }


}


