package ${packageName}.controller.${beanName};

import ${packageName}.base.BaseController;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import ${packageName}.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ${packageName}.model.entity.${beanName};
import ${packageName}.${beanNameSmall}.${beanName}Service;

@Controller
@RequestMapping("${beanNameSmall}")
public class ${beanName}Controller  extends BaseController{

    private Integer PAGE_SIZE=12;

    @Autowired
    private ${beanName}Service ${beanNameSmall}Service;

    /**
    *引导页
    * @return
    */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request,Integer pageIndex) {
        if(pageIndex==null||pageIndex==0) {
        pageIndex=1;
        }
        request.setAttribute("pageIndex", pageIndex);
        return "${beanNameSmall}/${beanNameSmall}List";
    }

    /**
    *分页查询
    */
    @RequestMapping(value = "/query${beanName}ByPage", method = RequestMethod.GET)
    @ResponseBody
    public  Map<String,Object> query${beanName}ByPage(Integer page,Integer limit,Integer id) {

        if(page==null) {
        page=1;
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageSize",limit);
        map.put("offset",(page-1)*limit);
        map.put("id",  id);
        List<${beanName}> ${beanNameSmall}List=${beanNameSmall}Service.queryPage(map);
        Integer count=${beanNameSmall}Service.queryPageCount(map);
        Map<String,Object> reslut=new HashMap<String,Object>();
        reslut.put("code", 0);
        reslut.put("count", count);
        reslut.put("data",${beanNameSmall}List);
        return reslut;
    }
    /**
    *查询详情
    */
    @RequestMapping(value = "/query${beanName}Details", method = RequestMethod.GET)
    public String query${beanName}Details(HttpServletRequest request,Integer id,Integer pageIndex){

        if(id!=null&&id!=0) {
        ${beanName} ${beanNameSmall}=new ${beanName}();
        ${beanNameSmall}.setId(id);
        ${beanNameSmall}=${beanNameSmall}Service.query${beanName}(${beanNameSmall});
        request.setAttribute("${beanNameSmall}", ${beanNameSmall});
        request.setAttribute("pageIndex", pageIndex);
        }
        return "${beanNameSmall}/${beanNameSmall}Details";
    }
    /**
    *查询详情
    */
    @RequestMapping(value = "/query${beanName}BaseInfo", method = RequestMethod.GET)
    public String query${beanName}BaseInfo(HttpServletRequest request,Integer id,Integer pageIndex){

        if(id!=null&&id!=0) {
        ${beanName} ${beanNameSmall}=new ${beanName}();
        ${beanNameSmall}.setId(id);
        ${beanNameSmall}=${beanNameSmall}Service.query${beanName}(${beanNameSmall});
        request.setAttribute("${beanNameSmall}", ${beanNameSmall});
        request.setAttribute("pageIndex", pageIndex);
        }
        return "${beanNameSmall}/${beanNameSmall}BaseInfo";
    }
    /**
    *查询详情
    */
    @RequestMapping(value = "/query${beanName}ExtendsInfo", method = RequestMethod.GET)
    public String query${beanName}ExtendsInfo(){

        return "${beanNameSmall}/${beanNameSmall}dExtendsInfo";
    }
    /**
    *查询详情
    */
    @RequestMapping(value = "/query${beanName}FunctionsInfo", method = RequestMethod.GET)
    public String query${beanName}FunctionsInfo(){

        return "${beanNameSmall}/${beanNameSmall}FunctionsInfo";
    }
    /**
    *保存对象
    */
    @RequestMapping(value = "/save${beanName}", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> save${beanName}(${beanName} ${beanNameSmall}){

        if(${beanNameSmall}.getId()!=null&&${beanNameSmall}.getId()!=0){
            ${beanNameSmall}Service.update${beanName}(${beanNameSmall});
        }else{
            ${beanNameSmall}Service.save${beanName}(${beanNameSmall});
        }
        Map<String,Object> reslut=new HashMap<String,Object>();
        reslut.put("reslutCode", "1");
        reslut.put("reslutMessage", "保存成功!");
        return reslut;
    }
    /**
    *修改对象
    */
    @RequestMapping(value = "/update${beanName}", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> update${beanName}(Integer id){
        ${beanName} ${beanNameSmall}=new ${beanName}();
        ${beanNameSmall}.setId(id);
        ${beanNameSmall}Service.update${beanName}(${beanNameSmall});
        Map<String,Object> reslut=new HashMap<String,Object>();
        reslut.put("reslutCode", "1");
        reslut.put("reslutMessage", "保存成功!");
        return reslut;
    }
    /**
    *删除对象
    */
    @RequestMapping(value = "/delete${beanName}", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> delete${beanName}(Integer id){
        ${beanName} ${beanNameSmall}=new ${beanName}();
        ${beanNameSmall}.setId(id);
        ${beanNameSmall}Service.delete${beanName}(${beanNameSmall});
        Map<String,Object> reslut=new HashMap<String,Object>();
        reslut.put("reslutCode", "1");
        reslut.put("reslutMessage", "保存成功!");
        return reslut;
    }
    /**
    *批量删除对象
    */
    @RequestMapping(value = "/delete${beanName}Batch", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> delete${beanName}Batch(String[] ids){
        ${beanNameSmall}Service.delete${beanName}Batch(Arrays.asList(ids));
        Map<String,Object> reslut=new HashMap<String,Object>();
        reslut.put("reslutCode", "1");
        reslut.put("reslutMessage", "保存成功!");
        return reslut;
    }
}