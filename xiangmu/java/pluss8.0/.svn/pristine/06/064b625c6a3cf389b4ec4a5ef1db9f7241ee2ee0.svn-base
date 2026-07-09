package cn.pluss.platform.base.auth.organ.impl;

import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pluss.platform.model.auth.Organ;
import cn.pluss.platform.base.auth.organ.OrganService;
import cn.pluss.platform.mapper.base.auth.OrganMapper;

@Transactional
@Service("organService")
public class OrganServiceImpl  implements OrganService{

	 private static final Logger logger = LoggerFactory.getLogger( OrganServiceImpl.class);


    @Autowired
	  private OrganMapper organMapper;

    @Override
    public Organ queryOrgan(Organ organ){
        return organMapper.queryOrgan(organ);
    }

    @Override
    public List<Organ> queryOrganList(Organ organ){
        return organMapper.queryOrganList(organ);
    }
    @Override
    public void saveOrgan(Organ organ){
          organMapper.saveOrgan(organ);
    }
    @Override
    public void updateOrgan(Organ organ){
        organMapper.updateOrgan(organ);
    }
    @Override
    public void deleteOrgan(Organ organ){
        organMapper.deleteOrgan(organ);
    }
    @Override
    public List<Organ> queryOrganPage(Map map){
        return organMapper.queryOrganPage(map);
    }
    @Override
    public Integer queryOrganPageCount(Map map){
        return organMapper.queryOrganPageCount(map);
    }
    @Override
    public void saveOrganBatch(List<Organ> organList) {
         organMapper.saveOrganBatch(organList);
    }
    @Override
    public void deleteOrganBatch(List<String> list) {
         organMapper.deleteOrganBatch(list);
    }
}

