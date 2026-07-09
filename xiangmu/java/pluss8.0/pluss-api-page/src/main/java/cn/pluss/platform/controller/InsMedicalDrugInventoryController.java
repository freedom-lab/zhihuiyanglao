package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsMedicalDrugInventory;
import cn.pluss.platform.service.insMedicalDrugInventory.InsMedicalDrugInventoryService;
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
@RequestMapping("/insMedicalDrugInventory")
@Api(value = "InsMedicalDrugInventory控制类",tags={"InsMedicalDrugInventory接口"})
public class InsMedicalDrugInventoryController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsMedicalDrugInventoryService insMedicalDrugInventoryService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsMedicalDrugInventory>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsMedicalDrugInventory> insMedicalDrugInventoryList = insMedicalDrugInventoryService.queryPage(map);
        Integer count= insMedicalDrugInventoryService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsMedicalDrugInventory>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insMedicalDrugInventoryList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insMedicalDrugInventory
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsMedicalDrugInventory>> queryList(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        List<InsMedicalDrugInventory> insMedicalDrugInventoryList = insMedicalDrugInventoryService.queryList(insMedicalDrugInventory);
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insMedicalDrugInventory 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsMedicalDrugInventory> queryOne(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryService.queryOne(insMedicalDrugInventory));
    }

    /**
    * 保存数据
    * @param insMedicalDrugInventory
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        //Date currentDt = new Date();
        if (insMedicalDrugInventory.getId() != null && insMedicalDrugInventory.getId().longValue() > 0) {
            //insMedicalDrugInventory.setUpdatedDt(currentDt);
            insMedicalDrugInventoryService.update(insMedicalDrugInventory);
        } else {
            //insMedicalDrugInventory.setCreatedDt(currentDt);
            //insMedicalDrugInventory.setUpdatedDt(currentDt);
            insMedicalDrugInventoryService.insert(insMedicalDrugInventory);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insMedicalDrugInventory 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsMedicalDrugInventory> add(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        //Date currentDt = new Date();
        //insMedicalDrugInventory.setCreatedDt(currentDt);
        //insMedicalDrugInventory.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryService.insert(insMedicalDrugInventory));
    }

    /**
    * 更新数据
    *
    * @param insMedicalDrugInventory 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsMedicalDrugInventory> update(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryService.update(insMedicalDrugInventory));
    }

    /**
    * 通过主键删除数据
    *
    * @param insMedicalDrugInventory 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsMedicalDrugInventory insMedicalDrugInventory) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryService.deleteById(insMedicalDrugInventory.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsMedicalDrugInventory> insertList) {
        return ResultGenerator.genSuccessResult(insMedicalDrugInventoryService.saveInsMedicalDrugInventoryBatch(insertList));
    }

}


