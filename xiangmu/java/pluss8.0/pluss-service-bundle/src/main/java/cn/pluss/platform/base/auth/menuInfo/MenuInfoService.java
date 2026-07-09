package cn.pluss.platform.base.auth.menuInfo;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.auth.MenuInfo;

public interface MenuInfoService {

    public MenuInfo queryMenuInfo(MenuInfo menuInfo);

    public List<MenuInfo> queryMenuInfoList(MenuInfo menuInfo);

    public void saveMenuInfo(MenuInfo menuInfo);

    public void updateMenuInfo(MenuInfo menuInfo);

    public void deleteMenuInfo(MenuInfo menuInfo);

    public List<MenuInfo> queryMenuInfoPage(Map map);

    public Integer queryMenuInfoPageCount(Map map);

    public void saveMenuInfoBatch(List<MenuInfo> menuInfoList);

    public void deleteMenuInfoBatch(List<String> list);

    List<MenuInfo> queryMenuInfoByRole(List<String> roleCodes);
}

