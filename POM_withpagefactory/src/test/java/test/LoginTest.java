package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider = "dp")

	public void login(String n, String p, String a) {
		System.out.println(a);
		
		
		LoginPage l = new LoginPage(driver);
		l.loginDetails(n, p);
	}

}
