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

public class LoginTest {
	
	public WebDriver driver;
	String url = "http://demo.guru99.com/v4";
	
	@Before
	public void setup()
	{
		System.out.println("Starting session...");
	}

	@Given("^Open the chrome browser and launch the application$")
	public void launch_application()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@When("^Enter the username and password$")
	public void pass_credentials() {
		driver.findElement(By.name("uid")).sendKeys("testuser1");
		driver.findElement(By.name("password")).sendKeys("password1");
	}
	
	@Then("^Reset the credential$")
	public void click_reset()
	{
		driver.findElement(By.name("btnReset")).click();
	}
}
