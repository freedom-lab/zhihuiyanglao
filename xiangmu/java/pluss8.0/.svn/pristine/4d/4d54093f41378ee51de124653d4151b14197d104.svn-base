package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.JcProcessGuide;
import cn.pluss.platform.service.jcProcessGuide.JcProcessGuideService;
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
@RequestMapping("/jcProcessGuide")
@Api(value = "JcProcessGuide控制类",tags={"JcProcessGuide接口"})
public class JcProcessGuideController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private JcProcessGuideService jcProcessGuideService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<JcProcessGuide>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<JcProcessGuide> jcProcessGuideList = jcProcessGuideService.queryPage(map);
        Integer count= jcProcessGuideService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<JcProcessGuide>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), jcProcessGuideList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param jcProcessGuide
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<JcProcessGuide>> queryList(@RequestBody JcProcessGuide jcProcessGuide) {
        List<JcProcessGuide> jcProcessGuideList = jcProcessGuideService.queryList(jcProcessGuide);
        return ResultGenerator.genSuccessResult(jcProcessGuideList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param jcProcessGuide 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<JcProcessGuide> queryOne(@RequestBody JcProcessGuide jcProcessGuide) {
        return ResultGenerator.genSuccessResult(jcProcessGuideService.queryOne(jcProcessGuide));
    }

    /**
    * 保存数据
    * @param jcProcessGuide
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody JcProcessGuide jcProcessGuide) {
        //Date currentDt = new Date();
        if (jcProcessGuide.getId() != null && jcProcessGuide.getId().longValue() > 0) {
            //jcProcessGuide.setUpdatedDt(currentDt);
            jcProcessGuideService.update(jcProcessGuide);
        } else {
            //jcProcessGuide.setCreatedDt(currentDt);
            //jcProcessGuide.setUpdatedDt(currentDt);
            jcProcessGuideService.insert(jcProcessGuide);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param jcProcessGuide 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<JcProcessGuide> add(@RequestBody JcProcessGuide jcProcessGuide) {
        //Date currentDt = new Date();
        //jcProcessGuide.setCreatedDt(currentDt);
        //jcProcessGuide.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(jcProcessGuideService.insert(jcProcessGuide));
    }

    /**
    * 更新数据
    *
    * @param jcProcessGuide 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<JcProcessGuide> update(@RequestBody JcProcessGuide jcProcessGuide) {
        return ResultGenerator.genSuccessResult(jcProcessGuideService.update(jcProcessGuide));
    }

    /**
    * 通过主键删除数据
    *
    * @param jcProcessGuide 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody JcProcessGuide jcProcessGuide) {
        return ResultGenerator.genSuccessResult(jcProcessGuideService.deleteById(jcProcessGuide.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<JcProcessGuide> insertList) {
        return ResultGenerator.genSuccessResult(jcProcessGuideService.saveJcProcessGuideBatch(insertList));
    }

}


