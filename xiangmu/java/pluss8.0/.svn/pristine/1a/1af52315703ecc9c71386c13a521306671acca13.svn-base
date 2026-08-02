package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsRegisterVisitInfo;
import cn.pluss.platform.service.insRegisterVisitInfo.InsRegisterVisitInfoService;
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
@RequestMapping("/insRegisterVisitInfo")
@Api(value = "InsRegisterVisitInfo控制类",tags={"InsRegisterVisitInfo接口"})
public class InsRegisterVisitInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsRegisterVisitInfoService insRegisterVisitInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsRegisterVisitInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsRegisterVisitInfo> insRegisterVisitInfoList = insRegisterVisitInfoService.queryPage(map);
        Integer count= insRegisterVisitInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsRegisterVisitInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insRegisterVisitInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insRegisterVisitInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsRegisterVisitInfo>> queryList(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        List<InsRegisterVisitInfo> insRegisterVisitInfoList = insRegisterVisitInfoService.queryList(insRegisterVisitInfo);
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insRegisterVisitInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsRegisterVisitInfo> queryOne(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoService.queryOne(insRegisterVisitInfo));
    }

    /**
    * 保存数据
    * @param insRegisterVisitInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        //Date currentDt = new Date();
        if (insRegisterVisitInfo.getId() != null && insRegisterVisitInfo.getId().longValue() > 0) {
            //insRegisterVisitInfo.setUpdatedDt(currentDt);
            insRegisterVisitInfoService.update(insRegisterVisitInfo);
        } else {
            //insRegisterVisitInfo.setCreatedDt(currentDt);
            //insRegisterVisitInfo.setUpdatedDt(currentDt);
            insRegisterVisitInfoService.insert(insRegisterVisitInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsRegisterVisitInfo> add(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        //Date currentDt = new Date();
        //insRegisterVisitInfo.setCreatedDt(currentDt);
        //insRegisterVisitInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoService.insert(insRegisterVisitInfo));
    }

    /**
    * 更新数据
    *
    * @param insRegisterVisitInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsRegisterVisitInfo> update(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoService.update(insRegisterVisitInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insRegisterVisitInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsRegisterVisitInfo insRegisterVisitInfo) {
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoService.deleteById(insRegisterVisitInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsRegisterVisitInfo> insertList) {
        return ResultGenerator.genSuccessResult(insRegisterVisitInfoService.saveInsRegisterVisitInfoBatch(insertList));
    }

}


