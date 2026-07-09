package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareNursingItemType;
import cn.pluss.platform.service.careNursingItemType.CareNursingItemTypeService;
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
@RequestMapping("/careNursingItemType")
@Api(value = "CareNursingItemType控制类",tags={"CareNursingItemType接口"})
public class CareNursingItemTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareNursingItemTypeService careNursingItemTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareNursingItemType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareNursingItemType> careNursingItemTypeList = careNursingItemTypeService.queryPage(map);
        Integer count= careNursingItemTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareNursingItemType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careNursingItemTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careNursingItemType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareNursingItemType>> queryList(@RequestBody CareNursingItemType careNursingItemType) {
        List<CareNursingItemType> careNursingItemTypeList = careNursingItemTypeService.queryList(careNursingItemType);
        return ResultGenerator.genSuccessResult(careNursingItemTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careNursingItemType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareNursingItemType> queryOne(@RequestBody CareNursingItemType careNursingItemType) {
        return ResultGenerator.genSuccessResult(careNursingItemTypeService.queryOne(careNursingItemType));
    }

    /**
    * 保存数据
    * @param careNursingItemType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareNursingItemType careNursingItemType) {
        //Date currentDt = new Date();
        if (careNursingItemType.getId() != null && careNursingItemType.getId().longValue() > 0) {
            //careNursingItemType.setUpdatedDt(currentDt);
            careNursingItemTypeService.update(careNursingItemType);
        } else {
            //careNursingItemType.setCreatedDt(currentDt);
            //careNursingItemType.setUpdatedDt(currentDt);
            careNursingItemTypeService.insert(careNursingItemType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careNursingItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareNursingItemType> add(@RequestBody CareNursingItemType careNursingItemType) {
        //Date currentDt = new Date();
        //careNursingItemType.setCreatedDt(currentDt);
        //careNursingItemType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careNursingItemTypeService.insert(careNursingItemType));
    }

    /**
    * 更新数据
    *
    * @param careNursingItemType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareNursingItemType> update(@RequestBody CareNursingItemType careNursingItemType) {
        return ResultGenerator.genSuccessResult(careNursingItemTypeService.update(careNursingItemType));
    }

    /**
    * 通过主键删除数据
    *
    * @param careNursingItemType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareNursingItemType careNursingItemType) {
        return ResultGenerator.genSuccessResult(careNursingItemTypeService.deleteById(careNursingItemType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareNursingItemType> insertList) {
        return ResultGenerator.genSuccessResult(careNursingItemTypeService.saveCareNursingItemTypeBatch(insertList));
    }

}


