package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.IotDeviceType;
import cn.pluss.platform.service.iotDeviceType.IotDeviceTypeService;
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
@RequestMapping("/iotDeviceType")
@Api(value = "IotDeviceType控制类",tags={"IotDeviceType接口"})
public class IotDeviceTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private IotDeviceTypeService iotDeviceTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<IotDeviceType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<IotDeviceType> iotDeviceTypeList = iotDeviceTypeService.queryPage(map);
        Integer count= iotDeviceTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<IotDeviceType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), iotDeviceTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param iotDeviceType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<IotDeviceType>> queryList(@RequestBody IotDeviceType iotDeviceType) {
        List<IotDeviceType> iotDeviceTypeList = iotDeviceTypeService.queryList(iotDeviceType);
        return ResultGenerator.genSuccessResult(iotDeviceTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param iotDeviceType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<IotDeviceType> queryOne(@RequestBody IotDeviceType iotDeviceType) {
        return ResultGenerator.genSuccessResult(iotDeviceTypeService.queryOne(iotDeviceType));
    }

    /**
    * 保存数据
    * @param iotDeviceType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody IotDeviceType iotDeviceType) {
        //Date currentDt = new Date();
        if (iotDeviceType.getId() != null && iotDeviceType.getId().longValue() > 0) {
            //iotDeviceType.setUpdatedDt(currentDt);
            iotDeviceTypeService.update(iotDeviceType);
        } else {
            //iotDeviceType.setCreatedDt(currentDt);
            //iotDeviceType.setUpdatedDt(currentDt);
            iotDeviceTypeService.insert(iotDeviceType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<IotDeviceType> add(@RequestBody IotDeviceType iotDeviceType) {
        //Date currentDt = new Date();
        //iotDeviceType.setCreatedDt(currentDt);
        //iotDeviceType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(iotDeviceTypeService.insert(iotDeviceType));
    }

    /**
    * 更新数据
    *
    * @param iotDeviceType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<IotDeviceType> update(@RequestBody IotDeviceType iotDeviceType) {
        return ResultGenerator.genSuccessResult(iotDeviceTypeService.update(iotDeviceType));
    }

    /**
    * 通过主键删除数据
    *
    * @param iotDeviceType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody IotDeviceType iotDeviceType) {
        return ResultGenerator.genSuccessResult(iotDeviceTypeService.deleteById(iotDeviceType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<IotDeviceType> insertList) {
        return ResultGenerator.genSuccessResult(iotDeviceTypeService.saveIotDeviceTypeBatch(insertList));
    }

}


