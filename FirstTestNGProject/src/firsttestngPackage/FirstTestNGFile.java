package firsttestngPackage;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGFile {
    
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
    public WebDriver driver ; 
    
    @BeforeTest //setup
    public void initializeBrowser()
    {
    	 System.out.println("launching firefox browser"); 
         
         //Browser initialization
         
         System.setProperty("webdriver.gecko.driver", driverPath);
         
         driver = new FirefoxDriver();
         
         driver.get(baseUrl); //open the url
    }
     
  @Test
  public void verifyHomepageTitle() {

      
      String expectedTitle = "Welcome: Mercury Tours";
      
      String actualTitle = driver.getTitle(); // it reads the page titile
      
      Assert.assertEquals(actualTitle, expectedTitle); //compares two values
      
  }
  
  @AfterTest
  public void closeBrowser()
  {
	 
      driver.close();  /// closing the browser
  }
}