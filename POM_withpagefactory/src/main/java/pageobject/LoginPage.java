package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@CacheLookup
	// @FindBy(id = "userName")
	@FindBy(id = "loginform-username")
	WebElement user;
	@CacheLookup
	// @FindBy(id = "password")
	@FindBy(id = "loginform-password")

	WebElement password;
	@CacheLookup
	// @FindBy(how = How.ID, using = "login")
	@FindBy(xpath = "//*[@id=\"login-form\"]/div[5]/button")

	WebElement login;

	public void loginDetails(String n, String p) {
		//driver.navigate().refresh();
		user.sendKeys(n);
		password.sendKeys(p);
		login.click();

	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
