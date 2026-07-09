package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseFloorInfo;
import cn.pluss.platform.service.insBaseFloorInfo.InsBaseFloorInfoService;
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
@RequestMapping("/insBaseFloorInfo")
@Api(value = "InsBaseFloorInfo控制类",tags={"InsBaseFloorInfo接口"})
public class InsBaseFloorInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseFloorInfoService insBaseFloorInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseFloorInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseFloorInfo> insBaseFloorInfoList = insBaseFloorInfoService.queryPage(map);
        Integer count= insBaseFloorInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseFloorInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseFloorInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseFloorInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseFloorInfo>> queryList(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        List<InsBaseFloorInfo> insBaseFloorInfoList = insBaseFloorInfoService.queryList(insBaseFloorInfo);
        return ResultGenerator.genSuccessResult(insBaseFloorInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseFloorInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseFloorInfo> queryOne(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        return ResultGenerator.genSuccessResult(insBaseFloorInfoService.queryOne(insBaseFloorInfo));
    }

    /**
    * 保存数据
    * @param insBaseFloorInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        //Date currentDt = new Date();
        if (insBaseFloorInfo.getId() != null && insBaseFloorInfo.getId().longValue() > 0) {
            //insBaseFloorInfo.setUpdatedDt(currentDt);
            insBaseFloorInfoService.update(insBaseFloorInfo);
        } else {
            //insBaseFloorInfo.setCreatedDt(currentDt);
            //insBaseFloorInfo.setUpdatedDt(currentDt);
            insBaseFloorInfoService.insert(insBaseFloorInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseFloorInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseFloorInfo> add(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        //Date currentDt = new Date();
        //insBaseFloorInfo.setCreatedDt(currentDt);
        //insBaseFloorInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseFloorInfoService.insert(insBaseFloorInfo));
    }

    /**
    * 更新数据
    *
    * @param insBaseFloorInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseFloorInfo> update(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        return ResultGenerator.genSuccessResult(insBaseFloorInfoService.update(insBaseFloorInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseFloorInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseFloorInfo insBaseFloorInfo) {
        return ResultGenerator.genSuccessResult(insBaseFloorInfoService.deleteById(insBaseFloorInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseFloorInfo> insertList) {
        return ResultGenerator.genSuccessResult(insBaseFloorInfoService.saveInsBaseFloorInfoBatch(insertList));
    }

}


