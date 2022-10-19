package parallelTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {
	public WebDriver driver;
 
	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Google Chrome Driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

        @Test
 	public void ChromeTestMethod()
 	{ 
	  //Initialize the chrome driver
        	
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	  driver.get("https://www.apple.com/in/shop/accessories/all"); 
	  
       }
        
        @Test
        public void ifconditiontest()
        {
        	//loop through page and click all link details

        	String url = "";
        	HttpURLConnection huc = null;
            int respCode = 200;
        	List<WebElement> links = driver.findElements(By.tagName("a"));

        	Iterator<WebElement> it = links.iterator();
            
            while(it.hasNext()){
                
                url = it.next().getAttribute("href");
                
                System.out.println(url);
            
                if(url == null || url.isEmpty()){
    System.out.println("URL is either not configured for anchor tag or it is empty");
                    continue;
                }
                
                
                if(!url.contains("apple")){
                    System.out.println("URL belongs to another domain, skipping it.");
                    continue;
                }
                
                try {
                    huc = (HttpURLConnection)(new URL(url).openConnection());
                    
                    huc.setRequestMethod("HEAD");
                    
                    huc.connect();
                    
                    respCode = huc.getResponseCode();
                    
                    if(respCode >= 400){
                        System.out.println(url+" is a broken link");
                    }
                    else{
                        System.out.println(url+" is a valid link");
                    }
                        
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        	}
        
 
       @AfterTest
       public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
       }
}