package com.actiTime.genericlib;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class CreateCustomer {

	public static void main(String[] args) throws Throwable {
		
		FileUtils flib=new FileUtils();
		
		/*read commondata from properties file*/
		Properties pObj=flib.getPropertyFileObject();
		String URL=pObj.getProperty("url");
		String USERNAME=pObj.getProperty("username");
		String PASSWORD=pObj.getProperty("password");
		
		/*read data from excel*/
		String customerName=flib.getExcelData("Sheet1", 1, 2);
		
		WebDriver driver=new FirefoxDriver();
		driver.get(URL);
		
	}

}
