package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Actitime.GenericLib.WebdrivercommonUtils;

public class Home {
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userimg;
	
	WebdrivercommonUtils wLib=new WebdrivercommonUtils();
	
	public void navigatoTaskPage()
	{
		wLib.waitForElementAndClick(taskImg);
	}
	public void navigatouserpage()
	{
		wLib.waitForElementAndClick(userimg);
	}

}


