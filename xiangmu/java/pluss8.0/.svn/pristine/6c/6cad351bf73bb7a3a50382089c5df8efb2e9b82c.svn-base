package cn.pluss.platform.base.coding.srobot.impl;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.base.coding.srobot.inf.CodingRobotService;
import cn.pluss.platform.base.coding.srobot.inf.SrobotService;
import cn.pluss.platform.base.coding.srobot.inf.WebStyleService;
import cn.pluss.platform.base.coding.table.TableService;
import cn.pluss.platform.constants.ProjectConstant;
import cn.pluss.platform.constants.ServiceConstant;
import cn.pluss.platform.model.coding.Table;
import cn.pluss.platform.model.coding.TableField;
import cn.pluss.platform.model.vo.CodingRuleVo;
import cn.pluss.platform.util.FileUtil;
import cn.pluss.platform.util.FreeMarkerUtil;
import cn.pluss.platform.util.StringUtil;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
@Transactional
@Service("codingRobotService")
public class CodingMysqlServiceImpl implements CodingRobotService {
    @Resource
    public WebStyleService vueWebStyleService;
    @Resource
    private TableService tableService;
    @Resource
    private SrobotService srobotService;

    @Override
    public Result coding(CodingRuleVo codingRuleVo) {
        List<Table> tableInfoList = Lists.newArrayList();
        if (ProjectConstant.CODING_TYPE_ALL.equals(codingRuleVo.getCodingType())) {
            //查询所有的表
            tableInfoList = tableService.queryTableList(null);
        } else {
            tableInfoList = codingRuleVo.getSelectRowList();
        }

        if (CollectionUtils.isEmpty(tableInfoList)) {
            return ResultGenerator.genFailResult("没有要生成的表数据!");
        }

        String tableNames = "";
        for (Table tableInfo : tableInfoList) {
            tableNames += tableInfo.getTableName() + ",";
        }
        codingRuleVo.setTableNames(tableNames);
        //初始化页面全局配置
        vueWebStyleService.initGlobal(codingRuleVo.getTableNames(), codingRuleVo.getVueDir());
        //生成模块代码
        String[] tables = codingRuleVo.getTableNames().split(",");
        for (int i = 0; i < tables.length; i++) {
            //查询数据库字段名称
            String tableName = tables[i];
            TableField tf = new TableField();
            //数据库名称
            tf.setSchema(codingRuleVo.getCon().getName());
            //表名
            tf.setTableName(tableName);
            List<TableField> fieldList = srobotService.queryTableField(tf);
            for (TableField field : fieldList) {
                String filedUpcaseName = StringUtil.toCamelCase(field.getFieldName());
                field.setFiledUpcaseName(filedUpcaseName);
            }
            //模型层
            codingModel(tableName, codingRuleVo.getPackageName(), fieldList);
            //构建mybatis配置文件
            codingSqlMap(tableName, codingRuleVo.getPackageName(), fieldList);
            //构建dao层
            codingDao(tableName, codingRuleVo.getPackageName(), fieldList);
            //构建service层
            codingService(tableName, codingRuleVo.getPackageName(), fieldList);
            //构建api层(接口)
            codingApi(tableName, codingRuleVo.getPackageName(), fieldList);
//			//构建view层
            vueWebStyleService.codingPage(tableName, codingRuleVo.getVueDir(), fieldList);
        }
        return ResultGenerator.genSuccessResult();
    }

