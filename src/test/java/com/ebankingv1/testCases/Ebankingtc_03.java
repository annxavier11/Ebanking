package com.ebankingv1.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebankingv1.pageobjects.Loginpage;
import com.ebankingv1.pageobjects.NewcustomerPage;

public class Ebankingtc_03 extends Baseclass {

	@Test
	public void newcustomer() throws Exception
	{
		driver.get(baseurl); 
		logger.info("url is opened");
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username); 
		lp.password(password);
		logger.info("enetered username and pswd...");
		lp.submit();
		Thread.sleep(3000);
		
	NewcustomerPage nc= new NewcustomerPage(driver);
	nc.newcutomer(); //clicking on add customer link
	nc.EnterUser("aneesha");
	logger.info("set username....");
	nc.Entergender();
	nc.enterDOB("10", "07", "1996");
	Thread.sleep(3000);
	nc.EnterAddr("Parappullil h epuzha po ernakulam kerala");
	nc.Entercity("ekm");
	nc.EnterPin("675882");
	nc.EnterState("kerala");
	nc.Enterphone("879653358");
	//nc.Enteremail(); //we need to pass unique email id..
	String email=random()+"@gmail.com";
	nc.Enteremail(email);
	nc.Enterpass("ghhdu0");
	nc.submit();
	logger.info("submitted");
	Boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if (result==true)
	{
		Assert.assertTrue(true);
		logger.info("successful......");
	}
	else
	{
		takeScreenshots(driver,"newcustomer");
		Assert.assertTrue(false);
		logger.info("fail..........");
		
	}
	}
	
	
	
}
