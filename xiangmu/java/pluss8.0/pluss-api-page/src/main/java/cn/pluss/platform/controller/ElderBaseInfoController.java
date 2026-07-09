package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.ElderBaseInfo;
import cn.pluss.platform.service.elderBaseInfo.ElderBaseInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/elderBaseInfo")
@Api(value = "ElderBaseInfo控制类",tags={"ElderBaseInfo接口"})
public class ElderBaseInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private ElderBaseInfoService elderBaseInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<ElderBaseInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<ElderBaseInfo> elderBaseInfoList = elderBaseInfoService.queryPage(map);
        Integer count= elderBaseInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<ElderBaseInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), elderBaseInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param elderBaseInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<ElderBaseInfo>> queryList(@RequestBody ElderBaseInfo elderBaseInfo) {
        List<ElderBaseInfo> elderBaseInfoList = elderBaseInfoService.queryList(elderBaseInfo);
        return ResultGenerator.genSuccessResult(elderBaseInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param elderBaseInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<ElderBaseInfo> queryOne(@RequestBody ElderBaseInfo elderBaseInfo) {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.queryOne(elderBaseInfo));
    }

    /**
    * 保存数据
    * @param elderBaseInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody ElderBaseInfo elderBaseInfo) {
        //Date currentDt = new Date();
        if (elderBaseInfo.getId() != null && elderBaseInfo.getId().longValue() > 0) {
            //elderBaseInfo.setUpdatedDt(currentDt);
            elderBaseInfoService.update(elderBaseInfo);
        } else {
            //elderBaseInfo.setCreatedDt(currentDt);
            //elderBaseInfo.setUpdatedDt(currentDt);
            elderBaseInfoService.insert(elderBaseInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<ElderBaseInfo> add(@RequestBody ElderBaseInfo elderBaseInfo) {
        //Date currentDt = new Date();
        //elderBaseInfo.setCreatedDt(currentDt);
        //elderBaseInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(elderBaseInfoService.insert(elderBaseInfo));
    }

    /**
    * 更新数据
    *
    * @param elderBaseInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<ElderBaseInfo> update(@RequestBody ElderBaseInfo elderBaseInfo) {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.update(elderBaseInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param elderBaseInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody ElderBaseInfo elderBaseInfo) {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.deleteById(elderBaseInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<ElderBaseInfo> insertList) {
        return ResultGenerator.genSuccessResult(elderBaseInfoService.saveElderBaseInfoBatch(insertList));
    }

}


