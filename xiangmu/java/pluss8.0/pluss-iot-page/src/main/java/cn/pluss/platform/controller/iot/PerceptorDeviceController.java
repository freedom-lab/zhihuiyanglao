package cn.pluss.platform.controller.iot;

import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.model.dto.DeviceQueryDto;
import cn.pluss.platform.model.entity.IotDeviceAlarmLog;
import cn.pluss.platform.model.entity.SmartDeviceParamBed;
import cn.pluss.platform.model.entity.SmartDeviceParamFall;
import cn.pluss.platform.model.vo.AlarmData;
import cn.pluss.platform.model.vo.AlarmDataEvent;
import cn.pluss.platform.model.vo.PerceptorReslut;
import cn.pluss.platform.model.vo.FallDownDataEvent;
import cn.pluss.platform.model.vo.VitalSignsDataEvent;
import cn.pluss.platform.service.iotDeviceAlarmLog.IotDeviceAlarmLogService;
import cn.pluss.platform.service.smartDeviceParamBed.SmartDeviceParamBedService;
import cn.pluss.platform.service.smartDeviceParamFall.SmartDeviceParamFallService;
import cn.pluss.platform.util.HttpUtil;
import cn.pluss.platform.util.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("perceptordevice")
public class PerceptorDeviceController {
    private static final Logger logger = Logger.getLogger(PerceptorDeviceController.class);

    @Resource
    private SmartDeviceParamFallService smartDeviceParamFallService;

    @Resource
    private SystemConfigService systemConfigService;
    @Resource
    private SmartDeviceParamBedService smartDeviceParamBedService;
    @Resource
    private IotDeviceAlarmLogService iotDeviceAlarmLogService;

    /**
     * 接收生命体征数据事件
     * @param vitalSignsDataEvent 生命体征数据
     * @return
     */
    @PostMapping("/vitalSignsDataEvent")
    @ResponseBody
    @ApiOperation(value = "接收生命体征数据", notes = "接收设备上报的生命体征数据事件", httpMethod = "POST")
    public PerceptorReslut vitalSignsDataEvent(@RequestBody VitalSignsDataEvent vitalSignsDataEvent) {
        logger.info("收到生命体征数据: deviceId=" + vitalSignsDataEvent.getDeviceId()
                + ", type=" + vitalSignsDataEvent.getType());

        if (vitalSignsDataEvent.getData() != null) {
            logger.info("心率=" + vitalSignsDataEvent.getData().getHeartRate()
                    + ", 呼吸率=" + vitalSignsDataEvent.getData().getBreathRate()
                    + ", 体动=" + vitalSignsDataEvent.getData().getBodyShake()
                    + ", 在床=" + vitalSignsDataEvent.getData().getOnbed());
            // TODO 业务处理：保存数据等
            SmartDeviceParamBed smartDeviceParamBed = new SmartDeviceParamBed();
            smartDeviceParamBed.setDeviceName(vitalSignsDataEvent.getDeviceName());
            smartDeviceParamBed.setHeartRate(vitalSignsDataEvent.getData().getHeartRate());
            smartDeviceParamBed.setBreathRate(vitalSignsDataEvent.getData().getBreathRate());
            smartDeviceParamBed.setBodyShake(vitalSignsDataEvent.getData().getBodyShake());
            smartDeviceParamBed.setOnBed(vitalSignsDataEvent.getData().getOnbed());
            smartDeviceParamBed.setUpdateTime(vitalSignsDataEvent.getData().getReportTimeAsDate());
            smartDeviceParamBedService.updateSmartDeviceParamBed(smartDeviceParamBed);
        }
        return PerceptorReslut.success();
    }

    /**
     * 接收摔倒报警数据事件
     * @param fallDownDataEvent 摔倒报警数据
     * @return
     */
    @PostMapping("/fallDownDataEvent")
    @ResponseBody
    @ApiOperation(value = "接收摔倒报警数据", notes = "接收设备上报的摔倒报警事件", httpMethod = "POST")
    public PerceptorReslut fallDownDataEvent(@RequestBody FallDownDataEvent fallDownDataEvent) {
        logger.info("收到摔倒报警数据: deviceId=" + fallDownDataEvent.getDeviceId()
                + ", deviceName=" + fallDownDataEvent.getDeviceName()
                + ", type=" + fallDownDataEvent.getType());

        if (fallDownDataEvent.getData() != null) {
            logger.info("跌倒标志=" + fallDownDataEvent.getData().getSmbdFlag()
                    + ", 上报时间=" + fallDownDataEvent.getData().getReportTime());
            SmartDeviceParamFall smartDeviceParamFall = new SmartDeviceParamFall();
            smartDeviceParamFall.setDeviceSerial(fallDownDataEvent.getDeviceId());
            smartDeviceParamFall.setSomeoneExist(fallDownDataEvent.getData().getSmbdFlag());
            smartDeviceParamFall.setUpdateTime(fallDownDataEvent.getData().getReportTime());
            smartDeviceParamFallService.updateByDeviceSerial(smartDeviceParamFall);
        }

        return PerceptorReslut.success();
    }

