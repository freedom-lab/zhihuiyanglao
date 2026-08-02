package cn.pluss.platform.base.controller.coding;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.constants.ServiceConstant;
import cn.pluss.platform.model.coding.Connection;
import cn.pluss.platform.model.vo.CodingRuleVo;
import cn.pluss.platform.base.coding.srobot.inf.CodingRobotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;
import java.util.Properties;

@RestController
@RequestMapping("/srobot")
@Api(value = "代码生成器控制类",tags={"代码生成器-接口"})
public class SrobotController {

    @Resource
    public CodingRobotService codingRobotService;
    @Value("${spring.datasource.url}")
    public String dbUrl;

    @Value("${spring.datasource.username}")
    public String username;
    @Value("${spring.datasource.password}")
    public String password;
    /**
     * 生产代码
     * @return
     */
    @RequestMapping(value = "/action")
    @ApiOperation(value = "表单代码生成",notes = "表单代码生成",httpMethod = "POST")
    private Result action(@RequestBody CodingRuleVo codingRuleVo){
        try {
            System.out.println("dbUrl:"+dbUrl);
            //获取服务器ip 端口 数据库名称
            String ip=getDbInfo("ip");
            String port=getDbInfo("port");
            String dbName=getDbInfo("db");
            //修改代码存储目录
            ServiceConstant.codingRootDir=codingRuleVo.getSpringbootDir();
            Connection con=new Connection(ip,port,dbName,username,password,"mysql","vue");
            codingRuleVo.setWebStyle("vue");
            codingRuleVo.setCon(con);
            return codingRobotService.coding(codingRuleVo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult("系统异常，请联系管理员!");
        }
    }
    /**
     * 生产代码
     * @return
     */
    @RequestMapping(value = "/springBootDir")
    @ApiOperation(value = "springBoot代码生成位置",notes = "springBoot代码生成位置",httpMethod = "POST")
    private Result springBootDir(){
        String path=  this.getClass().getResource("/").getPath();
        //处理成项目根目录
        String rootPath="";
        String[] filePath= {};
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        if(os.startsWith("win") || os.startsWith("Win")){
            //windows处理
            path = path.replaceFirst("/","");
            filePath = path.split("/");
        }else{
            filePath = path.split(File.separator);
        }
        for (int i = 0; i < filePath.length; i++) {
            if(i<filePath.length-3){
                rootPath+=filePath[i]+"/";
            }
        }
        return ResultGenerator.genSuccessResult(rootPath);
    }

    /**
     * 根据dburl 获取对于的数据库信息
     * @param key
     * @return
     */
    public String getDbInfo(String key){

        String value="";
        String keyInfo=dbUrl.split("\\?")[0];
       String[]  dbInfoArray=keyInfo.split("\\/");
        String[] keyArray=dbInfoArray[2].split(":");
        if("ip".equals(key)){
            value=keyArray[0];
        }else if("port".equals(key)){
            value=keyArray[1];
        }else if("db".equals(key)){
            value=dbInfoArray[dbInfoArray.length-1];
        }
        return value;
    }


}
