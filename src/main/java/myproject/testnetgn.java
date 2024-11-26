package myproject;

import org.testng.annotations.Test;

public class testnetgn
{

	@Test(priority=1)
	void openapp()
	{
	System.out.println("open page");	
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login page");	
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout page");
	}
	}
	
	

