package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.SmartDeviceParamFall;
import cn.pluss.platform.service.smartDeviceParamFall.SmartDeviceParamFallService;
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
@RequestMapping("/smartDeviceParamFall")
@Api(value = "SmartDeviceParamFall控制类",tags={"SmartDeviceParamFall接口"})
public class SmartDeviceParamFallController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private SmartDeviceParamFallService smartDeviceParamFallService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<SmartDeviceParamFall>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<SmartDeviceParamFall> smartDeviceParamFallList = smartDeviceParamFallService.queryPage(map);
        Integer count= smartDeviceParamFallService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<SmartDeviceParamFall>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), smartDeviceParamFallList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceParamFall
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<SmartDeviceParamFall>> queryList(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        List<SmartDeviceParamFall> smartDeviceParamFallList = smartDeviceParamFallService.queryList(smartDeviceParamFall);
        return ResultGenerator.genSuccessResult(smartDeviceParamFallList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param smartDeviceParamFall 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<SmartDeviceParamFall> queryOne(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        return ResultGenerator.genSuccessResult(smartDeviceParamFallService.queryOne(smartDeviceParamFall));
    }

    /**
    * 保存数据
    * @param smartDeviceParamFall
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        //Date currentDt = new Date();
        if (smartDeviceParamFall.getId() != null && smartDeviceParamFall.getId().longValue() > 0) {
            //smartDeviceParamFall.setUpdatedDt(currentDt);
            smartDeviceParamFallService.update(smartDeviceParamFall);
        } else {
            //smartDeviceParamFall.setCreatedDt(currentDt);
            //smartDeviceParamFall.setUpdatedDt(currentDt);
            smartDeviceParamFallService.insert(smartDeviceParamFall);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<SmartDeviceParamFall> add(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        //Date currentDt = new Date();
        //smartDeviceParamFall.setCreatedDt(currentDt);
        //smartDeviceParamFall.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(smartDeviceParamFallService.insert(smartDeviceParamFall));
    }

    /**
    * 更新数据
    *
    * @param smartDeviceParamFall 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<SmartDeviceParamFall> update(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        return ResultGenerator.genSuccessResult(smartDeviceParamFallService.update(smartDeviceParamFall));
    }

    /**
    * 通过主键删除数据
    *
    * @param smartDeviceParamFall 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody SmartDeviceParamFall smartDeviceParamFall) {
        return ResultGenerator.genSuccessResult(smartDeviceParamFallService.deleteById(smartDeviceParamFall.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<SmartDeviceParamFall> insertList) {
        return ResultGenerator.genSuccessResult(smartDeviceParamFallService.saveSmartDeviceParamFallBatch(insertList));
    }

}


