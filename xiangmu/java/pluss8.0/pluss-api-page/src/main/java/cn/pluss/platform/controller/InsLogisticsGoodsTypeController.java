package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsLogisticsGoodsType;
import cn.pluss.platform.service.insLogisticsGoodsType.InsLogisticsGoodsTypeService;
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
@RequestMapping("/insLogisticsGoodsType")
@Api(value = "InsLogisticsGoodsType控制类",tags={"InsLogisticsGoodsType接口"})
public class InsLogisticsGoodsTypeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsLogisticsGoodsTypeService insLogisticsGoodsTypeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsLogisticsGoodsType>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsLogisticsGoodsType> insLogisticsGoodsTypeList = insLogisticsGoodsTypeService.queryPage(map);
        Integer count= insLogisticsGoodsTypeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsLogisticsGoodsType>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insLogisticsGoodsTypeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insLogisticsGoodsType
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsLogisticsGoodsType>> queryList(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        List<InsLogisticsGoodsType> insLogisticsGoodsTypeList = insLogisticsGoodsTypeService.queryList(insLogisticsGoodsType);
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insLogisticsGoodsType 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsLogisticsGoodsType> queryOne(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeService.queryOne(insLogisticsGoodsType));
    }

    /**
    * 保存数据
    * @param insLogisticsGoodsType
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        //Date currentDt = new Date();
        if (insLogisticsGoodsType.getId() != null && insLogisticsGoodsType.getId().longValue() > 0) {
            //insLogisticsGoodsType.setUpdatedDt(currentDt);
            insLogisticsGoodsTypeService.update(insLogisticsGoodsType);
        } else {
            //insLogisticsGoodsType.setCreatedDt(currentDt);
            //insLogisticsGoodsType.setUpdatedDt(currentDt);
            insLogisticsGoodsTypeService.insert(insLogisticsGoodsType);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insLogisticsGoodsType 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsLogisticsGoodsType> add(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        //Date currentDt = new Date();
        //insLogisticsGoodsType.setCreatedDt(currentDt);
        //insLogisticsGoodsType.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeService.insert(insLogisticsGoodsType));
    }

    /**
    * 更新数据
    *
    * @param insLogisticsGoodsType 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsLogisticsGoodsType> update(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeService.update(insLogisticsGoodsType));
    }

    /**
    * 通过主键删除数据
    *
    * @param insLogisticsGoodsType 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsLogisticsGoodsType insLogisticsGoodsType) {
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeService.deleteById(insLogisticsGoodsType.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsLogisticsGoodsType> insertList) {
        return ResultGenerator.genSuccessResult(insLogisticsGoodsTypeService.saveInsLogisticsGoodsTypeBatch(insertList));
    }

}


