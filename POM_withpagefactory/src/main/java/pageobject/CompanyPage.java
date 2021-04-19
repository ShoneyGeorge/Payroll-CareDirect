package pageobject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

	WebDriver driver;
	@CacheLookup
	@FindBy(id = "loginform-username")
	WebElement login;
	@CacheLookup
	@FindBy(id = "loginform-password")
	WebElement password;
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"login-form\"]/div[5]/button")
	WebElement button;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Company\"]")
	WebElement company;
	@CacheLookup
	@FindBy(id = "company-company_name")
	WebElement name;
	@CacheLookup
	@FindBy(id = "company-company_email")
	WebElement mail;
	@CacheLookup
	@FindBy(id = "company-company_address")
	WebElement address;
	@CacheLookup
	@FindBy(id = "company-started_at")
	WebElement start;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement save;
	
	public void CompanyloginDetails(String n, String p) throws InterruptedException, IOException {
		login.sendKeys(n);
		password.sendKeys(p);
		button.click();
		/*Thread.sleep(3000);
		company.click();
		name.clear();
		name.sendKeys("Obsqura123");
		mail.clear();
		mail.sendKeys("shoney@gmail.com");
		address.clear();
		address.sendKeys("abc,trivandrum");
		start.clear();
		start.sendKeys("22-03-2021");
		Thread.sleep(3000);
		save.submit();
		Thread.sleep(3000);
		//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//FileUtils.copyFile(f,new File( "C:\\Users\\SHONY\\Desktop\\Shots"));
	*/
	}

	public CompanyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
