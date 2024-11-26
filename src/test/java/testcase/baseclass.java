package testcase;
import org.testng.annotations.Test;


import org.testng.annotations.AfterClass;  
import java.time.Duration;
import org.testng.annotations.BeforeClass; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class baseclass {
	public  WebDriver driver;
	public Logger logger; //log4j2
	
	
	
	   @BeforeClass()
		public void setup() throws InterruptedException
	{
		   
	logger = LogManager.getLogger(this.getClass());	   
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
			  
	
	Thread.sleep(5000);
	  }
    @AfterClass()
	public void teardown() throws InterruptedException
		{
    	
    	Thread.sleep(5000);
		driver.quit();
		
	}
}
