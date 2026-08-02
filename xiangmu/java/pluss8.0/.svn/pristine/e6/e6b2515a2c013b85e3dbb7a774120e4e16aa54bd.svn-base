package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CanteenLeftoverDisposal;
import cn.pluss.platform.service.canteenLeftoverDisposal.CanteenLeftoverDisposalService;
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
@RequestMapping("/canteenLeftoverDisposal")
@Api(value = "CanteenLeftoverDisposal控制类",tags={"CanteenLeftoverDisposal接口"})
public class CanteenLeftoverDisposalController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CanteenLeftoverDisposalService canteenLeftoverDisposalService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CanteenLeftoverDisposal>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CanteenLeftoverDisposal> canteenLeftoverDisposalList = canteenLeftoverDisposalService.queryPage(map);
        Integer count= canteenLeftoverDisposalService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CanteenLeftoverDisposal>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), canteenLeftoverDisposalList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param canteenLeftoverDisposal
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CanteenLeftoverDisposal>> queryList(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        List<CanteenLeftoverDisposal> canteenLeftoverDisposalList = canteenLeftoverDisposalService.queryList(canteenLeftoverDisposal);
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param canteenLeftoverDisposal 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CanteenLeftoverDisposal> queryOne(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalService.queryOne(canteenLeftoverDisposal));
    }

    /**
    * 保存数据
    * @param canteenLeftoverDisposal
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        //Date currentDt = new Date();
        if (canteenLeftoverDisposal.getId() != null && canteenLeftoverDisposal.getId().longValue() > 0) {
            //canteenLeftoverDisposal.setUpdatedDt(currentDt);
            canteenLeftoverDisposalService.update(canteenLeftoverDisposal);
        } else {
            //canteenLeftoverDisposal.setCreatedDt(currentDt);
            //canteenLeftoverDisposal.setUpdatedDt(currentDt);
            canteenLeftoverDisposalService.insert(canteenLeftoverDisposal);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CanteenLeftoverDisposal> add(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        //Date currentDt = new Date();
        //canteenLeftoverDisposal.setCreatedDt(currentDt);
        //canteenLeftoverDisposal.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalService.insert(canteenLeftoverDisposal));
    }

    /**
    * 更新数据
    *
    * @param canteenLeftoverDisposal 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CanteenLeftoverDisposal> update(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalService.update(canteenLeftoverDisposal));
    }

    /**
    * 通过主键删除数据
    *
    * @param canteenLeftoverDisposal 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CanteenLeftoverDisposal canteenLeftoverDisposal) {
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalService.deleteById(canteenLeftoverDisposal.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CanteenLeftoverDisposal> insertList) {
        return ResultGenerator.genSuccessResult(canteenLeftoverDisposalService.saveCanteenLeftoverDisposalBatch(insertList));
    }

}


