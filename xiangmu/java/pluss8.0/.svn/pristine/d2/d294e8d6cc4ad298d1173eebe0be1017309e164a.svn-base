package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseRoomInfo;
import cn.pluss.platform.service.insBaseRoomInfo.InsBaseRoomInfoService;
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
@RequestMapping("/insBaseRoomInfo")
@Api(value = "InsBaseRoomInfo控制类",tags={"InsBaseRoomInfo接口"})
public class InsBaseRoomInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseRoomInfoService insBaseRoomInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseRoomInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseRoomInfo> insBaseRoomInfoList = insBaseRoomInfoService.queryPage(map);
        Integer count= insBaseRoomInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseRoomInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseRoomInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseRoomInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseRoomInfo>> queryList(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        List<InsBaseRoomInfo> insBaseRoomInfoList = insBaseRoomInfoService.queryList(insBaseRoomInfo);
        return ResultGenerator.genSuccessResult(insBaseRoomInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseRoomInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseRoomInfo> queryOne(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        return ResultGenerator.genSuccessResult(insBaseRoomInfoService.queryOne(insBaseRoomInfo));
    }

    /**
    * 保存数据
    * @param insBaseRoomInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        //Date currentDt = new Date();
        if (insBaseRoomInfo.getId() != null && insBaseRoomInfo.getId().longValue() > 0) {
            //insBaseRoomInfo.setUpdatedDt(currentDt);
            insBaseRoomInfoService.update(insBaseRoomInfo);
        } else {
            //insBaseRoomInfo.setCreatedDt(currentDt);
            //insBaseRoomInfo.setUpdatedDt(currentDt);
            insBaseRoomInfoService.insert(insBaseRoomInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseRoomInfo> add(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        //Date currentDt = new Date();
        //insBaseRoomInfo.setCreatedDt(currentDt);
        //insBaseRoomInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseRoomInfoService.insert(insBaseRoomInfo));
    }

    /**
    * 更新数据
    *
    * @param insBaseRoomInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseRoomInfo> update(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        return ResultGenerator.genSuccessResult(insBaseRoomInfoService.update(insBaseRoomInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseRoomInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        return ResultGenerator.genSuccessResult(insBaseRoomInfoService.deleteById(insBaseRoomInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseRoomInfo> insertList) {
        return ResultGenerator.genSuccessResult(insBaseRoomInfoService.saveInsBaseRoomInfoBatch(insertList));
    }

}


