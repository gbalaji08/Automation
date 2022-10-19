package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testSetup.SetupClass;

public class FlightsPage {
	
	WebDriver driver;
	
	  @BeforeTest
	  public void setup()
	  {
		  SetupClass obj = new SetupClass();
		  obj.setUp();
	  }
	  
	
	  @Test
	  public void Login()
	  
	  {
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).sendKeys("userone");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("userpwd");
	    driver.findElement(By.name("submit")).click();
	  }
	
	@Test
	public void FlightBooking()
	{
		    driver.findElement(By.linkText("Flights")).click();
		    driver.switchTo().frame(7);
		    driver.findElement(By.cssSelector("div:nth-child(1) > svg")).click();
		    driver.switchTo().defaultContent();
		    driver.findElement(By.name("findFlights")).click();
		    driver.findElement(By.cssSelector("td > a > img")).click();
		    driver.findElement(By.linkText("REGISTER")).click();
		    driver.findElement(By.linkText("Hotels")).click();
		    driver.findElement(By.cssSelector("td > a > img")).click();
		    driver.findElement(By.cssSelector("div:nth-child(5)")).click();
		  }
	}


