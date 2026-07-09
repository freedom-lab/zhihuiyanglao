package cn.pluss.platform.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;


public class Base64Util {

	 /**
	  * 将文件转成base64 字符串
	  * @return  *
	  * @throws Exception
	  */

	 public static String encodeBase64File(String path) throws Exception {
	  File file = new File(path);;
	  FileInputStream inputFile = new FileInputStream(file);
	  byte[] buffer = new byte[(int) file.length()];
	  inputFile.read(buffer);
	  inputFile.close();
	  Base64.Encoder encoder = Base64.getEncoder();
	  return  encoder.encodeToString(buffer);

	 }

	 /**
	  * 将base64字符解码保存文件
	  * @param base64Code
	  * @param targetPath
	  * @throws Exception
	  */

	 public static void decoderBase64File(String base64Code, String targetPath)
	   throws Exception {
	 	Base64.Decoder decoder = Base64.getDecoder();
	  byte[] buffer = decoder.decode(base64Code);
	  FileOutputStream out = new FileOutputStream(targetPath);
	  out.write(buffer);
	  out.close();

	 }
	 
	
	 /**
	  * 将base64字符解码保存文件
	  * @param base64Code
	  * @throws Exception
	  */

	 public static String decoderBase64(String base64Code)
	   throws Exception {
		 Base64.Decoder decoder = Base64.getDecoder();
	  return  decoder.decode(base64Code).toString();
	 }

	 /**
	  * 将base64字符保存文本文件
	  * @param base64Code
	  * @param targetPath
	  * @throws Exception
	  */

	 public static void toFile(String base64Code, String targetPath)
	   throws Exception {

	  byte[] buffer = base64Code.getBytes();
	  FileOutputStream out = new FileOutputStream(targetPath);
	  out.write(buffer);
	  out.close();
	 }

	 public static void main(String[] args) {
		  try {
		   String base64Code = encodeBase64File("D:\\Pictures\\1.jpg");
		   System.out.println(base64Code);
		   decoderBase64File(base64Code, "D:/2.png");
		  } catch (Exception e) {
		   e.printStackTrace();
	
		  }
		  byte[] buffer = "bdv2dsds".getBytes();
		 Base64.Encoder encoder = Base64.getEncoder();
		System.out.println(encoder.encode(buffer));
		
		

	 }
}
