package firsttestngPackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		


public class DragAndDrop {				

    public WebDriver driver;	
    
	
	public String baseUrl = "http://demo.guru99.com/test/drag_drop.html";

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
    public void DragnDrop()					
    {		
        			
     

    	
    	//Verifying the Perfect! message.		
    	if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())							
         	{		
             	System.out.println("Perfect Displayed !!!");					
         	}
    		else
         	{
            	System.out.println("Perfect not Displayed !!!");					
         	}		
    }
 }		

