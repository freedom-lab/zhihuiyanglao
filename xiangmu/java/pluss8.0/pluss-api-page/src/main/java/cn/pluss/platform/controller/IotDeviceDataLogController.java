package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.IotDeviceDataLog;
import cn.pluss.platform.service.iotDeviceDataLog.IotDeviceDataLogService;
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
@RequestMapping("/iotDeviceDataLog")
@Api(value = "IotDeviceDataLog控制类",tags={"IotDeviceDataLog接口"})
public class IotDeviceDataLogController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private IotDeviceDataLogService iotDeviceDataLogService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<IotDeviceDataLog>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<IotDeviceDataLog> iotDeviceDataLogList = iotDeviceDataLogService.queryPage(map);
        Integer count= iotDeviceDataLogService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<IotDeviceDataLog>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), iotDeviceDataLogList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceDataLog
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<IotDeviceDataLog>> queryList(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        List<IotDeviceDataLog> iotDeviceDataLogList = iotDeviceDataLogService.queryList(iotDeviceDataLog);
        return ResultGenerator.genSuccessResult(iotDeviceDataLogList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param iotDeviceDataLog 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<IotDeviceDataLog> queryOne(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        return ResultGenerator.genSuccessResult(iotDeviceDataLogService.queryOne(iotDeviceDataLog));
    }

    /**
    * 保存数据
    * @param iotDeviceDataLog
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        //Date currentDt = new Date();
        if (iotDeviceDataLog.getId() != null && iotDeviceDataLog.getId().longValue() > 0) {
            //iotDeviceDataLog.setUpdatedDt(currentDt);
            iotDeviceDataLogService.update(iotDeviceDataLog);
        } else {
            //iotDeviceDataLog.setCreatedDt(currentDt);
            //iotDeviceDataLog.setUpdatedDt(currentDt);
            iotDeviceDataLogService.insert(iotDeviceDataLog);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<IotDeviceDataLog> add(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        //Date currentDt = new Date();
        //iotDeviceDataLog.setCreatedDt(currentDt);
        //iotDeviceDataLog.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(iotDeviceDataLogService.insert(iotDeviceDataLog));
    }

    /**
    * 更新数据
    *
    * @param iotDeviceDataLog 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<IotDeviceDataLog> update(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        return ResultGenerator.genSuccessResult(iotDeviceDataLogService.update(iotDeviceDataLog));
    }

    /**
    * 通过主键删除数据
    *
    * @param iotDeviceDataLog 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody IotDeviceDataLog iotDeviceDataLog) {
        return ResultGenerator.genSuccessResult(iotDeviceDataLogService.deleteById(iotDeviceDataLog.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<IotDeviceDataLog> insertList) {
        return ResultGenerator.genSuccessResult(iotDeviceDataLogService.saveIotDeviceDataLogBatch(insertList));
    }

}


