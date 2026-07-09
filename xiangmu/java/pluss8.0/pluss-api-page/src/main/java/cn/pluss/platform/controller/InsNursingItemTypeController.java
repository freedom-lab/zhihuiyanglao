package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingItemType;
import cn.pluss.platform.service.insNursingItemType.InsNursingItemTypeService;
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
@RequestMapping("/insNursingItemType")
@Api(value = "InsNursingItemType控制类",tags={"InsNursingItemType接口"})
public class InsNursingItemTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingItemTypeService insNursingItemTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingItemType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingItemType> insNursingItemTypeList = insNursingItemTypeService.queryPage(map);
        Integer count= insNursingItemTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingItemType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingItemTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingItemType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingItemType>> queryList(@RequestBody InsNursingItemType insNursingItemType) {
        List<InsNursingItemType> insNursingItemTypeList = insNursingItemTypeService.queryList(insNursingItemType);
        return ResultGenerator.genSuccessResult(insNursingItemTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingItemType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingItemType> queryOne(@RequestBody InsNursingItemType insNursingItemType) {
        return ResultGenerator.genSuccessResult(insNursingItemTypeService.queryOne(insNursingItemType));
    }

    /**
    * 保存数据
    * @param insNursingItemType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingItemType insNursingItemType) {
        //Date currentDt = new Date();
        if (insNursingItemType.getId() != null && insNursingItemType.getId().longValue() > 0) {
            //insNursingItemType.setUpdatedDt(currentDt);
            insNursingItemTypeService.update(insNursingItemType);
        } else {
            //insNursingItemType.setCreatedDt(currentDt);
            //insNursingItemType.setUpdatedDt(currentDt);
            insNursingItemTypeService.insert(insNursingItemType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingItemType> add(@RequestBody InsNursingItemType insNursingItemType) {
        //Date currentDt = new Date();
        //insNursingItemType.setCreatedDt(currentDt);
        //insNursingItemType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingItemTypeService.insert(insNursingItemType));
    }

    /**
    * 更新数据
    *
    * @param insNursingItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingItemType> update(@RequestBody InsNursingItemType insNursingItemType) {
        return ResultGenerator.genSuccessResult(insNursingItemTypeService.update(insNursingItemType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingItemType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingItemType insNursingItemType) {
        return ResultGenerator.genSuccessResult(insNursingItemTypeService.deleteById(insNursingItemType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingItemType> insertList) {
        return ResultGenerator.genSuccessResult(insNursingItemTypeService.saveInsNursingItemTypeBatch(insertList));
    }

}


