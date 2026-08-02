package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsDonateInfo;
import cn.pluss.platform.service.insDonateInfo.InsDonateInfoService;
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
@RequestMapping("/insDonateInfo")
@Api(value = "InsDonateInfo控制类",tags={"InsDonateInfo接口"})
public class InsDonateInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsDonateInfoService insDonateInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsDonateInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsDonateInfo> insDonateInfoList = insDonateInfoService.queryPage(map);
        Integer count= insDonateInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsDonateInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insDonateInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insDonateInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsDonateInfo>> queryList(@RequestBody InsDonateInfo insDonateInfo) {
        List<InsDonateInfo> insDonateInfoList = insDonateInfoService.queryList(insDonateInfo);
        return ResultGenerator.genSuccessResult(insDonateInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insDonateInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsDonateInfo> queryOne(@RequestBody InsDonateInfo insDonateInfo) {
        return ResultGenerator.genSuccessResult(insDonateInfoService.queryOne(insDonateInfo));
    }

    /**
    * 保存数据
    * @param insDonateInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsDonateInfo insDonateInfo) {
        //Date currentDt = new Date();
        if (insDonateInfo.getId() != null && insDonateInfo.getId().longValue() > 0) {
            //insDonateInfo.setUpdatedDt(currentDt);
            insDonateInfoService.update(insDonateInfo);
        } else {
            //insDonateInfo.setCreatedDt(currentDt);
            //insDonateInfo.setUpdatedDt(currentDt);
            insDonateInfoService.insert(insDonateInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsDonateInfo> add(@RequestBody InsDonateInfo insDonateInfo) {
        //Date currentDt = new Date();
        //insDonateInfo.setCreatedDt(currentDt);
        //insDonateInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insDonateInfoService.insert(insDonateInfo));
    }

    /**
    * 更新数据
    *
    * @param insDonateInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsDonateInfo> update(@RequestBody InsDonateInfo insDonateInfo) {
        return ResultGenerator.genSuccessResult(insDonateInfoService.update(insDonateInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insDonateInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsDonateInfo insDonateInfo) {
        return ResultGenerator.genSuccessResult(insDonateInfoService.deleteById(insDonateInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsDonateInfo> insertList) {
        return ResultGenerator.genSuccessResult(insDonateInfoService.saveInsDonateInfoBatch(insertList));
    }

}


