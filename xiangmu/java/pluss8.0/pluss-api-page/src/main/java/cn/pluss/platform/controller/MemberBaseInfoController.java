package cn.pluss.platform.controller;

import cn.pluss.platform.api.PageInfo;
import cn.pluss.platform.api.PageQueryInfo;
import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.model.entity.AssessmentAppoint;
import cn.pluss.platform.model.entity.AssessmentResult;
import cn.pluss.platform.model.entity.InsElderContractInfo;
import cn.pluss.platform.model.entity.MemberBaseInfo;
import cn.pluss.platform.service.assessmentAppoint.AssessmentAppointService;
import cn.pluss.platform.service.assessmentResult.AssessmentResultService;
import cn.pluss.platform.service.insElderContractInfo.InsElderContractInfoService;
import cn.pluss.platform.service.memberBaseInfo.MemberBaseInfoService;
import cn.pluss.platform.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/memberBaseInfo")
@Api(value = "MemberBaseInfo控制类",tags={"MemberBaseInfo接口"})
public class MemberBaseInfoController{
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private MemberBaseInfoService memberBaseInfoService;

    @Resource
    private InsElderContractInfoService insElderContractInfoService;

    @Resource
    private AssessmentAppointService assessmentAppointService;

    @Resource
    private AssessmentResultService assessmentResultService;

    /**
    * 分页查询
    *
    * @param pageQueryInfo 分页查询
    * @return 查询结果
    */
    @PostMapping("/list")
    @ApiOperation(value = "分页查询",notes = "返回分页过后的数据",httpMethod = "POST")
    public Result<PageInfo<MemberBaseInfo>> list(@RequestBody PageQueryInfo pageQueryInfo) {
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
        List<MemberBaseInfo> memberBaseInfoList = memberBaseInfoService.queryPage(map);
        Integer count= memberBaseInfoService.queryPageCount(map);
        //返回参数
        PageInfo pager=new PageInfo<MemberBaseInfo>(count, StringUtil.getPageCount(count,pageQueryInfo.getPageSize()), pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), memberBaseInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }

    /**
    * 根据条件获取集合
    * @param memberBaseInfo
    * @return
    */
    @PostMapping("/queryList")
    @ApiOperation(value = "根据条件获取集合", notes = "查看多个项目的内容", httpMethod = "POST")
    public Result<List<MemberBaseInfo>> queryList(@RequestBody MemberBaseInfo memberBaseInfo) {
        List<MemberBaseInfo> memberBaseInfoList = memberBaseInfoService.queryList(memberBaseInfo);
        return ResultGenerator.genSuccessResult(memberBaseInfoList);
    }

    /**
    * 通过ID查询单条数据
    *
    * @param memberBaseInfo 对象
    * @return 实例对象
    */
    @PostMapping("/queryOne")
    @ApiOperation("通过ID查询单条数据")
    public Result<MemberBaseInfo> queryOne(@RequestBody MemberBaseInfo memberBaseInfo) {
        return ResultGenerator.genSuccessResult(memberBaseInfoService.queryOne(memberBaseInfo));
    }

