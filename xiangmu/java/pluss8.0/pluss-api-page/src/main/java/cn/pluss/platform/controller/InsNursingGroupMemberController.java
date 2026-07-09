package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingGroupMember;
import cn.pluss.platform.service.insNursingGroupMember.InsNursingGroupMemberService;
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
@RequestMapping("/insNursingGroupMember")
@Api(value = "InsNursingGroupMember控制类",tags={"InsNursingGroupMember接口"})
public class InsNursingGroupMemberController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingGroupMemberService insNursingGroupMemberService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingGroupMember>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingGroupMember> insNursingGroupMemberList = insNursingGroupMemberService.queryPage(map);
        Integer count= insNursingGroupMemberService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingGroupMember>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingGroupMemberList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingGroupMember
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingGroupMember>> queryList(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        List<InsNursingGroupMember> insNursingGroupMemberList = insNursingGroupMemberService.queryList(insNursingGroupMember);
        return ResultGenerator.genSuccessResult(insNursingGroupMemberList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingGroupMember 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingGroupMember> queryOne(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        return ResultGenerator.genSuccessResult(insNursingGroupMemberService.queryOne(insNursingGroupMember));
    }

    /**
    * 保存数据
    * @param insNursingGroupMember
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        //Date currentDt = new Date();
        if (insNursingGroupMember.getId() != null && insNursingGroupMember.getId().longValue() > 0) {
            //insNursingGroupMember.setUpdatedDt(currentDt);
            insNursingGroupMemberService.update(insNursingGroupMember);
        } else {
            //insNursingGroupMember.setCreatedDt(currentDt);
            //insNursingGroupMember.setUpdatedDt(currentDt);
            insNursingGroupMemberService.insert(insNursingGroupMember);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingGroupMember> add(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        //Date currentDt = new Date();
        //insNursingGroupMember.setCreatedDt(currentDt);
        //insNursingGroupMember.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingGroupMemberService.insert(insNursingGroupMember));
    }

    /**
    * 更新数据
    *
    * @param insNursingGroupMember 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingGroupMember> update(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        return ResultGenerator.genSuccessResult(insNursingGroupMemberService.update(insNursingGroupMember));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingGroupMember 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingGroupMember insNursingGroupMember) {
        return ResultGenerator.genSuccessResult(insNursingGroupMemberService.deleteById(insNursingGroupMember.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingGroupMember> insertList) {
        return ResultGenerator.genSuccessResult(insNursingGroupMemberService.saveInsNursingGroupMemberBatch(insertList));
    }

}


