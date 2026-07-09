package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsDonateRecordDetail;
import cn.pluss.platform.service.insDonateRecordDetail.InsDonateRecordDetailService;
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
@RequestMapping("/insDonateRecordDetail")
@Api(value = "InsDonateRecordDetail控制类",tags={"InsDonateRecordDetail接口"})
public class InsDonateRecordDetailController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsDonateRecordDetailService insDonateRecordDetailService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsDonateRecordDetail>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsDonateRecordDetail> insDonateRecordDetailList = insDonateRecordDetailService.queryPage(map);
        Integer count= insDonateRecordDetailService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsDonateRecordDetail>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insDonateRecordDetailList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insDonateRecordDetail
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsDonateRecordDetail>> queryList(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        List<InsDonateRecordDetail> insDonateRecordDetailList = insDonateRecordDetailService.queryList(insDonateRecordDetail);
        return ResultGenerator.genSuccessResult(insDonateRecordDetailList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insDonateRecordDetail 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsDonateRecordDetail> queryOne(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        return ResultGenerator.genSuccessResult(insDonateRecordDetailService.queryOne(insDonateRecordDetail));
    }

    /**
    * 保存数据
    * @param insDonateRecordDetail
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        //Date currentDt = new Date();
        if (insDonateRecordDetail.getId() != null && insDonateRecordDetail.getId().longValue() > 0) {
            //insDonateRecordDetail.setUpdatedDt(currentDt);
            insDonateRecordDetailService.update(insDonateRecordDetail);
        } else {
            //insDonateRecordDetail.setCreatedDt(currentDt);
            //insDonateRecordDetail.setUpdatedDt(currentDt);
            insDonateRecordDetailService.insert(insDonateRecordDetail);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsDonateRecordDetail> add(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        //Date currentDt = new Date();
        //insDonateRecordDetail.setCreatedDt(currentDt);
        //insDonateRecordDetail.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insDonateRecordDetailService.insert(insDonateRecordDetail));
    }

    /**
    * 更新数据
    *
    * @param insDonateRecordDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsDonateRecordDetail> update(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        return ResultGenerator.genSuccessResult(insDonateRecordDetailService.update(insDonateRecordDetail));
    }

    /**
    * 通过主键删除数据
    *
    * @param insDonateRecordDetail 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsDonateRecordDetail insDonateRecordDetail) {
        return ResultGenerator.genSuccessResult(insDonateRecordDetailService.deleteById(insDonateRecordDetail.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsDonateRecordDetail> insertList) {
        return ResultGenerator.genSuccessResult(insDonateRecordDetailService.saveInsDonateRecordDetailBatch(insertList));
    }

}


