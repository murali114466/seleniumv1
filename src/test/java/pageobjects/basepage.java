package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage
{

	WebDriver Driver;

	public basepage (WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
