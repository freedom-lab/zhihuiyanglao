package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsSuddenRepairInfo;
import cn.pluss.platform.service.insSuddenRepairInfo.InsSuddenRepairInfoService;
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
@RequestMapping("/insSuddenRepairInfo")
@Api(value = "InsSuddenRepairInfo控制类",tags={"InsSuddenRepairInfo接口"})
public class InsSuddenRepairInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsSuddenRepairInfoService insSuddenRepairInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsSuddenRepairInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsSuddenRepairInfo> insSuddenRepairInfoList = insSuddenRepairInfoService.queryPage(map);
        Integer count= insSuddenRepairInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsSuddenRepairInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insSuddenRepairInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insSuddenRepairInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsSuddenRepairInfo>> queryList(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        List<InsSuddenRepairInfo> insSuddenRepairInfoList = insSuddenRepairInfoService.queryList(insSuddenRepairInfo);
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insSuddenRepairInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsSuddenRepairInfo> queryOne(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoService.queryOne(insSuddenRepairInfo));
    }

    /**
    * 保存数据
    * @param insSuddenRepairInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        //Date currentDt = new Date();
        if (insSuddenRepairInfo.getId() != null && insSuddenRepairInfo.getId().longValue() > 0) {
            //insSuddenRepairInfo.setUpdatedDt(currentDt);
            insSuddenRepairInfoService.update(insSuddenRepairInfo);
        } else {
            //insSuddenRepairInfo.setCreatedDt(currentDt);
            //insSuddenRepairInfo.setUpdatedDt(currentDt);
            insSuddenRepairInfoService.insert(insSuddenRepairInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsSuddenRepairInfo> add(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        //Date currentDt = new Date();
        //insSuddenRepairInfo.setCreatedDt(currentDt);
        //insSuddenRepairInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoService.insert(insSuddenRepairInfo));
    }

    /**
    * 更新数据
    *
    * @param insSuddenRepairInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsSuddenRepairInfo> update(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoService.update(insSuddenRepairInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insSuddenRepairInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsSuddenRepairInfo insSuddenRepairInfo) {
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoService.deleteById(insSuddenRepairInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsSuddenRepairInfo> insertList) {
        return ResultGenerator.genSuccessResult(insSuddenRepairInfoService.saveInsSuddenRepairInfoBatch(insertList));
    }

}


