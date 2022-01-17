package com.demoautomationsite.uat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoautomationsite.uat.base.TestBase;

public class SignInPage extends TestBase{
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailid;
	

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	
	
	//initialize the page objects
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public static String ValidatePageTitle() {
		return driver.getTitle();
	}
	
	
	public  void SignIn(String eid,String pwd) {
		emailid.sendKeys(eid);
		password.sendKeys(pwd);
		signin.click();
		
		// return new Homepage();
		
		
	}
	
	
}
