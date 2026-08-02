package cn.pluss.platform.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;


public class ExportExcelUtil {

    public HSSFWorkbook getHSSFWorkbook(){  
        return new HSSFWorkbook();  
    }  
	
    public HSSFSheet getHSSFSheet(HSSFWorkbook hssfWorkbook, String sheetName){  
        return hssfWorkbook.createSheet(sheetName);  
    }
    //写头
    public void writeHeader(HSSFWorkbook hssfWorkbook,HSSFSheet hssfSheet ,List<Map<String, Object>> headInfoList){  
        HSSFCellStyle cs = hssfWorkbook.createCellStyle();  
        HSSFFont font = hssfWorkbook.createFont();  
        font.setFontHeightInPoints((short)12);  
        font.setBoldweight(font.BOLDWEIGHT_BOLD);  
        cs.setFont(font);  
        cs.setAlignment(cs.ALIGN_CENTER);  
  
        HSSFRow r = hssfSheet.createRow(0);  
        r.setHeight((short) 380);  
        HSSFCell c = null;  
        Map<String, Object> headInfo = null;  
        //处理excel表头  
        for(int i=0, len = headInfoList.size(); i < len; i++){  
            headInfo = headInfoList.get(i);  
            c = r.createCell(i);  
            c.setCellValue(headInfo.get("title").toString());  
            c.setCellStyle(cs);  
            if(headInfo.containsKey("columnWidth")){  
                hssfSheet.setColumnWidth(i, (short)(((Integer)headInfo.get("columnWidth") * 8) / ((double) 1 / 20)));  
            }  
        }  
    }  
    //写体
	public void writeContent(HSSFWorkbook hssfWorkbook, HSSFSheet hssfSheet, int startIndex,
			List<Map<String, Object>> headInfoList, List<Map<String, Object>> dataList) {
		Map<String, Object> headInfo = null;
		HSSFRow r = null;
		HSSFCell c = null;
		//处理数据  
		Map<String, Object> dataItem = null;
		Object v = null;
		for (int i = 0, rownum = startIndex, len = (startIndex + dataList.size()); rownum < len; i++, rownum++) {
			r = hssfSheet.createRow(rownum);
			r.setHeightInPoints(16);
			dataItem = dataList.get(i);
			for (int j = 0, jlen = headInfoList.size(); j < jlen; j++) {
				headInfo = headInfoList.get(j);
				c = r.createCell(j);
				v = dataItem.get(headInfo.get("dataKey").toString());

				if (v instanceof String) {
					c.setCellValue((String) v);
				} else if (v instanceof Boolean) {
					c.setCellValue((Boolean) v);
				} else if (v instanceof Calendar) {
					c.setCellValue((Calendar) v);
				} else if (v instanceof Double) {
					c.setCellValue((Double) v);
				} else if (v instanceof Integer || v instanceof Long || v instanceof Short || v instanceof Float) {
					c.setCellValue(Double.parseDouble(v.toString()));
				} else if (v instanceof HSSFRichTextString) {
					c.setCellValue((HSSFRichTextString) v);
				} else {
					c.setCellValue(v.toString());
				}
			}
		}
	}
	//
	public void write2FilePath(HSSFWorkbook hssfWorkbook, String filePath) throws IOException{  
        FileOutputStream fileOut = null;  
        try{  
            fileOut = new FileOutputStream(filePath);  
            hssfWorkbook.write(fileOut);  
            Properties prop = System.getProperties();
            String os = prop.getProperty("os.name");
            if(os.startsWith("win") || os.startsWith("Win")){
            }else {
            	Runtime.getRuntime().exec("chmod -R 777 /home/pluss/resources/");
            }
        
        }finally{  
            if(fileOut != null){  
                fileOut.close();  
            }  
        }  
    }  
	//导出文件
	 public static void exportExcel2FilePath(String sheetName, String filePath,  
             List<Map<String, Object>> headInfoList,  
             List<Map<String, Object>> dataList) throws IOException {  
		 ExportExcelUtil poiUtil = new ExportExcelUtil();  
		 //1.创建 Workbook  
		 HSSFWorkbook hssfWorkbook = poiUtil.getHSSFWorkbook();  
		 //2.创建 Sheet  
		 HSSFSheet hssfSheet = poiUtil.getHSSFSheet(hssfWorkbook, sheetName);  
		 //3.写入 head  
		 poiUtil.writeHeader(hssfWorkbook, hssfSheet, headInfoList);  
		 //4.写入内容  
		 poiUtil.writeContent(hssfWorkbook, hssfSheet, 1, headInfoList, dataList);  
		 //5.保存文件到filePath中  
		 poiUtil.write2FilePath(hssfWorkbook, filePath);  
	 }  
	 

