package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.IinsElderRetreatCommunicate;
import cn.pluss.platform.service.iinsElderRetreatCommunicate.IinsElderRetreatCommunicateService;
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
@RequestMapping("/iinsElderRetreatCommunicate")
@Api(value = "IinsElderRetreatCommunicate控制类",tags={"IinsElderRetreatCommunicate接口"})
public class IinsElderRetreatCommunicateController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private IinsElderRetreatCommunicateService iinsElderRetreatCommunicateService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<IinsElderRetreatCommunicate>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<IinsElderRetreatCommunicate> iinsElderRetreatCommunicateList = iinsElderRetreatCommunicateService.queryPage(map);
        Integer count= iinsElderRetreatCommunicateService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<IinsElderRetreatCommunicate>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), iinsElderRetreatCommunicateList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param iinsElderRetreatCommunicate
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<IinsElderRetreatCommunicate>> queryList(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        List<IinsElderRetreatCommunicate> iinsElderRetreatCommunicateList = iinsElderRetreatCommunicateService.queryList(iinsElderRetreatCommunicate);
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param iinsElderRetreatCommunicate 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<IinsElderRetreatCommunicate> queryOne(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateService.queryOne(iinsElderRetreatCommunicate));
    }

    /**
    * 保存数据
    * @param iinsElderRetreatCommunicate
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        //Date currentDt = new Date();
        if (iinsElderRetreatCommunicate.getId() != null && iinsElderRetreatCommunicate.getId().longValue() > 0) {
            //iinsElderRetreatCommunicate.setUpdatedDt(currentDt);
            iinsElderRetreatCommunicateService.update(iinsElderRetreatCommunicate);
        } else {
            //iinsElderRetreatCommunicate.setCreatedDt(currentDt);
            //iinsElderRetreatCommunicate.setUpdatedDt(currentDt);
            iinsElderRetreatCommunicateService.insert(iinsElderRetreatCommunicate);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<IinsElderRetreatCommunicate> add(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        //Date currentDt = new Date();
        //iinsElderRetreatCommunicate.setCreatedDt(currentDt);
        //iinsElderRetreatCommunicate.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateService.insert(iinsElderRetreatCommunicate));
    }

    /**
    * 更新数据
    *
    * @param iinsElderRetreatCommunicate 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<IinsElderRetreatCommunicate> update(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateService.update(iinsElderRetreatCommunicate));
    }

    /**
    * 通过主键删除数据
    *
    * @param iinsElderRetreatCommunicate 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody IinsElderRetreatCommunicate iinsElderRetreatCommunicate) {
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateService.deleteById(iinsElderRetreatCommunicate.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<IinsElderRetreatCommunicate> insertList) {
        return ResultGenerator.genSuccessResult(iinsElderRetreatCommunicateService.saveIinsElderRetreatCommunicateBatch(insertList));
    }

}


