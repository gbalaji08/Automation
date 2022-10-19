package firsttestngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeTest {
	
	
	public WebDriver driver;
	
	public String baseUrl = "http://demoqa.com/frames";

	@BeforeTest //setup
    public void initializeBrowser()
    {
    	 System.out.println("launching firefox browser"); 
         
         //Browser initialization
    	 
    	 String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
         
         System.setProperty("webdriver.gecko.driver", driverPath);
         
         driver = new FirefoxDriver();
         
         driver.get(baseUrl); //open the url
    }
	
	@Test
	public void test_iframes()
	{
		
		
        WebElement frame1=driver.findElement(By.id("frame1"));
	    
	    driver.switchTo().frame(frame1);
	    
	    
        WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));

	    
        //Finding the text of the frame1 heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading
        System.out.println("Text of the frame1 heading is:"+frame1Text);
        
        //closing the driver
        driver.close();
}	}
