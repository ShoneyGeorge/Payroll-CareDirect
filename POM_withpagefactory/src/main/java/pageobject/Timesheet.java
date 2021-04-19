package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheet {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"TimeSheet\"]")
	WebElement TimeSheet;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Generate Playslip\"]")
	WebElement Playslip;

	public void timesheetdetails() throws InterruptedException {
		TimeSheet.click();
		Thread.sleep(5000);
		Playslip.click();
		Alert a = driver.switchTo().alert();
		String b = a.getText();
		System.out.println(b);
		Thread.sleep(5000);
		a.accept();
		String c = a.getText();
		System.out.println(c);
		Thread.sleep(5000);
		a.accept();

	}

	public Timesheet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
