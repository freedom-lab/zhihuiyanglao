package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsStaffMemberCardInfo;
import cn.pluss.platform.service.insStaffMemberCardInfo.InsStaffMemberCardInfoService;
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
@RequestMapping("/insStaffMemberCardInfo")
@Api(value = "InsStaffMemberCardInfo控制类",tags={"InsStaffMemberCardInfo接口"})
public class InsStaffMemberCardInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsStaffMemberCardInfoService insStaffMemberCardInfoService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsStaffMemberCardInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsStaffMemberCardInfo> insStaffMemberCardInfoList = insStaffMemberCardInfoService.queryPage(map);
        Integer count= insStaffMemberCardInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsStaffMemberCardInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insStaffMemberCardInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insStaffMemberCardInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsStaffMemberCardInfo>> queryList(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        List<InsStaffMemberCardInfo> insStaffMemberCardInfoList = insStaffMemberCardInfoService.queryList(insStaffMemberCardInfo);
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insStaffMemberCardInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsStaffMemberCardInfo> queryOne(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoService.queryOne(insStaffMemberCardInfo));
    }

    /**
    * 保存数据
    * @param insStaffMemberCardInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        //Date currentDt = new Date();
        if (insStaffMemberCardInfo.getId() != null && insStaffMemberCardInfo.getId().longValue() > 0) {
            //insStaffMemberCardInfo.setUpdatedDt(currentDt);
            insStaffMemberCardInfoService.update(insStaffMemberCardInfo);
        } else {
            //insStaffMemberCardInfo.setCreatedDt(currentDt);
            //insStaffMemberCardInfo.setUpdatedDt(currentDt);
            insStaffMemberCardInfoService.insert(insStaffMemberCardInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsStaffMemberCardInfo> add(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        //Date currentDt = new Date();
        //insStaffMemberCardInfo.setCreatedDt(currentDt);
        //insStaffMemberCardInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoService.insert(insStaffMemberCardInfo));
    }

    /**
    * 更新数据
    *
    * @param insStaffMemberCardInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsStaffMemberCardInfo> update(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoService.update(insStaffMemberCardInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insStaffMemberCardInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsStaffMemberCardInfo insStaffMemberCardInfo) {
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoService.deleteById(insStaffMemberCardInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsStaffMemberCardInfo> insertList) {
        return ResultGenerator.genSuccessResult(insStaffMemberCardInfoService.saveInsStaffMemberCardInfoBatch(insertList));
    }

}


