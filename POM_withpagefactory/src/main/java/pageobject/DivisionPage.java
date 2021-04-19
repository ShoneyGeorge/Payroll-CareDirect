package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DivisionPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Division\"]")
	WebElement division;
	@CacheLookup
	@FindBy(id = "division-company_id")
	WebElement divisioncompany;
	@CacheLookup
	@FindBy(id = "division-branch_id")
	WebElement divisionbranch;
	@CacheLookup
	@FindBy(id = "division-division_name")
	WebElement divisionname;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement divisionsave;

	public void divionDetails() throws InterruptedException {
		division.click();
		Thread.sleep(3000);
		divisioncompany.submit();
		Select t = new Select(divisioncompany);
		t.selectByIndex(1);
		//divisionbranch.submit();
		Select e = new Select(divisionbranch);
		e.selectByIndex(5);
		divisionname.sendKeys("TVM");
		divisionsave.submit();
	}
	public DivisionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}
}
