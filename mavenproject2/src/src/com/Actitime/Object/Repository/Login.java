package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(name="username") private WebElement userid;
	
	@FindBy(name="pwd") private WebElement passwordedt;
	
	@FindBy(id="loginButton") private WebElement loginBtn;
	

	public void login() {
		userid.sendKeys("admin");
		passwordedt.sendKeys("manager");
		loginBtn.click();
	}
	
	public void login(String username,String password) {
		userid.sendKeys(username);
		passwordedt.sendKeys(password);
		loginBtn.click();
	}
}

