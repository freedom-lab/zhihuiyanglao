package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.GspInstitutionBuildingTransfer;
import cn.pluss.platform.service.gspInstitutionBuildingTransfer.GspInstitutionBuildingTransferService;
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
@RequestMapping("/gspInstitutionBuildingTransfer")
@Api(value = "GspInstitutionBuildingTransfer控制类",tags={"GspInstitutionBuildingTransfer接口"})
public class GspInstitutionBuildingTransferController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private GspInstitutionBuildingTransferService gspInstitutionBuildingTransferService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<GspInstitutionBuildingTransfer>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<GspInstitutionBuildingTransfer> gspInstitutionBuildingTransferList = gspInstitutionBuildingTransferService.queryPage(map);
        Integer count= gspInstitutionBuildingTransferService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<GspInstitutionBuildingTransfer>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), gspInstitutionBuildingTransferList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param gspInstitutionBuildingTransfer
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<GspInstitutionBuildingTransfer>> queryList(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        List<GspInstitutionBuildingTransfer> gspInstitutionBuildingTransferList = gspInstitutionBuildingTransferService.queryList(gspInstitutionBuildingTransfer);
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param gspInstitutionBuildingTransfer 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<GspInstitutionBuildingTransfer> queryOne(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferService.queryOne(gspInstitutionBuildingTransfer));
    }

    /**
    * 保存数据
    * @param gspInstitutionBuildingTransfer
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        //Date currentDt = new Date();
        if (gspInstitutionBuildingTransfer.getId() != null && gspInstitutionBuildingTransfer.getId().longValue() > 0) {
            //gspInstitutionBuildingTransfer.setUpdatedDt(currentDt);
            gspInstitutionBuildingTransferService.update(gspInstitutionBuildingTransfer);
        } else {
            //gspInstitutionBuildingTransfer.setCreatedDt(currentDt);
            //gspInstitutionBuildingTransfer.setUpdatedDt(currentDt);
            gspInstitutionBuildingTransferService.insert(gspInstitutionBuildingTransfer);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param gspInstitutionBuildingTransfer 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<GspInstitutionBuildingTransfer> add(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        //Date currentDt = new Date();
        //gspInstitutionBuildingTransfer.setCreatedDt(currentDt);
        //gspInstitutionBuildingTransfer.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferService.insert(gspInstitutionBuildingTransfer));
    }

    /**
    * 更新数据
    *
    * @param gspInstitutionBuildingTransfer 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<GspInstitutionBuildingTransfer> update(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferService.update(gspInstitutionBuildingTransfer));
    }

    /**
    * 通过主键删除数据
    *
    * @param gspInstitutionBuildingTransfer 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody GspInstitutionBuildingTransfer gspInstitutionBuildingTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferService.deleteById(gspInstitutionBuildingTransfer.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<GspInstitutionBuildingTransfer> insertList) {
        return ResultGenerator.genSuccessResult(gspInstitutionBuildingTransferService.saveGspInstitutionBuildingTransferBatch(insertList));
    }

}


