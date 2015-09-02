package frameworkborland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utility.ExcelUtils;

public class Borland_001 {
	private WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	@Test(priority = 1, dataProvider = "Authentication")
	public void billinginfo(String sNum1, String sNum2, String sNum3,
			String sNum4, String PNumber, String Email, String Card,
			String Cnumber) throws Exception {
		driver.findElement(By.name("bSubmit")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("QTY_TENTS")).clear();

		driver.findElement(By.name("QTY_TENTS")).sendKeys("4");

		Thread.sleep(2000);

		driver.findElement(By.name("QTY_BACKPACKS")).clear();
		driver.findElement(By.name("QTY_BACKPACKS")).sendKeys("2");

		driver.findElement(By.name("QTY_SOCKS")).clear();
		driver.findElement(By.name("QTY_SOCKS")).sendKeys("3");

		Thread.sleep(2000);

		driver.findElement(By.name("bSubmit")).click();
		driver.findElement(By.name("bSubmit")).click();
		driver.findElement(By.name("billName")).clear();

		Thread.sleep(1000);
		driver.findElement(By.name("billName")).sendKeys(sNum1);
		Thread.sleep(1000);

		driver.findElement(By.name("billAddress")).clear();
		driver.findElement(By.name("billAddress")).sendKeys(sNum2);

		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys(sNum3);
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys(sNum4);

		Thread.sleep(1000);

		driver.findElement(By.name("billZipCode")).clear();
		driver.findElement(By.name("billZipCode")).sendKeys("90020");
		driver.findElement(By.name("billPhone")).clear();
		driver.findElement(By.name("billPhone")).sendKeys(PNumber);

		Thread.sleep(2000);

		driver.findElement(By.name("billEmail")).clear();
		driver.findElement(By.name("billEmail")).sendKeys(Email);

		Thread.sleep(2000);

		new Select(driver.findElement(By.name("CardType")))
				.selectByVisibleText(Card);
		Thread.sleep(2000);

		driver.findElement(By.name("CardNumber")).clear();
		driver.findElement(By.name("CardNumber")).sendKeys(Cnumber);
		Thread.sleep(2000);

		driver.findElement(By.name("CardDate")).clear();
		driver.findElement(By.name("CardDate")).sendKeys("01/91");

		Thread.sleep(2000);

		driver.findElement(By.name("shipSameAsBill")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("bSubmit")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("bSubmit")).click();
		System.out
				.println("Welcome to Green Mountain Outpost's OnLine Catalog!");

	}

	@Test(priority = 0)
	public void about_gmo_site() {
		driver.findElement(
				By.xpath("html/body/form/div[1]/center/table/tbody/tr/td[2]/input"))
				.click();
		System.out.println("Welcome About GMO site");
	}

	@Test(priority = 2)
	public void browser_test_page() {
		driver.findElement(
				By.xpath("html/body/form/div[2]/center/table/tbody/tr/td/input"))
				.click();
		System.out.println("Welcome Browser Test Page");

	}

	@BeforeMethod
	public void lunchbrowser() throws Exception {
		driver = new FirefoxDriver();
		Thread.sleep(1000);

		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

	@DataProvider
	public Object[][] Authentication() throws Exception {

		ExcelUtils
				.setExcelFile(
						"C://Users//sumaia//Desktop//JavaFrameWork//BorLand//src//TestData//testdata.xlsx",
						"Sheet1");

		sTestCaseName = this.toString();

		sTestCaseName = ExcelUtils.getTestCaseName(this.toString());

		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);

		Object[][] testObjArray = ExcelUtils
				.getTableArray(
						"C://Users//sumaia//Desktop//JavaFrameWork//BorLand//src//TestData//testdata.xlsx",
						"Sheet1", iTestCaseRow);

		return (testObjArray);

	}

}
