package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsMaterialFrmloss;
import cn.pluss.platform.service.insLogisticsMaterialFrmloss.InsLogisticsMaterialFrmlossService;
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
@RequestMapping("/insLogisticsMaterialFrmloss")
@Api(value = "InsLogisticsMaterialFrmloss控制类",tags={"InsLogisticsMaterialFrmloss接口"})
public class InsLogisticsMaterialFrmlossController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsMaterialFrmlossService insLogisticsMaterialFrmlossService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsMaterialFrmloss>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsLogisticsMaterialFrmloss> insLogisticsMaterialFrmlossList = insLogisticsMaterialFrmlossService.queryPage(map);
        Integer count= insLogisticsMaterialFrmlossService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsMaterialFrmloss>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsMaterialFrmlossList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsMaterialFrmloss
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsMaterialFrmloss>> queryList(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        List<InsLogisticsMaterialFrmloss> insLogisticsMaterialFrmlossList = insLogisticsMaterialFrmlossService.queryList(insLogisticsMaterialFrmloss);
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsMaterialFrmloss 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsMaterialFrmloss> queryOne(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossService.queryOne(insLogisticsMaterialFrmloss));
    }

    /**
    * 保存数据
    * @param insLogisticsMaterialFrmloss
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        //Date currentDt = new Date();
        if (insLogisticsMaterialFrmloss.getId() != null && insLogisticsMaterialFrmloss.getId().longValue() > 0) {
            //insLogisticsMaterialFrmloss.setUpdatedDt(currentDt);
            insLogisticsMaterialFrmlossService.update(insLogisticsMaterialFrmloss);
        } else {
            //insLogisticsMaterialFrmloss.setCreatedDt(currentDt);
            //insLogisticsMaterialFrmloss.setUpdatedDt(currentDt);
            insLogisticsMaterialFrmlossService.insert(insLogisticsMaterialFrmloss);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsMaterialFrmloss 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsMaterialFrmloss> add(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        //Date currentDt = new Date();
        //insLogisticsMaterialFrmloss.setCreatedDt(currentDt);
        //insLogisticsMaterialFrmloss.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossService.insert(insLogisticsMaterialFrmloss));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsMaterialFrmloss 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsMaterialFrmloss> update(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossService.update(insLogisticsMaterialFrmloss));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsMaterialFrmloss 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsMaterialFrmloss insLogisticsMaterialFrmloss) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossService.deleteById(insLogisticsMaterialFrmloss.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsMaterialFrmloss> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsMaterialFrmlossService.saveInsLogisticsMaterialFrmlossBatch(insertList));
    }

}