    /**
    * 保存数据
    * @param memberBaseInfo
    * @return
    */
    @PostMapping("/save")
    @ApiOperation(value = "保存数据", notes = "保存数据", httpMethod = "POST")
    public Result save(@RequestBody MemberBaseInfo memberBaseInfo) {
        //Date currentDt = new Date();
        if (memberBaseInfo.getId() != null && memberBaseInfo.getId().longValue() > 0) {
            //memberBaseInfo.setUpdatedDt(currentDt);
            memberBaseInfoService.update(memberBaseInfo);
        } else {
            //memberBaseInfo.setCreatedDt(currentDt);
            //memberBaseInfo.setUpdatedDt(currentDt);
            memberBaseInfoService.insert(memberBaseInfo);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
    * 新增数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/add")
    @ApiOperation(value = "添加数据", notes = "添加新的数据", httpMethod = "POST")
    public Result<MemberBaseInfo> add(@RequestBody MemberBaseInfo memberBaseInfo) {
        //Date currentDt = new Date();
        //memberBaseInfo.setCreatedDt(currentDt);
        //memberBaseInfo.setUpdatedDt(currentDt);
        return ResultGenerator.genSuccessResult(memberBaseInfoService.insert(memberBaseInfo));
    }

    /**
    * 更新数据
    *
    * @param memberBaseInfo 实例对象
    * @return 实例对象
    */
    @PostMapping("/update")
    @ApiOperation(value = "更新数据", notes = "根据内容更新数据", httpMethod = "POST")
    public Result<MemberBaseInfo> update(@RequestBody MemberBaseInfo memberBaseInfo) {
        return ResultGenerator.genSuccessResult(memberBaseInfoService.update(memberBaseInfo));
    }

    /**
    * 通过主键删除数据
    *
    * @param memberBaseInfo 主键
    * @return 是否成功
    */
    @PostMapping("/delete")
    @ApiOperation(value = "删除数据", notes = "根据id删除数据", httpMethod = "POST")
    public Result<Boolean> deleteById(@RequestBody MemberBaseInfo memberBaseInfo) {
        return ResultGenerator.genSuccessResult(memberBaseInfoService.deleteById(memberBaseInfo.getId()));
    }

    /**
    * 批量新增
    *
    * @param insertList 主键
    * @return 是否成功
    */
    @PostMapping("/saveBatch")
    @ApiOperation(value = "批量新增", notes = "批量新增", httpMethod = "POST")
    public Result<Boolean> saveBatch(@RequestBody List<MemberBaseInfo> insertList) {
        return ResultGenerator.genSuccessResult(memberBaseInfoService.saveMemberBaseInfoBatch(insertList));
    }

    /**
     * 会员列表
     */
    @PostMapping("/listWithContract")
    @ApiOperation(value = "会员列表", notes = "会员列表", httpMethod = "POST")
    public Result<PageInfo<MemberBaseInfo>> listWithContract(@RequestBody PageQueryInfo pageQueryInfo) {
        if (pageQueryInfo.getPageSize() == 0) {
            pageQueryInfo.setPageSize(ProjectConstant.PAGE_SIZE);
        }
        if (pageQueryInfo.getCurrPage() == 0) {
            pageQueryInfo.setCurrPage(1);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("pageSize", pageQueryInfo.getPageSize());
        map.put("offset", (pageQueryInfo.getCurrPage() - 1) * pageQueryInfo.getPageSize());
        if (pageQueryInfo.getCondition() != null) {
            map.putAll(pageQueryInfo.getCondition());
        }

        // 查询会员列表
        List<MemberBaseInfo> memberBaseInfoList = memberBaseInfoService.queryPage(map);
        Integer count = memberBaseInfoService.queryPageCount(map);

        // 批量查询每位老人最新签订的合同，塞入 contractInfo
        // 批量查询每位老人最新评估结果，塞入 assessmentResultInfo
        if (memberBaseInfoList != null && !memberBaseInfoList.isEmpty()) {
            List<Long> elderIds = memberBaseInfoList.stream()
                    .map(MemberBaseInfo::getElderId)
                    .filter(Objects::nonNull)
                    .distinct()
                    .collect(Collectors.toList());
            if (!elderIds.isEmpty()) {
                // 合同
                List<InsElderContractInfo> allContracts = insElderContractInfoService.list(
                        new LambdaQueryWrapper<InsElderContractInfo>()
                                .in(InsElderContractInfo::getElderId, elderIds)
                                .eq(InsElderContractInfo::getIsDeleted, 0)
                );
                if (allContracts != null && !allContracts.isEmpty()) {
                    Map<Long, InsElderContractInfo> latestContractMap = allContracts.stream()
                            .filter(c -> c.getElderId() != null)
                            .collect(Collectors.toMap(
                                    InsElderContractInfo::getElderId,
                                    c -> c,
                                    (c1, c2) -> {
                                        Date t1 = c1.getSignTime();
                                        Date t2 = c2.getSignTime();
                                        if (t1 == null) return c2;
                                        if (t2 == null) return c1;
                                        return t1.after(t2) ? c1 : c2;
                                    }
                            ));
                    for (MemberBaseInfo member : memberBaseInfoList) {
                        if (member.getElderId() != null) {
                            member.setContractInfo(latestContractMap.get(member.getElderId()));
                        }
                    }
                }

                // 评估结果
                List<AssessmentAppoint> allAppoints = assessmentAppointService.list(
                        new LambdaQueryWrapper<AssessmentAppoint>()
                                .in(AssessmentAppoint::getElderId, elderIds)
                                .eq(AssessmentAppoint::getAssessState, "5")
                                .eq(AssessmentAppoint::getIsDeleted, 0)
                );
                if (allAppoints != null && !allAppoints.isEmpty()) {
                    // 每位老人取最新的评估指派记录
                    Map<Long, AssessmentAppoint> latestAppointMap = allAppoints.stream()
                            .filter(a -> a.getElderId() != null)
                            .collect(Collectors.toMap(
                                    AssessmentAppoint::getElderId,
                                    a -> a,
                                    (a1, a2) -> {
                                        Date t1 = a1.getAssessTime();
                                        Date t2 = a2.getAssessTime();
                                        if (t1 == null) return a2;
                                        if (t2 == null) return a1;
                                        return t1.after(t2) ? a1 : a2;
                                    }
                            ));
                    // 收集所有最新指派ID，批量查评估结果
                    List<Long> appointIds = latestAppointMap.values().stream()
                            .map(AssessmentAppoint::getId)
                            .collect(Collectors.toList());
                    List<AssessmentResult> allResults = assessmentResultService.list(
                            new LambdaQueryWrapper<AssessmentResult>()
                                    .in(AssessmentResult::getAppointId, appointIds)
                                    .eq(AssessmentResult::getIsDeleted, 0)
                    );
                    // 按 appointId 分组
                    Map<Long, List<AssessmentResult>> resultMap = new HashMap<>();
                    if (allResults != null) {
                        for (AssessmentResult r : allResults) {
                            resultMap.computeIfAbsent(r.getAppointId(), k -> new ArrayList<>()).add(r);
                        }
                    }

                    // 将评估结果塞入 memberBaseInfo
                    for (MemberBaseInfo member : memberBaseInfoList) {
                        if (member.getElderId() != null) {
                            AssessmentAppoint latestAppoint = latestAppointMap.get(member.getElderId());
                            if (latestAppoint != null) {
                                member.setAssessmentResultInfo(resultMap.get(latestAppoint.getId()));
                            }
                        }
                    }
                }
            }
        }

        PageInfo pager = new PageInfo<>(count, StringUtil.getPageCount(count, pageQueryInfo.getPageSize()),
                pageQueryInfo.getCurrPage(), pageQueryInfo.getPageSize(), memberBaseInfoList);
        return ResultGenerator.genSuccessResult(pager);
    }
}


