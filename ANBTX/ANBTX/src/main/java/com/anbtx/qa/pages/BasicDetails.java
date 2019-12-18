package com.anbtx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.anbtx.qa.base.TestBase;

public class BasicDetails extends TestBase {
	
	//Page factory or OR
	
	@FindBy(xpath="/html/body/app-root/app-header/div/div/span/div/a/img")
	WebElement AnbtxLogo;
	
	@FindBy(xpath="//*[@id='mat-select-0']/div/div")
	WebElement Prefix;
	
	@FindBy(xpath="//*[@id='mat-option-0']/span")
	WebElement Prefixvalue;
	
	@FindBy(xpath="//*[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath= "//*[@id='middleName']")
	WebElement MiddleName;
	
	@FindBy(xpath="//*[@id='lastName']")
	WebElement LastName;
	
	@FindBy(xpath= "//*[@id='suffix']")
	WebElement suffix;
	
	@FindBy(xpath= "//*[@id='email']")
	WebElement Email;
	
	@FindBy(xpath= "//*[@id='confirmEmail']")
	WebElement ConfirmEmail;
	
	@FindBy(xpath= "//*[@id='dob']")
	WebElement Dob;
	
	@FindBy(xpath= "//*[@id='idExpDate']")
	WebElement ExpDate;
	
	@FindBy(xpath= "//*[@class='mat-select-placeholder ng-tns-c23-12 ng-star-inserted']")
	WebElement IssuingState;
	
	@FindBy(xpath="//*[@id='mat-option-2']/span")
	WebElement value;
	
	@FindBy(xpath="//*[@id='ssn']")
	WebElement SSN;
	
	@FindBy(xpath="//*[@id='buttons-container']/button/span")
	WebElement NextSection;
	
	//Initializing the page objects
	
	public BasicDetails(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validatepagetitle(){
		return driver.getTitle();
	}
	
	public boolean validateAnbtxImage(){
		return AnbtxLogo.isDisplayed();
	}
	
	public void selectprefix() {
		Prefix.click();
	}
	
	public void selectprefixvalue(){
		Prefixvalue.click();
	}
	
	public void enterfirstname(){
		FirstName.sendKeys();
	}
	
	public void entermiddlename(){
		MiddleName.sendKeys();
	}
	
	public void enterlastname(){
		LastName.sendKeys();
	}
	
	public void selectsuffix(){
		suffix.click();
	}
	
	public void enteremail(){
		Email.sendKeys();
	}
	
	public void enterconfirmemail(){
		ConfirmEmail.sendKeys();
	}
	
	public void enterdob(){
		Dob.sendKeys();
	}
	
	public void enterExpDate(){
		ExpDate.sendKeys();
	}
	
	public void selectIssuingstate(){
		IssuingState.click();
	}
	
	public void selectstatevalue(){
		value.click();
	}
	
	public void enterssn(){
		SSN.sendKeys();
	}
	
	public EmploymentDetails clicknextbutton(){
		SSN.click();
		return new EmploymentDetails();
	}
	
	public void clicknextsection(){
		NextSection.click();
	}
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	

}
