package basic.borland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Borland {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.opera.driver",
				"C:\\Users\\sumaia\\Desktop\\Jars_file\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();*/
		
		
	/*	System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sumaia\\Desktop\\Jars_file\\IEDriverServer_x64_2.46.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		*/
		
		
		

		//driver.get(" http://www.toolsqa.com/");
		
		driver.navigate().to("http://demo.borland.com/gmopost/");   
		
		driver.manage().window().maximize();
		// http://www.seleniumhq.org/,
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
	    driver.findElement(By.name("billName")).sendKeys("Md");
	    
		Thread.sleep(2000);

	    driver.findElement(By.name("billAddress")).clear();
	    driver.findElement(By.name("billAddress")).sendKeys("351 S St Andresws");
	    driver.findElement(By.name("billCity")).clear();
	    driver.findElement(By.name("billCity")).sendKeys("Los Angeles");
	    driver.findElement(By.name("billState")).clear();
	    driver.findElement(By.name("billState")).sendKeys("CA");
	    
		Thread.sleep(2000);

	    driver.findElement(By.name("billZipCode")).clear();
	    driver.findElement(By.name("billZipCode")).sendKeys("90020");
	    driver.findElement(By.name("billPhone")).clear();
	    driver.findElement(By.name("billPhone")).sendKeys("213-841-7275");
	    
		Thread.sleep(2000);

	    driver.findElement(By.name("billEmail")).clear();
	    driver.findElement(By.name("billEmail")).sendKeys("enam@gmail.com");
	    
		Thread.sleep(2000);

	    new Select(driver.findElement(By.name("CardType"))).selectByVisibleText("Visa");
		Thread.sleep(2000);

	    driver.findElement(By.name("CardNumber")).clear();
	    driver.findElement(By.name("CardNumber")).sendKeys("1233-3333-3335-5665");
		Thread.sleep(2000);

	    driver.findElement(By.name("CardDate")).clear();
	    driver.findElement(By.name("CardDate")).sendKeys("01/91");
	    
		Thread.sleep(2000);

	    driver.findElement(By.name("shipSameAsBill")).click();
		Thread.sleep(2000);

	    driver.findElement(By.name("bSubmit")).click();
	    
		Thread.sleep(2000);

	    driver.findElement(By.name("bSubmit")).click();
		Thread.sleep(3000);


		 driver.quit();

	}

}
