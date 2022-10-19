package firsttestngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IfTest {
	
	
	public WebDriver driver;
	


	@BeforeTest //setup
    public void initializeBrowser()
    {
    	 System.out.println("launching firefox browser"); 
         
         //Browser initialization
    	 
    	 String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
         
         System.setProperty("webdriver.gecko.driver", driverPath);
         
         driver = new FirefoxDriver();
    }
	@Test
	public void nestedIfTests()
	{
		driver.navigate().to("http://facebook.com");
		By locator = By.name("firstname");
		if (driver.findElements(locator).size() > 0) {
			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).sendKeys("Hello");
			}
		}
	}
	@AfterTest
	public void tear_down()
	{
		driver.quit();
	}
	}