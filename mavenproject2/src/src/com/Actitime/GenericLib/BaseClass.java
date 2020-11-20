package com.Actitime.GenericLib;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Actitime.Object.Repository.Common;
import com.Actitime.Object.Repository.Login;

public class BaseClass {

	public static WebDriver driver;
	FileDataUtils file=new FileDataUtils();
	WebdrivercommonUtils wLib=new WebdrivercommonUtils();
	
	
	@BeforeClass
	public void configBC() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void configBM() throws IOException {
		Properties pObject=file.GetPropertiesFileObj();
		wLib.wiatForPageLoad();
		driver.manage().window().maximize();
		String url=pObject.getProperty("url");
		driver.get(url);
		Login login=PageFactory.initElements(driver, Login.class);
		String username=pObject.getProperty("username");
		String password=pObject.getProperty("password");
		login.login();
		
	}
	@AfterMethod
	public void configAM() {
		Common lout=PageFactory.initElements(driver, Common.class);
		lout.logOut();
		
	}@AfterClass
	public void configAC() {
		driver.close();
		
	}
}
