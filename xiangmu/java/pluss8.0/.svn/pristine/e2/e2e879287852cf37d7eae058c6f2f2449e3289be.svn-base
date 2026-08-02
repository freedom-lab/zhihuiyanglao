package cn.pluss.platform.service.loginLog.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.entity.LoginLog;
import cn.pluss.platform.service.loginLog.LoginLogService;
import cn.pluss.platform.mapper.LoginLogMapper;

@Transactional
@Service("loginLogService")
public class LoginLogServiceImpl  implements LoginLogService{

private static final Logger logger = LoggerFactory.getLogger(LoginLogServiceImpl.class);


    @Autowired
    private LoginLogMapper loginLogMapper;

    @Override
    public LoginLog queryLoginLog(LoginLog loginLog){
        return loginLogMapper.queryLoginLog(loginLog);
    }

    @Override
    public List<LoginLog> queryLoginLogList(LoginLog loginLog){
        return loginLogMapper.queryLoginLogList(loginLog);
    }

    @Override
    public void saveLoginLog(LoginLog loginLog){
        loginLogMapper.saveLoginLog(loginLog);
    }

    @Override
    public void updateLoginLog(LoginLog loginLog){
        loginLogMapper.updateLoginLog(loginLog);
    }

    @Override
    public void deleteLoginLog(LoginLog loginLog){
        loginLogMapper.deleteLoginLog(loginLog);
    }

    @Override
    public List<LoginLog> queryLoginLogPage(Map map){
        return loginLogMapper.queryLoginLogPage(map);
    }

    @Override
    public Integer queryLoginLogPageCount(Map map){
        return loginLogMapper.queryLoginLogPageCount(map);
    }

    @Override
    public void saveLoginLogBatch(List<LoginLog> loginLogList) {
        loginLogMapper.saveLoginLogBatch(loginLogList);
    }

    @Override
    public void deleteLoginLogBatch(List<String> list) {
        loginLogMapper.deleteLoginLogBatch(list);
    }
}


