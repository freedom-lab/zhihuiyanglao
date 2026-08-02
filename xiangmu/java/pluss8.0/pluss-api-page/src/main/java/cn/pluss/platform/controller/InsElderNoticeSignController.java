package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsElderNoticeSign;
import cn.pluss.platform.service.insElderNoticeSign.InsElderNoticeSignService;
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
@RequestMapping("/insElderNoticeSign")
@Api(value = "InsElderNoticeSign控制类",tags={"InsElderNoticeSign接口"})
public class InsElderNoticeSignController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsElderNoticeSignService insElderNoticeSignService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsElderNoticeSign>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsElderNoticeSign> insElderNoticeSignList = insElderNoticeSignService.queryPage(map);
        Integer count= insElderNoticeSignService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsElderNoticeSign>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insElderNoticeSignList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insElderNoticeSign
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsElderNoticeSign>> queryList(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        List<InsElderNoticeSign> insElderNoticeSignList = insElderNoticeSignService.queryList(insElderNoticeSign);
        return ResultGenerator.genSuccessResult(insElderNoticeSignList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insElderNoticeSign 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsElderNoticeSign> queryOne(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        return ResultGenerator.genSuccessResult(insElderNoticeSignService.queryOne(insElderNoticeSign));
    }

    /**
    * 保存数据
    * @param insElderNoticeSign
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        //Date currentDt = new Date();
        if (insElderNoticeSign.getId() != null && insElderNoticeSign.getId().longValue() > 0) {
            //insElderNoticeSign.setUpdatedDt(currentDt);
            insElderNoticeSignService.update(insElderNoticeSign);
        } else {
            //insElderNoticeSign.setCreatedDt(currentDt);
            //insElderNoticeSign.setUpdatedDt(currentDt);
            insElderNoticeSignService.insert(insElderNoticeSign);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsElderNoticeSign> add(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        //Date currentDt = new Date();
        //insElderNoticeSign.setCreatedDt(currentDt);
        //insElderNoticeSign.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insElderNoticeSignService.insert(insElderNoticeSign));
    }

    /**
    * 更新数据
    *
    * @param insElderNoticeSign 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsElderNoticeSign> update(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        return ResultGenerator.genSuccessResult(insElderNoticeSignService.update(insElderNoticeSign));
    }

    /**
    * 通过主键删除数据
    *
    * @param insElderNoticeSign 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsElderNoticeSign insElderNoticeSign) {
        return ResultGenerator.genSuccessResult(insElderNoticeSignService.deleteById(insElderNoticeSign.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsElderNoticeSign> insertList) {
        return ResultGenerator.genSuccessResult(insElderNoticeSignService.saveInsElderNoticeSignBatch(insertList));
    }

}