	 public static void exportExcelFilePath(String sheetName, String filePath,  
			 List<String> headInfoList,  
			 ArrayList<ArrayList<String>> dataList) throws IOException {  
		 ExportExcelUtil poiUtil = new ExportExcelUtil();  
		 //1.创建 Workbook  
		 HSSFWorkbook hssfWorkbook = poiUtil.getHSSFWorkbook();  
		 //2.创建 Sheet  
		 HSSFSheet hssfSheet = poiUtil.getHSSFSheet(hssfWorkbook, sheetName); 
		 
		 hssfSheet.setColumnWidth(0, 10*256);
		 hssfSheet.setColumnWidth(1, 15*256);
		 hssfSheet.setColumnWidth(2, 15*256);
		 hssfSheet.setColumnWidth(3, 15*256);
		 hssfSheet.setColumnWidth(4, 15*256);
		 hssfSheet.setColumnWidth(5, 15*256);
		 hssfSheet.setColumnWidth(6, 15*256);
		 hssfSheet.setColumnWidth(7, 20*256);
		 //3.写入 head  
		 poiUtil.writeHeader2(hssfWorkbook, hssfSheet, headInfoList);  
		 //4.写入内容  
		 poiUtil.writeContent2(hssfWorkbook, hssfSheet, 1, headInfoList, dataList);  
		 //5.保存文件到filePath中  
		 poiUtil.write2FilePath(hssfWorkbook, filePath);  
	 }  

	    //写头
	    public void writeHeader2(HSSFWorkbook hssfWorkbook,HSSFSheet hssfSheet ,List<String> headInfoList){  
	        HSSFCellStyle cs = hssfWorkbook.createCellStyle();  
	        HSSFFont font = hssfWorkbook.createFont();  
	        font.setFontHeightInPoints((short)12);  
	        font.setBoldweight(font.BOLDWEIGHT_BOLD);  
	        cs.setFont(font);  
	        cs.setAlignment(cs.ALIGN_CENTER);  
	        cs.setWrapText(true);   
	        HSSFRow r = hssfSheet.createRow(0);  
	        HSSFCell c = null;  
	        
	        //处理excel表头  
	        for(int i=0 ; i <  headInfoList.size() ; i++){ 
	            c = r.createCell(i);  
	            c.setCellValue(headInfoList.get(i).toString());  
	            c.setCellStyle(cs);  
	        }  
	    }  
	    //写体
		public void writeContent2(HSSFWorkbook hssfWorkbook, HSSFSheet hssfSheet, int startIndex,
				List<String> headInfoList, ArrayList<ArrayList<String>> dataList) {
			HSSFCellStyle cellStyle=hssfWorkbook.createCellStyle();  
			cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
			cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);//垂直居中  
			cellStyle.setWrapText(true);   
			String headInfo = null;
			HSSFRow r = null;
			HSSFCell c = null;
			//处理数据  
			List<String> dataItem = null;
			Object v = null;
			for (int i = 0, rownum = startIndex, len = (startIndex + dataList.size()); rownum < len; i++, rownum++) {
				r = hssfSheet.createRow(rownum);
				r.setHeight((short) (4*256));
				dataItem = dataList.get(i);
				for (int j = 0, jlen = dataItem.size(); j < jlen; j++) {
					
					headInfo = headInfoList.get(j);
					c = r.createCell(j);
					c.setCellStyle(cellStyle);  
					v = dataItem.get(j);
					if(StringUtil.isEmpty(dataItem.get(j))) {
						v="--";
					}
					if (v instanceof String) {
						c.setCellValue((String) v);
					} else if (v instanceof Boolean) {
						c.setCellValue((Boolean) v);
					} else if (v instanceof Calendar) {
						c.setCellValue((Calendar) v);
					} else if (v instanceof Double) {
						c.setCellValue((Double) v);
					} else if (v instanceof Integer || v instanceof Long || v instanceof Short || v instanceof Float) {
						c.setCellValue(Double.parseDouble(v.toString()));
					} else if (v instanceof HSSFRichTextString) {
						c.setCellValue((HSSFRichTextString) v);
					} else {
						c.setCellValue(v.toString());
					}
				}
			}
		}
}  
