package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.MarketGoodsType;
import cn.pluss.platform.service.marketGoodsType.MarketGoodsTypeService;
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
@RequestMapping("/marketGoodsType")
@Api(value = "MarketGoodsType控制类",tags={"MarketGoodsType接口"})
public class MarketGoodsTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private MarketGoodsTypeService marketGoodsTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<MarketGoodsType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<MarketGoodsType> marketGoodsTypeList = marketGoodsTypeService.queryPage(map);
        Integer count= marketGoodsTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<MarketGoodsType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), marketGoodsTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param marketGoodsType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<MarketGoodsType>> queryList(@RequestBody MarketGoodsType marketGoodsType) {
        List<MarketGoodsType> marketGoodsTypeList = marketGoodsTypeService.queryList(marketGoodsType);
        return ResultGenerator.genSuccessResult(marketGoodsTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param marketGoodsType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<MarketGoodsType> queryOne(@RequestBody MarketGoodsType marketGoodsType) {
        return ResultGenerator.genSuccessResult(marketGoodsTypeService.queryOne(marketGoodsType));
    }

    /**
    * 保存数据
    * @param marketGoodsType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody MarketGoodsType marketGoodsType) {
        //Date currentDt = new Date();
        if (marketGoodsType.getId() != null && marketGoodsType.getId().longValue() > 0) {
            //marketGoodsType.setUpdatedDt(currentDt);
            marketGoodsTypeService.update(marketGoodsType);
        } else {
            //marketGoodsType.setCreatedDt(currentDt);
            //marketGoodsType.setUpdatedDt(currentDt);
            marketGoodsTypeService.insert(marketGoodsType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<MarketGoodsType> add(@RequestBody MarketGoodsType marketGoodsType) {
        //Date currentDt = new Date();
        //marketGoodsType.setCreatedDt(currentDt);
        //marketGoodsType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(marketGoodsTypeService.insert(marketGoodsType));
    }

    /**
    * 更新数据
    *
    * @param marketGoodsType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<MarketGoodsType> update(@RequestBody MarketGoodsType marketGoodsType) {
        return ResultGenerator.genSuccessResult(marketGoodsTypeService.update(marketGoodsType));
    }

    /**
    * 通过主键删除数据
    *
    * @param marketGoodsType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody MarketGoodsType marketGoodsType) {
        return ResultGenerator.genSuccessResult(marketGoodsTypeService.deleteById(marketGoodsType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<MarketGoodsType> insertList) {
        return ResultGenerator.genSuccessResult(marketGoodsTypeService.saveMarketGoodsTypeBatch(insertList));
    }

}


