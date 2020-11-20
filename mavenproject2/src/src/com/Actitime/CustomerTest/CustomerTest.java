package com.Actitime.CustomerTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Actitime.GenericLib.BaseClass;
import com.Actitime.GenericLib.FileDataUtils;
import com.Actitime.GenericLib.WebdrivercommonUtils;
import com.Actitime.Object.Repository.CreateNewCustomer;
import com.Actitime.Object.Repository.Home;
import com.Actitime.Object.Repository.Task;

public class CustomerTest extends BaseClass {

    FileDataUtils file=new FileDataUtils();
    WebdrivercommonUtils wLib=new WebdrivercommonUtils();
    @Test
    public void createcustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
    	String custName=file.getGetExcelData("Sheet1", 1, 1);
    	String Desc=file.getGetExcelData("Sheet1", 4, 2);
    	System.out.println(Desc);
    	System.out.println(custName);
    	Home home=PageFactory.initElements(BaseClass.driver, Home.class);
    	home.navigatoTaskPage();
    	Task task=PageFactory.initElements(BaseClass.driver, Task.class);
    	task.navigatetocustomerpage();
    	CreateNewCustomer createCust=PageFactory.initElements(BaseClass.driver, CreateNewCustomer.class);
    	createCust.createCustomerTest(custName, Desc);
    }
    @Test
    public void createcustomerTest1() throws EncryptedDocumentException, InvalidFormatException, IOException {
    	String custName=file.getGetExcelData("Sheet1", 1, 5);
    	String Desc=file.getGetExcelData("Sheet1", 4, 6);
    	System.out.println(Desc);
    	System.out.println(custName);
    	Home home=PageFactory.initElements(BaseClass.driver, Home.class);
    	home.navigatoTaskPage();
    	Task task=PageFactory.initElements(BaseClass.driver, Task.class);
    	task.navigatetocustomerpage();
    	CreateNewCustomer createCust=PageFactory.initElements(BaseClass.driver, CreateNewCustomer.class);
    	createCust.createCustomerTest(custName, Desc);
    }
    
}
