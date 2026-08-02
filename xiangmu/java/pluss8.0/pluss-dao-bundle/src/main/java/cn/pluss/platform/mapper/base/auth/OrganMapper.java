package cn.pluss.platform.mapper.base.auth;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import cn.pluss.platform.model.auth.Organ;

@Mapper
public interface OrganMapper {

    public Organ queryOrgan(Organ organ);

    public List<Organ> queryOrganList(Organ organ);

    public void saveOrgan(Organ organ);

    public void updateOrgan(Organ organ);

    public void deleteOrgan(Organ organ);

    public List<Organ> queryOrganPage(Map map);

    public Integer queryOrganPageCount(Map map);

    public void saveOrganBatch(List<Organ>  organList);

    public void deleteOrganBatch(List<String> list);
}

