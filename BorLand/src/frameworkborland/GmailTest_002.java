package frameworkborland;
//excel data:GmailTest_002	enamqa15@gmail.com	2138417273	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utility.ExcelUtils;

public class GmailTest_002 {
	private WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	@Test(dataProvider = "Authentication")
	 
  public void login(String sNum1,String sNum2) throws Exception {
		 driver.findElement(By.xpath(".//*[@id='gb_70']")).click();

			driver.findElement(By.id("Email")).sendKeys(sNum1);
			driver.findElement(By.id("next")).click();
			Thread.sleep(1000);

			driver.findElement(By.id("Passwd")).sendKeys(sNum2);
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(1000);
			System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

			driver.findElement(
					By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a/span"))
					.click();
			driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	 
	  
  }
  @BeforeMethod
  public void lunchbrowser() throws Exception{
	  driver=new FirefoxDriver();
		Thread.sleep(1000);

	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void closebrowser() {
	  driver.quit();
  }
  
  
  
  @DataProvider
  
  public Object[][] Authentication() throws Exception{
 
	 	ExcelUtils.setExcelFile("C://Users//sumaia//Desktop//JavaFrameWork//BorLand//src//TestData//testdata.xlsx","Sheet1");
 
	 	sTestCaseName = this.toString();
 
	  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
 
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
 
	    Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//sumaia//Desktop//JavaFrameWork//BorLand//src//TestData//testdata.xlsx","Sheet1",iTestCaseRow);
 
	    	return (testObjArray);
 
		}

}
