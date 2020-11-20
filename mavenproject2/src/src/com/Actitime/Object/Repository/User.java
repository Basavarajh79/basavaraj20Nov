package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Actitime.GenericLib.WebdrivercommonUtils;

public class User {

	WebdrivercommonUtils wlib=new WebdrivercommonUtils();
	
	@FindBy(xpath="//div[contains(text(),'Add User')]")
	private WebElement addUserBtn;
	
	@FindBy(xpath="//input[@id='userDataLightBox_firstNameField']")
	private WebElement Firstnameedt;
	
	@FindBy(xpath="//input[@id='userDataLightBox_emailField']")
	private WebElement EmailEdt;
	
	@FindBy(name="lastName")private
	WebElement lastNameedt;
	
	@FindBy(xpath="//input[@id='userDataLightBox_usernameField']")private
	WebElement username;
	
	@FindBy(xpath="//input[@id='userDataLightBox_passwordField']")private
	WebElement password;
	
	@FindBy(xpath="//input[@id='userDataLightBox_passwordCopyField']")
	private WebElement RetypePassword;
	
	@FindBy(xpath="//div[@id='userDataLightBox_commitBtn']")
	private WebElement createUserBtn;
	
	public void createUser(String Firstnameedt1,String lastNameedt1,String EmailEdt1,String username1,String password1,String RetypePassword1) {
		addUserBtn.click();
		Firstnameedt.sendKeys(Firstnameedt1);
		lastNameedt.sendKeys(lastNameedt1);
		EmailEdt.sendKeys(EmailEdt1);
		username.sendKeys(username1);
		password.sendKeys(password1);
		RetypePassword.sendKeys(RetypePassword1);
		wlib.waitForElementAndClick(createUserBtn);
	}
}
