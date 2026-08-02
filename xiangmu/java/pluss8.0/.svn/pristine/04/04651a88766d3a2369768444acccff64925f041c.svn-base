package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsMaterialOut;
import cn.pluss.platform.service.insLogisticsMaterialOut.InsLogisticsMaterialOutService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/insLogisticsMaterialOut")
@Api(value = "InsLogisticsMaterialOut控制类",tags={"InsLogisticsMaterialOut接口"})
public class InsLogisticsMaterialOutController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsMaterialOutService insLogisticsMaterialOutService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsMaterialOut>> list(@RequestBody PageQueryInfo pageQueryInfo) {
        if(pageQueryInfo.getPageSize()==0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if(pageQueryInfo.getCurrPage()==0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage()-1)*pageQueryInfo.getPageSize());
        if(pageQueryInfo.getCondition() != null){
            map.putAll(pageQueryInfo.getCondition());
        }
        List<InsLogisticsMaterialOut> insLogisticsMaterialOutList = insLogisticsMaterialOutService.queryPage(map);
        Integer count= insLogisticsMaterialOutService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsMaterialOut>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsMaterialOutList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialOut
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsMaterialOut>> queryList(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        List<InsLogisticsMaterialOut> insLogisticsMaterialOutList = insLogisticsMaterialOutService.queryList(insLogisticsMaterialOut);
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsMaterialOut 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsMaterialOut> queryOne(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutService.queryOne(insLogisticsMaterialOut));
    }

    /**
    * 保存数据
    * @param insLogisticsMaterialOut
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        //Date currentDt = new Date();
        if (insLogisticsMaterialOut.getId() != null && insLogisticsMaterialOut.getId().longValue() > 0) {
            //insLogisticsMaterialOut.setUpdatedDt(currentDt);
            insLogisticsMaterialOutService.update(insLogisticsMaterialOut);
        } else {
            //insLogisticsMaterialOut.setCreatedDt(currentDt);
            //insLogisticsMaterialOut.setUpdatedDt(currentDt);
            insLogisticsMaterialOutService.insert(insLogisticsMaterialOut);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsMaterialOut> add(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        //Date currentDt = new Date();
        //insLogisticsMaterialOut.setCreatedDt(currentDt);
        //insLogisticsMaterialOut.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutService.insert(insLogisticsMaterialOut));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialOut 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsMaterialOut> update(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutService.update(insLogisticsMaterialOut));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsMaterialOut 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsMaterialOut insLogisticsMaterialOut) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutService.deleteById(insLogisticsMaterialOut.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsMaterialOut> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialOutService.saveInsLogisticsMaterialOutBatch(insertList));
    }

}


