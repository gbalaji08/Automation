package testPage1;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class testCase1{
	
private WebDriver driver;



@Before
public void setUp() throws InterruptedException {
	
	System.out.println("launching firefox browser"); 
    
    //Browser initialization
	 
	//String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
    
    //System.setProperty("webdriver.gecko.driver", driverPath);
	
	String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
    
    driver = new ChromeDriver();
    driver.wait(60);
 
}

@After
public void tearDown() {
 driver.quit();
}

@Test
public void test_google() throws InterruptedException {
	
 driver.get("https://www.google.com/");
 
 driver.manage().window().setSize(new Dimension(1050, 660));
 
 driver.findElement(By.name("q")).click();
 
 driver.wait(60);
 
 driver.findElement(By.name("q")).sendKeys("Selenium");
 
 driver.wait(60);
 
 
 driver.findElement(By.cssSelector(".sbhl .wM6W7d > span")).click();
 {
     WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb"));
     Actions builder = new Actions(driver);
     builder.moveToElement(element).perform();
   }
   driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
   driver.close();
}
}
