package com.demoautomationsite.uat.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoautomationsite.uat.base.TestBase;
import com.demoautomationsite.uat.pages.SignInPage;

public class SignInPageTest extends TestBase {
	SignInPage SignInPage;
	
	public SignInPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() {
		initialisation();
		SignInPage=new SignInPage();
		SignInPage.ValidatePageTitle();
	}
	
	

	
	
}
