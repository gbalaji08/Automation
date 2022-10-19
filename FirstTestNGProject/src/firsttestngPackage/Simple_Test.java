package firsttestngPackage;



import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test; 



public class Simple_Test { 
   WebDriver driver = null; 

   @Test
  
   public void goToFacebook() { 
	  String driverPath = "C:\\Users\\gbalaji\\Desktop\\MyFiles\\Demo_Documents\\SeleniumJars\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver(); 
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @Test
   public void I_enter_Username_as_and_Password_as(){
      driver.findElement(By.id("email")).sendKeys("arg1");
      driver.findElement(By.id("pass")).sendKeys("arg2");
      driver.findElement(By.id("u_0_v")).click(); 
   } 
	
   @Test
   
   public void validateRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
         System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      driver.close(); 
   }    
}


