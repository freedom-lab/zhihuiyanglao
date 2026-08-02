package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsDonateGrantDetail;
import cn.pluss.platform.service.insDonateGrantDetail.InsDonateGrantDetailService;
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
@RequestMapping("/insDonateGrantDetail")
@Api(value = "InsDonateGrantDetail控制类",tags={"InsDonateGrantDetail接口"})
public class InsDonateGrantDetailController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsDonateGrantDetailService insDonateGrantDetailService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsDonateGrantDetail>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsDonateGrantDetail> insDonateGrantDetailList = insDonateGrantDetailService.queryPage(map);
        Integer count= insDonateGrantDetailService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsDonateGrantDetail>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insDonateGrantDetailList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insDonateGrantDetail
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsDonateGrantDetail>> queryList(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        List<InsDonateGrantDetail> insDonateGrantDetailList = insDonateGrantDetailService.queryList(insDonateGrantDetail);
        return ResultGenerator.genSuccessResult(insDonateGrantDetailList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insDonateGrantDetail 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsDonateGrantDetail> queryOne(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        return ResultGenerator.genSuccessResult(insDonateGrantDetailService.queryOne(insDonateGrantDetail));
    }

    /**
    * 保存数据
    * @param insDonateGrantDetail
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        //Date currentDt = new Date();
        if (insDonateGrantDetail.getId() != null && insDonateGrantDetail.getId().longValue() > 0) {
            //insDonateGrantDetail.setUpdatedDt(currentDt);
            insDonateGrantDetailService.update(insDonateGrantDetail);
        } else {
            //insDonateGrantDetail.setCreatedDt(currentDt);
            //insDonateGrantDetail.setUpdatedDt(currentDt);
            insDonateGrantDetailService.insert(insDonateGrantDetail);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsDonateGrantDetail> add(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        //Date currentDt = new Date();
        //insDonateGrantDetail.setCreatedDt(currentDt);
        //insDonateGrantDetail.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insDonateGrantDetailService.insert(insDonateGrantDetail));
    }

    /**
    * 更新数据
    *
    * @param insDonateGrantDetail 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsDonateGrantDetail> update(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        return ResultGenerator.genSuccessResult(insDonateGrantDetailService.update(insDonateGrantDetail));
    }

    /**
    * 通过主键删除数据
    *
    * @param insDonateGrantDetail 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsDonateGrantDetail insDonateGrantDetail) {
        return ResultGenerator.genSuccessResult(insDonateGrantDetailService.deleteById(insDonateGrantDetail.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsDonateGrantDetail> insertList) {
        return ResultGenerator.genSuccessResult(insDonateGrantDetailService.saveInsDonateGrantDetailBatch(insertList));
    }

}


