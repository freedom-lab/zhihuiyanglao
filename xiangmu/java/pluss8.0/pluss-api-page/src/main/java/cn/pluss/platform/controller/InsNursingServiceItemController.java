package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingServiceItem;
import cn.pluss.platform.service.insNursingServiceItem.InsNursingServiceItemService;
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
@RequestMapping("/insNursingServiceItem")
@Api(value = "InsNursingServiceItem控制类",tags={"InsNursingServiceItem接口"})
public class InsNursingServiceItemController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingServiceItemService insNursingServiceItemService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingServiceItem>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingServiceItem> insNursingServiceItemList = insNursingServiceItemService.queryPage(map);
        Integer count= insNursingServiceItemService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingServiceItem>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingServiceItemList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceItem
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingServiceItem>> queryList(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        List<InsNursingServiceItem> insNursingServiceItemList = insNursingServiceItemService.queryList(insNursingServiceItem);
        return ResultGenerator.genSuccessResult(insNursingServiceItemList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingServiceItem 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingServiceItem> queryOne(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        return ResultGenerator.genSuccessResult(insNursingServiceItemService.queryOne(insNursingServiceItem));
    }

    /**
    * 保存数据
    * @param insNursingServiceItem
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        //Date currentDt = new Date();
        if (insNursingServiceItem.getId() != null && insNursingServiceItem.getId().longValue() > 0) {
            //insNursingServiceItem.setUpdatedDt(currentDt);
            insNursingServiceItemService.update(insNursingServiceItem);
        } else {
            //insNursingServiceItem.setCreatedDt(currentDt);
            //insNursingServiceItem.setUpdatedDt(currentDt);
            insNursingServiceItemService.insert(insNursingServiceItem);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingServiceItem> add(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        //Date currentDt = new Date();
        //insNursingServiceItem.setCreatedDt(currentDt);
        //insNursingServiceItem.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingServiceItemService.insert(insNursingServiceItem));
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceItem 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingServiceItem> update(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        return ResultGenerator.genSuccessResult(insNursingServiceItemService.update(insNursingServiceItem));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingServiceItem 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingServiceItem insNursingServiceItem) {
        return ResultGenerator.genSuccessResult(insNursingServiceItemService.deleteById(insNursingServiceItem.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingServiceItem> insertList) {
        return ResultGenerator.genSuccessResult(insNursingServiceItemService.saveInsNursingServiceItemBatch(insertList));
    }

}


