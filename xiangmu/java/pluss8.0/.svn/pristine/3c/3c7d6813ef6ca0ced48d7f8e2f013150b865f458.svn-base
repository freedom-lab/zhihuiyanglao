package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.OrganType;

@Mapper
public interface OrganTypeMapper {

    public OrganType queryOrganType(OrganType organType);

    public List<OrganType> queryOrganTypeList(OrganType organType);

    public void saveOrganType(OrganType organType);

    public void updateOrganType(OrganType organType);

    public void deleteOrganType(OrganType organType);

    public List<OrganType> queryOrganTypePage(Map map);

    public Integer queryOrganTypePageCount(Map map);

    public void saveOrganTypeBatch(List<OrganType>  organTypeList);

    public void deleteOrganTypeBatch(List<String> list);
}

