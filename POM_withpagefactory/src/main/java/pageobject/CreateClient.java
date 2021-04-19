package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateClient {

	WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()=\"Create Client\"]")
	WebElement createclient;
	@CacheLookup
	@FindBy(id = "client-branch_id")
	WebElement branch;
	@CacheLookup
	@FindBy(id = "client-division_id")
	WebElement divison;
	@CacheLookup
	@FindBy(id = "client-client_name")
	WebElement name;
	@CacheLookup
	@FindBy(id = "client-client_address")
	WebElement address;
	@CacheLookup
	@FindBy(id = "client-postcode")
	WebElement postcode;
	@CacheLookup
	@FindBy(id = "client-invoice_contact")
	WebElement invoice_contact;
	@CacheLookup
	@FindBy(id = "client-phone")
	WebElement phone;
	@CacheLookup
	@FindBy(id = "client-company_reg")
	WebElement company_reg;
	@CacheLookup
	@FindBy(id = "client-email")
	WebElement email;
	@CacheLookup
	@FindBy(id = "client-invoice_order")
	WebElement invoice_order;
	@CacheLookup
	@FindBy(id = "client-invoice_delivery_method")
	WebElement invoice_delivery_method;
	@CacheLookup
	@FindBy(id = "client-master_document")
	WebElement master_document;
	@CacheLookup
	@FindBy(id = "client-settilement_days")
	WebElement settilement_days;
	@CacheLookup
	@FindBy(id = "client-vat_rate")
	WebElement vat_rate;
	@CacheLookup
	@FindBy(xpath = "//button[text()=\"Save\"]")
	WebElement save;

	public void createclientdetails() {
		
		createclient.click();
		Select s = new Select(branch);
		s.selectByIndex(1);
		Select t = new Select(divison);
		t.selectByIndex(1);
		name.sendKeys("Shoney");
		address.sendKeys("Thiruvalla");
		postcode.sendKeys("689621");
		invoice_contact.sendKeys("9562551528");
		phone.sendKeys("876543");
		email.sendKeys("sag@gmail.com");
		company_reg.sendKeys("123");
		Select e = new Select(invoice_order);
		e.selectByIndex(4);
		Select c = new Select(invoice_delivery_method);
		c.selectByIndex(1);
		Select o = new Select(master_document);
		o.selectByIndex(1);
		settilement_days.sendKeys("10");
		Select n = new Select(vat_rate);
		n.selectByIndex(3);
		save.submit();
	}

	public CreateClient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
