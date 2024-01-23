package com.ebankingv1.testCases;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ebankingv1.utilities.ReadConfig;

import freemarker.log.Logger;



public class Baseclass {
	
	ReadConfig rc=new ReadConfig();
	
	//public static String baseurl="https://demo.guru99.com/v3/index.php";
//public static String username="mngr548819";
//public static String password="AzumadU";

	public  String baseurl=rc.geturl();
	public  String username=rc.username();
public  String password=rc.pass();
	public static WebDriver driver;
	
	
	public static String homeurl="https://demo.guru99.com/v3/manager/Managerhomepage.php";
	Driverfact d;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	
	
	{ 
	  d=new Driverfact();
		
		driver= d.driverinitialisation(browser);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 logger=logger.getLogger("EbankingV1");
	  PropertyConfigurator.configure("Log4j2.properties");

}
	public boolean alertpresentornot()
	{
		try
		{driver.switchTo().alert();
		return true;
			
		}
		
		catch(Exception e)
		{
			return false;
		}
		
	}
	public String random()
	{
	String gen=	RandomStringUtils.randomAlphabetic(5); // will create random alphanumeric with 5 letters
		return gen;
		//RandomStringUtils.randomNumeric(0)// to create numeric random numbers
	
	}
public void takeScreenshots(WebDriver driver,String tcname) throws IOException
// whenever tc fails we can call this method to take scnshots
{
	TakesScreenshot scn=(TakesScreenshot)driver;
	File source=scn.getScreenshotAs(OutputType.FILE);
	File target=new File("./Screenshots/"+tcname+".png");
	FileHandler.copy(source, target);
	System.out.println("scrnshots taken.....");
	
}
	
/*@AfterClass
public void teardown()
{
	driver.quit();
	}*/

}

