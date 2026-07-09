package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingItemInfo;
import cn.pluss.platform.service.insNursingItemInfo.InsNursingItemInfoService;
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
@RequestMapping("/insNursingItemInfo")
@Api(value = "InsNursingItemInfo控制类",tags={"InsNursingItemInfo接口"})
public class InsNursingItemInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingItemInfoService insNursingItemInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingItemInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingItemInfo> insNursingItemInfoList = insNursingItemInfoService.queryPage(map);
        Integer count= insNursingItemInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingItemInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingItemInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingItemInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingItemInfo>> queryList(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        List<InsNursingItemInfo> insNursingItemInfoList = insNursingItemInfoService.queryList(insNursingItemInfo);
        return ResultGenerator.genSuccessResult(insNursingItemInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingItemInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingItemInfo> queryOne(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        return ResultGenerator.genSuccessResult(insNursingItemInfoService.queryOne(insNursingItemInfo));
    }

    /**
    * 保存数据
    * @param insNursingItemInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        //Date currentDt = new Date();
        if (insNursingItemInfo.getId() != null && insNursingItemInfo.getId().longValue() > 0) {
            //insNursingItemInfo.setUpdatedDt(currentDt);
            insNursingItemInfoService.update(insNursingItemInfo);
        } else {
            //insNursingItemInfo.setCreatedDt(currentDt);
            //insNursingItemInfo.setUpdatedDt(currentDt);
            insNursingItemInfoService.insert(insNursingItemInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingItemInfo> add(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        //Date currentDt = new Date();
        //insNursingItemInfo.setCreatedDt(currentDt);
        //insNursingItemInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingItemInfoService.insert(insNursingItemInfo));
    }

    /**
    * 更新数据
    *
    * @param insNursingItemInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingItemInfo> update(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        return ResultGenerator.genSuccessResult(insNursingItemInfoService.update(insNursingItemInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingItemInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingItemInfo insNursingItemInfo) {
        return ResultGenerator.genSuccessResult(insNursingItemInfoService.deleteById(insNursingItemInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingItemInfo> insertList) {
        return ResultGenerator.genSuccessResult(insNursingItemInfoService.saveInsNursingItemInfoBatch(insertList));
    }

}


