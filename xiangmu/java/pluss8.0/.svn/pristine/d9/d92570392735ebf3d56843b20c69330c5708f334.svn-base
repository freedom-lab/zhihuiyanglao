package cn.pluss.platform.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.entity.LoginLog;

@Mapper
public interface LoginLogMapper {

    public LoginLog queryLoginLog(LoginLog loginLog);

    public List<LoginLog> queryLoginLogList(LoginLog loginLog);

    public void saveLoginLog(LoginLog loginLog);

    public void updateLoginLog(LoginLog loginLog);

    public void deleteLoginLog(LoginLog loginLog);

    public List<LoginLog> queryLoginLogPage(Map map);

    public Integer queryLoginLogPageCount(Map map);

    public void saveLoginLogBatch(List<LoginLog>  loginLogList);

    public void deleteLoginLogBatch(List<String> list);

}


