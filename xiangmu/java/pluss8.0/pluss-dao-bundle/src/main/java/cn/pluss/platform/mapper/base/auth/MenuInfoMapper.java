package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.MenuInfo;

@Mapper
public interface MenuInfoMapper {

    public MenuInfo queryMenuInfo(MenuInfo menuInfo);

    public List<MenuInfo> queryMenuInfoList(MenuInfo menuInfo);

    public void saveMenuInfo(MenuInfo menuInfo);

    public void updateMenuInfo(MenuInfo menuInfo);

    public void deleteMenuInfo(MenuInfo menuInfo);

    public List<MenuInfo> queryMenuInfoPage(Map map);

    public Integer queryMenuInfoPageCount(Map map);

    public void saveMenuInfoBatch(List<MenuInfo>  menuInfoList);

    public void deleteMenuInfoBatch(List<String> list);

    List<MenuInfo> queryMenuInfoByRole(List<String> roleCodes);
}

