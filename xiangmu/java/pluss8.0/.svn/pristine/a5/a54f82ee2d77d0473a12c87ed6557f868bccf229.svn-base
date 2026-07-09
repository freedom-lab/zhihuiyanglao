package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderInsureInfo;
import cn.pluss.platform.service.insElderInsureInfo.InsElderInsureInfoService;
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
@RequestMapping("/insElderInsureInfo")
@Api(value = "InsElderInsureInfo控制类",tags={"InsElderInsureInfo接口"})
public class InsElderInsureInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderInsureInfoService insElderInsureInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderInsureInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderInsureInfo> insElderInsureInfoList = insElderInsureInfoService.queryPage(map);
        Integer count= insElderInsureInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderInsureInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderInsureInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderInsureInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderInsureInfo>> queryList(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        List<InsElderInsureInfo> insElderInsureInfoList = insElderInsureInfoService.queryList(insElderInsureInfo);
        return ResultGenerator.genSuccessResult(insElderInsureInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderInsureInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderInsureInfo> queryOne(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        return ResultGenerator.genSuccessResult(insElderInsureInfoService.queryOne(insElderInsureInfo));
    }

    /**
    * 保存数据
    * @param insElderInsureInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        //Date currentDt = new Date();
        if (insElderInsureInfo.getId() != null && insElderInsureInfo.getId().longValue() > 0) {
            //insElderInsureInfo.setUpdatedDt(currentDt);
            insElderInsureInfoService.update(insElderInsureInfo);
        } else {
            //insElderInsureInfo.setCreatedDt(currentDt);
            //insElderInsureInfo.setUpdatedDt(currentDt);
            insElderInsureInfoService.insert(insElderInsureInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderInsureInfo> add(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        //Date currentDt = new Date();
        //insElderInsureInfo.setCreatedDt(currentDt);
        //insElderInsureInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderInsureInfoService.insert(insElderInsureInfo));
    }

    /**
    * 更新数据
    *
    * @param insElderInsureInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderInsureInfo> update(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        return ResultGenerator.genSuccessResult(insElderInsureInfoService.update(insElderInsureInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderInsureInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderInsureInfo insElderInsureInfo) {
        return ResultGenerator.genSuccessResult(insElderInsureInfoService.deleteById(insElderInsureInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderInsureInfo> insertList) {
        return ResultGenerator.genSuccessResult(insElderInsureInfoService.saveInsElderInsureInfoBatch(insertList));
    }

}


