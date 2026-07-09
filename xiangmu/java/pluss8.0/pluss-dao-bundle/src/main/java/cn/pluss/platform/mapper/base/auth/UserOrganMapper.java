package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.UserOrgan;

@Mapper
public interface UserOrganMapper {

    public UserOrgan queryUserOrgan(UserOrgan userOrgan);

    public List<UserOrgan> queryUserOrganList(UserOrgan userOrgan);

    public void saveUserOrgan(UserOrgan userOrgan);

    public void updateUserOrgan(UserOrgan userOrgan);

    public void deleteUserOrgan(UserOrgan userOrgan);

    public List<UserOrgan> queryUserOrganPage(Map map);

    public Integer queryUserOrganPageCount(Map map);

    public void saveUserOrganBatch(List<UserOrgan>  userOrganList);

    public void deleteUserOrganBatch(List<String> list);
}

