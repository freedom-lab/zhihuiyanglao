package cn.pluss.platform.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtil {
    
	public static List<HashMap<String, Object>> readExcelXLSX(String filepath, int startrow, int startcol, int sheetnum) {
		List<HashMap<String, Object>> varList = new ArrayList<HashMap<String, Object>>();

		try {
			File target = new File(filepath);
			FileInputStream fi = new FileInputStream(target);
			HSSFWorkbook wb = new HSSFWorkbook(fi);
			HSSFSheet sheet = wb.getSheetAt(sheetnum); 					//sheet 从0开始
			int rowNum = sheet.getLastRowNum() + 1; 					//取得最后一行的行号

			for (int i = startrow; i < rowNum; i++) {					//行循环开始
				
				HashMap<String, Object> hashMap=new HashMap<String, Object>();
				HSSFRow row = sheet.getRow(i); 							//行
				int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置
				if(isRowEmpty(row)) {
					break;
				}
				for (int j = startcol; j < cellNum; j++) {				//列循环开始
					
					HSSFCell cell = row.getCell(j);  
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { 	// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							cell.setCellType(1);//强转成字符串
							cellValue = cell.getStringCellValue();																			
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = NumberToTextConverter.toText(cell.getNumericCellValue());
							break;   
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}
					
					hashMap.put("var"+j, cellValue);
					
				}
				varList.add(hashMap);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		return varList;
	}
	
	public static List<HashMap<String, Object>> readExcelXLS(String filepath, int startrow, int startcol, int sheetnum) {
		List<HashMap<String, Object>> varList = new ArrayList<HashMap<String, Object>>();
		
		try {
			File target = new File(filepath);
			FileInputStream fi = new FileInputStream(target);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sheet = wb.getSheetAt(sheetnum); 					//sheet 从0开始
			int rowNum = sheet.getLastRowNum() + 1; 					//取得最后一行的行号
			
			for (int i = startrow; i < rowNum; i++) {					//行循环开始
				
				HashMap<String, Object> hashMap=new HashMap<String, Object>();
				XSSFRow row = sheet.getRow(i); 							//行
				int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置
				if(isRowEmpty(row)) {
					break;
				}
				for (int j = startcol; j < cellNum; j++) {				//列循环开始
					
					XSSFCell cell = row.getCell(j);  
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { 	// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							cell.setCellType(1);//强转成字符串
							cellValue = cell.getStringCellValue();																			
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = NumberToTextConverter.toText(cell.getNumericCellValue());
							break;   
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}
					
					hashMap.put("var"+j, cellValue);
					
				}
				varList.add(hashMap);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return varList;
	}
	
	public static List<HashMap<String, Object>> readNewExcelXLS(String filepath, int startrow, int startcol, int sheetnum) {
		List<HashMap<String, Object>> varList = new ArrayList<HashMap<String, Object>>();
		
		try {
			File target = new File(filepath);
			FileInputStream fi = new FileInputStream(target);
			  //将文件的输入流转换成Workbook
		    Workbook wb = WorkbookFactory.create(fi);
		    //获得第一个工作表
		    Sheet sheet = wb.getSheetAt(0);
			
			int rowNum = sheet.getLastRowNum() + 1; 					//取得最后一行的行号
			
			for (int i = startrow; i < rowNum; i++) {					//行循环开始
				
				HashMap<String, Object> hashMap=new HashMap<String, Object>();
				Row row = sheet.getRow(i); 							//行
				int cellNum = row.getLastCellNum(); 					//每行的最后一个单元格位置
				if(isRowEmpty(row)) {
					break;
				}
				for (int j = startcol; j < cellNum; j++) {				//列循环开始
					
					Cell cell = row.getCell(j);  
					String cellValue = null;
					if (null != cell) {
						switch (cell.getCellType()) { 	// 判断excel单元格内容的格式，并对其进行转换，以便插入数据库
						case 0:
							cell.setCellType(1);//强转成字符串
							cellValue = cell.getStringCellValue();																			
							break;
						case 1:
							cellValue = cell.getStringCellValue();
							break;
						case 2:
							cellValue = NumberToTextConverter.toText(cell.getNumericCellValue());
							break;   
						case 3:
							cellValue = "";
							break;
						case 4:
							cellValue = String.valueOf(cell.getBooleanCellValue());
							break;
						case 5:
							cellValue = String.valueOf(cell.getErrorCellValue());
							break;
						}
					} else {
						cellValue = "";
					}
					
					hashMap.put("var"+j, cellValue);
					
				}
				varList.add(hashMap);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return varList;
	}
	
	
	
	//去除EXCEL中的空行**
	public static boolean isRowEmpty(Row row) {
		   for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
		       Cell cell = row.getCell(c);
		       if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
		           return false;

		   }
		   return true;
		}  
	
}
