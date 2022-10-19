package testSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SetupClass {
	
	  private WebDriver driver;

	  
	  public void setUp() {
		  System.out.println("Initilizing the Google Chrome Driver");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	   
	  }
	  
	 	  
	
}
