package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bank {
	
	@Test(groups = "sanity")
	public void saving()
	{
		System.out.println("runing saving...");
	}
	
	@Test(groups = "smoke")
	public void curent()
	{
		System.out.println("runing current...");
	}
	
	@BeforeMethod
	public void verifyUser()
	{
		System.out.println("User verified !!!");
	}
	
	@AfterMethod
	public void logoutUser()
	{
		System.out.println("Logout success");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("open browser ");
	}
	
	@AfterClass
	public void endDriver()
	{
		System.out.println("driver closed");
	}
}
