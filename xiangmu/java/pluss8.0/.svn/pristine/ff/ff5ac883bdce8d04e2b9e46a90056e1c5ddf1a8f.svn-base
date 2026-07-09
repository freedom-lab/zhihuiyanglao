package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenWeekMenu;
import cn.pluss.platform.service.insCanteenWeekMenu.InsCanteenWeekMenuService;
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
@RequestMapping("/insCanteenWeekMenu")
@Api(value = "InsCanteenWeekMenu控制类",tags={"InsCanteenWeekMenu接口"})
public class InsCanteenWeekMenuController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenWeekMenuService insCanteenWeekMenuService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenWeekMenu>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsCanteenWeekMenu> insCanteenWeekMenuList = insCanteenWeekMenuService.queryPage(map);
        Integer count= insCanteenWeekMenuService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenWeekMenu>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenWeekMenuList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenu
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenWeekMenu>> queryList(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        List<InsCanteenWeekMenu> insCanteenWeekMenuList = insCanteenWeekMenuService.queryList(insCanteenWeekMenu);
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenWeekMenu 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenWeekMenu> queryOne(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuService.queryOne(insCanteenWeekMenu));
    }

    /**
    * 保存数据
    * @param insCanteenWeekMenu
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        //Date currentDt = new Date();
        if (insCanteenWeekMenu.getId() != null && insCanteenWeekMenu.getId().longValue() > 0) {
            //insCanteenWeekMenu.setUpdatedDt(currentDt);
            insCanteenWeekMenuService.update(insCanteenWeekMenu);
        } else {
            //insCanteenWeekMenu.setCreatedDt(currentDt);
            //insCanteenWeekMenu.setUpdatedDt(currentDt);
            insCanteenWeekMenuService.insert(insCanteenWeekMenu);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenWeekMenu> add(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        //Date currentDt = new Date();
        //insCanteenWeekMenu.setCreatedDt(currentDt);
        //insCanteenWeekMenu.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuService.insert(insCanteenWeekMenu));
    }

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenu 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenWeekMenu> update(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuService.update(insCanteenWeekMenu));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenWeekMenu 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenWeekMenu insCanteenWeekMenu) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuService.deleteById(insCanteenWeekMenu.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenWeekMenu> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuService.saveInsCanteenWeekMenuBatch(insertList));
    }

}


