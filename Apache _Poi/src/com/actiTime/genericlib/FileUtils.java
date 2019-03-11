package com.actiTime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
    String filepath="./data/commonData.properties";
	String excelpath="./data/testData.xlxs";
	
	
	public Properties getPropertyFileObject() throws Throwable {
	
	FileInputStream fis=new FileInputStream(filepath);
	Properties pObj=new Properties();
	pObj.load(fis);
	return pObj;
	}
	
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable 
	{
		FileInputStream fis=new FileInputStream(excelpath);
     	Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		String data=sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		return data;
			
    }
	
	public void setExcelData(String sheetName,int rowNum,int cellNum,String data) throws Throwable {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		sh.getRow(rowNum).createCell(cellNum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
	}
	
	
}