package com.Practice.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class cartTest {
@Test(dataProvider="getData")
public void addToCartTest(String data,String product){
	System.out.println("Cataguary="+data       +"Product="+product);
}
  
    @DataProvider
    public Object[][] getData(){
    	Object[][] objArr=new Object[5][2];
    	objArr[0][0]="mobile";
    	objArr[0][1]="Iphone-6";
    	objArr[1][0]="mobile";
    	objArr[1][1]="Iphone-7";
    	objArr[2][0]="mobile";
    	objArr[2][1]="Sasung";
    	objArr[3][0]="mobile";
    	objArr[3][1]="OnePlus Nord";
    	objArr[4][0]="mobile";
    	objArr[4][1]="OnePlus";
    	return objArr;
    }
}
