package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Actitime.GenericLib.WebdrivercommonUtils;

public class Task {

	WebdrivercommonUtils wLib=new WebdrivercommonUtils();
	@FindBy(xpath="//div[text()='Add New']")
    private WebElement Addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
    private WebElement NewCucstomerbtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement addprojectbtn;
	
	public void navigatetocustomerpage()
	{
		Addnewbtn.click();
		NewCucstomerbtn.click();
	}
	public void navigatetoAddProjectpage()
	{
		Addnewbtn.click();
		wLib.waitForElementAndClick(addprojectbtn);
		
	}
	
}
