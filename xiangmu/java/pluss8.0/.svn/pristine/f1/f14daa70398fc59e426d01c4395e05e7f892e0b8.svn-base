package cn.pluss.platform.base.auth.menuInfo.impl;

import java.util.List;
import java.util.Map;

import cn.pluss.platform.base.auth.menuInfo.MenuInfoService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.MenuInfo;
import cn.pluss.platform.mapper.base.auth.MenuInfoMapper;

@Transactional
@Service("menuInfoService")
public class MenuInfoServiceImpl  implements MenuInfoService {

	 private static final Logger logger = LoggerFactory.getLogger( MenuInfoServiceImpl.class);


    @Autowired
	  private MenuInfoMapper menuInfoMapper;

    @Override
    public MenuInfo queryMenuInfo(MenuInfo menuInfo){
        return menuInfoMapper.queryMenuInfo(menuInfo);
    }

    @Override
    public List<MenuInfo> queryMenuInfoList(MenuInfo menuInfo){
        return menuInfoMapper.queryMenuInfoList(menuInfo);
    }
    @Override
    public void saveMenuInfo(MenuInfo menuInfo){
          menuInfoMapper.saveMenuInfo(menuInfo);
    }
    @Override
    public void updateMenuInfo(MenuInfo menuInfo){
        menuInfoMapper.updateMenuInfo(menuInfo);
    }
    @Override
    public void deleteMenuInfo(MenuInfo menuInfo){
        menuInfoMapper.deleteMenuInfo(menuInfo);
    }
    @Override
    public List<MenuInfo> queryMenuInfoPage(Map map){
        return menuInfoMapper.queryMenuInfoPage(map);
    }
    @Override
    public Integer queryMenuInfoPageCount(Map map){
        return menuInfoMapper.queryMenuInfoPageCount(map);
    }
    @Override
    public void saveMenuInfoBatch(List<MenuInfo> menuInfoList) {
         menuInfoMapper.saveMenuInfoBatch(menuInfoList);
    }
    @Override
    public void deleteMenuInfoBatch(List<String> list) {
         menuInfoMapper.deleteMenuInfoBatch(list);
    }

    @Override
    public List<MenuInfo> queryMenuInfoByRole(List<String> roleCodes) {
        return menuInfoMapper.queryMenuInfoByRole(roleCodes);
    }
}

