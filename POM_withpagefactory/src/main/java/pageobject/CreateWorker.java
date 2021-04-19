package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateWorker {
	WebDriver driver;
	@CacheLookup
	@FindBy(id="worker-title")
	WebElement title;
	@CacheLookup
	@FindBy(id="worker-first_name")
	WebElement first_name;
	@CacheLookup
	@FindBy(id="worker-last_name")
	WebElement last_name;
	@CacheLookup
	@FindBy(id="worker-phone")
	WebElement phone;
	@CacheLookup
	@FindBy(id="worker-email")
	WebElement email;
	@CacheLookup
	@FindBy(id="worker-gender")
	WebElement gender;
	@CacheLookup
	@FindBy(id="worker-dob")
	WebElement dob;
	public void createworker()
	{
		Select a=new Select(title);
		a.selectByIndex(2);
		first_name.sendKeys("ShoneyA");
		last_name.sendKeys("G");
		phone.sendKeys("987654321");
		email.sendKeys("shoneysag@gmail.com");
		Select b=new Select(gender);
		b.selectByIndex(1);
		dob.sendKeys("22-09-1992");
	}
	
	public CreateWorker(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
}
