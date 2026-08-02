package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsNursingPlanRoom;
import cn.pluss.platform.service.insNursingPlanRoom.InsNursingPlanRoomService;
import cn.pluss.platform.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/insNursingPlanRoom")
@Api(value = "InsNursingPlanRoom控制类",tags={"InsNursingPlanRoom接口"})
public class InsNursingPlanRoomController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsNursingPlanRoomService insNursingPlanRoomService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsNursingPlanRoom>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsNursingPlanRoom> insNursingPlanRoomList = insNursingPlanRoomService.queryPage(map);
        Integer count= insNursingPlanRoomService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsNursingPlanRoom>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insNursingPlanRoomList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insNursingPlanRoom
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsNursingPlanRoom>> queryList(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        List<InsNursingPlanRoom> insNursingPlanRoomList = insNursingPlanRoomService.queryList(insNursingPlanRoom);
        return ResultGenerator.genSuccessResult(insNursingPlanRoomList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insNursingPlanRoom 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsNursingPlanRoom> queryOne(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        return ResultGenerator.genSuccessResult(insNursingPlanRoomService.queryOne(insNursingPlanRoom));
    }

    /**
    * 保存数据
    * @param insNursingPlanRoom
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        //Date currentDt = new Date();
        if (insNursingPlanRoom.getId() != null && insNursingPlanRoom.getId().longValue() > 0) {
            //insNursingPlanRoom.setUpdatedDt(currentDt);
            insNursingPlanRoomService.update(insNursingPlanRoom);
        } else {
            //insNursingPlanRoom.setCreatedDt(currentDt);
            //insNursingPlanRoom.setUpdatedDt(currentDt);
            insNursingPlanRoomService.insert(insNursingPlanRoom);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsNursingPlanRoom> add(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        //Date currentDt = new Date();
        //insNursingPlanRoom.setCreatedDt(currentDt);
        //insNursingPlanRoom.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insNursingPlanRoomService.insert(insNursingPlanRoom));
    }

    /**
    * 更新数据
    *
    * @param insNursingPlanRoom 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsNursingPlanRoom> update(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        return ResultGenerator.genSuccessResult(insNursingPlanRoomService.update(insNursingPlanRoom));
    }

    /**
    * 通过主键删除数据
    *
    * @param insNursingPlanRoom 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsNursingPlanRoom insNursingPlanRoom) {
        return ResultGenerator.genSuccessResult(insNursingPlanRoomService.deleteById(insNursingPlanRoom.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsNursingPlanRoom> insertList) {
        return ResultGenerator.genSuccessResult(insNursingPlanRoomService.saveInsNursingPlanRoomBatch(insertList));
    }

}


