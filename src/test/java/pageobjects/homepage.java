package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage
{
	public homepage(WebDriver driver)
	{
		super(driver);
	}
	//@FindBy(xpath = "//a[@class='btn btn-black navbar-btn']")
//	private WebElement linkReg;
	//@FindBy(xpath = "//a[@class='btn btn-link navbar-btn']")
	// private WebElement linklogin;
	
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement linklogin;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement btn;
	
	
	/*public void clickreg ()
	{
		linkReg.click();
	}
	public void clicklogin ()
	{
		linklogin.click();
	}*/
	public void clicklogin(String pr)
	{
		linklogin.sendKeys(pr);
		
		
	}
	public void clickbtn ()
	{
		btn.click();
	}
}
