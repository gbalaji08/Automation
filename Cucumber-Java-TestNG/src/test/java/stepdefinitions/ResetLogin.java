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

public class ResetLogin {
	
	public WebDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	@Before
	public void setup()
	{
		System.out.println("Starting session...");
	}
    @Given("^Open chrome and launch the application$")
    public void launch_app()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
    }
    //Enter the username <username> and password <password>
    
    @When("^Enter the username \"(.*)\" and password \"(.*)\"$")
    public void enter_credentials(String username, String password) throws Throwable
    {
    	driver.findElement(By.name("uid")).sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("^Reset credential$")					
    public void	Reset_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }	
}

