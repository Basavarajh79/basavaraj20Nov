package com.Actitime.Object.Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Actitime.GenericLib.WebdrivercommonUtils;

public class Common {

	WebdrivercommonUtils wlib=new WebdrivercommonUtils();
	
	@FindBy(id="logoutLink")private WebElement logoutLink;
	
	public void logOut() {
		wlib.waitForElementAndClick(logoutLink);
	}
}
