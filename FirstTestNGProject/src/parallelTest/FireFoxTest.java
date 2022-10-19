package parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FireFoxTest {

	public WebDriver driver; 
	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the firefox Driver");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gbalaji\\Documents\\Automation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
    @Test
 	public void FirefoxTestMethod()
 	{ 

	  //Initialize the firefox driver
    	
	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	 driver.get("https://demo.guru99.com/test/newtours/"); 
	 
 
    }
 
     @AfterTest
     public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
     }
}