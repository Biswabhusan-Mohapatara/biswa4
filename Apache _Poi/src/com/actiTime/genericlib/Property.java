package com.actiTime.genericlib;

import java.io.FileReader;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Property {

	public static void main(String[] args) throws Throwable  {
	
	     FileReader fObj=new FileReader("./data/commonData.properties");
	     Properties pObj=new Properties();
	     pObj.load(fObj);
	     
	     String URL=pObj.getProperty("url");
	     String USERNAME=pObj.getProperty("username");
	     String PASSWORD=pObj.getProperty("password");
	     
	    WebDriver driver=new FirefoxDriver();
         driver.get(URL) ;
	     
         System.out.println(USERNAME);
         System.out.println(PASSWORD);
	}


	
}
	

