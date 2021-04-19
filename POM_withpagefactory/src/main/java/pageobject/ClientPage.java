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

public class ClientPage {
WebDriver driver;
@CacheLookup
@FindBy(xpath="//a[text()=\"Clients\"]")
WebElement client;
@CacheLookup
@FindBy(id="clientsearch-client_name")
WebElement client_name;
@CacheLookup
@FindBy(xpath="//button[text()=\"Search\"]")
WebElement Search;
public void  clientdetails() throws IOException
{
	client.submit();
	client_name.sendKeys("Shoney");
	Search.submit();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File( "C:\\Users\\SHONY\\Desktop\\Shots"));
}
public ClientPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

	
}
}
