package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseCostInfo;
import cn.pluss.platform.model.entity.InsBaseCostItemInfo;
import cn.pluss.platform.service.insBaseCostInfo.InsBaseCostInfoService;
import cn.pluss.platform.service.insBaseCostItemInfo.InsBaseCostItemInfoService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import javax.annotation.Resource;



@RestController
@RequestMapping("/insBaseCostInfo")
@Api(value = "InsBaseCostInfo控制类",tags={"InsBaseCostInfo接口"})
public class InsBaseCostInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseCostInfoService insBaseCostInfoService;
    @Resource
    private InsBaseCostItemInfoService insBaseCostItemInfoService;
    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseCostInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseCostInfo> insBaseCostInfoList = insBaseCostInfoService.queryPage(map);
        Integer count= insBaseCostInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseCostInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseCostInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseCostInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseCostInfo>> queryList(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        List<InsBaseCostInfo> insBaseCostInfoList = insBaseCostInfoService.queryList(insBaseCostInfo);
        return ResultGenerator.genSuccessResult(insBaseCostInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseCostInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseCostInfo> queryOne(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        return ResultGenerator.genSuccessResult(insBaseCostInfoService.queryOne(insBaseCostInfo));
    }

    /**
    * 保存数据
    * @param insBaseCostInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        //Date currentDt = new Date();
        if (insBaseCostInfo.getId() != null && insBaseCostInfo.getId().longValue() > 0) {
            //insBaseCostInfo.setUpdatedDt(currentDt);
            insBaseCostInfoService.update(insBaseCostInfo);
        } else {
            //insBaseCostInfo.setCreatedDt(currentDt);
            //insBaseCostInfo.setUpdatedDt(currentDt);
            insBaseCostInfoService.insert(insBaseCostInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseCostInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseCostInfo> add(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        //Date currentDt = new Date();
        //insBaseCostInfo.setCreatedDt(currentDt);
        //insBaseCostInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseCostInfoService.insert(insBaseCostInfo));
    }

    /**
    * 更新数据
    *
    * @param insBaseCostInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseCostInfo> update(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        return ResultGenerator.genSuccessResult(insBaseCostInfoService.update(insBaseCostInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseCostInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        return ResultGenerator.genSuccessResult(insBaseCostInfoService.deleteById(insBaseCostInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseCostInfo> insertList) {
        return ResultGenerator.genSuccessResult(insBaseCostInfoService.saveInsBaseCostInfoBatch(insertList));
    }

    /**
     * 根据条件获取集合
     * @param insBaseCostInfo
     * @return
     */
    @PostMapping("/queryCostInfo")
    @ApiOperation(value = "一次性查出费用类别和费用明细", notes = "一次性查出费用类别和费用明细", httpMethod = "POST")
    public Result<List<InsBaseCostInfo>> queryCostInfo(@RequestBody InsBaseCostInfo insBaseCostInfo) {
        List<InsBaseCostInfo> insBaseCostInfoList = insBaseCostInfoService.queryList(new InsBaseCostInfo());
        List<InsBaseCostItemInfo> insBaseCostItemInfoList= insBaseCostItemInfoService.queryList(new InsBaseCostItemInfo());
        for ( InsBaseCostInfo insBaseCostInfoFor:insBaseCostInfoList){
            List<InsBaseCostItemInfo> insBaseCostItemList=new ArrayList<InsBaseCostItemInfo>();
            insBaseCostInfoFor.setCostItemList(insBaseCostItemList);
            for ( InsBaseCostItemInfo insBaseCostItemInfoFor:insBaseCostItemInfoList){
                if(insBaseCostInfoFor.getId().longValue()==insBaseCostItemInfoFor.getCostId().longValue()){
                    insBaseCostItemList.add(insBaseCostItemInfoFor);
                }
            }
        }
        return ResultGenerator.genSuccessResult(insBaseCostInfoList);
    }
}


