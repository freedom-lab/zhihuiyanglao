package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderRetreatInfo;
import cn.pluss.platform.service.insElderRetreatInfo.InsElderRetreatInfoService;
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
@RequestMapping("/insElderRetreatInfo")
@Api(value = "InsElderRetreatInfo控制类",tags={"InsElderRetreatInfo接口"})
public class InsElderRetreatInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderRetreatInfoService insElderRetreatInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderRetreatInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderRetreatInfo> insElderRetreatInfoList = insElderRetreatInfoService.queryPage(map);
        Integer count= insElderRetreatInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderRetreatInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderRetreatInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderRetreatInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderRetreatInfo>> queryList(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        List<InsElderRetreatInfo> insElderRetreatInfoList = insElderRetreatInfoService.queryList(insElderRetreatInfo);
        return ResultGenerator.genSuccessResult(insElderRetreatInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderRetreatInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderRetreatInfo> queryOne(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        return ResultGenerator.genSuccessResult(insElderRetreatInfoService.queryOne(insElderRetreatInfo));
    }

    /**
    * 保存数据
    * @param insElderRetreatInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        //Date currentDt = new Date();
        if (insElderRetreatInfo.getId() != null && insElderRetreatInfo.getId().longValue() > 0) {
            //insElderRetreatInfo.setUpdatedDt(currentDt);
            insElderRetreatInfoService.update(insElderRetreatInfo);
        } else {
            //insElderRetreatInfo.setCreatedDt(currentDt);
            //insElderRetreatInfo.setUpdatedDt(currentDt);
            insElderRetreatInfoService.insert(insElderRetreatInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderRetreatInfo> add(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        //Date currentDt = new Date();
        //insElderRetreatInfo.setCreatedDt(currentDt);
        //insElderRetreatInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderRetreatInfoService.insert(insElderRetreatInfo));
    }

    /**
    * 更新数据
    *
    * @param insElderRetreatInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderRetreatInfo> update(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        return ResultGenerator.genSuccessResult(insElderRetreatInfoService.update(insElderRetreatInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderRetreatInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderRetreatInfo insElderRetreatInfo) {
        return ResultGenerator.genSuccessResult(insElderRetreatInfoService.deleteById(insElderRetreatInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderRetreatInfo> insertList) {
        return ResultGenerator.genSuccessResult(insElderRetreatInfoService.saveInsElderRetreatInfoBatch(insertList));
    }

}


