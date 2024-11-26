package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprojectmv {

	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
			
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("lord shiva god images");
		
		

		WebElement element =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		 
		 
		element.click();
		
	//driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();		
	//Thread.sleep(5000);
	
	//driver.findElement(By.xpath("//a[@class='tX9u1b href= https://www.youtube.com/ ")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
