package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingRehabItemType;
import cn.pluss.platform.service.insNursingRehabItemType.InsNursingRehabItemTypeService;
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
@RequestMapping("/insNursingRehabItemType")
@Api(value = "InsNursingRehabItemType控制类",tags={"InsNursingRehabItemType接口"})
public class InsNursingRehabItemTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingRehabItemTypeService insNursingRehabItemTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingRehabItemType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingRehabItemType> insNursingRehabItemTypeList = insNursingRehabItemTypeService.queryPage(map);
        Integer count= insNursingRehabItemTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingRehabItemType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingRehabItemTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabItemType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingRehabItemType>> queryList(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        List<InsNursingRehabItemType> insNursingRehabItemTypeList = insNursingRehabItemTypeService.queryList(insNursingRehabItemType);
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingRehabItemType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingRehabItemType> queryOne(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeService.queryOne(insNursingRehabItemType));
    }

    /**
    * 保存数据
    * @param insNursingRehabItemType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        //Date currentDt = new Date();
        if (insNursingRehabItemType.getId() != null && insNursingRehabItemType.getId().longValue() > 0) {
            //insNursingRehabItemType.setUpdatedDt(currentDt);
            insNursingRehabItemTypeService.update(insNursingRehabItemType);
        } else {
            //insNursingRehabItemType.setCreatedDt(currentDt);
            //insNursingRehabItemType.setUpdatedDt(currentDt);
            insNursingRehabItemTypeService.insert(insNursingRehabItemType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingRehabItemType> add(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        //Date currentDt = new Date();
        //insNursingRehabItemType.setCreatedDt(currentDt);
        //insNursingRehabItemType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeService.insert(insNursingRehabItemType));
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingRehabItemType> update(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeService.update(insNursingRehabItemType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingRehabItemType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingRehabItemType insNursingRehabItemType) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeService.deleteById(insNursingRehabItemType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingRehabItemType> insertList) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemTypeService.saveInsNursingRehabItemTypeBatch(insertList));
    }

}


