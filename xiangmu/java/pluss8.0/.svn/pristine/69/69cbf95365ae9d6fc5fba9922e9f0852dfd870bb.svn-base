package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.BladeProcessLeave;
import cn.pluss.platform.service.bladeProcessLeave.BladeProcessLeaveService;
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
@RequestMapping("/bladeProcessLeave")
@Api(value = "BladeProcessLeave控制类",tags={"BladeProcessLeave接口"})
public class BladeProcessLeaveController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private BladeProcessLeaveService bladeProcessLeaveService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<BladeProcessLeave>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<BladeProcessLeave> bladeProcessLeaveList = bladeProcessLeaveService.queryPage(map);
        Integer count= bladeProcessLeaveService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<BladeProcessLeave>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), bladeProcessLeaveList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param bladeProcessLeave
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<BladeProcessLeave>> queryList(@RequestBody BladeProcessLeave bladeProcessLeave) {
        List<BladeProcessLeave> bladeProcessLeaveList = bladeProcessLeaveService.queryList(bladeProcessLeave);
        return ResultGenerator.genSuccessResult(bladeProcessLeaveList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param bladeProcessLeave 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<BladeProcessLeave> queryOne(@RequestBody BladeProcessLeave bladeProcessLeave) {
        return ResultGenerator.genSuccessResult(bladeProcessLeaveService.queryOne(bladeProcessLeave));
    }

    /**
    * 保存数据
    * @param bladeProcessLeave
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody BladeProcessLeave bladeProcessLeave) {
        //Date currentDt = new Date();
        if (bladeProcessLeave.getId() != null && bladeProcessLeave.getId().longValue() > 0) {
            //bladeProcessLeave.setUpdatedDt(currentDt);
            bladeProcessLeaveService.update(bladeProcessLeave);
        } else {
            //bladeProcessLeave.setCreatedDt(currentDt);
            //bladeProcessLeave.setUpdatedDt(currentDt);
            bladeProcessLeaveService.insert(bladeProcessLeave);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<BladeProcessLeave> add(@RequestBody BladeProcessLeave bladeProcessLeave) {
        //Date currentDt = new Date();
        //bladeProcessLeave.setCreatedDt(currentDt);
        //bladeProcessLeave.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(bladeProcessLeaveService.insert(bladeProcessLeave));
    }

    /**
    * 更新数据
    *
    * @param bladeProcessLeave 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<BladeProcessLeave> update(@RequestBody BladeProcessLeave bladeProcessLeave) {
        return ResultGenerator.genSuccessResult(bladeProcessLeaveService.update(bladeProcessLeave));
    }

    /**
    * 通过主键删除数据
    *
    * @param bladeProcessLeave 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody BladeProcessLeave bladeProcessLeave) {
        return ResultGenerator.genSuccessResult(bladeProcessLeaveService.deleteById(bladeProcessLeave.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<BladeProcessLeave> insertList) {
        return ResultGenerator.genSuccessResult(bladeProcessLeaveService.saveBladeProcessLeaveBatch(insertList));
    }

}


