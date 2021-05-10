package utilities;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelRead {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebElement user = driver.findElement(By.id("userName"));

		user.sendKeys(n);
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(s);
		Thread.sleep(3000);
		WebElement clic = driver.findElement(By.id("login"));
		clic.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHONY\\Desktop\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/login");
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\SHONY\\Desktop\\Username_Password.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s = w.getSheet("Sheet1");
		int row = s.getRows();
		int column = s.getColumns();
		System.out.println("Row " + row + "Column " + column);
		String[][] input = new String[row][column];
		for (int i = 0; i < row; i++) {
			
			
			for (int j = 0; j < column; j++) {
				Cell c = s.getCell(j, i);
				input[i][j] = c.getContents();
			}
		}
		return input;
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
