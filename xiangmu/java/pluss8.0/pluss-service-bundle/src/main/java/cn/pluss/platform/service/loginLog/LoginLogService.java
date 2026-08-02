package cn.pluss.platform.service.loginLog;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.entity.LoginLog;

public interface LoginLogService {

public LoginLog queryLoginLog(LoginLog loginLog);

public List<LoginLog> queryLoginLogList(LoginLog loginLog);

    public void saveLoginLog(LoginLog loginLog);

    public void updateLoginLog(LoginLog loginLog);

    public void deleteLoginLog(LoginLog loginLog);

    public List<LoginLog> queryLoginLogPage(Map map);

    public Integer queryLoginLogPageCount(Map map);

    public void saveLoginLogBatch(List<LoginLog> systemLoginLog);

    public void deleteLoginLogBatch(List<String> list);
 }
