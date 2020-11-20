package com.Actitime.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdrivercommonUtils {

	public void wiatForPageLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForElementToVisible(WebElement element) {
		int count=0;
		while(count<20) {
			try {
				element.isEnabled();
				break;
			}catch(Exception e) {
				count++;
			}}
		}
		public void waitForElementAndClick(WebElement element) {
			int count=0;
			while(count<20) {
				try {
					element.click();;
					break;
				}catch(Exception e) {
					count++;
				}
			}
	}
}
