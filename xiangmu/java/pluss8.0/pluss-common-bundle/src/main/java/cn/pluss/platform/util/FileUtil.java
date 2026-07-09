package cn.pluss.platform.util;


import cn.pluss.platform.constants.ServiceConstant;

import java.io.*;
import java.util.Properties;

/**
 * 
 * @author liys
 * 2016-4-22 17:35
 *
 */
public class FileUtil {

	/**
	 * 生产html文件
	 * 
	 *            String
	 * @throws Exception
	 */
	public static String writeFile(String filepath, String filename, String content)
			throws Exception {
		PrintWriter out = null;
		String fileString = "";
		String dir = filepath;
		File dirs = new File(dir);
		dirs.mkdirs();
		String dataFile = filepath + File.separator + filename + ".html";

		File f = new File(dataFile);
		if (f.exists()) {
			f.delete();
		}
		try {
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
			BufferedWriter writer = new BufferedWriter(write, 1024 * 1024);
			out = new PrintWriter(writer, true);
			out.println(content);
			out.flush();
			write.close();
			writer.close();
			out.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
		fileString = dataFile;
		return fileString;
	}
	/**
	 * 将内容写入文件
	 * @param file
	 * @param content
	 */
	public static void write2File(String file,String content){
		try {
			PrintWriter out = null;
			File f = new File(file);
			if (!f.exists()) {
				f.createNewFile();
			}
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
			BufferedWriter writer = new BufferedWriter(write, 1024 * 1024);
			out = new PrintWriter(writer, true);
			out.println(content);
			out.flush();
			write.close();
			writer.close();
			out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	/**
     * 递归删除目录下的所有文件及子目录下所有文件
     * @param dir 将要删除的文件目录
     * @return boolean Returns "true" if all deletions were successful.
     *                 If a deletion fails, the method stops attempting to
     *                 delete and returns "false".
     */
	public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }
	/**
	 * 创建页面存放目录
	 * @param packageName
	 * @return
	 */
	public static String makePageFileDir(String packageName,String tableName) {
		
		String[] dir=packageName.split("\\.");
		   Properties prop = System.getProperties();
	        String os = prop.getProperty("os.name");
	    	String path="";
	        if(os.startsWith("win") || os.startsWith("Win")){
	        	//windows目录
	        	path= ServiceConstant.windowsPath;
	        }else{
	        	//linux 目录
	        	path= ServiceConstant.codingRootDir;
	        }
	
		String filePath=path+File.separator;
		for (int i = 0; i < dir.length; i++) {
			filePath+=dir[i]+File.separator;
		}
		filePath=filePath+"pages"+File.separator+StringUtil.firstCharLowerCase(StringUtil.buildClassName(tableName,""))+File.separator;
		File file=new File(filePath);
		if(!file.exists()){
			//创建目录
			file.mkdirs();
		}
		
	
		return filePath;
	}
	/**
	 * 创建页面存放目录
	 * @param packageName
	 * @return
	 */
	public static String makeVuePageFileDir(String packageName,String tableName) {

		packageName=packageName+File.separator+StringUtil.firstCharLowerCase(StringUtil.buildClassName(tableName,""))+File.separator;
		File file=new File(packageName);
		if(!file.exists()){
			//创建目录
			file.mkdirs();
		}
		return packageName;
	}


	/**
	 * 创建页面存放目录
	 * @param packageName
	 * @return
	 */
	public static String makeVueDir(String packageName) {

		File file=new File(packageName);
		if(!file.exists()){
			//创建目录
			file.mkdirs();
		}
		return packageName;
	}


	/**
	 * 根据模块创建目录
	 * @param packageName
	 * @return
	 */
	public static  String makeApiFileDir(String packageName){
		
		String[] dir=packageName.split("\\.");
		   Properties prop = System.getProperties();
	        String os = prop.getProperty("os.name");
	    	String path="";
	        if(os.startsWith("win") || os.startsWith("Win")){
	        	//windows目录
	        	path=ServiceConstant.windowsPath;
	        }else{
	        	//linux 目录
	        	path=ServiceConstant.codingRootDir;
	        }
	
		String filePath=path+File.separator;
		for (int i = 0; i < dir.length; i++) {
			filePath+=dir[i]+File.separator;
		}
		filePath=filePath+"api"+File.separator+"impl"+File.separator;
		File file=new File(filePath);
		if(!file.exists()){
			//创建目录
			file.mkdirs();
		}
		
	
		return filePath;
	}
}
