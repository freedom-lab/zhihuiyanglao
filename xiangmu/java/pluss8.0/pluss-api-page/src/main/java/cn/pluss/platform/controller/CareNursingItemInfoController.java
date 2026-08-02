package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CareNursingItemInfo;
import cn.pluss.platform.service.careNursingItemInfo.CareNursingItemInfoService;
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
@RequestMapping("/careNursingItemInfo")
@Api(value = "CareNursingItemInfo控制类",tags={"CareNursingItemInfo接口"})
public class CareNursingItemInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CareNursingItemInfoService careNursingItemInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CareNursingItemInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CareNursingItemInfo> careNursingItemInfoList = careNursingItemInfoService.queryPage(map);
        Integer count= careNursingItemInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CareNursingItemInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), careNursingItemInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param careNursingItemInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CareNursingItemInfo>> queryList(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        List<CareNursingItemInfo> careNursingItemInfoList = careNursingItemInfoService.queryList(careNursingItemInfo);
        return ResultGenerator.genSuccessResult(careNursingItemInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param careNursingItemInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CareNursingItemInfo> queryOne(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        return ResultGenerator.genSuccessResult(careNursingItemInfoService.queryOne(careNursingItemInfo));
    }

    /**
    * 保存数据
    * @param careNursingItemInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        //Date currentDt = new Date();
        if (careNursingItemInfo.getId() != null && careNursingItemInfo.getId().longValue() > 0) {
            //careNursingItemInfo.setUpdatedDt(currentDt);
            careNursingItemInfoService.update(careNursingItemInfo);
        } else {
            //careNursingItemInfo.setCreatedDt(currentDt);
            //careNursingItemInfo.setUpdatedDt(currentDt);
            careNursingItemInfoService.insert(careNursingItemInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CareNursingItemInfo> add(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        //Date currentDt = new Date();
        //careNursingItemInfo.setCreatedDt(currentDt);
        //careNursingItemInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(careNursingItemInfoService.insert(careNursingItemInfo));
    }

    /**
    * 更新数据
    *
    * @param careNursingItemInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CareNursingItemInfo> update(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        return ResultGenerator.genSuccessResult(careNursingItemInfoService.update(careNursingItemInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param careNursingItemInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CareNursingItemInfo careNursingItemInfo) {
        return ResultGenerator.genSuccessResult(careNursingItemInfoService.deleteById(careNursingItemInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CareNursingItemInfo> insertList) {
        return ResultGenerator.genSuccessResult(careNursingItemInfoService.saveCareNursingItemInfoBatch(insertList));
    }

}


