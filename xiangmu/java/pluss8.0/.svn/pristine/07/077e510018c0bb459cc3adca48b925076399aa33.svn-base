package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.MarketGoodsInfo;
import cn.pluss.platform.service.marketGoodsInfo.MarketGoodsInfoService;
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
@RequestMapping("/marketGoodsInfo")
@Api(value = "MarketGoodsInfo控制类",tags={"MarketGoodsInfo接口"})
public class MarketGoodsInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private MarketGoodsInfoService marketGoodsInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<MarketGoodsInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<MarketGoodsInfo> marketGoodsInfoList = marketGoodsInfoService.queryPage(map);
        Integer count= marketGoodsInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<MarketGoodsInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), marketGoodsInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<MarketGoodsInfo>> queryList(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        List<MarketGoodsInfo> marketGoodsInfoList = marketGoodsInfoService.queryList(marketGoodsInfo);
        return ResultGenerator.genSuccessResult(marketGoodsInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param marketGoodsInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<MarketGoodsInfo> queryOne(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        return ResultGenerator.genSuccessResult(marketGoodsInfoService.queryOne(marketGoodsInfo));
    }

    /**
    * 保存数据
    * @param marketGoodsInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        //Date currentDt = new Date();
        if (marketGoodsInfo.getId() != null && marketGoodsInfo.getId().longValue() > 0) {
            //marketGoodsInfo.setUpdatedDt(currentDt);
            marketGoodsInfoService.update(marketGoodsInfo);
        } else {
            //marketGoodsInfo.setCreatedDt(currentDt);
            //marketGoodsInfo.setUpdatedDt(currentDt);
            marketGoodsInfoService.insert(marketGoodsInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<MarketGoodsInfo> add(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        //Date currentDt = new Date();
        //marketGoodsInfo.setCreatedDt(currentDt);
        //marketGoodsInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(marketGoodsInfoService.insert(marketGoodsInfo));
    }

    /**
    * 更新数据
    *
    * @param marketGoodsInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<MarketGoodsInfo> update(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        return ResultGenerator.genSuccessResult(marketGoodsInfoService.update(marketGoodsInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param marketGoodsInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody MarketGoodsInfo marketGoodsInfo) {
        return ResultGenerator.genSuccessResult(marketGoodsInfoService.deleteById(marketGoodsInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<MarketGoodsInfo> insertList) {
        return ResultGenerator.genSuccessResult(marketGoodsInfoService.saveMarketGoodsInfoBatch(insertList));
    }

}


