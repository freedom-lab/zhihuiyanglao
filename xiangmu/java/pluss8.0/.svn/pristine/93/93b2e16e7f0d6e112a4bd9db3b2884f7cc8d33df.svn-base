package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsSupplierInfo;
import cn.pluss.platform.service.insLogisticsSupplierInfo.InsLogisticsSupplierInfoService;
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
@RequestMapping("/insLogisticsSupplierInfo")
@Api(value = "InsLogisticsSupplierInfo控制类",tags={"InsLogisticsSupplierInfo接口"})
public class InsLogisticsSupplierInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsSupplierInfoService insLogisticsSupplierInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsSupplierInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsLogisticsSupplierInfo> insLogisticsSupplierInfoList = insLogisticsSupplierInfoService.queryPage(map);
        Integer count= insLogisticsSupplierInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsSupplierInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsSupplierInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsSupplierInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsSupplierInfo>> queryList(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        List<InsLogisticsSupplierInfo> insLogisticsSupplierInfoList = insLogisticsSupplierInfoService.queryList(insLogisticsSupplierInfo);
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsSupplierInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsSupplierInfo> queryOne(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoService.queryOne(insLogisticsSupplierInfo));
    }

    /**
    * 保存数据
    * @param insLogisticsSupplierInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        //Date currentDt = new Date();
        if (insLogisticsSupplierInfo.getId() != null && insLogisticsSupplierInfo.getId().longValue() > 0) {
            //insLogisticsSupplierInfo.setUpdatedDt(currentDt);
            insLogisticsSupplierInfoService.update(insLogisticsSupplierInfo);
        } else {
            //insLogisticsSupplierInfo.setCreatedDt(currentDt);
            //insLogisticsSupplierInfo.setUpdatedDt(currentDt);
            insLogisticsSupplierInfoService.insert(insLogisticsSupplierInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsSupplierInfo> add(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        //Date currentDt = new Date();
        //insLogisticsSupplierInfo.setCreatedDt(currentDt);
        //insLogisticsSupplierInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoService.insert(insLogisticsSupplierInfo));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsSupplierInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsSupplierInfo> update(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoService.update(insLogisticsSupplierInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsSupplierInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsSupplierInfo insLogisticsSupplierInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoService.deleteById(insLogisticsSupplierInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsSupplierInfo> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsSupplierInfoService.saveInsLogisticsSupplierInfoBatch(insertList));
    }

}


