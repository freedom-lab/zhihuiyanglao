package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsCanteenWeekMenuDetail;
import cn.pluss.platform.service.insCanteenWeekMenuDetail.InsCanteenWeekMenuDetailService;
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
@RequestMapping("/insCanteenWeekMenuDetail")
@Api(value = "InsCanteenWeekMenuDetail控制类",tags={"InsCanteenWeekMenuDetail接口"})
public class InsCanteenWeekMenuDetailController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsCanteenWeekMenuDetailService insCanteenWeekMenuDetailService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsCanteenWeekMenuDetail>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsCanteenWeekMenuDetail> insCanteenWeekMenuDetailList = insCanteenWeekMenuDetailService.queryPage(map);
        Integer count= insCanteenWeekMenuDetailService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsCanteenWeekMenuDetail>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insCanteenWeekMenuDetailList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insCanteenWeekMenuDetail
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsCanteenWeekMenuDetail>> queryList(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        List<InsCanteenWeekMenuDetail> insCanteenWeekMenuDetailList = insCanteenWeekMenuDetailService.queryList(insCanteenWeekMenuDetail);
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insCanteenWeekMenuDetail 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsCanteenWeekMenuDetail> queryOne(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.queryOne(insCanteenWeekMenuDetail));
    }

    /**
    * 保存数据
    * @param insCanteenWeekMenuDetail
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        //Date currentDt = new Date();
        if (insCanteenWeekMenuDetail.getId() != null && insCanteenWeekMenuDetail.getId().longValue() > 0) {
            //insCanteenWeekMenuDetail.setUpdatedDt(currentDt);
            insCanteenWeekMenuDetailService.update(insCanteenWeekMenuDetail);
        } else {
            //insCanteenWeekMenuDetail.setCreatedDt(currentDt);
            //insCanteenWeekMenuDetail.setUpdatedDt(currentDt);
            insCanteenWeekMenuDetailService.insert(insCanteenWeekMenuDetail);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsCanteenWeekMenuDetail> add(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        //Date currentDt = new Date();
        //insCanteenWeekMenuDetail.setCreatedDt(currentDt);
        //insCanteenWeekMenuDetail.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.insert(insCanteenWeekMenuDetail));
    }

    /**
    * 更新数据
    *
    * @param insCanteenWeekMenuDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsCanteenWeekMenuDetail> update(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.update(insCanteenWeekMenuDetail));
    }

    /**
    * 通过主键删除数据
    *
    * @param insCanteenWeekMenuDetail 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsCanteenWeekMenuDetail insCanteenWeekMenuDetail) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.deleteById(insCanteenWeekMenuDetail.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsCanteenWeekMenuDetail> insertList) {
        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.saveInsCanteenWeekMenuDetailBatch(insertList));
    }

    /**
     * 保存周菜单配置
     *
     * @param insertList 主键
     * @return 是否成功
     */
    @PostMapping("/saveWeekFoodInfoBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveWeekFoodInfoBatch(@RequestBody List<InsCanteenWeekMenuDetail> insertList) {


        return ResultGenerator.genSuccessResult(insCanteenWeekMenuDetailService.saveOrUpdateBatch(insertList));
    }

}


