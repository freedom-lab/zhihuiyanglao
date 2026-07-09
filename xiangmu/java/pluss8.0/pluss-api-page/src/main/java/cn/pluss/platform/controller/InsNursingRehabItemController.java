package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingRehabItem;
import cn.pluss.platform.service.insNursingRehabItem.InsNursingRehabItemService;
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
@RequestMapping("/insNursingRehabItem")
@Api(value = "InsNursingRehabItem控制类",tags={"InsNursingRehabItem接口"})
public class InsNursingRehabItemController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingRehabItemService insNursingRehabItemService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingRehabItem>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingRehabItem> insNursingRehabItemList = insNursingRehabItemService.queryPage(map);
        Integer count= insNursingRehabItemService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingRehabItem>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingRehabItemList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingRehabItem
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingRehabItem>> queryList(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        List<InsNursingRehabItem> insNursingRehabItemList = insNursingRehabItemService.queryList(insNursingRehabItem);
        return ResultGenerator.genSuccessResult(insNursingRehabItemList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingRehabItem 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingRehabItem> queryOne(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemService.queryOne(insNursingRehabItem));
    }

    /**
    * 保存数据
    * @param insNursingRehabItem
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        //Date currentDt = new Date();
        if (insNursingRehabItem.getId() != null && insNursingRehabItem.getId().longValue() > 0) {
            //insNursingRehabItem.setUpdatedDt(currentDt);
            insNursingRehabItemService.update(insNursingRehabItem);
        } else {
            //insNursingRehabItem.setCreatedDt(currentDt);
            //insNursingRehabItem.setUpdatedDt(currentDt);
            insNursingRehabItemService.insert(insNursingRehabItem);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingRehabItem> add(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        //Date currentDt = new Date();
        //insNursingRehabItem.setCreatedDt(currentDt);
        //insNursingRehabItem.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingRehabItemService.insert(insNursingRehabItem));
    }

    /**
    * 更新数据
    *
    * @param insNursingRehabItem 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingRehabItem> update(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemService.update(insNursingRehabItem));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingRehabItem 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingRehabItem insNursingRehabItem) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemService.deleteById(insNursingRehabItem.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingRehabItem> insertList) {
        return ResultGenerator.genSuccessResult(insNursingRehabItemService.saveInsNursingRehabItemBatch(insertList));
    }

}


