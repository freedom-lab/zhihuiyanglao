package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsInventoryAdjust;
import cn.pluss.platform.service.insLogisticsInventoryAdjust.InsLogisticsInventoryAdjustService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/insLogisticsInventoryAdjust")
@Api(value = "InsLogisticsInventoryAdjust控制类",tags={"InsLogisticsInventoryAdjust接口"})
public class InsLogisticsInventoryAdjustController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsInventoryAdjustService insLogisticsInventoryAdjustService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsInventoryAdjust>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsLogisticsInventoryAdjust> insLogisticsInventoryAdjustList = insLogisticsInventoryAdjustService.queryPage(map);
        Integer count= insLogisticsInventoryAdjustService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsInventoryAdjust>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsInventoryAdjustList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsInventoryAdjust
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsInventoryAdjust>> queryList(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        List<InsLogisticsInventoryAdjust> insLogisticsInventoryAdjustList = insLogisticsInventoryAdjustService.queryList(insLogisticsInventoryAdjust);
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsInventoryAdjust 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsInventoryAdjust> queryOne(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustService.queryOne(insLogisticsInventoryAdjust));
    }

    /**
    * 保存数据
    * @param insLogisticsInventoryAdjust
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        //Date currentDt = new Date();
        if (insLogisticsInventoryAdjust.getId() != null && insLogisticsInventoryAdjust.getId().longValue() > 0) {
            //insLogisticsInventoryAdjust.setUpdatedDt(currentDt);
            insLogisticsInventoryAdjustService.update(insLogisticsInventoryAdjust);
        } else {
            //insLogisticsInventoryAdjust.setCreatedDt(currentDt);
            //insLogisticsInventoryAdjust.setUpdatedDt(currentDt);
            insLogisticsInventoryAdjustService.insert(insLogisticsInventoryAdjust);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsInventoryAdjust 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsInventoryAdjust> add(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        //Date currentDt = new Date();
        //insLogisticsInventoryAdjust.setCreatedDt(currentDt);
        //insLogisticsInventoryAdjust.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustService.insert(insLogisticsInventoryAdjust));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsInventoryAdjust 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsInventoryAdjust> update(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustService.update(insLogisticsInventoryAdjust));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsInventoryAdjust 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsInventoryAdjust insLogisticsInventoryAdjust) {
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustService.deleteById(insLogisticsInventoryAdjust.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsInventoryAdjust> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsInventoryAdjustService.saveInsLogisticsInventoryAdjustBatch(insertList));
    }

}


