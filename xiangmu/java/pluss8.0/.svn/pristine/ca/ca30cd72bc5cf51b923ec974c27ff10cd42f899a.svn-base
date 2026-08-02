package cn.pluss.platform.base.controller.upload;

import cn.pluss.platform.api.Result;
import cn.pluss.platform.api.ResultGenerator;
import cn.pluss.platform.base.BaseController;
import cn.pluss.platform.model.vo.Images;
import cn.pluss.platform.model.vo.MergeFileVo;
import cn.pluss.platform.base.auth.systemConfig.SystemConfigService;
import cn.pluss.platform.util.Base64Util;
import cn.pluss.platform.util.StringUtil;
import cn.pluss.platform.util.SystemConfigUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;


@RestController
@RequestMapping("/upload")
@Api(value = "上传控制类",tags={"上传文件-接口"})
public class UploadController extends BaseController{
	private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private SystemConfigService systemConfigService;

	/**
	 * 文件合并
	 * @return
	 */
	@PostMapping("/merge")
	@ApiOperation(value = "切片文件合并",notes = "切片文件合并",httpMethod = "POST")
	public Result merge(@RequestBody MergeFileVo mergeFileVo) {
		// TODO Auto-generated method stub
		String fileName=null;
		String savePath= SystemConfigUtil.getSingleProperty("upload_save_path").getPropertyValue();
		String visitPath=SystemConfigUtil.getSingleProperty("upload_visit_path").getPropertyValue();
		String visitUrl="";

		try {

			Properties prop = System.getProperties();
			String os = prop.getProperty("os.name");
			if(os.startsWith("win") || os.startsWith("Win")){
				//windows目录
				//visit="http://47.104.80.72/resources/manage/images/redsign";
				savePath="E:\\images";
			}
			if(os.startsWith("Mac") || os.startsWith("mac")){
				//windows目录
				savePath="/Users/liyongsheng/Documents/workspaces/ws_java/ws_yunlan_im/java/pluss-api-page/target";
			}
			//最终文件位置
			String fileNames[] = mergeFileVo.getTargetFileName().split("\\.");
			fileName = UUID.randomUUID().toString() + "." + fileNames[fileNames.length - 1];
			//创建最终文件
			File destTempFile = new File(savePath, fileName);
			for (String sectionFile:mergeFileVo.getSections()) {
				File partFile = new File(savePath, sectionFile);
				FileOutputStream destTempfos = new FileOutputStream(destTempFile, true);
				FileUtils.copyFile(partFile, destTempfos);
				destTempfos.close();
			}
			//删除临时文件
			for (String sectionFile:mergeFileVo.getSections()) {
				File partFile = new File(savePath, sectionFile);
				partFile.delete();
			}
			visitUrl=visitPath+File.separator+fileName;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultGenerator.genFailResult("上传文件错误");
		}
		Map<String ,String> res=new HashMap<>();
		res.put("visitUrl",visitUrl);
		return ResultGenerator.genSuccessResult(res);
	}


	@PostMapping(value = "/uploadFile")
	@ApiOperation(value = "上传文件，支持切片上传",notes = "文件上传接口，支持切片上传",httpMethod = "POST")
	public Result uploadFile(@RequestBody MultipartFile file) throws IOException{
		FileOutputStream fos = null;
		FileInputStream fis= null;
		// 保存文件名称
		String name = file.getOriginalFilename();
		String suffixName = name.substring(name.lastIndexOf("."));//获取后缀名
		String fileName="file_"+StringUtil.getBillno()+suffixName;
		String uploadPath=systemConfigService.querySystemConfigValue("upload_save_path");
		String visitPath=systemConfigService.querySystemConfigValue("upload_visit_path");
		Properties prop = System.getProperties();
		String os = prop.getProperty("os.name");
		if(os.startsWith("win") || os.startsWith("Win")){
			// windows目录
			//uploadPath = "F:/wmq/shoumaiji/pluss4.0/pluss-manage-page/src/main/resources/static/resources/images/upload";// 测试
			uploadPath="D:/images";
		}
		if(os.startsWith("Mac") || os.startsWith("mac")){
			//windows目录
			uploadPath="/Users/liyongsheng/Documents/workspaces/ws_java/ws_yunlan_im/java/pluss-api-page/target";
		}
		String path=uploadPath+"/"+fileName;
		String suc;
		InputStream ins = file.getInputStream();
		File   f=new File(file.getOriginalFilename());
		try {

			inputStreamToFile(ins, f);
			fis=new FileInputStream(f);
			fos = new FileOutputStream(new File(path));
			byte[] strByte  =new byte[(int) f.length()];
			// 生成文件
			while(fis.read(strByte)!=-1){
				String str1=new String(strByte);
				fos.write(strByte);
			}
			fos.flush();
			suc="1";
			path = visitPath + "/" + fileName;// 测试
			// 访问路劲
			
			if(os.startsWith("win") || os.startsWith("Win")){
				// windows目录
				path = "http://192.168.1.8" + "/" + fileName;// 测试
			}
		} catch (Exception e) {
			suc="0";
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try { fos.close(); } catch (IOException e) {}
			}
			if(fis!=null){
				fis.close();				
			}
			f.delete();
		}
		// 返回保存结果
		Map<String, Object> result=new HashMap<String, Object>();
		result.put("result", suc);
		result.put("url", path);;
		result.put("fileName", fileName);
		return ResultGenerator.genSuccessResult(result);
	}
	
	public static void inputStreamToFile(InputStream ins,File file) {  
	      try {  
	       OutputStream os = new FileOutputStream(file);  
	       int bytesRead = 0;  
	       byte[] buffer = new byte[8192];  
	       while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {  
	        os.write(buffer, 0, bytesRead);  
	       }  
	       os.close();  
	       ins.close();  
	      } catch (Exception e) {  
	       e.printStackTrace();  
	      }  
	     }

	//单个小文件发送
	@PostMapping("/sendFile")
	@ApiOperation(value = "单个小文件传输接口",notes = "base64码和用户code",httpMethod = "POST")
	public Result sendFile(@RequestBody Images images) {
		// TODO Auto-generated method stub
		String fileName=null;
		String name=null;

		String savePath= SystemConfigUtil.getSingleProperty("upload_save_path").getPropertyValue();
		String visitPath=SystemConfigUtil.getSingleProperty("upload_visit_path").getPropertyValue();
		String picUrl="";
		try {

			Properties prop = System.getProperties();
			String os = prop.getProperty("os.name");
			if(os.startsWith("win") || os.startsWith("Win")){
				//windows目录
				//visit="http://47.104.80.72/resources/manage/images/redsign";
				savePath="E:\\images";
			}
			name= UUID.randomUUID()+StringUtil.getBillno();
			System.out.println("visit:"+visitPath);
			fileName=savePath+"/"+name+"."+images.getFileName();
			System.out.println("fileName:"+fileName);
			Base64Util.decoderBase64File(images.getBase64(), fileName);

			picUrl=visitPath+"/"+name+"."+images.getFileName();
//					System.out.println(images.getUserCode());
			// 访问路劲

			if(os.startsWith("win") || os.startsWith("Win")){
				// windows目录
				visitPath = "http://127.0.0.1" + "/" + fileName;// 测试
				//path = "http://127.0.0.1:8083/resources/manage/upload" + "/" + fileName;// 测试
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultGenerator.genFailResult("上传文件错误");
		}
		Map<String ,String> res=new HashMap<>();
		res.put("obj",picUrl);
		return ResultGenerator.genSuccessResult(res);
	}

}
