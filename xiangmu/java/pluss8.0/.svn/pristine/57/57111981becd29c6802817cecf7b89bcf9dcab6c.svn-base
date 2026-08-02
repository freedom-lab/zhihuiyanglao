package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderPhotoInfo;
import cn.pluss.platform.service.insElderPhotoInfo.InsElderPhotoInfoService;
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
@RequestMapping("/insElderPhotoInfo")
@Api(value = "InsElderPhotoInfo控制类",tags={"InsElderPhotoInfo接口"})
public class InsElderPhotoInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderPhotoInfoService insElderPhotoInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderPhotoInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderPhotoInfo> insElderPhotoInfoList = insElderPhotoInfoService.queryPage(map);
        Integer count= insElderPhotoInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderPhotoInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderPhotoInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderPhotoInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderPhotoInfo>> queryList(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        List<InsElderPhotoInfo> insElderPhotoInfoList = insElderPhotoInfoService.queryList(insElderPhotoInfo);
        return ResultGenerator.genSuccessResult(insElderPhotoInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderPhotoInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderPhotoInfo> queryOne(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        return ResultGenerator.genSuccessResult(insElderPhotoInfoService.queryOne(insElderPhotoInfo));
    }

    /**
    * 保存数据
    * @param insElderPhotoInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        //Date currentDt = new Date();
        if (insElderPhotoInfo.getId() != null && insElderPhotoInfo.getId().longValue() > 0) {
            //insElderPhotoInfo.setUpdatedDt(currentDt);
            insElderPhotoInfoService.update(insElderPhotoInfo);
        } else {
            //insElderPhotoInfo.setCreatedDt(currentDt);
            //insElderPhotoInfo.setUpdatedDt(currentDt);
            insElderPhotoInfoService.insert(insElderPhotoInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderPhotoInfo> add(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        //Date currentDt = new Date();
        //insElderPhotoInfo.setCreatedDt(currentDt);
        //insElderPhotoInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderPhotoInfoService.insert(insElderPhotoInfo));
    }

    /**
    * 更新数据
    *
    * @param insElderPhotoInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderPhotoInfo> update(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        return ResultGenerator.genSuccessResult(insElderPhotoInfoService.update(insElderPhotoInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderPhotoInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderPhotoInfo insElderPhotoInfo) {
        return ResultGenerator.genSuccessResult(insElderPhotoInfoService.deleteById(insElderPhotoInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderPhotoInfo> insertList) {
        return ResultGenerator.genSuccessResult(insElderPhotoInfoService.saveInsElderPhotoInfoBatch(insertList));
    }

}


