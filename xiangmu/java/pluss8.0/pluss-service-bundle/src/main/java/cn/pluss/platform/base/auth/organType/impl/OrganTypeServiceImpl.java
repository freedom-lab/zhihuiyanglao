package cn.pluss.platform.base.auth.organType.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.OrganType;
import cn.pluss.platform.base.auth.organType.OrganTypeService;
import cn.pluss.platform.mapper.base.auth.OrganTypeMapper;

@Transactional
@Service("organTypeService")
public class OrganTypeServiceImpl  implements OrganTypeService{

	 private static final Logger logger = LoggerFactory.getLogger( OrganTypeServiceImpl.class);


    @Autowired
	  private OrganTypeMapper organTypeMapper;

    @Override
    public OrganType queryOrganType(OrganType organType){
        return organTypeMapper.queryOrganType(organType);
    }

    @Override
    public List<OrganType> queryOrganTypeList(OrganType organType){
        return organTypeMapper.queryOrganTypeList(organType);
    }
    @Override
    public void saveOrganType(OrganType organType){
          organTypeMapper.saveOrganType(organType);
    }
    @Override
    public void updateOrganType(OrganType organType){
        organTypeMapper.updateOrganType(organType);
    }
    @Override
    public void deleteOrganType(OrganType organType){
        organTypeMapper.deleteOrganType(organType);
    }
    @Override
    public List<OrganType> queryOrganTypePage(Map map){
        return organTypeMapper.queryOrganTypePage(map);
    }
    @Override
    public Integer queryOrganTypePageCount(Map map){
        return organTypeMapper.queryOrganTypePageCount(map);
    }
    @Override
    public void saveOrganTypeBatch(List<OrganType> organTypeList) {
         organTypeMapper.saveOrganTypeBatch(organTypeList);
    }
    @Override
    public void deleteOrganTypeBatch(List<String> list) {
         organTypeMapper.deleteOrganTypeBatch(list);
    }
}

