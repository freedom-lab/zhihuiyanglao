package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.BladeDict;
import cn.pluss.platform.service.bladeDict.BladeDictService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/bladeDict")
@Api(value = "BladeDict控制类",tags={"BladeDict接口"})
public class BladeDictController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private BladeDictService bladeDictService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<BladeDict>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<BladeDict> bladeDictList = bladeDictService.queryPage(map);
        Integer count= bladeDictService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<BladeDict>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), bladeDictList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param bladeDict
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<BladeDict>> queryList(@RequestBody BladeDict bladeDict) {
        List<BladeDict> bladeDictList = bladeDictService.queryList(bladeDict);
        return ResultGenerator.genSuccessResult(bladeDictList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param bladeDict 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<BladeDict> queryOne(@RequestBody BladeDict bladeDict) {
        return ResultGenerator.genSuccessResult(bladeDictService.queryOne(bladeDict));
    }

    /**
    * 保存数据
    * @param bladeDict
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody BladeDict bladeDict) {
        //Date currentDt = new Date();
        if (bladeDict.getId() != null && bladeDict.getId().longValue() > 0) {
            //bladeDict.setUpdatedDt(currentDt);
            bladeDictService.update(bladeDict);
        } else {
            //bladeDict.setCreatedDt(currentDt);
            //bladeDict.setUpdatedDt(currentDt);
            bladeDictService.insert(bladeDict);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<BladeDict> add(@RequestBody BladeDict bladeDict) {
        //Date currentDt = new Date();
        //bladeDict.setCreatedDt(currentDt);
        //bladeDict.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(bladeDictService.insert(bladeDict));
    }

    /**
    * 更新数据
    *
    * @param bladeDict 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<BladeDict> update(@RequestBody BladeDict bladeDict) {
        return ResultGenerator.genSuccessResult(bladeDictService.update(bladeDict));
    }

    /**
    * 通过主键删除数据
    *
    * @param bladeDict 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody BladeDict bladeDict) {
        return ResultGenerator.genSuccessResult(bladeDictService.deleteById(bladeDict.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<BladeDict> insertList) {
        return ResultGenerator.genSuccessResult(bladeDictService.saveBladeDictBatch(insertList));
    }

}


