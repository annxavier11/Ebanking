package com.ebankingv1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	 public Loginpage(WebDriver driver){
	this.driver =driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	@FindBy (xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logout;
	
	public void setusername(String user)
	
	{
		username.sendKeys(user);
		
		
	}
public void password(String pswd)
	
	{
		password.sendKeys(pswd);
		
		
	}
public void submit()

{
	login.click();
	
	
}
public void logout()
{
logout.click();	
}

	
	
	
	
	
	
	
	
	
}
