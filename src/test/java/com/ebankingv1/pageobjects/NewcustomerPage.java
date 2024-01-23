package com.ebankingv1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewcustomerPage {
WebDriver driver;
public NewcustomerPage(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
WebElement newcustomer;
@FindBy(name="name")
WebElement newcustom;

@FindBy(name="rad1")
WebElement gender;

@FindBy(id="dob")
WebElement dob;
@FindBy(name="addr")
WebElement address;
@FindBy(name="city")
WebElement city;
@FindBy(name="state")
WebElement state;
@FindBy(name="pinno")
WebElement pin;
@FindBy(name="telephoneno")
WebElement phone;
@FindBy(name="emailid")
WebElement emailid;
@FindBy(name="password")
WebElement password;

@FindBy(name="sub")
WebElement submit;

public void newcutomer()
{newcustomer.click();

}

public void EnterUser(String user)
{
newcustom.sendKeys(user);
}
public void Entergender()
{
gender.click();
}
public void enterDOB(String dd,String mm,String yy)
{
	dob.sendKeys(mm);
	dob.sendKeys(dd);
	dob.sendKeys(yy);
}
public void EnterAddr(String addr)
{
address.sendKeys(addr);
} 

public void Entercity(String City)
{
city.sendKeys(City);
} 
public void EnterState(String State)
{
state.sendKeys(State);
} 

public void EnterPin(String Pin) //here we are pasing string
{
pin.sendKeys(String.valueOf(Pin)); // nbut incase if we pass values other than string this woill convert to string value

} 
public void Enterphone(String phoneno)
{
phone.sendKeys(phoneno);
}

public void Enteremail(String email)
{
	emailid.sendKeys(email);
}
public void Enterpass(String passw)
{
	
password.sendKeys(passw);
}

public void submit()
{
	
submit.click();

}
}
