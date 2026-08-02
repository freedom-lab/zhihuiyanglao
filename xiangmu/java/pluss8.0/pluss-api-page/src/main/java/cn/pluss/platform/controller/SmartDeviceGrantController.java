package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.SmartDeviceGrant;
import cn.pluss.platform.service.smartDeviceGrant.SmartDeviceGrantService;
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
@RequestMapping("/smartDeviceGrant")
@Api(value = "SmartDeviceGrant控制类",tags={"SmartDeviceGrant接口"})
public class SmartDeviceGrantController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private SmartDeviceGrantService smartDeviceGrantService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<SmartDeviceGrant>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<SmartDeviceGrant> smartDeviceGrantList = smartDeviceGrantService.queryPage(map);
        Integer count= smartDeviceGrantService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<SmartDeviceGrant>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), smartDeviceGrantList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param smartDeviceGrant
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<SmartDeviceGrant>> queryList(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        List<SmartDeviceGrant> smartDeviceGrantList = smartDeviceGrantService.queryList(smartDeviceGrant);
        return ResultGenerator.genSuccessResult(smartDeviceGrantList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param smartDeviceGrant 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<SmartDeviceGrant> queryOne(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        return ResultGenerator.genSuccessResult(smartDeviceGrantService.queryOne(smartDeviceGrant));
    }

    /**
    * 保存数据
    * @param smartDeviceGrant
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        //Date currentDt = new Date();
        if (smartDeviceGrant.getId() != null && smartDeviceGrant.getId().longValue() > 0) {
            //smartDeviceGrant.setUpdatedDt(currentDt);
            smartDeviceGrantService.update(smartDeviceGrant);
        } else {
            //smartDeviceGrant.setCreatedDt(currentDt);
            //smartDeviceGrant.setUpdatedDt(currentDt);
            smartDeviceGrantService.insert(smartDeviceGrant);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param smartDeviceGrant 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<SmartDeviceGrant> add(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        //Date currentDt = new Date();
        //smartDeviceGrant.setCreatedDt(currentDt);
        //smartDeviceGrant.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(smartDeviceGrantService.insert(smartDeviceGrant));
    }

    /**
    * 更新数据
    *
    * @param smartDeviceGrant 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<SmartDeviceGrant> update(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        return ResultGenerator.genSuccessResult(smartDeviceGrantService.update(smartDeviceGrant));
    }

    /**
    * 通过主键删除数据
    *
    * @param smartDeviceGrant 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody SmartDeviceGrant smartDeviceGrant) {
        return ResultGenerator.genSuccessResult(smartDeviceGrantService.deleteById(smartDeviceGrant.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<SmartDeviceGrant> insertList) {
        return ResultGenerator.genSuccessResult(smartDeviceGrantService.saveSmartDeviceGrantBatch(insertList));
    }

}


