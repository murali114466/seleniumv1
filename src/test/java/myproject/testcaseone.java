package myproject;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testcaseone extends extentreportmangar {
	
	WebDriver Driver;

	
  @Test(priority=0)
    public void openapp() 
    
  {
	Driver = new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Driver.get("https://www.google.com/");
	//Driver.get("https://www.opencart.com/");
	
	Driver.manage().window().maximize();
	
		  
  }
  @Test(priority=1)
  public void searchpage()
  
  {
	  
	  Driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("lordshiva");
	  
	  
	 /* WebElement element = Driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	  
	  element.sendKeys("god");*/
	  
	  
	  
	 /* if (element.isDisplayed() && element.isEnabled()) {
		    element.sendKeys("god");
		} else {
		    System.out.println("Element is not interactable.");
		}*/


 //WebElement element=  Driver.findElement(By.xpath("//textarea[@id='APjFqb']");
 //JavascriptExecutor js = (JavascriptExecutor) Driver;
// js.executeScript("arguments[0].value='god';", element);
	  
	//Driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("lord shiva god images");
	Driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
	
//	Driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
	
	 
  }
  
  @Test(priority=1)
  
  public void loginpage() 
  {
  }
  @Test(priority=2)
  public void loginvalidatetion() 
  {
  }
  @Test(priority=3)
  public void logoutpage() throws InterruptedException
  
  {
		Thread.sleep(5000);
	  Driver.quit();
  }
}
