package ${packageName}.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import ${packageName}.model.entity.${beanName};
import ${packageName}.service.${beanNameSmall}.${beanName}Service;
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
@RequestMapping("/${beanNameSmall}")
@Api(value = "${beanName}控制类",tags={"${beanName}接口"})
public class ${beanName}Controller{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private ${beanName}Service ${beanNameSmall}Service;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<${beanName}>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<${beanName}> ${beanNameSmall}List = ${beanNameSmall}Service.queryPage(map);
        Integer count= ${beanNameSmall}Service.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<${beanName}>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), ${beanNameSmall}List);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param ${beanNameSmall}
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<${beanName}>> queryList(@RequestBody ${beanName} ${beanNameSmall}) {
        List<${beanName}> ${beanNameSmall}List = ${beanNameSmall}Service.queryList(${beanNameSmall});
        return ResultGenerator.genSuccessResult(${beanNameSmall}List);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param ${beanNameSmall} 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<${beanName}> queryOne(@RequestBody ${beanName} ${beanNameSmall}) {
        return ResultGenerator.genSuccessResult(${beanNameSmall}Service.queryById(${beanNameSmall}.getId()));
    }

    /**
    * 保存数据
    * @param ${beanNameSmall}
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody ${beanName} ${beanNameSmall}) {
        //Date currentDt = new Date();
        if (${beanNameSmall}.getId() != null && ${beanNameSmall}.getId().longValue() > 0) {
            //${beanNameSmall}.setUpdatedDt(currentDt);
            ${beanNameSmall}Service.update(${beanNameSmall});
        } else {
            //${beanNameSmall}.setCreatedDt(currentDt);
            //${beanNameSmall}.setUpdatedDt(currentDt);
            ${beanNameSmall}Service.insert(${beanNameSmall});
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<${beanName}> add(@RequestBody ${beanName} ${beanNameSmall}) {
        //Date currentDt = new Date();
        //${beanNameSmall}.setCreatedDt(currentDt);
        //${beanNameSmall}.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(${beanNameSmall}Service.insert(${beanNameSmall}));
    }

    /**
    * 更新数据
    *
    * @param ${beanNameSmall} 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<${beanName}> update(@RequestBody ${beanName} ${beanNameSmall}) {
        return ResultGenerator.genSuccessResult(${beanNameSmall}Service.update(${beanNameSmall}));
    }

    /**
    * 通过主键删除数据
    *
    * @param ${beanNameSmall} 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody ${beanName} ${beanNameSmall}) {
        return ResultGenerator.genSuccessResult(${beanNameSmall}Service.deleteById(${beanNameSmall}.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<${beanName}> insertList) {
        return ResultGenerator.genSuccessResult(${beanNameSmall}Service.save${beanName}Batch(insertList));
    }

}

