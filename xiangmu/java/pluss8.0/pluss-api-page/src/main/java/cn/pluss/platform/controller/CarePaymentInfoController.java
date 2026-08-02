package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CarePaymentInfo;
import cn.pluss.platform.service.carePaymentInfo.CarePaymentInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;



@RestController
@RequestMapping("/carePaymentInfo")
@Api(value = "CarePaymentInfo控制类",tags={"CarePaymentInfo接口"})
public class CarePaymentInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CarePaymentInfoService carePaymentInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CarePaymentInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CarePaymentInfo> carePaymentInfoList = carePaymentInfoService.queryPage(map);
        Integer count= carePaymentInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CarePaymentInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), carePaymentInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param carePaymentInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CarePaymentInfo>> queryList(@RequestBody CarePaymentInfo carePaymentInfo) {
        List<CarePaymentInfo> carePaymentInfoList = carePaymentInfoService.queryList(carePaymentInfo);
        return ResultGenerator.genSuccessResult(carePaymentInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param carePaymentInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CarePaymentInfo> queryOne(@RequestBody CarePaymentInfo carePaymentInfo) {
        return ResultGenerator.genSuccessResult(carePaymentInfoService.queryOne(carePaymentInfo));
    }

    /**
    * 保存数据
    * @param carePaymentInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CarePaymentInfo carePaymentInfo) {
        //Date currentDt = new Date();
        if (carePaymentInfo.getId() != null && carePaymentInfo.getId().longValue() > 0) {
            //carePaymentInfo.setUpdatedDt(currentDt);
            carePaymentInfoService.update(carePaymentInfo);
        } else {
            //carePaymentInfo.setCreatedDt(currentDt);
            //carePaymentInfo.setUpdatedDt(currentDt);
            carePaymentInfoService.insert(carePaymentInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param carePaymentInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CarePaymentInfo> add(@RequestBody CarePaymentInfo carePaymentInfo) {
        //Date currentDt = new Date();
        //carePaymentInfo.setCreatedDt(currentDt);
        //carePaymentInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(carePaymentInfoService.insert(carePaymentInfo));
    }

    /**
    * 更新数据
    *
    * @param carePaymentInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CarePaymentInfo> update(@RequestBody CarePaymentInfo carePaymentInfo) {
        return ResultGenerator.genSuccessResult(carePaymentInfoService.update(carePaymentInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param carePaymentInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CarePaymentInfo carePaymentInfo) {
        return ResultGenerator.genSuccessResult(carePaymentInfoService.deleteById(carePaymentInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CarePaymentInfo> insertList) {
        return ResultGenerator.genSuccessResult(carePaymentInfoService.saveCarePaymentInfoBatch(insertList));
    }

}


