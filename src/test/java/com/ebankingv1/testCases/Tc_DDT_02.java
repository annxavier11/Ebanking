package com.ebankingv1.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebankingv1.pageobjects.Loginpage;
import com.ebankingv1.utilities.XlUtil;

public class Tc_DDT_02 extends Baseclass{

	
	@Test(dataProvider="ebankingexcel")
	public void loginDDT(String user,String pwd) throws Exception
	{driver.get(baseurl); 
		Loginpage lp=new Loginpage(driver);
		lp.setusername(user);
		lp.password(pwd);
		lp.submit();
		if(alertpresentornot()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent(); //to go to main page
			Assert.assertTrue(false);
		logger.warn("login failed");
		
		}
		else
		{
			Assert.assertTrue(true);
			logger.warn("login passed");
			lp.logout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}
	
	
	
	
	@DataProvider(name="ebankingexcel")
	String [][] getData() throws Exception
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/ebankingv1/testData/ebankingexcel.xlsx";
	int row=XlUtil.getrowcount(path,"Sheet1");
	int col=XlUtil.getcellcount(path,"Sheet1", 1);
	String logindata[][]=new String[row][col];
	for (int i=1;i<=row;i++)
	{
		for(int j=0;j<=col;j++)
		{
			
		logindata[i-1][j]=XlUtil.getCelldata(path, "Sheet", i, j);	
			
		}
		
	}
	return logindata;
	
	
	}
	
	
}
