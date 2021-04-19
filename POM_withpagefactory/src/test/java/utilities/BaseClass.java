package utilities;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHONY\\Desktop\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.navigate().to("https://demoqa.com/login");
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] dp() throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\SHONY\\Desktop\\New2.xls");
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
	public void shot() throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\SHONY\\Desktop\\Shots"));
	}
}