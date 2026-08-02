package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsActivityEntryInfo;
import cn.pluss.platform.service.insActivityEntryInfo.InsActivityEntryInfoService;
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
@RequestMapping("/insActivityEntryInfo")
@Api(value = "InsActivityEntryInfo控制类",tags={"InsActivityEntryInfo接口"})
public class InsActivityEntryInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsActivityEntryInfoService insActivityEntryInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsActivityEntryInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsActivityEntryInfo> insActivityEntryInfoList = insActivityEntryInfoService.queryPage(map);
        Integer count= insActivityEntryInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsActivityEntryInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insActivityEntryInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insActivityEntryInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsActivityEntryInfo>> queryList(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        List<InsActivityEntryInfo> insActivityEntryInfoList = insActivityEntryInfoService.queryList(insActivityEntryInfo);
        return ResultGenerator.genSuccessResult(insActivityEntryInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insActivityEntryInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsActivityEntryInfo> queryOne(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        return ResultGenerator.genSuccessResult(insActivityEntryInfoService.queryOne(insActivityEntryInfo));
    }

    /**
    * 保存数据
    * @param insActivityEntryInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        //Date currentDt = new Date();
        if (insActivityEntryInfo.getId() != null && insActivityEntryInfo.getId().longValue() > 0) {
            //insActivityEntryInfo.setUpdatedDt(currentDt);
            insActivityEntryInfoService.update(insActivityEntryInfo);
        } else {
            //insActivityEntryInfo.setCreatedDt(currentDt);
            //insActivityEntryInfo.setUpdatedDt(currentDt);
            insActivityEntryInfoService.insert(insActivityEntryInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insActivityEntryInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsActivityEntryInfo> add(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        //Date currentDt = new Date();
        //insActivityEntryInfo.setCreatedDt(currentDt);
        //insActivityEntryInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insActivityEntryInfoService.insert(insActivityEntryInfo));
    }

    /**
    * 更新数据
    *
    * @param insActivityEntryInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsActivityEntryInfo> update(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        return ResultGenerator.genSuccessResult(insActivityEntryInfoService.update(insActivityEntryInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insActivityEntryInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsActivityEntryInfo insActivityEntryInfo) {
        return ResultGenerator.genSuccessResult(insActivityEntryInfoService.deleteById(insActivityEntryInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsActivityEntryInfo> insertList) {
        return ResultGenerator.genSuccessResult(insActivityEntryInfoService.saveInsActivityEntryInfoBatch(insertList));
    }

}


