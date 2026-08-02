package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseBedInfo;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
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
@RequestMapping("/insBaseBedInfo")
@Api(value = "InsBaseBedInfo控制类",tags={"InsBaseBedInfo接口"})
public class InsBaseBedInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseBedInfoService insBaseBedInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseBedInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseBedInfo> insBaseBedInfoList = insBaseBedInfoService.queryPage(map);
        Integer count= insBaseBedInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseBedInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseBedInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBedInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseBedInfo>> queryList(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        List<InsBaseBedInfo> insBaseBedInfoList = insBaseBedInfoService.queryList(insBaseBedInfo);
        return ResultGenerator.genSuccessResult(insBaseBedInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseBedInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseBedInfo> queryOne(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.queryOne(insBaseBedInfo));
    }

    /**
    * 保存数据
    * @param insBaseBedInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        //Date currentDt = new Date();
        if (insBaseBedInfo.getId() != null && insBaseBedInfo.getId().longValue() > 0) {
            //insBaseBedInfo.setUpdatedDt(currentDt);
            insBaseBedInfoService.update(insBaseBedInfo);
        } else {
            //insBaseBedInfo.setCreatedDt(currentDt);
            //insBaseBedInfo.setUpdatedDt(currentDt);
            insBaseBedInfoService.insert(insBaseBedInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseBedInfo> add(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        //Date currentDt = new Date();
        //insBaseBedInfo.setCreatedDt(currentDt);
        //insBaseBedInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.insert(insBaseBedInfo));
    }

    /**
    * 更新数据
    *
    * @param insBaseBedInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseBedInfo> update(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.update(insBaseBedInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseBedInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseBedInfo insBaseBedInfo) {
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.deleteById(insBaseBedInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseBedInfo> insertList) {
        return ResultGenerator.genSuccessResult(insBaseBedInfoService.saveInsBaseBedInfoBatch(insertList));
    }

}


