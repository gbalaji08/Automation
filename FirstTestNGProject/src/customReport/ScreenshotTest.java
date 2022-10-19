package customReport;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshotTest {
@Test
public void testBStackTakeScreenShot() throws Exception{

WebDriver driver ;
String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";

System.setProperty("webdriver.gecko.driver", driverPath);

driver = new FirefoxDriver();


//goto url
driver.get("https://www.browserstack.com");
//Call take screenshot function
this.takeSnapShot(driver, "C:\\Users\\gbalaji\\eclipse-workspace\\FirstTestNGProject\\test-output\\test.png") ; 
}
/**
* This function will take screenshot
* @param webdriver
* @param fileWithPath
* @throws Exception
*/
public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
File DestFile=new File(fileWithPath);
//Copy file at destination
FileUtils.copyFile(SrcFile, DestFile);
}
}