    private  void codingSqlMap(String tableName, String packageName, List<TableField> fieldList) {
        String sqlMapDir=makeFileDir(packageName, "sqlmap", "");
        String modelClass=StringUtil.buildClassName(tableName,"");
        //配置文件
        String sqlMapFilePath=sqlMapDir+File.separator+modelClass+"-sqlmap.xml";
        File sqlMapFile=new File(sqlMapFilePath);
        if(sqlMapFile.exists()){
            sqlMapFile.delete();
        }
        try {
            sqlMapFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",modelClass);
            params.put("beanNameSmall", StringUtil.firstCharLowerCase(modelClass));
            //构建impl文件内容
            String content=FreeMarkerUtil.genFileContent("mybatis.ftl",params);
            //写入文件
            FileUtil.write2File(sqlMapFilePath,content);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    private  void codingApi(String tableName, String packageName, List<TableField> fieldList) {
        //创建目录
        String apiFileDir=makeFileDir(packageName, "api", "");;
        String modelClass=StringUtil.buildClassName(tableName,"");
        //创建接口api文件
        String apiClassName=StringUtil.buildClassName(tableName,"Controller");
        //接口文件
        String apiFilePath=apiFileDir+File.separator+apiClassName+".java";
        File apiFile=new File(apiFilePath);
        if(apiFile.exists()){
            apiFile.delete();
        }
        try {
            apiFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",modelClass);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(modelClass));
            String implContent=FreeMarkerUtil.genFileContent("api.ftl",params);
            //写入文件
            FileUtil.write2File(apiFilePath,implContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private  void codingService(String tableName, String packageName, List<TableField> fieldList) {
        //创建目录
        String modelClass=StringUtil.buildClassName(tableName,"");
        String lowModelClass=StringUtil.firstCharLowerCase(modelClass);
        //目录转小写
        String infFileDir=makeFileDir(packageName, "service", lowModelClass);
        String implFileDir=makeFileDir(packageName, "service", lowModelClass+"/impl");
        //创建接口inf文件
        String infClassName=StringUtil.buildClassName(tableName,"Service");
        String implClassName=StringUtil.buildClassName(tableName,"ServiceImpl");
        //接口文件
        String infFilePath=infFileDir+File.separator+infClassName+".java";
        String implFilePath=implFileDir+File.separator+implClassName+".java";
        File infFile=new File(infFilePath);
        File implFile=new File(implFilePath);
        if(infFile.exists()){
            infFile.delete();
        }
        if(implFile.exists()){
            implFile.delete();
        }
        try {
            infFile.createNewFile();
            implFile.createNewFile();
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",modelClass);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(modelClass));
            params.put("StringUtil",new StringUtil());

            //构建inf文件内容
            String infContent= FreeMarkerUtil.genFileContent("serviceInf.ftl",params);
            //写入文件
            FileUtil.write2File(infFilePath,infContent);
            //构建impl文件内容
            String implContent=FreeMarkerUtil.genFileContent("serviceImpl.ftl",params);;
            //写入文件
            FileUtil.write2File(implFilePath,implContent);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private  void codingDao(String tableName, String packageName,
                                  List<TableField> fieldList) {
        //创建目录
        String modelClass=StringUtil.buildClassName(tableName,"");
        //目录转小写
        String infFileDir=makeFileDir(packageName,"dao", "");
        //创建接口inf文件
        String infClassName=StringUtil.buildClassName(tableName,"Mapper");
        //接口文件
        String infFilePath=infFileDir+File.separator+infClassName+".java";
        File infFile=new File(infFilePath);
        if(infFile.exists()){
            infFile.delete();
        }
        try {
            infFile.createNewFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //构建inf文件内容
        String infContent="";
        try {
            //构建model层
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",modelClass);
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(modelClass));
            infContent=FreeMarkerUtil.genFileContent("mapper.ftl",params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //写入文件
        FileUtil.write2File(infFilePath,infContent);
    }

    /**
     * 创建代码
     * @param tableName
     * @param packageName
     * @param fieldList
     */
    private  void codingModel(String tableName, String packageName, List<TableField> fieldList)  {
        //创建目录
        String filePath=makeFileDir(packageName, "model", "");
        String modelClass=StringUtil.buildClassName(tableName,"");
        //构建文件名
        String className= StringUtil.buildClassName(tableName,"");
        //创建文件
        String fileName=filePath+className+".java";
        File modelFile=new File(fileName);
        if(modelFile.exists()){
            modelFile.delete();
        }
        try {
            modelFile.createNewFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //构建文件内容
        String content="";

        try {
            //构建model层
            Map<String,Object> params=new HashMap<String,Object>();
            params.put("tableName",tableName);
            params.put("packageName",packageName);
            params.put("fieldList",fieldList);
            params.put("beanName",modelClass);
            params.put("StringUtil",new StringUtil());
            params.put("beanNameSmall",StringUtil.firstCharLowerCase(modelClass));
            content=FreeMarkerUtil.genFileContent("model.ftl",params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //写入文件
        FileUtil.write2File(fileName,content);

    }

    /**
     * 清理代码包
     */
    public   void clearUncorrelatedCode() {
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        String path = "";
        String zipPath = "";
        if (os.startsWith("win") || os.startsWith("Win")) {
            //windows目录
            path = ServiceConstant.windowsPath;
            zipPath = ServiceConstant.downloadWindowsPath;
        } else {
            //linux 目录
            path = ServiceConstant.codingRootDir;
            zipPath = ServiceConstant.downloadLinuxPath;
        }
        //删除原文件
        FileUtil.deleteDir(new File(path));
        FileUtil.deleteDir(new File(zipPath));
    }

    public  String makeFileDir(String packageName ,String moudle,String childrenDir){

        String[] dir=packageName.split("\\.");
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        String path="";

        if("model".equals(moudle)){
            //模型
            path=ServiceConstant.codingRootDir+"pluss-model-bundle/src/main/java";
        }else if ("dao".equals(moudle)){
            //dao
            path=ServiceConstant.codingRootDir+"pluss-dao-bundle/src/main/java";
        }else if ("sqlmap".equals(moudle)){
            //dao
            path=ServiceConstant.codingRootDir+"pluss-dao-bundle/src/main/resources/mybatis/mapper";
        } else if ("service".equals(moudle)){
            //service
            path=ServiceConstant.codingRootDir+"pluss-service-bundle/src/main/java";

        }else if ("api".equals(moudle)){
            //dao
            path=ServiceConstant.codingRootDir+"pluss-api-page/src/main/java";
        }

        String filePath=path+File.separator;
        for (int i = 0; i < dir.length; i++) {
            filePath+=dir[i]+File.separator;
        }
        if("model".equals(moudle)) {
            filePath=filePath+moudle+File.separator+"entity"+File.separator;
        }else if ("dao".equals(moudle)) {
            filePath=filePath+File.separator+"mapper"+File.separator;
        }else if ("service".equals(moudle)) {
            filePath=filePath+moudle+File.separator+childrenDir;
        }else if ("api".equals(moudle)) {
            filePath=filePath+"controller"+File.separator;
        }else if ("sqlmap".equals(moudle)){
            filePath=path;
        }

        File file=new File(filePath);
        if(!file.exists()){
            //创建目录
            file.mkdirs();
        }
        return filePath;
    }
}
