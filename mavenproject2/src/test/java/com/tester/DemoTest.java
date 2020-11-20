package com.tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test
	public void test1()
	{
		System.out.println("executing test1");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println("launched successfully");
		driver.close();
	}
	@Test
	public void test2()
	{
		System.out.println("executing test2");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println("launched successfully");
		driver.close();
	}

}
