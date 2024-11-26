package testcase;
import org.testng.annotations.Test;

import pageobjects.homepage;

public class TC001_openpage extends baseclass {
	
	
	@Test(priority=1)
	  
	  public void Regpagelnk() 
	  	  {
		logger.info("***Strating TCOO1_Openpage****");
		
		try {
						
		homepage hp =new homepage(driver);
		//hp.clickreg();
		hp.clicklogin("lordshivagodimages");
		hp.clickbtn();
		
		
	  }
	  catch (Exception e)
		{
		logger.error("***Test Failed****");
		}
	
		logger.info("***Finish TCOO1_Openpage****");


}}