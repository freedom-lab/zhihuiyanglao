package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsOfficeFileInfo;
import cn.pluss.platform.service.insOfficeFileInfo.InsOfficeFileInfoService;
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
@RequestMapping("/insOfficeFileInfo")
@Api(value = "InsOfficeFileInfo控制类",tags={"InsOfficeFileInfo接口"})
public class InsOfficeFileInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsOfficeFileInfoService insOfficeFileInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsOfficeFileInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsOfficeFileInfo> insOfficeFileInfoList = insOfficeFileInfoService.queryPage(map);
        Integer count= insOfficeFileInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsOfficeFileInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insOfficeFileInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeFileInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsOfficeFileInfo>> queryList(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        List<InsOfficeFileInfo> insOfficeFileInfoList = insOfficeFileInfoService.queryList(insOfficeFileInfo);
        return ResultGenerator.genSuccessResult(insOfficeFileInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insOfficeFileInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsOfficeFileInfo> queryOne(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        return ResultGenerator.genSuccessResult(insOfficeFileInfoService.queryOne(insOfficeFileInfo));
    }

    /**
    * 保存数据
    * @param insOfficeFileInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        //Date currentDt = new Date();
        if (insOfficeFileInfo.getId() != null && insOfficeFileInfo.getId().longValue() > 0) {
            //insOfficeFileInfo.setUpdatedDt(currentDt);
            insOfficeFileInfoService.update(insOfficeFileInfo);
        } else {
            //insOfficeFileInfo.setCreatedDt(currentDt);
            //insOfficeFileInfo.setUpdatedDt(currentDt);
            insOfficeFileInfoService.insert(insOfficeFileInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsOfficeFileInfo> add(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        //Date currentDt = new Date();
        //insOfficeFileInfo.setCreatedDt(currentDt);
        //insOfficeFileInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insOfficeFileInfoService.insert(insOfficeFileInfo));
    }

    /**
    * 更新数据
    *
    * @param insOfficeFileInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsOfficeFileInfo> update(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        return ResultGenerator.genSuccessResult(insOfficeFileInfoService.update(insOfficeFileInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insOfficeFileInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsOfficeFileInfo insOfficeFileInfo) {
        return ResultGenerator.genSuccessResult(insOfficeFileInfoService.deleteById(insOfficeFileInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsOfficeFileInfo> insertList) {
        return ResultGenerator.genSuccessResult(insOfficeFileInfoService.saveInsOfficeFileInfoBatch(insertList));
    }

}


