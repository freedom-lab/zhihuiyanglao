package cn.pluss.platform.base.controller.coding;


import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.base.coding.srobot.inf.SrobotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ddl")
@Api(value = "数据库操作-器控制类",tags={"数据库操作-接口"})
public class DdlController {
    @Resource
    private SrobotService srobotService;


    @PostMapping("/createTable")
    @ApiOperation(value = "创建表",notes = "创建表",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result createTable(@RequestBody Table table) {
        srobotService.dropTable(table);
        srobotService.createTable(table);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/alterTableName")
    @ApiOperation(value = "修改表名称",notes = "修改表名称",httpMethod = "POST")
    @ApiImplicitParams({
    })
    public Result alterTableName(@RequestBody Table table) {
        srobotService.alterTableName(table.getOriginalTableName(),table.getTableName());
        return ResultGenerator.genSuccessResult();
    }
}
