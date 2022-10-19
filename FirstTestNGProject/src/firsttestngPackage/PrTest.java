package firsttestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrTest {
	
	public WebDriver driver;
	
	String url = "https://google.com";
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("Running before test");
	}
	@Test(priority=2)
	public void test_two()
	{
		System.out.println("Running a test function second");
		Actions actions  = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("elementid"));
		WebElement droppable  = driver.findElement(By.id("dropid"));
		actions.dragAndDrop(draggable, droppable).perform();
	}
	@Test(priority=1)
	public void test_one()
	{
		System.out.println("Running a test function first");
		driver.get(url);
		WebDriverWait wait = null;
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Page title is: " + driver.getTitle());
		
	}
	@Test(priority=3)
	public void test_three()
	{
		WebElement element = driver.findElement(By.id("Upload button id"));
		element.sendKeys("Path of the file");
	}
	@Test(priority=4)
	public void test_four()
	{
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
	}
	@Test(priority=5)
	public void test_five()
	{
		WebElement dd = driver.findElement(By.id("dd id"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(5);
		dropdown.selectByValue("INDIA");
		
	}
	@AfterTest
	public void after_test()
	{
		System.out.println("Running after test");
	}

}
