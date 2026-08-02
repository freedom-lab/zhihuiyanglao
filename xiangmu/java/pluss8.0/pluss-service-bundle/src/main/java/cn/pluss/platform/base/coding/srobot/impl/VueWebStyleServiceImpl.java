package cn.pluss.platform.base.coding.srobot.impl;

import cn.pluss.platform.model.coding.TableBean;
import cn.pluss.platform.model.coding.TableField;
import cn.pluss.platform.base.coding.srobot.inf.WebStyleService;
import cn.pluss.platform.util.FileUtil;
import cn.pluss.platform.util.FreeMarkerUtil;
import cn.pluss.platform.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Transactional
@Service("vueWebStyleService")
public class VueWebStyleServiceImpl implements WebStyleService {
    @Override
    public void codingJs(String tableName, String packageName, List<TableField> fieldList) {

    }

    @Override
    public void codingPage(String tableName, String packageName, List<TableField> fieldList) {
        //创建列表
        codingListPage(tableName, packageName, fieldList);
        //创建详情
        codingDetailsPage(tableName, packageName, fieldList);
        //创建多功能
        codingFunctionsInfoPage(tableName, packageName, fieldList);
        //创建扩展
        codingExtendsInfoPage(tableName, packageName, fieldList);
    }



    @Override
    public void initGlobal(String tableNames, String packageName) {
        //初始化全局配置，生成router
        String routerFileDir= FileUtil.makeVueDir(packageName);
        String pageFilePath=routerFileDir+File.separator+"router.js";
        File pageFile=new File(pageFilePath);
        if(pageFile.exists()){
            pageFile.delete();
        }
        //构建所有router对象
        String[] tables=tableNames.split(",");
        List<TableBean> tableBeanList=new ArrayList<>();
        for (int i = 0; i < tables.length; i++) {
            String beanName= StringUtil.buildClassName(tables[i],"");
            TableBean tableBean=new TableBean();
            tableBean.setBeanName(beanName);
            tableBean.setBeanNameSmall(StringUtil.firstCharLowerCase(beanName));
            tableBeanList.add(tableBean);
        }

        try {
            pageFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableBeanList",tableBeanList);
            String routerContent= null;
            routerContent = FreeMarkerUtil.genFileContent("vue/router.ftl",params);
            //写入文件
            FileUtil.write2File(pageFilePath,routerContent);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 创建功能页面
     * @param tableName
     * @param packageName
     * @param fieldList
     */
    private void codingExtendsInfoPage(String tableName, String packageName,
                                         List<TableField> fieldList) {
        //创建目录
        String pageFileDir=FileUtil.makeVuePageFileDir(packageName,tableName);
        String pageClassName=StringUtil.buildClassName(tableName,"");
        String pageFilePath=pageFileDir+File.separator+StringUtil.firstCharUpCase(pageClassName)+"Extends.vue";
        File pageFile=new File(pageFilePath);
        if(pageFile.exists()){
            pageFile.delete();
        }
        try {
            pageFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",pageClassName);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(pageClassName));
            String pageContent= FreeMarkerUtil.genFileContent("vue/extends.ftl",params);
            //写入文件
            FileUtil.write2File(pageFilePath,pageContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 创建功能页面
     * @param tableName
     * @param packageName
     * @param fieldList
     */
    private void codingFunctionsInfoPage(String tableName, String packageName,
                                   List<TableField> fieldList) {
        //创建目录
        String pageFileDir=FileUtil.makeVuePageFileDir(packageName,tableName);
        String pageClassName=StringUtil.buildClassName(tableName,"");
        String pageFilePath=pageFileDir+File.separator+StringUtil.firstCharUpCase(pageClassName)+"Function.vue";
        File pageFile=new File(pageFilePath);
        if(pageFile.exists()){
            pageFile.delete();
        }
        try {
            pageFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",pageClassName);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(pageClassName));
            String pageContent= FreeMarkerUtil.genFileContent("vue/function.ftl",params);
            //写入文件
            FileUtil.write2File(pageFilePath,pageContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * 创建详情页面
     * @param tableName
     * @param packageName
     * @param fieldList
     */
    private void codingDetailsPage(String tableName, String packageName,
                                   List<TableField> fieldList) {
        //创建目录
        String pageFileDir=FileUtil.makeVuePageFileDir(packageName,tableName);
        String pageClassName=StringUtil.buildClassName(tableName,"");
        String pageFilePath=pageFileDir+File.separator+StringUtil.firstCharUpCase(pageClassName)+"Details.vue";
        File pageFile=new File(pageFilePath);
        if(pageFile.exists()){
            pageFile.delete();
        }
        try {
            pageFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",pageClassName);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(pageClassName));
            String pageContent= FreeMarkerUtil.genFileContent("vue/details.ftl",params);
            //写入文件
            FileUtil.write2File(pageFilePath,pageContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * 创建列表页面页面
     * @param tableName
     * @param packageName
     * @param fieldList
     */
    private void codingListPage(String tableName, String packageName,
                                List<TableField> fieldList) {
        //创建目录
        String pageFileDir= FileUtil.makeVuePageFileDir(packageName,tableName);
        String pageClassName= StringUtil.buildClassName(tableName,"");
        String pageFilePath=pageFileDir+ File.separator+StringUtil.firstCharUpCase(pageClassName)+".vue";
        File pageFile=new File(pageFilePath);
        if(pageFile.exists()){
            pageFile.delete();
        }
        try {
            pageFile.createNewFile();
            //构建impl文件内容
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",pageClassName);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(pageClassName));
            String pageContent= FreeMarkerUtil.genFileContent("vue/list.ftl",params);
            //写入文件
            FileUtil.write2File(pageFilePath,pageContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
