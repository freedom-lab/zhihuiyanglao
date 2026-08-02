package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderHealthParam;
import cn.pluss.platform.service.insElderHealthParam.InsElderHealthParamService;
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
@RequestMapping("/insElderHealthParam")
@Api(value = "InsElderHealthParam控制类",tags={"InsElderHealthParam接口"})
public class InsElderHealthParamController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderHealthParamService insElderHealthParamService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderHealthParam>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderHealthParam> insElderHealthParamList = insElderHealthParamService.queryPage(map);
        Integer count= insElderHealthParamService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderHealthParam>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderHealthParamList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderHealthParam
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderHealthParam>> queryList(@RequestBody InsElderHealthParam insElderHealthParam) {
        List<InsElderHealthParam> insElderHealthParamList = insElderHealthParamService.queryList(insElderHealthParam);
        return ResultGenerator.genSuccessResult(insElderHealthParamList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderHealthParam 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderHealthParam> queryOne(@RequestBody InsElderHealthParam insElderHealthParam) {
        return ResultGenerator.genSuccessResult(insElderHealthParamService.queryOne(insElderHealthParam));
    }

    /**
    * 保存数据
    * @param insElderHealthParam
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderHealthParam insElderHealthParam) {
        //Date currentDt = new Date();
        if (insElderHealthParam.getId() != null && insElderHealthParam.getId().longValue() > 0) {
            //insElderHealthParam.setUpdatedDt(currentDt);
            insElderHealthParamService.update(insElderHealthParam);
        } else {
            //insElderHealthParam.setCreatedDt(currentDt);
            //insElderHealthParam.setUpdatedDt(currentDt);
            insElderHealthParamService.insert(insElderHealthParam);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderHealthParam> add(@RequestBody InsElderHealthParam insElderHealthParam) {
        //Date currentDt = new Date();
        //insElderHealthParam.setCreatedDt(currentDt);
        //insElderHealthParam.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderHealthParamService.insert(insElderHealthParam));
    }

    /**
    * 更新数据
    *
    * @param insElderHealthParam 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderHealthParam> update(@RequestBody InsElderHealthParam insElderHealthParam) {
        return ResultGenerator.genSuccessResult(insElderHealthParamService.update(insElderHealthParam));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderHealthParam 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderHealthParam insElderHealthParam) {
        return ResultGenerator.genSuccessResult(insElderHealthParamService.deleteById(insElderHealthParam.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderHealthParam> insertList) {
        return ResultGenerator.genSuccessResult(insElderHealthParamService.saveInsElderHealthParamBatch(insertList));
    }

}


