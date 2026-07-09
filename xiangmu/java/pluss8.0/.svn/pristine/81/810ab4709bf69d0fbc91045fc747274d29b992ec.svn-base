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
import cn.pluss.platform.model.coding.TableColumn;
import cn.pluss.platform.base.coding.tableColumn.TableColumnService;


@RestController
@RequestMapping("/tableColumn")
@Api(value = "TableColumn控制类",tags={"TableColumn接口"})
public class TableColumnController{

    private Logger logger = Logger.getLogger(this.getClass());
    @Resource
    private TableColumnService tableColumnService;

    @PostMapping("/list")
    @ApiOperation(value = "后台分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<TableColumn>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<TableColumn> tableColumnList = tableColumnService.queryTableColumnPage(map);
        Integer count= tableColumnService.queryTableColumnPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<TableColumn>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), tableColumnList);
        return ResultGenerator.genSuccessResult(pager);
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result save(@RequestBody TableColumn tableColumn) {
        if(tableColumn.getId()!=null&&tableColumn.getId().intValue()>0){
            tableColumnService.updateTableColumn(tableColumn);
        }else{
            tableColumnService.saveTableColumn(tableColumn);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加数据",notes = "添加新的数据",httpMethod = "POST")
    public Result add(@RequestBody TableColumn tableColumn) {
        tableColumnService.saveTableColumn(tableColumn);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新数据",notes = "根据内容更新数据",httpMethod = "POST")
    public Result update(@RequestBody TableColumn tableColumn) {
        tableColumnService.updateTableColumn(tableColumn);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除数据",notes = "根据id删除数据",httpMethod = "POST")
    public Result delete(@RequestBody TableColumn tableColumn) {
        tableColumnService.deleteTableColumn(tableColumn);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/queryOne")
    @ApiOperation(value = "获条件取单个值",notes = "查看单个项目的内容",httpMethod = "POST")
    public Result queryOne(@RequestBody TableColumn tableColumn) {
        TableColumn  tableColumnActual=tableColumnService.queryTableColumn(tableColumn);
        return ResultGenerator.genSuccessResult(tableColumnActual);
    }
    @PostMapping("/queryList")
    @ApiOperation(value = "获条件取集合",notes = "查看多个项目的内容",httpMethod = "POST")
    public Result queryList(@RequestBody TableColumn tableColumn) {
        List<TableColumn>  tableColumnList=tableColumnService.queryTableColumnList(tableColumn);
        return ResultGenerator.genSuccessResult(tableColumnList);
    }


}


