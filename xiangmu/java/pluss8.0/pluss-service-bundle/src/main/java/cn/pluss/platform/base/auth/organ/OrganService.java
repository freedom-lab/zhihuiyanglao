package cn.pluss.platform.base.auth.organ;

import java.util.List;
import java.util.Map;
import cn.pluss.platform.model.auth.Organ;

public interface OrganService {

    public Organ queryOrgan(Organ organ);

    public List<Organ> queryOrganList(Organ organ);

    public void saveOrgan(Organ organ);

    public void updateOrgan(Organ organ);

    public void deleteOrgan(Organ organ);

    public List<Organ> queryOrganPage(Map map);

    public Integer queryOrganPageCount(Map map);

    public void saveOrganBatch(List<Organ> organList);

    public void deleteOrganBatch(List<String> list);
}

