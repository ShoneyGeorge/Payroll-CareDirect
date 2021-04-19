package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Worker {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Workers\"]")
	WebElement workers;
	@CacheLookup
	@FindBy(id = "workersearch-first_name")
	WebElement first_name;
	@CacheLookup
	@FindBy(id = "workersearch-last_name")
	WebElement last_name;
	@CacheLookup
	@FindBy(id = "workersearch-postcode")
	WebElement postcode;
	@CacheLookup
	@FindBy(id = "workersearch-ni_number")
	WebElement ni_number;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Search\"]")
	WebElement Search;
	@CacheLookup
	@FindBy(xpath ="//a[@href=\"/payrollapp/worker/view?id=674\"]")
	WebElement view;

	public void Workerdetails() throws InterruptedException {
		workers.submit();
		first_name.sendKeys("shoney");
		last_name.sendKeys("George");
		postcode.sendKeys("695527");
		Search.click();
		Thread.sleep(8000);
		view.click();
	}

	public Worker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
