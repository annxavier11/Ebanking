package com.ebankingv1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfact {
	

		WebDriver driver;
		
		public WebDriver driverinitialisation(String name)
		{
		if(name.equalsIgnoreCase("chrome"))
			
		{
			System.out.println("browser is......"+name);
			driver=new ChromeDriver();
			
		}
		else if(name.equalsIgnoreCase("firefox"))
			
		{
			System.out.println("browser is......"+name);
			driver=new FirefoxDriver();
			
		}
		else
		{
			
			System.err.println("pass correct browser details..");
		}
		
		
		return driver;
	}}

