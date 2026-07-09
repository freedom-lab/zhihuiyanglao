package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsMedicalSelfDrug;
import cn.pluss.platform.service.insMedicalSelfDrug.InsMedicalSelfDrugService;
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
@RequestMapping("/insMedicalSelfDrug")
@Api(value = "InsMedicalSelfDrug控制类",tags={"InsMedicalSelfDrug接口"})
public class InsMedicalSelfDrugController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsMedicalSelfDrugService insMedicalSelfDrugService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsMedicalSelfDrug>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsMedicalSelfDrug> insMedicalSelfDrugList = insMedicalSelfDrugService.queryPage(map);
        Integer count= insMedicalSelfDrugService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsMedicalSelfDrug>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insMedicalSelfDrugList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalSelfDrug
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsMedicalSelfDrug>> queryList(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        List<InsMedicalSelfDrug> insMedicalSelfDrugList = insMedicalSelfDrugService.queryList(insMedicalSelfDrug);
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insMedicalSelfDrug 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsMedicalSelfDrug> queryOne(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugService.queryOne(insMedicalSelfDrug));
    }

    /**
    * 保存数据
    * @param insMedicalSelfDrug
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        //Date currentDt = new Date();
        if (insMedicalSelfDrug.getId() != null && insMedicalSelfDrug.getId().longValue() > 0) {
            //insMedicalSelfDrug.setUpdatedDt(currentDt);
            insMedicalSelfDrugService.update(insMedicalSelfDrug);
        } else {
            //insMedicalSelfDrug.setCreatedDt(currentDt);
            //insMedicalSelfDrug.setUpdatedDt(currentDt);
            insMedicalSelfDrugService.insert(insMedicalSelfDrug);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insMedicalSelfDrug 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsMedicalSelfDrug> add(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        //Date currentDt = new Date();
        //insMedicalSelfDrug.setCreatedDt(currentDt);
        //insMedicalSelfDrug.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugService.insert(insMedicalSelfDrug));
    }

    /**
    * 更新数据
    *
    * @param insMedicalSelfDrug 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsMedicalSelfDrug> update(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugService.update(insMedicalSelfDrug));
    }

    /**
    * 通过主键删除数据
    *
    * @param insMedicalSelfDrug 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsMedicalSelfDrug insMedicalSelfDrug) {
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugService.deleteById(insMedicalSelfDrug.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsMedicalSelfDrug> insertList) {
        return ResultGenerator.genSuccessResult(insMedicalSelfDrugService.saveInsMedicalSelfDrugBatch(insertList));
    }

}


