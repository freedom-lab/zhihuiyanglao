package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsOfficeKnowledgeInfo;
import cn.pluss.platform.service.insOfficeKnowledgeInfo.InsOfficeKnowledgeInfoService;
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
@RequestMapping("/insOfficeKnowledgeInfo")
@Api(value = "InsOfficeKnowledgeInfo控制类",tags={"InsOfficeKnowledgeInfo接口"})
public class InsOfficeKnowledgeInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsOfficeKnowledgeInfoService insOfficeKnowledgeInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsOfficeKnowledgeInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsOfficeKnowledgeInfo> insOfficeKnowledgeInfoList = insOfficeKnowledgeInfoService.queryPage(map);
        Integer count= insOfficeKnowledgeInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsOfficeKnowledgeInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insOfficeKnowledgeInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeKnowledgeInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsOfficeKnowledgeInfo>> queryList(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        List<InsOfficeKnowledgeInfo> insOfficeKnowledgeInfoList = insOfficeKnowledgeInfoService.queryList(insOfficeKnowledgeInfo);
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insOfficeKnowledgeInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsOfficeKnowledgeInfo> queryOne(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoService.queryOne(insOfficeKnowledgeInfo));
    }

    /**
    * 保存数据
    * @param insOfficeKnowledgeInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        //Date currentDt = new Date();
        if (insOfficeKnowledgeInfo.getId() != null && insOfficeKnowledgeInfo.getId().longValue() > 0) {
            //insOfficeKnowledgeInfo.setUpdatedDt(currentDt);
            insOfficeKnowledgeInfoService.update(insOfficeKnowledgeInfo);
        } else {
            //insOfficeKnowledgeInfo.setCreatedDt(currentDt);
            //insOfficeKnowledgeInfo.setUpdatedDt(currentDt);
            insOfficeKnowledgeInfoService.insert(insOfficeKnowledgeInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsOfficeKnowledgeInfo> add(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        //Date currentDt = new Date();
        //insOfficeKnowledgeInfo.setCreatedDt(currentDt);
        //insOfficeKnowledgeInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoService.insert(insOfficeKnowledgeInfo));
    }

    /**
    * 更新数据
    *
    * @param insOfficeKnowledgeInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsOfficeKnowledgeInfo> update(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoService.update(insOfficeKnowledgeInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insOfficeKnowledgeInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsOfficeKnowledgeInfo insOfficeKnowledgeInfo) {
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoService.deleteById(insOfficeKnowledgeInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsOfficeKnowledgeInfo> insertList) {
        return ResultGenerator.genSuccessResult(insOfficeKnowledgeInfoService.saveInsOfficeKnowledgeInfoBatch(insertList));
    }

}


