package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingServiceOrder;
import cn.pluss.platform.service.insNursingServiceOrder.InsNursingServiceOrderService;
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
@RequestMapping("/insNursingServiceOrder")
@Api(value = "InsNursingServiceOrder控制类",tags={"InsNursingServiceOrder接口"})
public class InsNursingServiceOrderController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingServiceOrderService insNursingServiceOrderService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingServiceOrder>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingServiceOrder> insNursingServiceOrderList = insNursingServiceOrderService.queryPage(map);
        Integer count= insNursingServiceOrderService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingServiceOrder>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingServiceOrderList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingServiceOrder
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingServiceOrder>> queryList(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        List<InsNursingServiceOrder> insNursingServiceOrderList = insNursingServiceOrderService.queryList(insNursingServiceOrder);
        return ResultGenerator.genSuccessResult(insNursingServiceOrderList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingServiceOrder 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingServiceOrder> queryOne(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        return ResultGenerator.genSuccessResult(insNursingServiceOrderService.queryOne(insNursingServiceOrder));
    }

    /**
    * 保存数据
    * @param insNursingServiceOrder
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        //Date currentDt = new Date();
        if (insNursingServiceOrder.getId() != null && insNursingServiceOrder.getId().longValue() > 0) {
            //insNursingServiceOrder.setUpdatedDt(currentDt);
            insNursingServiceOrderService.update(insNursingServiceOrder);
        } else {
            //insNursingServiceOrder.setCreatedDt(currentDt);
            //insNursingServiceOrder.setUpdatedDt(currentDt);
            insNursingServiceOrderService.insert(insNursingServiceOrder);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingServiceOrder 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingServiceOrder> add(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        //Date currentDt = new Date();
        //insNursingServiceOrder.setCreatedDt(currentDt);
        //insNursingServiceOrder.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingServiceOrderService.insert(insNursingServiceOrder));
    }

    /**
    * 更新数据
    *
    * @param insNursingServiceOrder 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingServiceOrder> update(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        return ResultGenerator.genSuccessResult(insNursingServiceOrderService.update(insNursingServiceOrder));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingServiceOrder 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingServiceOrder insNursingServiceOrder) {
        return ResultGenerator.genSuccessResult(insNursingServiceOrderService.deleteById(insNursingServiceOrder.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingServiceOrder> insertList) {
        return ResultGenerator.genSuccessResult(insNursingServiceOrderService.saveInsNursingServiceOrderBatch(insertList));
    }

}