    /**
     * 接收设备告警事件
     * @param alarmDataEvent 设备告警事件
     * @return
     */
    @PostMapping("/alarmDataEvent")
    @ResponseBody
    @ApiOperation(value = "接收设备告警事件", notes = "接收感知设备上报的告警事件并写入告警日志表", httpMethod = "POST")
    public PerceptorReslut alarmDataEvent(@RequestBody AlarmDataEvent alarmDataEvent) {
        logger.info("收到告警事件: deviceId=" + alarmDataEvent.getDeviceId()
                + ", deviceName=" + alarmDataEvent.getDeviceName()
                + ", type=" + alarmDataEvent.getType());

        AlarmData data = alarmDataEvent.getData();
        if (data == null) {
            return PerceptorReslut.success();
        }

        logger.info("AlarmId=" + data.getAlarmId()
                + ", AlarmLevel=" + data.getAlarmLevel()
                + ", AlarmReason=" + data.getAlarmReason()
                + ", AlarmTStamp=" + data.getAlarmTStamp());

        IotDeviceAlarmLog alarmLog = new IotDeviceAlarmLog();
        alarmLog.setDeviceName(alarmDataEvent.getDeviceName());
        alarmLog.setDeviceSerial(alarmDataEvent.getDeviceId());
        alarmLog.setAlarmTime(data.getAlarmTimeAsDate());
        alarmLog.setAlarmText(data.getAlarmReason());
        alarmLog.setAlarmType(resolveAlarmType(data.getAlarmId(), data.getAlarmReason()));
        // 备注：固件版本 + 算法版本 + 告警参数
        String remark = "FwVer:" + data.getFwVer() + ", AlgoVer:" + data.getAlgoVer();
        if (data.getAlarmParams() != null) {
            remark += ", Params:" + data.getAlarmParams();
        }
        alarmLog.setRemark(remark);
        alarmLog.setSyncState(0);
        alarmLog.setCreateTime(new Date());
        alarmLog.setUpdateTime(new Date());

        iotDeviceAlarmLogService.save(alarmLog);
        return PerceptorReslut.success();
    }

