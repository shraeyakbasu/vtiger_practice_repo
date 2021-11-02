package com.crm.vtiger.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	public static String GetExcelcellvalue(String sheetname,int row,int column) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstant.excelpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	public static void setexcelvalue(String sheetname,String [] value) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstant.excelpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFFont font=wb.createFont();
		XSSFCellStyle style=wb.createCellStyle();
		font.setFontName("Comic Sans MS");
		font.setBold(true);
		style.setFont(font);
		Sheet sh=wb.getSheet(sheetname);
		
		int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		Row firstrow=sh.getRow(0);
		Row newrow=sh.createRow(rowcount+1);
		
		for(int j=0;j<firstrow.getLastCellNum();j++)
		{
			Cell newcell=newrow.createCell(j);
			newcell.setCellValue(value[j]);
			newcell.setCellStyle(style);
		}
		
		FileOutputStream fos=new FileOutputStream(AutoConstant.excelpath);
		wb.write(fos);
		fos.close();
		
	}
	
	

}
