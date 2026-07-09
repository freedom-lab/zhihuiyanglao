package cn.pluss.platform.util;

import cn.pluss.platform.constants.ServiceConstant;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.StringWriter;
import java.util.Map;
import java.util.Properties;

public class FreeMarkerUtil {

    /**
     * 通过模板文件生成字符串
     * @param templateFileName
     * @param propMap
     * @return
     */
    public static String genFileContent(String templateFileName, Map<String, Object> propMap) throws Exception {
        StringWriter out = new StringWriter();
        Configuration configuration = new Configuration();
        //模板文件的路径
        String root =FreeMarkerUtil.class.getResource("/").getPath()+"templates";

        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        String path="";
        if(!os.startsWith("win")&&! os.startsWith("Mac")&&!os.startsWith("Win")){
            //服务器用配置目录
            root= ServiceConstant.framemarker_ftl_dir;
        }
        System.out.println("root dir:"+root);
        configuration.setDirectoryForTemplateLoading(ResourceUtils.getFile(root));
        //字符集
        configuration.setDefaultEncoding("utf-8");
        //获取模板
        Template template = configuration.getTemplate(templateFileName, "utf-8");

        template.setEncoding("UTF-8");
        template.process(propMap, out);
        return out.getBuffer().toString();
    }
}
