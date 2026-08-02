package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsMedicalDrugInfo;
import cn.pluss.platform.service.insMedicalDrugInfo.InsMedicalDrugInfoService;
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
@RequestMapping("/insMedicalDrugInfo")
@Api(value = "InsMedicalDrugInfo控制类",tags={"InsMedicalDrugInfo接口"})
public class InsMedicalDrugInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsMedicalDrugInfoService insMedicalDrugInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsMedicalDrugInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsMedicalDrugInfo> insMedicalDrugInfoList = insMedicalDrugInfoService.queryPage(map);
        Integer count= insMedicalDrugInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsMedicalDrugInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insMedicalDrugInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsMedicalDrugInfo>> queryList(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        List<InsMedicalDrugInfo> insMedicalDrugInfoList = insMedicalDrugInfoService.queryList(insMedicalDrugInfo);
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insMedicalDrugInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsMedicalDrugInfo> queryOne(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoService.queryOne(insMedicalDrugInfo));
    }

    /**
    * 保存数据
    * @param insMedicalDrugInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        //Date currentDt = new Date();
        if (insMedicalDrugInfo.getId() != null && insMedicalDrugInfo.getId().longValue() > 0) {
            //insMedicalDrugInfo.setUpdatedDt(currentDt);
            insMedicalDrugInfoService.update(insMedicalDrugInfo);
        } else {
            //insMedicalDrugInfo.setCreatedDt(currentDt);
            //insMedicalDrugInfo.setUpdatedDt(currentDt);
            insMedicalDrugInfoService.insert(insMedicalDrugInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsMedicalDrugInfo> add(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        //Date currentDt = new Date();
        //insMedicalDrugInfo.setCreatedDt(currentDt);
        //insMedicalDrugInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoService.insert(insMedicalDrugInfo));
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsMedicalDrugInfo> update(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoService.update(insMedicalDrugInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insMedicalDrugInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsMedicalDrugInfo insMedicalDrugInfo) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoService.deleteById(insMedicalDrugInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsMedicalDrugInfo> insertList) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInfoService.saveInsMedicalDrugInfoBatch(insertList));
    }

}


