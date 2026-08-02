package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsTransferInfo;
import cn.pluss.platform.service.insLogisticsTransferInfo.InsLogisticsTransferInfoService;
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
@RequestMapping("/insLogisticsTransferInfo")
@Api(value = "InsLogisticsTransferInfo控制类",tags={"InsLogisticsTransferInfo接口"})
public class InsLogisticsTransferInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsTransferInfoService insLogisticsTransferInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsTransferInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsLogisticsTransferInfo> insLogisticsTransferInfoList = insLogisticsTransferInfoService.queryPage(map);
        Integer count= insLogisticsTransferInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsTransferInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsTransferInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsTransferInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsTransferInfo>> queryList(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        List<InsLogisticsTransferInfo> insLogisticsTransferInfoList = insLogisticsTransferInfoService.queryList(insLogisticsTransferInfo);
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsTransferInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsTransferInfo> queryOne(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoService.queryOne(insLogisticsTransferInfo));
    }

    /**
    * 保存数据
    * @param insLogisticsTransferInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        //Date currentDt = new Date();
        if (insLogisticsTransferInfo.getId() != null && insLogisticsTransferInfo.getId().longValue() > 0) {
            //insLogisticsTransferInfo.setUpdatedDt(currentDt);
            insLogisticsTransferInfoService.update(insLogisticsTransferInfo);
        } else {
            //insLogisticsTransferInfo.setCreatedDt(currentDt);
            //insLogisticsTransferInfo.setUpdatedDt(currentDt);
            insLogisticsTransferInfoService.insert(insLogisticsTransferInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsTransferInfo> add(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        //Date currentDt = new Date();
        //insLogisticsTransferInfo.setCreatedDt(currentDt);
        //insLogisticsTransferInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoService.insert(insLogisticsTransferInfo));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsTransferInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsTransferInfo> update(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoService.update(insLogisticsTransferInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsTransferInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsTransferInfo insLogisticsTransferInfo) {
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoService.deleteById(insLogisticsTransferInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsTransferInfo> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsTransferInfoService.saveInsLogisticsTransferInfoBatch(insertList));
    }

}


