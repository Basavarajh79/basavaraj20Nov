package com.Actitime.userTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Actitime.GenericLib.BaseClass;
import com.Actitime.GenericLib.FileDataUtils;
import com.Actitime.GenericLib.WebdrivercommonUtils;
import com.Actitime.Object.Repository.Home;
import com.Actitime.Object.Repository.User;

public class UserTest extends BaseClass{

	
	FileDataUtils file=new FileDataUtils();
	WebdrivercommonUtils wlib=new WebdrivercommonUtils();
	
	//@Test
	public void CreateUserTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String fname=file.getGetExcelData("Sheet2", 1, 1);
		String lname=file.getGetExcelData("Sheet2", 2, 1);
		String email=file.getGetExcelData("Sheet2", 3, 1);
		String username=file.getGetExcelData("Sheet2", 4, 1);
		String password=file.getGetExcelData("Sheet2", 5, 1);
		Home home=PageFactory.initElements(BaseClass.driver, Home.class);
		User user=PageFactory.initElements(BaseClass.driver, User.class);
		home.navigatouserpage();
		user.createUser(fname, lname, email, username, password, password);
	    
	}
	@Test
	public void CreateUserTest2() throws EncryptedDocumentException, InvalidFormatException, IOException {
		String fname=file.getGetExcelData("Sheet2", 1, 5);
		String lname=file.getGetExcelData("Sheet2", 2, 5);
		String email=file.getGetExcelData("Sheet2", 3, 5);
		String username=file.getGetExcelData("Sheet2", 4, 5);
		String password=file.getGetExcelData("Sheet2", 5, 5);
		Home home=PageFactory.initElements(BaseClass.driver, Home.class);
		User user=PageFactory.initElements(BaseClass.driver, User.class);
		home.navigatouserpage();
		user.createUser(fname, lname, email, username, password, password);
	    
	}
	
}
