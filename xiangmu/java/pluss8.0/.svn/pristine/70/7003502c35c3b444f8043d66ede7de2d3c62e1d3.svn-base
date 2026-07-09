package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.BladeNotice;
import cn.pluss.platform.service.bladeNotice.BladeNoticeService;
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
@RequestMapping("/bladeNotice")
@Api(value = "BladeNotice控制类",tags={"BladeNotice接口"})
public class BladeNoticeController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private BladeNoticeService bladeNoticeService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<BladeNotice>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<BladeNotice> bladeNoticeList = bladeNoticeService.queryPage(map);
        Integer count= bladeNoticeService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<BladeNotice>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), bladeNoticeList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param bladeNotice
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<BladeNotice>> queryList(@RequestBody BladeNotice bladeNotice) {
        List<BladeNotice> bladeNoticeList = bladeNoticeService.queryList(bladeNotice);
        return ResultGenerator.genSuccessResult(bladeNoticeList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param bladeNotice 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<BladeNotice> queryOne(@RequestBody BladeNotice bladeNotice) {
        return ResultGenerator.genSuccessResult(bladeNoticeService.queryOne(bladeNotice));
    }

    /**
    * 保存数据
    * @param bladeNotice
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody BladeNotice bladeNotice) {
        //Date currentDt = new Date();
        if (bladeNotice.getId() != null && bladeNotice.getId().longValue() > 0) {
            //bladeNotice.setUpdatedDt(currentDt);
            bladeNoticeService.update(bladeNotice);
        } else {
            //bladeNotice.setCreatedDt(currentDt);
            //bladeNotice.setUpdatedDt(currentDt);
            bladeNoticeService.insert(bladeNotice);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param bladeNotice 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<BladeNotice> add(@RequestBody BladeNotice bladeNotice) {
        //Date currentDt = new Date();
        //bladeNotice.setCreatedDt(currentDt);
        //bladeNotice.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(bladeNoticeService.insert(bladeNotice));
    }

    /**
    * 更新数据
    *
    * @param bladeNotice 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<BladeNotice> update(@RequestBody BladeNotice bladeNotice) {
        return ResultGenerator.genSuccessResult(bladeNoticeService.update(bladeNotice));
    }

    /**
    * 通过主键删除数据
    *
    * @param bladeNotice 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody BladeNotice bladeNotice) {
        return ResultGenerator.genSuccessResult(bladeNoticeService.deleteById(bladeNotice.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<BladeNotice> insertList) {
        return ResultGenerator.genSuccessResult(bladeNoticeService.saveBladeNoticeBatch(insertList));
    }

}


