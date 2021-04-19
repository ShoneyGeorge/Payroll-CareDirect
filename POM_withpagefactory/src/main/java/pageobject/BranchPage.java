package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchPage {
	WebDriver driver;
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Branch\"]")
	WebElement branch;
	@CacheLookup
	@FindBy(xpath = "//select[@id=\"branch-company_id\"]")
	WebElement branchcompany;
	@CacheLookup
	@FindBy(id = "branch-branch_name")
	WebElement branchname;
	@CacheLookup
	@FindBy(id = "branch-branch_address")
	WebElement branchaddress;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement branchsave;


public  void branchDetails() throws InterruptedException
{
	branch.click();
	Thread.sleep(3000);
	branchcompany.submit();
	Select s = new Select(branchcompany);
	s.selectByIndex(1);
	branchname.sendKeys("thiruvalla");
	branchaddress.sendKeys("Thiruvalla,pathanamthitta");
	branchsave.submit();
	Thread.sleep(3000);
}
public BranchPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

}

