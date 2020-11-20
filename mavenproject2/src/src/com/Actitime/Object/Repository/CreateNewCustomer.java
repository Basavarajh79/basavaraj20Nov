package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Actitime.GenericLib.WebdrivercommonUtils;

public class CreateNewCustomer {

	WebdrivercommonUtils wlib=new WebdrivercommonUtils();
	
	@FindBy(id="customerLightBox_nameField")private WebElement CustomerNameEdt;
	
	@FindBy(id="customerLightBox_descriptionField")private WebElement CustDescEdt;
	
	@FindBy(xpath="//body[1]/div[6]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]")
	private WebElement createCustButton;
	public void createCustomerTest(String name,String Desc) {
		CustomerNameEdt.sendKeys(name,Desc);
		wlib.waitForElementAndClick(createCustButton);
	}
	
}
