package firsttestngPackage;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class GridTest {
	
	
	@Test
	  public void remoteTest(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions chromeOptions = new ChromeOptions();
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability(CapabilityType.BROWSER_NAME,"chrome");
	    caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    WebDriver driver = null;
	    try {
	      driver = new RemoteWebDriver(URI.create("http://192.168.225.174:4444/").toURL(), caps);
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    }
	    driver.navigate().to("https://www.swtestacademy.com");
	    WebElement logo = driver.findElement(By.className("fusion-logo-link"));
	    System.out.println(logo.isDisplayed());
	  }


	@Test
	  public void remoteTestFirefox(){
		FirefoxOptions firefox = new FirefoxOptions();
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability(CapabilityType.BROWSER_NAME,"firefox");
	    caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefox);
	    WebDriver driver = null;
	    try {
	      driver = new RemoteWebDriver(URI.create("http://192.168.225.174:4444/").toURL(), caps);
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    }
	    driver.navigate().to("https://www.swtestacademy.com");
	   
	  }
}
