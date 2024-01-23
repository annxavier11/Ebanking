package com.ebankingv1.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebankingv1.pageobjects.Loginpage;

public class Ebanking_TC1 extends Baseclass {
     @Test
	 public void logintest() throws IOException
	 {
		 
		driver.get(baseurl); 
		logger.info("url is opened");
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username); 
		lp.password(password);
		logger.info("enetered username and pswd...");
		lp.submit();
		//Assert.assertEquals(driver.getCurrentUrl(),homeurl);
		if(driver.getCurrentUrl().equalsIgnoreCase(homeurl))
				{
			Assert.assertTrue(true);
			logger.info("tc is pass...");
			
			
				}
		
		else 
		{
			
			takeScreenshots(driver,"logintest");
			//assert.assertTrue(false);
			logger.info("failed.....");
			
		}
	 }
	
}
