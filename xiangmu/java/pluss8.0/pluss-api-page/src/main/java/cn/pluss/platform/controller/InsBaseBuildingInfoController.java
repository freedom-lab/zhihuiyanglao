package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.InsBaseBedInfo;
import cn.pluss.platform.model.entity.InsBaseBuildingInfo;
import cn.pluss.platform.model.entity.InsBaseFloorInfo;
import cn.pluss.platform.model.entity.InsBaseRoomInfo;
import cn.pluss.platform.service.insBaseBedInfo.InsBaseBedInfoService;
import cn.pluss.platform.service.insBaseBuildingInfo.InsBaseBuildingInfoService;
import cn.pluss.platform.service.insBaseFloorInfo.InsBaseFloorInfoService;
import cn.pluss.platform.service.insBaseRoomInfo.InsBaseRoomInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/insBaseBuildingInfo")
@Api(value = "InsBaseBuildingInfo控制类",tags={"InsBaseBuildingInfo接口"})
public class InsBaseBuildingInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private InsBaseBuildingInfoService insBaseBuildingInfoService;
    @Resource
    private InsBaseFloorInfoService insBaseFloorInfoService;
    @Resource
    private InsBaseRoomInfoService insBaseRoomInfoService;
    @Resource
    private InsBaseBedInfoService insBaseBedInfoService;
    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<InsBaseBuildingInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<InsBaseBuildingInfo> insBaseBuildingInfoList = insBaseBuildingInfoService.queryPage(map);
        Integer count= insBaseBuildingInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<InsBaseBuildingInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), insBaseBuildingInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param insBaseBuildingInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<InsBaseBuildingInfo>> queryList(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        List<InsBaseBuildingInfo> insBaseBuildingInfoList = insBaseBuildingInfoService.queryList(insBaseBuildingInfo);
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param insBaseBuildingInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<InsBaseBuildingInfo> queryOne(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoService.queryOne(insBaseBuildingInfo));
    }

    /**
    * 保存数据
    * @param insBaseBuildingInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        //Date currentDt = new Date();
        if (insBaseBuildingInfo.getId() != null && insBaseBuildingInfo.getId().longValue() > 0) {
            //insBaseBuildingInfo.setUpdatedDt(currentDt);
            insBaseBuildingInfoService.update(insBaseBuildingInfo);
        } else {
            //insBaseBuildingInfo.setCreatedDt(currentDt);
            //insBaseBuildingInfo.setUpdatedDt(currentDt);
            insBaseBuildingInfoService.insert(insBaseBuildingInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param insBaseBuildingInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<InsBaseBuildingInfo> add(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        //Date currentDt = new Date();
        //insBaseBuildingInfo.setCreatedDt(currentDt);
        //insBaseBuildingInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoService.insert(insBaseBuildingInfo));
    }

    /**
    * 更新数据
    *
    * @param insBaseBuildingInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<InsBaseBuildingInfo> update(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoService.update(insBaseBuildingInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param insBaseBuildingInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoService.deleteById(insBaseBuildingInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<InsBaseBuildingInfo> insertList) {
        return ResultGenerator.genSuccessResult(insBaseBuildingInfoService.saveInsBaseBuildingInfoBatch(insertList));
    }

    /**
     * 查询楼栋信息,
     * @param insBaseBuildingInfo
     * @return
     */
    @PostMapping("/queryBuildingDetails")
    @ApiOperation(value = "查询楼栋信息,返回楼层和房间信息,isShowFree传1只显示空闲床位", notes = "查询楼栋信息,返回楼层和房间信息,isShowFree传1只显示空闲床位", httpMethod = "POST")
    public Result<InsBaseBuildingInfo> queryBuildingDetails(@RequestBody InsBaseBuildingInfo insBaseBuildingInfo) {
        if(insBaseBuildingInfo.getId()==null){

            return ResultGenerator.genFailResult("ID 不能为空");
        }
        InsBaseBuildingInfo insBaseBuildingInfoDb = insBaseBuildingInfoService.queryOne(insBaseBuildingInfo);
        if(insBaseBuildingInfoDb==null){
            return ResultGenerator.genFailResult("未找到"+insBaseBuildingInfo.getId()+" 的楼栋");
        }

        //楼层信息
        InsBaseFloorInfo insBaseFloorInfoQuery =new InsBaseFloorInfo();
        insBaseFloorInfoQuery.setBuildingId(insBaseBuildingInfoDb.getId());
        List<InsBaseFloorInfo>  insBaseFloorInfoList= insBaseFloorInfoService.queryList(insBaseFloorInfoQuery);
        insBaseBuildingInfoDb.setFloorInfoList(insBaseFloorInfoList);

        //房间信息
        InsBaseRoomInfo insBaseRoomInfoQuery =new InsBaseRoomInfo();
        insBaseRoomInfoQuery.setBuildingId(insBaseBuildingInfo.getId());
        List<InsBaseRoomInfo> insBaseRoomInfoList= insBaseRoomInfoService.queryList(insBaseRoomInfoQuery);

        //床位信息
        InsBaseBedInfo insBaseBedInfoQuery =new InsBaseBedInfo();
        insBaseBedInfoQuery.setBuildingId(insBaseBuildingInfo.getId());
        if(insBaseBuildingInfo.getIsShowFree()!=null&& insBaseBuildingInfo.getIsShowFree() ==1){
            //查找空闲
            insBaseBedInfoQuery.setBedState(1);
        }
        List<InsBaseBedInfo> insBaseBedInfoList= insBaseBedInfoService.queryList(insBaseBedInfoQuery);

        //封装统计到楼栋
        //床位总数
        Integer totalBedCount=0;
        Integer freeBedCount=0;
        Integer checkInBedCount=0;
        Integer testBedCount=0;
        Integer reserveBedCount=0;
        Integer changeBedCount=0;
        for (InsBaseBedInfo insBaseBedInfo :insBaseBedInfoList){
            if(insBaseBuildingInfoDb.getId().equals(insBaseBedInfo.getBuildingId())){
                totalBedCount++;
                //床位状态(1空闲 2预订 3入住 4试住 5变更占用)
                if(insBaseBedInfo.getBedState()==1){
                    //空闲
                    freeBedCount++;
                }else if(insBaseBedInfo.getBedState()==3){
                    //入住
                    checkInBedCount++;
                }else if(insBaseBedInfo.getBedState()==4){
                    //试住
                    testBedCount++;
                }else if(insBaseBedInfo.getBedState()==2){
                    //预定
                    reserveBedCount++;
                }else if(insBaseBedInfo.getBedState()==5){
                    //变更占用
                    changeBedCount++;
                }
            }
        }
        insBaseBuildingInfoDb.setTotalBedCount(totalBedCount);
        insBaseBuildingInfoDb.setFreeBedCount(freeBedCount);
        insBaseBuildingInfoDb.setCheckInBedCount(checkInBedCount);
        insBaseBuildingInfoDb.setTestBedCount(testBedCount);
        insBaseBuildingInfoDb.setReserveBedCount(reserveBedCount);
        insBaseBuildingInfoDb.setChangeBedCount(changeBedCount);
        //入住率
        if(insBaseBuildingInfoDb.getTotalBedCount()==0){
            insBaseBuildingInfoDb.setOccupancyRate(BigDecimal.ZERO);
        }else {
            BigDecimal rate=new BigDecimal(insBaseBuildingInfoDb.getTotalBedCount()-insBaseBuildingInfoDb.getFreeBedCount()-insBaseBuildingInfoDb.getChangeBedCount()/insBaseBuildingInfoDb.getTotalBedCount());
            insBaseBuildingInfoDb.setOccupancyRate(rate);
        }



        //封装到楼层对象
        for(InsBaseFloorInfo insBaseFloorInfo:insBaseFloorInfoList){
            List<InsBaseRoomInfo> roomInfoList=new ArrayList<>();
            insBaseFloorInfo.setRoomInfoList(roomInfoList);
            //找到对应的楼层
            for (InsBaseRoomInfo insBaseRoomInfo :insBaseRoomInfoList){
                if(insBaseFloorInfo.getId().equals(insBaseRoomInfo.getFloorId())){
                    roomInfoList.add(insBaseRoomInfo);
                }
            }
            //房间数
            insBaseFloorInfo.setTotalRoomCount(insBaseFloorInfo.getTotalRoomCount());
            //床位总数
            Integer totalFloorBedCount=0;
            Integer freeFloorBedCount=0;
            Integer checkInFloorBedCount=0;
            Integer testFloorBedCount=0;
            Integer reserveFloorBedCount=0;
            Integer changeFloorBedCount=0;
            for (InsBaseBedInfo insBaseBedInfo :insBaseBedInfoList){
                if(insBaseFloorInfo.getId().equals(insBaseBedInfo.getFloorId())){
                    totalBedCount++;
                    //床位状态(1空闲 2预订 3入住 4试住 5变更占用)
                    if(insBaseBedInfo.getBedState()==1){
                        //空闲
                        freeFloorBedCount++;
                    }else if(insBaseBedInfo.getBedState()==3){
                        //入住
                        checkInFloorBedCount++;
                    }else if(insBaseBedInfo.getBedState()==4){
                        //试住
                        testFloorBedCount++;
                    }else if(insBaseBedInfo.getBedState()==2){
                        //预定
                        reserveFloorBedCount++;
                    }else if(insBaseBedInfo.getBedState()==5){
                        //变更占用
                        changeFloorBedCount++;
                    }
                }
            }
            insBaseFloorInfo.setTotalBedCount(totalFloorBedCount);
            insBaseFloorInfo.setFreeBedCount(freeFloorBedCount);
            insBaseFloorInfo.setCheckInBedCount(checkInFloorBedCount);
            insBaseFloorInfo.setTestBedCount(testFloorBedCount);
            insBaseFloorInfo.setReserveBedCount(reserveFloorBedCount);
            insBaseFloorInfo.setChangeBedCount(changeFloorBedCount);

            //入住率
            //入住率
            if(insBaseFloorInfo.getTotalBedCount()==0){
                insBaseFloorInfo.setOccupancyRate(BigDecimal.ZERO);
            }else {
                BigDecimal floorrate = new BigDecimal(insBaseFloorInfo.getTotalBedCount() - insBaseFloorInfo.getFreeBedCount() - insBaseFloorInfo.getChangeBedCount() / insBaseFloorInfo.getTotalBedCount());
                insBaseFloorInfo.setOccupancyRate(floorrate);
            }
        }

        //封装床位到房间对象
        for (InsBaseRoomInfo insBaseRoomInfo :insBaseRoomInfoList){
            List<InsBaseBedInfo> bedInfoList=new ArrayList<>();
            insBaseRoomInfo.setInsBaseBedInfo(bedInfoList);
            //找到对应的楼层
            for (InsBaseBedInfo insBaseBedInfo :insBaseBedInfoList){
                if(insBaseRoomInfo.getId().equals(insBaseBedInfo.getRoomId())){
                    bedInfoList.add(insBaseBedInfo);
                }
            }
        }

        return ResultGenerator.genSuccessResult(insBaseBuildingInfoDb);
    }

    /**
     * 查询楼栋/楼层信息,
     * @param
     * @return
     */
    @PostMapping("/queryBuildingFloor")
    @ApiOperation(value = "查询楼栋/楼层号", notes = "查询楼栋/楼层号", httpMethod = "POST")
    public Result queryBuildingFloor() {
        List<InsBaseBuildingInfo> buildingInfos = insBaseBuildingInfoService.list(new LambdaQueryWrapper<InsBaseBuildingInfo>()
                .eq(InsBaseBuildingInfo::getIsDeleted,0)
                .eq(InsBaseBuildingInfo::getStatus,1));

        List<InsBaseFloorInfo> floorInfos = insBaseFloorInfoService.list(new LambdaQueryWrapper<InsBaseFloorInfo>()
                .eq(InsBaseFloorInfo::getIsDeleted, 0)
                .eq(InsBaseFloorInfo::getStatus, 1));

        if (!CollectionUtils.isEmpty(buildingInfos)) {
            Map<Long, List<InsBaseFloorInfo>> floorMap = floorInfos.stream()
                    .collect(Collectors.groupingBy(InsBaseFloorInfo::getBuildingId));

            for (InsBaseBuildingInfo buildingInfo : buildingInfos) {
                buildingInfo.setFloorInfoList(floorMap.getOrDefault(buildingInfo.getId(), Collections.emptyList()));
            }
        }

        return ResultGenerator.genSuccessResult(buildingInfos);

    }

    /**
     * 查询房间/床位号
     * @param insBaseRoomInfo
     * @return
     */
    @PostMapping("/queryRoomBed")
    @ApiOperation(value = "查询房间/床位号", notes = "查询房间/床位号", httpMethod = "POST")
    public Result queryRoomBed(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        List<InsBaseRoomInfo> roomInfos = insBaseRoomInfoService.list(new LambdaQueryWrapper<InsBaseRoomInfo>()
                .eq(InsBaseRoomInfo::getIsDeleted, 0)
                .eq(InsBaseRoomInfo::getStatus, 1)
                .eq(InsBaseRoomInfo::getBuildingId, insBaseRoomInfo.getBuildingId())
                .eq(InsBaseRoomInfo::getFloorId, insBaseRoomInfo.getFloorId()));

        if (!CollectionUtils.isEmpty(roomInfos)) {
            List<Long> roomIds = roomInfos.stream().map(InsBaseRoomInfo::getId).collect(Collectors.toList());
            List<InsBaseBedInfo> allBeds = insBaseBedInfoService.list(new LambdaQueryWrapper<InsBaseBedInfo>()
                    .eq(InsBaseBedInfo::getIsDeleted, 0)
                    .eq(InsBaseBedInfo::getStatus, 1)
                    .in(InsBaseBedInfo::getRoomId, roomIds));

            Map<Long, List<InsBaseBedInfo>> bedMap = allBeds.stream()
                    .collect(Collectors.groupingBy(InsBaseBedInfo::getRoomId));

            for (InsBaseRoomInfo roomInfo : roomInfos) {
                roomInfo.setInsBaseBedInfo(bedMap.getOrDefault(roomInfo.getId(), Collections.emptyList()));
            }
        }

        return ResultGenerator.genSuccessResult(roomInfos);
    }

    /**
     * 查询房间/床位号
     * @param insBaseRoomInfo
     * @return
     */
    @PostMapping("/queryRoom")
    @ApiOperation(value = "查询房间", notes = "查询房间", httpMethod = "POST")
    public Result queryRoom(@RequestBody InsBaseRoomInfo insBaseRoomInfo) {
        List<InsBaseRoomInfo> roomInfos = insBaseRoomInfoService.list(new LambdaQueryWrapper<InsBaseRoomInfo>()
                .eq(InsBaseRoomInfo::getIsDeleted, 0)
                .eq(InsBaseRoomInfo::getStatus, 1)
                .eq(InsBaseRoomInfo::getBuildingId, insBaseRoomInfo.getBuildingId())
                .eq(InsBaseRoomInfo::getFloorId, insBaseRoomInfo.getFloorId()));

        return ResultGenerator.genSuccessResult(roomInfos);
    }

    @PostMapping("/queryBed")
    @ApiOperation(value = "查询床位号", notes = "查询床位号", httpMethod = "POST")
    public Result queryBed(@RequestBody InsBaseBedInfo insBaseBedInfo) {

        List<InsBaseBedInfo> allBeds = insBaseBedInfoService.list(new LambdaQueryWrapper<InsBaseBedInfo>()
                .eq(InsBaseBedInfo::getIsDeleted, 0)
                .eq(InsBaseBedInfo::getStatus, 1)
                .in(InsBaseBedInfo::getRoomId, insBaseBedInfo.getRoomId()));


        return ResultGenerator.genSuccessResult(allBeds);
    }


}


