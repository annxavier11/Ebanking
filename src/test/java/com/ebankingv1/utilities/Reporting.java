package com.ebankingv1.utilities;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Reporting<ExtentHtmlReporter> extends TestListenerAdapter {

public 	ExtentReports extent;// specify the enviornment/location of the report
	public ExtentTest test; //specify what all details should be includeded in the re[port
	public ExtentHtmlReporter htmlreporter;
	
	public void onStart(ITestContext testcontext)
	{
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String reportname="Test-report"+timestamp+".html";	
		//htmlreporter =new ExtentHtmlReporter(System.getProperty("user.dir")+);
				
		//incomplete prgm		
				
				
				
				
		
		
		
	}
}



