package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsActivityType;
import cn.pluss.platform.service.insActivityType.InsActivityTypeService;
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
@RequestMapping("/insActivityType")
@Api(value = "InsActivityType控制类",tags={"InsActivityType接口"})
public class InsActivityTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsActivityTypeService insActivityTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsActivityType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsActivityType> insActivityTypeList = insActivityTypeService.queryPage(map);
        Integer count= insActivityTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsActivityType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insActivityTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insActivityType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsActivityType>> queryList(@RequestBody InsActivityType insActivityType) {
        List<InsActivityType> insActivityTypeList = insActivityTypeService.queryList(insActivityType);
        return ResultGenerator.genSuccessResult(insActivityTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insActivityType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsActivityType> queryOne(@RequestBody InsActivityType insActivityType) {
        return ResultGenerator.genSuccessResult(insActivityTypeService.queryOne(insActivityType));
    }

    /**
    * 保存数据
    * @param insActivityType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsActivityType insActivityType) {
        //Date currentDt = new Date();
        if (insActivityType.getId() != null && insActivityType.getId().longValue() > 0) {
            //insActivityType.setUpdatedDt(currentDt);
            insActivityTypeService.update(insActivityType);
        } else {
            //insActivityType.setCreatedDt(currentDt);
            //insActivityType.setUpdatedDt(currentDt);
            insActivityTypeService.insert(insActivityType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insActivityType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsActivityType> add(@RequestBody InsActivityType insActivityType) {
        //Date currentDt = new Date();
        //insActivityType.setCreatedDt(currentDt);
        //insActivityType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insActivityTypeService.insert(insActivityType));
    }

    /**
    * 更新数据
    *
    * @param insActivityType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsActivityType> update(@RequestBody InsActivityType insActivityType) {
        return ResultGenerator.genSuccessResult(insActivityTypeService.update(insActivityType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insActivityType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsActivityType insActivityType) {
        return ResultGenerator.genSuccessResult(insActivityTypeService.deleteById(insActivityType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsActivityType> insertList) {
        return ResultGenerator.genSuccessResult(insActivityTypeService.saveInsActivityTypeBatch(insertList));
    }

}


