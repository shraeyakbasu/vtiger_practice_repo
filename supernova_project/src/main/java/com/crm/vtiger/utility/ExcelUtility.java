package com.crm.vtiger.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	public String GetExcelcellvalue(String sheetname,int row,int column) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/vtiger.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}

}
