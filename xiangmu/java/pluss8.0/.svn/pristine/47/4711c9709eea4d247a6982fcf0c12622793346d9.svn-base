package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CommunityMedicationRemind;
import cn.pluss.platform.service.communityMedicationRemind.CommunityMedicationRemindService;
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
@RequestMapping("/communityMedicationRemind")
@Api(value = "CommunityMedicationRemind控制类",tags={"CommunityMedicationRemind接口"})
public class CommunityMedicationRemindController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CommunityMedicationRemindService communityMedicationRemindService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CommunityMedicationRemind>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CommunityMedicationRemind> communityMedicationRemindList = communityMedicationRemindService.queryPage(map);
        Integer count= communityMedicationRemindService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CommunityMedicationRemind>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), communityMedicationRemindList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param communityMedicationRemind
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CommunityMedicationRemind>> queryList(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        List<CommunityMedicationRemind> communityMedicationRemindList = communityMedicationRemindService.queryList(communityMedicationRemind);
        return ResultGenerator.genSuccessResult(communityMedicationRemindList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param communityMedicationRemind 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CommunityMedicationRemind> queryOne(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        return ResultGenerator.genSuccessResult(communityMedicationRemindService.queryOne(communityMedicationRemind));
    }

    /**
    * 保存数据
    * @param communityMedicationRemind
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        //Date currentDt = new Date();
        if (communityMedicationRemind.getId() != null && communityMedicationRemind.getId().longValue() > 0) {
            //communityMedicationRemind.setUpdatedDt(currentDt);
            communityMedicationRemindService.update(communityMedicationRemind);
        } else {
            //communityMedicationRemind.setCreatedDt(currentDt);
            //communityMedicationRemind.setUpdatedDt(currentDt);
            communityMedicationRemindService.insert(communityMedicationRemind);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CommunityMedicationRemind> add(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        //Date currentDt = new Date();
        //communityMedicationRemind.setCreatedDt(currentDt);
        //communityMedicationRemind.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(communityMedicationRemindService.insert(communityMedicationRemind));
    }

    /**
    * 更新数据
    *
    * @param communityMedicationRemind 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CommunityMedicationRemind> update(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        return ResultGenerator.genSuccessResult(communityMedicationRemindService.update(communityMedicationRemind));
    }

    /**
    * 通过主键删除数据
    *
    * @param communityMedicationRemind 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CommunityMedicationRemind communityMedicationRemind) {
        return ResultGenerator.genSuccessResult(communityMedicationRemindService.deleteById(communityMedicationRemind.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CommunityMedicationRemind> insertList) {
        return ResultGenerator.genSuccessResult(communityMedicationRemindService.saveCommunityMedicationRemindBatch(insertList));
    }

}


