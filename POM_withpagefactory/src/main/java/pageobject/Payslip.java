package pageobject;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Payslip {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[@href=\"/payrollapp/payslip/index\"]")
	WebElement Payslip;
	public void payslipdetails() throws IOException
	{
		
		Payslip.click();
		//JavascriptExecutor j =(JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,1000)", "");
		
	}
}
