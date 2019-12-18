package com.anbtx.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.anbtx.qa.base.TestBase;
import com.anbtx.qa.pages.BasicDetails;

public class BasicDetailsPage extends TestBase {
	BasicDetails basicdetials;

	public BasicDetailsPage() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		basicdetials = new BasicDetails();
	}

	@Test
	public void basicdetialstitletest() {
		String title = basicdetials.validatepagetitle();
		Assert.assertEquals(title, "American National Bank");
	}
	
	public void anbtxlogotest(){
		boolean flag = basicdetials.validateAnbtxImage();
		Assert.assertTrue(flag);		
	}
	
	public void clickPrefixdropdownTest(){
		basicdetials.selectprefix();
	}
	
	public void selectprefixtest(){
		basicdetials.selectprefixvalue();
	}
	
		
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
