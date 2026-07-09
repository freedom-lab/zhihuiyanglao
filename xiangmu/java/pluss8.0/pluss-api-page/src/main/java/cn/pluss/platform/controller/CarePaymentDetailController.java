package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.CarePaymentDetail;
import cn.pluss.platform.service.carePaymentDetail.CarePaymentDetailService;
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
@RequestMapping("/carePaymentDetail")
@Api(value = "CarePaymentDetail控制类",tags={"CarePaymentDetail接口"})
public class CarePaymentDetailController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private CarePaymentDetailService carePaymentDetailService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<CarePaymentDetail>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<CarePaymentDetail> carePaymentDetailList = carePaymentDetailService.queryPage(map);
        Integer count= carePaymentDetailService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<CarePaymentDetail>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), carePaymentDetailList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param carePaymentDetail
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<CarePaymentDetail>> queryList(@RequestBody CarePaymentDetail carePaymentDetail) {
        List<CarePaymentDetail> carePaymentDetailList = carePaymentDetailService.queryList(carePaymentDetail);
        return ResultGenerator.genSuccessResult(carePaymentDetailList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param carePaymentDetail 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<CarePaymentDetail> queryOne(@RequestBody CarePaymentDetail carePaymentDetail) {
        return ResultGenerator.genSuccessResult(carePaymentDetailService.queryOne(carePaymentDetail));
    }

    /**
    * 保存数据
    * @param carePaymentDetail
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody CarePaymentDetail carePaymentDetail) {
        //Date currentDt = new Date();
        if (carePaymentDetail.getId() != null && carePaymentDetail.getId().longValue() > 0) {
            //carePaymentDetail.setUpdatedDt(currentDt);
            carePaymentDetailService.update(carePaymentDetail);
        } else {
            //carePaymentDetail.setCreatedDt(currentDt);
            //carePaymentDetail.setUpdatedDt(currentDt);
            carePaymentDetailService.insert(carePaymentDetail);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<CarePaymentDetail> add(@RequestBody CarePaymentDetail carePaymentDetail) {
        //Date currentDt = new Date();
        //carePaymentDetail.setCreatedDt(currentDt);
        //carePaymentDetail.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(carePaymentDetailService.insert(carePaymentDetail));
    }

    /**
    * 更新数据
    *
    * @param carePaymentDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<CarePaymentDetail> update(@RequestBody CarePaymentDetail carePaymentDetail) {
        return ResultGenerator.genSuccessResult(carePaymentDetailService.update(carePaymentDetail));
    }

    /**
    * 通过主键删除数据
    *
    * @param carePaymentDetail 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody CarePaymentDetail carePaymentDetail) {
        return ResultGenerator.genSuccessResult(carePaymentDetailService.deleteById(carePaymentDetail.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<CarePaymentDetail> insertList) {
        return ResultGenerator.genSuccessResult(carePaymentDetailService.saveCarePaymentDetailBatch(insertList));
    }

}


