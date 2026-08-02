package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingServiceType;
import cn.pluss.platform.service.insNursingServiceType.InsNursingServiceTypeService;
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
@RequestMapping("/insNursingServiceType")
@Api(value = "InsNursingServiceType控制类",tags={"InsNursingServiceType接口"})
public class InsNursingServiceTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingServiceTypeService insNursingServiceTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingServiceType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingServiceType> insNursingServiceTypeList = insNursingServiceTypeService.queryPage(map);
        Integer count= insNursingServiceTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingServiceType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingServiceTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingServiceType>> queryList(@RequestBody InsNursingServiceType insNursingServiceType) {
        List<InsNursingServiceType> insNursingServiceTypeList = insNursingServiceTypeService.queryList(insNursingServiceType);
        return ResultGenerator.genSuccessResult(insNursingServiceTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingServiceType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingServiceType> queryOne(@RequestBody InsNursingServiceType insNursingServiceType) {
        return ResultGenerator.genSuccessResult(insNursingServiceTypeService.queryOne(insNursingServiceType));
    }

    /**
    * 保存数据
    * @param insNursingServiceType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingServiceType insNursingServiceType) {
        //Date currentDt = new Date();
        if (insNursingServiceType.getId() != null && insNursingServiceType.getId().longValue() > 0) {
            //insNursingServiceType.setUpdatedDt(currentDt);
            insNursingServiceTypeService.update(insNursingServiceType);
        } else {
            //insNursingServiceType.setCreatedDt(currentDt);
            //insNursingServiceType.setUpdatedDt(currentDt);
            insNursingServiceTypeService.insert(insNursingServiceType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingServiceType> add(@RequestBody InsNursingServiceType insNursingServiceType) {
        //Date currentDt = new Date();
        //insNursingServiceType.setCreatedDt(currentDt);
        //insNursingServiceType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingServiceTypeService.insert(insNursingServiceType));
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingServiceType> update(@RequestBody InsNursingServiceType insNursingServiceType) {
        return ResultGenerator.genSuccessResult(insNursingServiceTypeService.update(insNursingServiceType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingServiceType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingServiceType insNursingServiceType) {
        return ResultGenerator.genSuccessResult(insNursingServiceTypeService.deleteById(insNursingServiceType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingServiceType> insertList) {
        return ResultGenerator.genSuccessResult(insNursingServiceTypeService.saveInsNursingServiceTypeBatch(insertList));
    }

}


