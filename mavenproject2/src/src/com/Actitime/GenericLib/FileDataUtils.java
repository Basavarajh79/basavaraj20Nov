package com.Actitime.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileDataUtils {

	String filepath="C:\\Users\\HP\\eclipse-workspace1\\ActiTimeSeleniumFramework\\TestData.properties";
	String excelpath="C:\\Users\\HP\\eclipse-workspace1\\ActiTimeSeleniumFramework\\testdata.xlsx";
	
	
	public String getGetExcelData(String sheetname,int colNum,int rowNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(colNum).getStringCellValue();
		return data;
	}
	public Properties GetPropertiesFileObj() throws IOException {
		FileInputStream fis=new FileInputStream(filepath);
		Properties Pobj=new Properties();
		Pobj.load(fis);
		return Pobj;
	}
}
