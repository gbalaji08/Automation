package stepdefinitions;
 
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class AppleStepDefinitions {
     
    public WebDriver driver;
 
    @Before
    public void setUp()
    {
      System.out.println("Before Hook Method Running....");
    }
     
     
    @Given("^user is already on apple website$")
    public void user_is_already_on_apple_website() {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
                 
        
        driver.get("https://www.apple.com/");
    }
 
    @When("^title is Apple$")
    public void title_is_iPad_Apple() {
        String title = driver.getTitle();
        Assert.assertEquals("Apple", title);
    }
     
 
    @Then("^search for \"([^\"]*)\"$")
    public void search_for_airpods_by_keyword(String airpodsKeyword) throws InterruptedException {
        WebElement search = driver.findElement(By.id("ac-gn-link-search"));
        search.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.findElement(By.id("ac-gn-searchform-input")).sendKeys(airpodsKeyword);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
 
        driver.findElement(By.xpath("//*[@id=\"quicklinks\"]/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
    }
 
    @When("^title is AirPods - Apple$")
    public void title_is_AirPods_Apple() {
        String title = driver.getTitle();
        System.out.println("Airpods Page title ::" + title);
        Assert.assertEquals("AirPods - Apple", title);
    }
 
    @Then ("^print welcome to the airpods official webpage$")
    public void print_message() {
        System.out.println("Welcome to airpod official web page");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
 
    }
    @After
    public void tearDown(Scenario scenario)
    {
    	if(scenario.isFailed())
    	{
    		// Take a screenshot...
    	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	      
    	      try {
    	            FileUtils.copyFile(screenshot, new File("target\\img.png"));
    	        } catch (IOException e) {
    	            System.out.println(e.getMessage());
    	        }
    	    
    	}
      System.out.println("After Hook Method Running....");
      
    }
}