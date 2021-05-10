package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Utility {
	public WebDriver driver;
	
	public void pincode()
	{
		Random random = new Random();
        {
           int randomNumber = random.nextInt(100000);
           System.out.println( randomNumber);
       }
	}

	public void softAssert(String actual, String expected, boolean a) {
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actual, expected);
		softassert.assertTrue(a);
		softassert.assertAll();
	}

	public void hardAssert(String actual, String expected, boolean a) {
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(a);
		Assert.assertFalse(a);
	}

	public void screenShot() throws IOException {
		Date date=new Date();
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\SHONY\\Desktop\\Shot\\"+date.getSeconds()+ ".jpeg" ));
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

/*	public String dp(String str) throws BiffException, IOException {
		  FileInputStream file = new FileInputStream("C:\\Users\\SHONY\\Desktop\\Username_Password.xls");
			Workbook w = Workbook.getWorkbook(file);
			Sheet s = w.getSheet("Sheet1");
			int row = s.getRows();
			int column = s.getColumns();
			System.out.println("Row " + row + "Column " + column);
			String username,password;
			for (int i = 0; i < row; i++) {
				
				
				 
					Cell c = s.getCell(0, i);
					if(str==c.getContents())
					{
						username = c.getContents();
						Cell d = s.getCell(1, i);
						password=d.getContents();

					}
				}
			
			return username;
			
}*/

	
public Utility(WebDriver driver)
{
	this.driver=driver;
}
	

	
}
