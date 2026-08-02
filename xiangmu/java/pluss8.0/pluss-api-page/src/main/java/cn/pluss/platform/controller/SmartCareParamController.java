package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.SmartCareParam;
import cn.pluss.platform.service.smartCareParam.SmartCareParamService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/smartCareParam")
@Api(value = "SmartCareParam控制类",tags={"SmartCareParam接口"})
public class SmartCareParamController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private SmartCareParamService smartCareParamService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<SmartCareParam>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<SmartCareParam> smartCareParamList = smartCareParamService.queryPage(map);
        Integer count= smartCareParamService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<SmartCareParam>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), smartCareParamList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param smartCareParam
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<SmartCareParam>> queryList(@RequestBody SmartCareParam smartCareParam) {
        List<SmartCareParam> smartCareParamList = smartCareParamService.queryList(smartCareParam);
        return ResultGenerator.genSuccessResult(smartCareParamList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param smartCareParam 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<SmartCareParam> queryOne(@RequestBody SmartCareParam smartCareParam) {
        return ResultGenerator.genSuccessResult(smartCareParamService.queryOne(smartCareParam));
    }

    /**
    * 保存数据
    * @param smartCareParam
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody SmartCareParam smartCareParam) {
        //Date currentDt = new Date();
        if (smartCareParam.getId() != null && smartCareParam.getId().longValue() > 0) {
            //smartCareParam.setUpdatedDt(currentDt);
            smartCareParamService.update(smartCareParam);
        } else {
            //smartCareParam.setCreatedDt(currentDt);
            //smartCareParam.setUpdatedDt(currentDt);
            smartCareParamService.insert(smartCareParam);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<SmartCareParam> add(@RequestBody SmartCareParam smartCareParam) {
        //Date currentDt = new Date();
        //smartCareParam.setCreatedDt(currentDt);
        //smartCareParam.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(smartCareParamService.insert(smartCareParam));
    }

    /**
    * 更新数据
    *
    * @param smartCareParam 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<SmartCareParam> update(@RequestBody SmartCareParam smartCareParam) {
        return ResultGenerator.genSuccessResult(smartCareParamService.update(smartCareParam));
    }

    /**
    * 通过主键删除数据
    *
    * @param smartCareParam 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody SmartCareParam smartCareParam) {
        return ResultGenerator.genSuccessResult(smartCareParamService.deleteById(smartCareParam.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<SmartCareParam> insertList) {
        return ResultGenerator.genSuccessResult(smartCareParamService.saveSmartCareParamBatch(insertList));
    }

}


