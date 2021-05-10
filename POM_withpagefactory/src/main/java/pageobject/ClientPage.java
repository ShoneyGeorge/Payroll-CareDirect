package pageobject;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class ClientPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Clients\"]")
	WebElement client;
	@CacheLookup
	@FindBy(id = "clientsearch-client_name")
	WebElement client_name;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement Search;

	public void clientdetails() throws IOException, InterruptedException {
		Utility u = new Utility(driver);
		u.implicitWait();
		client.click();
		u.pincode();
		Random random = new Random();
        
           CharSequence randomNumber = random.toString();
           System.out.println( randomNumber);
       
		client_name.sendKeys(randomNumber);
		Search.submit();
		u.screenShot();
	}

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
