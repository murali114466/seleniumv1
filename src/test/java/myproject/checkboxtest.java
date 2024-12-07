package myproject;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class checkboxtest extends extentreportmangar {
	
	
	WebDriver Driver;
	@Test(priority=0)
    public void openweb() 
    
  {
	Driver = new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Driver.get("https://www.google.com/");
	//Driver.get("https://www.opencart.com/");
	
	Driver.manage().window().maximize();
	
		  
  }
	@Test(priority=1)
	public void searitem() 
	{
	
		String wid = Driver.getWindowHandle();
		System.out.println(wid);
		
		
	Driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Amazon");
		
		
		
		Driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		
		Driver.findElement(By.xpath("//span[normalize-space()='Shop online at Amazon India']")).click();
		
    	//WebElement chboxlg	=   Driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']"));
			
	    // chboxlg.click();
	   
		
	   // Driver.findElement(By.xpath("//div[5]//div[1]//label[1]//i[1]")).click();
	//	Driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
				 
		
		
	    	Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lord shiva photo");
	    	Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    	
	    /*	// scroll bars
			
			 
			WebElement scbar = Driver.findElement(By.xpath("//span[contains(text(),'All Discounts')]"));
			
			JavascriptExecutor js = (JavascriptExecutor) Driver;
			js.executeScript("wndow.scrollBy(0,document.body.scrollHight)");
			System.out.println(js.executeScript("returnwindow.pageYoffset"));*/
	    	
	    	
	    	
	    	// slider for min and max
	    	
	    	Actions act =new Actions(Driver);
	    	WebElement min_bar = Driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
	    	WebElement max_bar= Driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
	    	
	    	System.out.println(min_bar.getLocation());
	    	System.out.println(max_bar.getLocation());
	    	
	    	//act.dragAndDropBy(min_bar, 13, 503).build().perform();   not working this line
	    	
	    	System.out.println("After moving slidr"+ min_bar.getLocation());
	    	
        /*  Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
        WebElement chbox = 	Driver.findElement(By.xpath("//a[@aria-label='Apply the filter boAt to narrow results']//i[@class='a-icon a-icon-checkbox']"));
		if (chbox.isSelected())
			
		{
		
		
		Driver.close();
		}
		
		else
		{
		chbox.click();
		
		}
		*/
		
		
		// take the scren shote on last page
		TakesScreenshot tc = (TakesScreenshot)Driver;
		File SourceFile = tc.getScreenshotAs(OutputType.FILE);
		File  targetFilepath = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		SourceFile.renameTo(targetFilepath);
		
		 		
		
		Driver.close();
			}
	

}
