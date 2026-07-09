package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.GspInstitutionDeviceTransfer;
import cn.pluss.platform.service.gspInstitutionDeviceTransfer.GspInstitutionDeviceTransferService;
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
@RequestMapping("/gspInstitutionDeviceTransfer")
@Api(value = "GspInstitutionDeviceTransfer控制类",tags={"GspInstitutionDeviceTransfer接口"})
public class GspInstitutionDeviceTransferController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private GspInstitutionDeviceTransferService gspInstitutionDeviceTransferService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<GspInstitutionDeviceTransfer>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<GspInstitutionDeviceTransfer> gspInstitutionDeviceTransferList = gspInstitutionDeviceTransferService.queryPage(map);
        Integer count= gspInstitutionDeviceTransferService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<GspInstitutionDeviceTransfer>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), gspInstitutionDeviceTransferList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param gspInstitutionDeviceTransfer
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<GspInstitutionDeviceTransfer>> queryList(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        List<GspInstitutionDeviceTransfer> gspInstitutionDeviceTransferList = gspInstitutionDeviceTransferService.queryList(gspInstitutionDeviceTransfer);
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param gspInstitutionDeviceTransfer 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<GspInstitutionDeviceTransfer> queryOne(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferService.queryOne(gspInstitutionDeviceTransfer));
    }

    /**
    * 保存数据
    * @param gspInstitutionDeviceTransfer
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        //Date currentDt = new Date();
        if (gspInstitutionDeviceTransfer.getId() != null && gspInstitutionDeviceTransfer.getId().longValue() > 0) {
            //gspInstitutionDeviceTransfer.setUpdatedDt(currentDt);
            gspInstitutionDeviceTransferService.update(gspInstitutionDeviceTransfer);
        } else {
            //gspInstitutionDeviceTransfer.setCreatedDt(currentDt);
            //gspInstitutionDeviceTransfer.setUpdatedDt(currentDt);
            gspInstitutionDeviceTransferService.insert(gspInstitutionDeviceTransfer);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param gspInstitutionDeviceTransfer 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<GspInstitutionDeviceTransfer> add(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        //Date currentDt = new Date();
        //gspInstitutionDeviceTransfer.setCreatedDt(currentDt);
        //gspInstitutionDeviceTransfer.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferService.insert(gspInstitutionDeviceTransfer));
    }

    /**
    * 更新数据
    *
    * @param gspInstitutionDeviceTransfer 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<GspInstitutionDeviceTransfer> update(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferService.update(gspInstitutionDeviceTransfer));
    }

    /**
    * 通过主键删除数据
    *
    * @param gspInstitutionDeviceTransfer 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody GspInstitutionDeviceTransfer gspInstitutionDeviceTransfer) {
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferService.deleteById(gspInstitutionDeviceTransfer.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<GspInstitutionDeviceTransfer> insertList) {
        return ResultGenerator.genSuccessResult(gspInstitutionDeviceTransferService.saveGspInstitutionDeviceTransferBatch(insertList));
    }

}