    /**
     * 根据设备平台 AlarmId（告警代码）映射到 DB alarm_type
     *
     * 设备平台告警代码表（附录1.6）：
     *   Code 1  → 摔倒报警         → DB alarm_type=9  (跌倒告警)
     *   Code 2  → 低姿态异常提醒    → DB alarm_type=6  (红外告警，活动检测仪)
     *   Code 3  → 长时间滞留卫生间  → DB alarm_type=6  (红外告警，活动检测仪)
     *   Code 4  → 长时间不活动提醒  → DB alarm_type=6  (红外告警，活动检测仪)
     *   Code 5  → 长时间不去卫生间  → DB alarm_type=6  (红外告警，活动检测仪)
     *   Code 6  → SOS报警          → DB alarm_type=4  (紧急呼叫告警)
     *   Code 7  → 低电量报警        → DB alarm_type=7  (低电量告警)
     *   Code 8  → 离线报警          → DB alarm_type=8  (离线告警)
     *   Code 9  → 燃气报警          → DB alarm_type=1  (燃气告警)
     *   Code 10 → 烟雾报警          → DB alarm_type=2  (烟雾告警)
     *   Code 11 → 蓝牙呼叫器报警    → DB alarm_type=4  (紧急呼叫告警)
     *   Code 12 → 门磁报警          → DB alarm_type=5  (门磁告警)
     *   Code 13 → 水浸报警          → DB alarm_type=3  (水浸告警)
     *   Code 14 → 床垫心率异常      → DB alarm_type=10 (床垫告警)
     *   Code 15 → 床垫呼吸异常      → DB alarm_type=10 (床垫告警)
     *   Code 16 → 床垫离床告警      → DB alarm_type=10 (床垫告警)
     *   Code 17 → 床垫体动过多      → DB alarm_type=10 (床垫告警)
     *   Code 18 → 围栏越界          → DB alarm_type=11 (围栏告警)
     *   Code 19 → 跌倒报警(腕表)    → DB alarm_type=9  (跌倒告警)
     */
    private Integer resolveAlarmType(String alarmId, String alarmReason) {
        if (alarmId != null && !alarmId.isEmpty()) {
            try {
                int code = Integer.parseInt(alarmId);
                switch (code) {
                    case 1:   return 9;   // 摔倒报警
                    case 2:   return 6;   // 低姿态异常提醒
                    case 3:   return 6;   // 长时间滞留卫生间
                    case 4:   return 6;   // 长时间不活动提醒
                    case 5:   return 6;   // 长时间不去卫生间
                    case 6:   return 4;   // SOS报警
                    case 7:   return 7;   // 低电量报警
                    case 8:   return 8;   // 离线报警
                    case 9:   return 1;   // 燃气报警
                    case 10:  return 2;   // 烟雾报警
                    case 11:  return 4;   // 蓝牙呼叫器报警
                    case 12:  return 5;   // 门磁报警
                    case 13:  return 3;   // 水浸报警
                    case 14:  return 10;  // 床垫心率异常
                    case 15:  return 10;  // 床垫呼吸异常
                    case 16:  return 10;  // 床垫离床告警
                    case 17:  return 10;  // 床垫体动过多
                    case 18:  return 11;  // 围栏越界
                    case 19:  return 9;   // 跌倒报警（腕表）
                    default:
                        // 未知代码，透传为 alarm_type（超出范围则走关键字兜底）
                        if (code >= 1 && code <= 14) return code;
                        break;
                }
            } catch (NumberFormatException ignored) {
            }
        }
        // AlarmId 非数字时，按 AlarmReason 关键字兜底
        if (alarmReason != null) {
            if (alarmReason.contains("摔倒") || alarmReason.contains("跌倒")) return 9;
            if (alarmReason.contains("SOS")  || alarmReason.contains("紧急呼叫")) return 4;
            if (alarmReason.contains("低电量") || alarmReason.contains("电量")) return 7;
            if (alarmReason.contains("离线")) return 8;
            if (alarmReason.contains("燃气")) return 1;
            if (alarmReason.contains("烟雾")) return 2;
            if (alarmReason.contains("水浸")) return 3;
            if (alarmReason.contains("门磁")) return 5;
            if (alarmReason.contains("红外") || alarmReason.contains("滞留")
                    || alarmReason.contains("不活动") || alarmReason.contains("低姿态")) return 6;
            if (alarmReason.contains("床垫") || alarmReason.contains("离床")
                    || alarmReason.contains("心率") || alarmReason.contains("呼吸")
                    || alarmReason.contains("体动")) return 10;
            if (alarmReason.contains("围栏") || alarmReason.contains("越界")) return 11;
        }
        return null;
    }

    /**
     * 解析设备参数并绑定
     **/
    @PostMapping("/parsing")
    public void getParsingParam(@RequestBody DeviceQueryDto dto) {
        String deviceName =  dto.getDevice_name();
        String clientId = systemConfigService.querySystemConfigValue("client_id");
        String clientSecret = systemConfigService.querySystemConfigValue("client_secret");
        String baseUrl = systemConfigService.querySystemConfigValue("baseUrl");
        //获取Token入参
        String token = HttpUtil.getToken(baseUrl, clientId, clientSecret);
        //赋值公共参数
        Map<String, String> map = new HashMap<>();
        map.put("client_id",clientId);
        map.put("device_name",deviceName);
        map.put("version","2.0");
        map.put("timestamp",String.valueOf(System.currentTimeMillis()));
        map.put("sign_version","2.0");
        String id = UUID.randomUUID().toString().replace("-", "");
        map.put("sign_nonce",id);
        map.put("sign_method","HMAC-SHA1");
        dto.setDevice_name(null);
        //1. 获取设备详情
        String json = HttpUtil.doPostJsonWithToken(baseUrl + "/device/detail", JSON.toJSONString(map), token, clientSecret);
        JSONObject jsonObject = JSON.parseObject(json);
        String homeId =  jsonObject.getString("home_id");
        if(StringUtil.isBlank(homeId)){
            String homeJson = HttpUtil.doPostJsonWithToken(baseUrl + "/home/create", dto.toString(), token, clientSecret);
            JSONObject homeJsonObject = JSON.parseObject(homeJson);
            homeId = homeJsonObject.getString("home_id");
        }
        //2
        map.put("home_id",homeId);
        map.put("device_name",deviceName);
        map.put("timestamp",String.valueOf(System.currentTimeMillis()));
        String deviceJson = HttpUtil.doPostJsonWithToken(baseUrl + "/home/bind/device", JSON.toJSONString(map), token, clientSecret);
    }
}
