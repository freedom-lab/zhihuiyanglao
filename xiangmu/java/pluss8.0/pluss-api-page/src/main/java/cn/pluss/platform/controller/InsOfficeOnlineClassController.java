package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsOfficeOnlineClass;
import cn.pluss.platform.service.insOfficeOnlineClass.InsOfficeOnlineClassService;
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
@RequestMapping("/insOfficeOnlineClass")
@Api(value = "InsOfficeOnlineClass控制类",tags={"InsOfficeOnlineClass接口"})
public class InsOfficeOnlineClassController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsOfficeOnlineClassService insOfficeOnlineClassService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsOfficeOnlineClass>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsOfficeOnlineClass> insOfficeOnlineClassList = insOfficeOnlineClassService.queryPage(map);
        Integer count= insOfficeOnlineClassService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsOfficeOnlineClass>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insOfficeOnlineClassList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insOfficeOnlineClass
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsOfficeOnlineClass>> queryList(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        List<InsOfficeOnlineClass> insOfficeOnlineClassList = insOfficeOnlineClassService.queryList(insOfficeOnlineClass);
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insOfficeOnlineClass 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsOfficeOnlineClass> queryOne(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassService.queryOne(insOfficeOnlineClass));
    }

    /**
    * 保存数据
    * @param insOfficeOnlineClass
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        //Date currentDt = new Date();
        if (insOfficeOnlineClass.getId() != null && insOfficeOnlineClass.getId().longValue() > 0) {
            //insOfficeOnlineClass.setUpdatedDt(currentDt);
            insOfficeOnlineClassService.update(insOfficeOnlineClass);
        } else {
            //insOfficeOnlineClass.setCreatedDt(currentDt);
            //insOfficeOnlineClass.setUpdatedDt(currentDt);
            insOfficeOnlineClassService.insert(insOfficeOnlineClass);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsOfficeOnlineClass> add(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        //Date currentDt = new Date();
        //insOfficeOnlineClass.setCreatedDt(currentDt);
        //insOfficeOnlineClass.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassService.insert(insOfficeOnlineClass));
    }

    /**
    * 更新数据
    *
    * @param insOfficeOnlineClass 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsOfficeOnlineClass> update(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassService.update(insOfficeOnlineClass));
    }

    /**
    * 通过主键删除数据
    *
    * @param insOfficeOnlineClass 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsOfficeOnlineClass insOfficeOnlineClass) {
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassService.deleteById(insOfficeOnlineClass.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsOfficeOnlineClass> insertList) {
        return ResultGenerator.genSuccessResult(insOfficeOnlineClassService.saveInsOfficeOnlineClassBatch(insertList));
    }

}


